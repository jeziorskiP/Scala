
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

object BBI extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Seq[BorrowerBookItem],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(BBIs: Seq[BorrowerBookItem])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

"""),_display_(/*3.2*/main("Lista BorrowerBookItem")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h3>Boorowersy + ksiazki</h3>
        <div id="exercisesTable">
            <table class="table table-condensed" id="catalogIndexTable">
                <thead>
                    <tr>
                        <td>borrowerId</td>
                        <td>bookItemId</td>
                        <td>startTime</td>
                        <td>completed</td>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*19.22*/for(bbi <- BBIs) yield /*19.38*/{_display_(Seq[Any](format.raw/*19.39*/("""
                        """),format.raw/*20.25*/("""<tr class="clientRow">
                            <td class="">"""),_display_(/*21.43*/bbi/*21.46*/.borrowerId),format.raw/*21.57*/("""</td>
                            <td class="">"""),_display_(/*22.43*/bbi/*22.46*/.bookItemId),format.raw/*22.57*/("""</td>
                            <td class="">"""),_display_(/*23.43*/bbi/*23.46*/.startTime),format.raw/*23.56*/("""</td>
                            <td class="">"""),_display_(/*24.43*/bbi/*24.46*/.completed),format.raw/*24.56*/("""</td>
                            <td class="">
                                <form action=""""),_display_(/*26.48*/routes/*26.54*/.BorrowerBookItemController.delete(bbi.borrowerId, bbi.bookItemId)),format.raw/*26.120*/("""" method="get">
                                    <input type="submit" value="Delete single record"/>
                                </form>


                            </td>
                        </tr>
                    """)))}),format.raw/*33.22*/("""
                """),format.raw/*34.17*/("""</tbody>
            </table>

        </div>

    </div>


    <form method="post" action=""""),_display_(/*42.34*/routes/*42.40*/.BorrowerController.add()),format.raw/*42.65*/("""">
        """),_display_(/*43.10*/helper/*43.16*/.CSRF.formField),format.raw/*43.31*/("""
        """),format.raw/*44.9*/("""<input type="text" name="number"></input>
        <input type="text" name="Name"></input>
        <input type="text" name="Surname"></input>
        <input type="text" name="Address"></input>
        <input type="text" name="Balance"></input>
        <input type="submit"></input>
    </form>


""")))}),format.raw/*53.2*/("""
"""))
      }
    }
  }

  def render(BBIs:Seq[BorrowerBookItem],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(BBIs)(request)

  def f:((Seq[BorrowerBookItem]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (BBIs) => (request) => apply(BBIs)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-15T11:11:12.414
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/BorrowerBookItem/BBI.scala.html
                  HASH: 38302e21d715090d430883e329e005d57ecc9c4c
                  MATRIX: 773->1|930->63|960->68|998->98|1037->100|1073->110|1591->601|1623->617|1662->618|1716->644|1809->710|1821->713|1853->724|1929->773|1941->776|1973->787|2049->836|2061->839|2092->849|2168->898|2180->901|2211->911|2335->1008|2350->1014|2438->1080|2707->1318|2753->1336|2881->1437|2896->1443|2942->1468|2982->1481|2997->1487|3033->1502|3070->1512|3405->1817
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|44->19|44->19|44->19|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|49->24|49->24|49->24|51->26|51->26|51->26|58->33|59->34|67->42|67->42|67->42|68->43|68->43|68->43|69->44|78->53
                  -- GENERATED --
              */
          