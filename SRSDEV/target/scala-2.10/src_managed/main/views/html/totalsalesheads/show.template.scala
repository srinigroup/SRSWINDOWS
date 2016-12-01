
package views.html.totalsalesheads

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[TotalSalesHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(totalSalesHeadForm: Form[TotalSalesHead] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.45*/("""

 """),format.raw/*4.1*/(""" """),_display_(Seq[Any](/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
 
"""),_display_(Seq[Any](/*7.2*/helper/*7.8*/.form(action = routes.TotalSalesHeads.save())/*7.53*/ {_display_(Seq[Any](format.raw/*7.55*/("""

    <fieldset> 
         <legend> New TotalSalesHead</legend>    
			"""),_display_(Seq[Any](/*11.5*/helper/*11.11*/.inputText(totalSalesHeadForm("name"), '_label -> "Name"))),format.raw/*11.68*/("""
         	"""),_display_(Seq[Any](/*12.12*/helper/*12.18*/.inputText(totalSalesHeadForm("category"), '_label -> "Category"))),format.raw/*12.83*/("""
         	
	  
</fieldset>    
<div class="pull-left" style="padding-left:180px">  <input type="submit" class="btn primary"/>  
<a href=""""),_display_(Seq[Any](/*17.11*/routes/*17.17*/.TotalSalesHeads.list())),format.raw/*17.40*/("""" class="btn">Cancel</a> 
</div>

""")))})),format.raw/*20.2*/("""
""")))})))}
    }
    
    def render(totalSalesHeadForm:Form[TotalSalesHead]): play.api.templates.HtmlFormat.Appendable = apply(totalSalesHeadForm)
    
    def f:((Form[TotalSalesHead]) => play.api.templates.HtmlFormat.Appendable) = (totalSalesHeadForm) => apply(totalSalesHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/totalsalesheads/show.scala.html
                    HASH: e6ab51c3394c75bbc0a4ccf7558ceefe743634b9
                    MATRIX: 803->1|993->44|1024->68|1060->105|1071->109|1108->110|1148->116|1161->122|1214->167|1253->169|1364->245|1379->251|1458->308|1507->321|1522->327|1609->392|1789->536|1804->542|1849->565|1918->603
                    LINES: 26->1|32->1|34->4|34->5|34->5|34->5|36->7|36->7|36->7|36->7|40->11|40->11|40->11|41->12|41->12|41->12|46->17|46->17|46->17|49->20
                    -- GENERATED --
                */
            