
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
object editformForHOTRejectectedTimesheetList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Timesheet],Timesheet,Store,Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(timesheetForm: Form[Timesheet],timesheet:Timesheet,store:Store,emp:Employee):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";

import java.lang.String; var display = "";

def /*25.2*/checkSelectedLeave/*25.20*/(leaveType:String) = {{
                   val result="selected"
                   if((timesheet.leaveType != null) && (timesheet.leaveType.equals(leaveType))){
                      result
                   }
                   
}};def /*33.2*/checkBoxForLeave/*33.18*/() = {{
                   val result="checked"
                   if( (timesheet.leaveType != null) && (timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )){
                      result
                   }
                   
}};def /*41.3*/checkSelected/*41.16*/(jobTitle:String,id:String) = {{
                   val result="selected"
                   if(jobTitle==id){
                      result
                   }
                   
}};def /*49.2*/checkSelectedDuration/*49.23*/(jobTitle:String,id:Int) = {{  <!-- in DB values are stored as String, that's y convert into int for integer comparison -->

		val result="selected"
			if(jobTitle != null){   <!-- check for Null ,for the Timesheets which are Created when shift add -->
				if(jobTitle.toInt==id){
					result
				}
			}
			
}};def /*61.2*/currentDateFormat/*61.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")
 
  if(currDate != null){
  
  	curTimeFormat.format(currDate)
  }
  
}};
Seq[Any](format.raw/*1.79*/("""

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
	    <link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
 
</script>
<script>
 $(function() """),format.raw/*9.15*/("""{"""),format.raw/*9.16*/("""
  
	$( ".startDatePicker" ).datepicker("""),format.raw/*11.37*/("""{"""),format.raw/*11.38*/("""  
    maxDate: new Date(),
    
    onSelect: function()"""),format.raw/*14.25*/("""{"""),format.raw/*14.26*/("""
    var selected = $(this).val();
    $(".endDatePicker").val(selected)
    """),format.raw/*17.5*/("""}"""),format.raw/*17.6*/("""
    ,dateFormat: "dd/mm/yy""""),format.raw/*18.28*/("""}"""),format.raw/*18.29*/(""");
	
		"""),format.raw/*20.3*/("""}"""),format.raw/*20.4*/(""");
</script>
"""),format.raw/*23.1*/(""" """),format.raw/*24.1*/("""
"""),format.raw/*31.2*/("""

"""),format.raw/*39.2*/("""

 """),format.raw/*47.2*/("""

"""),format.raw/*58.2*/("""
            

"""),format.raw/*73.2*/("""


"""),format.raw/*77.1*/("""
"""),_display_(Seq[Any](/*78.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*78.88*/{_display_(Seq[Any](format.raw/*78.89*/("""

	"""),_display_(Seq[Any](/*80.3*/{fieldView="disabled"})),format.raw/*80.25*/("""

""")))})),format.raw/*82.2*/("""

"""),format.raw/*85.1*/("""
"""),_display_(Seq[Any](/*86.2*/if((timesheet.status).equals("APPROVED") )/*86.44*/{_display_(Seq[Any](format.raw/*86.45*/("""
					
					"""),_display_(Seq[Any](/*88.7*/{display="disabled"})),format.raw/*88.27*/("""
""")))})),format.raw/*89.2*/("""


