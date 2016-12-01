
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
object summary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[DailySalesReconciliation,Store,Shift,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(dsrObject:DailySalesReconciliation, store: Store,shift:Shift ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.65*/("""


"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main/*7.6*/ {_display_(Seq[Any](format.raw/*7.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*15.24*/routes/*15.30*/.Application.index())),format.raw/*15.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Application.showOptions("SHIFT","ALL"))),format.raw/*16.72*/("""" class="btn btn-default">SHIFT</a>
            				<a href=""""),_display_(Seq[Any](/*17.27*/routes/*17.33*/.Application.showOptions("SHIFT",flash.get("pageAction")))),format.raw/*17.90*/("""" class="btn btn-default">"""),_display_(Seq[Any](/*17.117*/flash/*17.122*/.get("pageAction"))),format.raw/*17.140*/("""</a>
            				<a href="#" class="btn btn-default">SUMMARY</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*23.27*/routes/*23.33*/.Application.showOptions("SHIFT","MODIFY"))),format.raw/*23.75*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  
   """),format.raw/*36.9*/("""
    
    """),_display_(Seq[Any](/*38.6*/if(flash.containsKey("mediaErr"))/*38.39*/ {_display_(Seq[Any](format.raw/*38.41*/("""
         <div class="alert alert-warning">
            <strong>Error!</strong> """),_display_(Seq[Any](/*40.38*/flash/*40.43*/.get("mediaErr"))),format.raw/*40.59*/("""
        </div>
    """)))})),format.raw/*42.6*/(""" 


		
	"""),_display_(Seq[Any](/*46.3*/helper/*46.9*/.form(action = routes.Shifts.submit(shift.id))/*46.55*/{_display_(Seq[Any](format.raw/*46.56*/("""

			<center><h3>Shift Summary</h3></center>
	<style>
	table """),format.raw/*50.8*/("""{"""),format.raw/*50.9*/("""
		height: 5px;
	    border: 1px solid black;
	    
	"""),format.raw/*54.2*/("""}"""),format.raw/*54.3*/("""
	</style>

<div class="table-responsive" align="center">
<TABLE BORDER="1" WIDTH="500" class="table table-bordered">
<TR>
<TD WIDTH=250 style="background-color:white">
<TABLE BORDER="1" WIDTH="250" class="table table-bordered">
<TR>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Media Takings</b>

</TR>
		<TR>
			<TD  style="background-color:white"><b><u>Media</u></b></TD>
			<TD  style="background-color:white"><b><u>Net Takings</u></b></TD>	
		</TR>
		
		
		"""),_display_(Seq[Any](/*74.4*/for(mediaTenderHead <- store.mediaTenderHeads) yield /*74.50*/ {_display_(Seq[Any](format.raw/*74.52*/("""
                    <tr>
                    	 <td style="background-color:white"> """),_display_(Seq[Any](/*76.60*/mediaTenderHead/*76.75*/.name)),format.raw/*76.80*/("""</td>
                        <td style="background-color:white">"""),_display_(Seq[Any](/*77.61*/Shift/*77.66*/.getShiftMediaCollectedSettleAmount(shift.mediaCollects,mediaTenderHead.name))),format.raw/*77.143*/("""</td>
                                            
                             
              		 </tr>
		""")))})),format.raw/*81.4*/("""
		
		<tr>
               			<td style="background-color:white">Payouts</td>
               			<td style="background-color:white">"""),_display_(Seq[Any](/*85.55*/Shift/*85.60*/.getTotalPayoutsbyType(shift,"REGISTERPAYOUT"))),format.raw/*85.106*/("""</td>
         </tr>
         
         """),_display_(Seq[Any](/*88.11*/for(paymentTender <- store.paymentTenders) yield /*88.53*/ {_display_(Seq[Any](format.raw/*88.55*/("""
                    <tr>
                    	 <td style="background-color:white"> """),_display_(Seq[Any](/*90.60*/paymentTender/*90.73*/.name)),format.raw/*90.78*/("""</td>
                        <td style="background-color:white">"""),_display_(Seq[Any](/*91.61*/Shift/*91.66*/.getShiftPaymentTenderAmount(shift.shiftPayments,paymentTender.name))),format.raw/*91.134*/("""</td>
                                            
                             
              		 </tr>
		""")))})),format.raw/*95.4*/("""
               		
		<TR>
			<TD  style="background-color:white"><b>Total Net Takings</b></TD>
			<TD  style="background-color:white"><b>"""),_display_(Seq[Any](/*99.44*/Shift/*99.49*/.getTotalNetTakings(shift,"REGISTERPAYOUT"))),format.raw/*99.92*/("""</b></TD>	
		</TR>	
			
		



</TABLE>
</TD>
<TD WIDTH="250" style="background-color:white">
<TABLE BORDER="1" class="table table-bordered">
<TR>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Account Totals</b>

</TR>
		
		<TR>
			<TD  style="background-color:white">Total Gross Sales</TD>
			<TD  style="background-color:white">"""),_display_(Seq[Any](/*119.41*/Shift/*119.46*/.getTotalSales(shift))),format.raw/*119.67*/("""</TD>	
		</TR>
		
		<TR>
			<TD  style="background-color:white">Media Difference</TD>
			<TD  style="background-color:white">"""),_display_(Seq[Any](/*124.41*/Shift/*124.46*/.getShiftMediaDifference(shift))),format.raw/*124.77*/("""</TD>	
		</TR>
		
		<TR>
			<TD  style="background-color:white"> Shift Variance</TD>
			<TD  style="background-color:white">"""),_display_(Seq[Any](/*129.41*/Shift/*129.46*/.getTotalVariance(shift))),format.raw/*129.70*/("""</TD>	
		</TR>
		
		<TR>
			<TD  style="background-color:white">- Customer Invoices</TD>
			<TD  style="background-color:white">"""),_display_(Seq[Any](/*134.41*/{Shift.getShiftSale(shift.shiftSales,"ACCOUNT SALES").amount})),format.raw/*134.102*/("""</TD>	
		</TR>
		
		<TR>
			<TD  style="background-color:white">+ POS Payments</TD>
			<TD  style="background-color:white">"""),_display_(Seq[Any](/*139.41*/{Shift.getShiftSale(shift.shiftSales,"ACCOUNT RECV").amount})),format.raw/*139.101*/("""</TD>	
		</TR>
		
		<TR>
			<TD  style="background-color:white"><b>Net POS Takings</b></TD>
			<TD  style="background-color:white"><b>"""),_display_(Seq[Any](/*144.44*/Shift/*144.49*/.getNetPOSTakings(shift))),format.raw/*144.73*/("""</b></TD>	
		</TR>
		
		
</TABLE>
	
	"""),_display_(Seq[Any](/*150.3*/if(Shift.getTotalVariance(shift).toDouble != 0)/*150.50*/{_display_(Seq[Any](format.raw/*150.51*/("""
		<b> Reason for Shift Variance : </b> <input type="text" name="shiftVarReason" pattern="."""),format.raw/*151.91*/("""{"""),format.raw/*151.92*/("""5,255"""),format.raw/*151.97*/("""}"""),format.raw/*151.98*/("""" required title="Min 5 to Max 255 characters" />
	""")))}/*152.3*/else/*152.7*/{_display_(Seq[Any](format.raw/*152.8*/("""
		<input type="hidden" name="shiftVarReason" value="No Variance" />
	""")))})),format.raw/*154.3*/("""
	
</TD>
</TR>
</TABLE>
</div>


<p style="text-align: right;">

"""),_display_(Seq[Any](/*164.2*/if((flash.containsKey("payoutErr")))/*164.38*/{_display_(Seq[Any](format.raw/*164.39*/("""
       <input type="submit"  class="btn btn-primary" >
    """)))})),format.raw/*166.6*/(""" 

<a href=""""),_display_(Seq[Any](/*168.11*/routes/*168.17*/.Shifts.edit(shift.id,store.id,"MODIFY"))),format.raw/*168.57*/("""" class="btn btn-default">Edit Shift</a> 

</p>



""")))})),format.raw/*174.2*/("""
     
    
    
     </div>
    </div>
        
""")))})),format.raw/*181.2*/("""

              """))}
    }
    
    def render(dsrObject:DailySalesReconciliation,store:Store,shift:Shift): play.api.templates.HtmlFormat.Appendable = apply(dsrObject,store,shift)
    
    def f:((DailySalesReconciliation,Store,Shift) => play.api.templates.HtmlFormat.Appendable) = (dsrObject,store,shift) => apply(dsrObject,store,shift)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:10 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/shifts/summary.scala.html
                    HASH: 372786aaad4a6f9c479d200ad526917f8605cea4
                    MATRIX: 813->1|1023->64|1055->124|1092->127|1103->131|1141->133|1419->375|1434->381|1476->401|1595->484|1610->490|1671->529|1770->592|1785->598|1864->655|1928->682|1943->687|1984->705|2248->933|2263->939|2327->981|2532->1357|2580->1370|2622->1403|2662->1405|2781->1488|2795->1493|2833->1509|2887->1532|2935->1545|2949->1551|3004->1597|3043->1598|3135->1663|3163->1664|3247->1721|3275->1722|3867->2279|3929->2325|3969->2327|4092->2414|4116->2429|4143->2434|4246->2501|4260->2506|4360->2583|4502->2694|4673->2829|4687->2834|4756->2880|4836->2924|4894->2966|4934->2968|5057->3055|5079->3068|5106->3073|5209->3140|5223->3145|5314->3213|5456->3324|5634->3466|5648->3471|5713->3514|6137->3901|6152->3906|6196->3927|6364->4058|6379->4063|6433->4094|6600->4224|6615->4229|6662->4253|6833->4387|6918->4448|7084->4577|7168->4637|7345->4777|7360->4782|7407->4806|7487->4850|7544->4897|7584->4898|7705->4990|7735->4991|7769->4996|7799->4997|7871->5050|7884->5054|7923->5055|8028->5128|8140->5204|8186->5240|8226->5241|8321->5304|8373->5319|8389->5325|8452->5365|8542->5423|8631->5480
                    LINES: 26->1|32->1|35->6|36->7|36->7|36->7|44->15|44->15|44->15|45->16|45->16|45->16|46->17|46->17|46->17|46->17|46->17|46->17|52->23|52->23|52->23|60->36|62->38|62->38|62->38|64->40|64->40|64->40|66->42|70->46|70->46|70->46|70->46|74->50|74->50|78->54|78->54|98->74|98->74|98->74|100->76|100->76|100->76|101->77|101->77|101->77|105->81|109->85|109->85|109->85|112->88|112->88|112->88|114->90|114->90|114->90|115->91|115->91|115->91|119->95|123->99|123->99|123->99|143->119|143->119|143->119|148->124|148->124|148->124|153->129|153->129|153->129|158->134|158->134|163->139|163->139|168->144|168->144|168->144|174->150|174->150|174->150|175->151|175->151|175->151|175->151|176->152|176->152|176->152|178->154|188->164|188->164|188->164|190->166|192->168|192->168|192->168|198->174|205->181
                    -- GENERATED --
                */
            