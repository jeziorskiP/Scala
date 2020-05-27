// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Wed May 27 11:38:01 CEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:70
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:70
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:10
  class ReverseBookController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def BookList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "booklist")
    }
  
  }

  // @LINE:28
  class ReverseBorrowerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrower/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:33
    def edit(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrower/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:32
    def update(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "borrower/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:28
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrower")
    }
  
    // @LINE:31
    def add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "borrower/add")
    }
  
    // @LINE:35
    def addBookToBorrower(borrowerId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrower/addBookToBorrower/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("borrowerId", borrowerId)))
    }
  
    // @LINE:29
    def addForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrower/addForm")
    }
  
    // @LINE:36
    def pay(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrower/pay/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:66
  class ReverseTestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:68
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:67
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
  }

  // @LINE:20
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "books/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:20
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:23
    def add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books/add")
    }
  
    // @LINE:22
    def getById(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:21
    def addForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/addForm")
    }
  
  }

  // @LINE:13
  class ReverseTodoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todos/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:16
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "todos/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:13
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todos")
    }
  
    // @LINE:15
    def add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "todos/add")
    }
  
    // @LINE:14
    def getById(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "todos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:8
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
  }

  // @LINE:39
  class ReverseBookItemController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def delete(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bookitem/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:43
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "bookitem/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bookitem")
    }
  
    // @LINE:42
    def add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bookitem/add")
    }
  
    // @LINE:45
    def addBIB(borrowerId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addBIB/borrowerId" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("borrowerId", borrowerId)))))
    }
  
    // @LINE:47
    def getByISBN(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "bookitem/getByISBN")
    }
  
    // @LINE:41
    def getAllByBookId(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bookitemByBook/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
  }

  // @LINE:51
  class ReverseBorrowerBookItemController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def filter(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrowerbookitem/filter")
    }
  
    // @LINE:52
    def getAll2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrowerbookitem2")
    }
  
    // @LINE:56
    def update(id:Long): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "borrowerbookitem/update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:58
    def getBBIByNumber(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrowerbookitem/getBBIByNumber/")
    }
  
    // @LINE:51
    def getAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrowerbookitem")
    }
  
    // @LINE:55
    def add(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "borrowerbookitem/add")
    }
  
    // @LINE:60
    def finish(borrowerId:Long, BookItemId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "borrowerbookitem/finish/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("borrowerId", borrowerId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("BookItemId", BookItemId)))
    }
  
    // @LINE:57
    def delete(borrowerId:Long, BookItemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "borrowerbookitem/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("borrowerId", borrowerId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("BookItemId", BookItemId)))
    }
  
  }


}
