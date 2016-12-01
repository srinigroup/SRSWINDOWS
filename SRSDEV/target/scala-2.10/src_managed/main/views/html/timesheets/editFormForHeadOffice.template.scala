
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
object editFormForHeadOffice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Timesheet],Timesheet,Store,Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(timesheetForm: Form[Timesheet],timesheet:Timesheet,store:Store,emp:Employee):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.79*/("""

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
            				<a href=""""),_display_(Seq[Any](/*83.27*/routes/*83.33*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*83.80*/("""" class="btn btn-default">TIMESHEET</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*84.54*/flash/*84.59*/.get("pageAction"))),format.raw/*84.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*89.27*/routes/*89.33*/.Application.showOptions("ADD TIMESHEET",flash.get("pageAction")))),format.raw/*89.98*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
		
		
        <input type="text" value=""""),_display_(Seq[Any](/*114.36*/timesheet/*114.45*/.empid)),format.raw/*114.51*/("""" id="empid"  readonly='readonly' style="display:none;"/><h1>"""),_display_(Seq[Any](/*114.113*/emp/*114.116*/.firstName)),format.raw/*114.126*/("""."""),_display_(Seq[Any](/*114.128*/emp/*114.131*/.lastName)),format.raw/*114.140*/("""</h1>
        	
          			<div class="table-responsive"> 
        				<table class="table table-bordered" style="background-color: white;border-color: #fff;">
							<tr>
									"""),_display_(Seq[Any](/*119.11*/if(Shift.timesheetWithShift(timesheet.id) != null)/*119.61*/{_display_(Seq[Any](format.raw/*119.62*/("""
									
										"""),format.raw/*121.68*/("""
										<input type="hidden" id="empid" name="empid" value=""""),_display_(Seq[Any](/*122.64*/timesheet/*122.73*/.empid)),format.raw/*122.79*/(""""/>
									
									""")))}/*124.11*/else/*124.15*/{_display_(Seq[Any](format.raw/*124.16*/("""
									
									"""),format.raw/*132.14*/("""
									
									""")))})),format.raw/*134.11*/("""
									
								<td> 
								
									<div class="clearfix" id="date_field">
    									<label for="date">Date</label>
    									<div class="input">
											
											<label>"""),_display_(Seq[Any](/*142.20*/currentDateFormat(timesheet.date))),format.raw/*142.53*/("""</label>
										</div>
									</div> 
								</td>
								
									<td>
									<div class="clearfix  " id="timesheetStartTime_field">
    									<label for="timesheetStartTime">Start Time</label>
    										<div class="input">
							                   <label>"""),_display_(Seq[Any](/*151.35*/timesheet/*151.44*/.startTimeHour)),format.raw/*151.58*/("""</label>:<label>"""),_display_(Seq[Any](/*151.75*/timesheet/*151.84*/.startTimeMins)),format.raw/*151.98*/("""</label>
    										</div>
									</div>
								</td>
								
								
								
								<td>
									<div class="clearfix  " id="timesheetEndTime_field">
    									<label for="timesheetEndTime">End Time</label>
    										<div class="input">
    											<label>"""),_display_(Seq[Any](/*162.24*/timesheet/*162.33*/.endTimeHour)),format.raw/*162.45*/("""</label>:<label>"""),_display_(Seq[Any](/*162.62*/timesheet/*162.71*/.endTimeMins)),format.raw/*162.83*/("""</label>
    										</div>
									</div>
								</td>
								
								<td>
					 				<label for="timesheetDuration">Duration</label>
    									<div class="input">
    										<label>"""),_display_(Seq[Any](/*170.23*/timesheet/*170.32*/.duration)),format.raw/*170.41*/("""</label>
    									</div>
									</div>
								</td>
								</tr>
								
								<tr>
								<td>
									<label for="timesheetStatus">Leave Type</label>
    									<div class="input">
    										<label>"""),_display_(Seq[Any](/*180.23*/timesheet/*180.32*/.leaveType)),format.raw/*180.42*/("""</label>
    									</div>
									</div>
								</td>
									<input type="hidden" name="firmid" value=""""),_display_(Seq[Any](/*184.53*/store/*184.58*/.id)),format.raw/*184.61*/(""""/>
								<td colspan="2">
								Activity:
								<textarea id="hOTextarea" style="height:80%;width:100%" readonly='readonly'>"""),_display_(Seq[Any](/*187.86*/timesheet/*187.95*/.activity)),format.raw/*187.104*/("""</textarea>								
								</td>						
															
								<td>
					 				<label for="timesheetStatus">Status</label>
    									<div class="input">
    										<label>"""),_display_(Seq[Any](/*193.23*/timesheet/*193.32*/.status)),format.raw/*193.39*/("""</label>
    									</div>
									</div>
								</td>
							</tr>
						</table>
					</div>
            
      	
      	      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*207.6*/if((flash.get("pageAction")).equals("MODIFY"))/*207.52*/{_display_(Seq[Any](format.raw/*207.53*/("""
					<input type="submit" class="btn btn-large btn-success" """),_display_(Seq[Any](/*208.62*/display)),format.raw/*208.69*/(""" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*210.6*/("""
				"""),_display_(Seq[Any](/*211.6*/if((flash.get("pageAction")).equals("DELETE"))/*211.52*/{_display_(Seq[Any](format.raw/*211.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*213.17*/routes/*213.23*/.Timesheets.delete(timesheet.id))),format.raw/*213.55*/("""" class="btn btn-danger">Delete</a>
	 				
	 			""")))})),format.raw/*215.7*/("""
 				</p>
		    </div>
        </div>
       
    
  


</form>
	
	</div>
	</div>

""")))})),format.raw/*229.2*/("""<!-- main end -->
"""))}
    }
    
    def render(timesheetForm:Form[Timesheet],timesheet:Timesheet,store:Store,emp:Employee): play.api.templates.HtmlFormat.Appendable = apply(timesheetForm,timesheet,store,emp)
    
    def f:((Form[Timesheet],Timesheet,Store,Employee) => play.api.templates.HtmlFormat.Appendable) = (timesheetForm,timesheet,store,emp) => apply(timesheetForm,timesheet,store,emp)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/editFormForHeadOffice.scala.html
                    HASH: aa3a839984c558cb4771a85ad703d0aa1b928c2d
                    MATRIX: 835->1|1129->134|1155->152|1402->387|1427->403|1726->691|1748->704|1944->888|1974->909|2297->1234|2323->1251|2569->78|2597->97|2624->132|2652->384|2681->687|2711->885|2740->1218|2782->1467|2812->1516|2849->1518|2944->1604|2983->1605|3022->1609|3066->1631|3100->1634|3129->1680|3166->1682|3217->1724|3256->1725|3304->1738|3346->1758|3379->1760|3418->1764|3430->1768|3468->1769|3736->2001|3751->2007|3793->2027|3911->2109|3926->2115|3995->2162|4124->2255|4138->2260|4178->2278|4372->2436|4387->2442|4474->2507|4674->2672|4715->2704|4755->2706|4870->2785|4884->2790|4921->2805|4974->2826|5037->2852|5053->2858|5117->2899|5237->2981|5257->2990|5284->2993|5428->3100|5447->3109|5476->3115|5576->3177|5590->3180|5624->3190|5664->3192|5678->3195|5711->3204|5932->3388|5992->3438|6032->3439|6082->3517|6183->3581|6202->3590|6231->3596|6275->3620|6289->3624|6329->3625|6378->3944|6432->3965|6659->4155|6715->4188|7028->4464|7047->4473|7084->4487|7138->4504|7157->4513|7194->4527|7510->4806|7529->4815|7564->4827|7618->4844|7637->4853|7672->4865|7904->5060|7923->5069|7955->5078|8212->5298|8231->5307|8264->5317|8412->5428|8427->5433|8453->5436|8622->5568|8641->5577|8674->5586|8889->5764|8908->5773|8938->5780|9308->6114|9364->6160|9404->6161|9503->6223|9533->6230|9656->6321|9698->6327|9754->6373|9794->6374|9854->6397|9870->6403|9925->6435|10006->6484|10123->6569
                    LINES: 26->1|35->6|35->6|41->14|41->14|47->22|47->22|53->30|53->30|62->42|62->42|75->1|77->4|77->5|78->12|80->20|82->28|84->39|87->54|90->58|91->59|91->59|91->59|93->61|93->61|95->63|97->66|98->67|98->67|98->67|100->69|100->69|101->70|104->73|104->73|104->73|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|120->89|120->89|120->89|128->97|128->97|128->97|130->99|130->99|130->99|132->101|136->105|136->105|136->105|136->105|136->105|136->105|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|145->114|150->119|150->119|150->119|152->121|153->122|153->122|153->122|155->124|155->124|155->124|157->132|159->134|167->142|167->142|176->151|176->151|176->151|176->151|176->151|176->151|187->162|187->162|187->162|187->162|187->162|187->162|195->170|195->170|195->170|205->180|205->180|205->180|209->184|209->184|209->184|212->187|212->187|212->187|218->193|218->193|218->193|232->207|232->207|232->207|233->208|233->208|235->210|236->211|236->211|236->211|238->213|238->213|238->213|240->215|254->229
                    -- GENERATED --
                */
            