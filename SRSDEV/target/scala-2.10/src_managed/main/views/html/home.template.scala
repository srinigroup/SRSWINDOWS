
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
object home extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main/*1.7*/{_display_(Seq[Any](format.raw/*1.8*/("""
<style>
	
	.img-responsive """),format.raw/*4.18*/("""{"""),format.raw/*4.19*/("""
    width: 70px;
"""),format.raw/*6.1*/("""}"""),format.raw/*6.2*/("""
</style>   
        <div class="wrapper">
            <div class="container">
                <div class="row">
                    <div class="span12">
                    
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	<div class="col-md-3 col-sm-3">
									      <div class="panel panel-success" style="height:210px;" >
									        <div class="panel-heading"><b>STORE</b></div>
                                				<div class="panel-body">
			                                		 <a href=""""),_display_(Seq[Any](/*20.49*/routes/*20.55*/.Application.showOptions("STORE","ALL"))),format.raw/*20.94*/(""""><img src=""""),_display_(Seq[Any](/*20.107*/routes/*20.113*/.Assets.at("images/tabImages/storecart.jpg"))),format.raw/*20.157*/("""" class="img-responsive center-block" alt="Image">
				                                       <p class="text-muted" style="margin-top:10px;">
                                           				 Manage Stores</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-md-3 col-sm-3">
									      <div class="panel panel-success" style="height:210px;" >
									        <div class="panel-heading"><b>COMPANY</b></div>
                                				<div class="panel-body">
			                                		 <a href=""""),_display_(Seq[Any](/*31.49*/routes/*31.55*/.Application.showOptions("COMPANY","ALL"))),format.raw/*31.96*/(""""><img src=""""),_display_(Seq[Any](/*31.109*/routes/*31.115*/.Assets.at("images/tabImages/company.jpg"))),format.raw/*31.157*/("""" class="img-responsive center-block" alt="Image" style="width:80px;margin-top:-15px">
				                                       <p class="text-muted" style="margin-top:5px;">
                                           				 Manage Company's</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										    <div class="col-md-3 col-sm-3">
									      <div class="panel panel-success" style="height:210px;">
									        <div class="panel-heading"><b>STAFF</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*42.52*/routes/*42.58*/.Application.showOptions("STAFF","ALL"))),format.raw/*42.97*/(""""><img src=""""),_display_(Seq[Any](/*42.110*/routes/*42.116*/.Assets.at("images/tabImages/staff.png"))),format.raw/*42.156*/("""" class="img-responsive center-block" alt="Responsive image">
				                                        <p class="text-muted" style="margin-top:7px;">
                                            			 Manage Employee's</p>
				                                    </a>
	                                     		</div>
										   </div> 
										  </div>
										   <div class="col-md-3 col-sm-3">
									      <div class="panel panel-success" style="height:210px;">
									        <div class="panel-heading"><b>USER</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*53.52*/routes/*53.58*/.Application.showOptions("USER","ALL"))),format.raw/*53.96*/(""""><img src=""""),_display_(Seq[Any](/*53.109*/routes/*53.115*/.Assets.at("images/tabImages/user.png"))),format.raw/*53.154*/("""" class="img-responsive center-block" alt="Responsive image" style="margin-top:-10px;">
				                                        <p class="text-muted" style="margin-top:5px;">
                                            			 Manage Users</p>
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
									      <div class="panel panel-success" style="height:210px;" >
									        <div class="panel-heading" style="word-break:break-all;"><b>RECONCILATION</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*73.48*/routes/*73.54*/.DailyReconciliations.drViewOptions(0,"reportingBusinessDate","desc","SUBMITTED","VIEW"))),format.raw/*73.142*/(""""><img src=""""),_display_(Seq[Any](/*73.155*/routes/*73.161*/.Assets.at("images/tabImages/recon.png"))),format.raw/*73.201*/("""" class="img-responsive center-block" alt="Image" style="width:53px;">
				                                       <p class="text-muted">
                                           				 Monitor Reconciliation</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success" style="height:210px;">
									        	<div class="panel-heading"><b>REPORTS</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*85.53*/routes/*85.59*/.Reports.getReportHome())),format.raw/*85.83*/(""""><img src=""""),_display_(Seq[Any](/*85.96*/routes/*85.102*/.Assets.at("images/tabImages/rep.png"))),format.raw/*85.140*/("""" class="img-responsive center-block"  alt="Image">
				                           				<p class="text-muted">
                                            			Reports Generation</p>
				                                    </a>
				                                    </div>
										      </div> 
										   </div>
	                                   		 <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success" style="height:210px;" >
									        <div class="panel-heading" style="word-break:break-all;"><b>SALESHEAD</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*96.48*/routes/*96.54*/.Application.showOptions("SALES HEAD","ALL"))),format.raw/*96.98*/(""""><img src=""""),_display_(Seq[Any](/*96.111*/routes/*96.117*/.Assets.at("images/tabImages/saleshead.jpg"))),format.raw/*96.161*/("""" class="img-responsive center-block" alt="Image">
				                                       <p class="text-muted">
                                           				 Type of Sales</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success" style="height:210px;">
									        	<div class="panel-heading"><b>MEDIA TENDER</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*108.53*/routes/*108.59*/.Application.showOptions("MEDIA TENDER","ALL"))),format.raw/*108.105*/(""""><img src=""""),_display_(Seq[Any](/*108.118*/routes/*108.124*/.Assets.at("images/tabImages/media.jpg"))),format.raw/*108.164*/("""" class="img-responsive center-block"  alt="Image">
				                           				<p class="text-muted">
                                            			Type of Media</p>
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
									      <div class="panel panel-success" style="height:210px;" >
									        <div class="panel-heading" style="word-break:break-all;"><b>EXPENSE HEAD</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*126.48*/routes/*126.54*/.Application.showOptions("EXPENSE HEAD","ALL"))),format.raw/*126.100*/(""""><img src=""""),_display_(Seq[Any](/*126.113*/routes/*126.119*/.Assets.at("images/tabImages/expenses.png"))),format.raw/*126.162*/("""" class="img-responsive center-block" alt="Image" style="width:65px;">
				                                       <p class="text-muted">
                                           				Type Of Expenses</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success" style="height:210px;">
									        	<div class="panel-heading"><b>TERMINAL HEAD</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*138.53*/routes/*138.59*/.Application.showOptions("TERMINAL HEAD","ALL"))),format.raw/*138.106*/(""""><img src=""""),_display_(Seq[Any](/*138.119*/routes/*138.125*/.Assets.at("images/tabImages/terminal.jpg"))),format.raw/*138.168*/("""" class="img-responsive center-block"  alt="Image">
				                           				<p class="text-muted">
                                            			Counters</p>
				                                    </a>
				                                    </div>
										      </div> 
										   </div>
	                                   		 <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success" style="height:210px;" >
									        <div class="panel-heading" style="word-break:break-all;"><b>PAYMENT TENDER</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*149.48*/routes/*149.54*/.Application.showOptions("PAYMENT TENDER","ALL"))),format.raw/*149.102*/(""""><img src=""""),_display_(Seq[Any](/*149.115*/routes/*149.121*/.Assets.at("images/tabImages/paymenttender.jpg"))),format.raw/*149.169*/("""" class="img-responsive center-block" alt="Image">
				                                       <p class="text-muted">
                                           				 Lottery</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-sm-3 col-md-3">
									      	 <div class="panel panel-success" style="height:210px;">
									        <div class="panel-heading"><b>SUPPLIER</b></div>
                                				<div class="panel-body">
				                                    <a href=""""),_display_(Seq[Any](/*160.51*/routes/*160.57*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*160.99*/("""" ><img src=""""),_display_(Seq[Any](/*160.113*/routes/*160.119*/.Assets.at("images/tabImages/supp.png"))),format.raw/*160.158*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">
				                                            Supplier</p>
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
                                		 <div class="panel panel-success" style="height:210px;">
									        <div class="panel-heading"><b>TIMESHEET</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*178.52*/routes/*178.58*/.Timesheets.showSelectPage())),format.raw/*178.86*/(""""><img src=""""),_display_(Seq[Any](/*178.99*/routes/*178.105*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*178.149*/("""" class="img-responsive center-block" alt="Responsive image" style="width:60px;">
				                                        <p class="text-muted">
                                            			Timesheet Processing</p>
				                                    </a>
	                                     		</div>
										   </div> 
									</div>
									<div class="col-sm-3 col-md-3">
									      <div class="panel panel-success" style="height:210px;" >
									        <div class="panel-heading"><b>INVOICE INVENTORY</b></div>
                                				<div class="panel-body">
			                                		 <a href=""""),_display_(Seq[Any](/*189.49*/routes/*189.55*/.InvoiceInventory.showDownloadPage())),format.raw/*189.91*/(""""><img src=""""),_display_(Seq[Any](/*189.104*/routes/*189.110*/.Assets.at("images/tabImages/invoicedownload.jpg"))),format.raw/*189.160*/("""" class="img-responsive center-block" alt="Image" style="width:60px;">
				                                       <p class="text-muted">
                                           				Invoice Processing </p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-sm-3 col-md-3">
									      	<div class="panel panel-success" style="height:210px;">
									        	<div class="panel-heading"><b>INVOICE UPLOAD</b></div>
                                					<div class="panel-body">
				                                      <a href=""""),_display_(Seq[Any](/*200.53*/routes/*200.59*/.InvoiceInventory.showUploadPageForHeadOffice())),format.raw/*200.106*/(""""><img src=""""),_display_(Seq[Any](/*200.119*/routes/*200.125*/.Assets.at("images/tabImages/upload.jpg"))),format.raw/*200.166*/("""" class="img-responsive center-block"  alt="Image" style="width:60px;">
				                           				<p class="text-muted">
                                            			By Head Office</p>
				                                    </a>
				                                    </div>
										      </div> 
										   </div>
	                                       <div class="col-sm-3 col-md-3">
									       <div class="panel panel-success" style="height:210px;">
									        <div class="panel-heading"><b>INVOICE PAYMENT</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*211.52*/routes/*211.58*/.InvoiceInventory.showPaymentPage("noCompany","noStore","noCategory","noPaymentTerm"))),format.raw/*211.143*/(""""><img src=""""),_display_(Seq[Any](/*211.156*/routes/*211.162*/.Assets.at("images/tabImages/payment.jpg"))),format.raw/*211.204*/("""" class="img-responsive center-block" alt="Image" style="width:60px;">
				                                        <p class="text-muted">
				                                            Payments Done Here</p>
				                                    </a>
	                                     		</div>
										   </div> 
										  </div>
										  <div class="col-sm-3 col-md-3">
										  	<div class="panel panel-success" style="height:210px;">
									        <div class="panel-heading"><b>MONTHLY REPORTS</b></div>
                                				<div class="panel-body">
			                                    	<a href=""""),_display_(Seq[Any](/*222.51*/routes/*222.57*/.MonthlyReports.viewUploadedReports())),format.raw/*222.94*/(""""><img src=""""),_display_(Seq[Any](/*222.107*/routes/*222.113*/.Assets.at("images/tabImages/mrep.png"))),format.raw/*222.152*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:55px;">
			                                        <p class="text-muted" style="margin-top: 10px;">
			                                            Monthly Reports</p>
			                                    	</a>
                                     			</div>
											</div> 
										 </div> 
										 <div class="col-sm-3 col-md-3">
										  	<div class="panel panel-success" style="height:210px;">
									        <div class="panel-heading"><b>MANAGED REPORTS</b></div>
                                				<div class="panel-body">
			                                    	<a href=""""),_display_(Seq[Any](/*233.51*/routes/*233.57*/.ManagementReports.getReportsHome())),format.raw/*233.92*/(""""><img src=""""),_display_(Seq[Any](/*233.105*/routes/*233.111*/.Assets.at("images/tabImages/saleesreconcilation.jpg"))),format.raw/*233.165*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:60px">
			                                        <p class="text-muted" style="margin-top:10px;">
			                                            Managed Reports</p>
			                                    	</a>
                                     			</div>
											</div> 
									</div>
									<div class="col-sm-3 col-md-3">
										<div class="panel panel-success" style="height:210px;">
									        	<div class="panel-heading"><b>HO TIMESHEET</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*245.53*/routes/*245.59*/.Timesheets.showSelectPageForHeadOfficeTimeSheet())),format.raw/*245.109*/(""""><img src=""""),_display_(Seq[Any](/*245.122*/routes/*245.128*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*245.172*/("""" class="img-responsive center-block"  alt="Image" style="width:65px;">
				                           				<p class="text-muted">
                                            			Timesheet Processing</p>
				                                    </a>
				                                    </div>
										      </div> 
									</div>
									<div class="col-sm-3 col-md-3">
										<div class="panel panel-success" style="height:210px;">
									        	<div class="panel-heading"><b>HO FORMS</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*257.53*/routes/*257.59*/.HoForms.showHoFormUploadPage())),format.raw/*257.90*/(""""><img src=""""),_display_(Seq[Any](/*257.103*/routes/*257.109*/.Assets.at("images/tabImages/mreports1.png"))),format.raw/*257.153*/("""" class="img-responsive center-block"  alt="Image" style="width:65px;">
				                           				<p class="text-muted">
                                            			Upload HO Forms</p>
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
                                
                                </div>
                           </div>
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
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home.scala.html
                    HASH: fdc6a0d346be401270e55996cde7df6171ab8a46
                    MATRIX: 863->2|874->6|911->7|966->35|994->36|1038->54|1065->55|1754->708|1769->714|1830->753|1880->766|1896->772|1963->816|2635->1452|2650->1458|2713->1499|2763->1512|2779->1518|2844->1560|3555->2235|3570->2241|3631->2280|3681->2293|3697->2299|3760->2339|4441->2984|4456->2990|4516->3028|4566->3041|4582->3047|4644->3086|5783->4189|5798->4195|5909->4283|5959->4296|5975->4302|6038->4342|6732->5000|6747->5006|6793->5030|6842->5043|6858->5049|6919->5087|7619->5751|7634->5757|7700->5801|7750->5814|7766->5820|7833->5864|8504->6498|8520->6504|8590->6550|8641->6563|8658->6569|8722->6609|9737->7587|9753->7593|9823->7639|9874->7652|9891->7658|9958->7701|10652->8358|10668->8364|10739->8411|10790->8424|10807->8430|10874->8473|11570->9132|11586->9138|11658->9186|11709->9199|11726->9205|11798->9253|12444->9862|12460->9868|12525->9910|12577->9924|12594->9930|12657->9969|13652->10927|13668->10933|13719->10961|13769->10974|13786->10980|13854->11024|14538->11671|14554->11677|14613->11713|14664->11726|14681->11732|14755->11782|15441->12431|15457->12437|15528->12484|15579->12497|15596->12503|15661->12544|16359->13205|16375->13211|16484->13296|16535->13309|16552->13315|16618->13357|17293->13995|17309->14001|17369->14038|17420->14051|17437->14057|17500->14096|18208->14767|18224->14773|18282->14808|18333->14821|18350->14827|18428->14881|19139->15555|19155->15561|19229->15611|19280->15624|19297->15630|19365->15674|20036->16308|20052->16314|20106->16345|20157->16358|20174->16364|20242->16408
                    LINES: 29->1|29->1|29->1|32->4|32->4|34->6|34->6|48->20|48->20|48->20|48->20|48->20|48->20|59->31|59->31|59->31|59->31|59->31|59->31|70->42|70->42|70->42|70->42|70->42|70->42|81->53|81->53|81->53|81->53|81->53|81->53|101->73|101->73|101->73|101->73|101->73|101->73|113->85|113->85|113->85|113->85|113->85|113->85|124->96|124->96|124->96|124->96|124->96|124->96|136->108|136->108|136->108|136->108|136->108|136->108|154->126|154->126|154->126|154->126|154->126|154->126|166->138|166->138|166->138|166->138|166->138|166->138|177->149|177->149|177->149|177->149|177->149|177->149|188->160|188->160|188->160|188->160|188->160|188->160|206->178|206->178|206->178|206->178|206->178|206->178|217->189|217->189|217->189|217->189|217->189|217->189|228->200|228->200|228->200|228->200|228->200|228->200|239->211|239->211|239->211|239->211|239->211|239->211|250->222|250->222|250->222|250->222|250->222|250->222|261->233|261->233|261->233|261->233|261->233|261->233|273->245|273->245|273->245|273->245|273->245|273->245|285->257|285->257|285->257|285->257|285->257|285->257
                    -- GENERATED --
                */
            