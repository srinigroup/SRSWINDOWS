
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
object showSelectPageForHOTVerification extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Employee],List[Timesheet],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(empList : List[Employee],totalSubTimesheetList :List[Timesheet],weekStartDate :String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.math.BigInteger; var i=0

def /*54.2*/header/*54.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*54.38*/("""
    
""")))};def /*8.3*/currentDateFormat/*8.20*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.89*/("""
"""),format.raw/*5.1*/("""<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
	    <link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
 """),format.raw/*16.2*/("""
 
 
  <style>
    .datepicker"""),format.raw/*20.16*/("""{"""),format.raw/*20.17*/("""
     
    """),format.raw/*22.5*/("""}"""),format.raw/*22.6*/("""
  </style>
  
 <script>

 
	 
	function enableThursday(date) """),format.raw/*29.32*/("""{"""),format.raw/*29.33*/("""

		  var day = date.getDay();
		 // If day == 1 then it is MOnday
		 if (day == 4) """),format.raw/*33.18*/("""{"""),format.raw/*33.19*/("""
		 
		 return [true] ; 
		 
		 """),format.raw/*37.4*/("""}"""),format.raw/*37.5*/(""" else """),format.raw/*37.11*/("""{"""),format.raw/*37.12*/(""" 
		 
		 return [false] ;
		 """),format.raw/*40.4*/("""}"""),format.raw/*40.5*/("""
  
	"""),format.raw/*42.2*/("""}"""),format.raw/*42.3*/("""
	
	 $(function() """),format.raw/*44.16*/("""{"""),format.raw/*44.17*/("""
		 $( ".datepicker" ).datepicker("""),format.raw/*45.34*/("""{"""),format.raw/*45.35*/("""
		  maxDate: new Date(),
		 beforeShowDay: enableThursday,dateFormat: "dd/mm/yy"
		 """),format.raw/*48.4*/("""}"""),format.raw/*48.5*/(""");
	 """),format.raw/*49.3*/("""}"""),format.raw/*49.4*/(""");
</script>
"""),format.raw/*53.37*/("""
"""),format.raw/*56.2*/("""
"""),_display_(Seq[Any](/*57.2*/main/*57.6*/{_display_(Seq[Any](format.raw/*57.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*65.24*/routes/*65.30*/.Application.index())),format.raw/*65.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">HEAD OFFICE TIMESHEET</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*71.27*/routes/*71.33*/.Application.index())),format.raw/*71.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*78.12*/if(flash.containsKey("success"))/*78.44*/ {_display_(Seq[Any](format.raw/*78.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*80.39*/flash/*80.44*/.get("success"))),format.raw/*80.59*/("""
		        </div>
		    """)))})),format.raw/*82.8*/(""" 
		    
	"""),_display_(Seq[Any](/*84.3*/helper/*84.9*/.form(action = routes.Timesheets.getAllHeadOfficeTimesheetsToVerify())/*84.79*/ {_display_(Seq[Any](format.raw/*84.81*/("""
			<div class="clearfix" id="timesheetStartDate_field">
				<label for="timesheetStartDate" style="font-size:16px;">Select WeekStartDate: </label>
						"""),_display_(Seq[Any](/*87.8*/if(weekStartDate.equals("no_date"))/*87.43*/{_display_(Seq[Any](format.raw/*87.44*/("""
							<input type="text" name="timesheetStartDate" class="datepicker" required  />
						""")))})),format.raw/*89.8*/("""
						"""),_display_(Seq[Any](/*90.8*/if(!(weekStartDate.equals("no_date")))/*90.46*/{_display_(Seq[Any](format.raw/*90.47*/("""
							<input type="text" name="timesheetStartDate" class="datepicker" required value=""""),_display_(Seq[Any](/*91.89*/weekStartDate)),format.raw/*91.102*/("""" />
					    """)))})),format.raw/*92.11*/("""
					    <span class="help-inline"></span>
				
					<input type="submit" class="btn btn-primary" value="GetList">
					
			</div>
	""")))})),format.raw/*98.3*/("""			
	"""),_display_(Seq[Any](/*99.3*/if((!(weekStartDate.trim.equals("no_date"))) && empList.size == 0)/*99.69*/{_display_(Seq[Any](format.raw/*99.70*/("""
		<br/>
		<div class="alert alert-warning">
			<strong>No Employees found for approval</strong>
		</div>
	""")))})),format.raw/*104.3*/("""
	
	
		"""),_display_(Seq[Any](/*107.4*/if(!(weekStartDate.trim.equals("no_date") || empList.size == 0))/*107.68*/{_display_(Seq[Any](format.raw/*107.69*/("""
			<br/>
			"""),_display_(Seq[Any](/*109.5*/helper/*109.11*/.form(action = routes.Timesheets.updateWeeklyHOTimesheetsByWeekDate(weekStartDate))/*109.94*/ {_display_(Seq[Any](format.raw/*109.96*/("""
			
			<div class="table-responsive">			
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                	<th>Employee Name</th>
                	<th>WeekStartDate</th>
                	<th>WeekEndDate</th>
                	<th>TotalDuration</th>
                	<th>Details</th>
                	<th>Approve</th>
                </tr>
            </thead>
			<tbody>
			
			<input type="hidden" name="empListSize" id="empListSize" value=""""),_display_(Seq[Any](/*125.69*/empList/*125.76*/.size())),format.raw/*125.83*/(""""> 
    		"""),_display_(Seq[Any](/*126.8*/for(empName <- empList) yield /*126.31*/ {_display_(Seq[Any](format.raw/*126.33*/("""
	    		<tr>
	    			
	    			<input type="hidden" name="empId_"""),_display_(Seq[Any](/*129.43*/i)),format.raw/*129.44*/("""" id="empId_"""),_display_(Seq[Any](/*129.57*/i)),format.raw/*129.58*/("""" value=""""),_display_(Seq[Any](/*129.68*/empName/*129.75*/.id)),format.raw/*129.78*/("""">
	    			"""),_display_(Seq[Any](/*130.10*/(i+=1))),format.raw/*130.16*/("""
					<td>"""),_display_(Seq[Any](/*131.11*/empName/*131.18*/.firstName)),format.raw/*131.28*/("""</td>		
					<td>"""),_display_(Seq[Any](/*132.11*/weekStartDate)),format.raw/*132.24*/("""</td>
					<td>"""),_display_(Seq[Any](/*133.11*/currentDateFormat(Application.getNextDate(weekStartDate, 6)))),format.raw/*133.71*/("""</td>
					<td>"""),_display_(Seq[Any](/*134.11*/Timesheet/*134.20*/.getTotalHOTimesheetHours(empName.id,Application.getDate(weekStartDate)))),format.raw/*134.92*/("""</td>
					<td>
						<a href="javascript:showMethodForGetHeadOfficeTimesheetsForVerify('"""),_display_(Seq[Any](/*136.75*/empName/*136.82*/.id)),format.raw/*136.85*/("""','"""),_display_(Seq[Any](/*136.89*/weekStartDate)),format.raw/*136.102*/("""')">
							<img src=""""),_display_(Seq[Any](/*137.19*/routes/*137.25*/.Assets.at("images/tabImages/a..png"))),format.raw/*137.62*/("""" class="img-responsive center-block"  alt="Image" style="width:100px;margin-left:10px;">
						</a>
					</td>
					<td>
						<a href="javascript:showApproveModalInListPage('"""),_display_(Seq[Any](/*141.56*/weekStartDate)),format.raw/*141.69*/("""','"""),_display_(Seq[Any](/*141.73*/Application/*141.84*/.getDateString(Application.getNextDate(weekStartDate, 6)))),format.raw/*141.141*/("""','"""),_display_(Seq[Any](/*141.145*/empName/*141.152*/.id)),format.raw/*141.155*/("""')">
							<img src=""""),_display_(Seq[Any](/*142.19*/routes/*142.25*/.Assets.at("images/tabImages/v..png"))),format.raw/*142.62*/("""" class="img-responsive center-block"  alt="Image" style="width:100px;margin-left:10px;">
						</a>
					</td>
				</tr>
			""")))})),format.raw/*146.5*/("""		

            </tbody>
         </table>
       </div>
       <div class="pull-right">
       		<input type="button" value="Approve All" class="btn btn-primary" style="font-size: 14px; padding: 7px 10px 7px 10px;" onclick="showAlertForApproveAllInListPage(this)">
       	</div>
       """)))})),format.raw/*154.9*/("""    
    """)))})),format.raw/*155.6*/("""    
	
		</div>
	</div>
		<!-- Modal For Approve-->
  <div class="modal fade" id="approveModelInListPage" role="dialog" style="margin-top:150px;">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color: #e7e7e7;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <form action=""""),_display_(Seq[Any](/*168.24*/routes/*168.30*/.Timesheets.verifyHOTimesheet())),format.raw/*168.61*/("""">
        	<input type="hidden" id="stDateForVerifyHOTimesheet" name="stDateForVerifyHOTimesheet">
        	<input type="hidden" id="enDateForVerifyHOTimesheet" name="enDateForVerifyHOTimesheet">
        	<input type="hidden" id="empIdForVerifyHOTimesheet" name="empIdForVerifyHOTimesheet">
	        <div class="modal-body" style="background: url(/assets/images/bg.png) #5CCAEA;margin-bottom:-20px;height: 150px">
	          <p id="modelBodyPForApproveInListPage" style="font-size:26px;text-align:center;
	          	margin: 20px 0px 0px 0px;word-wrap: break-word;">Are you sure do you want to Approve?</p>
	        </div>
	        <div class="modal-footer" style="background-color: #e7e7e7;text-align:center;">
	          <button type="submit" class="btn btn-success"  style="font-size:18px;">Yes</button>
	          <button type="button" class="btn btn-danger" data-dismiss="modal" style="font-size:18px;">No</button>
	        </div>
	     </form>
      </div>
      
    </div>
  </div>
  	<!-- Modal For ApproveAll-->
  <div class="modal fade" id="approveAllModelInListPage" role="dialog" style="margin-top:150px;">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color: #e7e7e7;">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        <div class="modal-body" style="background: url(/assets/images/bg.png) #5CCAEA;margin-bottom:-20px;height: 150px">
          <p id="modelBodyPForApproveInListPage" style="font-size:26px;text-align:center;
          	margin: 20px 0px 0px 0px;word-wrap: break-word;">Are you sure do you want to Approve all?</p>
        </div>
        <div class="modal-footer" style="background-color: #e7e7e7;text-align:center;">
          <button type="button" class="btn btn-success"  style="font-size:18px;" onclick="subApproveAllFormInListPage()">Yes</button>
          <button type="button" class="btn btn-danger" data-dismiss="modal" style="font-size:18px;">No</button>
        </div>
      </div>
      
    </div>
  </div>
  
  <form action=""""),_display_(Seq[Any](/*207.18*/routes/*207.24*/.Timesheets.getHeadOfficeTimesheetsForVerify())),format.raw/*207.70*/("""" id="subFormForGetHeadOfficeTimesheetsForVerifyMethod">
  
  	<input type="hidden" id="stDateForGetHeadOfficeTimesheetsForVerifyMethod" name="stDateForGetHeadOfficeTimesheetsForVerifyMethod">
    <input type="hidden" id="empIdForGetHeadOfficeTimesheetsForVerifyMethod" name="empIdForGetHeadOfficeTimesheetsForVerifyMethod">
  </form>
""")))})),format.raw/*212.2*/(""" <!-- main ends -->
"""))}
    }
    
    def render(empList:List[Employee],totalSubTimesheetList:List[Timesheet],weekStartDate:String): play.api.templates.HtmlFormat.Appendable = apply(empList,totalSubTimesheetList,weekStartDate)
    
    def f:((List[Employee],List[Timesheet],String) => play.api.templates.HtmlFormat.Appendable) = (empList,totalSubTimesheetList,weekStartDate) => apply(empList,totalSubTimesheetList,weekStartDate)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/showSelectPageForHOTVerification.scala.html
                    HASH: eb178d1af218b77e6aa2501a6c7c967d738cc43b
                    MATRIX: 843->1|1100->1267|1114->1273|1225->1303|1256->488|1281->505|1499->88|1527->183|1858->693|1920->727|1949->728|1989->741|2017->742|2114->811|2143->812|2259->900|2288->901|2351->937|2379->938|2413->944|2442->945|2501->977|2529->978|2563->985|2591->986|2639->1006|2668->1007|2731->1042|2760->1043|2875->1131|2903->1132|2936->1138|2964->1139|3007->1264|3036->1312|3074->1315|3086->1319|3124->1320|3398->1558|3413->1564|3455->1584|3784->1877|3799->1883|3841->1903|4069->2095|4110->2127|4150->2129|4271->2214|4285->2219|4322->2234|4380->2261|4428->2274|4442->2280|4521->2350|4561->2352|4754->2510|4798->2545|4837->2546|4962->2640|5006->2649|5053->2687|5092->2688|5218->2778|5254->2791|5302->2807|5473->2947|5515->2954|5590->3020|5629->3021|5774->3134|5821->3145|5895->3209|5935->3210|5987->3226|6003->3232|6096->3315|6137->3317|6752->3895|6769->3902|6799->3909|6847->3921|6887->3944|6928->3946|7032->4013|7056->4014|7106->4027|7130->4028|7177->4038|7194->4045|7220->4048|7270->4061|7299->4067|7348->4079|7365->4086|7398->4096|7454->4115|7490->4128|7544->4145|7627->4205|7681->4222|7700->4231|7795->4303|7924->4395|7941->4402|7967->4405|8008->4409|8045->4422|8106->4446|8122->4452|8182->4489|8400->4670|8436->4683|8477->4687|8498->4698|8579->4755|8621->4759|8639->4766|8666->4769|8727->4793|8743->4799|8803->4836|8965->4966|9294->5263|9337->5274|9824->5724|9840->5730|9894->5761|12099->7929|12115->7935|12184->7981|12557->8322
                    LINES: 26->1|33->54|33->54|35->54|37->8|37->8|46->1|47->5|50->16|54->20|54->20|56->22|56->22|63->29|63->29|67->33|67->33|71->37|71->37|71->37|71->37|74->40|74->40|76->42|76->42|78->44|78->44|79->45|79->45|82->48|82->48|83->49|83->49|85->53|86->56|87->57|87->57|87->57|95->65|95->65|95->65|101->71|101->71|101->71|108->78|108->78|108->78|110->80|110->80|110->80|112->82|114->84|114->84|114->84|114->84|117->87|117->87|117->87|119->89|120->90|120->90|120->90|121->91|121->91|122->92|128->98|129->99|129->99|129->99|134->104|137->107|137->107|137->107|139->109|139->109|139->109|139->109|155->125|155->125|155->125|156->126|156->126|156->126|159->129|159->129|159->129|159->129|159->129|159->129|159->129|160->130|160->130|161->131|161->131|161->131|162->132|162->132|163->133|163->133|164->134|164->134|164->134|166->136|166->136|166->136|166->136|166->136|167->137|167->137|167->137|171->141|171->141|171->141|171->141|171->141|171->141|171->141|171->141|172->142|172->142|172->142|176->146|184->154|185->155|198->168|198->168|198->168|237->207|237->207|237->207|242->212
                    -- GENERATED --
                */
            