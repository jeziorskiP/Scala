
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

    <head>
        <title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href='"""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""'>
        <link rel="stylesheet" media="screen" href='"""),_display_(/*16.54*/routes/*16.60*/.Assets.versioned("stylesheets/prism.css")),format.raw/*16.102*/("""'>
        <link rel="shortcut icon" type="image/png" href='"""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""'>
        <script src='"""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*18.70*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("javascripts/prism.js")),format.raw/*19.70*/("""' type="text/javascript"></script>
    </head>

    <body>
        <section id="top">
            <div class="wrapper">
                <img class="resize" src="assets/images/play_icon_reverse.svg" alt="logo" />
                <h1>Biblioteka</h1>
            </div>
        </section>
        """),_display_(/*29.10*/content),format.raw/*29.17*/("""
    """),format.raw/*30.5*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T18:43:19.502
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/main.scala.html
                  HASH: cf915588088fb30ebe678de916cd9e1da7ed53b9
                  MATRIX: 987->261|1112->291|1142->295|1234->360|1260->365|1430->508|1445->514|1508->555|1592->612|1607->618|1671->660|1760->722|1775->728|1836->767|1889->793|1904->799|1966->840|2051->898|2066->904|2128->945|2460->1250|2488->1257|2521->1263
                  LINES: 26->7|31->7|33->9|37->13|37->13|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|53->29|53->29|54->30
                  -- GENERATED --
              */
          