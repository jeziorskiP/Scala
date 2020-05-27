package Test

import org.scalatestplus.play.PlaySpec
import play.test.WithServer
import play.api.libs._
import play.api.libs.ws.WS
import play.api.test._
import scala.collection.mutable

class StackSpec extends PlaySpec {

  "A Stack" must {
    "pop values in last-in-first-out order" in {
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() mustBe 2
      stack.pop() mustBe 1
    }
    "throw NoSuchElementException if an empty stack is popped" in {
      val emptyStack = new mutable.Stack[Int]
      a [NoSuchElementException] must be thrownBy {
        emptyStack.pop()
      }
    }
    /*
    "Application" should {
      "be reachable" in new WithServer {
        val response = await (ws.url("http://localhost:" + port).get()) //1
        val x = WS.url("http://example.com/feed").get()
        response.status must equalTo(OK) //2
        response.body must contain("Semaphore Community Library") //3
      }
    }
*/


  }
}