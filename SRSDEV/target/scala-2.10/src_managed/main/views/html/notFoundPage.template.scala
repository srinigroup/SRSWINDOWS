
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object notFoundPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>

	<body style="background: url("""),_display_(Seq[Any](/*3.32*/routes/*3.38*/.Assets.at("images/404.jpg"))),format.raw/*3.66*/(""") #5CCAEA;background-repeat:no-repeat;overflow-x:hidden;overflow-y:auto;">
	<div class="wrapper1" >
	</div>
	</body>
</html>"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:04:30 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/notFoundPage.scala.html
                    HASH: 7d2112745674a6491f1c749a3afd5f46a82f9ae2
                    MATRIX: 862->0|938->41|952->47|1001->75
                    LINES: 29->1|31->3|31->3|31->3
                    -- GENERATED --
                */
            