
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
object showPaymentPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(selectedCompany:String,selectedStore:String,selectedCategory:String,selectedPaymentTerm:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.98*/("""
"""),format.raw/*4.1*/("""
   
"""),_display_(Seq[Any](/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""
        		<script type="text/javascript" src=""""),_display_(Seq[Any](/*7.48*/routes/*7.54*/.Assets.at("javascripts/invoice.js"))),format.raw/*7.90*/(""""></script>
     
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*16.24*/routes/*16.30*/.Application.index())),format.raw/*16.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">PAYMENT</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Application.index())),format.raw/*22.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*29.12*/if(flash.containsKey("success"))/*29.44*/ {_display_(Seq[Any](format.raw/*29.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*31.39*/flash/*31.44*/.get("success"))),format.raw/*31.59*/("""
		        </div>
		    """)))})),format.raw/*33.8*/(""" 
	
	"""),_display_(Seq[Any](/*35.3*/helper/*35.9*/.form(action = routes.InvoiceInventory.getInvoicesForPayment())/*35.72*/ {_display_(Seq[Any](format.raw/*35.74*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
  						<td>
            				<div class="clearfix" id="companyId_field">
								<label for="companyId">Select Company</label>
									<div class="input">
										<select name="companyId" id="companyId" required onchange="populateStoreOptionsInInvoicePayments()">
						            		<option class="blank" value="">-- Choose a Company --</option>
						  					"""),_display_(Seq[Any](/*46.15*/for(company <- Company.find.where().eq("status", "ACTIVE").orderBy("name").findList()) yield /*46.101*/{_display_(Seq[Any](format.raw/*46.102*/("""
						  						<option value=""""),_display_(Seq[Any](/*47.31*/company/*47.38*/.id)),format.raw/*47.41*/("""" id=""""),_display_(Seq[Any](/*47.48*/company/*47.55*/.id)),format.raw/*47.58*/("""">"""),_display_(Seq[Any](/*47.61*/company/*47.68*/.name)),format.raw/*47.73*/("""</option>
						  					""")))})),format.raw/*48.15*/("""
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	
					  	<td>
            				<div class="clearfix" id="storeId_field">
								<label for="storeId">Select Store</label>
									<div class="input">
										<select name="storeId" id="invoiceStoreList" onchange="enableCategoryAtpaymentPage()">
						            		<option class="blank" value="">-- Choose a Store --</option>
						  					
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	
					  	<td>
								<div class="clearfix" id="invoiceCategoryAtPaymentPage_field" style="display:none;">
	    							<label for="invoiceCategory">Invoice Category</label>
	    								<div class="invoiceCategory">
	        								<select name="invoiceCategory" id="invoiceCategoryAtPaymentPage" onchange="disablePaymentTermsAtpaymentPage()">
						            			<option class="blank" value="">-- Choose a Category --</option>
						  						<option value="Fuel">Fuel</option>
						  						<option value="Other">Other</option>
						  					</select>
	        								<span class="help-inline"></span>
	    								</div>
									</div>
						</td>
						
						<td>
            				<div class="clearfix" id="paymentTermsAtpaymentPage_field" style="display:none;">
								<label for="paymentTerms">Select Payment Term</label>
									<div class="input">
										<select id="paymentTermsAtpaymentPage" name="paymentTerms">
											<option value="ALL">ALL</option>
											<option value="CashPaid">CashPaid</option>
											<option value="DD">DD</option>
											<option value="FortNightly">FortNightly</option>
											<option value="Weekly">Weekly</option>
											<option value="Monthly">Monthly</option>
											<option value="Others">Others</option>
										</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	
            		</tr>
            	</table>
         	</div>
		
        <center><input type="submit" value="Get Invoices" class="btn btn-primary"></center>
        <a href="#" data-toggle="popover" title="Total Invoices : """),_display_(Seq[Any](/*105.68*/Invoice/*105.75*/.processedInvoicesByAllStores())),format.raw/*105.106*/("""" data-content="<ul>"""),_display_(Seq[Any](/*105.127*/for(store <- Stores.getStoresList()) yield /*105.163*/{_display_(Seq[Any](_display_(Seq[Any](/*105.165*/if(store.id != 1)/*105.182*/{_display_(Seq[Any](format.raw/*105.183*/("""<li>"""),_display_(Seq[Any](/*105.188*/store/*105.193*/.name)),format.raw/*105.198*/(""" : """),_display_(Seq[Any](/*105.202*/Invoice/*105.209*/.processedInvoicesByStore(store.id))),format.raw/*105.244*/("""</li>""")))}))))})),format.raw/*105.251*/("""</ul>" data-placement="bottom" data-trigger="hover" class="pull-right btn btn-danger">To Be PAID (Store)</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="#" data-toggle="popover" title="Total Invoices : """),_display_(Seq[Any](/*106.68*/Invoice/*106.75*/.processedInvoicesByAllCompanies())),format.raw/*106.109*/("""" data-content="<ul>"""),_display_(Seq[Any](/*106.130*/for(company <- Company.find.where().eq("status", "ACTIVE").orderBy("name").findList() ) yield /*106.217*/{_display_(Seq[Any](format.raw/*106.218*/("""<li>"""),_display_(Seq[Any](/*106.223*/company/*106.230*/.name)),format.raw/*106.235*/(""" : """),_display_(Seq[Any](/*106.239*/Invoice/*106.246*/.processedInvoicesByCompany(company.id))),format.raw/*106.285*/("""</li>""")))})),format.raw/*106.291*/("""</ul>" data-placement="bottom" data-trigger="hover" class="pull-right btn btn-danger">To Be PAID (Company)</a>
        
        
	
	""")))})),format.raw/*110.3*/(""" <!-- form ends -->
	
		
		
		</div>
	</div>
	 <input type="hidden" id="paymentSelectedPaymentTerm" name="paymentSelectedPaymentTerm" value=""""),_display_(Seq[Any](/*116.98*/selectedPaymentTerm)),format.raw/*116.117*/("""">
    <input type="hidden" id="paymentSelectedInvoiceType" name="paymentSelectedInvoiceType" value=""""),_display_(Seq[Any](/*117.100*/selectedCategory)),format.raw/*117.116*/("""">
	<input type="hidden" id="paymentSelectedCompany" name="paymentSelectedCompany" value=""""),_display_(Seq[Any](/*118.89*/selectedCompany)),format.raw/*118.104*/("""">
	<input type="hidden" id="paymentSelectedStore" name="paymentSelectedStore" value=""""),_display_(Seq[Any](/*119.85*/selectedStore)),format.raw/*119.98*/("""">
""")))})),format.raw/*120.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(selectedCompany:String,selectedStore:String,selectedCategory:String,selectedPaymentTerm:String): play.api.templates.HtmlFormat.Appendable = apply(selectedCompany,selectedStore,selectedCategory,selectedPaymentTerm)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (selectedCompany,selectedStore,selectedCategory,selectedPaymentTerm) => apply(selectedCompany,selectedStore,selectedCategory,selectedPaymentTerm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/showPaymentPage.scala.html
                    HASH: 4e48d83817887726431a20d3f480f537a81db143
                    MATRIX: 822->1|1065->97|1093->153|1135->161|1146->165|1183->166|1267->215|1281->221|1338->257|1630->513|1645->519|1687->539|2002->818|2017->824|2059->844|2287->1036|2328->1068|2368->1070|2489->1155|2503->1160|2540->1175|2598->1202|2641->1210|2655->1216|2727->1279|2767->1281|3322->1800|3425->1886|3465->1887|3533->1919|3549->1926|3574->1929|3617->1936|3633->1943|3658->1946|3697->1949|3713->1956|3740->1961|3797->1986|6099->4251|6116->4258|6171->4289|6230->4310|6284->4346|6334->4348|6362->4365|6403->4366|6446->4371|6462->4376|6491->4381|6533->4385|6551->4392|6610->4427|6655->4434|6942->4684|6959->4691|7017->4725|7076->4746|7181->4833|7222->4834|7265->4839|7283->4846|7312->4851|7354->4855|7372->4862|7435->4901|7475->4907|7644->5044|7829->5192|7872->5211|8013->5314|8053->5330|8182->5422|8221->5437|8346->5525|8382->5538|8419->5543
                    LINES: 26->1|32->1|33->4|35->6|35->6|35->6|36->7|36->7|36->7|45->16|45->16|45->16|51->22|51->22|51->22|58->29|58->29|58->29|60->31|60->31|60->31|62->33|64->35|64->35|64->35|64->35|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|76->47|76->47|76->47|76->47|77->48|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|134->105|135->106|135->106|135->106|135->106|135->106|135->106|135->106|135->106|135->106|135->106|135->106|135->106|135->106|139->110|145->116|145->116|146->117|146->117|147->118|147->118|148->119|148->119|149->120
                    -- GENERATED --
                */
            