
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Timesheet],Timesheet,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(timesheetForm: Form[Timesheet],timesheet:Timesheet,store:Store):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";

import java.lang.String; var display = "";

def /*6.2*/checkSelectedLeave/*6.20*/(leaveType:String) = {{
                   val result="selected"
                   if((timesheet.leaveType != null) && (timesheet.leaveType.equals(leaveType))){
                      result
                   }
                   
}};def /*14.2*/checkBoxForLeave/*14.18*/() = {{
                   val result="checked"
                   if( (timesheet.leaveType != null) && (timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )){
                      result
                   }
                   
}};def /*22.3*/checkSelected/*22.16*/(jobTitle:String,id:String) = {{
                   val result="selected"
                   if(jobTitle==id){
                      result
                   }
                   
}};def /*30.2*/checkSelectedDuration/*30.23*/(jobTitle:String,id:Int) = {{  <!-- in DB values are stored as String, that's y convert into int for integer comparison -->

		val result="selected"
			if(jobTitle != null){   <!-- check for Null ,for the Timesheets which are Created when shift add -->
				if(jobTitle.toInt==id){
					result
				}
			}
			
}};def /*42.2*/currentDateFormat/*42.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")
 
  if(currDate != null){
  
  	curTimeFormat.format(currDate)
  }
  
}};
Seq[Any](format.raw/*1.66*/("""

"""),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*20.2*/("""

 """),format.raw/*28.2*/("""

"""),format.raw/*39.2*/("""
            

"""),format.raw/*54.2*/("""


"""),format.raw/*58.1*/("""
"""),_display_(Seq[Any](/*59.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*59.88*/{_display_(Seq[Any](format.raw/*59.89*/("""

	"""),_display_(Seq[Any](/*61.3*/{fieldView="disabled"})),format.raw/*61.25*/("""

""")))})),format.raw/*63.2*/("""

"""),format.raw/*66.1*/("""
"""),_display_(Seq[Any](/*67.2*/if((timesheet.status).equals("APPROVED") )/*67.44*/{_display_(Seq[Any](format.raw/*67.45*/("""
					
					"""),_display_(Seq[Any](/*69.7*/{display="disabled"})),format.raw/*69.27*/("""
""")))})),format.raw/*70.2*/("""


"""),_display_(Seq[Any](/*73.2*/main/*73.6*/{_display_(Seq[Any](format.raw/*73.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*82.24*/routes/*82.30*/.Application.index())),format.raw/*82.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*83.27*/routes/*83.33*/.Application.showOptions("TIMESHEET","ALL"))),format.raw/*83.76*/("""" class="btn btn-default">TIMESHEET</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*84.54*/flash/*84.59*/.get("pageAction"))),format.raw/*84.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*89.27*/routes/*89.33*/.Application.showOptions("TIMESHEET",flash.get("pageAction")))),format.raw/*89.94*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*97.3*/if(flash.containsKey("success"))/*97.35*/ {_display_(Seq[Any](format.raw/*97.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*99.37*/flash/*99.42*/.get("success"))),format.raw/*99.57*/("""
        </div>
    """)))})),format.raw/*101.6*/(""" 

   
 
	<form action =""""),_display_(Seq[Any](/*105.18*/routes/*105.24*/.Timesheets.update(timesheet.id,store.id))),format.raw/*105.65*/("""" method="POST" id="timesheetForm" onsubmit="return checkTimesheetExistsEditPage("""),_display_(Seq[Any](/*105.147*/timesheet/*105.156*/.id)),format.raw/*105.159*/(""");"> 


			<h2>Time Sheet Details</h2>
			<hr/>
			<br/>
			<br/>
		
		
        	
          			<div class="table-responsive"> 
        				<table class="table table-bordered" style="background-color: white;border-color: #fff;">
							<tr>
								<td>
								
									"""),_display_(Seq[Any](/*120.11*/if(Shift.timesheetWithShift(timesheet.id) != null)/*120.61*/{_display_(Seq[Any](format.raw/*120.62*/("""
									
										Employee: <b>"""),_display_(Seq[Any](/*122.25*/Employee/*122.33*/.find.byId(timesheet.empid))),format.raw/*122.60*/("""</b>
										<input type="hidden" id="empid" name="empid" value=""""),_display_(Seq[Any](/*123.64*/timesheet/*123.73*/.empid)),format.raw/*123.79*/(""""/>
									
									""")))}/*125.11*/else/*125.15*/{_display_(Seq[Any](format.raw/*125.16*/("""
									
											"""),_display_(Seq[Any](/*127.13*/select(
						                timesheetForm("empid"), 
						                options(Employee.options(store.id)), 
						                '_label -> "Employee", 'required -> "true", '_default -> "-- Choose a Employee --",
						                '_showConstraints -> false
										
										))),format.raw/*133.12*/("""
									
									""")))})),format.raw/*135.11*/("""
									
								</td>
								
								<td> 
								
									<div class="clearfix" id="date_field">
    									<label for="date">Start Date</label>
    									<div class="input">
											<input type="text" name="date" class="startDatePicker" value=""""),_display_(Seq[Any](/*144.75*/currentDateFormat(timesheet.date))),format.raw/*144.108*/("""" required />
										</div>
									</div> 
								</td>
								
								<td> 
								
									<div class="clearfix" id="date_field">
    									<label for="date">End Date</label>
    									<div class="input">
											<input type="text" name="endDate" class="endDatePicker" value=""""),_display_(Seq[Any](/*154.76*/currentDateFormat(timesheet.endDate))),format.raw/*154.112*/("""" required />
										</div>
									</div> 
								</td>
								
								<td>
									 <input type="checkbox" name="applyLeave" id="applyLeaveCheckBox" """),_display_(Seq[Any](/*160.77*/checkBoxForLeave())),format.raw/*160.95*/(""" /> Leave
									 
									<div class="clearfix" id="leaveType_field" style="display:none;">
    									<label for="leaveType">Leave Type</label>
    										<div class="input">
    											<select id="leaveType" name="leaveType">
    												 <option class="blank" value="None">-- Choose Type --</option>
										             <option value="AL" """),_display_(Seq[Any](/*167.44*/checkSelectedLeave("AL"))),format.raw/*167.68*/(""">AL</option>
							                         <option value="SL" """),_display_(Seq[Any](/*168.53*/checkSelectedLeave("SL"))),format.raw/*168.77*/(""">SL</option>
							                         <option value="PH" """),_display_(Seq[Any](/*169.53*/checkSelectedLeave("PH"))),format.raw/*169.77*/(""">PH</option>
							                    </select> 
    										</div>
									</div>
								
								</td>
								
									<input type="hidden" name="firmid" value=""""),_display_(Seq[Any](/*176.53*/store/*176.58*/.id)),format.raw/*176.61*/(""""/>
							</tr>	
							<tr>
								
								<td>
									<div class="clearfix  " id="timesheetStartTime_field">
    									<label for="timesheetStartTime">Start Time</label>
    										<div class="input">
    											<select id="startTimeHour" name="startTimeHour" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Hour --</option>
    												 """),_display_(Seq[Any](/*186.19*/for(i <- 0 to 9) yield /*186.35*/ {_display_(Seq[Any](format.raw/*186.37*/("""
    													<option value="0"""),_display_(Seq[Any](/*187.35*/i)),format.raw/*187.36*/("""" """),_display_(Seq[Any](/*187.39*/checkSelectedDuration(timesheet.startTimeHour,i))),format.raw/*187.87*/(""">0"""),_display_(Seq[Any](/*187.90*/i)),format.raw/*187.91*/("""</option>
													 """)))})),format.raw/*188.16*/("""
													  """),_display_(Seq[Any](/*189.17*/for(i <- 10 to 23) yield /*189.35*/ {_display_(Seq[Any](format.raw/*189.37*/("""
    													<option value=""""),_display_(Seq[Any](/*190.34*/i)),format.raw/*190.35*/("""" """),_display_(Seq[Any](/*190.38*/checkSelectedDuration(timesheet.startTimeHour,i))),format.raw/*190.86*/(""">"""),_display_(Seq[Any](/*190.88*/i)),format.raw/*190.89*/("""</option>
													 """)))})),format.raw/*191.16*/("""
										             
							                    </select>
							                    <select id="startTimeMins" name="startTimeMins" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" """),_display_(Seq[Any](/*196.44*/checkSelected(timesheet.startTimeMins,"00"))),format.raw/*196.87*/(""">00</option>
							                         <option value="15" """),_display_(Seq[Any](/*197.53*/checkSelected(timesheet.startTimeMins,"15"))),format.raw/*197.96*/(""">15</option>
							                         <option value="30" """),_display_(Seq[Any](/*198.53*/checkSelected(timesheet.startTimeMins,"30"))),format.raw/*198.96*/(""">30</option>
							                         <option value="45" """),_display_(Seq[Any](/*199.53*/checkSelected(timesheet.startTimeMins,"45"))),format.raw/*199.96*/(""">45</option>
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
    												  """),_display_(Seq[Any](/*213.20*/for(i <- 0 to 9) yield /*213.36*/ {_display_(Seq[Any](format.raw/*213.38*/("""
    													<option value="0"""),_display_(Seq[Any](/*214.35*/i)),format.raw/*214.36*/("""" """),_display_(Seq[Any](/*214.39*/checkSelectedDuration(timesheet.endTimeHour,i))),format.raw/*214.85*/(""">0"""),_display_(Seq[Any](/*214.88*/i)),format.raw/*214.89*/("""</option> <!-- integer comparison -->
													 """)))})),format.raw/*215.16*/("""
													  """),_display_(Seq[Any](/*216.17*/for(i <- 10 to 23) yield /*216.35*/ {_display_(Seq[Any](format.raw/*216.37*/("""
    													<option value=""""),_display_(Seq[Any](/*217.34*/i)),format.raw/*217.35*/("""" """),_display_(Seq[Any](/*217.38*/checkSelectedDuration(timesheet.endTimeHour,i))),format.raw/*217.84*/(""">"""),_display_(Seq[Any](/*217.86*/i)),format.raw/*217.87*/("""</option>
													 """)))})),format.raw/*218.16*/("""
										             
							                    </select>
							                    <select id="endTimeMins" name="endTimeMins" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" """),_display_(Seq[Any](/*223.44*/checkSelected(timesheet.endTimeMins,"00"))),format.raw/*223.85*/(""">00</option> <!-- String comparison -->
							                         <option value="15" """),_display_(Seq[Any](/*224.53*/checkSelected(timesheet.endTimeMins,"15"))),format.raw/*224.94*/(""">15</option>
							                         <option value="30" """),_display_(Seq[Any](/*225.53*/checkSelected(timesheet.endTimeMins,"30"))),format.raw/*225.94*/(""">30</option>
							                         <option value="45" """),_display_(Seq[Any](/*226.53*/checkSelected(timesheet.endTimeMins,"45"))),format.raw/*226.94*/(""">45</option>
							                    </select> 
    										</div>
									</div>
								</td>
								
								<td>
					 				"""),_display_(Seq[Any](/*233.12*/helper/*233.18*/.inputText(timesheetForm("duration"), '_label -> "Duration", 'readonly -> "readonly"))),format.raw/*233.103*/("""
								</td>
								
								<td>
									"""),_display_(Seq[Any](/*237.11*/select(
				  				 timesheetForm("status"),
				  				 options(Seq("OPEN","APPROVED","REJECTED","SUBMITTED")),
				 				 '_label -> "Status", 'required -> "true", '_default -> "-- Select Status --"
								))),format.raw/*241.10*/("""
								</td>
							</tr>
						</table>
					</div>
            
      	
      	      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*253.6*/if((flash.get("pageAction")).equals("MODIFY"))/*253.52*/{_display_(Seq[Any](format.raw/*253.53*/("""
					<input type="submit" class="btn btn-large btn-success" """),_display_(Seq[Any](/*254.62*/display)),format.raw/*254.69*/(""" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*256.6*/("""
				"""),_display_(Seq[Any](/*257.6*/if((flash.get("pageAction")).equals("DELETE"))/*257.52*/{_display_(Seq[Any](format.raw/*257.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*259.17*/routes/*259.23*/.Timesheets.delete(timesheet.id))),format.raw/*259.55*/("""" class="btn btn-danger">Delete</a>
	 				
	 			""")))})),format.raw/*261.7*/("""
 				</p>
		    </div>
        </div>
       
    
  


</form>
	
	</div>
	</div>

""")))})),format.raw/*275.2*/("""<!-- main end -->
"""))}
    }
    
    def render(timesheetForm:Form[Timesheet],timesheet:Timesheet,store:Store): play.api.templates.HtmlFormat.Appendable = apply(timesheetForm,timesheet,store)
    
    def f:((Form[Timesheet],Timesheet,Store) => play.api.templates.HtmlFormat.Appendable) = (timesheetForm,timesheet,store) => apply(timesheetForm,timesheet,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/editForm.scala.html
                    HASH: d1c46a3fb6168e9cf17debbe3cd7512a346cfed1
                    MATRIX: 813->1|1094->121|1120->139|1367->374|1392->390|1691->678|1713->691|1909->875|1939->896|2262->1221|2288->1238|2534->65|2562->84|2589->119|2617->371|2646->674|2676->872|2705->1205|2747->1454|2777->1503|2814->1505|2909->1591|2948->1592|2987->1596|3031->1618|3065->1621|3094->1667|3131->1669|3182->1711|3221->1712|3269->1725|3311->1745|3344->1747|3383->1751|3395->1755|3433->1756|3701->1988|3716->1994|3758->2014|3876->2096|3891->2102|3956->2145|4085->2238|4099->2243|4139->2261|4333->2419|4348->2425|4431->2486|4631->2651|4672->2683|4712->2685|4827->2764|4841->2769|4878->2784|4931->2805|4994->2831|5010->2837|5074->2878|5194->2960|5214->2969|5241->2972|5550->3244|5610->3294|5650->3295|5722->3330|5740->3338|5790->3365|5895->3433|5914->3442|5943->3448|5987->3472|6001->3476|6041->3477|6101->3500|6416->3792|6470->3813|6769->4075|6826->4108|7161->4406|7221->4442|7418->4602|7459->4620|7859->4983|7906->5007|8008->5072|8055->5096|8157->5161|8204->5185|8413->5357|8428->5362|8454->5365|8896->5770|8929->5786|8970->5788|9042->5823|9066->5824|9106->5827|9177->5875|9217->5878|9241->5879|9299->5904|9353->5921|9388->5939|9429->5941|9500->5975|9524->5976|9564->5979|9635->6027|9674->6029|9698->6030|9756->6055|10084->6346|10150->6389|10252->6454|10318->6497|10420->6562|10486->6605|10588->6670|10654->6713|11177->7199|11210->7215|11251->7217|11323->7252|11347->7253|11387->7256|11456->7302|11496->7305|11520->7306|11606->7359|11660->7376|11695->7394|11736->7396|11807->7430|11831->7431|11871->7434|11940->7480|11979->7482|12003->7483|12061->7508|12385->7795|12449->7836|12578->7928|12642->7969|12744->8034|12808->8075|12910->8140|12974->8181|13146->8316|13162->8322|13271->8407|13355->8454|13585->8661|13911->8951|13967->8997|14007->8998|14106->9060|14136->9067|14259->9158|14301->9164|14357->9210|14397->9211|14457->9234|14473->9240|14528->9272|14609->9321|14726->9406
                    LINES: 26->1|35->6|35->6|41->14|41->14|47->22|47->22|53->30|53->30|62->42|62->42|75->1|77->4|77->5|78->12|80->20|82->28|84->39|87->54|90->58|91->59|91->59|91->59|93->61|93->61|95->63|97->66|98->67|98->67|98->67|100->69|100->69|101->70|104->73|104->73|104->73|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|120->89|120->89|120->89|128->97|128->97|128->97|130->99|130->99|130->99|132->101|136->105|136->105|136->105|136->105|136->105|136->105|151->120|151->120|151->120|153->122|153->122|153->122|154->123|154->123|154->123|156->125|156->125|156->125|158->127|164->133|166->135|175->144|175->144|185->154|185->154|191->160|191->160|198->167|198->167|199->168|199->168|200->169|200->169|207->176|207->176|207->176|217->186|217->186|217->186|218->187|218->187|218->187|218->187|218->187|218->187|219->188|220->189|220->189|220->189|221->190|221->190|221->190|221->190|221->190|221->190|222->191|227->196|227->196|228->197|228->197|229->198|229->198|230->199|230->199|244->213|244->213|244->213|245->214|245->214|245->214|245->214|245->214|245->214|246->215|247->216|247->216|247->216|248->217|248->217|248->217|248->217|248->217|248->217|249->218|254->223|254->223|255->224|255->224|256->225|256->225|257->226|257->226|264->233|264->233|264->233|268->237|272->241|284->253|284->253|284->253|285->254|285->254|287->256|288->257|288->257|288->257|290->259|290->259|290->259|292->261|306->275
                    -- GENERATED --
                */
            