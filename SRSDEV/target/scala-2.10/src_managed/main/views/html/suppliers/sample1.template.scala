
package views.html.suppliers

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
object sample1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Supplier],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(supplierForm: Form[Supplier]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.32*/("""

 """),format.raw/*4.1*/(""" """),_display_(Seq[Any](/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
  <h1>Company form</h1>
"""),_display_(Seq[Any](/*7.2*/helper/*7.8*/.form(action = routes.Suppliers.save())/*7.47*/ {_display_(Seq[Any](format.raw/*7.49*/("""
    <fieldset> 
         <legend> New Supplier</legend>    
	
    """),_display_(Seq[Any](/*11.6*/helper/*11.12*/.inputText(supplierForm("name")))),format.raw/*11.44*/("""      
	"""),_display_(Seq[Any](/*12.3*/helper/*12.9*/.textarea(supplierForm("description")))),format.raw/*12.47*/("""    
</fieldset>    
<input type="submit" class="btn primary">  
<a href=""""),_display_(Seq[Any](/*15.11*/routes/*15.17*/.Suppliers.list())),format.raw/*15.34*/("""" class="btn">Cancel</a> 
""")))})),format.raw/*16.2*/("""
""")))})))}
    }
    
    def render(supplierForm:Form[Supplier]): play.api.templates.HtmlFormat.Appendable = apply(supplierForm)
    
    def f:((Form[Supplier]) => play.api.templates.HtmlFormat.Appendable) = (supplierForm) => apply(supplierForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/suppliers/sample1.scala.html
                    HASH: 00b366e754438d8b7ea5f8559ba7eb79352184cb
                    MATRIX: 794->1|969->31|998->52|1034->88|1045->92|1082->93|1142->119|1155->125|1202->164|1241->166|1344->234|1359->240|1413->272|1457->281|1471->287|1531->325|1642->400|1657->406|1696->423|1754->450
                    LINES: 26->1|32->1|34->4|34->5|34->5|34->5|36->7|36->7|36->7|36->7|40->11|40->11|40->11|41->12|41->12|41->12|44->15|44->15|44->15|45->16
                    -- GENERATED --
                */
            