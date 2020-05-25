
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

object AddBook extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("Dodawanie ksiązki")/*3.27*/ {_display_(Seq[Any](format.raw/*3.29*/("""


    """),format.raw/*6.5*/("""<div id="pn">
        <h1 style="font-size: 40px">Dodawanie książki</h1>
        </br>


    <form method="post" action=""""),_display_(/*11.34*/routes/*11.40*/.BooksController.add()),format.raw/*11.62*/("""">
        """),_display_(/*12.10*/helper/*12.16*/.CSRF.formField),format.raw/*12.31*/("""

        """),format.raw/*14.9*/("""</br>
        <label for="title">Tytuł</label>
        <input type="text" name="title"></input>
        </br>
        <label for="author">Autor</label>
        <input type="text" name="author"></input>
        </br>
        <label for="rokWydania">Rok Wydania</label>
        <input type="text" name="rokWydania"></input>
        </br>
        <label for="ISBN">ISBN</label>
        <input type="text" name="ISBN"></input>
        </br>
        <label for="quantity">Ilość</label>
        <input type="text" name="quantity"></input>
        </br>

        <input type="hidden" name="current" value="0"></input>

        <input type="submit"></input>





    </form>

    <style>
        td"""),format.raw/*42.11*/("""{"""),format.raw/*42.12*/("""
            """),format.raw/*43.13*/("""border: solid;
        """),format.raw/*44.9*/("""}"""),format.raw/*44.10*/("""
        """),format.raw/*45.9*/("""th"""),format.raw/*45.11*/("""{"""),format.raw/*45.12*/("""
            """),format.raw/*46.13*/("""border: solid;
        """),format.raw/*47.9*/("""}"""),format.raw/*47.10*/("""


    """),format.raw/*50.5*/("""</style>
    </div>
""")))}),format.raw/*52.2*/("""
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
                  DATE: 2020-05-17T15:24:56.782
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/books/AddBook.scala.html
                  HASH: c2f2fd430a81f444b76d680a99f774984de26f28
                  MATRIX: 744->1|874->36|904->41|937->66|976->68|1012->78|1166->205|1181->211|1224->233|1264->246|1279->252|1315->267|1354->279|2100->997|2129->998|2171->1012|2222->1036|2251->1037|2288->1047|2318->1049|2347->1050|2389->1064|2440->1088|2469->1089|2506->1099|2559->1122
                  LINES: 21->1|26->1|28->3|28->3|28->3|31->6|36->11|36->11|36->11|37->12|37->12|37->12|39->14|67->42|67->42|68->43|69->44|69->44|70->45|70->45|70->45|71->46|72->47|72->47|75->50|77->52
                  -- GENERATED --
              */
          