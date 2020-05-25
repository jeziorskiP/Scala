
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

object BBIByNumber extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[scala.Tuple3[Borrower, BookItem, Boolean]],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(BBIs: Seq[(Borrower, BookItem, Boolean)])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""

"""),_display_(/*3.2*/main("Lista BorrowerBookItem")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Podsumowanie wypożyczenia</h1>
        </br>
        <form action=""""),_display_(/*9.24*/routes/*9.30*/.HomeController.index),format.raw/*9.51*/("""" method="get">
            <input type="submit" value="Home"/>
        </form>

        </br>



        """),_display_(/*17.10*/helper/*17.16*/.CSRF.formField),format.raw/*17.31*/("""

        """),format.raw/*19.9*/("""<div id="exercisesTable">
            <table class="table table-condensed" id="catalogIndexTable">
                <thead style="font-size: 25px">
                    <tr>
                        <td>Name</td>
                        <td>Surname</td>
                        <td>Address</td>
                        <td>--------</td>
                        <td>ISBN</td>
                        <td>Numer</td>
                        <td>Status</td>
                        <td>Modyfikuj</td>
                        <td>Zakończ wypozyczenie</td>
                    </tr>
                </thead>
                <tbody style="font-size: 15px;">
                    """),_display_(/*35.22*/for(bbi <- BBIs) yield /*35.38*/{_display_(Seq[Any](format.raw/*35.39*/("""
                        """),format.raw/*36.25*/("""<tr class="clientRow">
                            <td class="">"""),_display_(/*37.43*/bbi/*37.46*/._1.Name),format.raw/*37.54*/("""</td>
                            <td class="">"""),_display_(/*38.43*/bbi/*38.46*/._1.Surname),format.raw/*38.57*/("""</td>
                            <td class="">"""),_display_(/*39.43*/bbi/*39.46*/._1.Address),format.raw/*39.57*/("""</td>
                            <td class="">-------</td>
                            <td class="">"""),_display_(/*41.43*/bbi/*41.46*/._2.ISBN),format.raw/*41.54*/("""</td>
                            <td class="">"""),_display_(/*42.43*/bbi/*42.46*/._2.number),format.raw/*42.56*/("""</td>
                            <td class="">"""),_display_(/*43.43*/bbi/*43.46*/._2.isComplete),format.raw/*43.60*/("""</td>
                            <td class="">
                                <form action=""""),_display_(/*45.48*/routes/*45.54*/.BorrowerBookItemController.delete(bbi._1.id, bbi._2.id)),format.raw/*45.110*/("""" method="get">
                                    <input type="submit" value="Usuń"/>
                                </form>
                            </td>
                            """),_display_(/*49.30*/if(!bbi._3)/*49.41*/{_display_(Seq[Any](format.raw/*49.42*/("""
                                """),format.raw/*50.33*/("""<td class="">
                                    <form action=""""),_display_(/*51.52*/routes/*51.58*/.BorrowerBookItemController.finish(bbi._1.id, bbi._2.id)),format.raw/*51.114*/("""" method="Post">
                                        """),_display_(/*52.42*/helper/*52.48*/.CSRF.formField),format.raw/*52.63*/("""
                                        """),format.raw/*53.41*/("""<input type="submit" value="Zakoncz"/>
                                    </form>
                                </td>
                            """)))}),format.raw/*56.30*/("""
                            """),_display_(/*57.30*/if(bbi._3)/*57.40*/{_display_(Seq[Any](format.raw/*57.41*/("""
                            """),format.raw/*58.29*/("""<td class="">
                                Zakończono
                            </td>
                            """)))}),format.raw/*61.30*/("""

                        """),format.raw/*63.25*/("""</tr>
                    """)))}),format.raw/*64.22*/("""
                """),format.raw/*65.17*/("""</tbody>
            </table>

        </div>

    </div>

    <style>
            td"""),format.raw/*73.15*/("""{"""),format.raw/*73.16*/("""
                """),format.raw/*74.17*/("""border: solid;
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""
            """),format.raw/*76.13*/("""th"""),format.raw/*76.15*/("""{"""),format.raw/*76.16*/("""
                """),format.raw/*77.17*/("""border: solid;
            """),format.raw/*78.13*/("""}"""),format.raw/*78.14*/("""


    """),format.raw/*81.5*/("""</style>




""")))}),format.raw/*86.2*/("""
"""))
      }
    }
  }

  def render(BBIs:Seq[scala.Tuple3[Borrower, BookItem, Boolean]],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(BBIs)(request)

  def f:((Seq[scala.Tuple3[Borrower, BookItem, Boolean]]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (BBIs) => (request) => apply(BBIs)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T18:14:04.502
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/BorrowerBookItem/BBIByNumber.scala.html
                  HASH: ca6c6c4bd3ade2b50fd9440d07c87934d3960291
                  MATRIX: 806->1|976->76|1006->81|1044->111|1083->113|1119->123|1266->244|1280->250|1321->271|1463->386|1478->392|1514->407|1553->419|2265->1104|2297->1120|2336->1121|2390->1147|2483->1213|2495->1216|2524->1224|2600->1273|2612->1276|2644->1287|2720->1336|2732->1339|2764->1350|2895->1454|2907->1457|2936->1465|3012->1514|3024->1517|3055->1527|3131->1576|3143->1579|3178->1593|3302->1690|3317->1696|3395->1752|3617->1947|3637->1958|3676->1959|3738->1993|3831->2059|3846->2065|3924->2121|4010->2180|4025->2186|4061->2201|4131->2243|4315->2396|4373->2427|4392->2437|4431->2438|4489->2468|4643->2591|4699->2619|4758->2647|4804->2665|4925->2758|4954->2759|5000->2777|5056->2805|5085->2806|5127->2820|5157->2822|5186->2823|5232->2841|5288->2869|5317->2870|5354->2880|5403->2899
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|42->17|42->17|42->17|44->19|60->35|60->35|60->35|61->36|62->37|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|66->41|66->41|66->41|67->42|67->42|67->42|68->43|68->43|68->43|70->45|70->45|70->45|74->49|74->49|74->49|75->50|76->51|76->51|76->51|77->52|77->52|77->52|78->53|81->56|82->57|82->57|82->57|83->58|86->61|88->63|89->64|90->65|98->73|98->73|99->74|100->75|100->75|101->76|101->76|101->76|102->77|103->78|103->78|106->81|111->86
                  -- GENERATED --
              */
          