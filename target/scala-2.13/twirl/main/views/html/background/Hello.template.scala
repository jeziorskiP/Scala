
package views.html.background

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

object Hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Hello")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""


   """),format.raw/*6.4*/("""<div style="width: 100%">
       <div style="width: 100%; height: 100px"></div>
       <div style="width: 100%;">
           <div style="font-size: 25px; padding-left: 25px">
               <a class="btn btn-success" href=""""),_display_(/*10.50*/routes/*10.56*/.BorrowerController.getAll()),format.raw/*10.84*/("""">Wyświetl wypożyczających/Dodaj wypożyczenie</a>
               </br>
               <a class="btn btn-success" href=""""),_display_(/*12.50*/routes/*12.56*/.BooksController.getAll()),format.raw/*12.81*/("""">Wyświetl ksiązki</a>
               </br>
               <a class="btn btn-success" href=""""),_display_(/*14.50*/routes/*14.56*/.BookItemController.getAll()),format.raw/*14.84*/("""">Wyświetl egzemplarze</a>
               </br>
               <a class="btn btn-success" href=""""),_display_(/*16.50*/routes/*16.56*/.BorrowerBookItemController.getAll2()),format.raw/*16.93*/("""">Wyświetl wypożyczenia</a>
           </div>
       </div>
   </div>
""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-05-17T18:42:14.910
                  SOURCE: D:/Sources/Test2/play-samples-play-scala-hello-world-tutorial/app/views/background/Hello.scala.html
                  HASH: 68b544ecc8e876b47964eaf6c3f7c90e8c535812
                  MATRIX: 822->5|843->18|882->20|917->29|1172->257|1187->263|1236->291|1385->413|1400->419|1446->444|1568->539|1583->545|1632->573|1758->672|1773->678|1831->715|1936->790
                  LINES: 26->3|26->3|26->3|29->6|33->10|33->10|33->10|35->12|35->12|35->12|37->14|37->14|37->14|39->16|39->16|39->16|43->20
                  -- GENERATED --
              */
          