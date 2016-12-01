
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
object showSelectPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
  
<script>
	 
	 function enableThursday(date) """),format.raw/*15.33*/("""{"""),format.raw/*15.34*/("""

		  var day = date.getDay();
		 // If day == 1 then it is MOnday
		 if (day == 4) """),format.raw/*19.18*/("""{"""),format.raw/*19.19*/("""
		 
		 return [true] ; 
		 
		 """),format.raw/*23.4*/("""}"""),format.raw/*23.5*/(""" else """),format.raw/*23.11*/("""{"""),format.raw/*23.12*/(""" 
		 
		 return [false] ;
		 """),format.raw/*26.4*/("""}"""),format.raw/*26.5*/("""
  
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/("""
	
	 $(function() """),format.raw/*30.16*/("""{"""),format.raw/*30.17*/("""
		 $( ".datepicker" ).datepicker("""),format.raw/*31.34*/("""{"""),format.raw/*31.35*/("""
		 maxDate: new Date(),
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
           					<a href=""""),_display_(Seq[Any](/*52.27*/routes/*52.33*/.Application.index())),format.raw/*52.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
            				<div class="clearfix" id="storeId_field">
								<label for="storeId">Select Store</label>
									<div class="input">
										<select name="storeId" required>
						            		<option class="blank" value="">-- Choose a Store --</option>
						  					"""),_display_(Seq[Any](/*76.15*/for(store <- Stores.getStoresList()) yield /*76.51*/{_display_(Seq[Any](format.raw/*76.52*/("""
							  					"""),_display_(Seq[Any](/*77.16*/if(store.id > 1)/*77.32*/{_display_(Seq[Any](format.raw/*77.33*/("""
							  					
							  						<option value=""""),_display_(Seq[Any](/*79.32*/store/*79.37*/.id)),format.raw/*79.40*/("""">"""),_display_(Seq[Any](/*79.43*/store/*79.48*/.name)),format.raw/*79.53*/("""</option>
							  					""")))})),format.raw/*80.16*/("""
						  					""")))})),format.raw/*81.15*/("""
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
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
        
        
	
	""")))})),format.raw/*104.3*/(""" <!-- form ends -->
		</div>
	</div>
	
""")))})),format.raw/*108.2*/(""" <!-- main ends -->
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/showSelectPage.scala.html
                    HASH: 8ca4e2d4e4867c94ec73f22834ccc7150c8fe649
                    MATRIX: 928->54|1286->385|1314->386|1354->399|1382->400|1474->464|1503->465|1619->553|1648->554|1711->590|1739->591|1773->597|1802->598|1861->630|1889->631|1923->638|1951->639|1999->659|2028->660|2091->695|2120->696|2234->783|2262->784|2295->790|2323->791|2376->809|2388->813|2426->814|2700->1052|2715->1058|2757->1078|3074->1359|3089->1365|3131->1385|3359->1577|3400->1609|3440->1611|3561->1696|3575->1701|3612->1716|3670->1743|3713->1751|3727->1757|3785->1806|3825->1808|4304->2251|4356->2287|4395->2288|4448->2305|4473->2321|4512->2322|4597->2371|4611->2376|4636->2379|4675->2382|4689->2387|4716->2392|4774->2418|4822->2434|5508->3088|5584->3132
                    LINES: 32->3|37->8|37->8|39->10|39->10|44->15|44->15|48->19|48->19|52->23|52->23|52->23|52->23|55->26|55->26|57->28|57->28|59->30|59->30|60->31|60->31|63->34|63->34|64->35|64->35|67->38|67->38|67->38|75->46|75->46|75->46|81->52|81->52|81->52|88->59|88->59|88->59|90->61|90->61|90->61|92->63|94->65|94->65|94->65|94->65|105->76|105->76|105->76|106->77|106->77|106->77|108->79|108->79|108->79|108->79|108->79|108->79|109->80|110->81|133->104|137->108
                    -- GENERATED --
                */
            