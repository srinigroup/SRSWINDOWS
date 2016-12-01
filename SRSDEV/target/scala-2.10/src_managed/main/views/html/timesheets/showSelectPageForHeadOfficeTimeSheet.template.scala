
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
object showSelectPageForHeadOfficeTimeSheet extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*3.1*/("""
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
	    <link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
  <style>
    .datepicker"""),format.raw/*8.16*/("""{"""),format.raw/*8.17*/("""
     
    """),format.raw/*10.5*/("""}"""),format.raw/*10.6*/("""
  </style>
  
"""),format.raw/*37.12*/("""

"""),_display_(Seq[Any](/*39.2*/main/*39.6*/{_display_(Seq[Any](format.raw/*39.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*47.24*/routes/*47.30*/.Application.index())),format.raw/*47.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">HEAD OFFICE TIMESHEET</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*53.27*/routes/*53.33*/.Application.index())),format.raw/*53.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*60.12*/if(flash.containsKey("success"))/*60.44*/ {_display_(Seq[Any](format.raw/*60.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*62.39*/flash/*62.44*/.get("success"))),format.raw/*62.59*/("""
		        </div>
		    """)))})),format.raw/*64.8*/(""" 
	
	"""),_display_(Seq[Any](/*66.3*/helper/*66.9*/.form(action = routes.Timesheets.getHeadOfficeTimesheets())/*66.68*/ {_display_(Seq[Any](format.raw/*66.70*/("""
	<input type="hidden" id="headOfficeEmployeesHidden">
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
					  	<td>
            				<div class="clearfix" id="storeId_field">
								<label for="empId">Select Employee</label>
									<div class="input">
										<select name="empId" required>
						            		<option class="blank" value="">-- Choose a Employee --</option>
						  					"""),_display_(Seq[Any](/*77.15*/for(employee <- Employee.getHeadOfficeEmployee(1)) yield /*77.65*/{_display_(Seq[Any](format.raw/*77.66*/("""
							  						<option value=""""),_display_(Seq[Any](/*78.32*/employee/*78.40*/.id)),format.raw/*78.43*/("""">"""),_display_(Seq[Any](/*78.46*/employee/*78.54*/.firstName)),_display_(Seq[Any](/*78.65*/employee/*78.73*/.lastName)),format.raw/*78.82*/("""</option>
						  					""")))})),format.raw/*79.15*/("""
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
					  		<div class="clearfix" id="timesheetStartDate_field">
								<label for="timesheetStartDate">Start Date</label>
									<div class="input">
										<input type="text" name="timesheetStartDate" class="startDatePicker" required  />
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
					  		<div class="clearfix" id="timesheetEndtDate_field">
								<label for="timesheetEndDate">End Date</label>
									<div class="input">
										<input type="text" name="timesheetEndDate" class="endDatepicker" required  />
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
            		</tr>
            	</table>
         	</div>
		
        <center><input type="submit" value="Get Timesheets" class="btn btn-primary"></center>
        
        
	
	""")))})),format.raw/*111.3*/(""" <!-- form ends -->
		</div>
	</div>
	
""")))})),format.raw/*115.2*/(""" <!-- main ends -->
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/showSelectPageForHeadOfficeTimeSheet.scala.html
                    HASH: 67af7945296a12a9a99c6ec4f00ba1156cf570c7
                    MATRIX: 950->54|1308->385|1336->386|1376->399|1404->400|1450->788|1490->793|1502->797|1540->798|1814->1036|1829->1042|1871->1062|2200->1355|2215->1361|2257->1381|2485->1573|2526->1605|2566->1607|2687->1692|2701->1697|2738->1712|2796->1739|2839->1747|2853->1753|2921->1812|2961->1814|3494->2311|3560->2361|3599->2362|3668->2395|3685->2403|3710->2406|3749->2409|3766->2417|3807->2428|3824->2436|3855->2445|3912->2470|4951->3477|5027->3521
                    LINES: 32->3|37->8|37->8|39->10|39->10|42->37|44->39|44->39|44->39|52->47|52->47|52->47|58->53|58->53|58->53|65->60|65->60|65->60|67->62|67->62|67->62|69->64|71->66|71->66|71->66|71->66|82->77|82->77|82->77|83->78|83->78|83->78|83->78|83->78|83->78|83->78|83->78|84->79|116->111|120->115
                    -- GENERATED --
                */
            