
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Timesheet],Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(timesheetForm:Form[Timesheet],store:Store):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.45*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/("""
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
	    
	    <link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
 
</script>
<script>
 $(function() """),format.raw/*12.15*/("""{"""),format.raw/*12.16*/("""
       var date=new Date();
  date.setDate(date.getDate() + 1);
  
	$( "#startDatePicker" ).datepicker("""),format.raw/*16.37*/("""{"""),format.raw/*16.38*/("""  """),format.raw/*16.86*/("""
    maxDate: new Date(),
    onSelect: function()"""),format.raw/*18.25*/("""{"""),format.raw/*18.26*/("""   """),format.raw/*18.86*/("""
    var selected = $(this).val();
    $("#endstartDatePicker").val(selected)
    """),format.raw/*21.5*/("""}"""),format.raw/*21.6*/("""
    ,dateFormat: "dd/mm/yy""""),format.raw/*22.28*/("""}"""),format.raw/*22.29*/(""");
    
	$( "#endstartDatePicker" ).datepicker("""),format.raw/*24.40*/("""{"""),format.raw/*24.41*/("""  """),format.raw/*24.87*/("""
    maxDate: date,
     dateFormat: "dd/mm/yy"
    	"""),format.raw/*27.6*/("""}"""),format.raw/*27.7*/(""");
	
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/(""");
	
</script>        
"""),_display_(Seq[Any](/*32.2*/main/*32.6*/{_display_(Seq[Any](format.raw/*32.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*40.24*/routes/*40.30*/.Application.index())),format.raw/*40.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*41.27*/routes/*41.33*/.Application.showOptions("TIMESHEET","ALL"))),format.raw/*41.76*/("""" class="btn btn-default">TIMESHEET</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*47.27*/routes/*47.33*/.Application.showOptions("TIMESHEET","ALL"))),format.raw/*47.76*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         	<br><br>
         	
         	"""),_display_(Seq[Any](/*54.12*/if(flash.containsKey("success"))/*54.44*/ {_display_(Seq[Any](format.raw/*54.46*/("""
       			<div class="alert alert-warning">
            		<strong>Done!</strong> """),_display_(Seq[Any](/*56.39*/flash/*56.44*/.get("success"))),format.raw/*56.59*/("""
        		</div>
    		""")))})),format.raw/*58.8*/("""
	
  
  	"""),_display_(Seq[Any](/*61.5*/helper/*61.11*/.form(action = routes.Timesheets.save(store.id), 'id -> "timesheetForm", 'onsubmit -> "return checkTimesheetExists();")/*61.130*/ {_display_(Seq[Any](format.raw/*61.132*/("""
		

		<h2>Time Sheet </h2>
		<hr/>
		<br/>
		<br/>
		
		
        	
          			<div class="table-responsive"> 
        				<table class="table table-bordered" style="background-color: white;border-color: #fff;">
							<tr>
								<td>
									 """),_display_(Seq[Any](/*75.12*/select(
					                timesheetForm("empid"), 
					                options(Employee.options(store.id)), 
					                '_label -> "Employee", '_default -> "-- Choose a Employee --", 'required -> "true",
					                '_showConstraints -> false
									
									))),format.raw/*81.11*/("""
								</td>
								<td>
									<div class="clearfix  " id="date_field">
		    							<label for="date">Start Date</label>
		    								<div class="input">
		        
		    									<input type="text" name="date" id="startDatePicker" class="startDatePicker" required />
		
		        
		    								</div>
									</div>
								</td>
								<td>
								<div class="clearfix  " id="endDate_field">
	    							<label for="endDate">End Date</label>
	    								<div class="input">
	        
	    									<input type="text" name="endDate" id="endstartDatePicker" class="endDatePicker" required />
	
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
								
									<input type="hidden" name="firmid" value=""""),_display_(Seq[Any](/*121.53*/store/*121.58*/.id)),format.raw/*121.61*/(""""/>
								
							</tr>	
							<tr>
								
								<td>
									<div class="clearfix  " id="timesheetStartTime_field">
    									<label for="timesheetStartTime">Start Time</label>
    										<div class="input">
    											<select id="startTimeHour" name="startTimeHour" required onblur="durationFromStartEnd()">
    												 <option class="blank" value="">-- Hour --</option>
										             """),_display_(Seq[Any](/*132.25*/for(i <- 0 to 9) yield /*132.41*/ {_display_(Seq[Any](format.raw/*132.43*/("""
    													<option value="0"""),_display_(Seq[Any](/*133.35*/i)),format.raw/*133.36*/("""" >0"""),_display_(Seq[Any](/*133.41*/i)),format.raw/*133.42*/("""</option>
													 """)))})),format.raw/*134.16*/("""
													  """),_display_(Seq[Any](/*135.17*/for(i <- 10 to 23) yield /*135.35*/ {_display_(Seq[Any](format.raw/*135.37*/("""
    													<option value=""""),_display_(Seq[Any](/*136.34*/i)),format.raw/*136.35*/("""" >"""),_display_(Seq[Any](/*136.39*/i)),format.raw/*136.40*/("""</option>
													 """)))})),format.raw/*137.16*/("""
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
    												 """),_display_(Seq[Any](/*156.19*/for(i <- 0 to 9) yield /*156.35*/ {_display_(Seq[Any](format.raw/*156.37*/("""
    													<option value="0"""),_display_(Seq[Any](/*157.35*/i)),format.raw/*157.36*/("""" >0"""),_display_(Seq[Any](/*157.41*/i)),format.raw/*157.42*/("""</option>
													 """)))})),format.raw/*158.16*/("""
													  """),_display_(Seq[Any](/*159.17*/for(i <- 10 to 23) yield /*159.35*/ {_display_(Seq[Any](format.raw/*159.37*/("""
    													<option value=""""),_display_(Seq[Any](/*160.34*/i)),format.raw/*160.35*/("""" >"""),_display_(Seq[Any](/*160.39*/i)),format.raw/*160.40*/("""</option>
													 """)))})),format.raw/*161.16*/("""
    												
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
									"""),_display_(Seq[Any](/*176.11*/helper/*176.17*/.inputText(timesheetForm("duration"), '_label -> "Duration", 'readonly -> "readonly"))),format.raw/*176.102*/("""
								</td>
								
								<td>
									"""),_display_(Seq[Any](/*180.11*/select(
				  				 timesheetForm("status"),
				  				 options(Seq("OPEN","APPROVED")),
				 				 '_label -> "Status", 'required -> "true", '_default -> "-- Select Status --"
								))),format.raw/*184.10*/("""
								</td>
								
							</tr>
						</table>
					</div>
            
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" id="btnSubmitInTimesheet"  class="btn btn-large btn-success"  style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
    
    


	""")))})),format.raw/*204.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*209.2*/("""<!-- main end -->

   """))}
    }
    
    def render(timesheetForm:Form[Timesheet],store:Store): play.api.templates.HtmlFormat.Appendable = apply(timesheetForm,store)
    
    def f:((Form[Timesheet],Store) => play.api.templates.HtmlFormat.Appendable) = (timesheetForm,store) => apply(timesheetForm,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:12 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/show.scala.html
                    HASH: 37cc4b5d7064c4021ac327e3134da3d3e0abba08
                    MATRIX: 799->1|989->44|1018->66|1045->102|1423->452|1452->453|1588->561|1617->562|1647->610|1727->662|1756->663|1787->723|1899->808|1927->809|1984->838|2013->839|2090->888|2119->889|2149->935|2232->991|2260->992|2294->999|2322->1000|2384->1027|2396->1031|2434->1032|2707->1269|2722->1275|2764->1295|2883->1378|2898->1384|2963->1427|3258->1686|3273->1692|3338->1735|3562->1923|3603->1955|3643->1957|3764->2042|3778->2047|3815->2062|3873->2089|3921->2102|3936->2108|4065->2227|4106->2229|4406->2493|4720->2785|6203->4231|6218->4236|6244->4239|6712->4670|6745->4686|6786->4688|6859->4724|6883->4725|6925->4730|6949->4731|7008->4757|7063->4775|7098->4793|7139->4795|7211->4830|7235->4831|7276->4835|7300->4836|7359->4862|8340->5806|8373->5822|8414->5824|8487->5860|8511->5861|8553->5866|8577->5867|8636->5893|8691->5911|8726->5929|8767->5931|8839->5966|8863->5967|8904->5971|8928->5972|8987->5998|9644->6618|9660->6624|9769->6709|9857->6760|10068->6948|10616->7464|10691->7507
                    LINES: 26->1|32->1|33->3|33->4|41->12|41->12|45->16|45->16|45->16|47->18|47->18|47->18|50->21|50->21|51->22|51->22|53->24|53->24|53->24|56->27|56->27|58->29|58->29|61->32|61->32|61->32|69->40|69->40|69->40|70->41|70->41|70->41|76->47|76->47|76->47|83->54|83->54|83->54|85->56|85->56|85->56|87->58|90->61|90->61|90->61|90->61|104->75|110->81|150->121|150->121|150->121|161->132|161->132|161->132|162->133|162->133|162->133|162->133|163->134|164->135|164->135|164->135|165->136|165->136|165->136|165->136|166->137|185->156|185->156|185->156|186->157|186->157|186->157|186->157|187->158|188->159|188->159|188->159|189->160|189->160|189->160|189->160|190->161|205->176|205->176|205->176|209->180|213->184|233->204|238->209
                    -- GENERATED --
                */
            