package models

import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._
import models.BookList
import play.api.data.format.Formats._

import scala.concurrent.{ExecutionContext, Future}


case class BookItem(id: Long, number: Int, ISBN: String, isComplete: Boolean, book_id: Long )

case class BookItemFormData(number: Int, ISBN: String, isComplete: Boolean,book_id: Long )

object BookItemForm {
  //TERAZ DODANE
  val bookItemList = TableQuery[BookItemTableDef]



  val form = Form(
    mapping(
      "number" -> number,
      "ISBN" -> nonEmptyText,
      "isComplete" -> boolean,
      "book_id" -> of[Long]
    )(BookItemFormData.apply)(BookItemFormData.unapply)
  )


}


class BookItemTableDef(tag: Tag) extends Table[BookItem](tag, "bookitem") {


  val bookItemList = TableQuery[BookItemTableDef]

  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def number = column[Int]("number")
  def ISBN = column[String]("ISBN")
  def isComplete = column[Boolean]("isComplete")
  def book_id = column[Long]("book_id")
  def FK_BookItemBook = foreignKey("FK_BookItemBook", book_id, TableQuery[BookTableDef]) (_.id)



  override def * = (id, number,  ISBN, isComplete, book_id) <> (BookItem.tupled, BookItem.unapply)
}


class BookItemList @Inject()(
                          protected val dbConfigProvider: DatabaseConfigProvider
                        )(implicit executionContext: ExecutionContext)
  extends HasDatabaseConfigProvider[JdbcProfile] {

  var bookItemList = TableQuery[BookItemTableDef]

  def add(bookItemItem: BookItem): Future[String] = {
    dbConfig.db
      .run(bookItemList += bookItemItem)
      .map(res => "BookItem successfully added")
      .recover {
        case ex: Exception => {
          printf(ex.getMessage())
          ex.getMessage
        }
      }
  }

  def delete(id: Long): Future[Int] = {
    dbConfig.db.run(bookItemList.filter(_.id === id).delete)
  }

  def update(todoItem: BookItem): Future[Int] = {
    dbConfig.db
      .run(bookItemList.filter(_.id === todoItem.id)
        .map(x => (x.number,x.ISBN,x.isComplete))
        .update(todoItem.number,todoItem.ISBN,todoItem.isComplete)
      )
  }

  def get(id: Long): Future[Option[BookItem]] = {
    dbConfig.db.run(bookItemList.filter(_.id === id).result.headOption)
  }

  def listAll: Future[Seq[BookItem]] = {
    dbConfig.db.run(bookItemList.result)
  }
  def listAll2: Future[Seq[(Book, BookItem)]] = {

    val query = for{
      x <- bookItemList
      b <- BookForm.bookList if b.id === x.book_id
    }yield (b, x)
    //query.result.statements.foreach(println())
    dbConfig.db.run(query.result)
    /*
  val q = TableQuery[BookItemTableDef] join  TableQuery[BookTableDef] on (_.book_id === _.id)
    dbConfig.db.run(q.result)
    dbConfig.db.run(bookItemList.result)
    */
  }
  def get2222(id: Long): Future[Option[BookItem]] = {
    dbConfig.db.run(bookItemList.filter(_.id === id).result.headOption)
  }
  def getByNumber(number: Int): Future[Option[BookItem]] = {
    dbConfig.db.run(bookItemList.filter(_.number === number).result.headOption)
  }
  def getByBookId(bookId: Long): Future[Option[BookItem]] = {
    dbConfig.db.run(bookItemList.filter(_.book_id === bookId).result.headOption)
  }

  def getByBookId2(bookId: Long): Future[Seq[BookItem]] = {
    val query = for{
      x <- bookItemList  if x.book_id === bookId
    }yield (x)
    //query.result.statements.foreach(println())
    dbConfig.db.run(query.result)
  }

  def getIdByNumber(number: Int): Future[Seq[Long]] = {

    val query = for{
      bo <- TableQuery[BookItemTableDef] if bo.number === number
    }yield (bo.book_id)
    dbConfig.db.run(query.result)

  }

  def getIdByNumber2(number: Int): Future[Option[BookItem]] = {
    dbConfig.db.run(bookItemList.filter(_.number === number).result.headOption)
  }


  def getBIbyISBN(ISBN: String): Future[Seq[BookItem]] = {
    val query = for{
      bo <- TableQuery[BookItemTableDef] if bo.ISBN === ISBN
    }yield (bo)
    dbConfig.db.run(query.result)

    //dbConfig.db.run(bookItemList.filter(_.ISBN === ISBN).result.headOption)
  }


}