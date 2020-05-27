
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

        <form method="post" action=""""),_display_(/*19.38*/routes/*19.44*/.BookItemController.getByISBN()),format.raw/*19.75*/("""">
            """),_display_(/*20.14*/helper/*20.20*/.CSRF.formField),format.raw/*20.35*/("""

            """),format.raw/*22.13*/("""<input type="hidden" name="book_id" value="0"></input>

            <input type="hidden" name="isComplete" value="false"></input>

            <input type="hidden" name="number" value="0"></input>

            <label for="ISBN">ISBN</label>
            <input type="text" name="ISBN" ></input>

            <input type="submit" value="Szukaj">

        </br>
        </br>     </br>
        </form>




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
                    """),_display_(/*54.22*/for(book <- books) yield /*54.40*/{_display_(Seq[Any](format.raw/*54.41*/("""
                        """),format.raw/*55.25*/("""<tr class="clientRow">
                            <td class="">"""),_display_(/*56.43*/book/*56.47*/.id),format.raw/*56.50*/("""</td>
                            <td class="">"""),_display_(/*57.43*/book/*57.47*/.title),format.raw/*57.53*/("""</td>
                            <td class="">"""),_display_(/*58.43*/book/*58.47*/.author),format.raw/*58.54*/("""</td>
                            <td class="">"""),_display_(/*59.43*/book/*59.47*/.rokWydania),format.raw/*59.58*/("""</td>
                            <td class="">"""),_display_(/*60.43*/book/*60.47*/.ISBN),format.raw/*60.52*/("""</td>
                            <td class="">"""),_display_(/*61.43*/book/*61.47*/.quantity),format.raw/*61.56*/("""</td>
                            <td class="">"""),_display_(/*62.43*/book/*62.47*/.current),format.raw/*62.55*/("""</td>
                            <td class="">
                                <form action=""""),_display_(/*64.48*/routes/*64.54*/.BooksController.delete(book.id)),format.raw/*64.86*/("""" method="get">
                                    <input type="submit" value="Delete single record"/>
                                </form>


                            </td>
                            <td class="">
                                <form action=""""),_display_(/*71.48*/routes/*71.54*/.BookItemController.getAllByBookId(book.id)),format.raw/*71.97*/("""" method="get">
                                    <input type="submit" value="Show"/>
                                </form>


                            </td>
                        </tr>
                    """)))}),format.raw/*78.22*/("""
                """),format.raw/*79.17*/("""</tbody>
            </table>

        </div>

    </div>





    <style>
            td"""),format.raw/*91.15*/("""{"""),format.raw/*91.16*/("""
                """),format.raw/*92.17*/("""border: solid;
            """),format.raw/*93.13*/("""}"""),format.raw/*93.14*/("""
            """),format.raw/*94.13*/("""th"""),format.raw/*94.15*/("""{"""),format.raw/*94.16*/("""
                """),format.raw/*95.17*/("""border: solid;
            """),format.raw/*96.13*/("""}"""),format.raw/*96.14*/("""


    """),format.raw/*99.5*/("""</style>
""")))}),format.raw/*100.2*/("""
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
                  DATE: 2020-05-27T13:49:06.292
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/books/Books.scala.html
                  HASH: 5e4a6d6645bd22f0fa53cb4a7fcca3d898e71b56
                  MATRIX: 752->1|898->52|928->57|954->75|993->77|1029->87|1164->196|1178->202|1219->223|1427->404|1442->410|1489->436|1599->519|1614->525|1666->556|1710->573|1725->579|1761->594|1805->610|2798->1576|2832->1594|2871->1595|2925->1621|3018->1687|3031->1691|3055->1694|3131->1743|3144->1747|3171->1753|3247->1802|3260->1806|3288->1813|3364->1862|3377->1866|3409->1877|3485->1926|3498->1930|3524->1935|3600->1984|3613->1988|3643->1997|3719->2046|3732->2050|3761->2058|3885->2155|3900->2161|3953->2193|4256->2469|4271->2475|4335->2518|4588->2740|4634->2758|4763->2859|4792->2860|4838->2878|4894->2906|4923->2907|4965->2921|4995->2923|5024->2924|5070->2942|5126->2970|5155->2971|5192->2981|5234->2992
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|40->15|40->15|40->15|44->19|44->19|44->19|45->20|45->20|45->20|47->22|79->54|79->54|79->54|80->55|81->56|81->56|81->56|82->57|82->57|82->57|83->58|83->58|83->58|84->59|84->59|84->59|85->60|85->60|85->60|86->61|86->61|86->61|87->62|87->62|87->62|89->64|89->64|89->64|96->71|96->71|96->71|103->78|104->79|116->91|116->91|117->92|118->93|118->93|119->94|119->94|119->94|120->95|121->96|121->96|124->99|125->100
                  -- GENERATED --
              */
          