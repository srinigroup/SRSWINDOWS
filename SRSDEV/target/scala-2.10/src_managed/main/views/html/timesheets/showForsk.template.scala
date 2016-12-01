
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
object showForsk extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Timesheet],Store,Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(timesheetForm:Form[Timesheet],store:Store,emp:Employee):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.58*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/("""    

 """),_display_(Seq[Any](/*6.3*/main/*6.7*/{_display_(Seq[Any](format.raw/*6.8*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*14.24*/routes/*14.30*/.Application.index())),format.raw/*14.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Application.showOptions("EMP TIMESHEET","ALL"))),format.raw/*15.80*/("""" class="btn btn-default">EMP TIMESHEET</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.showOptions("EMP TIMESHEET","ALL"))),format.raw/*21.80*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         	<br><br>
         	
         	"""),_display_(Seq[Any](/*28.12*/if(flash.containsKey("success"))/*28.44*/ {_display_(Seq[Any](format.raw/*28.46*/("""
       			<div class="alert alert-warning">
            		<strong>Done!</strong> """),_display_(Seq[Any](/*30.39*/flash/*30.44*/.get("success"))),format.raw/*30.59*/("""
        		</div>
    		""")))})),format.raw/*32.8*/("""
	
  
  	"""),_display_(Seq[Any](/*35.5*/helper/*35.11*/.form(action = routes.Timesheets.saveForsk(store.id), 'id -> "timesheetForm", 'onsubmit -> "return checkTimesheetExists();")/*35.135*/ {_display_(Seq[Any](format.raw/*35.137*/("""
		

		<h2>Time Sheet </h2>
		<hr/>
		<br/>
		<br/>
		
		
        	
          			<div class="table-responsive"> 
        				<table class="table table-bordered" style="background-color: white;border-color: #fff;">
        					<tr>
								<td> 
									<div class="clearfix  " id="empName_field">
									    <label for="empName">Employee</label>
									    	<div class="input">
									        
									    		<input type="text" value=""""),_display_(Seq[Any](/*53.43*/emp/*53.46*/.firstName)),format.raw/*53.56*/("""."""),_display_(Seq[Any](/*53.58*/emp/*53.61*/.lastName)),format.raw/*53.70*/(""""  readonly='readonly'/> 
									
									        <span class="help-inline"></span>
									    </div>
									</div>
								
								 	<input type="hidden" name="empid" id="empid" value=""""),_display_(Seq[Any](/*59.64*/emp/*59.67*/.id)),format.raw/*59.70*/(""""  readonly='readonly'/>
								</td>
								<td>
									<div class="clearfix  " id="date_field">
		    							<label for="date">Start Date</label>
		    								<div class="input">
		        
		    									<input type="text" id="timesheetStartDate" name="date" class="startDatePicker" required />
		
		        
		    								</div>
									</div>
								</td>
								<td>
								<div class="clearfix  " id="endDate_field">
	    							<label for="endDate">End Date</label>
	    								<div class="input">
	        
	    									<input type="text" id="timesheetEndDate" name="endDate" class="endDatePicker" required />
	
	    								</div>
									</div>
								</td>
								<td>
									 <input type="checkbox" name="applyLeave" id="applyLeaveCheckBox" /> Leave
									 
									<div class="clearfix" id="leaveType_field" style="display:none;">
    									<label for="leaveType">Leave Type</label>
    										<div class="input">
    											<select id="leaveType" name="leaveType">
    												 <option class="blank" value="None">-- Choose Type --</option>
										             <option value="AL" >AL</option>
							                         <option value="SL" >SL</option>
							                         <option value="PH" >PH</option>
							                    </select> 
    										</div>
									</div>
								
								</td>
								
									<input type="hidden" name="firmid" value=""""),_display_(Seq[Any](/*99.53*/store/*99.58*/.id)),format.raw/*99.61*/(""""/>
								
							</tr>
							<tr>
								
								<td>
									<div class="clearfix  " id="timesheetStartTime_field">
    									<label for="timesheetStartTime">Start Time</label>
    										<div class="input">
    											<select id="startTimeHour" name="startTimeHour" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Hour --</option>
										             """),_display_(Seq[Any](/*110.25*/for(i <- 0 to 9) yield /*110.41*/ {_display_(Seq[Any](format.raw/*110.43*/("""
    													<option value="0"""),_display_(Seq[Any](/*111.35*/i)),format.raw/*111.36*/("""" >0"""),_display_(Seq[Any](/*111.41*/i)),format.raw/*111.42*/("""</option>
													 """)))})),format.raw/*112.16*/("""
													  """),_display_(Seq[Any](/*113.17*/for(i <- 10 to 23) yield /*113.35*/ {_display_(Seq[Any](format.raw/*113.37*/("""
    													<option value=""""),_display_(Seq[Any](/*114.34*/i)),format.raw/*114.35*/("""" >"""),_display_(Seq[Any](/*114.39*/i)),format.raw/*114.40*/("""</option>
													 """)))})),format.raw/*115.16*/("""
							                    </select>
							                    <select id="startTimeMins" name="startTimeMins" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" >00</option>
							                         <option value="15" >15</option>
							                         <option value="30" >30</option>
							                         <option value="45" >45</option>
							                    </select> 
    										</div>
									</div>
								</td>
								
								<td>
									<div class="clearfix  " id="timesheetEndTime_field">
    									<label for="timesheetEndTime">End Time</label>
    										<div class="input">
    											<select id="endTimeHour" name="endTimeHour" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Hour --</option>
    												 """),_display_(Seq[Any](/*134.19*/for(i <- 0 to 9) yield /*134.35*/ {_display_(Seq[Any](format.raw/*134.37*/("""
    													<option value="0"""),_display_(Seq[Any](/*135.35*/i)),format.raw/*135.36*/("""" >0"""),_display_(Seq[Any](/*135.41*/i)),format.raw/*135.42*/("""</option>
													 """)))})),format.raw/*136.16*/("""
													  """),_display_(Seq[Any](/*137.17*/for(i <- 10 to 23) yield /*137.35*/ {_display_(Seq[Any](format.raw/*137.37*/("""
    													<option value=""""),_display_(Seq[Any](/*138.34*/i)),format.raw/*138.35*/("""" >"""),_display_(Seq[Any](/*138.39*/i)),format.raw/*138.40*/("""</option>
													 """)))})),format.raw/*139.16*/("""
    												
							                    </select>
							                    <select id="endTimeMins" name="endTimeMins" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" >00</option>
							                         <option value="15" >15</option>
							                         <option value="30" >30</option>
							                         <option value="45" >45</option>
							                    </select> 
    										</div>
									</div>
								</td>
								
								<td>
									"""),_display_(Seq[Any](/*154.11*/helper/*154.17*/.inputText(timesheetForm("duration"), '_label -> "Duration", 'readonly -> "readonly"))),format.raw/*154.102*/("""
								</td>
								
								<td>
									
									"""),_display_(Seq[Any](/*159.11*/select(
				  				 timesheetForm("status"),
				  				 options(Seq("OPEN","SUBMITTED")),
				 				 '_label -> "Status", 'required -> "true", '_default -> "-- Select Status --"
								))),format.raw/*163.10*/("""</td>
								
							</tr>
							
						</table>
					</div>
            
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
    
    


	""")))})),format.raw/*183.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*188.2*/("""<!-- main end -->

 
   """))}
    }
    
    def render(timesheetForm:Form[Timesheet],store:Store,emp:Employee): play.api.templates.HtmlFormat.Appendable = apply(timesheetForm,store,emp)
    
    def f:((Form[Timesheet],Store,Employee) => play.api.templates.HtmlFormat.Appendable) = (timesheetForm,store,emp) => apply(timesheetForm,store,emp)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/showForsk.scala.html
                    HASH: 93887d772ce4a9f5420b805bafdcc005945b370d
                    MATRIX: 813->1|1016->57|1045->79|1072->115|1116->125|1127->129|1164->130|1437->367|1452->373|1494->393|1613->476|1628->482|1697->529|1996->792|2011->798|2080->845|2304->1033|2345->1065|2385->1067|2506->1152|2520->1157|2557->1172|2615->1199|2663->1212|2678->1218|2812->1342|2853->1344|3351->1806|3363->1809|3395->1819|3433->1821|3445->1824|3476->1833|3713->2034|3725->2037|3750->2040|5257->3511|5271->3516|5296->3519|5763->3949|5796->3965|5837->3967|5910->4003|5934->4004|5976->4009|6000->4010|6059->4036|6114->4054|6149->4072|6190->4074|6262->4109|6286->4110|6327->4114|6351->4115|6410->4141|7391->5085|7424->5101|7465->5103|7538->5139|7562->5140|7604->5145|7628->5146|7687->5172|7742->5190|7777->5208|7818->5210|7890->5245|7914->5246|7955->5250|7979->5251|8038->5277|8695->5897|8711->5903|8820->5988|8919->6050|9131->6239|9650->6726|9725->6769
                    LINES: 26->1|32->1|33->3|33->4|35->6|35->6|35->6|43->14|43->14|43->14|44->15|44->15|44->15|50->21|50->21|50->21|57->28|57->28|57->28|59->30|59->30|59->30|61->32|64->35|64->35|64->35|64->35|82->53|82->53|82->53|82->53|82->53|82->53|88->59|88->59|88->59|128->99|128->99|128->99|139->110|139->110|139->110|140->111|140->111|140->111|140->111|141->112|142->113|142->113|142->113|143->114|143->114|143->114|143->114|144->115|163->134|163->134|163->134|164->135|164->135|164->135|164->135|165->136|166->137|166->137|166->137|167->138|167->138|167->138|167->138|168->139|183->154|183->154|183->154|188->159|192->163|212->183|217->188
                    -- GENERATED --
                */
            