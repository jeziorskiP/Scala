package models

import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

import scala.concurrent.{ExecutionContext, Future}


case class Borrower(id: Long, number: Int, Name: String, Surname: String, Address: String, Balance: BigDecimal )



case class BorrowerFormData( number: Int, Name: String, Surname: String, Address: String, Balance: BigDecimal )

object BorrowerForm {
  val form = Form(
    mapping(
      "number" -> number,
      "Name" -> nonEmptyText,
      "Surname" -> nonEmptyText,
      "Address" -> nonEmptyText,
      "Balance" -> bigDecimal
    )(BorrowerFormData.apply)(BorrowerFormData.unapply)
  )
}

class BorrowerTableDef(tag: Tag) extends Table[Borrower](tag, "borrower") {

  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def number = column[Int]("number")
  def Name = column[String]("Name")
  def Surname = column[String]("Surname")
  def Address = column[String]("Address")
  def Balance = column[BigDecimal]("Balance")

  override def * = (id, number, Name, Surname, Address, Balance) <> (Borrower.tupled, Borrower.unapply)
}


class BorrowerList @Inject()(
                          protected val dbConfigProvider: DatabaseConfigProvider
                        )(implicit executionContext: ExecutionContext)
  extends HasDatabaseConfigProvider[JdbcProfile] {

  var borrowerList = TableQuery[BorrowerTableDef]

  def add(borrowerItem: Borrower): Future[String] = {
    dbConfig.db
      .run(borrowerList += borrowerItem)
      .map(res => "BookItem successfully added")
      .recover {
        case ex: Exception => {
          printf(ex.getMessage())
          ex.getMessage
        }
      }
  }

  def delete(id: Long): Future[Int] = {
    dbConfig.db.run(borrowerList.filter(_.id === id).delete)
  }

  def update(borrowerItem: Borrower): Future[Int] = {
    dbConfig.db
      .run(borrowerList.filter(_.id === borrowerItem.id)
        .map(x => (x.number, x.Name,x.Surname,x.Address, x.Balance))
        .update(borrowerItem.number,borrowerItem.Name,borrowerItem.Surname,borrowerItem.Address, borrowerItem.Balance)
      )
  }

  def get(id: Long): Future[Option[Borrower]] = {
    dbConfig.db.run(borrowerList.filter(_.id === id).result.headOption)
  }

  def listAll: Future[Seq[Borrower]] = {
    dbConfig.db.run(borrowerList.result)
  }

  def getByNumber(number: Int): Future[Seq[Long]] = {

    val query = for{
      bo <- TableQuery[BorrowerTableDef] if bo.number === number
    }yield (bo.id)
    dbConfig.db.run(query.result)
    /*
    val q = TableQuery[BorrowerBookItemTableDef] join TableQuery[BorrowerTableDef] on (_.borrowerId === _.id ) join  TableQuery[BookItemTableDef] on (_ === _.id)
      dbConfig.db.run(q.result)
      dbConfig.db.run(bookItemList.result)
  */
  }


}