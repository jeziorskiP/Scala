
package views.html.BorrowerBookItem

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

object Filter extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Lista BorrowerBookItem")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h3>Wyszukaj wypożyczenie dla wskazanego numery książki</h3>

        <form method="get" action=""""),_display_(/*9.37*/routes/*9.43*/.BorrowerBookItemController.getBBIByNumber),format.raw/*9.85*/("""">
            """),_display_(/*10.14*/helper/*10.20*/.CSRF.formField),format.raw/*10.35*/("""

        """),format.raw/*12.9*/("""</br>

            <label for="number">Numer ksiązki</label>
            <input type="text" name="number"></input>
        </br>
            <input type="submit"></input>
        </form>

</div>





""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T18:23:19.609
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/BorrowerBookItem/Filter.scala.html
                  HASH: a1a4407d7c56388eab4e57b0c0fe402ba380f1bb
                  MATRIX: 754->1|884->36|914->41|952->71|991->73|1027->83|1176->206|1190->212|1252->254|1296->271|1311->277|1347->292|1386->304|1631->519
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|35->10|35->10|35->10|37->12|51->26
                  -- GENERATED --
              */
          