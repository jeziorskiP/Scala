package controllers

import javax.inject._
import models.{BookItem, BookItemForm, Borrower, BorrowerBookItem, BorrowerForm}
import play.api.data.Form
import play.api.libs.json.Json
import play.api.mvc._
import services.{BookItemService, BorrowerBookItemService, BorrowerService}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

class BookItemController @Inject()(
                                    cc: ControllerComponents,
                                    bookItemService: BookItemService,
                                    borrowerBookItemService: BorrowerBookItemService,
                                    borrowerService: BorrowerService
                              ) extends AbstractController(cc) {

  implicit val borrowerFormat = Json.format[Borrower]



  def getAll() = Action.async { implicit request: Request[AnyContent] =>
    bookItemService.listAllItems map { items =>
      Ok(views.html.bookitem.BookItem(items) )
    }
  }


  def add() = Action.async { implicit request: Request[AnyContent] =>
    BookItemForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val newBookItemItem = BookItem(0, data.number, data.ISBN, data.isComplete, data.book_id)
        bookItemService.addItem(newBookItemItem).map( _ => Redirect(routes.BookItemController.getAll))
      })
  }

  def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    BookItemForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val newBookItemItem = BookItem(id, data.number, data.ISBN, data.isComplete, data.book_id)
        bookItemService.updateItem(newBookItemItem).map( _ => Redirect(routes.BookItemController.getAll))
      })
  }


  def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    bookItemService.deleteItem(id).map { res =>
      Redirect(routes.BookItemController.getAll)
    }.recover {
      case e: Throwable => BadRequest( views.html.errors.onError(e) )
    }
  }

  def getAllByBookId(bookId : Long) = Action.async { implicit request: Request[AnyContent] =>
    bookItemService.getAllByBookId(bookId) map { items =>
      Ok(views.html.bookitem.BookItem(items) )
    }
  }

  def addBIB(borrowerId : Long) = Action.async {
        var x = true;
    implicit request: Request[AnyContent] =>
    BookItemForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        //get bookId from Number
        bookItemService.getIdByNumber2(data.number) map { items =>
          //Ok("OK")
          if(items.head.isComplete == false){
            x = false;
            Ok("Error2")
          }else{
            val qwe = items.head.id
           // val newBorrowerBookItemItem = BorrowerBookItem( borrowerId, qwe, java.time.LocalDate.now.toString, false)
            val newBorrowerBookItemItem = BorrowerBookItem( borrowerId, qwe, "2020-05-02", false)
            borrowerBookItemService.addItem(newBorrowerBookItemItem).map( _ => Redirect(routes.BorrowerBookItemController.getAll2))
          }

        }
        borrowerBookItemService.listAllItems2 map { items =>
          if(x == false){
            Ok("Error(False)")

          }else{
            //Ok(views.html.BorrowerBookItem.BBI2(items) )
            Redirect(routes.BorrowerBookItemController.getAll2)
          }

        }
      })
  }

  def getByISBN() = Action.async {
    implicit request: Request[AnyContent] =>
      BookItemForm.form.bindFromRequest.fold(
        // if any error in submitted data
        errorForm => {
          errorForm.errors.foreach(println)
          Future.successful(BadRequest("Error!"))
        },
        data => {
          bookItemService.getBIbyISBN(data.ISBN) map { items =>

            Ok(views.html.bookitem.BookItemSelected(items) )
          }
        })
  }


/*

  def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    bookItemService.getItem(id) map { item =>
      Ok("OK")
    }
  }
  */

}
