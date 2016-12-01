
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
object home_store extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*1.3*/checkPermission/*1.18*/(user:String) = {{
    
   var role =  user 
    if(role == null) {
       	role = "null";
    }
     role
}};
Seq[Any](format.raw/*8.2*/("""

 
 """),_display_(Seq[Any](/*11.3*/main/*11.7*/{_display_(Seq[Any](format.raw/*11.8*/("""   

        <div class="wrapper">
            <div class="container">
                <div class="row"> <!-- apply later style="margin-top: 2.5%;" -->
					<div class="span12">
					
					<div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                
                                	 """),_display_(Seq[Any](/*22.36*/if(checkPermission(session.get("role")).contains("sk"))/*22.91*/{_display_(Seq[Any](format.raw/*22.92*/("""
                                	 <div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>SHIFT</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*27.48*/routes/*27.54*/.Application.showOptions("SHIFT","ALL"))),format.raw/*27.93*/(""""><img src=""""),_display_(Seq[Any](/*27.106*/routes/*27.112*/.Assets.at("images/tabImages/shift.jpg"))),format.raw/*27.152*/("""" class="img-responsive center-block" alt="Image" style="width:25%;">
				                                        <p class="text-muted" style="margin-top:7px;">
				                                            Profit</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-sm-4 col-md-4">
									      	<div class="panel panel-success">
									        	<div class="panel-heading"><b>Employee TimeSheet</b></div>
                                					<div class="panel-body">
										 
				                                     <a href=""""),_display_(Seq[Any](/*39.52*/routes/*39.58*/.Application.showOptions("EMP TIMESHEET","ALL"))),format.raw/*39.105*/(""""><img src=""""),_display_(Seq[Any](/*39.118*/routes/*39.124*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*39.168*/("""" class="img-responsive center-block"  alt="Image" style="width:20%;">
				                           				<p class="text-muted">Store Keeper</p>
				                                    </a>
				                                    </div>
										      </div> 
										   </div>
	                                     <div class="col-sm-4  col-md-4">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>SUPPLIER</b></div>
                                				<div class="panel-body">
				                                    <a href=""""),_display_(Seq[Any](/*49.51*/routes/*49.57*/.Shifts.storeSuppliersList())),format.raw/*49.85*/(""""><img src=""""),_display_(Seq[Any](/*49.98*/routes/*49.104*/.Assets.at("images/tabImages/supplier.jpg"))),format.raw/*49.147*/("""" class="img-responsive center-block" alt="Image" style="width:25%;">
				                                        <p class="text-muted">
				                                            Supplier's Info</p>
				                                    </a>
	                                     		</div>
										   </div> 
										  </div>
	                                    
                                    """)))})),format.raw/*57.38*/("""
                                </div>
                            </div>
                        </div> <!-- content -->
					
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                
	                                 """),_display_(Seq[Any](/*66.36*/if(checkPermission(session.get("role")).contains("sm"))/*66.91*/{_display_(Seq[Any](format.raw/*66.92*/("""
	                                	 <div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>TIMESHEET</b></div>
                                				<div class="panel-body">
				                                	<a href=""""),_display_(Seq[Any](/*71.48*/routes/*71.54*/.Application.showOptions("TIMESHEET","ALL"))),format.raw/*71.97*/(""""><img src=""""),_display_(Seq[Any](/*71.110*/routes/*71.116*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*71.160*/("""" class="img-responsive center-block" alt="Image"  style="width:20%;">
					                                        <p class="text-muted">
					                                           Store Manager</p>
					                                  </a>
					                              </div>
										   		</div> 
										  	</div>
										  	<div class="col-sm-4 col-md-4">
									      		<div class="panel panel-success" >
									        		<div class="panel-heading"><b>SALES RECONCILIATION</b></div>
                                						<div class="panel-body">   
		                                  
							                                 <a href=""""),_display_(Seq[Any](/*83.51*/routes/*83.57*/.Application.showOptions("SALES RECONCILIATION","ALL"))),format.raw/*83.111*/(""""><img src=""""),_display_(Seq[Any](/*83.124*/routes/*83.130*/.Assets.at("images/tabImages/saleesreconcilation.jpg"))),format.raw/*83.184*/("""" class="img-responsive center-block" alt="Image"  style="width:20%;">
							                                        <p class="text-muted">
							                                            Verfiy Sales</p>
							                                  </a>
							                               </div>
										   				</div> 
										  			</div>
		                                  <div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>DAILY RECONCILIATION</b></div>
                                				<div class="panel-body">
					                                 <a href=""""),_display_(Seq[Any](/*94.49*/routes/*94.55*/.Application.showOptions("DAILY RECONCILIATION","ALL"))),format.raw/*94.109*/(""""><img src=""""),_display_(Seq[Any](/*94.122*/routes/*94.128*/.Assets.at("images/tabImages/reoncilation1.jpg"))),format.raw/*94.176*/("""" class="img-responsive center-block" alt="Image"  style="width:20%;">
					                                        <p class="text-muted">
					                                          Banking,Pay Wages,Safe Payouts</p>
					                                  </a>
				                                 </div>
											</div> 
										</div>  
	                                 """)))})),format.raw/*101.36*/("""
                                 
                                </div>
                            </div>
                        </div> <!-- content -->
                        
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	<div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>INVOICE INVENTORY</b></div>
                                				<div class="panel-body">
				                                    <a href=""""),_display_(Seq[Any](/*114.51*/routes/*114.57*/.InvoiceInventory.showUploadPage())),format.raw/*114.91*/(""""><img src=""""),_display_(Seq[Any](/*114.104*/routes/*114.110*/.Assets.at("images/tabImages/uploadinvoice.jpg"))),format.raw/*114.158*/("""" class="img-responsive center-block" alt="Image"  style="width:22%;">
				                                        <p class="text-muted">
				                                           Invoice Upload System</p>
				                                    </a>
				                                    </div>
												</div> 
									</div>  
									<div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>REPORTS</b></div>
                                				<div class="panel-body">
				                                    <a href=""""),_display_(Seq[Any](/*125.51*/routes/*125.57*/.Reports.getReportHomeForStore())),format.raw/*125.89*/(""""><img src=""""),_display_(Seq[Any](/*125.102*/routes/*125.108*/.Assets.at("images/tabImages/reports.jpg"))),format.raw/*125.150*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:20%;">
			                                        <p class="text-muted">
			                                            Reports Generation</p>
			                                    	</a>
			                                      </div>
												</div> 
									</div>  
									<div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>MONTHLY REPORTS</b></div>
                                				<div class="panel-body">
			                                    	<a href=""""),_display_(Seq[Any](/*136.51*/routes/*136.57*/.MonthlyReports.showUploadPage())),format.raw/*136.89*/(""""><img src=""""),_display_(Seq[Any](/*136.102*/routes/*136.108*/.Assets.at("images/tabImages/upload.jpg"))),format.raw/*136.149*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:15%;">
			                                        <p class="text-muted" style="margin-top: 10px;">
			                                            Upload Monthly Reports</p>
			                                    	</a>
                                     			</div>
											</div> 
									</div>  
                                </div>
                            </div>
                          </div>   
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	<div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>VIEW HO FORMS</b></div>
                                				<div class="panel-body">
				                       				<a href=""""),_display_(Seq[Any](/*153.42*/routes/*153.48*/.HoForms.getAllHeadOfficeForms())),format.raw/*153.80*/(""""><img src=""""),_display_(Seq[Any](/*153.93*/routes/*153.99*/.Assets.at("images/tabImages/mreports1.png"))),format.raw/*153.143*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:15%;">
				                                        <p class="text-muted" style="margin-top: 10px;">
				                                            Head Office Forms</p>
				                                    </a> 
				                                   </div>
											</div> 
									</div>  
									
                                </div>
                            </div>
                        </div>  
                           
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
     	</div> <!-- wrapper -->
			        
      
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:01 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_store.scala.html
                    HASH: c5f6a1eced95d89226d6d10a8b875741772d6c65
                    MATRIX: 844->2|867->17|1011->132|1055->141|1067->145|1105->146|1554->559|1618->614|1657->615|1986->908|2001->914|2062->953|2112->966|2128->972|2191->1012|2893->1678|2908->1684|2978->1731|3028->1744|3044->1750|3111->1794|3735->2382|3750->2388|3800->2416|3849->2429|3865->2435|3931->2478|4383->2898|4794->3273|4858->3328|4897->3329|5231->3627|5246->3633|5311->3676|5361->3689|5377->3695|5444->3739|6156->4415|6171->4421|6248->4475|6298->4488|6314->4494|6391->4548|7090->5211|7105->5217|7182->5271|7232->5284|7248->5290|7319->5338|7741->5727|8443->6392|8459->6398|8516->6432|8567->6445|8584->6451|8656->6499|9312->7118|9328->7124|9383->7156|9434->7169|9451->7175|9517->7217|10192->7855|10208->7861|10263->7893|10314->7906|10331->7912|10396->7953|11397->8917|11413->8923|11468->8955|11518->8968|11534->8974|11602->9018
                    LINES: 28->1|28->1|36->8|39->11|39->11|39->11|50->22|50->22|50->22|55->27|55->27|55->27|55->27|55->27|55->27|67->39|67->39|67->39|67->39|67->39|67->39|77->49|77->49|77->49|77->49|77->49|77->49|85->57|94->66|94->66|94->66|99->71|99->71|99->71|99->71|99->71|99->71|111->83|111->83|111->83|111->83|111->83|111->83|122->94|122->94|122->94|122->94|122->94|122->94|129->101|142->114|142->114|142->114|142->114|142->114|142->114|153->125|153->125|153->125|153->125|153->125|153->125|164->136|164->136|164->136|164->136|164->136|164->136|181->153|181->153|181->153|181->153|181->153|181->153
                    -- GENERATED --
                */
            