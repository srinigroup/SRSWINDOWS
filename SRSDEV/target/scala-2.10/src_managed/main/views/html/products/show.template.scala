
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Product],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(productForm: Form[Product]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.30*/("""
 """),format.raw/*3.1*/(""" """),_display_(Seq[Any](/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
  <h1>Product form</h1>
"""),_display_(Seq[Any](/*6.2*/helper/*6.8*/.form(action = routes.Products.save())/*6.46*/ {_display_(Seq[Any](format.raw/*6.48*/("""
    <fieldset> 
         <legend> New Product</legend>    
	"""),_display_(Seq[Any](/*9.3*/helper/*9.9*/.inputText(productForm("ean")))),format.raw/*9.39*/(""" 
    """),_display_(Seq[Any](/*10.6*/helper/*10.12*/.inputText(productForm("name")))),format.raw/*10.43*/("""      
	"""),_display_(Seq[Any](/*11.3*/helper/*11.9*/.textarea(productForm("description")))),format.raw/*11.46*/("""    
</fieldset>    
<input type="submit" class="btn primary">  
<a href=""""),_display_(Seq[Any](/*14.11*/routes/*14.17*/.Products.list())),format.raw/*14.33*/("""" class="btn">Cancel</a> 
""")))})),format.raw/*15.2*/("""
""")))})))}
    }
    
    def render(productForm:Form[Product]): play.api.templates.HtmlFormat.Appendable = apply(productForm)
    
    def f:((Form[Product]) => play.api.templates.HtmlFormat.Appendable) = (productForm) => apply(productForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/products/show.scala.html
                    HASH: 3afda56edfa9ad29feed8cf693b9473c915f03cd
                    MATRIX: 789->1|964->29|993->51|1029->88|1040->92|1077->93|1139->121|1152->127|1198->165|1237->167|1336->232|1349->238|1400->268|1443->276|1458->282|1511->313|1556->323|1570->329|1629->366|1743->444|1758->450|1796->466|1855->494
                    LINES: 26->1|32->1|33->3|33->4|33->4|33->4|35->6|35->6|35->6|35->6|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|43->14|43->14|43->14|44->15
                    -- GENERATED --
                */
            