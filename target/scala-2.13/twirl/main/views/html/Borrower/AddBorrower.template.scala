
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

object AddBorrower extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Dodawanie wypożyczającego")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Dodawanie wypożyczającego</h1>
        </br>


    <form method="post" action=""""),_display_(/*11.34*/routes/*11.40*/.BorrowerController.add()),format.raw/*11.65*/("""">
        """),_display_(/*12.10*/helper/*12.16*/.CSRF.formField),format.raw/*12.31*/("""


        """),format.raw/*15.9*/("""<input type="hidden" name="number" value="0" ></input>
        </br>
        <label for="Name">Imię</label>
        <input type="text" name="Name""></input>
        </br>
        <label for="Surname">Nazwisko</label>
        <input type="text" name="Surname"></input>
        </br>
        <label for="Address">Adres</label>
        <input type="text" name="Address"></input>
        </br>
        <input type="hidden" name="Balance" value="0.00"></input>
        </br>
        <input type="submit"></input>
    </form>

    <style>
        td"""),format.raw/*32.11*/("""{"""),format.raw/*32.12*/("""
            """),format.raw/*33.13*/("""border: solid;
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""th"""),format.raw/*35.11*/("""{"""),format.raw/*35.12*/("""
            """),format.raw/*36.13*/("""border: solid;
        """),format.raw/*37.9*/("""}"""),format.raw/*37.10*/("""


    """),format.raw/*40.5*/("""</style>
    </div>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T18:18:43.609
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/Borrower/AddBorrower.scala.html
                  HASH: 2dcbc67b639faccbcdce2e52def831c503087a83
                  MATRIX: 751->1|881->36|911->41|952->74|991->76|1027->86|1189->221|1204->227|1250->252|1290->265|1305->271|1341->286|1382->300|1970->860|1999->861|2041->875|2092->899|2121->900|2158->910|2188->912|2217->913|2259->927|2310->951|2339->952|2376->962|2429->985
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|36->11|36->11|36->11|37->12|37->12|37->12|40->15|57->32|57->32|58->33|59->34|59->34|60->35|60->35|60->35|61->36|62->37|62->37|65->40|67->42
                  -- GENERATED --
              */
          