// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Wed May 27 11:38:01 CEST 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_8: controllers.HomeController,
  // @LINE:10
  BookController_4: controllers.BookController,
  // @LINE:13
  TodoController_6: controllers.TodoController,
  // @LINE:20
  BooksController_1: controllers.BooksController,
  // @LINE:28
  BorrowerController_3: controllers.BorrowerController,
  // @LINE:39
  BookItemController_7: controllers.BookItemController,
  // @LINE:51
  BorrowerBookItemController_0: controllers.BorrowerBookItemController,
  // @LINE:66
  TestController_2: controllers.TestController,
  // @LINE:70
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_8: controllers.HomeController,
    // @LINE:10
    BookController_4: controllers.BookController,
    // @LINE:13
    TodoController_6: controllers.TodoController,
    // @LINE:20
    BooksController_1: controllers.BooksController,
    // @LINE:28
    BorrowerController_3: controllers.BorrowerController,
    // @LINE:39
    BookItemController_7: controllers.BookItemController,
    // @LINE:51
    BorrowerBookItemController_0: controllers.BorrowerBookItemController,
    // @LINE:66
    TestController_2: controllers.TestController,
    // @LINE:70
    Assets_5: controllers.Assets
  ) = this(errorHandler, HomeController_8, BookController_4, TodoController_6, BooksController_1, BorrowerController_3, BookItemController_7, BorrowerBookItemController_0, TestController_2, Assets_5, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_8, BookController_4, TodoController_6, BooksController_1, BorrowerController_3, BookItemController_7, BorrowerBookItemController_0, TestController_2, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """booklist""", """controllers.BookController.BookList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos""", """controllers.TodoController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/""" + "$" + """id<[^/]+>""", """controllers.TodoController.getById(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/add""", """controllers.TodoController.add"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/update/""" + "$" + """id<[^/]+>""", """controllers.TodoController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/delete/""" + "$" + """id<[^/]+>""", """controllers.TodoController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/addForm""", """controllers.BooksController.addForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.getById(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/add""", """controllers.BooksController.add"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/update/""" + "$" + """id<[^/]+>""", """controllers.BooksController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/delete/""" + "$" + """id<[^/]+>""", """controllers.BooksController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower""", """controllers.BorrowerController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower/addForm""", """controllers.BorrowerController.addForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower/add""", """controllers.BorrowerController.add"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower/update/""" + "$" + """id<[^/]+>""", """controllers.BorrowerController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower/edit/""" + "$" + """id<[^/]+>""", """controllers.BorrowerController.edit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower/delete/""" + "$" + """id<[^/]+>""", """controllers.BorrowerController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower/addBookToBorrower/""" + "$" + """borrowerId<[^/]+>""", """controllers.BorrowerController.addBookToBorrower(borrowerId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrower/pay/""" + "$" + """id<[^/]+>""", """controllers.BorrowerController.pay(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookitem""", """controllers.BookItemController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookitemByBook/""" + "$" + """id<[^/]+>""", """controllers.BookItemController.getAllByBookId(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookitem/add""", """controllers.BookItemController.add"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookitem/update/""" + "$" + """id<[^/]+>""", """controllers.BookItemController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookitem/delete/""" + "$" + """id<[^/]+>""", """controllers.BookItemController.delete(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addBIB/borrowerId""", """controllers.BookItemController.addBIB(borrowerId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bookitem/getByISBN""", """controllers.BookItemController.getByISBN"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem""", """controllers.BorrowerBookItemController.getAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem2""", """controllers.BorrowerBookItemController.getAll2"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem/add""", """controllers.BorrowerBookItemController.add"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem/update/""" + "$" + """id<[^/]+>""", """controllers.BorrowerBookItemController.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem/delete/""" + "$" + """borrowerId<[^/]+>/""" + "$" + """BookItemId<[^/]+>""", """controllers.BorrowerBookItemController.delete(borrowerId:Long, BookItemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem/getBBIByNumber/""", """controllers.BorrowerBookItemController.getBBIByNumber"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem/filter""", """controllers.BorrowerBookItemController.filter"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """borrowerbookitem/finish/""" + "$" + """borrowerId<[^/]+>/""" + "$" + """BookItemId<[^/]+>""", """controllers.BorrowerBookItemController.finish(borrowerId:Long, BookItemId:Long)"""),
    ("""GET""", this.prefix, """controllers.TestController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.TestController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.TestController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_8.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_8.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_8.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BookController_BookList3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("booklist")))
  )
  private[this] lazy val controllers_BookController_BookList3_invoker = createInvoker(
    BookController_4.BookList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "BookList",
      Nil,
      "GET",
      this.prefix + """booklist""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_TodoController_getAll4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos")))
  )
  private[this] lazy val controllers_TodoController_getAll4_invoker = createInvoker(
    TodoController_6.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """todos""",
      """ api controllers mapping""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TodoController_getById5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TodoController_getById5_invoker = createInvoker(
    TodoController_6.getById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "getById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """todos/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TodoController_add6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/add")))
  )
  private[this] lazy val controllers_TodoController_add6_invoker = createInvoker(
    TodoController_6.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "add",
      Nil,
      "POST",
      this.prefix + """todos/add""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TodoController_update7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TodoController_update7_invoker = createInvoker(
    TodoController_6.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """todos/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_TodoController_delete8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TodoController_delete8_invoker = createInvoker(
    TodoController_6.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TodoController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """todos/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_BooksController_getAll9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_getAll9_invoker = createInvoker(
    BooksController_1.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """books""",
      """ Books controllers mapping""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_BooksController_addForm10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/addForm")))
  )
  private[this] lazy val controllers_BooksController_addForm10_invoker = createInvoker(
    BooksController_1.addForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "addForm",
      Nil,
      "GET",
      this.prefix + """books/addForm""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_BooksController_getById11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_getById11_invoker = createInvoker(
    BooksController_1.getById(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getById",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_BooksController_add12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/add")))
  )
  private[this] lazy val controllers_BooksController_add12_invoker = createInvoker(
    BooksController_1.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "add",
      Nil,
      "POST",
      this.prefix + """books/add""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_BooksController_update13_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_update13_invoker = createInvoker(
    BooksController_1.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """books/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_BooksController_delete14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_delete14_invoker = createInvoker(
    BooksController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """books/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_BorrowerController_getAll15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower")))
  )
  private[this] lazy val controllers_BorrowerController_getAll15_invoker = createInvoker(
    BorrowerController_3.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """borrower""",
      """ Borrower controllers mapping""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_BorrowerController_addForm16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower/addForm")))
  )
  private[this] lazy val controllers_BorrowerController_addForm16_invoker = createInvoker(
    BorrowerController_3.addForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "addForm",
      Nil,
      "GET",
      this.prefix + """borrower/addForm""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_BorrowerController_add17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower/add")))
  )
  private[this] lazy val controllers_BorrowerController_add17_invoker = createInvoker(
    BorrowerController_3.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "add",
      Nil,
      "POST",
      this.prefix + """borrower/add""",
      """GET     /borrower/:id                           controllers.BorrowerController.getById(id: Long)""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_BorrowerController_update18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerController_update18_invoker = createInvoker(
    BorrowerController_3.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "update",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """borrower/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_BorrowerController_edit19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerController_edit19_invoker = createInvoker(
    BorrowerController_3.edit(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "edit",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """borrower/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_BorrowerController_delete20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerController_delete20_invoker = createInvoker(
    BorrowerController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """borrower/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_BorrowerController_addBookToBorrower21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower/addBookToBorrower/"), DynamicPart("borrowerId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerController_addBookToBorrower21_invoker = createInvoker(
    BorrowerController_3.addBookToBorrower(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "addBookToBorrower",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """borrower/addBookToBorrower/""" + "$" + """borrowerId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:36
  private[this] lazy val controllers_BorrowerController_pay22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrower/pay/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerController_pay22_invoker = createInvoker(
    BorrowerController_3.pay(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerController",
      "pay",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """borrower/pay/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_BookItemController_getAll23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookitem")))
  )
  private[this] lazy val controllers_BookItemController_getAll23_invoker = createInvoker(
    BookItemController_7.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookItemController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """bookitem""",
      """ BookItem controllers mapping""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_BookItemController_getAllByBookId24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookitemByBook/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookItemController_getAllByBookId24_invoker = createInvoker(
    BookItemController_7.getAllByBookId(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookItemController",
      "getAllByBookId",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """bookitemByBook/""" + "$" + """id<[^/]+>""",
      """GET     /bookitem/:id                           controllers.BookItemController.getById(id: Long)""",
      Seq()
    )
  )

  // @LINE:42
  private[this] lazy val controllers_BookItemController_add25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookitem/add")))
  )
  private[this] lazy val controllers_BookItemController_add25_invoker = createInvoker(
    BookItemController_7.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookItemController",
      "add",
      Nil,
      "POST",
      this.prefix + """bookitem/add""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_BookItemController_update26_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookitem/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookItemController_update26_invoker = createInvoker(
    BookItemController_7.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookItemController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """bookitem/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:44
  private[this] lazy val controllers_BookItemController_delete27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookitem/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookItemController_delete27_invoker = createInvoker(
    BookItemController_7.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookItemController",
      "delete",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """bookitem/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_BookItemController_addBIB28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addBIB/borrowerId")))
  )
  private[this] lazy val controllers_BookItemController_addBIB28_invoker = createInvoker(
    BookItemController_7.addBIB(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookItemController",
      "addBIB",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """addBIB/borrowerId""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_BookItemController_getByISBN29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bookitem/getByISBN")))
  )
  private[this] lazy val controllers_BookItemController_getByISBN29_invoker = createInvoker(
    BookItemController_7.getByISBN,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookItemController",
      "getByISBN",
      Nil,
      "POST",
      this.prefix + """bookitem/getByISBN""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_BorrowerBookItemController_getAll30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem")))
  )
  private[this] lazy val controllers_BorrowerBookItemController_getAll30_invoker = createInvoker(
    BorrowerBookItemController_0.getAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "getAll",
      Nil,
      "GET",
      this.prefix + """borrowerbookitem""",
      """ BookItem controllers mapping""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_BorrowerBookItemController_getAll231_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem2")))
  )
  private[this] lazy val controllers_BorrowerBookItemController_getAll231_invoker = createInvoker(
    BorrowerBookItemController_0.getAll2,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "getAll2",
      Nil,
      "GET",
      this.prefix + """borrowerbookitem2""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_BorrowerBookItemController_add32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem/add")))
  )
  private[this] lazy val controllers_BorrowerBookItemController_add32_invoker = createInvoker(
    BorrowerBookItemController_0.add,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "add",
      Nil,
      "POST",
      this.prefix + """borrowerbookitem/add""",
      """GET     /borrowerbookitem/bi/:id                controllers.BorrowerBookItemController.getByBookItemId(id: Long)
GET     /borrowerbookitem/br/:id                controllers.BorrowerBookItemController.getByBorrowerId(id: Long)""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_BorrowerBookItemController_update33_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerBookItemController_update33_invoker = createInvoker(
    BorrowerBookItemController_0.update(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "update",
      Seq(classOf[Long]),
      "PUT",
      this.prefix + """borrowerbookitem/update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_BorrowerBookItemController_delete34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem/delete/"), DynamicPart("borrowerId", """[^/]+""",true), StaticPart("/"), DynamicPart("BookItemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerBookItemController_delete34_invoker = createInvoker(
    BorrowerBookItemController_0.delete(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "delete",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      this.prefix + """borrowerbookitem/delete/""" + "$" + """borrowerId<[^/]+>/""" + "$" + """BookItemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_BorrowerBookItemController_getBBIByNumber35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem/getBBIByNumber/")))
  )
  private[this] lazy val controllers_BorrowerBookItemController_getBBIByNumber35_invoker = createInvoker(
    BorrowerBookItemController_0.getBBIByNumber,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "getBBIByNumber",
      Nil,
      "GET",
      this.prefix + """borrowerbookitem/getBBIByNumber/""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_BorrowerBookItemController_filter36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem/filter")))
  )
  private[this] lazy val controllers_BorrowerBookItemController_filter36_invoker = createInvoker(
    BorrowerBookItemController_0.filter,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "filter",
      Nil,
      "GET",
      this.prefix + """borrowerbookitem/filter""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_BorrowerBookItemController_finish37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("borrowerbookitem/finish/"), DynamicPart("borrowerId", """[^/]+""",true), StaticPart("/"), DynamicPart("BookItemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BorrowerBookItemController_finish37_invoker = createInvoker(
    BorrowerBookItemController_0.finish(fakeValue[Long], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BorrowerBookItemController",
      "finish",
      Seq(classOf[Long], classOf[Long]),
      "POST",
      this.prefix + """borrowerbookitem/finish/""" + "$" + """borrowerId<[^/]+>/""" + "$" + """BookItemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_TestController_index38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_TestController_index38_invoker = createInvoker(
    TestController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ TEST""",
      Seq()
    )
  )

  // @LINE:67
  private[this] lazy val controllers_TestController_explore39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_TestController_explore39_invoker = createInvoker(
    TestController_2.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_TestController_tutorial40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_TestController_tutorial40_invoker = createInvoker(
    TestController_2.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_Assets_versioned41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned41_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_8.index)
      }
  
    // @LINE:8
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_8.explore)
      }
  
    // @LINE:9
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_8.tutorial)
      }
  
    // @LINE:10
    case controllers_BookController_BookList3_route(params@_) =>
      call { 
        controllers_BookController_BookList3_invoker.call(BookController_4.BookList)
      }
  
    // @LINE:13
    case controllers_TodoController_getAll4_route(params@_) =>
      call { 
        controllers_TodoController_getAll4_invoker.call(TodoController_6.getAll)
      }
  
    // @LINE:14
    case controllers_TodoController_getById5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TodoController_getById5_invoker.call(TodoController_6.getById(id))
      }
  
    // @LINE:15
    case controllers_TodoController_add6_route(params@_) =>
      call { 
        controllers_TodoController_add6_invoker.call(TodoController_6.add)
      }
  
    // @LINE:16
    case controllers_TodoController_update7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TodoController_update7_invoker.call(TodoController_6.update(id))
      }
  
    // @LINE:17
    case controllers_TodoController_delete8_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TodoController_delete8_invoker.call(TodoController_6.delete(id))
      }
  
    // @LINE:20
    case controllers_BooksController_getAll9_route(params@_) =>
      call { 
        controllers_BooksController_getAll9_invoker.call(BooksController_1.getAll)
      }
  
    // @LINE:21
    case controllers_BooksController_addForm10_route(params@_) =>
      call { 
        controllers_BooksController_addForm10_invoker.call(BooksController_1.addForm)
      }
  
    // @LINE:22
    case controllers_BooksController_getById11_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BooksController_getById11_invoker.call(BooksController_1.getById(id))
      }
  
    // @LINE:23
    case controllers_BooksController_add12_route(params@_) =>
      call { 
        controllers_BooksController_add12_invoker.call(BooksController_1.add)
      }
  
    // @LINE:24
    case controllers_BooksController_update13_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BooksController_update13_invoker.call(BooksController_1.update(id))
      }
  
    // @LINE:25
    case controllers_BooksController_delete14_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BooksController_delete14_invoker.call(BooksController_1.delete(id))
      }
  
    // @LINE:28
    case controllers_BorrowerController_getAll15_route(params@_) =>
      call { 
        controllers_BorrowerController_getAll15_invoker.call(BorrowerController_3.getAll)
      }
  
    // @LINE:29
    case controllers_BorrowerController_addForm16_route(params@_) =>
      call { 
        controllers_BorrowerController_addForm16_invoker.call(BorrowerController_3.addForm)
      }
  
    // @LINE:31
    case controllers_BorrowerController_add17_route(params@_) =>
      call { 
        controllers_BorrowerController_add17_invoker.call(BorrowerController_3.add)
      }
  
    // @LINE:32
    case controllers_BorrowerController_update18_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BorrowerController_update18_invoker.call(BorrowerController_3.update(id))
      }
  
    // @LINE:33
    case controllers_BorrowerController_edit19_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BorrowerController_edit19_invoker.call(BorrowerController_3.edit(id))
      }
  
    // @LINE:34
    case controllers_BorrowerController_delete20_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BorrowerController_delete20_invoker.call(BorrowerController_3.delete(id))
      }
  
    // @LINE:35
    case controllers_BorrowerController_addBookToBorrower21_route(params@_) =>
      call(params.fromPath[Long]("borrowerId", None)) { (borrowerId) =>
        controllers_BorrowerController_addBookToBorrower21_invoker.call(BorrowerController_3.addBookToBorrower(borrowerId))
      }
  
    // @LINE:36
    case controllers_BorrowerController_pay22_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BorrowerController_pay22_invoker.call(BorrowerController_3.pay(id))
      }
  
    // @LINE:39
    case controllers_BookItemController_getAll23_route(params@_) =>
      call { 
        controllers_BookItemController_getAll23_invoker.call(BookItemController_7.getAll)
      }
  
    // @LINE:41
    case controllers_BookItemController_getAllByBookId24_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookItemController_getAllByBookId24_invoker.call(BookItemController_7.getAllByBookId(id))
      }
  
    // @LINE:42
    case controllers_BookItemController_add25_route(params@_) =>
      call { 
        controllers_BookItemController_add25_invoker.call(BookItemController_7.add)
      }
  
    // @LINE:43
    case controllers_BookItemController_update26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookItemController_update26_invoker.call(BookItemController_7.update(id))
      }
  
    // @LINE:44
    case controllers_BookItemController_delete27_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookItemController_delete27_invoker.call(BookItemController_7.delete(id))
      }
  
    // @LINE:45
    case controllers_BookItemController_addBIB28_route(params@_) =>
      call(params.fromQuery[Long]("borrowerId", None)) { (borrowerId) =>
        controllers_BookItemController_addBIB28_invoker.call(BookItemController_7.addBIB(borrowerId))
      }
  
    // @LINE:47
    case controllers_BookItemController_getByISBN29_route(params@_) =>
      call { 
        controllers_BookItemController_getByISBN29_invoker.call(BookItemController_7.getByISBN)
      }
  
    // @LINE:51
    case controllers_BorrowerBookItemController_getAll30_route(params@_) =>
      call { 
        controllers_BorrowerBookItemController_getAll30_invoker.call(BorrowerBookItemController_0.getAll)
      }
  
    // @LINE:52
    case controllers_BorrowerBookItemController_getAll231_route(params@_) =>
      call { 
        controllers_BorrowerBookItemController_getAll231_invoker.call(BorrowerBookItemController_0.getAll2)
      }
  
    // @LINE:55
    case controllers_BorrowerBookItemController_add32_route(params@_) =>
      call { 
        controllers_BorrowerBookItemController_add32_invoker.call(BorrowerBookItemController_0.add)
      }
  
    // @LINE:56
    case controllers_BorrowerBookItemController_update33_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BorrowerBookItemController_update33_invoker.call(BorrowerBookItemController_0.update(id))
      }
  
    // @LINE:57
    case controllers_BorrowerBookItemController_delete34_route(params@_) =>
      call(params.fromPath[Long]("borrowerId", None), params.fromPath[Long]("BookItemId", None)) { (borrowerId, BookItemId) =>
        controllers_BorrowerBookItemController_delete34_invoker.call(BorrowerBookItemController_0.delete(borrowerId, BookItemId))
      }
  
    // @LINE:58
    case controllers_BorrowerBookItemController_getBBIByNumber35_route(params@_) =>
      call { 
        controllers_BorrowerBookItemController_getBBIByNumber35_invoker.call(BorrowerBookItemController_0.getBBIByNumber)
      }
  
    // @LINE:59
    case controllers_BorrowerBookItemController_filter36_route(params@_) =>
      call { 
        controllers_BorrowerBookItemController_filter36_invoker.call(BorrowerBookItemController_0.filter)
      }
  
    // @LINE:60
    case controllers_BorrowerBookItemController_finish37_route(params@_) =>
      call(params.fromPath[Long]("borrowerId", None), params.fromPath[Long]("BookItemId", None)) { (borrowerId, BookItemId) =>
        controllers_BorrowerBookItemController_finish37_invoker.call(BorrowerBookItemController_0.finish(borrowerId, BookItemId))
      }
  
    // @LINE:66
    case controllers_TestController_index38_route(params@_) =>
      call { 
        controllers_TestController_index38_invoker.call(TestController_2.index)
      }
  
    // @LINE:67
    case controllers_TestController_explore39_route(params@_) =>
      call { 
        controllers_TestController_explore39_invoker.call(TestController_2.explore)
      }
  
    // @LINE:68
    case controllers_TestController_tutorial40_route(params@_) =>
      call { 
        controllers_TestController_tutorial40_invoker.call(TestController_2.tutorial)
      }
  
    // @LINE:70
    case controllers_Assets_versioned41_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned41_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
