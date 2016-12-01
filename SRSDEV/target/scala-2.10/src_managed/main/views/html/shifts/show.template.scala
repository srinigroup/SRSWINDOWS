
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[DailySalesReconciliation],DailySalesReconciliation,Store,Shift,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(dsrForm: Form[DailySalesReconciliation],dsrObject:DailySalesReconciliation, store: Store,shift:Shift):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*6.2*/currentDateFormat/*6.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};def /*16.2*/display/*16.9*/ = {{

var result = "";
if(dsrObject.status.equals("SUBMITTED")){
result ="disabled";
}
result
}};
Seq[Any](format.raw/*1.104*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*23.2*/("""
	
"""),_display_(Seq[Any](/*25.2*/main/*25.6*/{_display_(Seq[Any](format.raw/*25.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*33.24*/routes/*33.30*/.Application.index())),format.raw/*33.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*34.27*/routes/*34.33*/.Application.showOptions("SHIFT","ALL"))),format.raw/*34.72*/("""" class="btn btn-default">SHIFT</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Application.showOptions("SHIFT","ALL"))),format.raw/*40.72*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
    """),_display_(Seq[Any](/*47.6*/if(flash.containsKey("success"))/*47.38*/ {_display_(Seq[Any](format.raw/*47.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*49.37*/flash/*49.42*/.get("success"))),format.raw/*49.57*/("""
        </div>
    """)))})),format.raw/*51.6*/(""" 
     
"""),_display_(Seq[Any](/*53.2*/helper/*53.8*/.form(action = routes.Shifts.save(shift.id,store.id,flash.get("pageAction")),'enctype -> "multipart/form-data", 'id -> "shiftForm", 'onsubmit -> "return verifyPayoutReqmnts();")/*53.185*/ {_display_(Seq[Any](format.raw/*53.187*/("""
	
	
	<h3>Shift Details</h3>
		
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
             <th>Variance</th>
             <th>Status</th>
           </tr>
          </thead>
          <tbody>
             <tr>
               <td>"""),_display_(Seq[Any](/*75.21*/currentDateFormat(dsrObject.todayDate))),format.raw/*75.59*/("""</td>
                        
               <td>"""),_display_(Seq[Any](/*77.21*/currentDateFormat(dsrObject.reportingBusinessDate))),format.raw/*77.71*/(""" </td>
                        
               <td>"""),_display_(Seq[Any](/*79.21*/DailySalesReconciliation/*79.45*/.getLastReportingBusinessDate(store.id))),format.raw/*79.84*/(""" </td>
                         
               <td> """),_display_(Seq[Any](/*81.22*/DailySalesReconciliation/*81.46*/.getTotalSalesAmount(dsrObject))),format.raw/*81.77*/(""" </td>
                        
               <td> """),_display_(Seq[Any](/*83.22*/DailySalesReconciliation/*83.46*/.getVarianceAmount(dsrObject))),format.raw/*83.75*/("""</td> 	
                       	
                <td> """),_display_(Seq[Any](/*85.23*/dsrObject/*85.32*/.status)),format.raw/*85.39*/("""  </td> 	
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
		 	"""),_display_(Seq[Any](/*102.6*/if(store.salesHeads.size() == 0)/*102.38*/ {_display_(Seq[Any](format.raw/*102.40*/("""
			<div class="well">
				<em>Nothing to display</em>
			</div>
			""")))}/*106.6*/else/*106.11*/{_display_(Seq[Any](format.raw/*106.12*/("""
        	   <table class="table table-bordered">
            		<thead>
 				  		<th style="background-color:#D0F5A9">Sales Heads</th>
                     	<th style="background-color:#D0F5A9">Sale Amount</th>
                     </thead> 
            		 <tbody>

                	  """),_display_(Seq[Any](/*114.21*/for(saleshead <- store.salesHeads) yield /*114.55*/ {_display_(Seq[Any](format.raw/*114.57*/("""
                	  			<tr>
	                    			<td> """),_display_(Seq[Any](/*116.31*/saleshead/*116.40*/.name)),format.raw/*116.45*/("""</td>
	                        		<td> <input type="text" id=""""),_display_(Seq[Any](/*117.57*/saleshead/*117.66*/.name)),format.raw/*117.71*/("""" class ="saleshead" name=""""),_display_(Seq[Any](/*117.99*/saleshead/*117.108*/.name)),format.raw/*117.113*/("""" value="0.00" ></td>
	                            </tr>
	                    
               		  """)))})),format.raw/*120.21*/("""
               		  </tbody>
        		 </table>
      			""")))})),format.raw/*123.11*/("""
		</div>
  		<!-- #tab1 -->
						
  	<h3 class="tab_drawer_heading" rel="tab2">Media Collected</h3>
  	<div id="tab2" class="tab_content">
 		"""),_display_(Seq[Any](/*129.5*/if(store.mediaTenderHeads.size() == 0)/*129.43*/ {_display_(Seq[Any](format.raw/*129.45*/("""
        <div class="well">
        	<em>Nothing to display</em>
        </div>
    	""")))}/*133.8*/else/*133.13*/{_display_(Seq[Any](format.raw/*133.14*/("""
          <table class="table table-bordered">
            <thead>
				<th style="background-color:#D0F5A9">Media Tenders</th>
				<th style="background-color:#D0F5A9">Media Collects</th>
				<th style="background-color:#D0F5A9">Settlement Amount</th>
             </thead>
             <tbody>
             	"""),_display_(Seq[Any](/*141.16*/for(mediaTenderHead <- store.mediaTenderHeads) yield /*141.62*/ {_display_(Seq[Any](format.raw/*141.64*/("""
                <tr>	
	                <td> """),_display_(Seq[Any](/*143.24*/mediaTenderHead/*143.39*/.name)),format.raw/*143.44*/("""</td>
	                <td> <input type="text" class="actual" name=""""),_display_(Seq[Any](/*144.64*/mediaTenderHead/*144.79*/.name)),format.raw/*144.84*/("""" value="0.00" ></td>
	                <td> <input type="text" class="settle" name="settle_"""),_display_(Seq[Any](/*145.71*/mediaTenderHead/*145.86*/.name)),format.raw/*145.91*/("""" value="0.00" ></td>                    
                </tr>
               	""")))})),format.raw/*147.18*/("""
						<input type="hidden" class="actual_hidden" value="0.00"/>
						<input type="hidden" class="settle_hidden" value="0.00"/>
			</tbody>
          </table>
		 """)))})),format.raw/*152.5*/("""
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
				<td> <input type="text" id="shiftVariance" name="shiftVariance" class="shiftVariance" value="0.00" ></td>
				<td> Reason for Media Variance</td>
				<td> <input type="text" id="varReason" name="varReason" class="varReason" value="default" ></td>
			</tr>
		</tbody>
	</table>
  	</div>
  	<!-- #tab3 -->
  	<h3 class="tab_drawer_heading" rel="tab4">Register Payouts</h3>
  	<div id="tab4" class="tab_content">
	<p><label>Search Suppliers</label>
	<input class="text_field dropdown-toggle" id="paysupplierid" name="searchSuppliers" 
										placeholder="Search here for Suppliers" type="text" value="" 
										style="width:203px" onKeyUp="getPayoutSuppliers('REGISTERPAYOUT');"/></p>
					
	<p><label>Similar Supplier Names </label>
        <select class="text_field" id="suppliersid" name="similarSuppliers" size="5" style="width:510px;" onchange="addSuppDetails('REGISTERPAYOUT',"""),_display_(Seq[Any](/*183.150*/shift/*183.155*/.id)),format.raw/*183.158*/(""")" multiple></select> 
    </p>
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
       <tbody>note
       </tbody>
	</table>
  	</div>
  	<!-- #tab4 -->
  	
  	<h3 class="tab_drawer_heading" rel="tab5">Payment Amounts</h3>
  	<div id="tab5" class="tab_content">
	"""),_display_(Seq[Any](/*203.3*/if(store.paymentTenders.size() == 0)/*203.39*/ {_display_(Seq[Any](format.raw/*203.41*/("""
		<div class="well">
		 	<em>Nothing to display</em>
		</div>
	""")))}/*207.4*/else/*207.9*/{_display_(Seq[Any](format.raw/*207.10*/("""
      <table class="table table-bordered">
      <thead>
	 		<th style="background-color:#D0F5A9">Payment Tender</th>
	        <th style="background-color:#D0F5A9">Payment Amount</th>
      </thead> 
      <tbody>
       """),_display_(Seq[Any](/*214.9*/for(paymentTender <- store.paymentTenders) yield /*214.51*/ {_display_(Seq[Any](format.raw/*214.53*/("""
	   	<tr>
		     <td> """),_display_(Seq[Any](/*216.14*/paymentTender/*216.27*/.name)),format.raw/*216.32*/("""</td>
		     <td> <input type="text" id=""""),_display_(Seq[Any](/*217.37*/paymentTender/*217.50*/.name)),format.raw/*217.55*/("""" class ="paymentTender" name=""""),_display_(Seq[Any](/*217.87*/paymentTender/*217.100*/.name)),format.raw/*217.105*/("""" value="0.00" ></td>
	    </tr>
       """)))})),format.raw/*219.9*/("""
       </tbody>
       </table>
      """)))})),format.raw/*222.8*/("""
  	</div>
  	<!-- #tab5 -->
	</div>
	<!-- .tab_container -->
      			
      	
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" id="btnSubmit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
        
        <!-- div foe expense id in javascript,display none -->
        
        	<div id="expense" style="display:none">
            	<select name="expId" id ="expId" >
               		"""),_display_(Seq[Any](/*243.19*/for(expenseHead <- store.expenseHeads) yield /*243.57*/ {_display_(Seq[Any](format.raw/*243.59*/("""
			        	<option value="""),_display_(Seq[Any](/*244.28*/expenseHead)),format.raw/*244.39*/(""" >"""),_display_(Seq[Any](/*244.42*/expenseHead/*244.53*/.name)),format.raw/*244.58*/(""" </option>
			         """)))})),format.raw/*245.14*/(""" 
                 </select> 
		    </div>
		    
		 
						
    
   
  
""")))})),format.raw/*254.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*259.2*/("""<!-- main end -->
	"""))}
    }
    
    def render(dsrForm:Form[DailySalesReconciliation],dsrObject:DailySalesReconciliation,store:Store,shift:Shift): play.api.templates.HtmlFormat.Appendable = apply(dsrForm,dsrObject,store,shift)
    
    def f:((Form[DailySalesReconciliation],DailySalesReconciliation,Store,Shift) => play.api.templates.HtmlFormat.Appendable) = (dsrForm,dsrObject,store,shift) => apply(dsrForm,dsrObject,store,shift)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:10 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/shifts/show.scala.html
                    HASH: 3ecbd4d13ca8b4553de7cdcdb55c712f56031f25
                    MATRIX: 841->1|1073->164|1098->181|1300->374|1315->381|1449->103|1479->161|1508->369|1539->484|1580->490|1592->494|1630->495|1903->732|1918->738|1960->758|2079->841|2094->847|2155->886|2446->1141|2461->1147|2522->1186|2743->1372|2784->1404|2824->1406|2941->1487|2955->1492|2992->1507|3046->1530|3092->1541|3106->1547|3293->1724|3334->1726|3915->2271|3975->2309|4064->2362|4136->2412|4226->2466|4259->2490|4320->2529|4412->2585|4445->2609|4498->2640|4589->2695|4622->2719|4673->2748|4766->2805|4784->2814|4813->2821|5355->3327|5397->3359|5438->3361|5530->3435|5544->3440|5584->3441|5915->3735|5966->3769|6007->3771|6104->3831|6123->3840|6151->3845|6251->3908|6270->3917|6298->3922|6363->3950|6383->3959|6412->3964|6547->4066|6642->4128|6829->4279|6877->4317|6918->4319|7027->4410|7041->4415|7081->4416|7437->4735|7500->4781|7541->4783|7626->4831|7651->4846|7679->4851|7786->4921|7811->4936|7839->4941|7969->5034|7994->5049|8022->5054|8138->5137|8339->5306|9754->6683|9770->6688|9797->6691|10549->7407|10595->7443|10636->7445|10724->7515|10737->7520|10777->7521|11043->7751|11102->7793|11143->7795|11206->7821|11229->7834|11257->7839|11337->7882|11360->7895|11388->7900|11457->7932|11481->7945|11510->7950|11585->7993|11660->8036|12386->8725|12441->8763|12482->8765|12548->8794|12582->8805|12622->8808|12643->8819|12671->8824|12729->8849|12844->8932|12918->8974
                    LINES: 26->1|31->6|31->6|39->16|39->16|47->1|49->5|50->14|52->23|54->25|54->25|54->25|62->33|62->33|62->33|63->34|63->34|63->34|69->40|69->40|69->40|76->47|76->47|76->47|78->49|78->49|78->49|80->51|82->53|82->53|82->53|82->53|104->75|104->75|106->77|106->77|108->79|108->79|108->79|110->81|110->81|110->81|112->83|112->83|112->83|114->85|114->85|114->85|131->102|131->102|131->102|135->106|135->106|135->106|143->114|143->114|143->114|145->116|145->116|145->116|146->117|146->117|146->117|146->117|146->117|146->117|149->120|152->123|158->129|158->129|158->129|162->133|162->133|162->133|170->141|170->141|170->141|172->143|172->143|172->143|173->144|173->144|173->144|174->145|174->145|174->145|176->147|181->152|212->183|212->183|212->183|232->203|232->203|232->203|236->207|236->207|236->207|243->214|243->214|243->214|245->216|245->216|245->216|246->217|246->217|246->217|246->217|246->217|246->217|248->219|251->222|272->243|272->243|272->243|273->244|273->244|273->244|273->244|273->244|274->245|283->254|288->259
                    -- GENERATED --
                */
            