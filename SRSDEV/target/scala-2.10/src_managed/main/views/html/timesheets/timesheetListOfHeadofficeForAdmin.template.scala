
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
object timesheetListOfHeadofficeForAdmin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[java.util.Date,java.util.Date,Employee,Long,Integer,java.util.Date,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(weekStartDate : java.util.Date,endDate : java.util.Date, emp:Employee,empId:Long,days:Integer,stDate: java.util.Date,i:Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/currentDateFormat/*3.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.130*/("""

"""),format.raw/*11.2*/("""
    <!-- <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*12.71*/routes/*12.77*/.Assets.at("stylesheets/timesheet.css"))),format.raw/*12.116*/(""""> -->
 <style>
 	td[title] """),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""background:#A7C5C2;"""),format.raw/*14.33*/("""}"""),format.raw/*14.34*/("""
 </style>   
    
"""),_display_(Seq[Any](/*17.2*/main/*17.6*/ {_display_(Seq[Any](format.raw/*17.8*/("""

  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*25.24*/routes/*25.30*/.Application.index())),format.raw/*25.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						"""),_display_(Seq[Any](/*26.15*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*26.95*/{_display_(Seq[Any](format.raw/*26.96*/("""
       							<a href="" onclick="goBack()" class="btn btn-default">TIMESHEET</a>
       						""")))})),format.raw/*28.15*/("""
       						"""),_display_(Seq[Any](/*29.15*/if((session.get("role")).contains("admin") || (session.get("role")).contains("su") || (session.get("role")).contains("ac") || (session.get("role")).contains("sa"))/*29.178*/{_display_(Seq[Any](format.raw/*29.179*/("""
           						<a href=""""),_display_(Seq[Any](/*30.28*/routes/*30.34*/.Timesheets.showSelectPageForHeadOfficeTimeSheet())),format.raw/*30.84*/("""" class="btn btn-default">HEAD OFFICE TIMESHEET</a>
           					""")))})),format.raw/*31.18*/("""
            				<a href="#" class="btn btn-default">LIST</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           				 	"""),_display_(Seq[Any](/*37.19*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*37.99*/{_display_(Seq[Any](format.raw/*37.100*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*39.18*/("""
           					"""),_display_(Seq[Any](/*40.18*/if((session.get("role")).contains("admin") || (session.get("role")).contains("su") || (session.get("role")).contains("ac") || (session.get("role")).contains("sa") || (session.get("role")).contains("HOE"))/*40.222*/{_display_(Seq[Any](format.raw/*40.223*/("""
           						<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
           					""")))})),format.raw/*42.18*/("""
           					
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  

    """),_display_(Seq[Any](/*51.6*/if(flash.containsKey("success"))/*51.38*/ {_display_(Seq[Any](format.raw/*51.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*53.37*/flash/*53.42*/.get("success"))),format.raw/*53.57*/("""
        </div>
    """)))})),format.raw/*55.6*/(""" 

   
        <div class="table-responsive" style="width: 100%;margin-bottom: 15px;overflow-x:auto;">
        	
                	<h3>"""),_display_(Seq[Any](/*60.23*/emp/*60.26*/.firstName)),format.raw/*60.36*/("""."""),_display_(Seq[Any](/*60.38*/emp/*60.41*/.lastName)),format.raw/*60.50*/("""</h3>
                	
        
        	<table class="table table-bordered" style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                
                <tr>
                	<td style="text-align:center;" ><b>DATE</b></td>
                	"""),_display_(Seq[Any](/*68.19*/for(i <- 0 to days) yield /*68.38*/ {_display_(Seq[Any](format.raw/*68.40*/("""
                    	<td colspan="4" style="text-align:center;" >"""),_display_(Seq[Any](/*69.67*/currentDateFormat(Application.getNextDate(weekStartDate,i)))),format.raw/*69.126*/("""</td>
                    """)))})),format.raw/*70.22*/("""
                    <td style="text-align:center;" >TOTAL HRS</td>
                    
                </tr>
                <tr>
                	<td class ="timesheetTableTD" style="text-align:center;padding : 2px;" >"""),format.raw/*75.105*/("""</td>
                	"""),_display_(Seq[Any](/*76.19*/for(i <- 0 to days) yield /*76.38*/ {_display_(Seq[Any](format.raw/*76.40*/("""
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 10px;">START</td>
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 5px;">END</td>
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 5px;">HRS</td>
                    	<td class ="timesheetTableTD" style="padding:2px 2px 2px 10px;">ACTIVITY</td>
                    	
                    """)))})),format.raw/*82.22*/("""
                    <td></td>
                </tr>
            </thead>
            <tbody>
                    <tr>
                    	<td style="text-align:center;"></td>
                    	
                    	"""),_display_(Seq[Any](/*90.23*/for(i <-0 to days) yield /*90.41*/{_display_(Seq[Any](format.raw/*90.42*/("""
                    	<td colspan="4">
                    		"""),_display_(Seq[Any](/*92.24*/for(timesheet <- Timesheet.getHeadOfficeTimesheetByEmployeeAndDate(empId,weekStartDate,i+1)) yield /*92.116*/{_display_(Seq[Any](format.raw/*92.117*/("""
                    		
                    			"""),_display_(Seq[Any](/*94.25*/if(timesheet.empid == -1)/*94.50*/{_display_(Seq[Any](format.raw/*94.51*/("""
                    			<table class="table table-bordered">	
                    			<tr>
                    				<center><b><span style="color:green"></span></b></center>
                    				</tr>
                    			</table>
                    			""")))})),format.raw/*100.25*/(""" 
                    			"""),_display_(Seq[Any](/*101.25*/if(timesheet.empid > -1)/*101.49*/{_display_(Seq[Any](format.raw/*101.50*/("""
                    			
                    			<table class="table table-bordered">	
                    			<tr>
                    				"""),_display_(Seq[Any](/*105.26*/if(timesheet.leaveType.equals("AL") || timesheet.leaveType.equals("SL") || timesheet.leaveType.equals("PH") )/*105.135*/{_display_(Seq[Any](format.raw/*105.136*/("""
                    					<center><b><span style="color:green">"""),_display_(Seq[Any](/*106.64*/timesheet/*106.73*/.leaveType)),format.raw/*106.83*/("""</span></b></center>
                    					
                    				""")))}/*108.26*/else/*108.30*/{_display_(Seq[Any](format.raw/*108.31*/("""
                    					
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*110.52*/timesheet/*110.61*/.startTimeHour)),format.raw/*110.75*/(""":"""),_display_(Seq[Any](/*110.77*/timesheet/*110.86*/.startTimeMins)),format.raw/*110.100*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*111.52*/timesheet/*111.61*/.endTimeHour)),format.raw/*111.73*/(""":"""),_display_(Seq[Any](/*111.75*/timesheet/*111.84*/.endTimeMins)),format.raw/*111.96*/("""</td>
                    					<td style="padding:2px;">"""),_display_(Seq[Any](/*112.52*/timesheet/*112.61*/.duration)),format.raw/*112.70*/("""</td>
                    					<td style="padding:2px;width: 65px;max-width: 65px;white-space: nowrap;overflow: hidden;
                    						text-overflow: clip;cursor: pointer;" title=""""),_display_(Seq[Any](/*114.73*/timesheet/*114.82*/.activity)),format.raw/*114.91*/("""" 
                    						value=""""),_display_(Seq[Any](/*115.35*/timesheet/*115.44*/.activity)),format.raw/*115.53*/("""" onclick="showActivity(this)">
                    						"""),_display_(Seq[Any](/*116.28*/timesheet/*116.37*/.activity)),format.raw/*116.46*/("""
                    					</td>
                    					""")))})),format.raw/*118.27*/("""
                    				
                    			</tr>
                    			</table>
                    			""")))})),format.raw/*122.25*/("""
                    		""")))})),format.raw/*123.24*/("""
                    		</td>
                    		""")))})),format.raw/*125.24*/("""
                    	
                    	 <td style="vertical-align: middle;">"""),_display_(Seq[Any](/*127.60*/Timesheet/*127.69*/.getTotalHeadOfficeTimesheetHours(empId,weekStartDate,endDate))),format.raw/*127.131*/("""</td>
                    </tr>
            </tbody>
         </table>
       </div>
     </div>
    </div>
  
</div>
    
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
          <button type="button" class="btn btn-success" data-dismiss="modal" style="font-size:18px;">Close</button>
        </div>
      </div>
      
    </div>
  </div>			
""")))})),format.raw/*158.2*/("""

            """))}
    }
    
    def render(weekStartDate:java.util.Date,endDate:java.util.Date,emp:Employee,empId:Long,days:Integer,stDate:java.util.Date,i:Integer): play.api.templates.HtmlFormat.Appendable = apply(weekStartDate,endDate,emp,empId,days,stDate,i)
    
    def f:((java.util.Date,java.util.Date,Employee,Long,Integer,java.util.Date,Integer) => play.api.templates.HtmlFormat.Appendable) = (weekStartDate,endDate,emp,empId,days,stDate,i) => apply(weekStartDate,endDate,emp,empId,days,stDate,i)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/timesheetListOfHeadofficeForAdmin.scala.html
                    HASH: 683b1bbcb1c0709d7007ff942dcf671e5879331a
                    MATRIX: 881->1|1086->134|1111->151|1330->129|1361->339|1469->411|1484->417|1546->456|1604->486|1633->487|1680->506|1709->507|1767->530|1779->534|1818->536|2092->774|2107->780|2149->800|2256->871|2345->951|2384->952|2515->1051|2567->1067|2740->1230|2780->1231|2845->1260|2860->1266|2932->1316|3034->1386|3283->1599|3372->1679|3412->1680|3575->1811|3630->1830|3844->2034|3884->2035|4047->2166|4213->2297|4254->2329|4294->2331|4411->2412|4425->2417|4462->2432|4516->2455|4692->2595|4704->2598|4736->2608|4774->2610|4786->2613|4817->2622|5150->2919|5185->2938|5225->2940|5329->3008|5411->3067|5471->3095|5726->3336|5787->3361|5822->3380|5862->3382|6325->3813|6590->4042|6624->4060|6663->4061|6763->4125|6872->4217|6912->4218|6998->4268|7032->4293|7071->4294|7368->4558|7432->4585|7466->4609|7506->4610|7686->4753|7806->4862|7847->4863|7949->4928|7968->4937|8001->4947|8095->5021|8109->5025|8149->5026|8266->5106|8285->5115|8322->5129|8361->5131|8380->5140|8418->5154|8513->5212|8532->5221|8567->5233|8606->5235|8625->5244|8660->5256|8755->5314|8774->5323|8806->5332|9037->5526|9056->5535|9088->5544|9163->5582|9182->5591|9214->5600|9311->5660|9330->5669|9362->5678|9455->5738|9603->5853|9661->5878|9748->5932|9869->6016|9888->6025|9974->6087|11207->7288
                    LINES: 26->1|28->3|28->3|37->1|39->11|40->12|40->12|40->12|42->14|42->14|42->14|42->14|45->17|45->17|45->17|53->25|53->25|53->25|54->26|54->26|54->26|56->28|57->29|57->29|57->29|58->30|58->30|58->30|59->31|65->37|65->37|65->37|67->39|68->40|68->40|68->40|70->42|79->51|79->51|79->51|81->53|81->53|81->53|83->55|88->60|88->60|88->60|88->60|88->60|88->60|96->68|96->68|96->68|97->69|97->69|98->70|103->75|104->76|104->76|104->76|110->82|118->90|118->90|118->90|120->92|120->92|120->92|122->94|122->94|122->94|128->100|129->101|129->101|129->101|133->105|133->105|133->105|134->106|134->106|134->106|136->108|136->108|136->108|138->110|138->110|138->110|138->110|138->110|138->110|139->111|139->111|139->111|139->111|139->111|139->111|140->112|140->112|140->112|142->114|142->114|142->114|143->115|143->115|143->115|144->116|144->116|144->116|146->118|150->122|151->123|153->125|155->127|155->127|155->127|186->158
                    -- GENERATED --
                */
            