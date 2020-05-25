package services

import com.google.inject.Inject
import models.{Borrower, BorrowerList, Todo, TodoList}

import scala.concurrent.Future

class BorrowerService @Inject()(items: BorrowerList) {

  def addItem(item: Borrower): Future[String] = {
    items.add(item)
  }

  def deleteItem(id: Long): Future[Int] = {
    items.delete(id)
  }

  def updateItem(item: Borrower): Future[Int] = {
    items.update(item)
  }

  def getItem(id: Long): Future[Option[Borrower]] = {
    items.get(id)
  }

  def listAllItems: Future[Seq[Borrower]] = {
    items.listAll
  }

/*
  def listAllItems222(number : Int): Future[Long] = {
    val x = List(items.getByNumber(number))(0)
    return x
  }

*/
}