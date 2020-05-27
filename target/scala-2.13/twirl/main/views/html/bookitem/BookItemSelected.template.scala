
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

object BookItemSelected extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[BookItem],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookitems: Seq[BookItem])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),_display_(/*3.2*/main("Spis egzemplarzy-selected")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""



    """),format.raw/*7.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Spis egzemplarzy-selected</h1>
        </br>
        <form action=""""),_display_(/*10.24*/routes/*10.30*/.HomeController.index),format.raw/*10.51*/("""" method="get">
            <input type="submit" value="Home"/>
        </form>
        </br>
        <div id="exercisesTable">
            <table class="table table-striped" id="catalogIndexTable"  >
                <thead style="font-size: 25px">
                    <tr>
                        <th>ID</th>
                        <th>Numer</th>
                        <th>ISBN</th>
                        <th>Wypożyczona</th>
                        <th>Modyfikuj</th>
                    </tr>
                </thead>
                <tbody style="font-size: 15px;">
                """),_display_(/*26.18*/for(bookitem <- bookitems) yield /*26.44*/{_display_(Seq[Any](format.raw/*26.45*/("""
                    """),format.raw/*27.21*/("""<tr class="clientRow" >
                        <td class="">"""),_display_(/*28.39*/bookitem/*28.47*/.id),format.raw/*28.50*/("""</td>
                        <td class="">"""),_display_(/*29.39*/bookitem/*29.47*/.number),format.raw/*29.54*/("""</td>
                        <td class="">"""),_display_(/*30.39*/bookitem/*30.47*/.ISBN),format.raw/*30.52*/("""</td>
                        <td class="">"""),_display_(/*31.39*/bookitem/*31.47*/.isComplete),format.raw/*31.58*/("""</td>
                        """),_display_(/*32.26*/if(bookitem.isComplete == true)/*32.57*/{_display_(Seq[Any](format.raw/*32.58*/("""
                            """),format.raw/*33.29*/("""<td class="">
                                <form action=""""),_display_(/*34.48*/routes/*34.54*/.BookItemController.delete(bookitem.id)),format.raw/*34.93*/("""" method="get">
                                    <input type="submit" value="Usuń"/>
                                </form>
                            </td>
                        """)))}),format.raw/*38.26*/("""
                        """),_display_(/*39.26*/if(bookitem.isComplete == false)/*39.58*/{_display_(Seq[Any](format.raw/*39.59*/("""
                            """),format.raw/*40.29*/("""<td class="">
                                ---------
                            </td>
                        """)))}),format.raw/*43.26*/("""



                    """),format.raw/*47.21*/("""</tr>
                """)))}),format.raw/*48.18*/("""
                """),format.raw/*49.17*/("""</tbody>
            </table>

        </div>



    <style>
        td"""),format.raw/*57.11*/("""{"""),format.raw/*57.12*/("""
            """),format.raw/*58.13*/("""border: solid;
        """),format.raw/*59.9*/("""}"""),format.raw/*59.10*/("""
        """),format.raw/*60.9*/("""th"""),format.raw/*60.11*/("""{"""),format.raw/*60.12*/("""
            """),format.raw/*61.13*/("""border: solid;
        """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""


    """),format.raw/*65.5*/("""</style>
    </div>
""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(bookitems:Seq[BookItem],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(bookitems)(request)

  def f:((Seq[BookItem]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (bookitems) => (request) => apply(bookitems)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-27T13:50:18.651
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/bookitem/BookItemSelected.scala.html
                  HASH: 7eb34a1fda4e390c8ae560e59977da5a0a936b0d
                  MATRIX: 770->1|924->60|954->65|995->98|1034->100|1072->112|1220->233|1235->239|1277->260|1912->868|1954->894|1993->895|2043->917|2133->980|2150->988|2174->991|2246->1036|2263->1044|2291->1051|2363->1096|2380->1104|2406->1109|2478->1154|2495->1162|2527->1173|2586->1205|2626->1236|2665->1237|2723->1267|2812->1329|2827->1335|2887->1374|3109->1565|3163->1592|3204->1624|3243->1625|3301->1655|3450->1773|3506->1801|3561->1825|3607->1843|3714->1922|3743->1923|3785->1937|3836->1961|3865->1962|3902->1972|3932->1974|3961->1975|4003->1989|4054->2013|4083->2014|4120->2024|4173->2047
                  LINES: 21->1|26->1|28->3|28->3|28->3|32->7|35->10|35->10|35->10|51->26|51->26|51->26|52->27|53->28|53->28|53->28|54->29|54->29|54->29|55->30|55->30|55->30|56->31|56->31|56->31|57->32|57->32|57->32|58->33|59->34|59->34|59->34|63->38|64->39|64->39|64->39|65->40|68->43|72->47|73->48|74->49|82->57|82->57|83->58|84->59|84->59|85->60|85->60|85->60|86->61|87->62|87->62|90->65|92->67
                  -- GENERATED --
              */
          