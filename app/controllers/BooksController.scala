package controllers

import javax.inject._
import models.{Book, BookForm}
import play.api.Logger
import play.api.libs.json.Json
import play.api.mvc._
import services.BookService
import views.html.helper.form

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

class BooksController @Inject()(
                                cc: ControllerComponents,
                                bookService: BookService
                              ) extends AbstractController(cc) {

  implicit val bookFormat = Json.format[Book]

  def getAll() = Action.async { implicit request: Request[AnyContent] =>
    bookService.listAllItems map { items =>
      //Ok(Json.toJson(items))
      Ok(views.html.books.Books( (items)))
    }

  }

  def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    bookService.getItem(id) map { item =>
      Ok(Json.toJson(item))
    }
  }

  def add() = Action.async { implicit request: Request[AnyContent] =>
    BookForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val newBookItem = Book(0, data.title, data.author, data.ISBN, data.rokWydania, data.quantity,data.quantity)
        bookService.addItem(newBookItem).map( _ => Redirect(routes.BooksController.getAll))
      })
  }

  def addForm() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.books.AddBook())
  }

  def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    BookForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val todoItem = Book(id, data.title, data.author, data.ISBN, data.rokWydania, data.quantity, data.current)
        bookService.updateItem(todoItem).map( _ => Redirect(routes.BooksController.getAll))
      })
  }


  def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    bookService.deleteItem(id).map { res =>
      Redirect(routes.BooksController.getAll)

    }.recover {
      case e: Throwable => BadRequest( views.html.errors.onError(e) )
    }
  }

}
