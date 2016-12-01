
package views.html.dsr

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Long,Form[DailySalesReconciliation],DailySalesReconciliation,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(id:Long, dsrForm: Form[DailySalesReconciliation],dsrObject:DailySalesReconciliation, store: Store ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.math.BigInteger; var i=0;var j=0;

import java.lang.String; var display = "";

def /*6.3*/currentDateFormat/*6.20*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*2.102*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" 
 """),format.raw/*14.2*/("""
"""),format.raw/*16.1*/("""

"""),format.raw/*19.1*/("""
"""),_display_(Seq[Any](/*20.2*/main/*20.6*/{_display_(Seq[Any](format.raw/*20.7*/("""

	<div class="wrapper" style="min-height:700px">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*28.24*/routes/*28.30*/.Application.index())),format.raw/*28.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						"""),_display_(Seq[Any](/*29.15*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*29.95*/{_display_(Seq[Any](format.raw/*29.96*/("""
            					<a href=""""),_display_(Seq[Any](/*30.28*/routes/*30.34*/.Application.showOptions("SALES RECONCILIATION","ALL"))),format.raw/*30.88*/("""" class="btn btn-default">SALES RECONCILIATION</a>
            					<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*31.55*/flash/*31.60*/.get("pageAction"))),format.raw/*31.78*/("""</a>
            				""")))})),format.raw/*32.18*/("""
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           				 	"""),_display_(Seq[Any](/*37.19*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*37.99*/{_display_(Seq[Any](format.raw/*37.100*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*39.18*/("""
           					"""),_display_(Seq[Any](/*40.18*/if((session.get("role")).contains("admin") || (session.get("role")).contains("su")
           					 || (session.get("role")).contains("ac") || (session.get("role")).contains("sa")|| (session.get("role")).contains("HeadOffice Accountant"))/*41.156*/{_display_(Seq[Any](format.raw/*41.157*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*43.18*/("""
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
    """),_display_(Seq[Any](/*50.6*/if(flash.containsKey("success"))/*50.38*/ {_display_(Seq[Any](format.raw/*50.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*52.37*/flash/*52.42*/.get("success"))),format.raw/*52.57*/("""
        </div>
    """)))})),format.raw/*54.6*/(""" 
     
"""),_display_(Seq[Any](/*56.2*/helper/*56.8*/.form(action = routes.DailySalesReconciliations.update(id))/*56.67*/ {_display_(Seq[Any](format.raw/*56.69*/("""
	
	<style>
		table """),format.raw/*59.9*/("""{"""),format.raw/*59.10*/("""
		height: 5px;
	    border: 1px solid black;
    	"""),format.raw/*62.6*/("""}"""),format.raw/*62.7*/("""
	</style>
	
	<h3>"""),_display_(Seq[Any](/*65.7*/store/*65.12*/.name)),format.raw/*65.17*/("""</h3>
		
		<hr/>
		<br/>
	<div class="table-responsive">
		<table class="table table-bordered">
            <thead>
               <tr style="background-color:#58ACFA">
                   
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
            </thead>
            <tbody>

               
                    <tr>
                        <td>"""),_display_(Seq[Any](/*89.30*/currentDateFormat(dsrObject.todayDate))),format.raw/*89.68*/("""</td>
                        
                        <td>"""),_display_(Seq[Any](/*91.30*/currentDateFormat(dsrObject.reportingBusinessDate))),format.raw/*91.80*/(""" </td>
                     
                        <td> """),_display_(Seq[Any](/*93.31*/DailySalesReconciliation/*93.55*/.getTotalSalesAmount(dsrObject))),format.raw/*93.86*/(""" </td>
                        
                          <td> """),_display_(Seq[Any](/*95.33*/DailySalesReconciliation/*95.57*/.getTotalMediaCollected(dsrObject))),format.raw/*95.91*/(""" </td>
                        
                          <td> """),_display_(Seq[Any](/*97.33*/DailySalesReconciliation/*97.57*/.getTotalPayouts(dsrObject))),format.raw/*97.84*/(""" </td>
                        
                          <td> """),_display_(Seq[Any](/*99.33*/DailySalesReconciliation/*99.57*/.getOtherPayouts(dsrObject))),format.raw/*99.84*/("""</td>
                          
                          <td> """),_display_(Seq[Any](/*101.33*/DailySalesReconciliation/*101.57*/.getTotalCashOuts(dsrObject))),format.raw/*101.85*/("""</td>
                       
                        <td> """),_display_(Seq[Any](/*103.31*/DailySalesReconciliation/*103.55*/.getVarianceAmount(dsrObject))),format.raw/*103.84*/("""</td> 	
                        	
                       	
                       	<td>
						"""),_display_(Seq[Any](/*107.8*/select(
		  				 dsrForm("status"),
		  				 options(Seq("OPEN","SUBMITTED")),
		 				  '_default -> "-- Select Status --"
						))),format.raw/*111.8*/("""</td>
                          
                 </tr>
            </tbody>
           
        </table>
       </div>
		<br>
              		
						<ul class="tabs">
							"""),_display_(Seq[Any](/*121.9*/for(terminalHead <- store.terminalHeads) yield /*121.49*/ {_display_(Seq[Any](format.raw/*121.51*/("""
							  			  		  
								"""),_display_(Seq[Any](/*123.10*/if(Terminal.getShiftsbyTerminalHead(dsrObject,terminalHead.name)!=null)/*123.81*/{_display_(Seq[Any](format.raw/*123.82*/("""
									"""),_display_(Seq[Any](/*124.11*/{i =i+1})),format.raw/*124.19*/("""	
						              <li rel="tab"""),_display_(Seq[Any](/*125.34*/i)),format.raw/*125.35*/("""">"""),_display_(Seq[Any](/*125.38*/terminalHead/*125.50*/.name)),format.raw/*125.55*/("""</a></li>
						        """)))})),format.raw/*126.16*/("""
				            """)))})),format.raw/*127.18*/("""
						</ul>
                
   						<div class="tab_container">
							"""),_display_(Seq[Any](/*131.9*/for(terminalHead <- store.terminalHeads) yield /*131.49*/ {_display_(Seq[Any](format.raw/*131.51*/("""
    							 """),_display_(Seq[Any](/*132.14*/{j =j+1})),format.raw/*132.22*/("""	
								<h3 class="d_active tab_drawer_heading" rel="tab"""),_display_(Seq[Any](/*133.58*/j)),format.raw/*133.59*/("""">"""),_display_(Seq[Any](/*133.62*/terminalHead/*133.74*/.name)),format.raw/*133.79*/("""</h3>
								<div id="tab"""),_display_(Seq[Any](/*134.22*/j)),format.raw/*134.23*/("""" class="tab_content">
  									"""),_display_(Seq[Any](/*135.13*/if(Terminal.getShiftsbyTerminalHead(dsrObject,terminalHead.name).size()>0)/*135.87*/{_display_(Seq[Any](format.raw/*135.88*/("""	
  			 							<div >
        	    							<p class="pull-right" style="padding-right:10px"><a href="javascript:window.open('"""),_display_(Seq[Any](/*137.104*/routes/*137.110*/.Terminals.summary(dsrObject.id,terminalHead.name))),format.raw/*137.160*/("""','_blank','toolbar=yes')" class="btn btn-success">View Summary</a></p>
       	 								</div>
			  						<br><br>
			  						<div class="table-responsive">
      								<table class="table table-bordered">
			  							<thead>
			    							<tr style="background-color:#F2F5A9">
                								<th>Shift StartTime</th>
                								<th>Shift EndTime</th>
                								<th>Shift Sales</th>
                								<th>Media Collects</th>
                								<th>Register Payouts</th>
                								<th>Other Payouts</th>
                								<th>CashOuts</th>
                								<th>Variance</th>
                								<th>Shift Owner</th>
                								<th>Status</th> 
                							</tr>
            							</thead>
          							 """),_display_(Seq[Any](/*156.20*/if((dsrObject.status).equals("SUBMITTED"))/*156.62*/{_display_(Seq[Any](format.raw/*156.63*/("""
										"""),_display_(Seq[Any](/*157.12*/{display="disabled"})),format.raw/*157.32*/("""
									""")))})),format.raw/*158.11*/("""
		    						"""),_display_(Seq[Any](/*159.14*/for(shift <- Terminal.getShiftsbyTerminalHead(dsrObject,terminalHead.name)) yield /*159.89*/ {_display_(Seq[Any](format.raw/*159.91*/("""
					
										"""),_display_(Seq[Any](/*161.12*/if(!(shift.status).equals("SUBMITTED"))/*161.51*/{_display_(Seq[Any](format.raw/*161.52*/("""
											"""),_display_(Seq[Any](/*162.13*/{display="disabled"})),format.raw/*162.33*/("""
										""")))})),format.raw/*163.12*/("""
	          							<tbody>
											<tr>
												<td><a href=""""),_display_(Seq[Any](/*166.27*/routes/*166.33*/.Shifts.edit(shift.id, store.id,flash.get("pageAction")))),format.raw/*166.89*/("""">"""),_display_(Seq[Any](/*166.92*/shift/*166.97*/.shiftStartDateTime)),format.raw/*166.116*/("""</a></td>						
												<td>"""),_display_(Seq[Any](/*167.18*/shift/*167.23*/.shiftEndDateTime)),format.raw/*167.40*/("""</td>						
												<td>"""),_display_(Seq[Any](/*168.18*/Shift/*168.23*/.getTotalSales(shift))),format.raw/*168.44*/("""</td>		
												<td>"""),_display_(Seq[Any](/*169.18*/Shift/*169.23*/.getTotalMedialCollected(shift))),format.raw/*169.54*/("""</td>		
												
												<td>"""),_display_(Seq[Any](/*171.18*/Shift/*171.23*/.getTotalPayoutsbyType(shift,"REGISTERPAYOUT"))),format.raw/*171.69*/("""</td>
												<td>"""),_display_(Seq[Any](/*172.18*/ShiftPaymentTender/*172.36*/.getShiftPaymentsTotalAmount(shift))),format.raw/*172.71*/("""</td>
												<td>"""),_display_(Seq[Any](/*173.18*/Shift/*173.23*/.getShiftPaymentTenderAmount(shift.shiftPayments,Application.propertiesMap.get("PAYMENT_TENDER_CASHOUT")))),format.raw/*173.128*/("""</td>		
												<td>"""),_display_(Seq[Any](/*174.18*/Shift/*174.23*/.getTotalVariance(shift))),format.raw/*174.47*/("""</td>
														
												<td>"""),_display_(Seq[Any](/*176.18*/Timesheet/*176.27*/.getEmployee(shift))),format.raw/*176.46*/("""</td>		
												<td>"""),_display_(Seq[Any](/*177.18*/shift/*177.23*/.status)),format.raw/*177.30*/(""" </td>	
											</tr>	
										</tbody>
									""")))})),format.raw/*180.11*/("""
								</table>
								</div>
             					""")))})),format.raw/*183.20*/("""
   		 						"""),_display_(Seq[Any](/*184.14*/if(!(Terminal.getShiftsbyTerminalHead(dsrObject,terminalHead.name).size()>0))/*184.91*/{_display_(Seq[Any](format.raw/*184.92*/("""
   		  							<div class="well">
            							<em>Nothing to display</em>
        							</div>
        					""")))})),format.raw/*188.15*/("""
   		 			</div>  
       				""")))})),format.raw/*190.13*/("""
					
				</div>	<!-- tab container -->		
 			
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
        		
            	<p style="text-align: right;">  
				
					"""),_display_(Seq[Any](/*200.7*/if((flash.get("pageAction")).equals("MODIFY"))/*200.53*/{_display_(Seq[Any](format.raw/*200.54*/("""
						
						<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;" """),_display_(Seq[Any](/*202.129*/display)),format.raw/*202.136*/(""">&nbsp;&nbsp;
					""")))})),format.raw/*203.7*/("""
				</p>
		    </div>
        </div>
   
  
""")))})),format.raw/*209.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*214.2*/("""<!-- main end -->
"""))}
    }
    
    def render(id:Long,dsrForm:Form[DailySalesReconciliation],dsrObject:DailySalesReconciliation,store:Store): play.api.templates.HtmlFormat.Appendable = apply(id,dsrForm,dsrObject,store)
    
    def f:((Long,Form[DailySalesReconciliation],DailySalesReconciliation,Store) => play.api.templates.HtmlFormat.Appendable) = (id,dsrForm,dsrObject,store) => apply(id,dsrForm,dsrObject,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:06 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dsr/editForm.scala.html
                    HASH: 7ff028ecb0a1a193d4cfebeb9f5a0b43c5911436
                    MATRIX: 841->3|1164->166|1189->183|1408->103|1437->125|1464->161|1495->371|1524->421|1555->470|1593->473|1605->477|1643->478|1941->740|1956->746|1998->766|2105->837|2194->917|2233->918|2298->947|2313->953|2389->1007|2531->1113|2545->1118|2585->1136|2640->1159|2827->1310|2916->1390|2956->1391|3119->1522|3174->1541|3423->1780|3463->1781|3626->1912|3782->2033|3823->2065|3863->2067|3980->2148|3994->2153|4031->2168|4085->2191|4131->2202|4145->2208|4213->2267|4253->2269|4303->2292|4332->2293|4413->2347|4441->2348|4498->2370|4512->2375|4539->2380|5331->3136|5391->3174|5489->3236|5561->3286|5658->3347|5691->3371|5744->3402|5846->3468|5879->3492|5935->3526|6037->3592|6070->3616|6119->3643|6221->3709|6254->3733|6303->3760|6407->3827|6441->3851|6492->3879|6591->3941|6625->3965|6677->3994|6812->4093|6968->4227|7190->4413|7247->4453|7288->4455|7356->4486|7437->4557|7477->4558|7526->4570|7557->4578|7630->4614|7654->4615|7694->4618|7716->4630|7744->4635|7803->4661|7855->4680|7970->4759|8027->4799|8068->4801|8120->4816|8151->4824|8248->4884|8272->4885|8312->4888|8334->4900|8362->4905|8427->4933|8451->4934|8524->4970|8608->5044|8648->5045|8813->5172|8830->5178|8904->5228|9773->6060|9825->6102|9865->6103|9915->6116|9958->6136|10003->6148|10055->6163|10147->6238|10188->6240|10245->6260|10294->6299|10334->6300|10385->6314|10428->6334|10474->6347|10583->6419|10599->6425|10678->6481|10718->6484|10733->6489|10776->6508|10847->6542|10862->6547|10902->6564|10969->6594|10984->6599|11028->6620|11091->6646|11106->6651|11160->6682|11237->6722|11252->6727|11321->6773|11382->6797|11410->6815|11468->6850|11529->6874|11544->6879|11673->6984|11736->7010|11751->7015|11798->7039|11875->7079|11894->7088|11936->7107|11999->7133|12014->7138|12044->7145|12135->7203|12223->7258|12275->7273|12362->7350|12402->7351|12556->7472|12622->7505|12930->7777|12986->7823|13026->7824|13202->7962|13233->7969|13286->7990|13370->8042|13444->8084
                    LINES: 26->2|35->6|35->6|44->2|45->4|45->5|46->14|47->16|49->19|50->20|50->20|50->20|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|67->37|67->37|67->37|69->39|70->40|71->41|71->41|73->43|80->50|80->50|80->50|82->52|82->52|82->52|84->54|86->56|86->56|86->56|86->56|89->59|89->59|92->62|92->62|95->65|95->65|95->65|119->89|119->89|121->91|121->91|123->93|123->93|123->93|125->95|125->95|125->95|127->97|127->97|127->97|129->99|129->99|129->99|131->101|131->101|131->101|133->103|133->103|133->103|137->107|141->111|151->121|151->121|151->121|153->123|153->123|153->123|154->124|154->124|155->125|155->125|155->125|155->125|155->125|156->126|157->127|161->131|161->131|161->131|162->132|162->132|163->133|163->133|163->133|163->133|163->133|164->134|164->134|165->135|165->135|165->135|167->137|167->137|167->137|186->156|186->156|186->156|187->157|187->157|188->158|189->159|189->159|189->159|191->161|191->161|191->161|192->162|192->162|193->163|196->166|196->166|196->166|196->166|196->166|196->166|197->167|197->167|197->167|198->168|198->168|198->168|199->169|199->169|199->169|201->171|201->171|201->171|202->172|202->172|202->172|203->173|203->173|203->173|204->174|204->174|204->174|206->176|206->176|206->176|207->177|207->177|207->177|210->180|213->183|214->184|214->184|214->184|218->188|220->190|230->200|230->200|230->200|232->202|232->202|233->203|239->209|244->214
                    -- GENERATED --
                */
            