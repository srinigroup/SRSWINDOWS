
package views.html.timesheets

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
object timesheetListForAdmin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[java.util.Date,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(weekStartDate : java.util.Date, sid:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/currentDateFormat/*3.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.44*/("""

"""),format.raw/*11.2*/("""
    <!-- <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*12.71*/routes/*12.77*/.Assets.at("stylesheets/timesheet.css"))),format.raw/*12.116*/(""""> -->
"""),_display_(Seq[Any](/*13.2*/main/*13.6*/ {_display_(Seq[Any](format.raw/*13.8*/("""

  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*21.24*/routes/*21.30*/.Application.index())),format.raw/*21.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						"""),_display_(Seq[Any](/*22.15*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*22.95*/{_display_(Seq[Any](format.raw/*22.96*/("""
       							<a href="" onclick="goBack()" class="btn btn-default">TIMESHEET</a>
       						""")))})),format.raw/*24.15*/("""
       						"""),_display_(Seq[Any](/*25.15*/if((session.get("role")).contains("admin") || (session.get("role")).contains("su") 
       						|| (session.get("role")).contains("ac") || (session.get("role")).contains("su"))/*26.94*/{_display_(Seq[Any](format.raw/*26.95*/("""
           						<a href=""""),_display_(Seq[Any](/*27.28*/routes/*27.34*/.Timesheets.showSelectPage())),format.raw/*27.62*/("""" class="btn btn-default">TIMESHEET</a>
           					""")))})),format.raw/*28.18*/("""
            				<a href="#" class="btn btn-default">LIST</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           				 	"""),_display_(Seq[Any](/*34.19*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*34.99*/{_display_(Seq[Any](format.raw/*34.100*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*36.18*/("""
           					"""),_display_(Seq[Any](/*37.18*/if((session.get("role")).contains("admin") || (session.get("role")).contains("su")
           					 || (session.get("role")).contains("ac") || (session.get("role")).contains("sa") || (session.get("role")).contains("HOE") || (session.get("role")).contains("HeadOffice Accountant"))/*38.198*/{_display_(Seq[Any](format.raw/*38.199*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*40.18*/("""
           					
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  

    """),_display_(Seq[Any](/*49.6*/if(flash.containsKey("success"))/*49.38*/ {_display_(Seq[Any](format.raw/*49.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*51.37*/flash/*51.42*/.get("success"))),format.raw/*51.57*/("""
        </div>
    """)))})),format.raw/*53.6*/(""" 

   
        <div class="table-responsive" style="width: 100%;margin-bottom: 15px;overflow-x:auto;">
        	<table class="table table-bordered" style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    <th style="text-align:center;" >DAY</th>
                    """),_display_(Seq[Any](/*61.22*/for(i <- 0 to 6) yield /*61.38*/ {_display_(Seq[Any](format.raw/*61.40*/("""
                    	<th colspan="3" style="text-align:center;" >"""),_display_(Seq[Any](/*62.67*/Application/*62.78*/.getDayFromDate(Application.getNextDate(weekStartDate,i)))),format.raw/*62.135*/("""</th>
                    """)))})),format.raw/*63.22*/("""
                    <th style="text-align:center;" >TOTAL</th>    
                </tr>
                <tr>
                	<td style="text-align:center;" ><b>DATE</b></td>
                	"""),_display_(Seq[Any](/*68.19*/for(i <- 0 to 6) yield /*68.35*/ {_display_(Seq[Any](format.raw/*68.37*/("""
                    	<td colspan="3" style="text-align:center;" >"""),_display_(Seq[Any](/*69.67*/currentDateFormat(Application.getNextDate(weekStartDate,i)))),format.raw/*69.126*/("""</td>
                    """)))})),format.raw/*70.22*/("""
                    <td style="text-align:center;" >HRS</td>
                </tr>
                <tr>
                	<td class ="timesheetTableTD" style="text-align:center;padding : 2px;" ><b>NAME</b></td>
                	"""),_display_(Seq[Any](/*75.19*/for(i <- 0 to 6) yield /*75.35*/ {_display_(Seq[Any](format.raw/*75.37*/("""
                    	<td class ="timesheetTableTD" style="padding:2px;">START</td>
                    	<td class ="timesheetTableTD" style="padding:2px;">END</td>
                    	<td class ="timesheetTableTD" style="padding:2px;">HRS</td>
                    """)))})),format.raw/*79.22*/("""
                    <td></td>
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*85.18*/for(employee <- Timesheet.getEmployeesInfoByTimesheet(sid,weekStartDate).sortWith(_.firstName < _.firstName)) yield /*85.127*/ {_display_(Seq[Any](format.raw/*85.129*/("""
                    
                    <tr>
                    	<td style="text-align:center;" > <b> """),_display_(Seq[Any](/*88.60*/employee/*88.68*/.firstName)),format.raw/*88.78*/(""" """),_display_(Seq[Any](/*88.80*/employee/*88.88*/.lastName)),format.raw/*88.97*/(""" </b> </td>
                    	
                    	<! -- Thursday -->
                    	<td colspan="3">
                    		
                    		"""),_display_(Seq[Any](/*93.24*/for(timesheet <- Timesheet.getTimesheetByEmployeeAndDate(sid,employee.id,Application.getNextDate(weekStartDate,0))) yield /*93.139*/{_display_(Seq[Any](format.raw/*93.140*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*96.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*96.135*/{_display_(Seq[Any](format.raw/*96.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*97.64*/timesheet/*97.73*/.leaveType)),format.raw/*97.83*/("""</span></b></center>
                    					
                    				""")))}/*99.26*/else/*99.30*/{_display_(Seq[Any](format.raw/*99.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*101.52*/timesheet/*101.61*/.startTimeHour)),format.raw/*101.75*/(""":"""),_display_(Seq[Any](/*101.77*/timesheet/*101.86*/.startTimeMins)),format.raw/*101.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*102.52*/timesheet/*102.61*/.endTimeHour)),format.raw/*102.73*/(""":"""),_display_(Seq[Any](/*102.75*/timesheet/*102.84*/.endTimeMins)),format.raw/*102.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*103.52*/timesheet/*103.61*/.duration)),format.raw/*103.70*/("""</td>
                    				""")))})),format.raw/*104.26*/("""
                    				
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*108.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Friday -->
                    	<td colspan="3">
                    		
                    		"""),_display_(Seq[Any](/*116.24*/for(timesheet <- Timesheet.getTimesheetByEmployeeAndDate(sid,employee.id,Application.getNextDate(weekStartDate,1))) yield /*116.139*/{_display_(Seq[Any](format.raw/*116.140*/("""
                    			<table class="table table-bordered">
                    			<tr>
                    				"""),_display_(Seq[Any](/*119.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*119.135*/{_display_(Seq[Any](format.raw/*119.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*120.64*/timesheet/*120.73*/.leaveType)),format.raw/*120.83*/("""</span></b></center>
                    					
                    				""")))}/*122.26*/else/*122.30*/{_display_(Seq[Any](format.raw/*122.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*124.52*/timesheet/*124.61*/.startTimeHour)),format.raw/*124.75*/(""":"""),_display_(Seq[Any](/*124.77*/timesheet/*124.86*/.startTimeMins)),format.raw/*124.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*125.52*/timesheet/*125.61*/.endTimeHour)),format.raw/*125.73*/(""":"""),_display_(Seq[Any](/*125.75*/timesheet/*125.84*/.endTimeMins)),format.raw/*125.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*126.52*/timesheet/*126.61*/.duration)),format.raw/*126.70*/("""</td>
                    				""")))})),format.raw/*127.26*/("""
                    			
                    			</tr>
                    			</table>		
                    		""")))})),format.raw/*131.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Saturday -->
                    	<td colspan="3">
                    		
                    		"""),_display_(Seq[Any](/*139.24*/for(timesheet <- Timesheet.getTimesheetByEmployeeAndDate(sid,employee.id,Application.getNextDate(weekStartDate,2))) yield /*139.139*/{_display_(Seq[Any](format.raw/*139.140*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*142.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*142.135*/{_display_(Seq[Any](format.raw/*142.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*143.64*/timesheet/*143.73*/.leaveType)),format.raw/*143.83*/("""</span></b></center>
                    					
                    				""")))}/*145.26*/else/*145.30*/{_display_(Seq[Any](format.raw/*145.31*/("""
                    					
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*147.67*/timesheet/*147.76*/.startTimeHour)),format.raw/*147.90*/(""":"""),_display_(Seq[Any](/*147.92*/timesheet/*147.101*/.startTimeMins)),format.raw/*147.115*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*148.67*/timesheet/*148.76*/.endTimeHour)),format.raw/*148.88*/(""":"""),_display_(Seq[Any](/*148.90*/timesheet/*148.99*/.endTimeMins)),format.raw/*148.111*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*149.67*/timesheet/*149.76*/.duration)),format.raw/*149.85*/("""</td>
                    				""")))})),format.raw/*150.26*/("""
                    			
                    			</tr>
                    			</table>		
                    		""")))})),format.raw/*154.24*/("""
                    		
                    	</td>
                    	
                    	<! -- Sunday -->
                    	<td colspan="3">
                    		
                    		"""),_display_(Seq[Any](/*161.24*/for(timesheet <- Timesheet.getTimesheetByEmployeeAndDate(sid,employee.id,Application.getNextDate(weekStartDate,3))) yield /*161.139*/{_display_(Seq[Any](format.raw/*161.140*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*164.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*164.135*/{_display_(Seq[Any](format.raw/*164.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*165.64*/timesheet/*165.73*/.leaveType)),format.raw/*165.83*/("""</span></b></center>
                    				""")))}/*166.26*/else/*166.30*/{_display_(Seq[Any](format.raw/*166.31*/("""
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*167.67*/timesheet/*167.76*/.startTimeHour)),format.raw/*167.90*/(""":"""),_display_(Seq[Any](/*167.92*/timesheet/*167.101*/.startTimeMins)),format.raw/*167.115*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*168.67*/timesheet/*168.76*/.endTimeHour)),format.raw/*168.88*/(""":"""),_display_(Seq[Any](/*168.90*/timesheet/*168.99*/.endTimeMins)),format.raw/*168.111*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*169.67*/timesheet/*169.76*/.duration)),format.raw/*169.85*/("""</td>
                    				""")))})),format.raw/*170.26*/("""
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*173.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Monday -->
                    	<td colspan="3">
                    		
                    		"""),_display_(Seq[Any](/*181.24*/for(timesheet <- Timesheet.getTimesheetByEmployeeAndDate(sid,employee.id,Application.getNextDate(weekStartDate,4))) yield /*181.139*/{_display_(Seq[Any](format.raw/*181.140*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*184.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*184.135*/{_display_(Seq[Any](format.raw/*184.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*185.64*/timesheet/*185.73*/.leaveType)),format.raw/*185.83*/("""</span></b></center>
                    					
                    				""")))}/*187.26*/else/*187.30*/{_display_(Seq[Any](format.raw/*187.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*189.52*/timesheet/*189.61*/.startTimeHour)),format.raw/*189.75*/(""":"""),_display_(Seq[Any](/*189.77*/timesheet/*189.86*/.startTimeMins)),format.raw/*189.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*190.52*/timesheet/*190.61*/.endTimeHour)),format.raw/*190.73*/(""":"""),_display_(Seq[Any](/*190.75*/timesheet/*190.84*/.endTimeMins)),format.raw/*190.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*191.52*/timesheet/*191.61*/.duration)),format.raw/*191.70*/("""</td>
                    				""")))})),format.raw/*192.26*/("""
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*195.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Tuesday -->
                    	<td colspan="3">
                    		
                    		"""),_display_(Seq[Any](/*203.24*/for(timesheet <- Timesheet.getTimesheetByEmployeeAndDate(sid,employee.id,Application.getNextDate(weekStartDate,5))) yield /*203.139*/{_display_(Seq[Any](format.raw/*203.140*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*206.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*206.135*/{_display_(Seq[Any](format.raw/*206.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*207.64*/timesheet/*207.73*/.leaveType)),format.raw/*207.83*/("""</span></b></center>
                    					
                    				""")))}/*209.26*/else/*209.30*/{_display_(Seq[Any](format.raw/*209.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*211.52*/timesheet/*211.61*/.startTimeHour)),format.raw/*211.75*/(""":"""),_display_(Seq[Any](/*211.77*/timesheet/*211.86*/.startTimeMins)),format.raw/*211.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*212.52*/timesheet/*212.61*/.endTimeHour)),format.raw/*212.73*/(""":"""),_display_(Seq[Any](/*212.75*/timesheet/*212.84*/.endTimeMins)),format.raw/*212.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*213.52*/timesheet/*213.61*/.duration)),format.raw/*213.70*/("""</td>
                    				""")))})),format.raw/*214.26*/("""
                    			
                    			</tr>
                    			</table>	
                    		""")))})),format.raw/*218.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Wednesday -->
                    	<td colspan="3">
                    		
                    		"""),_display_(Seq[Any](/*226.24*/for(timesheet <- Timesheet.getTimesheetByEmployeeAndDate(sid,employee.id,Application.getNextDate(weekStartDate,6))) yield /*226.139*/{_display_(Seq[Any](format.raw/*226.140*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*229.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*229.135*/{_display_(Seq[Any](format.raw/*229.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*230.64*/timesheet/*230.73*/.leaveType)),format.raw/*230.83*/("""</span></b></center>
                    					
                    				""")))}/*232.26*/else/*232.30*/{_display_(Seq[Any](format.raw/*232.31*/("""
                    					
                    					<td style="padding:2.5px;">"""),_display_(Seq[Any](/*234.54*/timesheet/*234.63*/.startTimeHour)),format.raw/*234.77*/(""":"""),_display_(Seq[Any](/*234.79*/timesheet/*234.88*/.startTimeMins)),format.raw/*234.102*/("""</td>
                    					<td style="padding:2.5px;">"""),_display_(Seq[Any](/*235.54*/timesheet/*235.63*/.endTimeHour)),format.raw/*235.75*/(""":"""),_display_(Seq[Any](/*235.77*/timesheet/*235.86*/.endTimeMins)),format.raw/*235.98*/("""</td>
                    					<td style="padding:2.5px;">"""),_display_(Seq[Any](/*236.54*/timesheet/*236.63*/.duration)),format.raw/*236.72*/("""</td>
                    				""")))})),format.raw/*237.26*/("""
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*240.24*/("""
                    		
                    	</td>
                    	
                    	
                  	<!-- Total Hours -->
	                    <td>"""),_display_(Seq[Any](/*246.27*/Timesheet/*246.36*/.getTotalTimesheetHours(employee.id,Application.getDate(weekStartDate)))),format.raw/*246.107*/("""</td>
                    </tr>
                """)))})),format.raw/*248.18*/("""

            </tbody>
         </table>
       </div>
     </div>
    </div>
   				
""")))})),format.raw/*256.2*/("""

            """))}
    }
    
    def render(weekStartDate:java.util.Date,sid:Long): play.api.templates.HtmlFormat.Appendable = apply(weekStartDate,sid)
    
    def f:((java.util.Date,Long) => play.api.templates.HtmlFormat.Appendable) = (weekStartDate,sid) => apply(weekStartDate,sid)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/timesheetListForAdmin.scala.html
                    HASH: 93bfbfcd097401dcb3fc274345847c0a5d5be415
                    MATRIX: 814->1|933->48|958->65|1176->43|1207->253|1315->325|1330->331|1392->370|1436->379|1448->383|1487->385|1761->623|1776->629|1818->649|1925->720|2014->800|2053->801|2184->900|2236->916|2423->1094|2462->1095|2527->1124|2542->1130|2592->1158|2682->1216|2931->1429|3020->1509|3060->1510|3223->1641|3278->1660|3569->1941|3609->1942|3772->2073|3938->2204|3979->2236|4019->2238|4136->2319|4150->2324|4187->2339|4241->2362|4625->2710|4657->2726|4697->2728|4801->2796|4821->2807|4901->2864|4961->2892|5197->3092|5229->3108|5269->3110|5373->3178|5455->3237|5515->3265|5785->3499|5817->3515|5857->3517|6160->3788|6314->3906|6440->4015|6481->4017|6626->4126|6643->4134|6675->4144|6713->4146|6730->4154|6761->4163|6960->4326|7092->4441|7132->4442|7286->4560|7405->4669|7445->4670|7546->4735|7564->4744|7596->4754|7689->4828|7702->4832|7741->4833|7858->4913|7877->4922|7914->4936|7953->4938|7972->4947|8010->4961|8105->5019|8124->5028|8159->5040|8198->5042|8217->5051|8252->5063|8347->5121|8366->5130|8398->5139|8463->5171|8613->5288|8875->5513|9008->5628|9049->5629|9203->5746|9323->5855|9364->5856|9466->5921|9485->5930|9518->5940|9612->6014|9626->6018|9666->6019|9783->6099|9802->6108|9839->6122|9878->6124|9897->6133|9935->6147|10030->6205|10049->6214|10084->6226|10123->6228|10142->6237|10177->6249|10272->6307|10291->6316|10323->6325|10388->6357|10536->6472|10800->6699|10933->6814|10974->6815|11129->6933|11249->7042|11290->7043|11392->7108|11411->7117|11444->7127|11538->7201|11552->7205|11592->7206|11724->7301|11743->7310|11780->7324|11819->7326|11839->7335|11877->7349|11987->7422|12006->7431|12041->7443|12080->7445|12099->7454|12135->7466|12245->7539|12264->7548|12296->7557|12361->7589|12509->7704|12748->7906|12881->8021|12922->8022|13077->8140|13197->8249|13238->8250|13340->8315|13359->8324|13392->8334|13459->8381|13473->8385|13513->8386|13618->8454|13637->8463|13674->8477|13713->8479|13733->8488|13771->8502|13881->8575|13900->8584|13935->8596|13974->8598|13993->8607|14029->8619|14139->8692|14158->8701|14190->8710|14255->8742|14379->8833|14641->9058|14774->9173|14815->9174|14970->9292|15090->9401|15131->9402|15233->9467|15252->9476|15285->9486|15379->9560|15393->9564|15433->9565|15550->9645|15569->9654|15606->9668|15645->9670|15664->9679|15702->9693|15797->9751|15816->9760|15851->9772|15890->9774|15909->9783|15944->9795|16039->9853|16058->9862|16090->9871|16155->9903|16279->9994|16542->10220|16675->10335|16716->10336|16871->10454|16991->10563|17032->10564|17134->10629|17153->10638|17186->10648|17280->10722|17294->10726|17334->10727|17451->10807|17470->10816|17507->10830|17546->10832|17565->10841|17603->10855|17698->10913|17717->10922|17752->10934|17791->10936|17810->10945|17845->10957|17940->11015|17959->11024|17991->11033|18056->11065|18203->11179|18468->11407|18601->11522|18642->11523|18797->11641|18917->11750|18958->11751|19060->11816|19079->11825|19112->11835|19206->11909|19220->11913|19260->11914|19379->11996|19398->12005|19435->12019|19474->12021|19493->12030|19531->12044|19628->12104|19647->12113|19682->12125|19721->12127|19740->12136|19775->12148|19872->12208|19891->12217|19923->12226|19988->12258|20112->12349|20316->12516|20335->12525|20430->12596|20514->12647|20641->12742
                    LINES: 26->1|28->3|28->3|37->1|39->11|40->12|40->12|40->12|41->13|41->13|41->13|49->21|49->21|49->21|50->22|50->22|50->22|52->24|53->25|54->26|54->26|55->27|55->27|55->27|56->28|62->34|62->34|62->34|64->36|65->37|66->38|66->38|68->40|77->49|77->49|77->49|79->51|79->51|79->51|81->53|89->61|89->61|89->61|90->62|90->62|90->62|91->63|96->68|96->68|96->68|97->69|97->69|98->70|103->75|103->75|103->75|107->79|113->85|113->85|113->85|116->88|116->88|116->88|116->88|116->88|116->88|121->93|121->93|121->93|124->96|124->96|124->96|125->97|125->97|125->97|127->99|127->99|127->99|129->101|129->101|129->101|129->101|129->101|129->101|130->102|130->102|130->102|130->102|130->102|130->102|131->103|131->103|131->103|132->104|136->108|144->116|144->116|144->116|147->119|147->119|147->119|148->120|148->120|148->120|150->122|150->122|150->122|152->124|152->124|152->124|152->124|152->124|152->124|153->125|153->125|153->125|153->125|153->125|153->125|154->126|154->126|154->126|155->127|159->131|167->139|167->139|167->139|170->142|170->142|170->142|171->143|171->143|171->143|173->145|173->145|173->145|175->147|175->147|175->147|175->147|175->147|175->147|176->148|176->148|176->148|176->148|176->148|176->148|177->149|177->149|177->149|178->150|182->154|189->161|189->161|189->161|192->164|192->164|192->164|193->165|193->165|193->165|194->166|194->166|194->166|195->167|195->167|195->167|195->167|195->167|195->167|196->168|196->168|196->168|196->168|196->168|196->168|197->169|197->169|197->169|198->170|201->173|209->181|209->181|209->181|212->184|212->184|212->184|213->185|213->185|213->185|215->187|215->187|215->187|217->189|217->189|217->189|217->189|217->189|217->189|218->190|218->190|218->190|218->190|218->190|218->190|219->191|219->191|219->191|220->192|223->195|231->203|231->203|231->203|234->206|234->206|234->206|235->207|235->207|235->207|237->209|237->209|237->209|239->211|239->211|239->211|239->211|239->211|239->211|240->212|240->212|240->212|240->212|240->212|240->212|241->213|241->213|241->213|242->214|246->218|254->226|254->226|254->226|257->229|257->229|257->229|258->230|258->230|258->230|260->232|260->232|260->232|262->234|262->234|262->234|262->234|262->234|262->234|263->235|263->235|263->235|263->235|263->235|263->235|264->236|264->236|264->236|265->237|268->240|274->246|274->246|274->246|276->248|284->256
                    -- GENERATED --
                */
            