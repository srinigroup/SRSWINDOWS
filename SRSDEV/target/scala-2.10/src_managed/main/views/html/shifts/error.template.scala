
package views.html.shifts

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
object error extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""

	
        <div class="alert-message warning">
            <strong>Error!</strong> <h2>"""),_display_(Seq[Any](/*11.42*/msg)),format.raw/*11.45*/("""</h2>
        </div>

	
	
	
<p class="accnav">


<a href=""""),_display_(Seq[Any](/*20.11*/routes/*20.17*/.Shifts.list())),format.raw/*20.31*/("""" class="btn primary">Go Back</a> 
 </p>	
""")))})))}
    }
    
    def render(msg:String): play.api.templates.HtmlFormat.Appendable = apply(msg)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (msg) => apply(msg)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/shifts/error.scala.html
                    HASH: 12c5a4d48edca948c339fd379917454b3d8dfbe8
                    MATRIX: 781->1|939->14|967->68|1004->71|1015->75|1052->76|1177->165|1202->168|1297->227|1312->233|1348->247
                    LINES: 26->1|32->1|34->5|36->7|36->7|36->7|40->11|40->11|49->20|49->20|49->20
                    -- GENERATED --
                */
            