
package views.html.terminals

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
object summary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[DailySalesReconciliation,Store,Terminal,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(dsrObject:DailySalesReconciliation, store: Store,terminal:Terminal ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.71*/("""


"""),format.raw/*6.1*/("""

<html>
<head>
 
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*11.62*/routes/*11.68*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*11.111*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*12.70*/routes/*12.76*/.Assets.at("stylesheets/main.css"))),format.raw/*12.110*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*13.70*/routes/*13.76*/.Assets.at("stylesheets/accordion.css"))),format.raw/*13.115*/(""""> 
        
   		
   		 <script type="text/javascript" src='"""),_display_(Seq[Any](/*16.44*/routes/*16.50*/.Application.javascriptRoutes())),format.raw/*16.81*/("""'></script>
   		 
   		<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
   		 <!-- <script type="text/javascript" src=""""),_display_(Seq[Any](/*20.49*/routes/*20.55*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*20.100*/(""""></script>-->
   
 
  <script>
 

 function closeWindow1()"""),format.raw/*26.25*/("""{"""),format.raw/*26.26*/("""
	
		//alert("inside close window");
		window.close();
		"""),format.raw/*30.3*/("""}"""),format.raw/*30.4*/("""
 </script>

</head>
<body>

<center><h1>Terminal Summary</h1></center>


<style>
table """),format.raw/*40.7*/("""{"""),format.raw/*40.8*/("""
	height: 5px;
    border: 1px solid black;
    
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
</style>

<div align="center">
<TABLE BORDER="1" WIDTH="500" >
<TR>
<TD WIDTH=250 style="background-color:white">
<TABLE BORDER="1" WIDTH="250">
<TR>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Media Takings</b>

</TR>
		<TR>
			<TD align="middle" style="background-color:white"><b><u>Media</u></b></TD>
			<TD align="middle" style="background-color:white"><b><u>Net Takings</u></b></TD>	
		</TR>
		
		
		"""),_display_(Seq[Any](/*64.4*/for(mediaTenderHead <- store.mediaTenderHeads) yield /*64.50*/ {_display_(Seq[Any](format.raw/*64.52*/("""
                    <tr>
                    	 <td style="background-color:white"> """),_display_(Seq[Any](/*66.60*/mediaTenderHead/*66.75*/.name)),format.raw/*66.80*/("""</td>
                        <td style="background-color:white">"""),_display_(Seq[Any](/*67.61*/Terminal/*67.69*/.getMediaAmountLong(terminal.shifts, mediaTenderHead.name))),format.raw/*67.127*/("""</td>
                                            
                             
              		 </tr>
		""")))})),format.raw/*71.4*/("""
		
		<tr>
               			<td style="background-color:white">Payouts</td>
               			<td style="background-color:white">"""),_display_(Seq[Any](/*75.55*/Terminal/*75.63*/.getPayoutsByTerminal(terminal))),format.raw/*75.94*/("""</td>
         </tr>
         
         """),_display_(Seq[Any](/*78.11*/for(paymentTender <- store.paymentTenders) yield /*78.53*/ {_display_(Seq[Any](format.raw/*78.55*/("""
                    <tr>
                    	 <td style="background-color:white"> """),_display_(Seq[Any](/*80.60*/paymentTender/*80.73*/.name)),format.raw/*80.78*/("""</td>
                        <td style="background-color:white">"""),_display_(Seq[Any](/*81.61*/Terminal/*81.69*/.getPaymentTendersByTerminal(terminal,paymentTender.name))),format.raw/*81.126*/("""</td>
                                            
                             
              		 </tr>
		""")))})),format.raw/*85.4*/("""
               		
		<TR>
			<TD align="middle" style="background-color:white"><b>Total Net Takings</b></TD>
			<TD align="middle" style="background-color:white"><b>"""),_display_(Seq[Any](/*89.58*/Terminal/*89.66*/.getTotalNetTakings(terminal))),format.raw/*89.95*/("""</b></TD>	
		</TR>	
			
		



</TABLE>
</TD>
<TD WIDTH="250" style="background-color:white">
<TABLE BORDER="1">
<TR>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<b>Account Totals</b>

</TR>
		
		<TR>
			<TD align="middle" style="background-color:white">Total Gross Sales</TD>
			<TD align="middle" style="background-color:white">"""),_display_(Seq[Any](/*109.55*/Terminal/*109.63*/.getSaleAmount("TOTALSALES",terminal.shifts))),format.raw/*109.107*/("""</TD>	
		</TR>
		
		<TR>
			<TD align="middle" style="background-color:white">- Overs/Shorts</TD>
			<TD align="middle" style="background-color:white">"""),_display_(Seq[Any](/*114.55*/Terminal/*114.63*/.getTotalShiftVariance(terminal.shifts))),format.raw/*114.102*/("""</TD>	
		</TR>
		
		<TR>
			<TD align="middle" style="background-color:white">- Customer Invoices</TD>
			<TD align="middle" style="background-color:white">"""),_display_(Seq[Any](/*119.55*/Terminal/*119.63*/.getSaleAmount("ACCOUNT SALES",terminal.shifts))),format.raw/*119.110*/("""</TD>	
		</TR>
		
		<TR>
			<TD align="middle" style="background-color:white">+ POS Payments</TD>
			<TD align="middle" style="background-color:white">"""),_display_(Seq[Any](/*124.55*/Terminal/*124.63*/.getSaleAmount("ACCOUNT RECV",terminal.shifts))),format.raw/*124.109*/(""" </TD>	
		</TR>
		
		<TR>
			<TD align="middle" style="background-color:white"><b>Net POS Takings</b></TD>
			<TD align="middle" style="background-color:white"><b>"""),_display_(Seq[Any](/*129.58*/Terminal/*129.66*/.getNetPOSTakings(terminal))),format.raw/*129.93*/("""</b></TD>	
		</TR>
		
		
</TABLE>
</TD>
</TR>
</TABLE>
</div>


	<section id="acc6" style="height:auto; ">
<p class="accnav">



</p>

</section>
</article>
		 <center><input type="button" value="Close" CLASS="btn primary" onclick="closeWindow1()"/></center>
</body>
</html>
"""))}
    }
    
    def render(dsrObject:DailySalesReconciliation,store:Store,terminal:Terminal): play.api.templates.HtmlFormat.Appendable = apply(dsrObject,store,terminal)
    
    def f:((DailySalesReconciliation,Store,Terminal) => play.api.templates.HtmlFormat.Appendable) = (dsrObject,store,terminal) => apply(dsrObject,store,terminal)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/terminals/summary.scala.html
                    HASH: a48f3cd18a04165357744001a8d41f9aa27d1be4
                    MATRIX: 819->1|1035->70|1067->130|1187->214|1202->220|1268->263|1378->337|1393->343|1450->377|1560->451|1575->457|1637->496|1738->561|1753->567|1806->598|2051->807|2066->813|2134->858|2227->923|2256->924|2344->985|2372->986|2497->1084|2525->1085|2605->1138|2633->1139|3170->1641|3232->1687|3272->1689|3395->1776|3419->1791|3446->1796|3549->1863|3566->1871|3647->1929|3789->2040|3960->2175|3977->2183|4030->2214|4110->2258|4168->2300|4208->2302|4331->2389|4353->2402|4380->2407|4483->2474|4500->2482|4580->2539|4722->2650|4928->2820|4945->2828|4996->2857|5419->3243|5437->3251|5505->3295|5699->3452|5717->3460|5780->3499|5979->3661|5997->3669|6068->3716|6262->3873|6280->3881|6350->3927|6556->4096|6574->4104|6624->4131
                    LINES: 26->1|32->1|35->6|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|45->16|45->16|45->16|49->20|49->20|49->20|55->26|55->26|59->30|59->30|69->40|69->40|73->44|73->44|93->64|93->64|93->64|95->66|95->66|95->66|96->67|96->67|96->67|100->71|104->75|104->75|104->75|107->78|107->78|107->78|109->80|109->80|109->80|110->81|110->81|110->81|114->85|118->89|118->89|118->89|138->109|138->109|138->109|143->114|143->114|143->114|148->119|148->119|148->119|153->124|153->124|153->124|158->129|158->129|158->129
                    -- GENERATED --
                */
            