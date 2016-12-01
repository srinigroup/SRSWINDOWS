
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
object showForHeadOffice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Timesheet],Store,Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(headOfficeTimeSheetForm:Form[Timesheet],store:Store,emp:Employee):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.68*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/(""" 
 <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
	    <link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
 
</script>
 <script>
 $(function() """),format.raw/*11.15*/("""{"""),format.raw/*11.16*/("""
  
	$( "#hoDate" ).datepicker("""),format.raw/*13.28*/("""{"""),format.raw/*13.29*/("""  
    maxDate: new Date(),
    onSelect: function()"""),format.raw/*15.25*/("""{"""),format.raw/*15.26*/("""
    var selected = $(this).val();
    $("#hoEndDate").val(selected)
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""
    ,dateFormat: "dd/mm/yy""""),format.raw/*19.28*/("""}"""),format.raw/*19.29*/(""");
	
		"""),format.raw/*21.3*/("""}"""),format.raw/*21.4*/(""");
</script>
   
"""),_display_(Seq[Any](/*24.2*/main/*24.6*/{_display_(Seq[Any](format.raw/*24.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*32.24*/routes/*32.30*/.Application.index())),format.raw/*32.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*33.27*/routes/*33.33*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*33.80*/("""" class="btn btn-default">TIMESHEET</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*39.27*/routes/*39.33*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*39.80*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         	<br><br>
         	
         	"""),_display_(Seq[Any](/*46.12*/if(flash.containsKey("success"))/*46.44*/ {_display_(Seq[Any](format.raw/*46.46*/("""
       			<div class="alert alert-warning">
            		<strong>Done!</strong> """),_display_(Seq[Any](/*48.39*/flash/*48.44*/.get("success"))),format.raw/*48.59*/("""
        		</div>
    		""")))})),format.raw/*50.8*/("""
	
  
  	"""),_display_(Seq[Any](/*53.5*/helper/*53.11*/.form(action = routes.Timesheets.saveForHeadOfficeTimeSheet(store.id,emp.id), 'id -> "timesheetForm", 'onsubmit -> "return getRowCount();")/*53.150*/ {_display_(Seq[Any](format.raw/*53.152*/("""
		

		<h2>Time Sheet </h2>
		<hr/>
		<br/>
		<br/>
        	
          			<div class="table-responsive"> 
          			<input type="hidden" id="firmid" value=""""),_display_(Seq[Any](/*62.55*/store/*62.60*/.id)),format.raw/*62.63*/("""">
        				<table class="table table-bordered" style="background-color: white;border-color: #fff;">
							<tr>
								<td>
									<div class="input">
									        
									 	<input type="text" value=""""),_display_(Seq[Any](/*68.39*/emp/*68.42*/.id)),format.raw/*68.45*/("""" id="empid"  readonly='readonly' style="display:none;"/><h1>"""),_display_(Seq[Any](/*68.107*/emp/*68.110*/.firstName)),format.raw/*68.120*/("""."""),_display_(Seq[Any](/*68.122*/emp/*68.125*/.lastName)),format.raw/*68.134*/("""</h1>
									
									 <span class="help-inline"></span>
									</div>	
								</td>
								<td>
									<div class="clearfix  " id="date_field">
		    							<label for="date">Date</label>
		    								<div class="input">
		        
		    									<input type="text" id="hoDate" name="date" class="startDatePicker"  required/>
		    									<label id="hoDateErrorLabel" style="display:none; color:red">Please Select Date.</label>
		
		        
		    								</div>
									</div>
								</td>
								<td  style="display:none;>
								<div class="clearfix  " id="endDate_field">
	    							<label for="endDate">End Date</label>
	    								<div class="input">
	        
	    									<input type="text" id="hoEndDate" name="endDate" class="endDatePicker" required/>
	
	    								</div>
									</div>
								</td>
								
								<td>
									 <input type="checkbox" name="applyLeave" id="applyLeaveCheckBoxHO" /> Leave
									 
									<div class="clearfix" id="leaveType_field" style="display:none;">
    									<label for="leaveType">Leave Type</label>
    										<div class="input">
    											<select id="leaveType" name="leaveType" required>
    												 <option class="blank" value="None">-- Choose Type --</option>
										             <option value="AL" >AL</option>
							                         <option value="SL" >SL</option>
							                         <option value="PH" >PH</option>
							                    </select> 
    										</div>
									</div>
								
								</td>
								
									<input type="hidden" name="firmid" value=""""),_display_(Seq[Any](/*113.53*/store/*113.58*/.id)),format.raw/*113.61*/("""" id="firmName"/>
									<input type="hidden" id="rowCountHidden" name="rowCountHidden">
								
							</tr>	
							<tr>
								
								<td>
									<div class="clearfix  " id="timesheetStartTime_field">
    									<label for="timesheetStartTime">Start Time</label>
    										<div class="input">
    											<select id="startTimeHour" name="startTimeHour" required onblur="durationHeadOfficeFromStartEnd()">
    												 <option class="blank" value="">-- Hour --</option>
										             """),_display_(Seq[Any](/*125.25*/for(i <- 0 to 9) yield /*125.41*/ {_display_(Seq[Any](format.raw/*125.43*/("""
    													<option value="0"""),_display_(Seq[Any](/*126.35*/i)),format.raw/*126.36*/("""" >0"""),_display_(Seq[Any](/*126.41*/i)),format.raw/*126.42*/("""</option>
													 """)))})),format.raw/*127.16*/("""
													  """),_display_(Seq[Any](/*128.17*/for(i <- 10 to 23) yield /*128.35*/ {_display_(Seq[Any](format.raw/*128.37*/("""
    													<option value=""""),_display_(Seq[Any](/*129.34*/i)),format.raw/*129.35*/("""" >"""),_display_(Seq[Any](/*129.39*/i)),format.raw/*129.40*/("""</option>
													 """)))})),format.raw/*130.16*/("""
							                    </select>
							                    
							                    <select id="startTimeMins" name="startTimeMins" required onblur="durationHeadOfficeFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" >00</option>
							                         <option value="15" >15</option>
							                         <option value="30" >30</option>
							                         <option value="45" >45</option>
							                    </select> 
							                    <label id="startTimeHourErrorLabel" style="display:none; color:red">Please Select Start Hours.</label>
							                    <label id="startTimeMinsErrorLabel" style="display:none; color:red">Please Select Start Mins.</label>
    										</div>
									</div>
								</td>
								
								<td>
									<div class="clearfix  " id="timesheetEndTime_field">
    									<label for="timesheetEndTime">End Time</label>
    										<div class="input">
    											<select id="endTimeHour" name="endTimeHour" required onblur="durationHeadOfficeFromStartEnd()">
    												 <option class="blank" value="">-- Hour --</option>
    												 """),_display_(Seq[Any](/*152.19*/for(i <- 0 to 9) yield /*152.35*/ {_display_(Seq[Any](format.raw/*152.37*/("""
    													<option value="0"""),_display_(Seq[Any](/*153.35*/i)),format.raw/*153.36*/("""" >0"""),_display_(Seq[Any](/*153.41*/i)),format.raw/*153.42*/("""</option>
													 """)))})),format.raw/*154.16*/("""
													  """),_display_(Seq[Any](/*155.17*/for(i <- 10 to 23) yield /*155.35*/ {_display_(Seq[Any](format.raw/*155.37*/("""
    													<option value=""""),_display_(Seq[Any](/*156.34*/i)),format.raw/*156.35*/("""" >"""),_display_(Seq[Any](/*156.39*/i)),format.raw/*156.40*/("""</option>
													 """)))})),format.raw/*157.16*/("""
    												
							                    </select>
							                    
							                    <select id="endTimeMins" name="endTimeMins" required onblur="durationHeadOfficeFromStartEnd()">
    												 <option class="blank" value="">-- Min's --</option>
										             <option value="00" >00</option>
							                         <option value="15" >15</option>
							                         <option value="30" >30</option>
							                         <option value="45" >45</option>
							                    </select> 
							                     <label id="endTimeHourErrorLabel" style="display:none; color:red">Please Select End Hours.</label>
							                     <label id="endTimeMinsErrorLabel" style="display:none; color:red">Please Select End Mins.</label>
    										</div>
									</div>
								</td>
								
								<td>
									"""),_display_(Seq[Any](/*175.11*/helper/*175.17*/.inputText(headOfficeTimeSheetForm("duration"), '_label -> "Duration", 'readonly -> "readonly"))),format.raw/*175.112*/("""
								</td>
								<td>
								<div class="clearfix  " id="activity_field">
								Activity:
								<textarea id="hOTextarea" style="height:80%;width:100%"  maxlength="250" onkeydown="checkActivityTextLength()" ></textarea>
								<p id="activityTextLength"  style="color:red;font-size:15px;">Note:Max length is 250 characters only.</p>
								<label id="hoActivityErrorLabel" style="display:none; color:red">Please Enter Activity</label>
								
								</div>
								</td>
								<td>
								<div class="clearfix  " id="addButton_field">
								<input type="button" value="Add" class="btn btn-primary" id="hOTSheetButton"  onclick="addTimeSheetHours("""),_display_(Seq[Any](/*188.115*/emp/*188.118*/.id)),format.raw/*188.121*/(""")"/>
								</div>
								</td>
							</tr>
						</table>
					</div>
					<div class="table-responsive" id="headOfficeTimeSheetTable_field" style="display:none;">
						<table id="headOfficeTimeSheetTable" class="table table-bordered">
				        	<thead>
					 			<th style="background-color:#D0F5A9">Start TimeHour</th>
					 			<th style="background-color:#D0F5A9">Start TimeMin</th>
					            <th style="background-color:#D0F5A9">End TimeHour</th>
					            <th style="background-color:#D0F5A9">Start TimeMin</th>
					            <th style="background-color:#D0F5A9">Duration</th>
					            <th style="background-color:#D0F5A9">Activity</th>
					            <th style="background-color:#D0F5A9"></th>
					            
				            </thead> 
				            <tbody>
				            </tbody>
						</table>
  					</div>
					
            
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" id="btnSubmit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;" >&nbsp;&nbsp;  
				
		    </div>
        </div>
        
    
    


	""")))})),format.raw/*225.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*230.2*/("""<!-- main end -->

   """))}
    }
    
    def render(headOfficeTimeSheetForm:Form[Timesheet],store:Store,emp:Employee): play.api.templates.HtmlFormat.Appendable = apply(headOfficeTimeSheetForm,store,emp)
    
    def f:((Form[Timesheet],Store,Employee) => play.api.templates.HtmlFormat.Appendable) = (headOfficeTimeSheetForm,store,emp) => apply(headOfficeTimeSheetForm,store,emp)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:12 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/showForHeadOffice.scala.html
                    HASH: 38c048e446bfc4caa611d0dba9db3bcc9e406264
                    MATRIX: 821->1|1034->67|1063->89|1090->125|1464->471|1493->472|1554->505|1583->506|1665->560|1694->561|1797->637|1825->638|1882->667|1911->668|1947->677|1975->678|2031->699|2043->703|2081->704|2354->941|2369->947|2411->967|2530->1050|2545->1056|2614->1103|2909->1362|2924->1368|2993->1415|3217->1603|3258->1635|3298->1637|3419->1722|3433->1727|3470->1742|3528->1769|3576->1782|3591->1788|3740->1927|3781->1929|3987->2099|4001->2104|4026->2107|4282->2327|4294->2330|4319->2333|4418->2395|4431->2398|4464->2408|4503->2410|4516->2413|4548->2422|6233->4070|6248->4075|6274->4078|6840->4607|6873->4623|6914->4625|6987->4661|7011->4662|7053->4667|7077->4668|7136->4694|7191->4712|7226->4730|7267->4732|7339->4767|7363->4768|7404->4772|7428->4773|7487->4799|8778->6053|8811->6069|8852->6071|8925->6107|8949->6108|8991->6113|9015->6114|9074->6140|9129->6158|9164->6176|9205->6178|9277->6213|9301->6214|9342->6218|9366->6219|9425->6245|10376->7159|10392->7165|10511->7260|11229->7940|11243->7943|11270->7946|12621->9265|12696->9308
                    LINES: 26->1|32->1|33->3|33->4|40->11|40->11|42->13|42->13|44->15|44->15|47->18|47->18|48->19|48->19|50->21|50->21|53->24|53->24|53->24|61->32|61->32|61->32|62->33|62->33|62->33|68->39|68->39|68->39|75->46|75->46|75->46|77->48|77->48|77->48|79->50|82->53|82->53|82->53|82->53|91->62|91->62|91->62|97->68|97->68|97->68|97->68|97->68|97->68|97->68|97->68|97->68|142->113|142->113|142->113|154->125|154->125|154->125|155->126|155->126|155->126|155->126|156->127|157->128|157->128|157->128|158->129|158->129|158->129|158->129|159->130|181->152|181->152|181->152|182->153|182->153|182->153|182->153|183->154|184->155|184->155|184->155|185->156|185->156|185->156|185->156|186->157|204->175|204->175|204->175|217->188|217->188|217->188|254->225|259->230
                    -- GENERATED --
                */
            