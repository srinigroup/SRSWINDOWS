
package views.html.stores

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[Long,Form[Store],Form[ContactInfo],Form[Address],Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(id:Long, storeForm: Form[Store], contactForm: Form[ContactInfo], addressForm: Form[Address],store:Store ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.lang.String; var display = ""; var fieldView = ""; 

def /*5.3*/checkSelected/*5.16*/(headType:String, id:Long) = {{
    
    var result = ""
    if(headType.equals("saleshead")){
	    for(saleshead <- store.salesHeads) {
	       if(saleshead.id==id){
	       	
	       	result = "checked"
	       	}
	    }
	  }
	  else if(headType.equals("totalsaleshead")){
	    for(totalsaleshead <- store.totalSalesHeads) {
	       if(totalsaleshead.id==id){
	       	
	       	result = "checked"
	       	}
	    }
	  }
	  else if(headType.equals("mediatender"))
	  {
	    for(mediatender <- store.mediaTenderHeads) {
	       if(mediatender.id==id){
	       	
	       	result = "checked"
	       	}
	    }
	  }
	  else if(headType.equals("paymentTender"))
	  {
	    for(paymentTender <- store.paymentTenders) {
	       if(paymentTender.id==id){
	       	
	       	result = "checked"
	       	}
	    }
	  }
	  else if(headType.equals("terminalhead"))
	  {
	    for(terminalhead <- store.terminalHeads) {
	       if(terminalhead.id==id){
	       	
	       	result = "checked"
	       	}
	    }
	  }
	  else {	  
	  for(expensehead <- store.expenseHeads) {
	       if(expensehead.id==id){
	       	
	       	result = "checked"
	       	}
	  
	 	 }
	  }
    result
}};def /*63.2*/checkSelectedSupp/*63.19*/(id:String,sid:String) = {{
	
	var result = "";
	
	if(id==sid){
       	
       	result = "selected";
       	}
    
    result

}};
Seq[Any](format.raw/*2.108*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" """),format.raw/*61.2*/("""

"""),format.raw/*74.2*/("""

"""),format.raw/*77.1*/("""
"""),_display_(Seq[Any](/*78.2*/if(DailyReconciliations.getOPENStatus(store.id))/*78.50*/{_display_(Seq[Any](format.raw/*78.51*/("""

	"""),_display_(Seq[Any](/*80.3*/{display="disabled"})),format.raw/*80.23*/("""

""")))})),format.raw/*82.2*/("""

"""),_display_(Seq[Any](/*84.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*84.88*/{_display_(Seq[Any](format.raw/*84.89*/("""

	"""),_display_(Seq[Any](/*86.3*/{fieldView="disabled"})),format.raw/*86.25*/("""

""")))})),format.raw/*88.2*/("""

"""),_display_(Seq[Any](/*90.2*/main/*90.6*/{_display_(Seq[Any](format.raw/*90.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*98.24*/routes/*98.30*/.Application.index())),format.raw/*98.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*99.27*/routes/*99.33*/.Application.showOptions("STORE","ALL"))),format.raw/*99.72*/("""" class="btn btn-default">STORE</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*100.54*/flash/*100.59*/.get("pageAction"))),format.raw/*100.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*105.27*/routes/*105.33*/.Application.showOptions("STORE",flash.get("pageAction")))),format.raw/*105.90*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*113.3*/if(flash.containsKey("success"))/*113.35*/ {_display_(Seq[Any](format.raw/*113.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*115.37*/flash/*115.42*/.get("success"))),format.raw/*115.57*/("""
        </div>
    """)))})),format.raw/*117.6*/(""" 


 """),_display_(Seq[Any](/*120.3*/if(flash.containsKey("DROpenStatusError"))/*120.45*/ {_display_(Seq[Any](format.raw/*120.47*/("""
        <div class="alert alert-warning">
            <strong>Error!</strong> """),_display_(Seq[Any](/*122.38*/flash/*122.43*/.get("DROpenStatusError"))),format.raw/*122.68*/("""
        </div>
    """)))})),format.raw/*124.6*/(""" 
   
 
"""),_display_(Seq[Any](/*127.2*/helper/*127.8*/.form(action = routes.Stores.update(id))/*127.48*/ {_display_(Seq[Any](format.raw/*127.50*/("""


	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Store Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*149.15*/select(
					                storeForm("company.id"), 
					                options(Company.options), 
					                '_label -> "Company", '_default -> "-- Choose a company --",
					                '_showConstraints -> false
					            	))),format.raw/*154.20*/("""
								</td>
								<td>"""),_display_(Seq[Any](/*156.14*/helper/*156.20*/.inputText(storeForm("name"), '_label -> "Store Name:"))),format.raw/*156.75*/("""</td>
					
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*160.14*/helper/*160.20*/.inputText(storeForm("description"), '_label -> "Store Description:"))),format.raw/*160.89*/("""</td>
								<td></td>
							</tr>
						</table>
					</div>
            	</div>
        	</div>
      	</div><!-- panel-primary 1 End-->
      	
      	<!-- panel-primary 2-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionTwo">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Contact Info
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionTwo" class="panel-collapse collapse">
          		<div class="panel-body">
           			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td>
									 """),_display_(Seq[Any](/*186.12*/helper/*186.18*/.inputText(contactForm("phone1"), '_label -> "Store phone1 :"))),format.raw/*186.80*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*190.12*/helper/*190.18*/.inputText(contactForm("email"), '_label -> "Store E-Mail :"))),format.raw/*190.79*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*194.16*/helper/*194.22*/.inputText(contactForm("phone2"), '_label -> "Store phone2"))),format.raw/*194.82*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*198.11*/helper/*198.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*198.75*/("""
								</td>
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 2 End-->
      	
      	<!-- panel-primary 3-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionThree">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Address
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionThree" class="panel-collapse collapse">
          		<div class="panel-body">
           			<div class="table-responsive"> 
        				<table class="table table-bordered" >
        					"""),_display_(Seq[Any](/*222.15*/if(!fieldView.equals("disabled"))/*222.48*/{_display_(Seq[Any](format.raw/*222.49*/("""
								<tr colspan=2>
									<td>
										<p><label>Search Address</label>
										<input class="text_field" id="addressid" name="searchAddress" type="text" value="" style="width:500px;" onblur="getParsedAddress();getSimilar();"/></p>
										<p><label>Similar Addresses </label>
					                  	<select class="text_field" id="similarAddressesid" name="similarAddresses" size="5" style="width:510px;" onchange="similarAddressesChange()" multiple></select></p>
					                </td>
									<td></td>
								
								</tr>
							""")))})),format.raw/*233.9*/("""
							<tr>
								<td> """),_display_(Seq[Any](/*235.15*/helper/*235.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*235.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*237.15*/helper/*237.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*237.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*241.14*/helper/*241.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*241.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*245.11*/helper/*245.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*245.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*249.15*/helper/*249.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*249.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*251.16*/helper/*251.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*251.80*/(""" </td>
								
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 3 End-->
      	
      	<!-- panel-primary 4-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionFour">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Head Mappings
              			<i class="icon-lock icon-large pull-right"></i>
              		 </h4>
             	</a>     
        	</div>
        	<div id="accordionFour" class="panel-collapse collapse">
          		<div class="panel-body">
              		<ul class="tabs">
  						<li class="active" rel="tab1">SalesHeads</li>
  						<li rel="tab2">MediaTenders</li>
  						<li rel="tab3">ExpenseHeads</li>
  						<li rel="tab4">TerminalHeads</li>
  						<li rel="tab5">PaymentTenders</li>
					</ul>
					<div class="tab_container">
  						<h3 class="d_active tab_drawer_heading" rel="tab1">SalesHeads</h3>
  						<div id="tab1" class="tab_content">
						 	 
        						<table class="table table-bordered">
            						<tbody>
                						"""),_display_(Seq[Any](/*286.24*/for(saleshead <- SalesHead.find.where().eq("status", "ACTIVE").orderBy("name").findList()) yield /*286.114*/ {_display_(Seq[Any](format.raw/*286.116*/("""
                    						<tr>
                        						<td><input type="checkbox" id=""""),_display_(Seq[Any](/*288.63*/saleshead/*288.72*/.id)),format.raw/*288.75*/("""" name="salesheadslist[]" value=""""),_display_(Seq[Any](/*288.109*/saleshead/*288.118*/.id)),format.raw/*288.121*/(""""  """),_display_(Seq[Any](/*288.125*/checkSelected("saleshead",saleshead.id))),format.raw/*288.164*/(""" > """),_display_(Seq[Any](/*288.168*/saleshead/*288.177*/.name)),format.raw/*288.182*/("""</td>
                               				</tr>
               							""")))})),format.raw/*290.24*/("""
               						</tbody>
        						</table>
      						
  						</div>
  						<!-- #tab1 -->
  						<h3 class="tab_drawer_heading" rel="tab2">MediaTenders</h3>
  						<div id="tab2" class="tab_content">
 							
        						<table class="table table-bordered">
            						<tbody>
                						"""),_display_(Seq[Any](/*301.24*/for(mediatender <- MediaTender.find.where().eq("status", "ACTIVE").orderBy("name").findList()) yield /*301.118*/ {_display_(Seq[Any](format.raw/*301.120*/("""
                    						<tr>
                        						<td><input type="checkbox" id=""""),_display_(Seq[Any](/*303.63*/mediatender/*303.74*/.id)),format.raw/*303.77*/("""" name="mediatenderslist[]" value=""""),_display_(Seq[Any](/*303.113*/mediatender/*303.124*/.id)),format.raw/*303.127*/("""" """),_display_(Seq[Any](/*303.130*/checkSelected("mediatender",mediatender.id))),format.raw/*303.173*/(""" > """),_display_(Seq[Any](/*303.177*/mediatender/*303.188*/.name)),format.raw/*303.193*/("""</td>
                                            </tr>
               							""")))})),format.raw/*305.24*/("""
               						</tbody>
        						</table>
      						
  						</div>
  						<!-- #tab2 -->
  						<h3 class="tab_drawer_heading" rel="tab3">ExpenseHeads</h3>
  						<div id="tab3" class="tab_content">
     						
		        				<table class="table table-bordered">
		            				<tbody>
		                				"""),_display_(Seq[Any](/*316.24*/for(expensehead <- ExpenseHead.find.where().eq("status", "ACTIVE").orderBy("name").findList()) yield /*316.118*/ {_display_(Seq[Any](format.raw/*316.120*/("""
		                    				<tr>
		                        				<td><input type="checkbox" id=""""),_display_(Seq[Any](/*318.63*/expensehead/*318.74*/.id)),format.raw/*318.77*/("""" name="expenseheadslist[]" value=""""),_display_(Seq[Any](/*318.113*/expensehead/*318.124*/.id)),format.raw/*318.127*/("""" """),_display_(Seq[Any](/*318.130*/checkSelected("expensehead",expensehead.id))),format.raw/*318.173*/("""> """),_display_(Seq[Any](/*318.176*/expensehead/*318.187*/.name)),format.raw/*318.192*/("""</td>
		                             		</tr>
		               					""")))})),format.raw/*320.24*/("""
		               	            </tbody>
		        				</table>
		      				
  						</div>
  						<!-- #tab3 -->
  						<h3 class="tab_drawer_heading" rel="tab4">TerminalHeads</h3>
  						<div id="tab4" class="tab_content">
	     						
			        			<table class="table table-bordered">
			            			<tbody>
			            				"""),_display_(Seq[Any](/*331.21*/for(terminalhead <- TerminalHead.find.where().eq("status", "ACTIVE").orderBy("name").findList()) yield /*331.117*/ {_display_(Seq[Any](format.raw/*331.119*/("""
			                    			<tr>
			                        			<td><input type="checkbox" id=""""),_display_(Seq[Any](/*333.63*/terminalhead/*333.75*/.id)),format.raw/*333.78*/("""" name="terminalheadslist[]" value=""""),_display_(Seq[Any](/*333.115*/terminalhead/*333.127*/.id)),format.raw/*333.130*/(""""  """),_display_(Seq[Any](/*333.134*/checkSelected("terminalhead",terminalhead.id))),format.raw/*333.179*/(""" > """),_display_(Seq[Any](/*333.183*/terminalhead/*333.195*/.name)),format.raw/*333.200*/("""</td>
			                                </tr>
			               				""")))})),format.raw/*335.24*/("""
			            			</tbody>
			        			</table>
			      			
  						</div>
  						<!-- #tab4 -->
  						<h3 class="tab_drawer_heading" rel="tab5">PaymentTenders</h3>
  						<div id="tab5" class="tab_content">
	     						
			        			<table class="table table-bordered">
			            			<tbody>
			            				"""),_display_(Seq[Any](/*346.21*/for(paymentTender <- PaymentTender.find.where().eq("status", "ACTIVE").orderBy("name").findList()) yield /*346.119*/ {_display_(Seq[Any](format.raw/*346.121*/("""
			                    			<tr>
			                        			<td><input type="checkbox" id=""""),_display_(Seq[Any](/*348.63*/paymentTender/*348.76*/.id)),format.raw/*348.79*/("""" name="paymentTenderslist[]" value=""""),_display_(Seq[Any](/*348.117*/paymentTender/*348.130*/.id)),format.raw/*348.133*/(""""  """),_display_(Seq[Any](/*348.137*/checkSelected("paymentTender",paymentTender.id))),format.raw/*348.184*/(""" > """),_display_(Seq[Any](/*348.188*/paymentTender/*348.201*/.name)),format.raw/*348.206*/("""</td>
			                                </tr>
			               				""")))})),format.raw/*350.24*/("""
			            			</tbody>
			        			</table>
			      			
  						</div>
  						<!-- #tab5 -->
					</div>
					<!-- .tab_container -->
      			</div><!-- panel body -->
      		</div><!-- accordion -->
      	</div><!-- panel-primary 4 End-->
      		
	     <!-- panel-primary 5-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionFive">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Supplier Mappings
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionFive" class="panel-collapse collapse">
          		<div class="panel-body">
          			"""),_display_(Seq[Any](/*375.15*/if(!fieldView.equals("disabled"))/*375.48*/{_display_(Seq[Any](format.raw/*375.49*/("""
	          			<p><label>Search Suppliers</label>
							<input class="text_field" id="supplierid" name="searchStores" type="text" value="" style="width:500px;" onblur="getSuppliers()"/></p>
	
					
						<p><label>Similar Supplier Names </label>
	                		<!--  <select class="text_field" id="similarSuppliersid" name="similarSuppliers" size="5" style="width:510px;" onchange="similarSupplierChange()" multiple></select> -->
	                  		<select class="text_field" id="similarSuppliersid" name="similarSuppliers" size="5" style="width:510px;" onchange="similarSupplierChange1("""),_display_(Seq[Any](/*382.161*/store/*382.166*/.id)),format.raw/*382.169*/(""")" multiple></select>
	        			</p>
        			""")))})),format.raw/*384.13*/("""
           			<div class="table-responsive"> 
        				<table  id="cblist" class="table table-bordered">
        					<thead>
                				<th style="background-color:#D0F5A9">Supplier Name</th>
                				<th style="background-color:#D0F5A9">Supplier ABN</th>
                				<th style="background-color:#D0F5A9">Payment Terms</th>
                				<th style="background-color:#D0F5A9">Payment Mode</th>
                				<th style="background-color:#D0F5A9"></th>
            				</thead>
            				<tbody>
             					<div id="paymentTermsDiv" style="display:none">
                        
									<select id="paymentTerms" name="paymentTerms" >
										<option class="blank" value="">-- Choose a Payment Term --</option>
					  					<option value=SUPP_SM_PT_1 >As per Invoice</option>
				                        <option value=SUPP_SM_PT_2 >Due Date</option>
				                        <option value=SUPP_SM_PT_3 >Fortnightly</option>
				                        <option value=SUPP_SM_PT_4 >Monthly</option>
				                        <option value=SUPP_SM_PT_5 >Quarterly</option>
				                        <option value=SUPP_SM_PT_6 >Same Day</option>
				                        <option value=SUPP_SM_PT_7 >Twice a Week</option>
				                        <option value=SUPP_SM_PT_8 >Weekly</option>
				                        <option value=SUPP_SM_PT_9 >Weekly Monday</option>
				                        <option value=SUPP_SM_PT_10 >10 Days</option>
		                            </select>   
                          		</div> 
                				<div id="paymentModeDiv" style="display:none">
                       
									<select id="paymentMode" name="paymentMode" >
										<option class="blank" value="">-- Choose a Payment Mode --</option>
					  					<option value=SUPP_SM_PM_1 >BPay</option>
				                        <option value=SUPP_SM_PM_2 >Cash</option>
				                        <option value=SUPP_SM_PM_3 >DD</option>
				                        <option value=SUPP_SM_PM_4 >EFT</option>
				                        <option value=SUPP_SM_PM_5 >EFT/Cash</option>
		                            </select> 
                          		</div>  
								 """),_display_(Seq[Any](/*422.11*/for(supplierMapping <- store.supplierMapping) yield /*422.56*/ {_display_(Seq[Any](format.raw/*422.58*/("""
					                    <tr>
					                        <td>"""),_display_(Seq[Any](/*424.35*/supplierMapping/*424.50*/.supplier.name)),format.raw/*424.64*/("""</td>
					                        <td>"""),_display_(Seq[Any](/*425.35*/supplierMapping/*425.50*/.supplier.abn)),format.raw/*425.63*/("""</td>
					                        <td>
					                         
												<select  name="""),_display_(Seq[Any](/*428.28*/{supplierMapping.id})),format.raw/*428.48*/("""_paymentTerms >
													
							                        <option class="blank" value="">-- Choose a Payment Term --</option>
								  					<option value=SUPP_SM_PT_1 """),_display_(Seq[Any](/*431.44*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_1"))),format.raw/*431.106*/(""">As per Invoice</option>
							                        <option value=SUPP_SM_PT_2 """),_display_(Seq[Any](/*432.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_2"))),format.raw/*432.122*/(""">Due Date</option>
							                        <option value=SUPP_SM_PT_3 """),_display_(Seq[Any](/*433.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_3"))),format.raw/*433.122*/(""">Fortnightly</option>
							                        <option value=SUPP_SM_PT_4 """),_display_(Seq[Any](/*434.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_4"))),format.raw/*434.122*/(""">Monthly</option>
							                        <option value=SUPP_SM_PT_5 """),_display_(Seq[Any](/*435.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_5"))),format.raw/*435.122*/(""">Quarterly</option>
							                        <option value=SUPP_SM_PT_6 """),_display_(Seq[Any](/*436.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_6"))),format.raw/*436.122*/(""">Same Day</option>
							                        <option value=SUPP_SM_PT_7 """),_display_(Seq[Any](/*437.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_7"))),format.raw/*437.122*/(""">Twice a Week</option>
							                        <option value=SUPP_SM_PT_8 """),_display_(Seq[Any](/*438.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_8"))),format.raw/*438.122*/(""">Weekly</option>
							                        <option value=SUPP_SM_PT_9 """),_display_(Seq[Any](/*439.60*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_9"))),format.raw/*439.122*/(""">Weekly Monday</option>
							                        <option value=SUPP_SM_PT_10 """),_display_(Seq[Any](/*440.61*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_10"))),format.raw/*440.124*/(""">10 Days</option>
					                            </select>   
					                  		</td>              
					                         <td>
					                         <select  name="""),_display_(Seq[Any](/*444.46*/{supplierMapping.id})),format.raw/*444.66*/("""_paymentMode >
													
							                        <option class="blank" value="">-- Choose a Payment Mode --</option>
								  					<option value=SUPP_SM_PM_1 """),_display_(Seq[Any](/*447.44*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_1"))),format.raw/*447.105*/(""">BPay</option>
							                        <option value=SUPP_SM_PM_2 """),_display_(Seq[Any](/*448.60*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_2"))),format.raw/*448.121*/(""">Cash</option>
							                        <option value=SUPP_SM_PM_3 """),_display_(Seq[Any](/*449.60*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_3"))),format.raw/*449.121*/(""">DD</option>
							                        <option value=SUPP_SM_PM_4 """),_display_(Seq[Any](/*450.60*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_4"))),format.raw/*450.121*/(""">EFT</option>
							                        <option value=SUPP_SM_PM_5 """),_display_(Seq[Any](/*451.60*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_5"))),format.raw/*451.121*/(""">EFT/Cash</option>
					                            </select> 
					                  		</td>
					                  		<td><INPUT TYPE="Button" id="b_"""),_display_(Seq[Any](/*454.58*/{supplierMapping.supplier.id})),format.raw/*454.87*/("""" CLASS="btn btn-primary" onClick="delSupplierMapping("""),_display_(Seq[Any](/*454.142*/supplierMapping/*454.157*/.id)),format.raw/*454.160*/(""")" VALUE="Delete" """),_display_(Seq[Any](/*454.179*/fieldView)),format.raw/*454.188*/("""></td>
					                  		
					               </tr>
					               """)))})),format.raw/*457.22*/("""
               
            				</tbody>
        				</table>
					</div>
      			</div>
          		
        	</div>
      	</div><!-- panel-primary 5 End-->
	    	
      	
      	
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right;">  
				"""),_display_(Seq[Any](/*474.6*/if((flash.get("pageAction")).equals("MODIFY"))/*474.52*/{_display_(Seq[Any](format.raw/*474.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px;padding-left:40px; text-align:center;" """),_display_(Seq[Any](/*475.127*/display)),format.raw/*475.134*/(""">&nbsp;&nbsp;
					
				""")))})),format.raw/*477.6*/("""
				"""),_display_(Seq[Any](/*478.6*/if((flash.get("pageAction")).equals("DELETE"))/*478.52*/{_display_(Seq[Any](format.raw/*478.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*480.17*/routes/*480.23*/.Stores.delete(id))),format.raw/*480.41*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')" """),_display_(Seq[Any](/*480.125*/display)),format.raw/*480.132*/(""">Delete</a>
	 				
	 			""")))})),format.raw/*482.7*/("""
 				</p>
		    </div>
        </div>
       
    
    </div><!-- panel-group End-->
	
	
	""")))})),format.raw/*491.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*496.2*/("""<!-- main end -->
"""))}
    }
    
    def render(id:Long,storeForm:Form[Store],contactForm:Form[ContactInfo],addressForm:Form[Address],store:Store): play.api.templates.HtmlFormat.Appendable = apply(id,storeForm,contactForm,addressForm,store)
    
    def f:((Long,Form[Store],Form[ContactInfo],Form[Address],Store) => play.api.templates.HtmlFormat.Appendable) = (id,storeForm,contactForm,addressForm,store) => apply(id,storeForm,contactForm,addressForm,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:10 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/stores/editForm.scala.html
                    HASH: 8aa200b034a65b071a72f8ac57df0d8cc59f142a
                    MATRIX: 832->2|1131->165|1152->178|2331->1346|2357->1363|2518->108|2546->128|2573->163|2601->1343|2630->1491|2659->1558|2696->1560|2753->1608|2792->1609|2831->1613|2873->1633|2907->1636|2945->1639|3040->1725|3079->1726|3118->1730|3162->1752|3196->1755|3234->1758|3246->1762|3284->1763|3549->1992|3564->1998|3606->2018|3724->2100|3739->2106|3800->2145|3926->2234|3941->2239|3982->2257|4177->2415|4193->2421|4273->2478|4474->2643|4516->2675|4557->2677|4673->2756|4688->2761|4726->2776|4779->2797|4821->2803|4873->2845|4914->2847|5031->2927|5046->2932|5094->2957|5147->2978|5192->2987|5207->2993|5257->3033|5298->3035|6058->3758|6333->4010|6398->4038|6414->4044|6492->4099|6579->4149|6595->4155|6687->4224|7540->5040|7556->5046|7641->5108|7726->5156|7742->5162|7826->5223|7918->5278|7934->5284|8017->5344|8102->5392|8118->5398|8199->5456|9016->6236|9059->6269|9099->6270|9686->6825|9750->6852|9766->6858|9843->6912|9909->6941|9925->6947|10000->6999|10091->7053|10107->7059|10186->7115|10272->7164|10288->7170|10365->7224|10456->7278|10472->7284|10559->7348|10627->7379|10643->7385|10724->7443|11971->8653|12079->8743|12121->8745|12252->8839|12271->8848|12297->8851|12369->8885|12389->8894|12416->8897|12458->8901|12521->8940|12563->8944|12583->8953|12612->8958|12715->9028|13078->9354|13190->9448|13232->9450|13363->9544|13384->9555|13410->9558|13484->9594|13506->9605|13533->9608|13574->9611|13641->9654|13683->9658|13705->9669|13734->9674|13846->9753|14212->10082|14324->10176|14366->10178|14497->10272|14518->10283|14544->10286|14618->10322|14640->10333|14667->10336|14708->10339|14775->10382|14816->10385|14838->10396|14867->10401|14968->10469|15342->10806|15456->10902|15498->10904|15629->10998|15651->11010|15677->11013|15752->11050|15775->11062|15802->11065|15844->11069|15913->11114|15955->11118|15978->11130|16007->11135|16110->11205|16473->11531|16589->11629|16631->11631|16762->11725|16785->11738|16811->11741|16887->11779|16911->11792|16938->11795|16980->11799|17051->11846|17093->11850|17117->11863|17146->11868|17249->11938|18102->12754|18145->12787|18185->12788|18818->13383|18834->13388|18861->13391|18945->13442|21218->15678|21280->15723|21321->15725|21423->15790|21448->15805|21485->15819|21562->15859|21587->15874|21623->15887|21758->15985|21801->16005|22010->16177|22096->16239|22217->16323|22303->16385|22418->16463|22504->16525|22622->16606|22708->16668|22822->16745|22908->16807|23024->16886|23110->16948|23225->17026|23311->17088|23430->17170|23516->17232|23629->17308|23715->17370|23836->17454|23923->17517|24149->17706|24192->17726|24400->17897|24485->17958|24596->18032|24681->18093|24792->18167|24877->18228|24986->18300|25071->18361|25181->18434|25266->18495|25454->18646|25506->18675|25599->18730|25625->18745|25652->18748|25709->18767|25742->18776|25855->18856|26280->19245|26336->19291|26376->19292|26541->19419|26572->19426|26629->19451|26671->19457|26727->19503|26767->19504|26827->19527|26843->19533|26884->19551|27006->19635|27037->19642|27094->19667|27218->19759|27288->19797
                    LINES: 26->2|33->5|33->5|89->63|89->63|101->2|102->4|102->5|102->61|104->74|106->77|107->78|107->78|107->78|109->80|109->80|111->82|113->84|113->84|113->84|115->86|115->86|117->88|119->90|119->90|119->90|127->98|127->98|127->98|128->99|128->99|128->99|129->100|129->100|129->100|134->105|134->105|134->105|142->113|142->113|142->113|144->115|144->115|144->115|146->117|149->120|149->120|149->120|151->122|151->122|151->122|153->124|156->127|156->127|156->127|156->127|178->149|183->154|185->156|185->156|185->156|189->160|189->160|189->160|215->186|215->186|215->186|219->190|219->190|219->190|223->194|223->194|223->194|227->198|227->198|227->198|251->222|251->222|251->222|262->233|264->235|264->235|264->235|266->237|266->237|266->237|270->241|270->241|270->241|274->245|274->245|274->245|278->249|278->249|278->249|280->251|280->251|280->251|315->286|315->286|315->286|317->288|317->288|317->288|317->288|317->288|317->288|317->288|317->288|317->288|317->288|317->288|319->290|330->301|330->301|330->301|332->303|332->303|332->303|332->303|332->303|332->303|332->303|332->303|332->303|332->303|332->303|334->305|345->316|345->316|345->316|347->318|347->318|347->318|347->318|347->318|347->318|347->318|347->318|347->318|347->318|347->318|349->320|360->331|360->331|360->331|362->333|362->333|362->333|362->333|362->333|362->333|362->333|362->333|362->333|362->333|362->333|364->335|375->346|375->346|375->346|377->348|377->348|377->348|377->348|377->348|377->348|377->348|377->348|377->348|377->348|377->348|379->350|404->375|404->375|404->375|411->382|411->382|411->382|413->384|451->422|451->422|451->422|453->424|453->424|453->424|454->425|454->425|454->425|457->428|457->428|460->431|460->431|461->432|461->432|462->433|462->433|463->434|463->434|464->435|464->435|465->436|465->436|466->437|466->437|467->438|467->438|468->439|468->439|469->440|469->440|473->444|473->444|476->447|476->447|477->448|477->448|478->449|478->449|479->450|479->450|480->451|480->451|483->454|483->454|483->454|483->454|483->454|483->454|483->454|486->457|503->474|503->474|503->474|504->475|504->475|506->477|507->478|507->478|507->478|509->480|509->480|509->480|509->480|509->480|511->482|520->491|525->496
                    -- GENERATED --
                */
            