
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
                """),_display_(/*22.18*/for(bookitem <- bookitems) yield /*22.44*/{_display_(Seq[Any](format.raw/*22.45*/("""
                    """),format.raw/*23.21*/("""<tr class="clientRow" >
                        <td class="">"""),_display_(/*24.39*/bookitem/*24.47*/.id),format.raw/*24.50*/("""</td>
                        <td class="">"""),_display_(/*25.39*/bookitem/*25.47*/.number),format.raw/*25.54*/("""</td>
                        <td class="">"""),_display_(/*26.39*/bookitem/*26.47*/.ISBN),format.raw/*26.52*/("""</td>
                        <td class="">"""),_display_(/*27.39*/bookitem/*27.47*/.isComplete),format.raw/*27.58*/("""</td>
                        """),_display_(/*28.26*/if(bookitem.isComplete == true)/*28.57*/{_display_(Seq[Any](format.raw/*28.58*/("""
                            """),format.raw/*29.29*/("""<td class="">
                                <form action=""""),_display_(/*30.48*/routes/*30.54*/.BookItemController.delete(bookitem.id)),format.raw/*30.93*/("""" method="get">
                                    <input type="submit" value="Usuń"/>
                                </form>
                            </td>
                        """)))}),format.raw/*34.26*/("""
                        """),_display_(/*35.26*/if(bookitem.isComplete == false)/*35.58*/{_display_(Seq[Any](format.raw/*35.59*/("""
                            """),format.raw/*36.29*/("""<td class="">
                                ---------
                            </td>
                        """)))}),format.raw/*39.26*/("""



                    """),format.raw/*43.21*/("""</tr>
                """)))}),format.raw/*44.18*/("""
                """),format.raw/*45.17*/("""</tbody>
            </table>

        </div>



    <style>
        td"""),format.raw/*53.11*/("""{"""),format.raw/*53.12*/("""
            """),format.raw/*54.13*/("""border: solid;
        """),format.raw/*55.9*/("""}"""),format.raw/*55.10*/("""
        """),format.raw/*56.9*/("""th"""),format.raw/*56.11*/("""{"""),format.raw/*56.12*/("""
            """),format.raw/*57.13*/("""border: solid;
        """),format.raw/*58.9*/("""}"""),format.raw/*58.10*/("""


    """),format.raw/*61.5*/("""</style>
    </div>
""")))}),format.raw/*63.2*/("""
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
                  DATE: 2020-05-16T22:52:09.581
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/bookitem/BookItemSelected.scala.html
                  HASH: 43cf11320e12e0116d74ca73a55379dbe69792df
                  MATRIX: 770->1|924->60|954->65|995->98|1034->100|1072->112|1707->720|1749->746|1788->747|1838->769|1928->832|1945->840|1969->843|2041->888|2058->896|2086->903|2158->948|2175->956|2201->961|2273->1006|2290->1014|2322->1025|2381->1057|2421->1088|2460->1089|2518->1119|2607->1181|2622->1187|2682->1226|2904->1417|2958->1444|2999->1476|3038->1477|3096->1507|3245->1625|3301->1653|3356->1677|3402->1695|3509->1774|3538->1775|3580->1789|3631->1813|3660->1814|3697->1824|3727->1826|3756->1827|3798->1841|3849->1865|3878->1866|3915->1876|3968->1899
                  LINES: 21->1|26->1|28->3|28->3|28->3|32->7|47->22|47->22|47->22|48->23|49->24|49->24|49->24|50->25|50->25|50->25|51->26|51->26|51->26|52->27|52->27|52->27|53->28|53->28|53->28|54->29|55->30|55->30|55->30|59->34|60->35|60->35|60->35|61->36|64->39|68->43|69->44|70->45|78->53|78->53|79->54|80->55|80->55|81->56|81->56|81->56|82->57|83->58|83->58|86->61|88->63
                  -- GENERATED --
              */
          