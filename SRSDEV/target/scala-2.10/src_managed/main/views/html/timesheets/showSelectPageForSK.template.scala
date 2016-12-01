
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
object showSelectPageForSK extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.HtmlFormat.Appendable] {

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
		     maxDate: new Date(),
		 beforeShowDay: enableThursday,dateFormat: "dd/mm/yy"
		 """),format.raw/*35.4*/("""}"""),format.raw/*35.5*/(""");
	 """),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""");
</script>

"""),_display_(Seq[Any](/*39.2*/main/*39.6*/{_display_(Seq[Any](format.raw/*39.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*47.24*/routes/*47.30*/.Application.index())),format.raw/*47.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
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
         		 
         	"""),_display_(Seq[Any](/*60.12*/if(flash.containsKey("success"))/*60.44*/ {_display_(Seq[Any](format.raw/*60.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*62.39*/flash/*62.44*/.get("success"))),format.raw/*62.59*/("""
		        </div>
		    """)))})),format.raw/*64.8*/(""" 
	
	"""),_display_(Seq[Any](/*66.3*/helper/*66.9*/.form(action = routes.Timesheets.getTimesheets())/*66.58*/ {_display_(Seq[Any](format.raw/*66.60*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
					  	<td>
            				<b>"""),_display_(Seq[Any](/*72.21*/Store/*72.26*/.find.byId(sid))),format.raw/*72.41*/("""</b>
							<input type="hidden" name="storeId" value=""""),_display_(Seq[Any](/*73.52*/sid)),format.raw/*73.55*/("""" />
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
        
        
	
	""")))})),format.raw/*92.3*/(""" <!-- form ends -->
		</div>
	</div>
	
""")))})),format.raw/*96.2*/(""" <!-- main ends -->
"""))}
    }
    
    def render(sid:Long): play.api.templates.HtmlFormat.Appendable = apply(sid)
    
    def f:((Long) => play.api.templates.HtmlFormat.Appendable) = (sid) => apply(sid)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/showSelectPageForSK.scala.html
                    HASH: 3299b2328882cece0431366c684e7bf4a3f18320
                    MATRIX: 797->1|954->11|982->67|1340->398|1368->399|1408->412|1436->413|1528->477|1557->478|1673->566|1702->567|1765->603|1793->604|1827->610|1856->611|1915->643|1943->644|1977->651|2005->652|2053->672|2082->673|2145->708|2174->709|2292->800|2320->801|2353->807|2381->808|2434->826|2446->830|2484->831|2758->1069|2773->1075|2815->1095|3342->1586|3383->1618|3423->1620|3544->1705|3558->1710|3595->1725|3653->1752|3696->1760|3710->1766|3768->1815|3808->1817|4027->2000|4041->2005|4078->2020|4171->2077|4196->2080|4782->2635|4857->2679
                    LINES: 26->1|32->1|33->4|38->9|38->9|40->11|40->11|45->16|45->16|49->20|49->20|53->24|53->24|53->24|53->24|56->27|56->27|58->29|58->29|60->31|60->31|61->32|61->32|64->35|64->35|65->36|65->36|68->39|68->39|68->39|76->47|76->47|76->47|89->60|89->60|89->60|91->62|91->62|91->62|93->64|95->66|95->66|95->66|95->66|101->72|101->72|101->72|102->73|102->73|121->92|125->96
                    -- GENERATED --
                */
            