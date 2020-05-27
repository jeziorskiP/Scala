package models

import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._


import scala.concurrent.{ExecutionContext, Future}


case class Book(id: Long, title: String, author: String, ISBN: String, rokWydania: String, quantity: Int, current: Int)



case class BookFormData( title: String, author: String, ISBN: String, rokWydania: String, quantity: Int, current: Int)

object BookForm {

  val bookList = TableQuery[BookTableDef]

  val form = Form(
    mapping(
      "title" -> nonEmptyText,
      "author" -> nonEmptyText,
      "ISBN" -> nonEmptyText,
      "rokWydania" -> nonEmptyText,
      "quantity" -> number,
      "current" -> number
    )(BookFormData.apply)(BookFormData.unapply)
  )
}

class BookTableDef(tag: Tag) extends Table[Book](tag, "book") {

  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def title = column[String]("title")
  def author = column[String]("author")
  def ISBN = column[String]("ISBN")
  def rokWydania = column[String]("rokWydania")
  def quantity = column[Int]("quantity")
  def current = column[Int]("current")

  override def * = (id, title, author, ISBN, rokWydania, quantity,current) <> (Book.tupled, Book.unapply)
}


class BookList @Inject()(
                          protected val dbConfigProvider: DatabaseConfigProvider
                        )(implicit executionContext: ExecutionContext)
  extends HasDatabaseConfigProvider[JdbcProfile] {

  val bookList = TableQuery[BookTableDef]

  def add(todoItem: Book): Future[String] = {
    dbConfig.db
      .run(bookList += todoItem)
      .map(res => "BookItem successfully added")
      .recover {
        case ex: Exception => {
          printf(ex.getMessage())
          ex.getMessage
        }
      }
  }

  def delete(id: Long): Future[Int] = {
    dbConfig.db.run(bookList.filter(_.id === id).delete)
  }

  def update(todoItem: Book): Future[Int] = {
    dbConfig.db
      .run(bookList.filter(_.id === todoItem.id)
        .map(x => (x.title,x.author,x.ISBN,x.rokWydania, x.quantity))
        .update(todoItem.title,todoItem.author,todoItem.ISBN,todoItem.rokWydania, todoItem.quantity)
      )
  }

  def get(id: Long): Future[Option[Book]] = {
    dbConfig.db.run(bookList.filter(_.id === id).result.headOption)
  }

  def listAll: Future[Seq[Book]] = {
    dbConfig.db.run(bookList.result)
  }



}