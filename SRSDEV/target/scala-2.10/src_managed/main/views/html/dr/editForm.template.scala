
package views.html.dr

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Long,Form[DailyReconciliation],DailyReconciliation,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(id:Long, dsrForm: Form[DailyReconciliation],dsrObject: DailyReconciliation, store: Store ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.math.BigInteger; var i=0;var j=0;

import java.lang.String; var display = "";

def /*53.3*/checkSelected/*53.16*/(id:String,eid:Long) = {{
    
    var result = eid.toString();
    
     
       if(result==id){
       	
       	result = "selected";
       	}
    
    result
}};def /*65.3*/currentDateFormat/*65.20*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")
	
	
  curTimeFormat.format(currDate)
  
}};def /*77.2*/isStatusValid/*77.15*/(typeObj:String) = {{

	var result = "";
	if(typeObj.equals("DR")){
	
		if(dsrObject.status.equals("SUBMITTED")){
			result = "disabled" ;
		}
		
	
	}else if(typeObj.equals("DSR")){
		
		if(dsrObject.dsr.status.equals("SUBMITTED")){
			result = "disabled" ;
		}
	
	}
	
	result
}};
Seq[Any](format.raw/*2.93*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
	    <link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
  <style>
    .datepicker"""),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
     
    """),format.raw/*11.5*/("""}"""),format.raw/*11.6*/("""
  </style>
 

 
  <script>
  function viewTimesheet(empId,weekStartDate)"""),format.raw/*17.46*/("""{"""),format.raw/*17.47*/("""
  
  	
  
  	  //var weekStartDate = document.getElementsByName("startdate")[0].value;
  	  weekStartDate = weekStartDate.replace(/[&\/\\#,+()$~%.'":*?<>"""),format.raw/*22.67*/("""{"""),format.raw/*22.68*/("""}"""),format.raw/*22.69*/("""]/g,'-');
  	  
  	 window.open("/drs/summary/"+empId+"/"+weekStartDate ,'_blank','toolbar=yes');
  
  
  """),format.raw/*27.3*/("""}"""),format.raw/*27.4*/("""
  
 
  
  function enableThursday(date) """),format.raw/*31.33*/("""{"""),format.raw/*31.34*/("""

  var day = date.getDay();
 // If day == 1 then it is MOnday
 if (day == 4) """),format.raw/*35.16*/("""{"""),format.raw/*35.17*/("""
 
 return [true] ; 
 
 """),format.raw/*39.2*/("""}"""),format.raw/*39.3*/(""" else """),format.raw/*39.9*/("""{"""),format.raw/*39.10*/(""" 
 
 return [false] ;
 """),format.raw/*42.2*/("""}"""),format.raw/*42.3*/("""
  
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
 $(function() """),format.raw/*45.15*/("""{"""),format.raw/*45.16*/("""
 $( ".datepicker" ).datepicker("""),format.raw/*46.32*/("""{"""),format.raw/*46.33*/("""
 beforeShowDay: enableThursday,dateFormat: "dd/mm/yy"
 """),format.raw/*48.2*/("""}"""),format.raw/*48.3*/(""");
 """),format.raw/*49.2*/("""}"""),format.raw/*49.3*/(""");
  </script>
  

 """),format.raw/*64.2*/("""
 """),format.raw/*75.2*/("""

"""),format.raw/*96.2*/("""

"""),format.raw/*99.1*/("""

"""),format.raw/*102.1*/("""

"""),_display_(Seq[Any](/*104.2*/main/*104.6*/{_display_(Seq[Any](format.raw/*104.7*/("""

	<div class="wrapper" style="height:90%">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*112.24*/routes/*112.30*/.Application.index())),format.raw/*112.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						"""),_display_(Seq[Any](/*113.15*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*113.95*/{_display_(Seq[Any](format.raw/*113.96*/("""
            					<a href=""""),_display_(Seq[Any](/*114.28*/routes/*114.34*/.Application.showOptions("DAILY RECONCILIATION","ALL"))),format.raw/*114.88*/("""" class="btn btn-default">DAILY RECONCILIATION</a>
            					<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*115.55*/flash/*115.60*/.get("pageAction"))),format.raw/*115.78*/("""</a>
            				""")))})),format.raw/*116.18*/("""
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           				 	"""),_display_(Seq[Any](/*121.19*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*121.99*/{_display_(Seq[Any](format.raw/*121.100*/("""
           						<a href=""""),_display_(Seq[Any](/*122.28*/routes/*122.34*/.Application.showOptions("DAILY RECONCILIATION",flash.get("pageAction")))),format.raw/*122.106*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*123.18*/("""
           					"""),_display_(Seq[Any](/*124.18*/if((session.get("role")).contains("admin") || (session.get("role")).contains("su") 
           					|| (session.get("role")).contains("ac") || (session.get("role")).contains("sa") || (session.get("role")).contains("HeadOffice Accountant") )/*125.157*/{_display_(Seq[Any](format.raw/*125.158*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*127.18*/("""	
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
    """),_display_(Seq[Any](/*134.6*/if(flash.containsKey("success"))/*134.38*/ {_display_(Seq[Any](format.raw/*134.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*136.37*/flash/*136.42*/.get("success"))),format.raw/*136.57*/("""
        </div>
    """)))})),format.raw/*138.6*/(""" 
     
"""),_display_(Seq[Any](/*140.2*/helper/*140.8*/.form(action = routes.DailyReconciliations.update(id),'enctype -> "multipart/form-data",'id -> "drEditForm", 'onsubmit -> "return verifyPayoutReqmnts();")/*140.162*/ {_display_(Seq[Any](format.raw/*140.164*/("""
	
	<style>
		table """),format.raw/*143.9*/("""{"""),format.raw/*143.10*/("""
		height: 5px;
	    border: 1px solid black;
    	"""),format.raw/*146.6*/("""}"""),format.raw/*146.7*/("""
	</style>
	
	<h3>"""),_display_(Seq[Any](/*149.7*/store/*149.12*/.name)),format.raw/*149.17*/("""</h3>
		
		<hr/>
		<br/>
	<div class="table-responsive">
		<table class="table table-bordered">
            <thead>
               <tr style="background-color:#58ACFA">
                   
                 	 <th>Created Date</th>
                     <th>Reporting Business Date</th>
                     <th>Last Reporting Date</th>
                         
                      <th>Total Sales Reported</th>
                      <th>Cash in Safe</th>
                      <th>Cheques in Safe</th>
                      <th>Variance</th>
                      <th>Status</th>
                      <th>Sales Analysis Report </th>
                      
               </tr>
            </thead>
            <tbody>

               
                    <tr>
                        <td>"""),_display_(Seq[Any](/*175.30*/currentDateFormat(dsrObject.createDate))),format.raw/*175.69*/("""</td>
                        
                        <td>"""),_display_(Seq[Any](/*177.30*/currentDateFormat(dsrObject.reportingBusinessDate))),format.raw/*177.80*/(""" </td>
                        
                        <td>"""),_display_(Seq[Any](/*179.30*/DailySalesReconciliation/*179.54*/.getLastReportingBusinessDate(store.id))),format.raw/*179.93*/(""" </td>
                         
                        <td> """),_display_(Seq[Any](/*181.31*/DailySalesReconciliation/*181.55*/.getTotalSalesAmount(dsrObject.dsr))),format.raw/*181.90*/("""  </td>
                        
                        <td> """),_display_(Seq[Any](/*183.31*/dsrObject/*183.40*/.close_cash)),format.raw/*183.51*/("""</td> 	
                        <td>  """),_display_(Seq[Any](/*184.32*/dsrObject/*184.41*/.close_cheque)),format.raw/*184.54*/("""  </td> 	
                        <td> """),_display_(Seq[Any](/*185.31*/DailySalesReconciliation/*185.55*/.getVarianceAmount(dsrObject.dsr))),format.raw/*185.88*/(""" </td> 	
                       	<td>
						"""),_display_(Seq[Any](/*187.8*/select(
		  				 dsrForm("status"),
		  				 options(Seq("OPEN","SUBMITTED")),'id -> "drStatusId",
		 				  '_default -> "-- Select Status --"
						))),format.raw/*191.8*/("""</td>
						<td>
            				<div class="clearfix" id="dailyReportFile_field" style="display:none;">
								<label for="dailyReportFile">Select File</label>
									<div class="input">
										<input type="file" id=""""),_display_(Seq[Any](/*196.35*/{id})),format.raw/*196.39*/("""_dailyReportFile" name=""""),_display_(Seq[Any](/*196.64*/{id})),format.raw/*196.68*/("""_dailyReportFile" value=""""),_display_(Seq[Any](/*196.94*/dsrObject/*196.103*/.dailyReportFile)),format.raw/*196.119*/("""" accept="application/pdf" />
									    <span class="help-inline"></span>
									</div>
							</div>
							"""),_display_(Seq[Any](/*200.9*/if(dsrObject.dailyReportFile!=null)/*200.44*/{_display_(Seq[Any](format.raw/*200.45*/("""
			                  """),format.raw/*201.230*/("""
			                  <a href=""""),_display_(Seq[Any](/*202.32*/routes/*202.38*/.Application.checkUrl(dsrObject.dailyReportFile))),format.raw/*202.86*/("""" class="fancyboxPDF btn btn-primary" title="Daily Sales Analysis Report" onclick="OpenFancyBoxForJustView('"""),_display_(Seq[Any](/*202.195*/dsrObject/*202.204*/.id)),format.raw/*202.207*/("""');">Preview Report</a>
			                """)))})),format.raw/*203.21*/("""
			                
					  	</td>
                          
                    </tr>
              

            </tbody>
           
        </table>
       </div>
		<br>
		
              		<ul class="tabs">
  						<li class="active" rel="tab1">Sales Reconciliation</li>
  						<li rel="tab2">Safe Payouts</li>
  						<li rel="tab3">Bank Deposit</li>
  						<li rel="tab4">Pay Wages</li>
					</ul>
					<div class="tab_container">
  						<h3 class="d_active tab_drawer_heading" rel="tab1">Sales Reconciliation</h3>
  						<div id="tab1" class="tab_content">
						 		<div class="table-responsive">
        						<table class="table table-bordered">
            						<tr style="background-color:#D0F5A9">
					                 	 <th>Created Date</th>
					                     <th>Reporting Business Date</th>
					                   	 <th>Total Sales Reported</th>
					                      <th>Total Media Collected</th>
					                      <th>Register Payouts</th>
					                      <th>Other Payouts</th>
					                      <th>CashOuts</th>
					                      <th>Variance</th>
					                      <th>Status</th>
                					</tr> 		
            						<tbody>
						            	"""),_display_(Seq[Any](/*239.21*/if((isStatusValid("DR").equals("disabled")))/*239.65*/{_display_(Seq[Any](format.raw/*239.66*/("""
											
											
											"""),_display_(Seq[Any](/*242.13*/{display="disabled"})),format.raw/*242.33*/("""
											""")))})),format.raw/*243.13*/("""
											"""),_display_(Seq[Any](/*244.13*/if(!(isStatusValid("DR").equals("disabled")) && !(isStatusValid("DSR").equals("disabled")))/*244.104*/{_display_(Seq[Any](format.raw/*244.105*/("""
												"""),_display_(Seq[Any](/*245.14*/{display="disabled"})),format.raw/*245.34*/("""
											""")))})),format.raw/*246.13*/("""
						               
						                    <tr>
						                        <td><a href=""""),_display_(Seq[Any](/*249.45*/routes/*249.51*/.DailySalesReconciliations.edit(dsrObject.dsr.id,flash.get("pageAction")))),format.raw/*249.124*/("""">"""),_display_(Seq[Any](/*249.127*/currentDateFormat(dsrObject.createDate))),format.raw/*249.166*/("""</a></td>
						                        
						                        <td>"""),_display_(Seq[Any](/*251.36*/currentDateFormat(dsrObject.reportingBusinessDate))),format.raw/*251.86*/(""" </td>
						                     
						                        <td> """),_display_(Seq[Any](/*253.37*/DailySalesReconciliation/*253.61*/.getTotalSalesAmount(dsrObject.dsr))),format.raw/*253.96*/(""" </td>
						                        
						                          <td> """),_display_(Seq[Any](/*255.39*/DailySalesReconciliation/*255.63*/.getTotalMediaCollected(dsrObject.dsr))),format.raw/*255.101*/(""" </td>
						                        
						                          <td> """),_display_(Seq[Any](/*257.39*/DailySalesReconciliation/*257.63*/.getTotalPayouts(dsrObject.dsr))),format.raw/*257.94*/(""" </td>
						                        
						                          <td> """),_display_(Seq[Any](/*259.39*/DailySalesReconciliation/*259.63*/.getOtherPayouts(dsrObject.dsr))),format.raw/*259.94*/("""</td>
                          
                          						  <td> """),_display_(Seq[Any](/*261.41*/DailySalesReconciliation/*261.65*/.getTotalCashOuts(dsrObject.dsr))),format.raw/*261.97*/("""</td>
						                       
						                        <td> """),_display_(Seq[Any](/*263.37*/DailySalesReconciliation/*263.61*/.getVarianceAmount(dsrObject.dsr))),format.raw/*263.94*/("""</td> 	
						                        	
						                       	
						                       	<td>
						                       	"""),_display_(Seq[Any](/*267.32*/dsrObject/*267.41*/.dsr.status)),format.raw/*267.52*/("""
												</td>
						                          
						                    </tr>
            						</tbody>
        						</table>
      							</div>
  						</div>
  						<!-- #tab1 -->
  						<h3 class="tab_drawer_heading" rel="tab2">Safe Payouts</h3>
  						<div id="tab2" class="tab_content">
 							"""),_display_(Seq[Any](/*278.10*/if(!isStatusValid("DR").equals("disabled"))/*278.53*/{_display_(Seq[Any](format.raw/*278.54*/("""
    		
								<p><label>Search Suppliers</label>
											<input class="text_field dropdown-toggle" id="paysupplierid" name="searchSuppliers" 
												placeholder="Search here for Suppliers" type="text" value="" 
												style="width:203px" onKeyUp="getPayoutSuppliers('SAFEPAYOUT');"/></p>
										
									<p><label>Similar Supplier Names </label>
					                   <select class="text_field" id="suppliersid" name="similarSuppliers" size="5" style="width:510px;" onchange="addSuppDetails('SAFEPAYOUT',"""),_display_(Seq[Any](/*286.162*/dsrObject/*286.171*/.id)),format.raw/*286.174*/(""")" multiple></select>
					        	</p>
			    			""")))})),format.raw/*288.12*/("""
		  				<div class="table-responsive">
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
							 """),_display_(Seq[Any](/*303.10*/for(payout <- Payout.getPayoutList(dsrObject.payouts,"SAFEPAYOUT")) yield /*303.77*/ {_display_(Seq[Any](format.raw/*303.79*/("""
			                    <tr>
			                    	<td>"""),_display_(Seq[Any](/*305.30*/payout/*305.36*/.supplier.name)),format.raw/*305.50*/("""</td>
			                    	<td>"""),_display_(Seq[Any](/*306.30*/payout/*306.36*/.supplier.description)),format.raw/*306.57*/("""</td>
			                        <td>
			                        <input type="text" id="""),_display_(Seq[Any](/*308.51*/{payout.id})),format.raw/*308.62*/("""_Amt name="""),_display_(Seq[Any](/*308.73*/{payout.id})),format.raw/*308.84*/("""_Amt  class="drRegPayout" value=""""),_display_(Seq[Any](/*308.118*/Payout/*308.124*/.getPayoutAmount(payout,"SAFEPAYOUT" ))),format.raw/*308.162*/("""">
			                                      
			                        </td>
			                        <td>
			                        
			                        <select name=""""),_display_(Seq[Any](/*313.43*/{payout.id})),format.raw/*313.54*/("""_Exp" id=""""),_display_(Seq[Any](/*313.65*/{payout.id})),format.raw/*313.76*/("""_Exp"> 
			                        
			                      
									  """),_display_(Seq[Any](/*316.13*/for(expenseHead <- store.expenseHeads) yield /*316.51*/ {_display_(Seq[Any](format.raw/*316.53*/("""
						                    
						                         <option value=""""),_display_(Seq[Any](/*318.48*/expenseHead/*318.59*/.id)),format.raw/*318.62*/(""""  name=""""),_display_(Seq[Any](/*318.72*/payout/*318.78*/.category)),format.raw/*318.87*/("""" """),_display_(Seq[Any](/*318.90*/checkSelected(payout.category,expenseHead.id))),format.raw/*318.135*/(""">"""),_display_(Seq[Any](/*318.137*/expenseHead/*318.148*/.name)),format.raw/*318.153*/(""" </option>
						                                            
						                  """)))})),format.raw/*320.26*/(""" 
			                 		 </select> 
			                        </td>
			                        <td>
			                      
			                        <input type="file" name=""""),_display_(Seq[Any](/*325.54*/{payout.id})),format.raw/*325.65*/("""_File" id=""""),_display_(Seq[Any](/*325.77*/{payout.id})),format.raw/*325.88*/("""_File" value=""""),_display_(Seq[Any](/*325.103*/payout/*325.109*/.invoice)),format.raw/*325.117*/("""" >
			                        """),_display_(Seq[Any](/*326.29*/if(payout.invoice!=null)/*326.53*/{_display_(Seq[Any](format.raw/*326.54*/("""
			                        <a href="javascript:window.open('/INVOICEPROCESSINGSYSTEM/"""),_display_(Seq[Any](/*327.87*/(payout.invoice))),format.raw/*327.103*/("""','_blank','toolbar=yes')" class="btn btn-primary" >Preview Invoice</a>
			                        
			                       	""")))})),format.raw/*329.29*/("""
			                         
			                        </td>
			                        
			                        <td>
				                        <textarea id="""),_display_(Seq[Any](/*334.43*/{payout.id})),format.raw/*334.54*/("""_reason name="""),_display_(Seq[Any](/*334.68*/{payout.id})),format.raw/*334.79*/("""_reason cols="30" rows="4">"""),_display_(Seq[Any](/*334.107*/payout/*334.113*/.reason)),format.raw/*334.120*/("""</textarea>
				                    </td>
			                         
			                          <td><INPUT TYPE="Button" CLASS="btn btn-primary" onClick="delRow("""),_display_(Seq[Any](/*337.96*/payout/*337.102*/.id)),format.raw/*337.105*/(""")" VALUE="Delete Row" """),_display_(Seq[Any](/*337.128*/isStatusValid("DR"))),format.raw/*337.147*/("""></td>                  
			                             
			                   </tr>
			               """)))})),format.raw/*340.20*/("""
			               
			            </tbody>
            		</table>
            		</div>
  				</div>
  						<!-- #tab2 -->
  						<h3 class="tab_drawer_heading" rel="tab3">Bank Deposit</h3>
  						<div id="tab3" class="tab_content">
     						<div class="table-responsive">
     						<table class="table table-bordered">
					            <thead>
			 				  	 <th style="background-color:#D0F5A9">Banking Details</th>
			                     <th style="background-color:#D0F5A9"></th>
			                     <th style="background-color:#D0F5A9"></th>
			                     <th style="background-color:#D0F5A9"></th>
			                     </thead> 
					            <tbody>
						                <tr>
			                    	 <td> CASH Amount Deposited</td>
			                         <td> <input type="text"  name="cashAmt" class="bankCashAmt" value=""""),_display_(Seq[Any](/*360.97*/dsrObject/*360.106*/.bankDeposit.cashAmt)),format.raw/*360.126*/("""" ></td>
			                         <td> CHEQUE(S) Amount Deposited</td>
			                          <td> <input type="text"  name="chequeAmt" class="bankChequeAmt" value=""""),_display_(Seq[Any](/*362.102*/dsrObject/*362.111*/.bankDeposit.chequeAmt)),format.raw/*362.133*/("""" ></td> 
			                                       
			                      
			              		 </tr>
					
					            </tbody>
		        			</table>
     						</div>
  						</div>
  						<!-- #tab3 -->
  						<h3 class="tab_drawer_heading" rel="tab4">Pay Wages</h3>
  						<div id="tab4" class="tab_content">
	     					<div class="table-responsive">
	     					<table id="payWageSelectForm" class="table table-bordered">
								<thead>
					               
					                <th style="background-color:#D0F5A9">Select Employee</th>
					                <th style="background-color:#D0F5A9">Week Start Date</th>
					                <th style="background-color:#D0F5A9"></th>
					                <th style="background-color:#D0F5A9"></th>
					    		</thead>
    			 
    			 				<tbody>
					    			 <tr>
					    			 	<td> 
					    		 		
					    		 		<select id="empId">
					    			 		 """),_display_(Seq[Any](/*389.18*/for(employee <- Employee.getEmployeesbyStore(store.id)) yield /*389.73*/ {_display_(Seq[Any](format.raw/*389.75*/("""
					    			 		 
					    			 		 	<option value=""""),_display_(Seq[Any](/*391.34*/employee/*391.42*/.id)),format.raw/*391.45*/("""">"""),_display_(Seq[Any](/*391.48*/employee/*391.56*/.firstName)),format.raw/*391.66*/(""" """),_display_(Seq[Any](/*391.68*/employee/*391.76*/.lastName)),format.raw/*391.85*/("""</option>
					    			 		 """)))})),format.raw/*392.18*/("""
					    			 	
					    			 	</select>
					    			 	</td>
					    			 	<td> <input type="text" name="startdate" class="datepicker"  readonly='readonly'/> 
					    			 	<input type="button" value="Add" class="btn btn-primary"  onclick="addPayroll("""),_display_(Seq[Any](/*397.94*/id)),format.raw/*397.96*/(""")" """),_display_(Seq[Any](/*397.100*/isStatusValid("DR"))),format.raw/*397.119*/(""" />	</td>
					    			 	<td></td>
					    			 	<td></td>
					    			 </tr>
					    			 
					    		</tbody>
			
						</table>
			            </div>	       
		  				<div class="table-responsive">
					    <table  id="payWageForm" class="table table-bordered">
					    	 <thead>
			               
			                	<th style="background-color:#D0F5A9">Employee Name</th>
			                	<th style="background-color:#D0F5A9">Start Date</th>
			                	<th style="background-color:#D0F5A9">End Date</th>
			                	<th style="background-color:#D0F5A9">Salary/hr</th>
			                	<th style="background-color:#D0F5A9">Total Timesheet Hours</th>
			                	<th style="background-color:#D0F5A9">Total Amount</th>
			                	<th style="background-color:#D0F5A9"> Previously Paid Amount</th>
			                	<th style="background-color:#D0F5A9">Current Paid Amount</th>
			                	<th style="background-color:#D0F5A9">	</th>
			                	<th style="background-color:#D0F5A9">	</th>
			                
			            	</thead>
            				<tbody>
				
								"""),_display_(Seq[Any](/*424.10*/for(payroll <- dsrObject.payroll) yield /*424.43*/ {_display_(Seq[Any](format.raw/*424.45*/("""
				    			 		 
				    			 		 	<tr>
				    			 		 	<td>"""),_display_(Seq[Any](/*427.22*/(Employee.find.byId(payroll.empid)))),format.raw/*427.57*/("""</td>
				    			 		 	<td> """),_display_(Seq[Any](/*428.23*/currentDateFormat(payroll.from_date))),format.raw/*428.59*/("""</td>
				    			 		 	<td>"""),_display_(Seq[Any](/*429.22*/currentDateFormat(payroll.to_date))),format.raw/*429.56*/("""</td>
				    			 		 	"""),_display_(Seq[Any](/*430.18*/if( Employee.find.byId(payroll.empid) != null )/*430.65*/{_display_(Seq[Any](format.raw/*430.66*/("""
				    			 		 	
				    			 		 		<td>"""),_display_(Seq[Any](/*432.23*/Employee/*432.31*/.find.byId(payroll.empid).sal)),format.raw/*432.60*/("""</td>
				    			 		 		<td>"""),_display_(Seq[Any](/*433.23*/Timesheet/*433.32*/.getTotalTimesheetHours(payroll.empid,Application.getDate(payroll.from_date) ))),format.raw/*433.110*/("""</td>
				    			 		 		<td>"""),_display_(Seq[Any](/*434.23*/Timesheet/*434.32*/.getTotalTimesheetAmount(payroll.empid,payroll.from_date))),format.raw/*434.89*/("""</td>
				    			 		 		<td>"""),_display_(Seq[Any](/*435.23*/Payroll/*435.30*/.getAmountPaidbyWeek(payroll.empid,payroll.from_date,id))),format.raw/*435.86*/("""</td>
																    			 		 	
				    			 		 	""")))}/*437.18*/else/*437.22*/{_display_(Seq[Any](format.raw/*437.23*/("""
				    			 		 	
				    			 		 		<td> - </td>
				    			 		 		<td> - </td>
				    			 		 		<td> - </td>
				    			 		 		<td> - </td>
				    			 		 	""")))})),format.raw/*443.18*/("""
				    			 		 	
				    			 		 	<td><input type="text" class="payAmt" name="payAmt_"""),_display_(Seq[Any](/*445.69*/payroll/*445.76*/.id)),format.raw/*445.79*/("""" id="payAmt_"""),_display_(Seq[Any](/*445.93*/payroll/*445.100*/.id)),format.raw/*445.103*/("""" value=""""),_display_(Seq[Any](/*445.113*/payroll/*445.120*/.payAmt)),format.raw/*445.127*/(""""></td>
				    			 		 	<td><INPUT TYPE="Button" CLASS="btn btn-success" onClick="viewTimesheet('"""),_display_(Seq[Any](/*446.91*/payroll/*446.98*/.empid)),format.raw/*446.104*/("""','"""),_display_(Seq[Any](/*446.108*/currentDateFormat(payroll.from_date))),format.raw/*446.144*/("""')" VALUE="View Summary"></td>
				    			 		 	<td><INPUT TYPE="Button" CLASS="btn btn-primary" onClick="delPayrollRow('"""),_display_(Seq[Any](/*447.91*/payroll/*447.98*/.id)),format.raw/*447.101*/("""')" VALUE="Delete" """),_display_(Seq[Any](/*447.121*/isStatusValid("DR"))),format.raw/*447.140*/("""></td>
				    			 		 	</tr>
				    			 		 """)))})),format.raw/*449.17*/("""
               
            					</tbody>
            				</table>
	     					</div>
  						</div>
  						<!-- #tab4 -->
  						
					</div>
					<!-- .tab_container -->
      			
      		
      	
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
        		
            	<p style="text-align: right;">  
				
					"""),_display_(Seq[Any](/*469.7*/if((flash.get("pageAction")).equals("MODIFY"))/*469.53*/{_display_(Seq[Any](format.raw/*469.54*/("""
						
						
							<input type="submit" id="drButton" class="btn btn-large btn-success" """),_display_(Seq[Any](/*472.78*/display)),format.raw/*472.85*/(""" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
						
					""")))})),format.raw/*474.7*/("""
				</p>
		    </div>
        </div>
        
        
        <!-- div for expense id in javascript,display none -->
        
        	<div id="expense" style="display:none">
		    	"""),_display_(Seq[Any](/*483.9*/select(
	                dsrForm("expId"), 
	                options(ExpenseHead.options), 
	                 '_default -> "-- Choose a ExpenseHead --",
	                '_showConstraints -> false
            	))),format.raw/*488.15*/("""
		    </div>
    
   
  
""")))})),format.raw/*493.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*498.2*/("""<!-- main end -->
"""))}
    }
    
    def render(id:Long,dsrForm:Form[DailyReconciliation],dsrObject:DailyReconciliation,store:Store): play.api.templates.HtmlFormat.Appendable = apply(id,dsrForm,dsrObject,store)
    
    def f:((Long,Form[DailyReconciliation],DailyReconciliation,Store) => play.api.templates.HtmlFormat.Appendable) = (id,dsrForm,dsrObject,store) => apply(id,dsrForm,dsrObject,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:24:57 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dr/editForm.scala.html
                    HASH: d50125b46cebace463db3fbd9b06de7e140782a1
                    MATRIX: 830->3|1145->1190|1167->1203|1355->1381|1381->1398|1591->1599|1613->1612|1940->94|1969->116|1996->152|2353->482|2381->483|2421->496|2449->497|2556->576|2585->577|2772->736|2801->737|2830->738|2968->849|2996->850|3069->895|3098->896|3208->978|3237->979|3292->1007|3320->1008|3353->1014|3382->1015|3435->1041|3463->1042|3496->1048|3524->1049|3568->1065|3597->1066|3658->1099|3687->1100|3772->1158|3800->1159|3832->1164|3860->1165|3911->1377|3941->1594|3972->1909|4003->1961|4035->2010|4076->2015|4089->2019|4128->2020|4421->2276|4437->2282|4480->2302|4588->2373|4678->2453|4718->2454|4784->2483|4800->2489|4877->2543|5020->2649|5035->2654|5076->2672|5132->2695|5320->2846|5410->2926|5451->2927|5517->2956|5533->2962|5629->3034|5746->3118|5802->3137|6054->3378|6095->3379|6259->3510|6417->3632|6459->3664|6500->3666|6618->3747|6633->3752|6671->3767|6726->3790|6773->3801|6788->3807|6953->3961|6995->3963|7046->3986|7076->3987|7158->4041|7187->4042|7245->4064|7260->4069|7288->4074|8142->4891|8204->4930|8303->4992|8376->5042|8476->5105|8510->5129|8572->5168|8674->5233|8708->5257|8766->5292|8868->5357|8887->5366|8921->5377|8998->5417|9017->5426|9053->5439|9131->5480|9165->5504|9221->5537|9304->5584|9480->5738|9747->5968|9774->5972|9836->5997|9863->6001|9926->6027|9946->6036|9986->6052|10141->6171|10186->6206|10226->6207|10279->6438|10349->6471|10365->6477|10436->6525|10583->6634|10603->6643|10630->6646|10708->6691|12028->7974|12082->8018|12122->8019|12199->8059|12242->8079|12289->8093|12340->8107|12442->8198|12483->8199|12535->8214|12578->8234|12625->8248|12763->8349|12779->8355|12876->8428|12917->8431|12980->8470|13095->8548|13168->8598|13278->8671|13312->8695|13370->8730|13485->8808|13519->8832|13581->8870|13696->8948|13730->8972|13784->9003|13899->9081|13933->9105|13987->9136|14099->9211|14133->9235|14188->9267|14299->9341|14333->9365|14389->9398|14567->9539|14586->9548|14620->9559|14981->9883|15034->9926|15074->9927|15646->10461|15666->10470|15693->10473|15780->10527|16568->11278|16652->11345|16693->11347|16790->11407|16806->11413|16843->11427|16916->11463|16932->11469|16976->11490|17103->11580|17137->11591|17185->11602|17219->11613|17291->11647|17308->11653|17370->11691|17592->11876|17626->11887|17674->11898|17708->11909|17822->11986|17877->12024|17918->12026|18032->12103|18053->12114|18079->12117|18126->12127|18142->12133|18174->12142|18214->12145|18283->12190|18323->12192|18345->12203|18374->12208|18496->12297|18718->12482|18752->12493|18801->12505|18835->12516|18888->12531|18905->12537|18937->12545|19007->12578|19041->12602|19081->12603|19206->12691|19246->12707|19409->12837|19616->13007|19650->13018|19701->13032|19735->13043|19801->13071|19818->13077|19849->13084|20055->13253|20072->13259|20099->13262|20160->13285|20203->13304|20344->13412|21262->14293|21282->14302|21326->14322|21541->14499|21561->14508|21607->14530|22584->15470|22656->15525|22697->15527|22787->15580|22805->15588|22831->15591|22871->15594|22889->15602|22922->15612|22961->15614|22979->15622|23011->15631|23072->15659|23365->15915|23390->15917|23432->15921|23475->15940|24670->17098|24720->17131|24761->17133|24860->17195|24918->17230|24984->17259|25043->17295|25108->17323|25165->17357|25226->17381|25283->17428|25323->17429|25402->17471|25420->17479|25472->17508|25538->17537|25557->17546|25659->17624|25725->17653|25744->17662|25824->17719|25890->17748|25907->17755|25986->17811|26060->17865|26074->17869|26114->17870|26308->18031|26433->18119|26450->18126|26476->18129|26527->18143|26545->18150|26572->18153|26620->18163|26638->18170|26669->18177|26805->18276|26822->18283|26852->18289|26894->18293|26954->18329|27113->18451|27130->18458|27157->18461|27215->18481|27258->18500|27338->18547|27817->18990|27873->19036|27913->19037|28045->19132|28075->19139|28202->19234|28432->19428|28671->19644|28735->19676|28809->19718
                    LINES: 26->2|35->53|35->53|46->65|46->65|56->77|56->77|76->2|77->4|77->5|81->9|81->9|83->11|83->11|89->17|89->17|94->22|94->22|94->22|99->27|99->27|103->31|103->31|107->35|107->35|111->39|111->39|111->39|111->39|114->42|114->42|116->44|116->44|117->45|117->45|118->46|118->46|120->48|120->48|121->49|121->49|125->64|126->75|128->96|130->99|132->102|134->104|134->104|134->104|142->112|142->112|142->112|143->113|143->113|143->113|144->114|144->114|144->114|145->115|145->115|145->115|146->116|151->121|151->121|151->121|152->122|152->122|152->122|153->123|154->124|155->125|155->125|157->127|164->134|164->134|164->134|166->136|166->136|166->136|168->138|170->140|170->140|170->140|170->140|173->143|173->143|176->146|176->146|179->149|179->149|179->149|205->175|205->175|207->177|207->177|209->179|209->179|209->179|211->181|211->181|211->181|213->183|213->183|213->183|214->184|214->184|214->184|215->185|215->185|215->185|217->187|221->191|226->196|226->196|226->196|226->196|226->196|226->196|226->196|230->200|230->200|230->200|231->201|232->202|232->202|232->202|232->202|232->202|232->202|233->203|269->239|269->239|269->239|272->242|272->242|273->243|274->244|274->244|274->244|275->245|275->245|276->246|279->249|279->249|279->249|279->249|279->249|281->251|281->251|283->253|283->253|283->253|285->255|285->255|285->255|287->257|287->257|287->257|289->259|289->259|289->259|291->261|291->261|291->261|293->263|293->263|293->263|297->267|297->267|297->267|308->278|308->278|308->278|316->286|316->286|316->286|318->288|333->303|333->303|333->303|335->305|335->305|335->305|336->306|336->306|336->306|338->308|338->308|338->308|338->308|338->308|338->308|338->308|343->313|343->313|343->313|343->313|346->316|346->316|346->316|348->318|348->318|348->318|348->318|348->318|348->318|348->318|348->318|348->318|348->318|348->318|350->320|355->325|355->325|355->325|355->325|355->325|355->325|355->325|356->326|356->326|356->326|357->327|357->327|359->329|364->334|364->334|364->334|364->334|364->334|364->334|364->334|367->337|367->337|367->337|367->337|367->337|370->340|390->360|390->360|390->360|392->362|392->362|392->362|419->389|419->389|419->389|421->391|421->391|421->391|421->391|421->391|421->391|421->391|421->391|421->391|422->392|427->397|427->397|427->397|427->397|454->424|454->424|454->424|457->427|457->427|458->428|458->428|459->429|459->429|460->430|460->430|460->430|462->432|462->432|462->432|463->433|463->433|463->433|464->434|464->434|464->434|465->435|465->435|465->435|467->437|467->437|467->437|473->443|475->445|475->445|475->445|475->445|475->445|475->445|475->445|475->445|475->445|476->446|476->446|476->446|476->446|476->446|477->447|477->447|477->447|477->447|477->447|479->449|499->469|499->469|499->469|502->472|502->472|504->474|513->483|518->488|523->493|528->498
                    -- GENERATED --
                */
            