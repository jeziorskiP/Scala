package controllers

import javax.inject._
import models.{Todo, TodoForm}
import play.api.libs.json.Json
import play.api.mvc._
import services.TodoService

import play.api.data.FormError
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */

class TodoController @Inject()(
                                cc: ControllerComponents,
                                todoService: TodoService
                              ) extends AbstractController(cc) {

  implicit val todoFormat = Json.format[Todo]

  def getAll() = Action.async { implicit request: Request[AnyContent] =>
    todoService.listAllItems map { items =>
      Ok(Json.toJson(items))
      Ok(views.html.Todos( (items)))
    }

  }

  def getById(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    todoService.getItem(id) map { item =>
      Ok(Json.toJson(item))
    }
  }

  def add() = Action.async { implicit request: Request[AnyContent] =>
    TodoForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val newTodoItem = Todo(0, data.name, data.isComplete)
        todoService.addItem(newTodoItem).map( _ => Redirect(routes.TodoController.getAll))
      })
  }

  def update(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    TodoForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => {
        errorForm.errors.foreach(println)
        Future.successful(BadRequest("Error!"))
      },
      data => {
        val todoItem = Todo(id, data.name, data.isComplete)
        todoService.updateItem(todoItem).map( _ => Redirect(routes.TodoController.getAll))
      })
  }

  def delete(id: Long) = Action.async { implicit request: Request[AnyContent] =>
    todoService.deleteItem(id) map { res =>
      Redirect(routes.TodoController.getAll)
    }
  }
}
