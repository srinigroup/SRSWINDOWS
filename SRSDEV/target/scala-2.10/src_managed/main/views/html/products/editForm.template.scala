
package views.html.products

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Product],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, productForm: Form[Product]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.40*/("""

"""),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""
    
    <h1>Edit Product</h1>
    
    
   """),_display_(Seq[Any](/*12.5*/helper/*12.11*/.form(action = routes.Products.update(id))/*12.53*/ {_display_(Seq[Any](format.raw/*12.55*/("""     
        <fieldset>
        
            """),_display_(Seq[Any](/*15.14*/helper/*15.20*/.inputText(productForm("ean"), '_label -> "Product EAN"))),format.raw/*15.76*/("""
            """),_display_(Seq[Any](/*16.14*/helper/*16.20*/.inputText(productForm("name"), '_label -> "Product name"))),format.raw/*16.78*/("""
            """),_display_(Seq[Any](/*17.14*/helper/*17.20*/.inputText(productForm("description"), '_label -> "Product description"))),format.raw/*17.92*/("""
            
           
        
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save this Product" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.Products.list())),format.raw/*25.45*/("""" class="btn">Cancel</a> 
            <a href=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.Products.delete(id))),format.raw/*26.49*/("""" class="btn danger">Delete</a> 
             
        </div>
        
    """)))})),format.raw/*30.6*/("""
    
   
    
""")))})),format.raw/*34.2*/("""
"""))}
    }
    
    def render(id:Long,productForm:Form[Product]): play.api.templates.HtmlFormat.Appendable = apply(id,productForm)
    
    def f:((Long,Form[Product]) => play.api.templates.HtmlFormat.Appendable) = (id,productForm) => apply(id,productForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/products/editForm.scala.html
                    HASH: a600e72e36e13edd108b8e3dc9809d326cc543fa
                    MATRIX: 798->1|980->39|1008->58|1035->93|1072->96|1083->100|1120->101|1201->147|1216->153|1267->195|1307->197|1390->244|1405->250|1483->306|1533->320|1548->326|1628->384|1678->398|1693->404|1787->476|2023->676|2038->682|2076->698|2160->746|2175->752|2217->772|2324->848|2371->864
                    LINES: 26->1|32->1|34->4|34->5|36->7|36->7|36->7|41->12|41->12|41->12|41->12|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|54->25|54->25|54->25|55->26|55->26|55->26|59->30|63->34
                    -- GENERATED --
                */
            