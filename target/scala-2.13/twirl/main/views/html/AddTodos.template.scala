
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object AddTodos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Todo],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(todos: Seq[Todo])(implicit requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Lista Todo")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""



"""),format.raw/*7.1*/("""<form method="post" action=""""),_display_(/*7.30*/routes/*7.36*/.TodoController.add()),format.raw/*7.57*/("""">
    """),_display_(/*8.6*/helper/*8.12*/.CSRF.formField),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""<input type="text" name="New todo"></input>
    <input type="submit"></input>
</form>


""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(todos:Seq[Todo],requestHeader:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(todos)(requestHeader)

  def f:((Seq[Todo]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (todos) => (requestHeader) => apply(todos)(requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-14T10:00:32.193
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/AddTodos.scala.html
                  HASH: 79e2550f1e23a07c18be24b5261a0583ee47599e
                  MATRIX: 749->1|901->58|931->63|957->81|996->83|1030->91|1085->120|1099->126|1140->147|1174->156|1188->162|1223->177|1255->183|1379->277
                  LINES: 21->1|26->1|28->3|28->3|28->3|32->7|32->7|32->7|32->7|33->8|33->8|33->8|34->9|39->14
                  -- GENERATED --
              */
          