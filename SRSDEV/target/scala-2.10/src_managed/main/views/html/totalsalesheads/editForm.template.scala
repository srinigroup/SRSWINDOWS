
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[TotalSalesHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, totalSalesHeadForm: Form[TotalSalesHead]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.54*/("""

"""),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""
    
    
    <P class="pull-left" style="padding-left:150px"><h1>Edit TotalSalesHead</h1></P>
    
   """),_display_(Seq[Any](/*12.5*/helper/*12.11*/.form(action = routes.TotalSalesHeads.update(id))/*12.60*/ {_display_(Seq[Any](format.raw/*12.62*/("""     
        <fieldset>
        
           """),_display_(Seq[Any](/*15.13*/helper/*15.19*/.inputText(totalSalesHeadForm("name"), '_label -> "Name"))),format.raw/*15.76*/("""
         	"""),_display_(Seq[Any](/*16.12*/helper/*16.18*/.inputText(totalSalesHeadForm("category"), '_label -> "Category"))),format.raw/*16.83*/("""
         
           
           
        
        </fieldset>
        
        <div class="pull-left" style="padding-left:100px"> 
            <input type="submit" value="Save this TotalSalesHead" class="btn primary"> or 
            <a href=""""),_display_(Seq[Any](/*25.23*/routes/*25.29*/.TotalSalesHeads.list())),format.raw/*25.52*/("""" class="btn">Cancel</a> 
            <a href=""""),_display_(Seq[Any](/*26.23*/routes/*26.29*/.TotalSalesHeads.delete(id))),format.raw/*26.56*/("""" class="btn danger">Delete</a> 
             
        </div>
        
    """)))})),format.raw/*30.6*/("""
    
   
    
""")))})),format.raw/*34.2*/("""
"""))}
    }
    
    def render(id:Long,totalSalesHeadForm:Form[TotalSalesHead]): play.api.templates.HtmlFormat.Appendable = apply(id,totalSalesHeadForm)
    
    def f:((Long,Form[TotalSalesHead]) => play.api.templates.HtmlFormat.Appendable) = (id,totalSalesHeadForm) => apply(id,totalSalesHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/totalsalesheads/editForm.scala.html
                    HASH: e79816957943eada2365490a04a03cb9e187a225
                    MATRIX: 812->1|1008->53|1036->72|1063->107|1100->110|1111->114|1148->115|1288->220|1303->226|1361->275|1401->277|1483->323|1498->329|1577->386|1625->398|1640->404|1727->469|2009->715|2024->721|2069->744|2153->792|2168->798|2217->825|2324->901|2371->917
                    LINES: 26->1|32->1|34->4|34->5|36->7|36->7|36->7|41->12|41->12|41->12|41->12|44->15|44->15|44->15|45->16|45->16|45->16|54->25|54->25|54->25|55->26|55->26|55->26|59->30|63->34
                    -- GENERATED --
                */
            