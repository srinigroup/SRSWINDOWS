
package views.html.invoiceInventory

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
object invoiceListPageForJustView extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Invoice],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(invoiceList : List[Invoice]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/currentDateFormat/*3.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*11.2*/("""

"""),_display_(Seq[Any](/*13.2*/main/*13.6*/ {_display_(Seq[Any](format.raw/*13.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*21.24*/routes/*21.30*/.Application.index())),format.raw/*21.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.InvoiceInventory.showUploadPage())),format.raw/*22.67*/("""" class="btn btn-default">INVOICE</a>
            				<a href="#" class="btn btn-default">LIST</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*28.27*/routes/*28.33*/.InvoiceInventory.showUploadPage())),format.raw/*28.67*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*37.6*/if(flash.containsKey("success"))/*37.38*/ {_display_(Seq[Any](format.raw/*37.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*39.37*/flash/*39.42*/.get("success"))),format.raw/*39.57*/("""
        </div>
    """)))})),format.raw/*41.6*/(""" 

    
    """),_display_(Seq[Any](/*44.6*/if(invoiceList.size() == 0)/*44.33*/ {_display_(Seq[Any](format.raw/*44.35*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*50.7*/else/*50.12*/{_display_(Seq[Any](format.raw/*50.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    <th>File Name</th>
                    
                    <th>Uploaded Date</th>
                    
                    <th>InvoiceType</th>
                    
                    <th>Store</th>
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*67.18*/for(invoice <- invoiceList) yield /*67.45*/ {_display_(Seq[Any](format.raw/*67.47*/("""
                    <tr>
                        """),format.raw/*69.208*/("""
                        <td><a href=""""),_display_(Seq[Any](/*70.39*/routes/*70.45*/.Application.checkUrl(invoice.filePath))),format.raw/*70.84*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*70.114*/invoice/*70.121*/.fileName)),format.raw/*70.130*/("""" onclick="OpenFancyBoxForJustView('"""),_display_(Seq[Any](/*70.167*/invoice/*70.174*/.id)),format.raw/*70.177*/("""');">"""),_display_(Seq[Any](/*70.183*/invoice/*70.190*/.fileName)),format.raw/*70.199*/("""</a></td>
                        <td>"""),_display_(Seq[Any](/*71.30*/invoice/*71.37*/.uploadedDate)),format.raw/*71.50*/("""</td>
                        <td>"""),_display_(Seq[Any](/*72.30*/invoice/*72.37*/.invoiceType)),format.raw/*72.49*/("""</td>
                        <td>"""),_display_(Seq[Any](/*73.30*/Store/*73.35*/.find.byId(invoice.storeId))),format.raw/*73.62*/("""</td>
                    </tr>
                """)))})),format.raw/*75.18*/("""

            </tbody>
         </table>
       </div>
        
    """)))})),format.raw/*81.6*/("""
    
     </div>
    </div>
   				
""")))})),format.raw/*86.2*/("""

            """))}
    }
    
    def render(invoiceList:List[Invoice]): play.api.templates.HtmlFormat.Appendable = apply(invoiceList)
    
    def f:((List[Invoice]) => play.api.templates.HtmlFormat.Appendable) = (invoiceList) => apply(invoiceList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 14:59:53 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/invoiceListPageForJustView.scala.html
                    HASH: 7b6f32b8fe05b484d3400dc6924ba74d46d4bcbe
                    MATRIX: 819->1|925->35|950->52|1168->30|1199->240|1239->245|1251->249|1290->251|1568->493|1583->499|1625->519|1744->602|1759->608|1815->642|2109->900|2124->906|2180->940|2397->1122|2438->1154|2478->1156|2595->1237|2609->1242|2646->1257|2700->1280|2751->1296|2787->1323|2827->1325|2957->1438|2970->1443|3009->1444|3593->1992|3636->2019|3676->2021|3757->2256|3833->2296|3848->2302|3909->2341|3976->2371|3993->2378|4025->2387|4099->2424|4116->2431|4142->2434|4185->2440|4202->2447|4234->2456|4310->2496|4326->2503|4361->2516|4433->2552|4449->2559|4483->2571|4555->2607|4569->2612|4618->2639|4701->2690|4807->2765|4881->2808
                    LINES: 26->1|28->3|28->3|37->1|39->11|41->13|41->13|41->13|49->21|49->21|49->21|50->22|50->22|50->22|56->28|56->28|56->28|65->37|65->37|65->37|67->39|67->39|67->39|69->41|72->44|72->44|72->44|78->50|78->50|78->50|95->67|95->67|95->67|97->69|98->70|98->70|98->70|98->70|98->70|98->70|98->70|98->70|98->70|98->70|98->70|98->70|99->71|99->71|99->71|100->72|100->72|100->72|101->73|101->73|101->73|103->75|109->81|114->86
                    -- GENERATED --
                */
            