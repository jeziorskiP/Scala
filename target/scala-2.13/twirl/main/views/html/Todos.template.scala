
package views.html

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

object Todos extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[Todo],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(todos: Seq[Todo])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/main("Lista Todo")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h3>Zadania</h3>
        <div id="exercisesTable">
            <table class="table table-condensed" id="catalogIndexTable">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>Nazwa</td>
                        <td>Status</td>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*18.22*/for(todo <- todos) yield /*18.40*/{_display_(Seq[Any](format.raw/*18.41*/("""
                        """),format.raw/*19.25*/("""<tr class="clientRow">
                            <td class="">"""),_display_(/*20.43*/todo/*20.47*/.id),format.raw/*20.50*/("""</td>
                            <td class="">"""),_display_(/*21.43*/todo/*21.47*/.name),format.raw/*21.52*/("""</td>
                            <td class="">"""),_display_(/*22.43*/todo/*22.47*/.isComplete),format.raw/*22.58*/("""</td>
                            <td class="">
                                <form action=""""),_display_(/*24.48*/routes/*24.54*/.TodoController.delete(todo.id)),format.raw/*24.85*/("""" method="get">
                                    <input type="submit" value="Delete single record"/>
                                </form>


                            </td>
                        </tr>
                    """)))}),format.raw/*31.22*/("""
                """),format.raw/*32.17*/("""</tbody>
            </table>

        </div>

    </div>


    <form method="post" action=""""),_display_(/*40.34*/routes/*40.40*/.TodoController.add()),format.raw/*40.61*/("""">
        """),_display_(/*41.10*/helper/*41.16*/.CSRF.formField),format.raw/*41.31*/("""
        """),format.raw/*42.9*/("""<input type="text" name="name"></input>
        <input type="text" name="isComplete"></input>
        <input type="submit"></input>
    </form>


""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(todos:Seq[Todo],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(todos)(request)

  def f:((Seq[Todo]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (todos) => (request) => apply(todos)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-14T10:25:40.689
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/Todos.scala.html
                  HASH: 9db56a4bef511981190d00fb8688167d4b2a148e
                  MATRIX: 746->1|892->52|922->57|948->75|987->77|1023->87|1468->505|1502->523|1541->524|1595->550|1688->616|1701->620|1725->623|1801->672|1814->676|1840->681|1916->730|1929->734|1961->745|2085->842|2100->848|2152->879|2421->1117|2467->1135|2595->1236|2610->1242|2652->1263|2692->1276|2707->1282|2743->1297|2780->1307|2963->1460
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|43->18|43->18|43->18|44->19|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|49->24|49->24|49->24|56->31|57->32|65->40|65->40|65->40|66->41|66->41|66->41|67->42|73->48
                  -- GENERATED --
              */
          