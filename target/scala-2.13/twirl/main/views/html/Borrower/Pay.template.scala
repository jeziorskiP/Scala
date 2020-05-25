
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

object Pay extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Option[Borrower],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(borrower: Option[Borrower])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""

"""),_display_(/*3.2*/main("Edycja wypożyczającego")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Zmiana salda</h1>
        </br>
        <form action=""""),_display_(/*9.24*/routes/*9.30*/.BorrowerController.getAll()),format.raw/*9.58*/("""" method="get">
            <input type="submit" value="Powrót"/>
        </form>

        </br>


    <form method="post" action=""""),_display_(/*16.34*/routes/*16.40*/.BorrowerController.update(borrower.head.id)),format.raw/*16.84*/("""">
        """),_display_(/*17.10*/helper/*17.16*/.CSRF.formField),format.raw/*17.31*/("""
        """),format.raw/*18.9*/("""<input type="hidden" name="number" value=""""),_display_(/*18.52*/borrower/*18.60*/.head.number),format.raw/*18.72*/(""""></input>

        <input type="hidden" name="Name" value=""""),_display_(/*20.50*/borrower/*20.58*/.head.Name),format.raw/*20.68*/(""""></input>

        <input type="hidden" name="Surname" value=""""),_display_(/*22.53*/borrower/*22.61*/.head.Surname),format.raw/*22.74*/(""""></input>

        <input type="hidden" name="Address" value=""""),_display_(/*24.53*/borrower/*24.61*/.head.Address),format.raw/*24.74*/(""""></input>



        <label for="Balance">Do zapłaty</label>
        <label for="Balance">"""),_display_(/*29.31*/borrower/*29.39*/.head.Balance),format.raw/*29.52*/("""</label>

        </br>
        <label for="Balance">Po zapłacie</label>
        <input type="text" name="Balance" value=""""),_display_(/*33.51*/borrower/*33.59*/.head.Balance),format.raw/*33.72*/(""""></input>
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

  def render(borrower:Option[Borrower],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(borrower)(request)

  def f:((Option[Borrower]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (borrower) => (request) => apply(borrower)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T15:11:54.410
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/Borrower/Pay.scala.html
                  HASH: 0aec14cc75ce196c54dc3be2aadfadbf7725607c
                  MATRIX: 760->1|916->62|946->67|984->97|1023->99|1059->109|1193->217|1207->223|1255->251|1421->390|1436->396|1501->440|1541->453|1556->459|1592->474|1629->484|1699->527|1716->535|1749->547|1839->610|1856->618|1887->628|1980->694|1997->702|2031->715|2124->781|2141->789|2175->802|2299->899|2316->907|2350->920|2504->1047|2521->1055|2555->1068|2683->1168|2712->1169|2754->1183|2805->1207|2834->1208|2871->1218|2901->1220|2930->1221|2972->1235|3023->1259|3052->1260|3089->1270|3142->1293
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|41->16|41->16|41->16|42->17|42->17|42->17|43->18|43->18|43->18|43->18|45->20|45->20|45->20|47->22|47->22|47->22|49->24|49->24|49->24|54->29|54->29|54->29|58->33|58->33|58->33|64->39|64->39|65->40|66->41|66->41|67->42|67->42|67->42|68->43|69->44|69->44|72->47|74->49
                  -- GENERATED --
              */
          