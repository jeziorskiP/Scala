
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

object BBI2 extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[scala.Tuple3[Borrower, BookItem, Boolean]],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(BBIs: Seq[(Borrower, BookItem, Boolean)])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""

"""),_display_(/*3.2*/main("Lista BorrowerBookItem")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Spis wypożyczonych książek</h1>
        </br>
        <form action=""""),_display_(/*9.24*/routes/*9.30*/.HomeController.index),format.raw/*9.51*/("""" method="get">
            <input type="submit" value="Home"/>
        </form>

        </br>


     <div>
         <a href=""""),_display_(/*17.20*/routes/*17.26*/.BorrowerBookItemController.filter()),format.raw/*17.62*/(""""> WYSZUKAJ wypożyczoną książkę</a>
     </div>
    </br>








        <div id="exercisesTable">
            <table class="table table-condensed" id="catalogIndexTable">
                <thead style="font-size: 25px">
                    <tr>
                        <td>Imię</td>
                        <td>Nazwisko</td>
                        <td>Adres</td>
                        <td>--------</td>
                        <td>ISBN</td>
                        <td>Numer</td>
                        <td>Status ksiażki</td>
                        <td>--------</td>
                        <td>Status wypożyczenia</td>
                        <td>Modyfikuj</td>
                    </tr>
                </thead>
                <tbody style="font-size: 15px;">
                    """),_display_(/*45.22*/for(bbi <- BBIs) yield /*45.38*/{_display_(Seq[Any](format.raw/*45.39*/("""
                        """),format.raw/*46.25*/("""<tr class="clientRow">
                            <td class="">"""),_display_(/*47.43*/bbi/*47.46*/._1.Name),format.raw/*47.54*/("""</td>
                            <td class="">"""),_display_(/*48.43*/bbi/*48.46*/._1.Surname),format.raw/*48.57*/("""</td>
                            <td class="">"""),_display_(/*49.43*/bbi/*49.46*/._1.Address),format.raw/*49.57*/("""</td>
                            <td class="">--------</td>
                            <td class="">"""),_display_(/*51.43*/bbi/*51.46*/._2.ISBN),format.raw/*51.54*/("""</td>
                            <td class="">"""),_display_(/*52.43*/bbi/*52.46*/._2.number),format.raw/*52.56*/("""</td>
                            <td class="">"""),_display_(/*53.43*/bbi/*53.46*/._2.isComplete),format.raw/*53.60*/("""</td>
                            <td class="">-------</td>
                            <td class="">"""),_display_(/*55.43*/bbi/*55.46*/._3),format.raw/*55.49*/("""</td>
                            <td class="">
                                <form action=""""),_display_(/*57.48*/routes/*57.54*/.BorrowerBookItemController.delete(bbi._1.id, bbi._2.id)),format.raw/*57.110*/("""" method="get">
                                    <input type="submit" value="Usuń"/>
                                </form>


                            </td>
                        </tr>
                    """)))}),format.raw/*64.22*/("""
                """),format.raw/*65.17*/("""</tbody>
            </table>

        </div>

    </div>


    <style>
            td"""),format.raw/*74.15*/("""{"""),format.raw/*74.16*/("""
                """),format.raw/*75.17*/("""border: solid;
            """),format.raw/*76.13*/("""}"""),format.raw/*76.14*/("""
            """),format.raw/*77.13*/("""th"""),format.raw/*77.15*/("""{"""),format.raw/*77.16*/("""
                """),format.raw/*78.17*/("""border: solid;
            """),format.raw/*79.13*/("""}"""),format.raw/*79.14*/("""


    """),format.raw/*82.5*/("""</style>



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
                  DATE: 2020-05-17T18:15:21.551
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/BorrowerBookItem/BBI2.scala.html
                  HASH: 7c755c4a0dc28f3be7f392e1d93246d4826601c0
                  MATRIX: 799->1|969->76|999->81|1037->111|1076->113|1112->123|1260->245|1274->251|1315->272|1477->407|1492->413|1549->449|2395->1268|2427->1284|2466->1285|2520->1311|2613->1377|2625->1380|2654->1388|2730->1437|2742->1440|2774->1451|2850->1500|2862->1503|2894->1514|3026->1619|3038->1622|3067->1630|3143->1679|3155->1682|3186->1692|3262->1741|3274->1744|3309->1758|3440->1862|3452->1865|3476->1868|3600->1965|3615->1971|3693->2027|3946->2249|3992->2267|4115->2362|4144->2363|4190->2381|4246->2409|4275->2410|4317->2424|4347->2426|4376->2427|4422->2445|4478->2473|4507->2474|4544->2484|4591->2501
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|42->17|42->17|42->17|70->45|70->45|70->45|71->46|72->47|72->47|72->47|73->48|73->48|73->48|74->49|74->49|74->49|76->51|76->51|76->51|77->52|77->52|77->52|78->53|78->53|78->53|80->55|80->55|80->55|82->57|82->57|82->57|89->64|90->65|99->74|99->74|100->75|101->76|101->76|102->77|102->77|102->77|103->78|104->79|104->79|107->82|111->86
                  -- GENERATED --
              */
          