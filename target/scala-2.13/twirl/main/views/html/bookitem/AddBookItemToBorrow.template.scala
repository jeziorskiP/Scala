
package views.html.bookitem

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

object AddBookItemToBorrow extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Long,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(borrowerId: Long)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/main("Dodawanie ksiązki do wypozczenia")/*3.42*/ {_display_(Seq[Any](format.raw/*3.44*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        </br>

        <h1 style="font-size: 40px">Dodawanie książki do wypożyczenia</h1>
        </br>  <form method="post" action=""""),_display_(/*10.45*/routes/*10.51*/.BookItemController.addBIB(borrowerId)),format.raw/*10.89*/("""">
        """),_display_(/*11.10*/helper/*11.16*/.CSRF.formField),format.raw/*11.31*/("""

        """),format.raw/*13.9*/("""</br>

        <input type="hidden" name="book_id" value="0"></input>


        <input type="hidden" name="ISBN" value="000000000000"></input>


        <input type="hidden" name="isComplete" value="true"></input>

        <label for="number">Numer książki</label>
        <input type="text" name="number"></input>
    </br>


        <input type="submit"></input>





    </form>



    <style>
        td"""),format.raw/*39.11*/("""{"""),format.raw/*39.12*/("""
            """),format.raw/*40.13*/("""border: solid;
        """),format.raw/*41.9*/("""}"""),format.raw/*41.10*/("""
        """),format.raw/*42.9*/("""th"""),format.raw/*42.11*/("""{"""),format.raw/*42.12*/("""
            """),format.raw/*43.13*/("""border: solid;
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""


    """),format.raw/*47.5*/("""</style>
    </div>
""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(borrowerId:Long,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(borrowerId)(request)

  def f:((Long) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (borrowerId) => (request) => apply(borrowerId)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T18:18:57.560
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/bookitem/AddBookItemToBorrow.scala.html
                  HASH: 7f0dbcf2769e4bf0ef08d0bc1dd63b1c1a45929d
                  MATRIX: 764->1|910->52|940->57|988->97|1027->99|1063->109|1242->261|1257->267|1316->305|1356->318|1371->324|1407->339|1446->351|1907->784|1936->785|1978->799|2029->823|2058->824|2095->834|2125->836|2154->837|2196->851|2247->875|2276->876|2313->886|2366->909
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|35->10|35->10|35->10|36->11|36->11|36->11|38->13|64->39|64->39|65->40|66->41|66->41|67->42|67->42|67->42|68->43|69->44|69->44|72->47|74->49
                  -- GENERATED --
              */
          