"""),_display_(Seq[Any](/*92.2*/main/*92.6*/{_display_(Seq[Any](format.raw/*92.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*101.24*/routes/*101.30*/.Application.index())),format.raw/*101.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*102.27*/routes/*102.33*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*102.80*/("""" class="btn btn-default">TIMESHEET</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*103.54*/flash/*103.59*/.get("pageAction"))),format.raw/*103.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*108.27*/routes/*108.33*/.Application.showOptions("ADD TIMESHEET",flash.get("pageAction")))),format.raw/*108.98*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*116.3*/if(flash.containsKey("success"))/*116.35*/ {_display_(Seq[Any](format.raw/*116.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*118.37*/flash/*118.42*/.get("success"))),format.raw/*118.57*/("""
        </div>
    """)))})),format.raw/*120.6*/(""" 

   
 
	<form action =""""),_display_(Seq[Any](/*124.18*/routes/*124.24*/.Timesheets.updateEditListForRejectedTS(timesheet.id,store.id))),format.raw/*124.86*/("""" method="POST" id="hOTEditTimesheetForm"  onsubmit="return checkHOTTimesheetExistsInEditPage('"""),_display_(Seq[Any](/*124.182*/timesheet/*124.191*/.id)),format.raw/*124.194*/("""');"> 


			<h2>Time Sheet Details</h2>
			<hr/>
		
        <input type="text" value=""""),_display_(Seq[Any](/*130.36*/timesheet/*130.45*/.empid)),format.raw/*130.51*/("""" id="empid" name="empid" readonly='readonly' style="display:none;"/><h1>"""),_display_(Seq[Any](/*130.125*/emp/*130.128*/.firstName)),format.raw/*130.138*/("""."""),_display_(Seq[Any](/*130.140*/emp/*130.143*/.lastName)),format.raw/*130.152*/("""</h1>
        	
          			<div class="table-responsive"> 
        				<table class="table table-bordered" style="background-color: white;border-color: #fff;font-size:12px;">
							<tr>
									"""),_display_(Seq[Any](/*135.11*/if(Shift.timesheetWithShift(timesheet.id) != null)/*135.61*/{_display_(Seq[Any](format.raw/*135.62*/("""
									
										"""),format.raw/*137.68*/("""
										<input type="hidden" id="empid" name="empid" value=""""),_display_(Seq[Any](/*138.64*/timesheet/*138.73*/.empid)),format.raw/*138.79*/(""""/>
									
									""")))}/*140.11*/else/*140.15*/{_display_(Seq[Any](format.raw/*140.16*/("""
									
									"""),format.raw/*148.14*/("""
									
									""")))})),format.raw/*150.11*/("""
									
								<td> 
								
									<div class="clearfix" id="date_field">
    									<label for="date">Date</label>
											<input type="text" id="hoEditStartDate" name="hoEditStartDate" class="startDatePicker" value=""""),_display_(Seq[Any](/*156.107*/currentDateFormat(timesheet.date))),format.raw/*156.140*/("""" required/>
		    								<input type="hidden" id="hoEditEndDate" name="hoEditEndDate" class="endDatePicker" value=""""),_display_(Seq[Any](/*157.106*/currentDateFormat(timesheet.endDate))),format.raw/*157.142*/("""" required/>
		    								<label id="hoEditDateErrorLabel" style="display:none; color:red">Please Select Date.</label>
									</div> 
								</td>
								"""),_display_(Seq[Any](/*161.10*/if(timesheet.leaveType != "None")/*161.43*/{_display_(Seq[Any](format.raw/*161.44*/("""
								<td>
									 <input type="checkbox" name="applyLeaveCheckBoxInHOEdit" id="applyLeaveCheckBoxInHOEdit" """),_display_(Seq[Any](/*163.101*/checkBoxForLeave())),format.raw/*163.119*/(""" /> Leave
									 
									<div class="clearfix" id="leaveType_fieldInHoEdit">
    									<label for="leaveType">Leave Type</label>
    										<div class="input">
    											<select id="leaveTypeInHOEdit" name="leaveTypeInHOEdit" required value=""""),_display_(Seq[Any](/*168.89*/timesheet/*168.98*/.leaveType)),format.raw/*168.108*/("""">
    												 <option class="blank" value="">-- Choose Type --</option>
										             <option value="AL" """),_display_(Seq[Any](/*170.44*/checkSelectedLeave("AL"))),format.raw/*170.68*/(""" >AL</option>
							                         <option value="SL" """),_display_(Seq[Any](/*171.53*/checkSelectedLeave("SL"))),format.raw/*171.77*/(""" >SL</option>
							                         <option value="PH" """),_display_(Seq[Any](/*172.53*/checkSelectedLeave("PH"))),format.raw/*172.77*/(""" >PH</option>
							                    </select> 
    										</div>
									</div>
									<input type="hidden" id="hOTEditTextarea" name="hOTEditTextarea"  value="no_activity">
									<input type="hidden" id="hoEditStartTimeHour" name="hoEditStartTimeHour" value=""""),_display_(Seq[Any](/*177.91*/timesheet/*177.100*/.startTimeHour)),format.raw/*177.114*/("""">
									<input type="hidden" id="hoEditStartTimeMins" name="hoEditStartTimeMins" value=""""),_display_(Seq[Any](/*178.91*/timesheet/*178.100*/.startTimeMins)),format.raw/*178.114*/("""">
									<input type="hidden" id="hoEditEndTimeHour"   name="hoEditEndTimeHour" value=""""),_display_(Seq[Any](/*179.89*/timesheet/*179.98*/.endTimeHour)),format.raw/*179.110*/("""">
									<input type="hidden" id="hoEditEndTimeMins" name="hoEditEndTimeMins" value=""""),_display_(Seq[Any](/*180.87*/timesheet/*180.96*/.endTimeMins)),format.raw/*180.108*/("""">
									<input type="hidden" id="durationInHoEdit" name="durationInHoEdit" value=""""),_display_(Seq[Any](/*181.85*/timesheet/*181.94*/.duration)),format.raw/*181.103*/("""">
									<input type="hidden" id="hoEditDateErrorLabel">
									<input type="hidden" id="startTimeHourEditErrorLabel">
							        <input type="hidden" id="startTimeMinsEditErrorLabel">
							        <input type="hidden" id="endTimeHourEditErrorLabel">
							        <input type="hidden" id="endTimeMinsEditErrorLabel">
									<input type="hidden" id="hoActivityEditErrorLabel" >
									
								</td>
								""")))}/*190.11*/else/*190.15*/{_display_(Seq[Any](format.raw/*190.16*/("""
								<input type="hidden" id="leaveTypeInHOEdit" name="leaveTypeInHOEdit" value=""""),_display_(Seq[Any](/*191.86*/timesheet/*191.95*/.leaveType)),format.raw/*191.105*/("""">
								
								<td colspan="2" id="hOTEditTextareaLabel">
									Activity:
									<textarea id="hOTEditTextarea" name="hOTEditTextarea" style="height:80%;width:100%">"""),_display_(Seq[Any](/*195.95*/timesheet/*195.104*/.activity)),format.raw/*195.113*/("""</textarea>								
									<label id="hoActivityEditErrorLabel" style="display:none; color:red">Please Enter Activity</label>
								</td>						
										
								<tr>
								
								<td>
									<div class="clearfix  " id="HOTimesheetEditStartTime_field">
    									<label for="HOTimesheetEditStartTime">Start Time</label>
    										<div class="input">
    											<select id="hoEditStartTimeHour" name="hoEditStartTimeHour"  required onblur="durationEditHeadOfficeTimeSheetFromStartEnd()">
    												 <option value="">--Hours--</option>
										             """),_display_(Seq[Any](/*207.25*/for(i <- 0 to 9) yield /*207.41*/ {_display_(Seq[Any](format.raw/*207.43*/("""
    													<option value="0"""),_display_(Seq[Any](/*208.35*/i)),format.raw/*208.36*/("""" """),_display_(Seq[Any](/*208.39*/checkSelectedDuration(timesheet.startTimeHour,i))),format.raw/*208.87*/(""">0"""),_display_(Seq[Any](/*208.90*/i)),format.raw/*208.91*/("""</option>
													 """)))})),format.raw/*209.16*/("""
													  """),_display_(Seq[Any](/*210.17*/for(i <- 10 to 23) yield /*210.35*/ {_display_(Seq[Any](format.raw/*210.37*/("""
    													<option value=""""),_display_(Seq[Any](/*211.34*/i)),format.raw/*211.35*/("""" """),_display_(Seq[Any](/*211.38*/checkSelectedDuration(timesheet.startTimeHour,i))),format.raw/*211.86*/(""">"""),_display_(Seq[Any](/*211.88*/i)),format.raw/*211.89*/("""</option>
													 """)))})),format.raw/*212.16*/("""
							                    </select>
							                    
							                    <select id="hoEditStartTimeMins" name="hoEditStartTimeMins" required onblur="durationEditHeadOfficeTimeSheetFromStartEnd()">
    												 <option value="">--Mins--</option>
										            <option value="00" """),_display_(Seq[Any](/*217.43*/checkSelected(timesheet.startTimeMins,"00"))),format.raw/*217.86*/(""">00</option>
							                         <option value="15" """),_display_(Seq[Any](/*218.53*/checkSelected(timesheet.startTimeMins,"15"))),format.raw/*218.96*/(""">15</option>
							                         <option value="30" """),_display_(Seq[Any](/*219.53*/checkSelected(timesheet.startTimeMins,"30"))),format.raw/*219.96*/(""">30</option>
							                         <option value="45" """),_display_(Seq[Any](/*220.53*/checkSelected(timesheet.startTimeMins,"45"))),format.raw/*220.96*/(""">45</option>
							                    </select> 
							                    <label id="startTimeHourEditErrorLabel" style="display:none; color:red">Please Select Start Hours.</label>
							                    <label id="startTimeMinsEditErrorLabel" style="display:none; color:red">Please Select Start Mins.</label>
    										</div>
									</div>
								</td>
								
								<td>
									<div class="clearfix  " id="HOTimesheetEditEndTime_field">
    									<label for="HOTEdittimesheetEndTime">End Time</label>
    										<div class="input">
    											<select id="hoEditEndTimeHour" name="hoEditEndTimeHour" required onblur="durationEditHeadOfficeTimeSheetFromStartEnd()">
    												 <option value="">--Hours--</option>
    												 """),_display_(Seq[Any](/*234.19*/for(i <- 0 to 9) yield /*234.35*/ {_display_(Seq[Any](format.raw/*234.37*/("""
    													<option value="0"""),_display_(Seq[Any](/*235.35*/i)),format.raw/*235.36*/("""" """),_display_(Seq[Any](/*235.39*/checkSelectedDuration(timesheet.endTimeHour,i))),format.raw/*235.85*/(""">0"""),_display_(Seq[Any](/*235.88*/i)),format.raw/*235.89*/("""</option>
													 """)))})),format.raw/*236.16*/("""
													  """),_display_(Seq[Any](/*237.17*/for(i <- 10 to 23) yield /*237.35*/ {_display_(Seq[Any](format.raw/*237.37*/("""
    													<option value=""""),_display_(Seq[Any](/*238.34*/i)),format.raw/*238.35*/("""" """),_display_(Seq[Any](/*238.38*/checkSelectedDuration(timesheet.endTimeHour,i))),format.raw/*238.84*/(""">"""),_display_(Seq[Any](/*238.86*/i)),format.raw/*238.87*/("""</option>
													 """)))})),format.raw/*239.16*/("""
    												
							                    </select>
							                    
							                    <select id="hoEditEndTimeMins" name="hoEditEndTimeMins"  required onblur="durationEditHeadOfficeTimeSheetFromStartEnd()">
    												 <option value="">--Mins--</option>
										             <option value="00" """),_display_(Seq[Any](/*245.44*/checkSelected(timesheet.endTimeMins,"00"))),format.raw/*245.85*/(""">00</option>
							                         <option value="15" """),_display_(Seq[Any](/*246.53*/checkSelected(timesheet.endTimeMins,"15"))),format.raw/*246.94*/(""">15</option>
							                         <option value="30" """),_display_(Seq[Any](/*247.53*/checkSelected(timesheet.endTimeMins,"30"))),format.raw/*247.94*/(""">30</option>
							                         <option value="45" """),_display_(Seq[Any](/*248.53*/checkSelected(timesheet.endTimeMins,"45"))),format.raw/*248.94*/(""">45</option>
							                    </select> 
							                     <label id="endTimeHourEditErrorLabel" style="display:none; color:red">Please Select End Hours.</label>
							                     <label id="endTimeMinsEditErrorLabel" style="display:none; color:red">Please Select End Mins.</label>
    										</div>
									</div>
								</td>
								<td>
								<div>
								<label id="HOTimesheetEditDuration_field">Duration :</label>
								<input type="text" id="durationInHoEdit" name="durationInHoEdit" value=""""),_display_(Seq[Any](/*258.82*/timesheet/*258.91*/.duration)),format.raw/*258.100*/("""" name="durationInHoEdit" style="margin-top: 15px;">
								</div>
								</td>	
								""")))})),format.raw/*261.10*/("""
									<input type="hidden" name="firmid" value=""""),_display_(Seq[Any](/*262.53*/store/*262.58*/.id)),format.raw/*262.61*/(""""/>
							</tr>
						</table>
					</div>
            
      	
      	      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*273.6*/if((flash.get("pageAction")).equals("MODIFY") || (flash.get("pageAction")).equals("VIEW"))/*273.96*/{_display_(Seq[Any](format.raw/*273.97*/("""
					<input type="submit" class="btn btn-large btn-success" """),_display_(Seq[Any](/*274.62*/display)),format.raw/*274.69*/(""" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*276.6*/("""
				"""),_display_(Seq[Any](/*277.6*/if((flash.get("pageAction")).equals("DELETE"))/*277.52*/{_display_(Seq[Any](format.raw/*277.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*279.17*/routes/*279.23*/.Timesheets.delete(timesheet.id))),format.raw/*279.55*/("""" class="btn btn-danger">Delete</a>
	 				
	 			""")))})),format.raw/*281.7*/("""
 				</p>
		    </div>
        </div>

</form>
	
	</div>
	</div>

""")))})),format.raw/*291.2*/("""<!-- main end -->
"""))}
    }
    
    def render(timesheetForm:Form[Timesheet],timesheet:Timesheet,store:Store,emp:Employee): play.api.templates.HtmlFormat.Appendable = apply(timesheetForm,timesheet,store,emp)
    
    def f:((Form[Timesheet],Timesheet,Store,Employee) => play.api.templates.HtmlFormat.Appendable) = (timesheetForm,timesheet,store,emp) => apply(timesheetForm,timesheet,store,emp)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/editformForHOTRejectectedTimesheetList.scala.html
                    HASH: 8f2436dfaf4be99b2b6ca19e135e98ff3082a05b
                    MATRIX: 852->1|1147->697|1174->715|1421->950|1446->966|1745->1254|1767->1267|1963->1451|1993->1472|2316->1797|2342->1814|2588->78|2952->415|2980->416|3048->456|3077->457|3162->514|3191->515|3295->592|3323->593|3379->621|3408->622|3442->629|3470->630|3510->660|3538->695|3566->947|3595->1250|3625->1448|3654->1781|3696->2030|3726->2079|3763->2081|3858->2167|3897->2168|3936->2172|3980->2194|4014->2197|4043->2243|4080->2245|4131->2287|4170->2288|4218->2301|4260->2321|4293->2323|4332->2327|4344->2331|4382->2332|4651->2564|4667->2570|4710->2590|4829->2672|4845->2678|4915->2725|5045->2818|5060->2823|5101->2841|5296->2999|5312->3005|5400->3070|5601->3235|5643->3267|5684->3269|5800->3348|5815->3353|5853->3368|5906->3389|5969->3415|5985->3421|6070->3483|6204->3579|6224->3588|6251->3591|6375->3678|6394->3687|6423->3693|6535->3767|6549->3770|6583->3780|6623->3782|6637->3785|6670->3794|6906->3993|6966->4043|7006->4044|7056->4122|7157->4186|7176->4195|7205->4201|7249->4225|7263->4229|7303->4230|7352->4549|7406->4570|7676->4802|7733->4835|7889->4953|7949->4989|8146->5149|8189->5182|8229->5183|8381->5297|8423->5315|8719->5574|8738->5583|8772->5593|8930->5714|8977->5738|9080->5804|9127->5828|9230->5894|9277->5918|9589->6193|9609->6202|9647->6216|9777->6309|9797->6318|9835->6332|9963->6423|9982->6432|10018->6444|10144->6533|10163->6542|10199->6554|10323->6641|10342->6650|10375->6659|10820->7085|10834->7089|10874->7090|10997->7176|11016->7185|11050->7195|11263->7371|11283->7380|11316->7389|11939->7975|11972->7991|12013->7993|12085->8028|12109->8029|12149->8032|12220->8080|12260->8083|12284->8084|12342->8109|12396->8126|12431->8144|12472->8146|12543->8180|12567->8181|12607->8184|12678->8232|12717->8234|12741->8235|12799->8260|13148->8572|13214->8615|13316->8680|13382->8723|13484->8788|13550->8831|13652->8896|13718->8939|14522->9706|14555->9722|14596->9724|14668->9759|14692->9760|14732->9763|14801->9809|14841->9812|14865->9813|14923->9838|14977->9855|15012->9873|15053->9875|15124->9909|15148->9910|15188->9913|15257->9959|15296->9961|15320->9962|15378->9987|15742->10314|15806->10355|15908->10420|15972->10461|16074->10526|16138->10567|16240->10632|16304->10673|16881->11213|16900->11222|16933->11231|17058->11323|17148->11376|17163->11381|17189->11384|17504->11663|17604->11753|17644->11754|17743->11816|17773->11823|17896->11914|17938->11920|17994->11966|18034->11967|18094->11990|18110->11996|18165->12028|18246->12077|18346->12145
                    LINES: 26->1|35->25|35->25|41->33|41->33|47->41|47->41|53->49|53->49|62->61|62->61|75->1|83->9|83->9|85->11|85->11|88->14|88->14|91->17|91->17|92->18|92->18|94->20|94->20|96->23|96->24|97->31|99->39|101->47|103->58|106->73|109->77|110->78|110->78|110->78|112->80|112->80|114->82|116->85|117->86|117->86|117->86|119->88|119->88|120->89|123->92|123->92|123->92|132->101|132->101|132->101|133->102|133->102|133->102|134->103|134->103|134->103|139->108|139->108|139->108|147->116|147->116|147->116|149->118|149->118|149->118|151->120|155->124|155->124|155->124|155->124|155->124|155->124|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|161->130|166->135|166->135|166->135|168->137|169->138|169->138|169->138|171->140|171->140|171->140|173->148|175->150|181->156|181->156|182->157|182->157|186->161|186->161|186->161|188->163|188->163|193->168|193->168|193->168|195->170|195->170|196->171|196->171|197->172|197->172|202->177|202->177|202->177|203->178|203->178|203->178|204->179|204->179|204->179|205->180|205->180|205->180|206->181|206->181|206->181|215->190|215->190|215->190|216->191|216->191|216->191|220->195|220->195|220->195|232->207|232->207|232->207|233->208|233->208|233->208|233->208|233->208|233->208|234->209|235->210|235->210|235->210|236->211|236->211|236->211|236->211|236->211|236->211|237->212|242->217|242->217|243->218|243->218|244->219|244->219|245->220|245->220|259->234|259->234|259->234|260->235|260->235|260->235|260->235|260->235|260->235|261->236|262->237|262->237|262->237|263->238|263->238|263->238|263->238|263->238|263->238|264->239|270->245|270->245|271->246|271->246|272->247|272->247|273->248|273->248|283->258|283->258|283->258|286->261|287->262|287->262|287->262|298->273|298->273|298->273|299->274|299->274|301->276|302->277|302->277|302->277|304->279|304->279|304->279|306->281|316->291
                    -- GENERATED --
                */
            