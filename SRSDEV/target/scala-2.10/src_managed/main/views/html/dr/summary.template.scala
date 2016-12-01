
package views.html.dr

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
object summary extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[java.util.Date,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(weekDate:java.util.Date,empId:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*7.2*/currentDateFormat/*7.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};def /*17.2*/timesheetList/*17.15*/ = {{

 import java.util.List
 
val list=Timesheet.getTimesheetbyEmployee(empId,weekDate,Application.getNextDate(weekDate,6));

list
}};
Seq[Any](format.raw/*1.38*/("""


"""),format.raw/*6.1*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*24.2*/("""

<script>
			function closeWindow1()"""),format.raw/*27.27*/("""{"""),format.raw/*27.28*/("""
					
						//alert("inside close window");
						window.close();
			 """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/("""
</script>


<html>
<head>
 
<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*38.62*/routes/*38.68*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*38.111*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*39.70*/routes/*39.76*/.Assets.at("stylesheets/main.css"))),format.raw/*39.110*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*40.70*/routes/*40.76*/.Assets.at("stylesheets/accordion.css"))),format.raw/*40.115*/(""""> 
        
   		
   		 <script type="text/javascript" src='"""),_display_(Seq[Any](/*43.44*/routes/*43.50*/.Application.javascriptRoutes())),format.raw/*43.81*/("""'></script>
   		 
   		<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
   		 <!-- <script type="text/javascript" src=""""),_display_(Seq[Any](/*47.49*/routes/*47.55*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*47.100*/(""""></script>-->
   


</head>
<body>

<center><h1>TimeSheet Summary</h1></center>

<div class="table-responsive">
<table class="table table-bordered">
            	<thead>
                <tr style="background-color:#58ACFA">
                   
                 	 <th>Thursday</th>
                     <th>Friday</th>
                     <th>Saturday</th>
                         
                      <th>Sunday</th>
                      <th>Monday</th>
                      <th>Tuesday</th>
                      <th>Wednesday</th>
                     
                      
                       
                      
                    
                </tr>
            </thead>
            <tbody>

               
                    <tr>
                        <td> """),_display_(Seq[Any](/*80.31*/currentDateFormat(weekDate))),format.raw/*80.58*/(""" </td>
                        
                        <td> """),_display_(Seq[Any](/*82.31*/currentDateFormat(Application.getNextDate(weekDate,1)))),format.raw/*82.85*/(""" </td>
                        
                        <td> """),_display_(Seq[Any](/*84.31*/currentDateFormat(Application.getNextDate(weekDate,2)))),format.raw/*84.85*/("""</td>
                         
                        <td> """),_display_(Seq[Any](/*86.31*/currentDateFormat(Application.getNextDate(weekDate,3)))),format.raw/*86.85*/("""</td>
                        
                        <td> """),_display_(Seq[Any](/*88.31*/currentDateFormat(Application.getNextDate(weekDate,4)))),format.raw/*88.85*/("""</td> 	
                        <td> """),_display_(Seq[Any](/*89.31*/currentDateFormat(Application.getNextDate(weekDate,5)))),format.raw/*89.85*/("""</td> 	
                        <td> """),_display_(Seq[Any](/*90.31*/currentDateFormat(Application.getNextDate(weekDate,6)))),format.raw/*90.85*/("""</td> 	
                       	
                       
                          
                    </tr>
                    
                    <tr>
                    	<td>"""),_display_(Seq[Any](/*97.27*/Timesheet/*97.36*/.getDurationForMultipleTimesheets(weekDate,timesheetList))),format.raw/*97.93*/("""</td>
                    	<td>"""),_display_(Seq[Any](/*98.27*/Timesheet/*98.36*/.getDurationForMultipleTimesheets(Application.getNextDate(weekDate,1),timesheetList))),format.raw/*98.120*/("""</td>
                    	<td>"""),_display_(Seq[Any](/*99.27*/Timesheet/*99.36*/.getDurationForMultipleTimesheets(Application.getNextDate(weekDate,2),timesheetList))),format.raw/*99.120*/("""</td>
                    	<td>"""),_display_(Seq[Any](/*100.27*/Timesheet/*100.36*/.getDurationForMultipleTimesheets(Application.getNextDate(weekDate,3),timesheetList))),format.raw/*100.120*/("""</td>
                    	<td>"""),_display_(Seq[Any](/*101.27*/Timesheet/*101.36*/.getDurationForMultipleTimesheets(Application.getNextDate(weekDate,4),timesheetList))),format.raw/*101.120*/("""</td>
                    	<td>"""),_display_(Seq[Any](/*102.27*/Timesheet/*102.36*/.getDurationForMultipleTimesheets(Application.getNextDate(weekDate,5),timesheetList))),format.raw/*102.120*/("""</td>
                    	<td>"""),_display_(Seq[Any](/*103.27*/Timesheet/*103.36*/.getDurationForMultipleTimesheets(Application.getNextDate(weekDate,6),timesheetList))),format.raw/*103.120*/("""</td>
                    </tr>
                   

            </tbody>
        </table>
		</div>
			 <center><input type="button" value="Close" CLASS="btn primary" onclick="closeWindow1()"/></center>
</body>
</html>

"""))}
    }
    
    def render(weekDate:java.util.Date,empId:Long): play.api.templates.HtmlFormat.Appendable = apply(weekDate,empId)
    
    def f:((java.util.Date,Long) => play.api.templates.HtmlFormat.Appendable) = (weekDate,empId) => apply(weekDate,empId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:06 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dr/summary.scala.html
                    HASH: baab27ba9de0b6009d1fbbf2f1f3428dd9b46c2e
                    MATRIX: 792->1|958->100|983->117|1185->310|1207->323|1378->37|1410->97|1439->305|1470->462|1538->502|1567->503|1669->578|1697->579|1830->676|1845->682|1911->725|2021->799|2036->805|2093->839|2203->913|2218->919|2280->958|2381->1023|2396->1029|2449->1060|2694->1269|2709->1275|2777->1320|3634->2141|3683->2168|3783->2232|3859->2286|3959->2350|4035->2404|4135->2468|4211->2522|4310->2585|4386->2639|4461->2678|4537->2732|4612->2771|4688->2825|4913->3014|4931->3023|5010->3080|5079->3113|5097->3122|5204->3206|5273->3239|5291->3248|5398->3332|5468->3365|5487->3374|5595->3458|5665->3491|5684->3500|5792->3584|5862->3617|5881->3626|5989->3710|6059->3743|6078->3752|6186->3836
                    LINES: 26->1|31->7|31->7|39->17|39->17|47->1|50->6|51->15|53->24|56->27|56->27|60->31|60->31|67->38|67->38|67->38|68->39|68->39|68->39|69->40|69->40|69->40|72->43|72->43|72->43|76->47|76->47|76->47|109->80|109->80|111->82|111->82|113->84|113->84|115->86|115->86|117->88|117->88|118->89|118->89|119->90|119->90|126->97|126->97|126->97|127->98|127->98|127->98|128->99|128->99|128->99|129->100|129->100|129->100|130->101|130->101|130->101|131->102|131->102|131->102|132->103|132->103|132->103
                    -- GENERATED --
                */
            