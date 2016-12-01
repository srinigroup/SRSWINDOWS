
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
object home_headOffice_accountant extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main/*1.7*/{_display_(Seq[Any](format.raw/*1.8*/(""" 
 
  <style>
.img-responsive """),format.raw/*4.17*/("""{"""),format.raw/*4.18*/("""
    width: 60px;
"""),format.raw/*6.1*/("""}"""),format.raw/*6.2*/("""
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
			                                		<a href=""""),_display_(Seq[Any](/*20.48*/routes/*20.54*/.Reports.getReportHome())),format.raw/*20.78*/(""""><img src=""""),_display_(Seq[Any](/*20.91*/routes/*20.97*/.Assets.at("images/tabImages/saleesreconcilation.jpg"))),format.raw/*20.151*/("""" class="img-responsive center-block" alt="Image">
			                                        <p class="text-muted"> Reports Generation</p>
			                                   		 </a>
	                                     		</div>
										      </div> 
										   </div>
										 
	                                     <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>TIMESHEET</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*31.52*/routes/*31.58*/.Timesheets.showSelectPage())),format.raw/*31.86*/(""""><img src=""""),_display_(Seq[Any](/*31.99*/routes/*31.105*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*31.149*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">Timesheet Processing</p>
				                                     </a>
	                                     		</div>
										   </div> 
										  </div>
										   <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>MONTHLY REPORTS</b></div>
                                				<div class="panel-body">
				                                  	<a href=""""),_display_(Seq[Any](/*41.50*/routes/*41.56*/.MonthlyReports.viewUploadedReports())),format.raw/*41.93*/(""""><img src=""""),_display_(Seq[Any](/*41.106*/routes/*41.112*/.Assets.at("images/tabImages/mreports1.png"))),format.raw/*41.156*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">View Monthly Reports</p>
				                                   	</a>  
	                                     		</div>
										   </div> 
										  </div>
                                   		    <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success">
									        	<div class="panel-heading" style="word-break:break-all;"><b>RECONCILATION</b></div>
                                					<div class="panel-body">
													 <a href=""""),_display_(Seq[Any](/*51.25*/routes/*51.31*/.DailyReconciliations.drViewOptions(0,"reportingBusinessDate","desc","SUBMITTED","VIEW"))),format.raw/*51.119*/(""""><img src=""""),_display_(Seq[Any](/*51.132*/routes/*51.138*/.Assets.at("images/tabImages/mrep.png"))),format.raw/*51.177*/("""" class="img-responsive center-block" alt="Image">
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
			                                		<a href=""""),_display_(Seq[Any](/*71.48*/routes/*71.54*/.InvoiceInventory.showDownloadPage())),format.raw/*71.90*/(""""><img src=""""),_display_(Seq[Any](/*71.103*/routes/*71.109*/.Assets.at("images/tabImages/invoicedownload.jpg"))),format.raw/*71.159*/("""" class="img-responsive center-block" alt="Image">
			                                        <p class="text-muted"> Invoice Processing </p>
			                                   		 </a>
	                                     		</div>
										      </div> 
										   </div>
										 
	                                     <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>INVOICE UPLOAD</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*82.52*/routes/*82.58*/.InvoiceInventory.showUploadPageForHeadOffice())),format.raw/*82.105*/(""""><img src=""""),_display_(Seq[Any](/*82.118*/routes/*82.124*/.Assets.at("images/tabImages/filemoved.ico"))),format.raw/*82.168*/("""" class="img-responsive center-block" alt="Image">
				                                         <p class="text-muted"> Upload By Head Office</p>
				                                     </a>
	                                     		</div>
										   </div> 
										  </div>
										   <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>INVOICE PAYMENT</b></div>
                                				<div class="panel-body">
				                                  	 <a href=""""),_display_(Seq[Any](/*92.51*/routes/*92.57*/.InvoiceInventory.showPaymentPage("noCompany","noStore","noCategory","noPaymentTerm"))),format.raw/*92.142*/(""""><img src=""""),_display_(Seq[Any](/*92.155*/routes/*92.161*/.Assets.at("images/tabImages/payment.jpg"))),format.raw/*92.203*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">Payments Done Here</p>
				                                   	</a>  
	                                     		</div>
										   </div> 
										  </div>
                                   		    <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success">
									        	<div class="panel-heading"><b>SUPPLIER</b></div>
                                					<div class="panel-body">
													 <a href=""""),_display_(Seq[Any](/*102.25*/routes/*102.31*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*102.73*/(""""><img src=""""),_display_(Seq[Any](/*102.86*/routes/*102.92*/.Assets.at("images/tabImages/supp.png"))),format.raw/*102.131*/("""" class="img-responsive center-block" alt="Image">
														<p class="text-muted">Supplier</p>	
													</a>
                                    
				                                    </div>
										      </div> 
										   </div>
                                </div>
                           </div>
                       </div> <!-- content -->
                       <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                 <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>TIMESHEET</b></div>
                                				<div class="panel-body">
				                                	<a href=""""),_display_(Seq[Any](/*119.48*/routes/*119.54*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*119.101*/(""""><img src=""""),_display_(Seq[Any](/*119.114*/routes/*119.120*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*119.164*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:60px;">
					                                        <p class="text-muted">
					                                           Head Office Time Sheet</p>
					                                  </a>
					                              </div>
										   		</div> 
										  	</div>
                                 
                                   
                                </div>
                           </div>
                       </div> <!-- content -->
                                               
				       
          </div> <!-- content -->
                 
       				</div> <!-- span 12 -->
        		</div> <!-- row -->
      		</div> <!-- container -->
     	</div> <!-- wrapper -->
		 <div class="wrapper">
            <div class="container">
                <div class="row">
			     	 <div class="footer">
							          <hr/>   
							            <div class="container">
							               <p  class="pull-right"> <b class="copyright">&copy; 2014 SRINI Group &nbsp;</b>All rights reserved.</p>
							            </div>
					 </div> <!-- footer -->
					 </div> <!-- row -->
      		</div> <!-- container -->
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:01 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_headOffice_accountant.scala.html
                    HASH: 925ab8e37f2194ac1b025164a4b459ef01316386
                    MATRIX: 885->2|896->6|933->7|990->37|1018->38|1062->56|1089->57|1768->700|1783->706|1829->730|1878->743|1893->749|1970->803|2593->1390|2608->1396|2658->1424|2707->1437|2723->1443|2790->1487|3378->2039|3393->2045|3452->2082|3502->2095|3518->2101|3585->2145|4208->2732|4223->2738|4334->2826|4384->2839|4400->2845|4462->2884|5483->3869|5498->3875|5556->3911|5606->3924|5622->3930|5695->3980|6324->4573|6339->4579|6409->4626|6459->4639|6475->4645|6542->4689|7134->5245|7149->5251|7257->5336|7307->5349|7323->5355|7388->5397|7975->5947|7991->5953|8056->5995|8106->6008|8122->6014|8185->6053|9047->6878|9063->6884|9134->6931|9185->6944|9202->6950|9270->6994
                    LINES: 29->1|29->1|29->1|32->4|32->4|34->6|34->6|48->20|48->20|48->20|48->20|48->20|48->20|59->31|59->31|59->31|59->31|59->31|59->31|69->41|69->41|69->41|69->41|69->41|69->41|79->51|79->51|79->51|79->51|79->51|79->51|99->71|99->71|99->71|99->71|99->71|99->71|110->82|110->82|110->82|110->82|110->82|110->82|120->92|120->92|120->92|120->92|120->92|120->92|130->102|130->102|130->102|130->102|130->102|130->102|147->119|147->119|147->119|147->119|147->119|147->119
                    -- GENERATED --
                */
            