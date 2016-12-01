
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
object editForm_bkp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[Long,Form[Store],Form[ContactInfo],Form[Address],Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(id:Long, storeForm: Form[Store], contactForm: Form[ContactInfo], addressForm: Form[Address],store:Store ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.lang.String; var display = "";

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
}};def /*54.2*/checkSelectedSupp/*54.19*/(id:String,sid:String) = {{
	
	var result = "";
	
	if(id==sid){
       	
       	result = "selected";
       	}
    
    result

}};
Seq[Any](format.raw/*2.108*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" """),format.raw/*52.2*/("""

"""),format.raw/*65.2*/("""

"""),format.raw/*68.1*/("""
"""),_display_(Seq[Any](/*69.2*/if(DailyReconciliations.getOPENStatus(store.id))/*69.50*/{_display_(Seq[Any](format.raw/*69.51*/("""

	"""),_display_(Seq[Any](/*71.3*/{display="disabled"})),format.raw/*71.23*/("""

""")))})),format.raw/*73.2*/("""

"""),_display_(Seq[Any](/*75.2*/main/*75.6*/{_display_(Seq[Any](format.raw/*75.7*/("""

 """),_display_(Seq[Any](/*77.3*/if(flash.containsKey("DROpenStatusError"))/*77.45*/ {_display_(Seq[Any](format.raw/*77.47*/("""
        <div class="alert-message warning">
            <strong>Error!</strong> """),_display_(Seq[Any](/*79.38*/flash/*79.43*/.get("DROpenStatusError"))),format.raw/*79.68*/("""
        </div>
    """)))})),format.raw/*81.6*/(""" 
 
"""),_display_(Seq[Any](/*83.2*/helper/*83.8*/.form(action = routes.Stores.update(id))/*83.48*/ {_display_(Seq[Any](format.raw/*83.50*/("""

		
    <article class="accordion">
	<section id="acc1" class="active">
		<h2><a href="#acc1">Store Details</a></h2>
		<hr/>
		<br/>
		<br/>
		<table>
			<tr>
				<td> """),_display_(Seq[Any](/*94.11*/select(
                storeForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*99.14*/("""
				</td>
				
				
					<td>"""),_display_(Seq[Any](/*103.11*/helper/*103.17*/.inputText(storeForm("name"), '_label -> "Store Name:"))),format.raw/*103.72*/("""</td>
				
			</tr>
			<tr>
				<td>"""),_display_(Seq[Any](/*107.10*/helper/*107.16*/.inputText(storeForm("description"), '_label -> "Store Description:"))),format.raw/*107.85*/("""</td>
				<td></td>
				
			</tr>
		</table>
	<!--	<p class="accnav"><a href="#acc2">next ➧</a></p> -->
	</section>
	
	<section id="acc2">
		<h2><a href="#acc2">Contact Info</a></h2>
		<hr/>
		<br/>
		<br/>
		<table>
			<tr>
				
				<td>
					 """),_display_(Seq[Any](/*124.8*/helper/*124.14*/.inputText(contactForm("phone1"), '_label -> "Store phone1 :"))),format.raw/*124.76*/("""
				</td>
				
				<td>
					 """),_display_(Seq[Any](/*128.8*/helper/*128.14*/.inputText(contactForm("email"), '_label -> "Store E-Mail :"))),format.raw/*128.75*/("""
				</td>
			</tr>
			<tr>
				<td>  """),_display_(Seq[Any](/*132.12*/helper/*132.18*/.inputText(contactForm("phone2"), '_label -> "Store phone2"))),format.raw/*132.78*/(""" </td>
				
				
				<td>
					"""),_display_(Seq[Any](/*136.7*/helper/*136.13*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*136.71*/("""
				</td>
			</tr>
		</table>
		
	</section>
	
	<section id="acc3">
		<h2><a href="#acc3">Address</a></h2>
		<hr/>
		<br/>
		<br/>
	
		<table>
		<tr colspan=2>
				<td>
				<p><label>Search Address</label>
				<input class="text_field" id="addressid" name="searchAddress" type="text" value="" style="width:500px;" onblur="getParsedAddress();getSimilar();"/></p>

				
				<p><label>Similar Addresses </label>
                  <select class="text_field" id="similarAddressesid" name="similarAddresses" size="5" style="width:510px;" onchange="similarAddressesChange()" multiple></select>
                 
				</p>
				</td>
				
				
			</tr>
			<tr>
				<td> """),_display_(Seq[Any](/*165.11*/helper/*165.17*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*165.71*/("""</td>
				
				<td> """),_display_(Seq[Any](/*167.11*/helper/*167.17*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*167.69*/(""" </td>
				
			</tr>
			<tr>
				<td>"""),_display_(Seq[Any](/*171.10*/helper/*171.16*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*171.72*/("""  </td>
				
				
				<td>
					"""),_display_(Seq[Any](/*175.7*/helper/*175.13*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*175.67*/("""
				</td>
			</tr>
			<tr>
				<td> """),_display_(Seq[Any](/*179.11*/helper/*179.17*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*179.81*/(""" </td>
				
				<td>  """),_display_(Seq[Any](/*181.12*/helper/*181.18*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*181.76*/(""" </td>
				
			</tr>
		</table>
		
	</section>
	<section id="acc4">
		<h2><a href="#acc4" >Head Mappings</a></h2>
		<hr/>
		<br/>
		<br/>
	<div id="tabpanel">
					<ul id="boxLinks">
                	<li><a href="#box1" id="tab1">SalesHeads</a></li>
                	<li><a href="#box2" id="tab2">MediaTenders</a></li>
                	<li><a href="#box3" id="tab3">ExpenseHeads</a></li>
                	<li><a href="#box4" id="tab4">TotalSalesHeads</a></li>
                	<li><a href="#box5" id="tab5">TerminalHeads</a></li>
                </ul>
                
      <div id="box" class="box" > 
               
           
       <div id="box1" class="box" >        	       
   
        <table class="computers zebra-striped">
           
            <tbody>

                """),_display_(Seq[Any](/*210.18*/for(saleshead <- SalesHead.all()) yield /*210.51*/ {_display_(Seq[Any](format.raw/*210.53*/("""
                    <tr>
                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*212.57*/saleshead/*212.66*/.id)),format.raw/*212.69*/("""" name="salesheadslist[]" value=""""),_display_(Seq[Any](/*212.103*/saleshead/*212.112*/.id)),format.raw/*212.115*/(""""  """),_display_(Seq[Any](/*212.119*/checkSelected("saleshead",saleshead.id))),format.raw/*212.158*/(""" /> """),_display_(Seq[Any](/*212.163*/saleshead/*212.172*/.name)),format.raw/*212.177*/("""</td>
                                            
                             
               </tr>
               """)))})),format.raw/*216.17*/("""

            </tbody>
        </table>
     
     </div>
     
     <div id="box2" class="box" >
     
  
        <table class="computers zebra-striped">
           
            <tbody>

                """),_display_(Seq[Any](/*230.18*/for(mediatender <- MediaTender.all()) yield /*230.55*/ {_display_(Seq[Any](format.raw/*230.57*/("""
                    <tr>
                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*232.57*/mediatender/*232.68*/.id)),format.raw/*232.71*/("""" name="mediatenderslist[]" value=""""),_display_(Seq[Any](/*232.107*/mediatender/*232.118*/.id)),format.raw/*232.121*/("""" """),_display_(Seq[Any](/*232.124*/checkSelected("mediatender",mediatender.id))),format.raw/*232.167*/(""" /> """),_display_(Seq[Any](/*232.172*/mediatender/*232.183*/.name)),format.raw/*232.188*/("""</td>
                                            
                             
               </tr>
               """)))})),format.raw/*236.17*/("""

            </tbody>
        </table>
     
                	
     </div>
     
     <div id="box3" class="box" >
                	
  
        
        <table class="computers zebra-striped">
           
            <tbody>

                """),_display_(Seq[Any](/*252.18*/for(expensehead <- ExpenseHead.all()) yield /*252.55*/ {_display_(Seq[Any](format.raw/*252.57*/("""
                    <tr>
                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*254.57*/expensehead/*254.68*/.id)),format.raw/*254.71*/("""" name="expenseheadslist[]" value=""""),_display_(Seq[Any](/*254.107*/expensehead/*254.118*/.id)),format.raw/*254.121*/(""""  """),_display_(Seq[Any](/*254.125*/checkSelected("expensehead",expensehead.id))),format.raw/*254.168*/(""" /> """),_display_(Seq[Any](/*254.173*/expensehead/*254.184*/.name)),format.raw/*254.189*/("""</td>
                                            
                             
               </tr>
               """)))})),format.raw/*258.17*/("""

            </tbody>
        </table>
             	
      </div>
      
       <div id="box4" class="box" >        	       
   
        <table class="computers zebra-striped">
           
            <tbody>

                """),_display_(Seq[Any](/*271.18*/for(totalsaleshead <- TotalSalesHead.all()) yield /*271.61*/ {_display_(Seq[Any](format.raw/*271.63*/("""
                    <tr>
                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*273.57*/totalsaleshead/*273.71*/.id)),format.raw/*273.74*/("""" name="totalsalesheadslist[]" value=""""),_display_(Seq[Any](/*273.113*/totalsaleshead/*273.127*/.id)),format.raw/*273.130*/(""""  """),_display_(Seq[Any](/*273.134*/checkSelected("totalsaleshead",totalsaleshead.id))),format.raw/*273.183*/(""" /> """),_display_(Seq[Any](/*273.188*/totalsaleshead/*273.202*/.name)),format.raw/*273.207*/("""</td>
                                            
                             
               </tr>
               """)))})),format.raw/*277.17*/("""

            </tbody>
        </table>
     
     </div>
       <div id="box5" class="box" >        	       
   
        <table class="computers zebra-striped">
           
            <tbody>

                """),_display_(Seq[Any](/*289.18*/for(terminalhead <- TerminalHead.all()) yield /*289.57*/ {_display_(Seq[Any](format.raw/*289.59*/("""
                    <tr>
                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*291.57*/terminalhead/*291.69*/.id)),format.raw/*291.72*/("""" name="terminalheadslist[]" value=""""),_display_(Seq[Any](/*291.109*/terminalhead/*291.121*/.id)),format.raw/*291.124*/(""""  """),_display_(Seq[Any](/*291.128*/checkSelected("terminalhead",terminalhead.id))),format.raw/*291.173*/(""" /> """),_display_(Seq[Any](/*291.178*/terminalhead/*291.190*/.name)),format.raw/*291.195*/("""</td>
                                            
                             
               </tr>
               """)))})),format.raw/*295.17*/("""

            </tbody>
        </table>
     
     </div>
      
      
   </div>
            
     
    
</section>
  <section id="acc5">
<h2><a href="#acc5" >Supplier Mappings</a></h2>
		<hr/>
		<br/>
		<br/>
		<p><label>Search Suppliers</label>
				<input class="text_field" id="supplierid" name="searchStores" type="text" value="" style="width:500px;" onblur="getSuppliers()"/></p>

				
		<p><label>Similar Supplier Names </label>
                <!--  <select class="text_field" id="similarSuppliersid" name="similarSuppliers" size="5" style="width:510px;" onchange="similarSupplierChange()" multiple></select> -->
                  <select class="text_field" id="similarSuppliersid" name="similarSuppliers" size="5" style="width:510px;" onchange="similarSupplierChange1("""),_display_(Seq[Any](/*319.158*/store/*319.163*/.id)),format.raw/*319.166*/(""")" multiple></select>
        </p>
       
        <table  id="cblist" class="computers zebra-striped">
        
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
			 """),_display_(Seq[Any](/*362.6*/for(supplierMapping <- store.supplierMapping) yield /*362.51*/ {_display_(Seq[Any](format.raw/*362.53*/("""
                    <tr>
                        <td>"""),_display_(Seq[Any](/*364.30*/supplierMapping/*364.45*/.supplier.name)),format.raw/*364.59*/("""</td>
                        <td>"""),_display_(Seq[Any](/*365.30*/supplierMapping/*365.45*/.supplier.abn)),format.raw/*365.58*/("""</td>
                        <td>
                         
							<select  name="""),_display_(Seq[Any](/*368.23*/{supplierMapping.id})),format.raw/*368.43*/("""_paymentTerms >
								
		                        <option class="blank" value="">-- Choose a Payment Term --</option>
			  					<option value=SUPP_SM_PT_1 """),_display_(Seq[Any](/*371.39*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_1"))),format.raw/*371.101*/(""">As per Invoice</option>
		                        <option value=SUPP_SM_PT_2 """),_display_(Seq[Any](/*372.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_2"))),format.raw/*372.117*/(""">Due Date</option>
		                        <option value=SUPP_SM_PT_3 """),_display_(Seq[Any](/*373.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_3"))),format.raw/*373.117*/(""">Fortnightly</option>
		                        <option value=SUPP_SM_PT_4 """),_display_(Seq[Any](/*374.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_4"))),format.raw/*374.117*/(""">Monthly</option>
		                        <option value=SUPP_SM_PT_5 """),_display_(Seq[Any](/*375.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_5"))),format.raw/*375.117*/(""">Quarterly</option>
		                        <option value=SUPP_SM_PT_6 """),_display_(Seq[Any](/*376.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_6"))),format.raw/*376.117*/(""">Same Day</option>
		                        <option value=SUPP_SM_PT_7 """),_display_(Seq[Any](/*377.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_7"))),format.raw/*377.117*/(""">Twice a Week</option>
		                        <option value=SUPP_SM_PT_8 """),_display_(Seq[Any](/*378.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_8"))),format.raw/*378.117*/(""">Weekly</option>
		                        <option value=SUPP_SM_PT_9 """),_display_(Seq[Any](/*379.55*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_9"))),format.raw/*379.117*/(""">Weekly Monday</option>
		                        <option value=SUPP_SM_PT_10 """),_display_(Seq[Any](/*380.56*/checkSelectedSupp(supplierMapping.paymentTerms,"SUPP_SM_PT_10"))),format.raw/*380.119*/(""">10 Days</option>
                            </select>   
                  		</td>              
                         <td>
                         <select  name="""),_display_(Seq[Any](/*384.41*/{supplierMapping.id})),format.raw/*384.61*/("""_paymentMode >
								
		                        <option class="blank" value="">-- Choose a Payment Mode --</option>
			  					<option value=SUPP_SM_PM_1 """),_display_(Seq[Any](/*387.39*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_1"))),format.raw/*387.100*/(""">BPay</option>
		                        <option value=SUPP_SM_PM_2 """),_display_(Seq[Any](/*388.55*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_2"))),format.raw/*388.116*/(""">Cash</option>
		                        <option value=SUPP_SM_PM_3 """),_display_(Seq[Any](/*389.55*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_3"))),format.raw/*389.116*/(""">DD</option>
		                        <option value=SUPP_SM_PM_4 """),_display_(Seq[Any](/*390.55*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_4"))),format.raw/*390.116*/(""">EFT</option>
		                        <option value=SUPP_SM_PM_5 """),_display_(Seq[Any](/*391.55*/checkSelectedSupp(supplierMapping.paymentMode,"SUPP_SM_PM_5"))),format.raw/*391.116*/(""">EFT/Cash</option>
                            </select> 
                  		</td>
                  		<td><INPUT TYPE="Button" id="b_"""),_display_(Seq[Any](/*394.53*/{supplierMapping.supplier.id})),format.raw/*394.82*/("""" CLASS="btn primary" onClick="delSupplierMapping("""),_display_(Seq[Any](/*394.133*/supplierMapping/*394.148*/.id)),format.raw/*394.151*/(""")" VALUE="Delete"></td>
                  		
               </tr>
               """)))})),format.raw/*397.17*/("""
               
            </tbody>
        </table>
      
</section>        
<section id="acc6" style="height:auto; ">
<p class="accnav"><input type="submit" class="btn primary" """),_display_(Seq[Any](/*404.61*/display)),format.raw/*404.68*/(""">  
<a href=""""),_display_(Seq[Any](/*405.11*/routes/*405.17*/.Stores.list())),format.raw/*405.31*/("""" class="btn">Cancel</a> 
"""),_display_(Seq[Any](/*406.2*/if(display.equals(""))/*406.24*/{_display_(Seq[Any](format.raw/*406.25*/("""
 <a href=""""),_display_(Seq[Any](/*407.12*/routes/*407.18*/.Stores.delete(id))),format.raw/*407.36*/("""" class="btn danger">Delete</a>
 """)))})),format.raw/*408.3*/("""
 </p>
</section>
</article>

""")))})),format.raw/*413.2*/("""

""")))})),format.raw/*415.2*/("""
"""))}
    }
    
    def render(id:Long,storeForm:Form[Store],contactForm:Form[ContactInfo],addressForm:Form[Address],store:Store): play.api.templates.HtmlFormat.Appendable = apply(id,storeForm,contactForm,addressForm,store)
    
    def f:((Long,Form[Store],Form[ContactInfo],Form[Address],Store) => play.api.templates.HtmlFormat.Appendable) = (id,storeForm,contactForm,addressForm,store) => apply(id,storeForm,contactForm,addressForm,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:10 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/stores/editForm_bkp.scala.html
                    HASH: b92f0acb4c0656872bf28994884c605db0a51dbb
                    MATRIX: 836->2|1114->165|1135->178|2119->1151|2145->1168|2306->108|2334->128|2361->163|2389->1148|2418->1296|2447->1342|2484->1344|2541->1392|2580->1393|2619->1397|2661->1417|2695->1420|2733->1423|2745->1427|2783->1428|2822->1432|2873->1474|2913->1476|3031->1558|3045->1563|3092->1588|3144->1609|3184->1614|3198->1620|3247->1660|3287->1662|3493->1832|3741->2058|3809->2089|3825->2095|3903->2150|3977->2187|3993->2193|4085->2262|4367->2508|4383->2514|4468->2576|4536->2608|4552->2614|4636->2675|4712->2714|4728->2720|4811->2780|4879->2812|4895->2818|4976->2876|5675->3538|5691->3544|5768->3598|5826->3619|5842->3625|5917->3677|5992->3715|6008->3721|6087->3777|6156->3810|6172->3816|6249->3870|6324->3908|6340->3914|6427->3978|6487->4001|6503->4007|6584->4065|7407->4851|7457->4884|7498->4886|7617->4968|7636->4977|7662->4980|7734->5014|7754->5023|7781->5026|7823->5030|7886->5069|7929->5074|7949->5083|7978->5088|8129->5206|8371->5411|8425->5448|8466->5450|8585->5532|8606->5543|8632->5546|8706->5582|8728->5593|8755->5596|8796->5599|8863->5642|8906->5647|8928->5658|8957->5663|9108->5781|9389->6025|9443->6062|9484->6064|9603->6146|9624->6157|9650->6160|9724->6196|9746->6207|9773->6210|9815->6214|9882->6257|9925->6262|9947->6273|9976->6278|10127->6396|10393->6625|10453->6668|10494->6670|10613->6752|10637->6766|10663->6769|10740->6808|10765->6822|10792->6825|10834->6829|10907->6878|10950->6883|10975->6897|11004->6902|11155->7020|11404->7232|11460->7271|11501->7273|11620->7355|11642->7367|11668->7370|11743->7407|11766->7419|11793->7422|11835->7426|11904->7471|11947->7476|11970->7488|11999->7493|12150->7611|12966->8389|12982->8394|13009->8397|15244->10596|15306->10641|15347->10643|15439->10698|15464->10713|15501->10727|15573->10762|15598->10777|15634->10790|15754->10873|15797->10893|15991->11050|16077->11112|16193->11191|16279->11253|16389->11326|16475->11388|16588->11464|16674->11526|16783->11598|16869->11660|16980->11734|17066->11796|17176->11869|17262->11931|17376->12008|17462->12070|17570->12141|17656->12203|17772->12282|17859->12345|18065->12514|18108->12534|18301->12690|18386->12751|18492->12820|18577->12881|18683->12950|18768->13011|18872->13078|18957->13139|19062->13207|19147->13268|19320->13404|19372->13433|19461->13484|19487->13499|19514->13502|19629->13584|19849->13767|19879->13774|19930->13788|19946->13794|19983->13808|20046->13835|20078->13857|20118->13858|20167->13870|20183->13876|20224->13894|20290->13928|20353->13959|20388->13962
                    LINES: 26->2|33->5|33->5|80->54|80->54|92->2|93->4|93->5|93->52|95->65|97->68|98->69|98->69|98->69|100->71|100->71|102->73|104->75|104->75|104->75|106->77|106->77|106->77|108->79|108->79|108->79|110->81|112->83|112->83|112->83|112->83|123->94|128->99|132->103|132->103|132->103|136->107|136->107|136->107|153->124|153->124|153->124|157->128|157->128|157->128|161->132|161->132|161->132|165->136|165->136|165->136|194->165|194->165|194->165|196->167|196->167|196->167|200->171|200->171|200->171|204->175|204->175|204->175|208->179|208->179|208->179|210->181|210->181|210->181|239->210|239->210|239->210|241->212|241->212|241->212|241->212|241->212|241->212|241->212|241->212|241->212|241->212|241->212|245->216|259->230|259->230|259->230|261->232|261->232|261->232|261->232|261->232|261->232|261->232|261->232|261->232|261->232|261->232|265->236|281->252|281->252|281->252|283->254|283->254|283->254|283->254|283->254|283->254|283->254|283->254|283->254|283->254|283->254|287->258|300->271|300->271|300->271|302->273|302->273|302->273|302->273|302->273|302->273|302->273|302->273|302->273|302->273|302->273|306->277|318->289|318->289|318->289|320->291|320->291|320->291|320->291|320->291|320->291|320->291|320->291|320->291|320->291|320->291|324->295|348->319|348->319|348->319|391->362|391->362|391->362|393->364|393->364|393->364|394->365|394->365|394->365|397->368|397->368|400->371|400->371|401->372|401->372|402->373|402->373|403->374|403->374|404->375|404->375|405->376|405->376|406->377|406->377|407->378|407->378|408->379|408->379|409->380|409->380|413->384|413->384|416->387|416->387|417->388|417->388|418->389|418->389|419->390|419->390|420->391|420->391|423->394|423->394|423->394|423->394|423->394|426->397|433->404|433->404|434->405|434->405|434->405|435->406|435->406|435->406|436->407|436->407|436->407|437->408|442->413|444->415
                    -- GENERATED --
                */
            