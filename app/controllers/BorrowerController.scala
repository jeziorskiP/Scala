package controllers

import javax.inject._
import models.{Book, BookForm, Borrower, BorrowerForm}
import play.api.libs.json.Json
import play.api.mvc._
import services.{BookService, BorrowerService}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

class BorrowerController @Inject()(
                                cc: ControllerComponents,
                                borrowerService: BorrowerService
                              ) extends AbstractController(cc) {

  implicit val borrowerFormat = Json.format[Borrower]

  def getAll() = Action.async { implicit request: Request[AnyContent] =>
    borrowerService.listAllItems map { items =>
      Ok(views.html.Borrower.Borrowers(items) )
    }
  }


  def addForm() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.Borrower.AddBorrower())
  }

  def add() = Action.async { implicit request: Request[AnyContent] =>
    BorrowerForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val newBorrowerItem = Borrower(0, data.number, data.Name, data.Surname, data.Address, data.Balance)
        borrowerService.addItem(newBorrowerItem).map( _ => Redirect(routes.BorrowerController.getAll))
      })
  }

  def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    BorrowerForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val borrowerItem = Borrower(id, data.number, data.Name, data.Surname, data.Address, data.Balance)
        borrowerService.updateItem(borrowerItem).map( _ => Redirect(routes.BorrowerController.getAll))
      })
  }


  def edit(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerService.getItem(id) map { item =>

      Ok(views.html.Borrower.Edit(item) )
    }
  }

  def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerService.deleteItem(id).map { res =>
      Redirect(routes.BorrowerController.getAll)
    }.recover {
      case e: Throwable => BadRequest( views.html.errors.onError(e) )
    }
  }

  def addBookToBorrower(borrowerId: Long) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.bookitem.AddBookItemToBorrow(borrowerId))
  }

  def pay(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerService.getItem(id) map { item =>

      Ok(views.html.Borrower.Pay(item) )
    }
  }
/*
  def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    borrowerService.getItem(id) map { item =>
      Ok(Json.toJson(item))
    }
  }
*/
}
