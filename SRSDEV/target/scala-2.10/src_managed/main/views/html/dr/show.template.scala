
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[DailyReconciliation],Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/( dsrForm: Form[DailyReconciliation], store: Store):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.lang.String; var display = ""; 

def /*7.3*/currentDateFormat/*7.20*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*2.53*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" 
 
 """),format.raw/*15.2*/("""

"""),format.raw/*18.1*/("""
"""),_display_(Seq[Any](/*19.2*/if(DailyReconciliations.getOPENStatus(store.id))/*19.50*/{_display_(Seq[Any](format.raw/*19.51*/("""

	"""),_display_(Seq[Any](/*21.3*/{display="disabled"})),format.raw/*21.23*/("""

""")))})),format.raw/*23.2*/("""

"""),_display_(Seq[Any](/*25.2*/main/*25.6*/{_display_(Seq[Any](format.raw/*25.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*33.24*/routes/*33.30*/.Application.index())),format.raw/*33.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*34.27*/routes/*34.33*/.Application.showOptions("DAILY RECONCILIATION","ALL"))),format.raw/*34.87*/("""" class="btn btn-default">DAILY RECONCILIATION</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Application.showOptions("DAILY RECONCILIATION","ALL"))),format.raw/*40.87*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
     
"""),_display_(Seq[Any](/*48.2*/helper/*48.8*/.form(action = routes.DailyReconciliations.save(store.id))/*48.66*/ {_display_(Seq[Any](format.raw/*48.68*/("""
	
	
	<h3>"""),_display_(Seq[Any](/*51.7*/store/*51.12*/.name)),format.raw/*51.17*/(""" Sales</h3>
		
		<hr/>
		<br/>
	<div class="table-responsive">
		<table class="table table-bordered" style="background-color: white;border-color: #fff;">
			 <tr>
				
				<td>
					"""),_display_(Seq[Any](/*60.7*/helper/*60.13*/.inputText(dsrForm("createDate"), '_label -> "Created Date",'readonly -> "readonly"))),format.raw/*60.97*/("""
				</td>
				<td> Last Reporting Date&nbsp;&nbsp;&nbsp;
					 <input type="text" name="LastReportingDate" value=""""),_display_(Seq[Any](/*63.59*/DailySalesReconciliation/*63.83*/.getLastReportingBusinessDate(store.id))),format.raw/*63.122*/("""" readonly="readonly" />
				</td>
				<td>
					"""),_display_(Seq[Any](/*66.7*/helper/*66.13*/.inputText(dsrForm("store.name"), '_label -> "Store Name",'readonly -> "readonly"))),format.raw/*66.95*/("""
				</td>
			</tr>	
			<tr>
				<td>
					"""),_display_(Seq[Any](/*71.7*/helper/*71.13*/.inputText(dsrForm("reportingBusinessDate"), '_label -> "Reporting Business Date",'readonly -> "readonly"))),format.raw/*71.119*/("""
				</td>
				<td>
					"""),_display_(Seq[Any](/*74.7*/helper/*74.13*/.inputText(dsrForm("store.cashInSafe"), '_label -> "Cash in Safe",'readonly -> "readonly"))),format.raw/*74.103*/("""
				</td>
				<td>
					
					"""),_display_(Seq[Any](/*78.7*/select(
  				 dsrForm("status"),
  				 options(Seq("OPEN","SUBMITTED")),
 				 '_label -> "Status", '_default -> "-- Select Status --"
				))),format.raw/*82.6*/("""</td>
			</tr>
			
			
		</table>
       </div>
		
      		
      	
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;" """),_display_(Seq[Any](/*95.168*/display)),format.raw/*95.175*/(""" >&nbsp;&nbsp;  
				
		    </div>
        </div>
        
       
  
""")))})),format.raw/*102.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*107.2*/("""<!-- main end -->

"""))}
    }
    
    def render(dsrForm:Form[DailyReconciliation],store:Store): play.api.templates.HtmlFormat.Appendable = apply(dsrForm,store)
    
    def f:((Form[DailyReconciliation],Store) => play.api.templates.HtmlFormat.Appendable) = (dsrForm,store) => apply(dsrForm,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:06 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dr/show.scala.html
                    HASH: 0febeb49d2815d06619cd801d6b1502f0973b82f
                    MATRIX: 801->3|1028->120|1053->137|1271->54|1300->76|1327->112|1361->325|1392->375|1430->378|1487->426|1526->427|1567->433|1609->453|1645->458|1685->463|1697->467|1735->468|2008->705|2023->711|2065->731|2184->814|2199->820|2275->874|2581->1144|2596->1150|2672->1204|2896->1393|2910->1399|2977->1457|3017->1459|3066->1473|3080->1478|3107->1483|3334->1675|3349->1681|3455->1765|3610->1884|3643->1908|3705->1947|3793->2000|3808->2006|3912->2088|3996->2137|4011->2143|4140->2249|4204->2278|4219->2284|4332->2374|4403->2410|4570->2556|5009->2958|5039->2965|5149->3043|5223->3085
                    LINES: 26->2|33->7|33->7|42->2|43->4|43->5|45->15|47->18|48->19|48->19|48->19|50->21|50->21|52->23|54->25|54->25|54->25|62->33|62->33|62->33|63->34|63->34|63->34|69->40|69->40|69->40|77->48|77->48|77->48|77->48|80->51|80->51|80->51|89->60|89->60|89->60|92->63|92->63|92->63|95->66|95->66|95->66|100->71|100->71|100->71|103->74|103->74|103->74|107->78|111->82|124->95|124->95|131->102|136->107
                    -- GENERATED --
                */
            