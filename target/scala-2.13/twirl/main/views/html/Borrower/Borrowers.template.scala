
package views.html.Borrower

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

object Borrowers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Borrower],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(borrowers: Seq[Borrower])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),_display_(/*3.2*/main("Lista Borrowers")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Wykaz Wypożyczających</h1>
        </br>
        <form action=""""),_display_(/*9.24*/routes/*9.30*/.HomeController.index),format.raw/*9.51*/("""" method="get">
            <input type="submit" value="Home"/>
        </form>

        </br>
        <div style="width: 100%">
            <a class="btn btn-success" href=""""),_display_(/*15.47*/routes/*15.53*/.BorrowerController.addForm()),format.raw/*15.82*/("""">DODAJ</a>
        </div>
        </br>
        <div id="exercisesTable">
            <table class="table table-striped" id="catalogIndexTable"  >
                <thead style="font-size: 25px">
                    <tr>
                        <th>ID</th>
                        <th>Numer</th>
                        <th>Imię</th>
                        <th>Nazwisko</th>
                        <th>Adres</th>
                        <th>Saldo</th>
                        <th>Usuń</th>
                        <th>Modyfikuj</th>
                        <th>Zapłać</th>
                    </tr>
                </thead>
                <tbody style="font-size: 15px;">
                    """),_display_(/*34.22*/for(borrower <- borrowers) yield /*34.48*/{_display_(Seq[Any](format.raw/*34.49*/("""
                        """),format.raw/*35.25*/("""<tr class="clientRow" >
                            <td class="">"""),_display_(/*36.43*/borrower/*36.51*/.id),format.raw/*36.54*/("""</td>
                            <td class="">"""),_display_(/*37.43*/borrower/*37.51*/.number),format.raw/*37.58*/("""</td>
                            <td class="">"""),_display_(/*38.43*/borrower/*38.51*/.Name),format.raw/*38.56*/("""</td>
                            <td class="">"""),_display_(/*39.43*/borrower/*39.51*/.Surname),format.raw/*39.59*/("""</td>
                            <td class="">"""),_display_(/*40.43*/borrower/*40.51*/.Address),format.raw/*40.59*/("""</td>
                            <td class="">"""),_display_(/*41.43*/borrower/*41.51*/.Balance),format.raw/*41.59*/("""</td>
                            <td class="">
                                <form action=""""),_display_(/*43.48*/routes/*43.54*/.BorrowerController.delete(borrower.id)),format.raw/*43.93*/("""" method="get">
                                    <input type="submit" value="Usuń"/>
                                </form>
                            </td>
                            <td class="">
                                <form action=""""),_display_(/*48.48*/routes/*48.54*/.BorrowerController.edit(borrower.id)),format.raw/*48.91*/("""" method="get">
                                    <input type="submit" value="Modyfikuj"/>
                                </form>
                            </td>
                            <td class="">
                                <form action=""""),_display_(/*53.48*/routes/*53.54*/.BorrowerController.addBookToBorrower(borrower.id)),format.raw/*53.104*/("""" method="get">
                                    <input type="submit" value="Dodaj wypożyczenie"/>
                                </form>


                            </td>
                            <td class="">
                                <form action=""""),_display_(/*60.48*/routes/*60.54*/.BorrowerController.pay(borrower.id)),format.raw/*60.90*/("""" method="get">
                                    <input type="submit" value="Zapłać"/>
                                </form>


                            </td>
                        </tr>
                    """)))}),format.raw/*67.22*/("""
                """),format.raw/*68.17*/("""</tbody>
            </table>

        </div>

    </div>




    <style>
        td"""),format.raw/*79.11*/("""{"""),format.raw/*79.12*/("""
            """),format.raw/*80.13*/("""border: solid;
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/("""
        """),format.raw/*82.9*/("""th"""),format.raw/*82.11*/("""{"""),format.raw/*82.12*/("""
            """),format.raw/*83.13*/("""border: solid;
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""


    """),format.raw/*87.5*/("""</style>

""")))}),format.raw/*89.2*/("""
"""))
      }
    }
  }

  def render(borrowers:Seq[Borrower],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(borrowers)(request)

  def f:((Seq[Borrower]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (borrowers) => (request) => apply(borrowers)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T14:55:11.653
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/Borrower/Borrowers.scala.html
                  HASH: 2f49172cd2ef8dba2e9fabebde6e5c7030833183
                  MATRIX: 763->1|917->60|947->65|978->88|1017->90|1053->100|1196->217|1210->223|1251->244|1459->425|1474->431|1524->460|2266->1175|2308->1201|2347->1202|2401->1228|2495->1295|2512->1303|2536->1306|2612->1355|2629->1363|2657->1370|2733->1419|2750->1427|2776->1432|2852->1481|2869->1489|2898->1497|2974->1546|2991->1554|3020->1562|3096->1611|3113->1619|3142->1627|3266->1724|3281->1730|3341->1769|3624->2025|3639->2031|3697->2068|3985->2329|4000->2335|4072->2385|4373->2659|4388->2665|4445->2701|4700->2925|4746->2943|4869->3038|4898->3039|4940->3053|4991->3077|5020->3078|5057->3088|5087->3090|5116->3091|5158->3105|5209->3129|5238->3130|5275->3140|5318->3153
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|40->15|40->15|40->15|59->34|59->34|59->34|60->35|61->36|61->36|61->36|62->37|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|65->40|65->40|65->40|66->41|66->41|66->41|68->43|68->43|68->43|73->48|73->48|73->48|78->53|78->53|78->53|85->60|85->60|85->60|92->67|93->68|104->79|104->79|105->80|106->81|106->81|107->82|107->82|107->82|108->83|109->84|109->84|112->87|114->89
                  -- GENERATED --
              */
          