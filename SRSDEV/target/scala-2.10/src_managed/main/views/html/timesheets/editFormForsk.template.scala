
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
object editFormForsk extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Timesheet],Timesheet,Store,Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(timesheetForm: Form[Timesheet],timesheet:Timesheet,store:Store,emp:Employee):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

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
                   
}};def /*22.2*/checkSelected/*22.15*/(jobTitle:String,id:String) = {{
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
			
}};def /*41.2*/currentDateFormat/*41.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

   if(currDate != null){
  
  	curTimeFormat.format(currDate)
  }
}};
Seq[Any](format.raw/*1.79*/("""

"""),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*20.2*/("""

"""),format.raw/*28.2*/("""

"""),format.raw/*39.2*/("""

"""),format.raw/*52.2*/("""
"""),format.raw/*54.1*/("""
"""),_display_(Seq[Any](/*55.2*/if((timesheet.status).equals("SUBMITTED") || (timesheet.status).equals("APPROVED") )/*55.86*/{_display_(Seq[Any](format.raw/*55.87*/("""
					
					"""),_display_(Seq[Any](/*57.7*/{display="disabled"})),format.raw/*57.27*/("""
""")))})),format.raw/*58.2*/("""


"""),_display_(Seq[Any](/*61.2*/main/*61.6*/{_display_(Seq[Any](format.raw/*61.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*70.24*/routes/*70.30*/.Application.index())),format.raw/*70.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*71.27*/routes/*71.33*/.Application.showOptions("EMP TIMESHEET","ALL"))),format.raw/*71.80*/("""" class="btn btn-default">EMP TIMESHEET</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*72.54*/flash/*72.59*/.get("pageAction"))),format.raw/*72.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*77.27*/routes/*77.33*/.Application.showOptions("EMP TIMESHEET",flash.get("pageAction")))),format.raw/*77.98*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*85.3*/if(flash.containsKey("success"))/*85.35*/ {_display_(Seq[Any](format.raw/*85.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*87.37*/flash/*87.42*/.get("success"))),format.raw/*87.57*/("""
        </div>
    """)))})),format.raw/*89.6*/(""" 

 
	<form action =""""),_display_(Seq[Any](/*92.18*/routes/*92.24*/.Timesheets.updateForsk(timesheet.id,store.id))),format.raw/*92.70*/("""" method="POST" id="timesheetForm" onsubmit="return checkTimesheetExistsEditPage("""),_display_(Seq[Any](/*92.152*/timesheet/*92.161*/.id)),format.raw/*92.164*/(""");"> 


			<h2>Time Sheet Details</h2>
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
									        
									    		<input type="text" value=""""),_display_(Seq[Any](/*110.43*/emp/*110.46*/.firstName)),format.raw/*110.56*/("""."""),_display_(Seq[Any](/*110.58*/emp/*110.61*/.lastName)),format.raw/*110.70*/(""""  readonly='readonly'/> 
									
									        <span class="help-inline"></span>
									    </div>
									</div>
									<input type="hidden" name="empid" id="empid" value=""""),_display_(Seq[Any](/*115.63*/timesheet/*115.72*/.empid)),format.raw/*115.78*/("""" />
								 </td>
								
								<td> 
								
									<div class="clearfix" id="date_field">
    									<label for="date">Start Date</label>
    									<div class="input">
											<input type="text" name="date" class="startDatePicker" value=""""),_display_(Seq[Any](/*123.75*/currentDateFormat(timesheet.date))),format.raw/*123.108*/("""" required />
										</div>
									</div> 
								</td>
								
								<td> 
								
									<div class="clearfix" id="date_field">
    									<label for="date">End Date</label>
    									<div class="input">
											<input type="text" name="endDate" class="endDatePicker" value=""""),_display_(Seq[Any](/*133.76*/currentDateFormat(timesheet.endDate))),format.raw/*133.112*/("""" required />
										</div>
									</div> 
								</td>
								
								<td>
									 <input type="checkbox" name="applyLeave" id="applyLeaveCheckBox" """),_display_(Seq[Any](/*139.77*/checkBoxForLeave())),format.raw/*139.95*/(""" /> Leave
									 
									<div class="clearfix" id="leaveType_field" style="display:none;">
    									<label for="leaveType">Leave Type</label>
    										<div class="input">
    											<select id="leaveType" name="leaveType">
    												 <option class="blank" value="None">-- Choose Type --</option>
										             <option value="AL" """),_display_(Seq[Any](/*146.44*/checkSelectedLeave("AL"))),format.raw/*146.68*/(""">AL</option>
							                         <option value="SL" """),_display_(Seq[Any](/*147.53*/checkSelectedLeave("SL"))),format.raw/*147.77*/(""">SL</option>
							                         <option value="PH" """),_display_(Seq[Any](/*148.53*/checkSelectedLeave("PH"))),format.raw/*148.77*/(""">PH</option>
							                    </select> 
    										</div>
									</div>
								
								</td>
								
									<input type="hidden" name="firmid" value=""""),_display_(Seq[Any](/*155.53*/store/*155.58*/.id)),format.raw/*155.61*/(""""/>
							</tr>	
							<tr>
								
								<td>
									<div class="clearfix  " id="timesheetStartTime_field">
    									<label for="timesheetStartTime">Start Time</label>
    										<div class="input">
    											<select id="startTimeHour" name="startTimeHour" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Hour --</option>
    												 """),_display_(Seq[Any](/*165.19*/for(i <- 0 to 9) yield /*165.35*/ {_display_(Seq[Any](format.raw/*165.37*/("""
    													<option value="0"""),_display_(Seq[Any](/*166.35*/i)),format.raw/*166.36*/("""" """),_display_(Seq[Any](/*166.39*/checkSelectedDuration(timesheet.startTimeHour,i))),format.raw/*166.87*/(""">0"""),_display_(Seq[Any](/*166.90*/i)),format.raw/*166.91*/("""</option>
													 """)))})),format.raw/*167.16*/("""
													  """),_display_(Seq[Any](/*168.17*/for(i <- 10 to 23) yield /*168.35*/ {_display_(Seq[Any](format.raw/*168.37*/("""
    													<option value=""""),_display_(Seq[Any](/*169.34*/i)),format.raw/*169.35*/("""" """),_display_(Seq[Any](/*169.38*/checkSelectedDuration(timesheet.startTimeHour,i))),format.raw/*169.86*/(""">"""),_display_(Seq[Any](/*169.88*/i)),format.raw/*169.89*/("""</option>
													 """)))})),format.raw/*170.16*/("""
										             
							                    </select>
							                    <select id="startTimeMins" name="startTimeMins" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" """),_display_(Seq[Any](/*175.44*/checkSelected(timesheet.startTimeMins,"00"))),format.raw/*175.87*/(""">00</option>
							                         <option value="15" """),_display_(Seq[Any](/*176.53*/checkSelected(timesheet.startTimeMins,"15"))),format.raw/*176.96*/(""">15</option>
							                         <option value="30" """),_display_(Seq[Any](/*177.53*/checkSelected(timesheet.startTimeMins,"30"))),format.raw/*177.96*/(""">30</option>
							                         <option value="45" """),_display_(Seq[Any](/*178.53*/checkSelected(timesheet.startTimeMins,"45"))),format.raw/*178.96*/(""">45</option>
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
    												  """),_display_(Seq[Any](/*192.20*/for(i <- 0 to 9) yield /*192.36*/ {_display_(Seq[Any](format.raw/*192.38*/("""
    													<option value="0"""),_display_(Seq[Any](/*193.35*/i)),format.raw/*193.36*/("""" """),_display_(Seq[Any](/*193.39*/checkSelectedDuration(timesheet.endTimeHour,i))),format.raw/*193.85*/(""">0"""),_display_(Seq[Any](/*193.88*/i)),format.raw/*193.89*/("""</option> <!-- integer comparison -->
													 """)))})),format.raw/*194.16*/("""
													  """),_display_(Seq[Any](/*195.17*/for(i <- 10 to 23) yield /*195.35*/ {_display_(Seq[Any](format.raw/*195.37*/("""
    													<option value=""""),_display_(Seq[Any](/*196.34*/i)),format.raw/*196.35*/("""" """),_display_(Seq[Any](/*196.38*/checkSelectedDuration(timesheet.endTimeHour,i))),format.raw/*196.84*/(""">"""),_display_(Seq[Any](/*196.86*/i)),format.raw/*196.87*/("""</option>
													 """)))})),format.raw/*197.16*/("""
										             
							                    </select>
							                    <select id="endTimeMins" name="endTimeMins" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" """),_display_(Seq[Any](/*202.44*/checkSelected(timesheet.endTimeMins,"00"))),format.raw/*202.85*/(""">00</option> <!-- String comparison -->
							                         <option value="15" """),_display_(Seq[Any](/*203.53*/checkSelected(timesheet.endTimeMins,"15"))),format.raw/*203.94*/(""">15</option>
							                         <option value="30" """),_display_(Seq[Any](/*204.53*/checkSelected(timesheet.endTimeMins,"30"))),format.raw/*204.94*/(""">30</option>
							                         <option value="45" """),_display_(Seq[Any](/*205.53*/checkSelected(timesheet.endTimeMins,"45"))),format.raw/*205.94*/(""">45</option>
							                    </select> 
    										</div>
									</div>
								</td>
								
								<td>
					 				"""),_display_(Seq[Any](/*212.12*/helper/*212.18*/.inputText(timesheetForm("duration"), '_label -> "Duration", 'readonly -> "readonly"))),format.raw/*212.103*/("""
								</td>
								
								<td>
									"""),_display_(Seq[Any](/*216.11*/if(timesheet.status.equals("APPROVED"))/*216.50*/{_display_(Seq[Any](format.raw/*216.51*/("""
									
									Status
										<select id="statusForsk" name="status" disabled="disabled">
													<option class="blank" value="">-- Select Status --</option>
								  					<option value="OPEN" """),_display_(Seq[Any](/*221.38*/checkSelected(timesheet.status,"OPEN"))),format.raw/*221.76*/(""">OPEN</option>
							                        <option value="SUBMITTED" """),_display_(Seq[Any](/*222.59*/checkSelected(timesheet.status,"SUBMITTED"))),format.raw/*222.102*/(""">SUBMITTED</option>
							                        <option value="APPROVED"  """),_display_(Seq[Any](/*223.59*/checkSelected(timesheet.status,"APPROVED"))),format.raw/*223.101*/(""">APPROVED</option>
							                        <option value="REJECTED"  """),_display_(Seq[Any](/*224.59*/checkSelected(timesheet.status,"REJECTED"))),format.raw/*224.101*/(""">REJECTED</option>
					                            </select> 
									
									
									""")))}/*228.11*/else/*228.15*/{_display_(Seq[Any](format.raw/*228.16*/("""
										Status
										<select id="statusForsk" name="status">
													<option class="blank" value="">-- Select Status --</option>
								  					<option value="OPEN" """),_display_(Seq[Any](/*232.38*/checkSelected(timesheet.status,"OPEN"))),format.raw/*232.76*/(""">OPEN</option>
							                        <option value="SUBMITTED" """),_display_(Seq[Any](/*233.59*/checkSelected(timesheet.status,"SUBMITTED"))),format.raw/*233.102*/(""">SUBMITTED</option>
							                        <option value="APPROVED"  """),_display_(Seq[Any](/*234.59*/checkSelected(timesheet.status,"APPROVED"))),format.raw/*234.101*/(""">APPROVED</option>
							                        <option value="REJECTED"  """),_display_(Seq[Any](/*235.59*/checkSelected(timesheet.status,"REJECTED"))),format.raw/*235.101*/(""">REJECTED</option>
					                            </select> 
									
									""")))})),format.raw/*238.11*/("""
								</td>
							</tr>
						</table>
					</div>
            
      	
      	      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*250.6*/if((flash.get("pageAction")).equals("MODIFY"))/*250.52*/{_display_(Seq[Any](format.raw/*250.53*/("""
					<input type="submit" class="btn btn-large btn-success" """),_display_(Seq[Any](/*251.62*/display)),format.raw/*251.69*/(""" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*253.6*/("""
 				</p>
		    </div>
        </div>
       
    
  


	</form>
	
	</div>
	</div>

""")))})),format.raw/*267.2*/("""<!-- main end -->
"""))}
    }
    
    def render(timesheetForm:Form[Timesheet],timesheet:Timesheet,store:Store,emp:Employee): play.api.templates.HtmlFormat.Appendable = apply(timesheetForm,timesheet,store,emp)
    
    def f:((Form[Timesheet],Timesheet,Store,Employee) => play.api.templates.HtmlFormat.Appendable) = (timesheetForm,timesheet,store,emp) => apply(timesheetForm,timesheet,store,emp)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/editFormForsk.scala.html
                    HASH: e97d6aa09c349ba10183b2f2f7db666f77617c6c
                    MATRIX: 827->1|1075->134|1101->152|1348->387|1373->403|1672->690|1694->703|1890->887|1920->908|2243->1220|2269->1237|2512->78|2540->97|2567->132|2595->384|2624->687|2653->884|2682->1217|2711->1450|2739->1495|2776->1497|2869->1581|2908->1582|2956->1595|2998->1615|3031->1617|3070->1621|3082->1625|3120->1626|3388->1858|3403->1864|3445->1884|3563->1966|3578->1972|3647->2019|3780->2116|3794->2121|3834->2139|4028->2297|4043->2303|4130->2368|4330->2533|4371->2565|4411->2567|4526->2646|4540->2651|4577->2666|4629->2687|4687->2709|4702->2715|4770->2761|4889->2843|4908->2852|4934->2855|5428->3312|5441->3315|5474->3325|5513->3327|5526->3330|5558->3339|5780->3524|5799->3533|5828->3539|6122->3796|6179->3829|6514->4127|6574->4163|6771->4323|6812->4341|7212->4704|7259->4728|7361->4793|7408->4817|7510->4882|7557->4906|7766->5078|7781->5083|7807->5086|8249->5491|8282->5507|8323->5509|8395->5544|8419->5545|8459->5548|8530->5596|8570->5599|8594->5600|8652->5625|8706->5642|8741->5660|8782->5662|8853->5696|8877->5697|8917->5700|8988->5748|9027->5750|9051->5751|9109->5776|9437->6067|9503->6110|9605->6175|9671->6218|9773->6283|9839->6326|9941->6391|10007->6434|10530->6920|10563->6936|10604->6938|10676->6973|10700->6974|10740->6977|10809->7023|10849->7026|10873->7027|10959->7080|11013->7097|11048->7115|11089->7117|11160->7151|11184->7152|11224->7155|11293->7201|11332->7203|11356->7204|11414->7229|11738->7516|11802->7557|11931->7649|11995->7690|12097->7755|12161->7796|12263->7861|12327->7902|12499->8037|12515->8043|12624->8128|12708->8175|12757->8214|12797->8215|13041->8422|13102->8460|13212->8533|13279->8576|13394->8654|13460->8696|13574->8773|13640->8815|13753->8908|13767->8912|13807->8913|14022->9091|14083->9129|14193->9202|14260->9245|14375->9323|14441->9365|14555->9442|14621->9484|14737->9567|15063->9857|15119->9903|15159->9904|15258->9966|15288->9973|15411->10064|15529->10150
                    LINES: 26->1|33->6|33->6|39->14|39->14|45->22|45->22|51->30|51->30|60->41|60->41|72->1|74->4|74->5|75->12|77->20|79->28|81->39|83->52|84->54|85->55|85->55|85->55|87->57|87->57|88->58|91->61|91->61|91->61|100->70|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|107->77|107->77|107->77|115->85|115->85|115->85|117->87|117->87|117->87|119->89|122->92|122->92|122->92|122->92|122->92|122->92|140->110|140->110|140->110|140->110|140->110|140->110|145->115|145->115|145->115|153->123|153->123|163->133|163->133|169->139|169->139|176->146|176->146|177->147|177->147|178->148|178->148|185->155|185->155|185->155|195->165|195->165|195->165|196->166|196->166|196->166|196->166|196->166|196->166|197->167|198->168|198->168|198->168|199->169|199->169|199->169|199->169|199->169|199->169|200->170|205->175|205->175|206->176|206->176|207->177|207->177|208->178|208->178|222->192|222->192|222->192|223->193|223->193|223->193|223->193|223->193|223->193|224->194|225->195|225->195|225->195|226->196|226->196|226->196|226->196|226->196|226->196|227->197|232->202|232->202|233->203|233->203|234->204|234->204|235->205|235->205|242->212|242->212|242->212|246->216|246->216|246->216|251->221|251->221|252->222|252->222|253->223|253->223|254->224|254->224|258->228|258->228|258->228|262->232|262->232|263->233|263->233|264->234|264->234|265->235|265->235|268->238|280->250|280->250|280->250|281->251|281->251|283->253|297->267
                    -- GENERATED --
                */
            