package models



import java.sql.Timestamp
import java.time.{LocalDateTime, ZoneOffset}
import play.api.data.format.Formats._

import com.google.inject.Inject
import play.api.data.Form
import play.api.data.Forms.mapping
import play.api.data.Forms._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile
import slick.jdbc.MySQLProfile.api._

import scala.concurrent.{ExecutionContext, Future}


//case class BorrowerBookItem(borrowerId: Long, bookItemId: Long, startTime : LocalDateTime = LocalDateTime.now(), completed : Boolean)
case class BorrowerBookItem(borrowerId: Long, bookItemId: Long, startTime : String, completed : Boolean)



//case class BorrowerBookItemFormData( borrowerId: Long, bookItemId: Long, startTime : LocalDateTime = LocalDateTime.now(), completed : Boolean)
case class BorrowerBookItemFormData( borrowerId: Long, bookItemId: Long, startTime : String, completed : Boolean)

//test
case class BorrowerBookItemFormData2( number: Int)


object BorrowerBookItemForm {

  //TERAZ DODANE
  val borrowerBookItemList = TableQuery[BorrowerBookItemTableDef]

  implicit  val  localDateTimeMapping = MappedColumnType.base[LocalDateTime, Timestamp](
    localDateTime => Timestamp.from(localDateTime.toInstant(ZoneOffset.UTC)),_.toLocalDateTime)


  val form = Form(
    mapping(
      "borrowerId" -> of[Long],
      "bookItemId" -> of[Long],
      "startTime" -> nonEmptyText,
      "completed" -> boolean

    )(BorrowerBookItemFormData.apply)(BorrowerBookItemFormData.unapply)
  )

  val form2 = Form(
    mapping(
      "number" -> number

    )(BorrowerBookItemFormData2.apply)(BorrowerBookItemFormData2.unapply)
  )

}

class BorrowerBookItemTableDef(tag: Tag) extends Table[BorrowerBookItem](tag, "borrowerbookitem") {

  def borrowerId = column[Long]("borrowerId")
  def bookItemId = column[Long]("bookItemId")
  //def startTime = column[LocalDateTime]("startTime")
  def startTime = column[String]("startTime")
  def completed = column[Boolean]("completed")
  def FK_Borrower = foreignKey("FK_BorrowerRef", borrowerId, TableQuery[BorrowerTableDef]) (_.id)
  def FK_BookItem = foreignKey("FK_BookItemRef", bookItemId, TableQuery[BookItemTableDef]) (_.id)

  override def * = (borrowerId, bookItemId, startTime, completed) <> (BorrowerBookItem.tupled, BorrowerBookItem.unapply)
}


class BorrowerBookItemList @Inject()(
                          protected val dbConfigProvider: DatabaseConfigProvider
                        )(implicit executionContext: ExecutionContext)
  extends HasDatabaseConfigProvider[JdbcProfile] {

  val borrowerBookItemList = TableQuery[BorrowerBookItemTableDef]

  def add(todoItem: BorrowerBookItem): Future[String] = {
    dbConfig.db
      .run(borrowerBookItemList += todoItem)
      .map(res => "BookItem successfully added")
      .recover {
        case ex: Exception => {
          printf(ex.getMessage())
          ex.getMessage
        }
      }
  }

  //NIe bralbym tego
  def delete(borrower_id: Long, bookItem_id: Long): Future[Int] = {
    dbConfig.db.run(borrowerBookItemList.filter(_.borrowerId === borrower_id ).filter(_.bookItemId === bookItem_id).delete)
  }

  def update(Item: BorrowerBookItem): Future[Int] = {
    dbConfig.db
      .run(borrowerBookItemList.filter(_.bookItemId === Item.bookItemId).filter(_.borrowerId ===Item.borrowerId )
        .map(x => (x.borrowerId,x.bookItemId,x.startTime,x.completed))
        .update(Item.borrowerId,Item.bookItemId,Item.startTime,Item.completed)
      )
  }
  def finish(borrower_id: Long, bookItem_id: Long): Future[Int] = {
    dbConfig.db
      .run(borrowerBookItemList.filter(_.bookItemId === bookItem_id).filter(_.borrowerId ===borrower_id )
        .map(x => (x.completed))
        .update(true)
      )


  }
  //Get by BookItemID
  def getByBookItemId(bookItem_id: Long): Future[Option[BorrowerBookItem]] = {
    dbConfig.db.run(borrowerBookItemList.filter(_.bookItemId === bookItem_id).result.headOption)
  }
  //Get by BookItemNumber
  def getByBookItemNumber(bookItem_id: Long): Future[Option[BorrowerBookItem]] = {
    dbConfig.db.run(borrowerBookItemList.filter(_.bookItemId === bookItem_id).result.headOption)
  }

  //Get by borrowerId
  def getByBorrowerId(borrowerId: Long): Future[Option[BorrowerBookItem]] = {
    dbConfig.db.run(borrowerBookItemList.filter(_.borrowerId === borrowerId).result.headOption)
  }

  def listAll: Future[Seq[BorrowerBookItem]] = {
    dbConfig.db.run(borrowerBookItemList.result)
  }
  def listAll2: Future[Seq[(Borrower, BookItem, Boolean)]] = {

    val query = for{
      bo <- TableQuery[BorrowerTableDef]
      bobi <- TableQuery[BorrowerBookItemTableDef] if bo.id === bobi.borrowerId
      bi <- TableQuery[BookItemTableDef] if bobi.bookItemId === bi.id
    }yield (bo, bi, bobi.completed)
    dbConfig.db.run(query.result)
  /*
  val q = TableQuery[BorrowerBookItemTableDef] join TableQuery[BorrowerTableDef] on (_.borrowerId === _.id ) join  TableQuery[BookItemTableDef] on (_ === _.id)
    dbConfig.db.run(q.result)
    dbConfig.db.run(bookItemList.result)
*/
  }

  //Get by BookItemNumber
  def getAllBorrowerBookItemByNumber(bookItemNumber: Int): Future[Seq[(Borrower,BookItem,Boolean)]] = {
    val query = for{
      bo <- TableQuery[BorrowerTableDef]
      bobi <- TableQuery[BorrowerBookItemTableDef] if bo.id === bobi.borrowerId
      bi <- TableQuery[BookItemTableDef] if bobi.bookItemId === bi.id && bi.number === bookItemNumber
    }yield (bo, bi, bobi.completed)
    dbConfig.db.run(query.result)
  }
}