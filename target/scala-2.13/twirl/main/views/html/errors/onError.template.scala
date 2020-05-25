
package views.html.errors

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

object onError extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Throwable,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(throwable: Throwable):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("onError Happened")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

    """),format.raw/*5.5*/("""</br>
    <form action=""""),_display_(/*6.20*/routes/*6.26*/.HomeController.index),format.raw/*6.47*/("""" method="get">
        <input type="submit" value="Home"/>
    </form>
    </br>

    <h1>onError Happened</h1>
    <p>"""),_display_(/*12.9*/throwable/*12.18*/.getMessage),format.raw/*12.29*/("""</p>



""")))}))
      }
    }
  }

  def render(throwable:Throwable): play.twirl.api.HtmlFormat.Appendable = apply(throwable)

  def f:((Throwable) => play.twirl.api.HtmlFormat.Appendable) = (throwable) => apply(throwable)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-19T19:28:05.585
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/errors/onError.scala.html
                  HASH: e3e5d3bffdb2ef348ce00b7cd95af325bc5c8c50
                  MATRIX: 741->1|858->23|888->28|920->52|959->54|993->62|1045->88|1059->94|1100->115|1253->242|1271->251|1303->262
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|31->6|31->6|31->6|37->12|37->12|37->12
                  -- GENERATED --
              */
          