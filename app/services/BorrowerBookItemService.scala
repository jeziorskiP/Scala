package services

import com.google.inject.Inject
import models.{Book, BookItem, BookList, Borrower, BorrowerBookItem, BorrowerBookItemList}

import scala.concurrent.Future

class BorrowerBookItemService @Inject()(items: BorrowerBookItemList) {

  def addItem(item: BorrowerBookItem): Future[String] = {
    items.add(item)
  }

  def deleteItem(borrowerId: Long, bookItemId: Long): Future[Int] = {
    items.delete(borrowerId, bookItemId)
  }

  def updateItem(item: BorrowerBookItem): Future[Int] = {
    items.update(item)
  }

  def getItemByBookItemId(id: Long): Future[Option[BorrowerBookItem]] = {
    items.getByBookItemId(id)
  }
  def getItemByBorrowerId(id: Long): Future[Option[BorrowerBookItem]] = {
    items.getByBorrowerId(id)
  }

  def listAllItems: Future[Seq[BorrowerBookItem]] = {
    items.listAll
  }
  def listAllItems2: Future[Seq[(Borrower, BookItem,Boolean)]] = {
    items.listAll2
  }
  def getBBIByNumber(number: Int): Future[Seq[(Borrower, BookItem,Boolean)]] = {
    items.getAllBorrowerBookItemByNumber(number)
  }

  def finish(borrower_id: Long, bookItem_id: Long): Future[Int] = {
    items.finish(borrower_id,bookItem_id )
  }


}