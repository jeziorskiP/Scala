
package views.html.books

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

object Books extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Book],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books: Seq[Book])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/main("Lista Todo")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Wykaz ksiązek</h1>
        </br>
        <form action=""""),_display_(/*9.24*/routes/*9.30*/.HomeController.index),format.raw/*9.51*/("""" method="get">
            <input type="submit" value="Home"/>
        </form>

        </br>
        <div style="width: 100%">
            <a class="btn btn-success" href=""""),_display_(/*15.47*/routes/*15.53*/.BooksController.addForm()),format.raw/*15.79*/("""">DODAJ</a>
        </div>
        </br>
        <div id="exercisesTable">
            <table class="table table-condensed" id="catalogIndexTable">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>Nazwa</td>
                        <td>Autor</td>
                        <td>Rok Wydania</td>
                        <td>ISBN</td>
                        <td>Ilosc</td>
                        <td>Na stanie</td>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*32.22*/for(book <- books) yield /*32.40*/{_display_(Seq[Any](format.raw/*32.41*/("""
                        """),format.raw/*33.25*/("""<tr class="clientRow">
                            <td class="">"""),_display_(/*34.43*/book/*34.47*/.id),format.raw/*34.50*/("""</td>
                            <td class="">"""),_display_(/*35.43*/book/*35.47*/.title),format.raw/*35.53*/("""</td>
                            <td class="">"""),_display_(/*36.43*/book/*36.47*/.author),format.raw/*36.54*/("""</td>
                            <td class="">"""),_display_(/*37.43*/book/*37.47*/.rokWydania),format.raw/*37.58*/("""</td>
                            <td class="">"""),_display_(/*38.43*/book/*38.47*/.ISBN),format.raw/*38.52*/("""</td>
                            <td class="">"""),_display_(/*39.43*/book/*39.47*/.quantity),format.raw/*39.56*/("""</td>
                            <td class="">"""),_display_(/*40.43*/book/*40.47*/.current),format.raw/*40.55*/("""</td>
                            <td class="">
                                <form action=""""),_display_(/*42.48*/routes/*42.54*/.BooksController.delete(book.id)),format.raw/*42.86*/("""" method="get">
                                    <input type="submit" value="Delete single record"/>
                                </form>


                            </td>
                            <td class="">
                                <form action=""""),_display_(/*49.48*/routes/*49.54*/.BookItemController.getAllByBookId(book.id)),format.raw/*49.97*/("""" method="get">
                                    <input type="submit" value="Show"/>
                                </form>


                            </td>
                        </tr>
                    """)))}),format.raw/*56.22*/("""
                """),format.raw/*57.17*/("""</tbody>
            </table>

        </div>

    </div>





    <style>
            td"""),format.raw/*69.15*/("""{"""),format.raw/*69.16*/("""
                """),format.raw/*70.17*/("""border: solid;
            """),format.raw/*71.13*/("""}"""),format.raw/*71.14*/("""
            """),format.raw/*72.13*/("""th"""),format.raw/*72.15*/("""{"""),format.raw/*72.16*/("""
                """),format.raw/*73.17*/("""border: solid;
            """),format.raw/*74.13*/("""}"""),format.raw/*74.14*/("""


    """),format.raw/*77.5*/("""</style>
""")))}),format.raw/*78.2*/("""
"""))
      }
    }
  }

  def render(books:Seq[Book],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(books)(request)

  def f:((Seq[Book]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (books) => (request) => apply(books)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T14:56:24.680
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/books/Books.scala.html
                  HASH: 05f83115615d7dddc77756f9c7aba1f491cbe4f0
                  MATRIX: 752->1|898->52|928->57|954->75|993->77|1029->87|1164->196|1178->202|1219->223|1427->404|1442->410|1489->436|2105->1025|2139->1043|2178->1044|2232->1070|2325->1136|2338->1140|2362->1143|2438->1192|2451->1196|2478->1202|2554->1251|2567->1255|2595->1262|2671->1311|2684->1315|2716->1326|2792->1375|2805->1379|2831->1384|2907->1433|2920->1437|2950->1446|3026->1495|3039->1499|3068->1507|3192->1604|3207->1610|3260->1642|3563->1918|3578->1924|3642->1967|3895->2189|3941->2207|4070->2308|4099->2309|4145->2327|4201->2355|4230->2356|4272->2370|4302->2372|4331->2373|4377->2391|4433->2419|4462->2420|4499->2430|4540->2441
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|40->15|40->15|40->15|57->32|57->32|57->32|58->33|59->34|59->34|59->34|60->35|60->35|60->35|61->36|61->36|61->36|62->37|62->37|62->37|63->38|63->38|63->38|64->39|64->39|64->39|65->40|65->40|65->40|67->42|67->42|67->42|74->49|74->49|74->49|81->56|82->57|94->69|94->69|95->70|96->71|96->71|97->72|97->72|97->72|98->73|99->74|99->74|102->77|103->78
                  -- GENERATED --
              */
          