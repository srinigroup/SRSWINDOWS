
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
object home_adm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main/*1.7*/{_display_(Seq[Any](format.raw/*1.8*/("""
<style>
	
	.img-responsive """),format.raw/*4.18*/("""{"""),format.raw/*4.19*/("""
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
                                	 <div class="col-md-3  col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;" >
									        <div class="panel-heading" style="word-break:break-all;"><b>RECONCILATION</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*21.48*/routes/*21.54*/.DailyReconciliations.drViewOptions(0,"reportingBusinessDate","desc","SUBMITTED","VIEW"))),format.raw/*21.142*/(""""><img src=""""),_display_(Seq[Any](/*21.155*/routes/*21.161*/.Assets.at("images/tabImages/mrep.png"))),format.raw/*21.200*/("""" class="img-responsive center-block" alt="Image" style="width:53px;">
				                                       <p class="text-muted">
                                           				 Monitor Reconciliation</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class=" col-md-3  col-md-offset-1" style="margin-left:0px;">
									      	<div class="panel panel-success" style="height:200px;">
									        	<div class="panel-heading"><b>REPORTS</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*33.53*/routes/*33.59*/.Reports.getReportHome())),format.raw/*33.83*/("""" ><img src=""""),_display_(Seq[Any](/*33.97*/routes/*33.103*/.Assets.at("images/tabImages/reports.jpg"))),format.raw/*33.145*/("""" class="img-responsive center-block"  alt="Image">
				                           				<p class="text-muted">
                                            			Reports Generation</p>
				                                    </a>
				                                    </div>
										      </div> 
										   </div>
	                                     <div class="col-md-3 col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;">
									        <div class="panel-heading"><b>SUPPLIER</b></div>
                                				<div class="panel-body">
				                                    <a href=""""),_display_(Seq[Any](/*44.51*/routes/*44.57*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*44.99*/("""" ><img src=""""),_display_(Seq[Any](/*44.113*/routes/*44.119*/.Assets.at("images/tabImages/supp.png"))),format.raw/*44.158*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">
				                                            Supplier</p>
				                                    </a>
	                                     		</div>
										   </div> 
										  </div>
	                                    <div class="col-md-3  col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;">
									        <div class="panel-heading"><b>TIMESHEET</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*55.52*/routes/*55.58*/.Timesheets.showSelectPage())),format.raw/*55.86*/(""""><img src=""""),_display_(Seq[Any](/*55.99*/routes/*55.105*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*55.149*/("""" class="img-responsive center-block" alt="Responsive image">
				                                        <p class="text-muted">
                                            			Timesheet Processing</p>
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
                                	 <div class="col-md-3  col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;" >
									        <div class="panel-heading"><b>INVOICE INVENTORY</b></div>
                                				<div class="panel-body">
			                                		 <a href=""""),_display_(Seq[Any](/*75.49*/routes/*75.55*/.InvoiceInventory.showDownloadPage())),format.raw/*75.91*/(""""><img src=""""),_display_(Seq[Any](/*75.104*/routes/*75.110*/.Assets.at("images/tabImages/invoicedownload.jpg"))),format.raw/*75.160*/("""" class="img-responsive center-block" alt="Image">
				                                       <p class="text-muted">
                                           				Invoice Processing </p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class=" col-md-3  col-md-offset-1" style="margin-left:0px;">
									      	<div class="panel panel-success" style="height:200px;">
									        	<div class="panel-heading"><b>INVOICE UPLOAD</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*87.53*/routes/*87.59*/.InvoiceInventory.showUploadPageForHeadOffice())),format.raw/*87.106*/(""""><img src=""""),_display_(Seq[Any](/*87.119*/routes/*87.125*/.Assets.at("images/tabImages/upload.jpg"))),format.raw/*87.166*/("""" class="img-responsive center-block"  alt="Image">
				                           				<p class="text-muted">
                                            			By Head Office</p>
				                                    </a>
				                                    </div>
										      </div> 
										   </div>
	                                     <div class="col-md-3 col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;">
									        <div class="panel-heading"><b>INVOICE PAYMENT</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*98.52*/routes/*98.58*/.InvoiceInventory.showPaymentPage("noCompany","noStore","noCategory","noPaymentTerm"))),format.raw/*98.143*/(""""><img src=""""),_display_(Seq[Any](/*98.156*/routes/*98.162*/.Assets.at("images/tabImages/payment.jpg"))),format.raw/*98.204*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">
				                                            Payments Done Here</p>
				                                    </a>
	                                     		</div>
										   </div> 
										  </div>
	                                    <div class="col-md-3  col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;">
									        <div class="panel-heading"><b>STAFF</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*109.52*/routes/*109.58*/.Application.showOptions("STAFF","ALL"))),format.raw/*109.97*/(""""><img src=""""),_display_(Seq[Any](/*109.110*/routes/*109.116*/.Assets.at("images/tabImages/staff.png"))),format.raw/*109.156*/("""" class="img-responsive center-block" alt="Responsive image">
				                                        <p class="text-muted">
                                            			 Manage Employee's</p>
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
                                	 <div class="col-md-3  col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;" >
									        <div class="panel-heading"><b>STORE</b></div>
                                				<div class="panel-body">
			                                		 <a href=""""),_display_(Seq[Any](/*128.49*/routes/*128.55*/.Application.showOptions("STORE","ALL"))),format.raw/*128.94*/(""""><img src=""""),_display_(Seq[Any](/*128.107*/routes/*128.113*/.Assets.at("images/tabImages/storecart.jpg"))),format.raw/*128.157*/("""" class="img-responsive center-block" alt="Image">
				                                       <p class="text-muted">
                                           				 Manage Stores</p>
				                                     </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class=" col-md-3  col-md-offset-1" style="margin-left:0px;">
									      	<div class="panel panel-success" style="height:200px;">
									        	<div class="panel-heading"><b>HO TIMESHEET</b></div>
                                					<div class="panel-body">
										 
				                                      <a href=""""),_display_(Seq[Any](/*140.53*/routes/*140.59*/.Timesheets.showSelectPageForHeadOfficeTimeSheet())),format.raw/*140.109*/(""""><img src=""""),_display_(Seq[Any](/*140.122*/routes/*140.128*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*140.172*/("""" class="img-responsive center-block"  alt="Image">
				                           				<p class="text-muted">
                                            			Timesheet Processing</p>
				                                    </a>
				                                    </div>
										      </div> 
										   </div>
	                                    
	                                    <div class="col-md-3  col-md-offset-1" style="margin-left:0px;">
									      <div class="panel panel-success" style="height:200px;">
									        <div class="panel-heading"><b>HO FORMS</b></div>
                                				<div class="panel-body">
				                                     <a href=""""),_display_(Seq[Any](/*152.52*/routes/*152.58*/.HoForms.showHoFormUploadPage())),format.raw/*152.89*/(""""><img src=""""),_display_(Seq[Any](/*152.102*/routes/*152.108*/.Assets.at("images/tabImages/mreports1.png"))),format.raw/*152.152*/("""" class="img-responsive center-block" alt="Responsive image">
				                                        <p class="text-muted">
                                            			  Upload Head Office Forms</p>
				                                    </a>
	                                     		</div>
										   </div> 
										  </div>
										   
                            	</div>
                        	</div>
                        </div>  <!-- content -->
                  
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
""")))})),format.raw/*180.2*/("""

"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:01 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_adm.scala.html
                    HASH: 6710c1aef0415d35e48c5e352a747977f7ac3ff9
                    MATRIX: 867->2|878->6|915->7|970->35|998->36|1042->54|1069->55|1847->797|1862->803|1973->891|2023->904|2039->910|2101->949|2829->1641|2844->1647|2890->1671|2940->1685|2956->1691|3021->1733|3723->2399|3738->2405|3802->2447|3853->2461|3869->2467|3931->2506|4630->3169|4645->3175|4695->3203|4744->3216|4760->3222|4827->3266|5928->4331|5943->4337|6001->4373|6051->4386|6067->4392|6140->4442|6851->5117|6866->5123|6936->5170|6986->5183|7002->5189|7066->5230|7772->5900|7787->5906|7895->5991|7945->6004|7961->6010|8026->6052|8732->6721|8748->6727|8810->6766|8861->6779|8878->6785|8942->6825|10015->7861|10031->7867|10093->7906|10144->7919|10161->7925|10229->7969|10934->8637|10950->8643|11024->8693|11075->8706|11092->8712|11160->8756|11904->9463|11920->9469|11974->9500|12025->9513|12042->9519|12110->9563|13227->10648
                    LINES: 29->1|29->1|29->1|32->4|32->4|34->6|34->6|49->21|49->21|49->21|49->21|49->21|49->21|61->33|61->33|61->33|61->33|61->33|61->33|72->44|72->44|72->44|72->44|72->44|72->44|83->55|83->55|83->55|83->55|83->55|83->55|103->75|103->75|103->75|103->75|103->75|103->75|115->87|115->87|115->87|115->87|115->87|115->87|126->98|126->98|126->98|126->98|126->98|126->98|137->109|137->109|137->109|137->109|137->109|137->109|156->128|156->128|156->128|156->128|156->128|156->128|168->140|168->140|168->140|168->140|168->140|168->140|180->152|180->152|180->152|180->152|180->152|180->152|208->180
                    -- GENERATED --
                */
            