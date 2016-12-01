
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
object home_ac extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main/*1.7*/{_display_(Seq[Any](format.raw/*1.8*/("""
 <style>
.img-responsive """),format.raw/*3.17*/("""{"""),format.raw/*3.18*/("""
    width: 60px;
"""),format.raw/*5.1*/("""}"""),format.raw/*5.2*/("""

</style>
           
        <div class="wrapper">
            <div class="container">
                <div class="row">
                    <div class="span12">
                        
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                     <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>REPORTS</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*21.48*/routes/*21.54*/.Reports.getReportHome())),format.raw/*21.78*/(""""><img src=""""),_display_(Seq[Any](/*21.91*/routes/*21.97*/.Assets.at("images/tabImages/saleesreconcilation.jpg"))),format.raw/*21.151*/("""" class="img-responsive center-block" alt="Image">
			                                        <p class="text-muted"> Reports Generation</p>
			                                   		 </a>
	                                     		</div>
										      </div> 
										   </div>
										 
	                                     <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>TIMESHEET</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*32.52*/routes/*32.58*/.Timesheets.showSelectPage())),format.raw/*32.86*/(""""><img src=""""),_display_(Seq[Any](/*32.99*/routes/*32.105*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*32.149*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">Timesheet Processing</p>
				                                     </a>
	                                     		</div>
										   </div> 
										  </div>
										   <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>MONTHLY REPORTS</b></div>
                                				<div class="panel-body">
				                                  	<a href=""""),_display_(Seq[Any](/*42.50*/routes/*42.56*/.MonthlyReports.viewUploadedReports())),format.raw/*42.93*/(""""><img src=""""),_display_(Seq[Any](/*42.106*/routes/*42.112*/.Assets.at("images/tabImages/mreports1.png"))),format.raw/*42.156*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">View Monthly Reports</p>
				                                   	</a>  
	                                     		</div>
										   </div> 
										  </div>
                                   		    <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success">
									        	<div class="panel-heading" style="word-break:break-all;"><b>RECONCILATION</b></div>
                                					<div class="panel-body">
													 <a href=""""),_display_(Seq[Any](/*52.25*/routes/*52.31*/.DailyReconciliations.drViewOptions(0,"reportingBusinessDate","desc","SUBMITTED","VIEW"))),format.raw/*52.119*/(""""><img src=""""),_display_(Seq[Any](/*52.132*/routes/*52.138*/.Assets.at("images/tabImages/mrep.png"))),format.raw/*52.177*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted"> Monitor Reconciliation</p>
				                                   	</a>
                                    
				                                    </div>
										      </div> 
										   </div>
                                   
                            	</div>
                        	</div>
                        </div>  <!-- content -->
                                  
                        
                       <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	 <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>INVOICE INVENTORY</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*72.48*/routes/*72.54*/.InvoiceInventory.showDownloadPage())),format.raw/*72.90*/(""""><img src=""""),_display_(Seq[Any](/*72.103*/routes/*72.109*/.Assets.at("images/tabImages/invoicedownload.jpg"))),format.raw/*72.159*/("""" class="img-responsive center-block" alt="Image">
			                                        <p class="text-muted"> Invoice Processing </p>
			                                   		 </a>
	                                     		</div>
										      </div> 
										   </div>
										 
	                                     <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>INVOICE UPLOAD</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*83.52*/routes/*83.58*/.InvoiceInventory.showUploadPageForHeadOffice())),format.raw/*83.105*/(""""><img src=""""),_display_(Seq[Any](/*83.118*/routes/*83.124*/.Assets.at("images/tabImages/filemoved.ico"))),format.raw/*83.168*/("""" class="img-responsive center-block" alt="Image">
				                                         <p class="text-muted"> Upload By Head Office</p>
				                                     </a>
	                                     		</div>
										   </div> 
										  </div>
										   <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>INVOICE PAYMENT</b></div>
                                				<div class="panel-body">
				                                  	 <a href=""""),_display_(Seq[Any](/*93.51*/routes/*93.57*/.InvoiceInventory.showPaymentPage("noCompany","noStore","noCategory","noPaymentTerm"))),format.raw/*93.142*/(""""><img src=""""),_display_(Seq[Any](/*93.155*/routes/*93.161*/.Assets.at("images/tabImages/payment.jpg"))),format.raw/*93.203*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">Payments Done Here</p>
				                                   	</a>  
	                                     		</div>
										   </div> 
										  </div>
                                   		    <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success">
									        	<div class="panel-heading"><b>SUPPLIER</b></div>
                                					<div class="panel-body">
													 <a href=""""),_display_(Seq[Any](/*103.25*/routes/*103.31*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*103.73*/(""""><img src=""""),_display_(Seq[Any](/*103.86*/routes/*103.92*/.Assets.at("images/tabImages/supp.png"))),format.raw/*103.131*/("""" class="img-responsive center-block" alt="Image">
														<p class="text-muted">Supplier</p>	
													</a>
                                    
				                                    </div>
										      </div> 
										   </div>
                                   
                                </div>
                           </div>
                       </div> <!-- content -->
             
                                               
				        <div class="footer">
				          <hr/>   
				            <div class="container">
				               <p  class="pull-right"> <b class="copyright">&copy; 2014 SRINI Group &nbsp;</b>All rights reserved.</p>
				            </div> <!-- container -->
				        </div> <!-- footer -->
          </div> <!-- content -->
                 
       				</div> <!-- span 12 -->
        		</div> <!-- row -->
      		</div> <!-- container -->
     	</div> <!-- wrapper -->
	
""")))})),format.raw/*129.2*/("""

 
                                """))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:01 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_ac.scala.html
                    HASH: eb5f5eb9cbebda6e35230c342aa0103e667b1922
                    MATRIX: 866->2|877->6|914->7|967->33|995->34|1039->52|1066->53|1751->702|1766->708|1812->732|1861->745|1876->751|1953->805|2576->1392|2591->1398|2641->1426|2690->1439|2706->1445|2773->1489|3361->2041|3376->2047|3435->2084|3485->2097|3501->2103|3568->2147|4191->2734|4206->2740|4317->2828|4367->2841|4383->2847|4445->2886|5478->3883|5493->3889|5551->3925|5601->3938|5617->3944|5690->3994|6319->4587|6334->4593|6404->4640|6454->4653|6470->4659|6537->4703|7129->5259|7144->5265|7252->5350|7302->5363|7318->5369|7383->5411|7970->5961|7986->5967|8051->6009|8101->6022|8117->6028|8180->6067|9157->7012
                    LINES: 29->1|29->1|29->1|31->3|31->3|33->5|33->5|49->21|49->21|49->21|49->21|49->21|49->21|60->32|60->32|60->32|60->32|60->32|60->32|70->42|70->42|70->42|70->42|70->42|70->42|80->52|80->52|80->52|80->52|80->52|80->52|100->72|100->72|100->72|100->72|100->72|100->72|111->83|111->83|111->83|111->83|111->83|111->83|121->93|121->93|121->93|121->93|121->93|121->93|131->103|131->103|131->103|131->103|131->103|131->103|157->129
                    -- GENERATED --
                */
            