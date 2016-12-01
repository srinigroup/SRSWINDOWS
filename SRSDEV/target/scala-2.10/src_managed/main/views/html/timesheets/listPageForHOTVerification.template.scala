
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
object listPageForHOTVerification extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Date,Date,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(weekStartDate : Date,endDate : Date, empId:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*2.2*/currentDateFormat/*2.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*10.2*/("""
    <!-- <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*11.71*/routes/*11.77*/.Assets.at("stylesheets/timesheet.css"))),format.raw/*11.116*/(""""> -->
"""),_display_(Seq[Any](/*12.2*/main/*12.6*/ {_display_(Seq[Any](format.raw/*12.8*/("""

  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*20.24*/routes/*20.30*/.Application.index())),format.raw/*20.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						"""),_display_(Seq[Any](/*21.15*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*21.95*/{_display_(Seq[Any](format.raw/*21.96*/("""
       							<a href="" onclick="goBack()" class="btn btn-default">TIMESHEET</a>
       						""")))})),format.raw/*23.15*/("""
       						
            				<a href="#" class="btn btn-default">LIST</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           				 	"""),_display_(Seq[Any](/*30.19*/if((session.get("role")).contains("PEM"))/*30.60*/{_display_(Seq[Any](format.raw/*30.61*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*32.18*/("""
           					
           					
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

   
        <div class="table-responsive" style="width: 100%;margin-bottom: 15px;overflow-x:auto;">
        """),_display_(Seq[Any](/*50.10*/helper/*50.16*/.form(action = routes.Timesheets.verifyHOTimesheet())/*50.69*/ {_display_(Seq[Any](format.raw/*50.71*/("""
        	
        	<input type="hidden" id="stDateForVerifyHOTimesheet" name="stDateForVerifyHOTimesheet" value=""""),_display_(Seq[Any](/*52.105*/Application/*52.116*/.getDateString(weekStartDate))),format.raw/*52.145*/("""">
        	<input type="hidden" id="enDateForVerifyHOTimesheet" name="enDateForVerifyHOTimesheet" value=""""),_display_(Seq[Any](/*53.105*/Application/*53.116*/.getDateString(endDate))),format.raw/*53.139*/("""">
        	<input type="hidden" id="empIdForVerifyHOTimesheet" name="empIdForVerifyHOTimesheet" value=""""),_display_(Seq[Any](/*54.103*/empId)),format.raw/*54.108*/("""">
        	<table class="table table-bordered" style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    <th style="text-align:center;" >DAY</th>
                    """),_display_(Seq[Any](/*59.22*/for(i <- 0 to 6) yield /*59.38*/ {_display_(Seq[Any](format.raw/*59.40*/("""
                    	<th colspan="4" style="text-align:center;" >"""),_display_(Seq[Any](/*60.67*/Application/*60.78*/.getDayFromDate(Application.getNextDate(weekStartDate,i)))),format.raw/*60.135*/("""</th>
                    """)))})),format.raw/*61.22*/("""
                       <th style="text-align:center;" >TOTAL</th>
                    
                </tr>
               <tr>
                	<td style="text-align:center;" ><b>DATE</b></td>
                	"""),_display_(Seq[Any](/*67.19*/for(i <- 0 to 6) yield /*67.35*/ {_display_(Seq[Any](format.raw/*67.37*/("""
                    	<td colspan="4" style="text-align:center;" >"""),_display_(Seq[Any](/*68.67*/currentDateFormat(Application.getNextDate(weekStartDate,i)))),format.raw/*68.126*/("""</td>
                    """)))})),format.raw/*69.22*/("""
                    <td style="text-align:center;" >HRS</td>
                    
                </tr>
                <tr>
                	<td class ="timesheetTableTD" style="text-align:center;padding : 2px;" ><b>NAME</b></td>
                	"""),_display_(Seq[Any](/*75.19*/for(i <- 0 to 6) yield /*75.35*/ {_display_(Seq[Any](format.raw/*75.37*/("""
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 10px;">START</td>
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 10px;">END</td>
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 10px;">HRS</td>
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 10px;">ACTIVITY</td>
                    	
                    """)))})),format.raw/*81.22*/("""
                    <td></td>
                </tr>
            </thead>
            <tbody>
 				<tr>
 				
                	<td style="text-align:center;"></td>
                      <! -- Thursday -->
                    	
						<! -- Thursday -->
                    	<td colspan="4">
                    		
                    		"""),_display_(Seq[Any](/*94.24*/for(timesheet <- Timesheet.getHOTimesheetByEmployeeAndDate(1,empId,Application.getNextDate(weekStartDate,0))) yield /*94.133*/{_display_(Seq[Any](format.raw/*94.134*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*97.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*97.135*/{_display_(Seq[Any](format.raw/*97.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*98.64*/timesheet/*98.73*/.leaveType)),format.raw/*98.83*/("""</span></b></center>
                    					
                    				""")))}/*100.26*/else/*100.30*/{_display_(Seq[Any](format.raw/*100.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*102.52*/timesheet/*102.61*/.startTimeHour)),format.raw/*102.75*/(""":"""),_display_(Seq[Any](/*102.77*/timesheet/*102.86*/.startTimeMins)),format.raw/*102.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*103.52*/timesheet/*103.61*/.endTimeHour)),format.raw/*103.73*/(""":"""),_display_(Seq[Any](/*103.75*/timesheet/*103.84*/.endTimeMins)),format.raw/*103.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*104.52*/timesheet/*104.61*/.duration)),format.raw/*104.70*/("""</td>
                    					<td style="padding:2px;width: 65px;background-color: cadetblue;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*106.73*/timesheet/*106.82*/.activity)),format.raw/*106.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*107.35*/timesheet/*107.44*/.activity)),format.raw/*107.53*/("""" onclick="showActivity(this)">"""),_display_(Seq[Any](/*107.85*/timesheet/*107.94*/.activity)),format.raw/*107.103*/("""</td>
                    				""")))})),format.raw/*108.26*/("""
                    				
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*112.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Friday -->
                    	<td colspan="4">
                    		
                    		"""),_display_(Seq[Any](/*120.24*/for(timesheet <- Timesheet.getHOTimesheetByEmployeeAndDate(1,empId,Application.getNextDate(weekStartDate,1))) yield /*120.133*/{_display_(Seq[Any](format.raw/*120.134*/("""
                    			<table class="table table-bordered">
                    			<tr>
                    				"""),_display_(Seq[Any](/*123.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*123.135*/{_display_(Seq[Any](format.raw/*123.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*124.64*/timesheet/*124.73*/.leaveType)),format.raw/*124.83*/("""</span></b></center>
                    					
                    				""")))}/*126.26*/else/*126.30*/{_display_(Seq[Any](format.raw/*126.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*128.52*/timesheet/*128.61*/.startTimeHour)),format.raw/*128.75*/(""":"""),_display_(Seq[Any](/*128.77*/timesheet/*128.86*/.startTimeMins)),format.raw/*128.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*129.52*/timesheet/*129.61*/.endTimeHour)),format.raw/*129.73*/(""":"""),_display_(Seq[Any](/*129.75*/timesheet/*129.84*/.endTimeMins)),format.raw/*129.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*130.52*/timesheet/*130.61*/.duration)),format.raw/*130.70*/("""</td>
                    					<td style="padding:2px;width: 65px;background-color: cadetblue;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*132.73*/timesheet/*132.82*/.activity)),format.raw/*132.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*133.35*/timesheet/*133.44*/.activity)),format.raw/*133.53*/("""" onclick="showActivity(this)">"""),_display_(Seq[Any](/*133.85*/timesheet/*133.94*/.activity)),format.raw/*133.103*/("""</td>
                    				""")))})),format.raw/*134.26*/("""
                    			
                    			</tr>
                    			</table>		
                    		""")))})),format.raw/*138.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Saturday -->
                    	<td colspan="4">
                    		
                    		"""),_display_(Seq[Any](/*146.24*/for(timesheet <- Timesheet.getHOTimesheetByEmployeeAndDate(1,empId,Application.getNextDate(weekStartDate,2))) yield /*146.133*/{_display_(Seq[Any](format.raw/*146.134*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*149.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*149.135*/{_display_(Seq[Any](format.raw/*149.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*150.64*/timesheet/*150.73*/.leaveType)),format.raw/*150.83*/("""</span></b></center>
                    					
                    				""")))}/*152.26*/else/*152.30*/{_display_(Seq[Any](format.raw/*152.31*/("""
                    					
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*154.67*/timesheet/*154.76*/.startTimeHour)),format.raw/*154.90*/(""":"""),_display_(Seq[Any](/*154.92*/timesheet/*154.101*/.startTimeMins)),format.raw/*154.115*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*155.67*/timesheet/*155.76*/.endTimeHour)),format.raw/*155.88*/(""":"""),_display_(Seq[Any](/*155.90*/timesheet/*155.99*/.endTimeMins)),format.raw/*155.111*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*156.67*/timesheet/*156.76*/.duration)),format.raw/*156.85*/("""</td>
                    					<td style="padding:2px;width: 65px;background-color: cadetblue;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*158.73*/timesheet/*158.82*/.activity)),format.raw/*158.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*159.35*/timesheet/*159.44*/.activity)),format.raw/*159.53*/("""" onclick="showActivity(this)">"""),_display_(Seq[Any](/*159.85*/timesheet/*159.94*/.activity)),format.raw/*159.103*/("""</td>
                    				""")))})),format.raw/*160.26*/("""
                    			
                    			</tr>
                    			</table>		
                    		""")))})),format.raw/*164.24*/("""
                    		
                    	</td>
                    	
                    	<! -- Sunday -->
                    	<td colspan="4">
                    		
                    		"""),_display_(Seq[Any](/*171.24*/for(timesheet <- Timesheet.getHOTimesheetByEmployeeAndDate(1,empId,Application.getNextDate(weekStartDate,3))) yield /*171.133*/{_display_(Seq[Any](format.raw/*171.134*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*174.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*174.135*/{_display_(Seq[Any](format.raw/*174.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*175.64*/timesheet/*175.73*/.leaveType)),format.raw/*175.83*/("""</span></b></center>
                    				""")))}/*176.26*/else/*176.30*/{_display_(Seq[Any](format.raw/*176.31*/("""
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*177.67*/timesheet/*177.76*/.startTimeHour)),format.raw/*177.90*/(""":"""),_display_(Seq[Any](/*177.92*/timesheet/*177.101*/.startTimeMins)),format.raw/*177.115*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*178.67*/timesheet/*178.76*/.endTimeHour)),format.raw/*178.88*/(""":"""),_display_(Seq[Any](/*178.90*/timesheet/*178.99*/.endTimeMins)),format.raw/*178.111*/("""</td>
                    					<td class="danger" style="padding:2px;">"""),_display_(Seq[Any](/*179.67*/timesheet/*179.76*/.duration)),format.raw/*179.85*/("""</td>
                    					<td style="padding:2px;width: 65px;background-color: cadetblue;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*181.73*/timesheet/*181.82*/.activity)),format.raw/*181.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*182.35*/timesheet/*182.44*/.activity)),format.raw/*182.53*/("""" onclick="showActivity(this)">"""),_display_(Seq[Any](/*182.85*/timesheet/*182.94*/.activity)),format.raw/*182.103*/("""</td>
                    				""")))})),format.raw/*183.26*/("""
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*186.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Monday -->
                    	<td colspan="4">
                    		
                    		"""),_display_(Seq[Any](/*194.24*/for(timesheet <- Timesheet.getHOTimesheetByEmployeeAndDate(1,empId,Application.getNextDate(weekStartDate,4))) yield /*194.133*/{_display_(Seq[Any](format.raw/*194.134*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*197.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*197.135*/{_display_(Seq[Any](format.raw/*197.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*198.64*/timesheet/*198.73*/.leaveType)),format.raw/*198.83*/("""</span></b></center>
                    					
                    				""")))}/*200.26*/else/*200.30*/{_display_(Seq[Any](format.raw/*200.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*202.52*/timesheet/*202.61*/.startTimeHour)),format.raw/*202.75*/(""":"""),_display_(Seq[Any](/*202.77*/timesheet/*202.86*/.startTimeMins)),format.raw/*202.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*203.52*/timesheet/*203.61*/.endTimeHour)),format.raw/*203.73*/(""":"""),_display_(Seq[Any](/*203.75*/timesheet/*203.84*/.endTimeMins)),format.raw/*203.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*204.52*/timesheet/*204.61*/.duration)),format.raw/*204.70*/("""</td>
                    					<td style="padding:2px;width: 65px;background-color: cadetblue;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*206.73*/timesheet/*206.82*/.activity)),format.raw/*206.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*207.35*/timesheet/*207.44*/.activity)),format.raw/*207.53*/(""""onclick="showActivity(this)">"""),_display_(Seq[Any](/*207.84*/timesheet/*207.93*/.activity)),format.raw/*207.102*/("""</td>
                    				""")))})),format.raw/*208.26*/("""
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*211.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Tuesday -->
                    	<td colspan="4">
                    		
                    		"""),_display_(Seq[Any](/*219.24*/for(timesheet <- Timesheet.getHOTimesheetByEmployeeAndDate(1,empId,Application.getNextDate(weekStartDate,5))) yield /*219.133*/{_display_(Seq[Any](format.raw/*219.134*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*222.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*222.135*/{_display_(Seq[Any](format.raw/*222.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*223.64*/timesheet/*223.73*/.leaveType)),format.raw/*223.83*/("""</span></b></center>
                    					
                    				""")))}/*225.26*/else/*225.30*/{_display_(Seq[Any](format.raw/*225.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*227.52*/timesheet/*227.61*/.startTimeHour)),format.raw/*227.75*/(""":"""),_display_(Seq[Any](/*227.77*/timesheet/*227.86*/.startTimeMins)),format.raw/*227.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*228.52*/timesheet/*228.61*/.endTimeHour)),format.raw/*228.73*/(""":"""),_display_(Seq[Any](/*228.75*/timesheet/*228.84*/.endTimeMins)),format.raw/*228.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*229.52*/timesheet/*229.61*/.duration)),format.raw/*229.70*/("""</td>
                    					<td style="padding:2px;width: 65px;background-color: cadetblue;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*231.73*/timesheet/*231.82*/.activity)),format.raw/*231.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*232.35*/timesheet/*232.44*/.activity)),format.raw/*232.53*/("""" onclick="showActivity(this)">"""),_display_(Seq[Any](/*232.85*/timesheet/*232.94*/.activity)),format.raw/*232.103*/("""</td>
                    				""")))})),format.raw/*233.26*/("""
                    			
                    			</tr>
                    			</table>	
                    		""")))})),format.raw/*237.24*/("""
                    		
                    	</td>
                    	
                    	
                    	<! -- Wednesday -->
                    	<td colspan="4">
                    		
                    		"""),_display_(Seq[Any](/*245.24*/for(timesheet <- Timesheet.getHOTimesheetByEmployeeAndDate(1,empId,Application.getNextDate(weekStartDate,6))) yield /*245.133*/{_display_(Seq[Any](format.raw/*245.134*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*248.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*248.135*/{_display_(Seq[Any](format.raw/*248.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*249.64*/timesheet/*249.73*/.leaveType)),format.raw/*249.83*/("""</span></b></center>
                    					
                    				""")))}/*251.26*/else/*251.30*/{_display_(Seq[Any](format.raw/*251.31*/("""
                    					
                    					<td style="padding:2.5px;">"""),_display_(Seq[Any](/*253.54*/timesheet/*253.63*/.startTimeHour)),format.raw/*253.77*/(""":"""),_display_(Seq[Any](/*253.79*/timesheet/*253.88*/.startTimeMins)),format.raw/*253.102*/("""</td>
                    					<td style="padding:2.5px;">"""),_display_(Seq[Any](/*254.54*/timesheet/*254.63*/.endTimeHour)),format.raw/*254.75*/(""":"""),_display_(Seq[Any](/*254.77*/timesheet/*254.86*/.endTimeMins)),format.raw/*254.98*/("""</td>
                    					<td style="padding:2.5px;">"""),_display_(Seq[Any](/*255.54*/timesheet/*255.63*/.duration)),format.raw/*255.72*/("""</td>
                    					<td style="padding:2px;background-color: cadetblue;width: 65px;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*257.73*/timesheet/*257.82*/.activity)),format.raw/*257.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*258.35*/timesheet/*258.44*/.activity)),format.raw/*258.53*/("""" onclick="showActivity(this)">"""),_display_(Seq[Any](/*258.85*/timesheet/*258.94*/.activity)),format.raw/*258.103*/("""</td>
                    				""")))})),format.raw/*259.26*/("""
                    			</tr>
                    			</table>			
                    		""")))})),format.raw/*262.24*/("""
                    		
                    	</td>		
                 		
                    <!-- Total Hours -->
	                    <td>"""),_display_(Seq[Any](/*267.27*/Timesheet/*267.36*/.getTotalHOTimesheetHours(empId,Application.getDate(weekStartDate)))),format.raw/*267.103*/("""</td>
                    </tr>
            </tbody>
         </table>
       </div>
     </div>
    </div>
    <div class="pull-right"  style="margin-right:380px;">
   				<input type="button" value="APPROVE" class="btn btn-success" style="padding: 10px 20px 10px 20px;font-size: 14px;" onclick="showAlertForApprove(this);">
   				<input type="button" value="REJECT" class="btn btn-danger"  style="padding: 10px 20px 10px 20px;font-size: 14px;" onclick="updateRejectedHOTimesheets('"""),_display_(Seq[Any](/*276.160*/currentDateFormat(Application.getDate(weekStartDate)))),format.raw/*276.213*/("""','"""),_display_(Seq[Any](/*276.217*/endDate)),format.raw/*276.224*/("""','"""),_display_(Seq[Any](/*276.228*/empId)),format.raw/*276.233*/("""')"></button>
   				
   	</div>	
""")))})),format.raw/*279.2*/("""
    	<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" style="margin-top:150px;">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color: #e7e7e7;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h5 class="modal-title" style="text-align:center;font-size:16px;"><b>Activity</b></h5>
        </div>
        <div class="modal-body" style="background: url(/assets/images/bg.png) #5CCAEA;margin-bottom:-20px;height: 150px">
          <p id="modelBodyP" style="font-size:20px;text-align:center;overflow-y: scroll;height: 130px;padding: 0px;
          	margin: 0px -20px 0px -10px;word-wrap: break-word;"></p>
        </div>
        <div class="modal-footer" style="background-color: #e7e7e7;text-align:center;">
          <button type="button" class="btn btn-primary" data-dismiss="modal" style="font-size:18px;">Close</button>
        </div>
      </div>
      
    </div>
  </div>
 """),format.raw/*321.11*/("""	
  	<!-- Modal For Approve-->
  <div class="modal fade" id="approveModel" role="dialog" style="margin-top:150px;">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color: #e7e7e7;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body" style="background: url(/assets/images/bg.png) #5CCAEA;margin-bottom:-20px;height: 150px">
          <p id="modelBodyPForApprove" style="font-size:26px;text-align:center;
          	margin: 20px 0px 0px 0px;word-wrap: break-word;">Are you sure do you want to Approve?</p>
        </div>
        <div class="modal-footer" style="background-color: #e7e7e7;text-align:center;">
          <button type="button" class="btn btn-success"  style="font-size:18px;" onclick="subApproveForm()">Yes</button>
          <button type="button" class="btn btn-danger" data-dismiss="modal" style="font-size:18px;">No</button>
        </div>
      </div>
      
    </div>
  </div>
  	<!-- Modal For Reject-->
  <div class="modal fade" id="rejectModel" role="dialog" style="margin-top:150px;">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color: #e7e7e7;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <form action=""""),_display_(Seq[Any](/*352.24*/routes/*352.30*/.Timesheets.updateRejectedStatusForHOTimesheets())),format.raw/*352.79*/("""" id="updateRejectedStatusForHOTimesheetFormId">
        <input type="hidden" id="stDateForUpdateRejectedStatusForHOTimesheetsMethod" name="stDateForUpdateRejectedStatusForHOTimesheetsMethod">
   		<input type="hidden" id="empIdForUpdateRejectedStatusForHOTimesheetsMethod" name="empIdForUpdateRejectedStatusForHOTimesheetsMethod"> 
        <div class="modal-body" style="background: url(/assets/images/bg.png) #5CCAEA;margin-bottom:-20px;height: 150px">
          <p id="modelBodyPForReject" style="font-size:26px;text-align:center;
          	margin: 20px 0px 0px 0px;word-wrap: break-word;">Are you sure do you want to Reject?</p>
        </div>
        <div class="modal-footer" style="background-color: #e7e7e7;text-align:center;">
          <button type="button" class="btn btn-success"  style="font-size:18px;" onclick="subRejectForm()">Yes</button>
          <button type="button" class="btn btn-danger" data-dismiss="modal" style="font-size:18px;">No</button>
        </div>
      </div>
      
    </div>
  </div>											
""")))})),format.raw/*367.2*/("""

           """))}
    }
    
    def render(weekStartDate:Date,endDate:Date,empId:Long): play.api.templates.HtmlFormat.Appendable = apply(weekStartDate,endDate,empId)
    
    def f:((Date,Date,Long) => play.api.templates.HtmlFormat.Appendable) = (weekStartDate,endDate,empId) => apply(weekStartDate,endDate,empId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:12 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/listPageForHOTVerification.scala.html
                    HASH: bece2da41a39bb2a8f38dd975c235c45f8f5987e
                    MATRIX: 814->1|940->53|965->70|1183->50|1212->258|1320->330|1335->336|1397->375|1441->384|1453->388|1492->390|1766->628|1781->634|1823->654|1930->725|2019->805|2058->806|2189->905|2453->1133|2503->1174|2542->1175|2705->1306|2889->1455|2930->1487|2970->1489|3087->1570|3101->1575|3138->1590|3192->1613|3344->1729|3359->1735|3421->1788|3461->1790|3615->1907|3636->1918|3688->1947|3833->2055|3854->2066|3900->2089|4043->2195|4071->2200|4352->2445|4384->2461|4424->2463|4528->2531|4548->2542|4628->2599|4688->2627|4944->2847|4976->2863|5016->2865|5120->2933|5202->2992|5262->3020|5554->3276|5586->3292|5626->3294|6091->3727|6476->4076|6602->4185|6642->4186|6796->4304|6915->4413|6955->4414|7056->4479|7074->4488|7106->4498|7200->4572|7214->4576|7254->4577|7371->4657|7390->4666|7427->4680|7466->4682|7485->4691|7523->4705|7618->4763|7637->4772|7672->4784|7711->4786|7730->4795|7765->4807|7860->4865|7879->4874|7911->4883|8170->5105|8189->5114|8221->5123|8296->5161|8315->5170|8347->5179|8416->5211|8435->5220|8468->5229|8533->5261|8683->5378|8945->5603|9072->5712|9113->5713|9267->5830|9387->5939|9428->5940|9530->6005|9549->6014|9582->6024|9676->6098|9690->6102|9730->6103|9847->6183|9866->6192|9903->6206|9942->6208|9961->6217|9999->6231|10094->6289|10113->6298|10148->6310|10187->6312|10206->6321|10241->6333|10336->6391|10355->6400|10387->6409|10646->6631|10665->6640|10697->6649|10772->6687|10791->6696|10823->6705|10892->6737|10911->6746|10944->6755|11009->6787|11157->6902|11421->7129|11548->7238|11589->7239|11744->7357|11864->7466|11905->7467|12007->7532|12026->7541|12059->7551|12153->7625|12167->7629|12207->7630|12339->7725|12358->7734|12395->7748|12434->7750|12454->7759|12492->7773|12602->7846|12621->7855|12656->7867|12695->7869|12714->7878|12750->7890|12860->7963|12879->7972|12911->7981|13170->8203|13189->8212|13221->8221|13296->8259|13315->8268|13347->8277|13416->8309|13435->8318|13468->8327|13533->8359|13681->8474|13920->8676|14047->8785|14088->8786|14243->8904|14363->9013|14404->9014|14506->9079|14525->9088|14558->9098|14625->9145|14639->9149|14679->9150|14784->9218|14803->9227|14840->9241|14879->9243|14899->9252|14937->9266|15047->9339|15066->9348|15101->9360|15140->9362|15159->9371|15195->9383|15305->9456|15324->9465|15356->9474|15615->9696|15634->9705|15666->9714|15741->9752|15760->9761|15792->9770|15861->9802|15880->9811|15913->9820|15978->9852|16102->9943|16364->10168|16491->10277|16532->10278|16687->10396|16807->10505|16848->10506|16950->10571|16969->10580|17002->10590|17096->10664|17110->10668|17150->10669|17267->10749|17286->10758|17323->10772|17362->10774|17381->10783|17419->10797|17514->10855|17533->10864|17568->10876|17607->10878|17626->10887|17661->10899|17756->10957|17775->10966|17807->10975|18066->11197|18085->11206|18117->11215|18192->11253|18211->11262|18243->11271|18311->11302|18330->11311|18363->11320|18428->11352|18552->11443|18815->11669|18942->11778|18983->11779|19138->11897|19258->12006|19299->12007|19401->12072|19420->12081|19453->12091|19547->12165|19561->12169|19601->12170|19718->12250|19737->12259|19774->12273|19813->12275|19832->12284|19870->12298|19965->12356|19984->12365|20019->12377|20058->12379|20077->12388|20112->12400|20207->12458|20226->12467|20258->12476|20517->12698|20536->12707|20568->12716|20643->12754|20662->12763|20694->12772|20763->12804|20782->12813|20815->12822|20880->12854|21027->12968|21292->13196|21419->13305|21460->13306|21615->13424|21735->13533|21776->13534|21878->13599|21897->13608|21930->13618|22024->13692|22038->13696|22078->13697|22197->13779|22216->13788|22253->13802|22292->13804|22311->13813|22349->13827|22446->13887|22465->13896|22500->13908|22539->13910|22558->13919|22593->13931|22690->13991|22709->14000|22741->14009|23000->14231|23019->14240|23051->14249|23126->14287|23145->14296|23177->14305|23246->14337|23265->14346|23298->14355|23363->14387|23487->14478|23669->14623|23688->14632|23779->14699|24311->15193|24388->15246|24430->15250|24461->15257|24503->15261|24532->15266|24602->15304|25699->17437|27246->18947|27262->18953|27334->19002|28417->20053
                    LINES: 26->1|28->2|28->2|37->1|38->10|39->11|39->11|39->11|40->12|40->12|40->12|48->20|48->20|48->20|49->21|49->21|49->21|51->23|58->30|58->30|58->30|60->32|70->42|70->42|70->42|72->44|72->44|72->44|74->46|78->50|78->50|78->50|78->50|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|87->59|87->59|87->59|88->60|88->60|88->60|89->61|95->67|95->67|95->67|96->68|96->68|97->69|103->75|103->75|103->75|109->81|122->94|122->94|122->94|125->97|125->97|125->97|126->98|126->98|126->98|128->100|128->100|128->100|130->102|130->102|130->102|130->102|130->102|130->102|131->103|131->103|131->103|131->103|131->103|131->103|132->104|132->104|132->104|134->106|134->106|134->106|135->107|135->107|135->107|135->107|135->107|135->107|136->108|140->112|148->120|148->120|148->120|151->123|151->123|151->123|152->124|152->124|152->124|154->126|154->126|154->126|156->128|156->128|156->128|156->128|156->128|156->128|157->129|157->129|157->129|157->129|157->129|157->129|158->130|158->130|158->130|160->132|160->132|160->132|161->133|161->133|161->133|161->133|161->133|161->133|162->134|166->138|174->146|174->146|174->146|177->149|177->149|177->149|178->150|178->150|178->150|180->152|180->152|180->152|182->154|182->154|182->154|182->154|182->154|182->154|183->155|183->155|183->155|183->155|183->155|183->155|184->156|184->156|184->156|186->158|186->158|186->158|187->159|187->159|187->159|187->159|187->159|187->159|188->160|192->164|199->171|199->171|199->171|202->174|202->174|202->174|203->175|203->175|203->175|204->176|204->176|204->176|205->177|205->177|205->177|205->177|205->177|205->177|206->178|206->178|206->178|206->178|206->178|206->178|207->179|207->179|207->179|209->181|209->181|209->181|210->182|210->182|210->182|210->182|210->182|210->182|211->183|214->186|222->194|222->194|222->194|225->197|225->197|225->197|226->198|226->198|226->198|228->200|228->200|228->200|230->202|230->202|230->202|230->202|230->202|230->202|231->203|231->203|231->203|231->203|231->203|231->203|232->204|232->204|232->204|234->206|234->206|234->206|235->207|235->207|235->207|235->207|235->207|235->207|236->208|239->211|247->219|247->219|247->219|250->222|250->222|250->222|251->223|251->223|251->223|253->225|253->225|253->225|255->227|255->227|255->227|255->227|255->227|255->227|256->228|256->228|256->228|256->228|256->228|256->228|257->229|257->229|257->229|259->231|259->231|259->231|260->232|260->232|260->232|260->232|260->232|260->232|261->233|265->237|273->245|273->245|273->245|276->248|276->248|276->248|277->249|277->249|277->249|279->251|279->251|279->251|281->253|281->253|281->253|281->253|281->253|281->253|282->254|282->254|282->254|282->254|282->254|282->254|283->255|283->255|283->255|285->257|285->257|285->257|286->258|286->258|286->258|286->258|286->258|286->258|287->259|290->262|295->267|295->267|295->267|304->276|304->276|304->276|304->276|304->276|304->276|307->279|329->321|360->352|360->352|360->352|375->367
                    -- GENERATED --
                */
            