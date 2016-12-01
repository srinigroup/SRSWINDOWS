
package views.html.shifts

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[DailySalesReconciliation],DailySalesReconciliation,Store,Shift,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(dsrForm: Form[DailySalesReconciliation],dsrObject:DailySalesReconciliation, store: Store,shift:Shift ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*6.2*/checkSelected/*6.15*/(id:String,eid:Long) = {{
    
    var result = eid.toString();
    
     
       if(result==id){
       	
       	result = "selected";
       	}
    
    result
}};def /*19.2*/isStatusValid/*19.15*/(typeObj:String) = {{

	var result = "";
	if(typeObj.equals("SHIFT")){
	
		if(shift.status.equals("SUBMITTED")){
			result = "disabled" ;
		}
	}
	result
}};def /*32.2*/currentDateFormat/*32.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.105*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*17.2*/("""

"""),format.raw/*29.2*/("""


"""),format.raw/*40.2*/("""

"""),_display_(Seq[Any](/*42.2*/main/*42.6*/{_display_(Seq[Any](format.raw/*42.7*/("""

	<div class="wrapper" style="min-height:700px">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*50.24*/routes/*50.30*/.Application.index())),format.raw/*50.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						"""),_display_(Seq[Any](/*51.15*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*51.95*/{_display_(Seq[Any](format.raw/*51.96*/("""
            					<a href=""""),_display_(Seq[Any](/*52.28*/routes/*52.34*/.Application.showOptions("SHIFT","ALL"))),format.raw/*52.73*/("""" class="btn btn-default">SHIFT</a>
            					<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*53.55*/flash/*53.60*/.get("pageAction"))),format.raw/*53.78*/("""</a>
            				""")))})),format.raw/*54.18*/("""
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           				 	"""),_display_(Seq[Any](/*59.19*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*59.99*/{_display_(Seq[Any](format.raw/*59.100*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*61.18*/("""
           					"""),_display_(Seq[Any](/*62.18*/if((session.get("role")).contains("admin") || (session.get("role")).contains("su") 
           					|| (session.get("role")).contains("ac")|| (session.get("role")).contains("sa")  || (session.get("role")).contains("HeadOffice Accountant"))/*63.156*/{_display_(Seq[Any](format.raw/*63.157*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*65.18*/("""
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
    """),_display_(Seq[Any](/*72.6*/if(flash.containsKey("success"))/*72.38*/ {_display_(Seq[Any](format.raw/*72.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*74.37*/flash/*74.42*/.get("success"))),format.raw/*74.57*/("""
        </div>
    """)))})),format.raw/*76.6*/(""" 
     
"""),_display_(Seq[Any](/*78.2*/helper/*78.8*/.form(action = routes.Shifts.update(shift.id,store.id,flash.get("pageAction")),'enctype -> "multipart/form-data",'id -> "shiftEditForm", 'onsubmit -> "return verifyPayoutReqmnts();")/*78.190*/ {_display_(Seq[Any](format.raw/*78.192*/("""
	
	<style>
		table """),format.raw/*81.9*/("""{"""),format.raw/*81.10*/("""
		height: 5px;
	    border: 1px solid black;
    	"""),format.raw/*84.6*/("""}"""),format.raw/*84.7*/("""
	</style>
	
	<h3>Shift Details</h3>
		
		<hr/>
		<br/>
	<div class="table-responsive">
		<table class="table table-bordered">
            <thead>
               <tr style="background-color:#58ACFA">
                   
                 	 <th>Created Date</th>
                      <th>Reporting Business Date</th>
                      <th>Shift Start Time</th>
                      <th>Total Sales Reported</th>
                      <th>Total Media Collected</th>
                      <th>Shift Variance</th>
                  	  <th>Reason for Variance</th>
                  	  <th>Status</th>
               </tr>
            </thead>
            <tbody>
                    <tr>
                        <td>"""),_display_(Seq[Any](/*108.30*/currentDateFormat(dsrObject.todayDate))),format.raw/*108.68*/("""</td>
                        
                        <td>"""),_display_(Seq[Any](/*110.30*/currentDateFormat(dsrObject.reportingBusinessDate))),format.raw/*110.80*/(""" </td>
                        
                        <td>"""),_display_(Seq[Any](/*112.30*/shift/*112.35*/.shiftStartDateTime)),format.raw/*112.54*/(""" </td>
                         
                        <td> """),_display_(Seq[Any](/*114.31*/Shift/*114.36*/.getTotalSales(shift))),format.raw/*114.57*/(""" </td>
                        
                        <td> """),_display_(Seq[Any](/*116.31*/Shift/*116.36*/.getTotalMedialCollected(shift))),format.raw/*116.67*/("""</td> 	
                        
                        <td> """),_display_(Seq[Any](/*118.31*/Shift/*118.36*/.getTotalVariance(shift))),format.raw/*118.60*/("""</td>
                         
                        <td> """),_display_(Seq[Any](/*120.31*/shift/*120.36*/.varReason)),format.raw/*120.46*/("""</td> 	
                       	
                       	<td> """),_display_(Seq[Any](/*122.31*/shift/*122.36*/.status)),format.raw/*122.43*/("""  </td>  	
                       	
                    </tr>
            </tbody>
        </table>
       </div>
		<br>
         	<ul class="tabs">
	  			<li class="active" rel="tab1">Sales</li>
	  			<li rel="tab2">Media Collected</li>
	  			<li rel="tab3">Variance by Media</li>
	  			<li rel="tab4">Register Payouts</li>
	  			<li rel="tab5">Payment Amounts</li>
			</ul>
		<div class="tab_container">
  		<h3 class="d_active tab_drawer_heading" rel="tab1">Sales</h3>
  		<div id="tab1" class="tab_content">
			"""),_display_(Seq[Any](/*139.5*/if(shift.shiftSales.size() == 0)/*139.37*/ {_display_(Seq[Any](format.raw/*139.39*/("""
				<div class="well">
					 <em>Nothing to display</em>
				</div>
			""")))}/*143.5*/else/*143.10*/{_display_(Seq[Any](format.raw/*143.11*/("""
			
        	<table class="table table-bordered">
            	<thead>
 					<th style="background-color:#D0F5A9">Sales Heads</th>
                    <th style="background-color:#D0F5A9">Sale Amount</th>
                </thead> 
            	<tbody>
                	"""),_display_(Seq[Any](/*151.19*/for(shiftSale <- shift.shiftSales) yield /*151.53*/ {_display_(Seq[Any](format.raw/*151.55*/("""
	    		    	<tr>
	                		<td> """),_display_(Seq[Any](/*153.26*/shiftSale/*153.35*/.salesHead.name)),format.raw/*153.50*/("""</td>
	                    	<td> <input type="text" id=""""),_display_(Seq[Any](/*154.52*/shiftSale/*154.61*/.salesHead.name)),format.raw/*154.76*/("""" class ="saleshead" name=""""),_display_(Seq[Any](/*154.104*/shiftSale/*154.113*/.salesHead.name)),format.raw/*154.128*/("""" value=""""),_display_(Seq[Any](/*154.138*/Shift/*154.143*/.getShiftSaleAmount(shift.shiftSales,shiftSale.salesHead.name))),format.raw/*154.205*/("""" ></td>
	                     </tr>
               		""")))})),format.raw/*156.19*/("""
               	</tbody>
        	</table>
      		""")))})),format.raw/*159.10*/("""
		</div>
  					
		<h3 class="tab_drawer_heading" rel="tab2">Media Collected</h3>
		<div id="tab2" class="tab_content">
			"""),_display_(Seq[Any](/*164.5*/if(shift.mediaCollects.size() == 0)/*164.40*/ {_display_(Seq[Any](format.raw/*164.42*/("""
				<div class="well">
					<em>Nothing to display</em>
				</div>
			""")))}/*168.6*/else/*168.11*/{_display_(Seq[Any](format.raw/*168.12*/("""
				<table class="table table-bordered">
					<thead>
	 				  	 <th style="background-color:#D0F5A9">Media Tenders</th>
	                     <th style="background-color:#D0F5A9">Media Collects</th>
	                     <th style="background-color:#D0F5A9">Settlement Amount</th>
     				</thead>
					<tbody>
						"""),_display_(Seq[Any](/*176.8*/for(mediaCollect <- shift.mediaCollects) yield /*176.48*/ {_display_(Seq[Any](format.raw/*176.50*/("""
    						<tr>	
    	 						<td> """),_display_(Seq[Any](/*178.19*/mediaCollect/*178.31*/.mediaTender.name)),format.raw/*178.48*/("""</td>
        						<td> <input type="text" class="actual" name=""""),_display_(Seq[Any](/*179.61*/mediaCollect/*179.73*/.mediaTender.name)),format.raw/*179.90*/("""" value=""""),_display_(Seq[Any](/*179.100*/Shift/*179.105*/.getShiftMediaCollectedAmount(shift.mediaCollects,mediaCollect.mediaTender.name))),format.raw/*179.185*/("""" ></td>
                            
        						<td> <input type="text" class="settle" name="settle_"""),_display_(Seq[Any](/*181.68*/mediaCollect/*181.80*/.mediaTender.name)),format.raw/*181.97*/("""" value=""""),_display_(Seq[Any](/*181.107*/Shift/*181.112*/.getShiftMediaCollectedSettleAmount(shift.mediaCollects,mediaCollect.mediaTender.name))),format.raw/*181.198*/("""" ></td>                    
             				</tr>
						""")))})),format.raw/*183.8*/("""
							<input type="hidden" class="actual_hidden" value=""""),_display_(Seq[Any](/*184.59*/Shift/*184.64*/.getTotalActualMedialCollected(shift))),format.raw/*184.101*/(""""/>
							<input type="hidden" class="settle_hidden" value=""""),_display_(Seq[Any](/*185.59*/Shift/*185.64*/.getTotalMedialCollected(shift))),format.raw/*185.95*/(""""/>
					</tbody>
				</table>
			""")))})),format.raw/*188.5*/("""
		</div>
		<!-- #tab2 -->
		<h3 class="tab_drawer_heading" rel="tab3">Variance by Media</h3>
		<div id="tab3" class="tab_content">
			
			<table class="table table-bordered">
    			<tbody>
        			<thead>
	 				  	 <th style="background-color:#D0F5A9">Media Variance</th>
	                     <th style="background-color:#D0F5A9"></th>
	                     <th style="background-color:#D0F5A9"></th>
	                     <th style="background-color:#D0F5A9"></th>
	                </thead> 
	      			<tr>
                    	<td> Media Variance Amount</td>
         				<td> <input type="text" id="shiftVariance" name="shiftVariance" class="shiftVariance" value=""""),_display_(Seq[Any](/*204.108*/Shift/*204.113*/.getShiftMediaDifference(shift))),format.raw/*204.144*/("""" ></td>
         				<td> Reason for Media Variance</td>
         				<td> <input type="text" id="varReason" name="varReason" class="varReason" value="default" ></td>
                   </tr>
    			</tbody>
			</table>
			
		</div>
		<!-- #tab3 -->
		<h3 class="tab_drawer_heading" rel="tab4">Register Payouts</h3>
		<div id="tab4" class="tab_content">
				
			"""),_display_(Seq[Any](/*216.5*/if(!isStatusValid("SHIFT").equals("disabled"))/*216.51*/{_display_(Seq[Any](format.raw/*216.52*/("""
	
				<p><label>Search Suppliers</label>
				<input class="text_field dropdown-toggle" id="paysupplierid" name="searchSuppliers" 
					placeholder="Search here for Suppliers" type="text" value="" 
					style="width:203px" onKeyUp="getPayoutSuppliers('REGISTERPAYOUT');"/></p>
	
				<p><label>Similar Supplier Names </label>
				<select class="text_field" id="suppliersid" name="similarSuppliers" size="5" style="width:510px;" onchange="addSuppDetails('REGISTERPAYOUT',"""),_display_(Seq[Any](/*224.146*/shift/*224.151*/.id)),format.raw/*224.154*/(""")" multiple></select>
				</p>
	    	       
			""")))})),format.raw/*227.5*/("""
			<table  id="payTabForm" class="table table-bordered">
	 			<thead>
                	<th style="background-color:#D0F5A9">Supplier Name</th>
                	<th style="background-color:#D0F5A9">Supplier ABN</th>
                	<th style="background-color:#D0F5A9">Total Invoice Amount</th>
                	<th style="background-color:#D0F5A9">Expense Type</th>
                	<th style="background-color:#D0F5A9">File Location</th>
                	<th style="background-color:#D0F5A9">Reason</th>
                	<th style="background-color:#D0F5A9"></th>
				</thead>
				<tbody>
					 """),_display_(Seq[Any](/*239.8*/for(payout <- Payout.getPayoutList(shift.payouts,"REGISTERPAYOUT")) yield /*239.75*/ {_display_(Seq[Any](format.raw/*239.77*/("""
					 
	                    <tr>
	                    	<td>"""),_display_(Seq[Any](/*242.28*/payout/*242.34*/.supplier.name)),format.raw/*242.48*/("""</td>
	                    	<td>"""),_display_(Seq[Any](/*243.28*/payout/*243.34*/.supplier.abn)),format.raw/*243.47*/("""</td>
	                        <td>
	                        	<input type="text" id="""),_display_(Seq[Any](/*245.50*/{payout.id})),format.raw/*245.61*/("""_Amt name="""),_display_(Seq[Any](/*245.72*/{payout.id})),format.raw/*245.83*/("""_Amt class="shiftRegPayout" value=""""),_display_(Seq[Any](/*245.119*/Payout/*245.125*/.getPayoutAmount(payout,"REGISTERPAYOUT" ))),format.raw/*245.167*/("""">
	                        </td>
	                        <td>
		                        <select name=""""),_display_(Seq[Any](/*248.42*/{payout.id})),format.raw/*248.53*/("""_Exp" id=""""),_display_(Seq[Any](/*248.64*/{payout.id})),format.raw/*248.75*/("""_Exp"> 
									"""),_display_(Seq[Any](/*249.11*/for(expenseHead <- store.expenseHeads) yield /*249.49*/ {_display_(Seq[Any](format.raw/*249.51*/("""
										<option value=""""),_display_(Seq[Any](/*250.27*/expenseHead/*250.38*/.id)),format.raw/*250.41*/(""""  name=""""),_display_(Seq[Any](/*250.51*/payout/*250.57*/.category)),format.raw/*250.66*/("""" """),_display_(Seq[Any](/*250.69*/checkSelected(payout.category,expenseHead.id))),format.raw/*250.114*/(""">"""),_display_(Seq[Any](/*250.116*/expenseHead/*250.127*/.name)),format.raw/*250.132*/(""" </option>
									""")))})),format.raw/*251.11*/(""" 
								</select> 
	                        </td>
	                        <td>
		                        <input type="file" name=""""),_display_(Seq[Any](/*255.53*/{payout.id})),format.raw/*255.64*/("""_File" id=""""),_display_(Seq[Any](/*255.76*/{payout.id})),format.raw/*255.87*/("""_File" value=""""),_display_(Seq[Any](/*255.102*/payout/*255.108*/.invoice)),format.raw/*255.116*/("""" >
		                        """),_display_(Seq[Any](/*256.28*/if(payout.invoice!=null)/*256.52*/{_display_(Seq[Any](format.raw/*256.53*/("""
		                        	<a href="javascript:window.open('/INVOICEPROCESSINGSYSTEM/"""),_display_(Seq[Any](/*257.87*/(payout.invoice))),format.raw/*257.103*/("""','_blank','toolbar=yes')" class="btn btn-primary" >Preview Invoice</a>
		                       """)))})),format.raw/*258.27*/("""
	                        </td>
							<td>
								<textarea id="""),_display_(Seq[Any](/*261.23*/{payout.id})),format.raw/*261.34*/("""_reason name="""),_display_(Seq[Any](/*261.48*/{payout.id})),format.raw/*261.59*/("""_reason cols="30" rows="4">"""),_display_(Seq[Any](/*261.87*/payout/*261.93*/.reason)),format.raw/*261.100*/("""</textarea>
							</td>
							<td><INPUT TYPE="Button" CLASS="btn btn-primary" onClick="delRow("""),_display_(Seq[Any](/*263.74*/payout/*263.80*/.id)),format.raw/*263.83*/(""")" VALUE="Delete Row" """),_display_(Seq[Any](/*263.106*/isStatusValid("SHIFT"))),format.raw/*263.128*/("""></td>                  
	                   </tr>
					""")))})),format.raw/*265.7*/("""
				</tbody>
			</table>
		</div>
		<!-- #tab4 -->
		<h3 class="tab_drawer_heading" rel="tab5">Payment Amounts</h3>
		<div id="tab5" class="tab_content">
			"""),_display_(Seq[Any](/*272.5*/if(shift.shiftPayments.size() == 0)/*272.40*/ {_display_(Seq[Any](format.raw/*272.42*/("""
		    	<div class="well">
		            <em>Nothing to display</em>
		        </div>
		    """)))}/*276.9*/else/*276.14*/{_display_(Seq[Any](format.raw/*276.15*/("""
				<table class="table table-bordered">
					<thead>
	 					<th style="background-color:#D0F5A9">Payment Tender</th>
	 					<th style="background-color:#D0F5A9">Payment Amount</th>
	 				</thead> 
					<tbody>
						"""),_display_(Seq[Any](/*283.8*/for(shiftPayment <- shift.shiftPayments) yield /*283.48*/ {_display_(Seq[Any](format.raw/*283.50*/("""
							<tr>
								<td> """),_display_(Seq[Any](/*285.15*/shiftPayment/*285.27*/.paymentTender.name)),format.raw/*285.46*/("""</td>
		    					<td> <input type="text" id=""""),_display_(Seq[Any](/*286.41*/shiftPayment/*286.53*/.paymentTender.name)),format.raw/*286.72*/("""" class ="paymentTender" name=""""),_display_(Seq[Any](/*286.104*/shiftPayment/*286.116*/.paymentTender.name)),format.raw/*286.135*/("""" value=""""),_display_(Seq[Any](/*286.145*/Shift/*286.150*/.getShiftPaymentTenderAmount(shift.shiftPayments , shiftPayment.paymentTender.name))),format.raw/*286.233*/("""" ></td>
		                    </tr>
						""")))})),format.raw/*288.8*/("""
					</tbody>
				</table>
			""")))})),format.raw/*291.5*/("""
		</div>
		<!-- #tab5 -->
	</div>
	<!-- .tab_container -->

  	<!-- bottom div ,for submit and cancel button's -->
    <div style="height:50px; margin-right:50px;  margin-top:10px;">
    	<div>
        	<p style="text-align: right;">  
			
				"""),_display_(Seq[Any](/*302.6*/if((flash.get("pageAction")).equals("MODIFY"))/*302.52*/{_display_(Seq[Any](format.raw/*302.53*/("""
					
					"""),_display_(Seq[Any](/*304.7*/if(PageAccess.getAccess("edit",session.get("role"),shift,"submit"))/*304.74*/{_display_(Seq[Any](format.raw/*304.75*/("""
						<input type="submit" id="btnSubmit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					""")))}/*306.7*/else/*306.11*/{_display_(Seq[Any](format.raw/*306.12*/("""
						<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;" disabled>&nbsp;&nbsp;
					""")))})),format.raw/*308.7*/("""
				""")))})),format.raw/*309.6*/("""
			</p>
	    </div>
    </div>
        
        <!-- div for expense id in javascript,display none -->
        
        	<div id="expense" style="display:none">
		    	"""),_display_(Seq[Any](/*317.9*/select(
	                dsrForm("expId"), 
	                options(ExpenseHead.options), 
	                 '_default -> "-- Choose a ExpenseHead --",
	                '_showConstraints -> false
            	))),format.raw/*322.15*/("""
		    </div>

""")))})),format.raw/*325.2*/("""<!-- form end -->

	</div>
	</div>
""")))})),format.raw/*329.2*/("""<!-- main end -->
"""))}
    }
    
    def render(dsrForm:Form[DailySalesReconciliation],dsrObject:DailySalesReconciliation,store:Store,shift:Shift): play.api.templates.HtmlFormat.Appendable = apply(dsrForm,dsrObject,store,shift)
    
    def f:((Form[DailySalesReconciliation],DailySalesReconciliation,Store,Shift) => play.api.templates.HtmlFormat.Appendable) = (dsrForm,dsrObject,store,shift) => apply(dsrForm,dsrObject,store,shift)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/shifts/editForm.scala.html
                    HASH: 3c956ca134839f280c3749f714d9d5779dc2f5c6
                    MATRIX: 845->1|1078->165|1099->178|1287->357|1309->370|1487->541|1513->558|1732->104|1762->162|1791->352|1822->534|1855->746|1895->751|1907->755|1945->756|2243->1018|2258->1024|2300->1044|2407->1115|2496->1195|2535->1196|2600->1225|2615->1231|2676->1270|2803->1361|2817->1366|2857->1384|2912->1407|3099->1558|3188->1638|3228->1639|3391->1770|3446->1789|3696->2029|3736->2030|3899->2161|4055->2282|4096->2314|4136->2316|4253->2397|4267->2402|4304->2417|4358->2440|4404->2451|4418->2457|4610->2639|4651->2641|4701->2664|4730->2665|4811->2719|4839->2720|5618->3462|5679->3500|5778->3562|5851->3612|5951->3675|5966->3680|6008->3699|6110->3764|6125->3769|6169->3790|6270->3854|6285->3859|6339->3890|6441->3955|6456->3960|6503->3984|6604->4048|6619->4053|6652->4063|6754->4128|6769->4133|6799->4140|7368->4673|7410->4705|7451->4707|7547->4784|7561->4789|7601->4790|7917->5069|7968->5103|8009->5105|8091->5150|8110->5159|8148->5174|8243->5232|8262->5241|8300->5256|8366->5284|8386->5293|8425->5308|8473->5318|8489->5323|8575->5385|8665->5442|8754->5498|8920->5628|8965->5663|9006->5665|9101->5742|9115->5747|9155->5748|9519->6076|9576->6116|9617->6118|9691->6155|9713->6167|9753->6184|9857->6251|9879->6263|9919->6280|9967->6290|9983->6295|10087->6375|10231->6482|10253->6494|10293->6511|10341->6521|10357->6526|10467->6612|10560->6673|10657->6733|10672->6738|10733->6775|10833->6838|10848->6843|10902->6874|10972->6912|11700->7602|11716->7607|11771->7638|12183->8014|12239->8060|12279->8061|12795->8539|12811->8544|12838->8547|12922->8599|13569->9210|13653->9277|13694->9279|13795->9343|13811->9349|13848->9363|13919->9397|13935->9403|13971->9416|14095->9503|14129->9514|14177->9525|14211->9536|14285->9572|14302->9578|14368->9620|14513->9728|14547->9739|14595->9750|14629->9761|14685->9780|14740->9818|14781->9820|14846->9848|14867->9859|14893->9862|14940->9872|14956->9878|14988->9887|15028->9890|15097->9935|15137->9937|15159->9948|15188->9953|15243->9975|15418->10113|15452->10124|15501->10136|15535->10147|15588->10162|15605->10168|15637->10176|15706->10208|15740->10232|15780->10233|15905->10321|15945->10337|16077->10436|16183->10505|16217->10516|16268->10530|16302->10541|16367->10569|16383->10575|16414->10582|16551->10682|16567->10688|16593->10691|16654->10714|16700->10736|16791->10795|16993->10961|17038->10996|17079->10998|17195->11096|17209->11101|17249->11102|17511->11328|17568->11368|17609->11370|17675->11399|17697->11411|17739->11430|17823->11477|17845->11489|17887->11508|17957->11540|17980->11552|18023->11571|18071->11581|18087->11586|18194->11669|18272->11715|18339->11750|18632->12007|18688->12053|18728->12054|18779->12069|18856->12136|18896->12137|19079->12301|19093->12305|19133->12306|19323->12464|19362->12471|19576->12649|19815->12865|19866->12884|19938->12924
                    LINES: 26->1|31->6|31->6|42->19|42->19|52->32|52->32|61->1|63->5|64->17|66->29|69->40|71->42|71->42|71->42|79->50|79->50|79->50|80->51|80->51|80->51|81->52|81->52|81->52|82->53|82->53|82->53|83->54|88->59|88->59|88->59|90->61|91->62|92->63|92->63|94->65|101->72|101->72|101->72|103->74|103->74|103->74|105->76|107->78|107->78|107->78|107->78|110->81|110->81|113->84|113->84|137->108|137->108|139->110|139->110|141->112|141->112|141->112|143->114|143->114|143->114|145->116|145->116|145->116|147->118|147->118|147->118|149->120|149->120|149->120|151->122|151->122|151->122|168->139|168->139|168->139|172->143|172->143|172->143|180->151|180->151|180->151|182->153|182->153|182->153|183->154|183->154|183->154|183->154|183->154|183->154|183->154|183->154|183->154|185->156|188->159|193->164|193->164|193->164|197->168|197->168|197->168|205->176|205->176|205->176|207->178|207->178|207->178|208->179|208->179|208->179|208->179|208->179|208->179|210->181|210->181|210->181|210->181|210->181|210->181|212->183|213->184|213->184|213->184|214->185|214->185|214->185|217->188|233->204|233->204|233->204|245->216|245->216|245->216|253->224|253->224|253->224|256->227|268->239|268->239|268->239|271->242|271->242|271->242|272->243|272->243|272->243|274->245|274->245|274->245|274->245|274->245|274->245|274->245|277->248|277->248|277->248|277->248|278->249|278->249|278->249|279->250|279->250|279->250|279->250|279->250|279->250|279->250|279->250|279->250|279->250|279->250|280->251|284->255|284->255|284->255|284->255|284->255|284->255|284->255|285->256|285->256|285->256|286->257|286->257|287->258|290->261|290->261|290->261|290->261|290->261|290->261|290->261|292->263|292->263|292->263|292->263|292->263|294->265|301->272|301->272|301->272|305->276|305->276|305->276|312->283|312->283|312->283|314->285|314->285|314->285|315->286|315->286|315->286|315->286|315->286|315->286|315->286|315->286|315->286|317->288|320->291|331->302|331->302|331->302|333->304|333->304|333->304|335->306|335->306|335->306|337->308|338->309|346->317|351->322|354->325|358->329
                    -- GENERATED --
                */
            