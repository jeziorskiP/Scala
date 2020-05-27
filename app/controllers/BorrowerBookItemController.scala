package controllers

import javax.inject._
import models.{Borrower, BorrowerBookItem, BorrowerBookItemForm, BorrowerForm}
import play.api.libs.json.Json
import play.api.mvc._
import services.{BorrowerBookItemService, BorrowerService}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

class BorrowerBookItemController @Inject()(
                                cc: ControllerComponents,
                                borrowerBookItemService: BorrowerBookItemService
                              ) extends AbstractController(cc) {

  implicit val borrowerFormat = Json.format[Borrower]

  def getAll() = Action.async { implicit request: Request[AnyContent] =>
    borrowerBookItemService.listAllItems map { items =>
      Ok(views.html.BorrowerBookItem.BBI(items) )
    }
  }
    def getAll2() = Action.async { implicit request: Request[AnyContent] =>
      borrowerBookItemService.listAllItems2 map { items =>
        Ok(views.html.BorrowerBookItem.BBI2(items) )
      }
  }


  def add() = Action.async { implicit request: Request[AnyContent] =>
    BorrowerBookItemForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val newBorrowerBookItemItem = BorrowerBookItem( data.borrowerId, data.bookItemId, data.startTime, data.completed)
        borrowerBookItemService.addItem(newBorrowerBookItemItem).map( _ => Redirect(routes.BorrowerBookItemController.getAll2))
      })
  }

  def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    BorrowerBookItemForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val borrowerItem = BorrowerBookItem( data.borrowerId, data.bookItemId, data.startTime, data.completed)
        borrowerBookItemService.updateItem(borrowerItem).map( _ => Redirect(routes.BorrowerBookItemController.getAll2))
      })
  }

  def delete(borrowerId: Long, BookItemId: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerBookItemService.deleteItem(borrowerId, BookItemId) map { res =>
      Redirect(routes.BorrowerBookItemController.getAll2)
    }
  }

  def getBBIByNumberForm() = Action.async { implicit request: Request[AnyContent] =>
    BorrowerBookItemForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val borrowerItem = BorrowerBookItem( data.borrowerId, data.bookItemId, data.startTime, data.completed)
        borrowerBookItemService.updateItem(borrowerItem).map( _ => Redirect(routes.BorrowerBookItemController.getAll2))
      })
  }

  def getBBIByNumber() = Action.async { implicit request: Request[AnyContent] =>
    BorrowerBookItemForm.form2.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        borrowerBookItemService.getBBIByNumber(data.number)  map { items =>
          Ok(views.html.BorrowerBookItem.BBIByNumber(items) )
        }
      })
  }

  def filter() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.BorrowerBookItem.Filter())
  }


  def finish(borrowerId: Long, BookItemId: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerBookItemService.finish(borrowerId, BookItemId) map { res =>
      Redirect(routes.BorrowerBookItemController.getAll2)
    }
  }

/*

  def getByBorrowerId(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerBookItemService.getItemByBorrowerId(id) map { item =>
      //Ok(Json.toJson(item))
      Ok("OK")
    }
  }
  def getByBookItemId(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerBookItemService.getItemByBookItemId(id) map { item =>
      //Ok(Json.toJson(item))
      Ok("OK")
    }
  }
  */



}
