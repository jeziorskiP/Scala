package services

import com.google.inject.Inject
import models.{Book, BookItem, BookItemList, BookList}

import scala.concurrent.Future

class BookItemService @Inject()(items: BookItemList) {

  def addItem(item: BookItem): Future[String] = {
    items.add(item)
  }

  def deleteItem(id: Long): Future[Int] = {
    items.delete(id)
  }

  def updateItem(item: BookItem): Future[Int] = {
    items.update(item)
  }

  def getItem(id: Long): Future[Option[BookItem]] = {
    items.get(id)
  }

  def listAllItems: Future[Seq[BookItem]] = {
    items.listAll
  }

  def listAllItems2: Future[Seq[(Book,BookItem)]] = {
    items.listAll2
  }
  def getByNumber(number : Int): Future[Option[BookItem]] = {
    items.getByNumber(number)
  }

  def getAllByBookId(bookId : Long): Future[Seq[BookItem]] = {
    items.getByBookId2(bookId)
  }
  def getIdByNumber(number : Int): Future[Seq[Long]] = {
    items.getIdByNumber(number)
  }
  //GETBI
  def getIdByNumber2(number : Int): Future[Option[BookItem]] = {
    items.getIdByNumber2(number)
  }
  def getBIbyISBN(ISBN : String): Future[Seq[BookItem]] = {
    items.getBIbyISBN(ISBN)
  }
}