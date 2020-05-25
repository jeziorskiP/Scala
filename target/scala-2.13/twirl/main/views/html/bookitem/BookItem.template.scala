
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

object BookItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[BookItem],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookitems: Seq[BookItem])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),_display_(/*3.2*/main("Dodawanie ksiązki")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""



    """),format.raw/*7.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Spis egzemplarzy</h1>
        </br>
        <form action=""""),_display_(/*10.24*/routes/*10.30*/.BooksController.getAll()),format.raw/*10.55*/("""" method="get">
            <input type="submit" value="Powrót"/>
        </form>

        </br>
        <div style="width: 100%">
        </br>
            <form method="post" action=""""),_display_(/*17.42*/routes/*17.48*/.BookItemController.getByISBN()),format.raw/*17.79*/("""">
            """),_display_(/*18.14*/helper/*18.20*/.CSRF.formField),format.raw/*18.35*/("""

                """),format.raw/*20.17*/("""<input type="hidden" name="book_id" value="0"></input>

                <input type="hidden" name="isComplete" value="false"></input>

                <input type="hidden" name="number" value="0"></input>

                <label for="ISBN">ISBN</label>
                <input type="text" name="ISBN" ></input>

                <input type="submit" value="Szukaj">

            </br>
            </br>     </br>
            </form>
        </div>
        <div id="exercisesTable">
            <table class="table table-striped" id="catalogIndexTable"  >
                <thead style="font-size: 25px">
                    <tr>
                        <th>ID</th>
                        <th>Numer</th>
                        <th>ISBN</th>
                        <th>Dostępna</th>
                        <th>Modyfikuj</th>
                    </tr>
                </thead>
                <tbody style="font-size: 15px;">
                """),_display_(/*47.18*/for(bookitem <- bookitems) yield /*47.44*/{_display_(Seq[Any](format.raw/*47.45*/("""
                    """),format.raw/*48.21*/("""<tr class="clientRow" >
                        <td class="">"""),_display_(/*49.39*/bookitem/*49.47*/.id),format.raw/*49.50*/("""</td>
                        <td class="">"""),_display_(/*50.39*/bookitem/*50.47*/.number),format.raw/*50.54*/("""</td>
                        <td class="">"""),_display_(/*51.39*/bookitem/*51.47*/.ISBN),format.raw/*51.52*/("""</td>
                        <td class="">"""),_display_(/*52.39*/bookitem/*52.47*/.isComplete),format.raw/*52.58*/("""</td>
                        """),_display_(/*53.26*/if(bookitem.isComplete == true)/*53.57*/{_display_(Seq[Any](format.raw/*53.58*/("""
                            """),format.raw/*54.29*/("""<td class="">
                                <form action=""""),_display_(/*55.48*/routes/*55.54*/.BookItemController.delete(bookitem.id)),format.raw/*55.93*/("""" method="get">
                                    <input type="submit" value="Usuń"/>
                                </form>
                            </td>
                        """)))}),format.raw/*59.26*/("""
                        """),_display_(/*60.26*/if(bookitem.isComplete == false)/*60.58*/{_display_(Seq[Any](format.raw/*60.59*/("""
                            """),format.raw/*61.29*/("""<td class="">------
                            </td>
                        """)))}),format.raw/*63.26*/("""


                    """),format.raw/*66.21*/("""</tr>
                """)))}),format.raw/*67.18*/("""
                """),format.raw/*68.17*/("""</tbody>
            </table>

        </div>



    <style>
        td"""),format.raw/*76.11*/("""{"""),format.raw/*76.12*/("""
            """),format.raw/*77.13*/("""border: solid;
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/("""
        """),format.raw/*79.9*/("""th"""),format.raw/*79.11*/("""{"""),format.raw/*79.12*/("""
            """),format.raw/*80.13*/("""border: solid;
        """),format.raw/*81.9*/("""}"""),format.raw/*81.10*/("""


    """),format.raw/*84.5*/("""</style>
    </div>
""")))}),format.raw/*86.2*/("""
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
                  DATE: 2020-05-17T15:14:15.485
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/bookitem/BookItem.scala.html
                  HASH: 06ebd9a1221d445597a507f71a098431518b8acc
                  MATRIX: 762->1|916->60|946->65|979->90|1018->92|1056->104|1195->216|1210->222|1256->247|1476->440|1491->446|1543->477|1587->494|1602->500|1638->515|1686->535|2681->1503|2723->1529|2762->1530|2812->1552|2902->1615|2919->1623|2943->1626|3015->1671|3032->1679|3060->1686|3132->1731|3149->1739|3175->1744|3247->1789|3264->1797|3296->1808|3355->1840|3395->1871|3434->1872|3492->1902|3581->1964|3596->1970|3656->2009|3878->2200|3932->2227|3973->2259|4012->2260|4070->2290|4182->2371|4236->2397|4291->2421|4337->2439|4444->2518|4473->2519|4515->2533|4566->2557|4595->2558|4632->2568|4662->2570|4691->2571|4733->2585|4784->2609|4813->2610|4850->2620|4903->2643
                  LINES: 21->1|26->1|28->3|28->3|28->3|32->7|35->10|35->10|35->10|42->17|42->17|42->17|43->18|43->18|43->18|45->20|72->47|72->47|72->47|73->48|74->49|74->49|74->49|75->50|75->50|75->50|76->51|76->51|76->51|77->52|77->52|77->52|78->53|78->53|78->53|79->54|80->55|80->55|80->55|84->59|85->60|85->60|85->60|86->61|88->63|91->66|92->67|93->68|101->76|101->76|102->77|103->78|103->78|104->79|104->79|104->79|105->80|106->81|106->81|109->84|111->86
                  -- GENERATED --
              */
          