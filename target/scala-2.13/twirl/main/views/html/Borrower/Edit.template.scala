
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

object Edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Option[Borrower],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(borrower: Option[Borrower])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""

"""),_display_(/*3.2*/main("Edycja wypożyczającego")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Edycja wypożyczającego</h1>
        </br>
        <form action=""""),_display_(/*9.24*/routes/*9.30*/.BorrowerController.getAll()),format.raw/*9.58*/("""" method="get">
            <input type="submit" value="Powrót"/>
        </form>

        </br>


    <form method="post" action=""""),_display_(/*16.34*/routes/*16.40*/.BorrowerController.update(borrower.head.id)),format.raw/*16.84*/("""">
        """),_display_(/*17.10*/helper/*17.16*/.CSRF.formField),format.raw/*17.31*/("""

    """),format.raw/*19.5*/("""<label for="number"> number</label>

        <input type="text" name="number" value=""""),_display_(/*21.50*/borrower/*21.58*/.head.number),format.raw/*21.70*/("""" disabled></input>
        </br>
        <label for="Name">Name</label>
        <input type="text" name="Name" value=""""),_display_(/*24.48*/borrower/*24.56*/.head.Name),format.raw/*24.66*/(""""></input>
        </br>
        <label for="Surname">Surname</label>
        <input type="text" name="Surname" value=""""),_display_(/*27.51*/borrower/*27.59*/.head.Surname),format.raw/*27.72*/(""""></input>
        </br>
        <label for="Address">Address</label>
        <input type="text" name="Address" value=""""),_display_(/*30.51*/borrower/*30.59*/.head.Address),format.raw/*30.72*/(""""></input>
        </br>
        <label for="Balance">Balance </label>
        <input type="text" name="Balance" value=""""),_display_(/*33.51*/borrower/*33.59*/.head.Balance),format.raw/*33.72*/("""" ></input>
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
                  DATE: 2020-05-17T15:11:08.400
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/Borrower/Edit.scala.html
                  HASH: a9cd29f1962fdc7ef48e778101b6fed1ecdaa0fa
                  MATRIX: 761->1|917->62|947->67|985->97|1024->99|1060->109|1204->227|1218->233|1266->261|1432->400|1447->406|1512->450|1552->463|1567->469|1603->484|1638->492|1753->580|1770->588|1803->600|1953->723|1970->731|2001->741|2151->864|2168->872|2202->885|2352->1008|2369->1016|2403->1029|2554->1153|2571->1161|2605->1174|2738->1279|2767->1280|2809->1294|2860->1318|2889->1319|2926->1329|2956->1331|2985->1332|3027->1346|3078->1370|3107->1371|3144->1381|3197->1404
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|34->9|34->9|34->9|41->16|41->16|41->16|42->17|42->17|42->17|44->19|46->21|46->21|46->21|49->24|49->24|49->24|52->27|52->27|52->27|55->30|55->30|55->30|58->33|58->33|58->33|64->39|64->39|65->40|66->41|66->41|67->42|67->42|67->42|68->43|69->44|69->44|72->47|74->49
                  -- GENERATED --
              */
          