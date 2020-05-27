// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Wed May 27 11:38:01 CEST 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:70
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseBookController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def BookList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.BookList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "booklist"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseBorrowerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:33
    def edit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.edit",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:32
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.update",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:28
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower"})
        }
      """
    )
  
    // @LINE:31
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower/add"})
        }
      """
    )
  
    // @LINE:35
    def addBookToBorrower: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.addBookToBorrower",
      """
        function(borrowerId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower/addBookToBorrower/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("borrowerId", borrowerId0))})
        }
      """
    )
  
    // @LINE:29
    def addForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.addForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower/addForm"})
        }
      """
    )
  
    // @LINE:36
    def pay: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerController.pay",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrower/pay/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:66
  class ReverseTestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TestController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:68
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TestController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:67
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TestController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseBooksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "books/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
    // @LINE:23
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "books/add"})
        }
      """
    )
  
    // @LINE:22
    def getById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:21
    def addForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.addForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/addForm"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseTodoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todos"})
        }
      """
    )
  
    // @LINE:15
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/add"})
        }
      """
    )
  
    // @LINE:14
    def getById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TodoController.getById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:8
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseBookItemController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookItemController.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bookitem/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:43
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookItemController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "bookitem/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:39
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookItemController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bookitem"})
        }
      """
    )
  
    // @LINE:42
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookItemController.add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bookitem/add"})
        }
      """
    )
  
    // @LINE:45
    def addBIB: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookItemController.addBIB",
      """
        function(borrowerId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addBIB/borrowerId" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("borrowerId", borrowerId0)])})
        }
      """
    )
  
    // @LINE:47
    def getByISBN: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookItemController.getByISBN",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bookitem/getByISBN"})
        }
      """
    )
  
    // @LINE:41
    def getAllByBookId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookItemController.getAllByBookId",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bookitemByBook/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseBorrowerBookItemController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def filter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.filter",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem/filter"})
        }
      """
    )
  
    // @LINE:52
    def getAll2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.getAll2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem2"})
        }
      """
    )
  
    // @LINE:56
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.update",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem/update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:58
    def getBBIByNumber: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.getBBIByNumber",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem/getBBIByNumber/"})
        }
      """
    )
  
    // @LINE:51
    def getAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.getAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem"})
        }
      """
    )
  
    // @LINE:55
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.add",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem/add"})
        }
      """
    )
  
    // @LINE:60
    def finish: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.finish",
      """
        function(borrowerId0,BookItemId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem/finish/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("borrowerId", borrowerId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("BookItemId", BookItemId1))})
        }
      """
    )
  
    // @LINE:57
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BorrowerBookItemController.delete",
      """
        function(borrowerId0,BookItemId1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "borrowerbookitem/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("borrowerId", borrowerId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("BookItemId", BookItemId1))})
        }
      """
    )
  
  }


}
