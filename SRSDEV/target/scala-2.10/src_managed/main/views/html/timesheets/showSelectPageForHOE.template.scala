
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
object showSelectPageForHOE extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(sid:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.12*/("""
"""),format.raw/*4.1*/("""
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
	    <link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
  <style>
    .datepicker"""),format.raw/*9.16*/("""{"""),format.raw/*9.17*/("""
     
    """),format.raw/*11.5*/("""}"""),format.raw/*11.6*/("""
  </style>
  
<script>
	 
	 function enableThursday(date) """),format.raw/*16.33*/("""{"""),format.raw/*16.34*/("""

		  var day = date.getDay();
		 // If day == 1 then it is MOnday
		 if (day == 4) """),format.raw/*20.18*/("""{"""),format.raw/*20.19*/("""
		 
		 return [true] ; 
		 
		 """),format.raw/*24.4*/("""}"""),format.raw/*24.5*/(""" else """),format.raw/*24.11*/("""{"""),format.raw/*24.12*/(""" 
		 
		 return [false] ;
		 """),format.raw/*27.4*/("""}"""),format.raw/*27.5*/("""
  
	"""),format.raw/*29.2*/("""}"""),format.raw/*29.3*/("""
	
	 $(function() """),format.raw/*31.16*/("""{"""),format.raw/*31.17*/("""
		 $( ".datepicker" ).datepicker("""),format.raw/*32.34*/("""{"""),format.raw/*32.35*/("""
		 beforeShowDay: enableThursday,dateFormat: "dd/mm/yy"
		 """),format.raw/*34.4*/("""}"""),format.raw/*34.5*/(""");
	 """),format.raw/*35.3*/("""}"""),format.raw/*35.4*/(""");
</script>

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/{_display_(Seq[Any](format.raw/*38.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*46.24*/routes/*46.30*/.Application.index())),format.raw/*46.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">TIMESHEET</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href="" onclick="goBack()" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*59.12*/if(flash.containsKey("success"))/*59.44*/ {_display_(Seq[Any](format.raw/*59.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*61.39*/flash/*61.44*/.get("success"))),format.raw/*61.59*/("""
		        </div>
		    """)))})),format.raw/*63.8*/(""" 
	
	"""),_display_(Seq[Any](/*65.3*/helper/*65.9*/.form(action = routes.Timesheets.getTimesheets())/*65.58*/ {_display_(Seq[Any](format.raw/*65.60*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
					  	<td>
            				<b>"""),_display_(Seq[Any](/*71.21*/Store/*71.26*/.find.byId(sid))),format.raw/*71.41*/("""</b>
							<input type="hidden" name="storeId" value=""""),_display_(Seq[Any](/*72.52*/sid)),format.raw/*72.55*/("""" />
					  	</td>
					  	<td>
					  		<div class="clearfix" id="timesheetStartDate_field">
								<label for="timesheetStartDate">Week Date</label>
									<div class="input">
										<input type="text" name="timesheetWeekDate" class="datepicker" required  />
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
            		</tr>
            	</table>
         	</div>
		
        <center><input type="submit" value="Get Timesheets" class="btn btn-primary"></center>
        
        
	
	""")))})),format.raw/*91.3*/(""" <!-- form ends -->
		</div>
	</div>
	
""")))})),format.raw/*95.2*/(""" <!-- main ends -->
"""))}
    }
    
    def render(sid:Long): play.api.templates.HtmlFormat.Appendable = apply(sid)
    
    def f:((Long) => play.api.templates.HtmlFormat.Appendable) = (sid) => apply(sid)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/showSelectPageForHOE.scala.html
                    HASH: 92a742c4b97f7150208f15edfe3795b2f40845c1
                    MATRIX: 798->1|955->11|983->67|1341->398|1369->399|1409->412|1437->413|1529->477|1558->478|1674->566|1703->567|1766->603|1794->604|1828->610|1857->611|1916->643|1944->644|1978->651|2006->652|2054->672|2083->673|2146->708|2175->709|2264->771|2292->772|2325->778|2353->779|2406->797|2418->801|2456->802|2730->1040|2745->1046|2787->1066|3314->1557|3355->1589|3395->1591|3516->1676|3530->1681|3567->1696|3625->1723|3668->1731|3682->1737|3740->1786|3780->1788|3999->1971|4013->1976|4050->1991|4143->2048|4168->2051|4754->2606|4829->2650
                    LINES: 26->1|32->1|33->4|38->9|38->9|40->11|40->11|45->16|45->16|49->20|49->20|53->24|53->24|53->24|53->24|56->27|56->27|58->29|58->29|60->31|60->31|61->32|61->32|63->34|63->34|64->35|64->35|67->38|67->38|67->38|75->46|75->46|75->46|88->59|88->59|88->59|90->61|90->61|90->61|92->63|94->65|94->65|94->65|94->65|100->71|100->71|100->71|101->72|101->72|120->91|124->95
                    -- GENERATED --
                */
            