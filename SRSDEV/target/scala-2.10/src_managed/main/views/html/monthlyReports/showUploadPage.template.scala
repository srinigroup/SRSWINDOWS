
package views.html.monthlyReports

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
object showUploadPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*5.2*/checkSelectedYear/*5.19*/(newYear:Integer) = {{

	val result="selected"
	if(Calendar.getInstance().get(Calendar.YEAR) == newYear){
		
		result
	}
}};
Seq[Any](format.raw/*1.11*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*12.2*/("""


"""),_display_(Seq[Any](/*15.2*/main/*15.6*/{_display_(Seq[Any](format.raw/*15.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*23.24*/routes/*23.30*/.Application.index())),format.raw/*23.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">Monthly Reports</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*29.27*/routes/*29.33*/.Application.index())),format.raw/*29.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*36.12*/if(flash.containsKey("success"))/*36.44*/ {_display_(Seq[Any](format.raw/*36.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*38.39*/flash/*38.44*/.get("success"))),format.raw/*38.59*/("""
		        </div>
		    """)))})),format.raw/*40.8*/(""" 
	
	"""),_display_(Seq[Any](/*42.3*/helper/*42.9*/.form(action = routes.MonthlyReports.uploadReports(id),'enctype -> "multipart/form-data")/*42.98*/ {_display_(Seq[Any](format.raw/*42.100*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
  						<td>
            				<div class="clearfix" id="reportingYear_field">
								<label for="reportingYear">Year</label>
									<div class="input">
										<select name="reportingYear" required>
						            		<option class="blank" value="">-- Choose a Year --</option>
						            		"""),_display_(Seq[Any](/*53.22*/for(i <- 2014 to 2025) yield /*53.44*/ {_display_(Seq[Any](format.raw/*53.46*/("""
						  						<option value=""""),_display_(Seq[Any](/*54.31*/i)),format.raw/*54.32*/("""" """),_display_(Seq[Any](/*54.35*/checkSelectedYear(i))),format.raw/*54.55*/(""">"""),_display_(Seq[Any](/*54.57*/i)),format.raw/*54.58*/("""</option>
						  					""")))})),format.raw/*55.15*/("""
						  					
						  				</select> 
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	
  						<td>
            				<div class="clearfix" id="reportingMonth_field">
								<label for="reportingMonth">Month</label>
									<div class="input">
										<select name="reportingMonth" required>
						            		<option class="blank" value="">-- Choose a Month --</option>
						  					"""),_display_(Seq[Any](/*69.15*/for(i <- 0 to 11) yield /*69.32*/ {_display_(Seq[Any](format.raw/*69.34*/("""
						  						<option value=""""),_display_(Seq[Any](/*70.31*/i)),format.raw/*70.32*/("""" >"""),_display_(Seq[Any](/*70.36*/Application/*70.47*/.getMonthForInt(i))),format.raw/*70.65*/("""</option>
						  					""")))})),format.raw/*71.15*/("""
						  				</select> 
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
            			<td>
            				<div class="clearfix" id="reportType_field">
								<label for="reportType">ReportType</label>
									<div class="input">
										<select name="reportType" required>
						            		<option class="blank" value="">-- Choose a Report Type --</option>
						  					<option value="AC Holder Statements">AC Holder Statements</option>
						  					<option value="Monthly Report">Monthly Report</option>
						  					<option value="Sira Reports">SIRA  Reports</option>
						  					
						  					<option value="Others">Others</option>
						  				</select> 
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
            				<div class="clearfix" id="invoiceFiles_field">
								<label for="invoiceFiles">Select Files</label>
									<div class="input">
										<input type="file" id="invoiceFiles" name="invoiceFiles" accept="application/pdf" multiple="multiple" onchange="javascript:updateList()" required />
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
            		</tr>
            	</table>
         	</div>
		
		 
        
        <span id="displaySelected" style="display:none;"><b>Selected Files:</b></span>
		<div id="fileList" style="background-color: white;border-color: #fff;"></div><br/>
		
        <center><input type="submit" value="Upload" class="btn btn-primary"></center>
        
        
	
	""")))})),format.raw/*115.3*/(""" <!-- form ends -->
	
		
		<a href=""""),_display_(Seq[Any](/*118.13*/routes/*118.19*/.MonthlyReports.showUploadedReports(id))),format.raw/*118.58*/("""" class="pull-right btn btn-success">Uploaded Monthly Reports</a>
	
		</div>
	</div>
	
""")))})),format.raw/*123.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(id:Long): play.api.templates.HtmlFormat.Appendable = apply(id)
    
    def f:((Long) => play.api.templates.HtmlFormat.Appendable) = (id) => apply(id)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/monthlyReports/showUploadPage.scala.html
                    HASH: 9d5bdf08f72e144702f80a2e3a276355af5b9926
                    MATRIX: 796->1|935->69|960->86|1119->10|1147->66|1176->214|1218->221|1230->225|1268->226|1542->464|1557->470|1599->490|1922->777|1937->783|1979->803|2207->995|2248->1027|2288->1029|2409->1114|2423->1119|2460->1134|2518->1161|2561->1169|2575->1175|2673->1264|2714->1266|3209->1725|3247->1747|3287->1749|3355->1781|3378->1782|3417->1785|3459->1805|3497->1807|3520->1808|3577->1833|4067->2287|4100->2304|4140->2306|4208->2338|4231->2339|4271->2343|4291->2354|4331->2372|4388->2397|6034->4011|6111->4051|6127->4057|6189->4096|6314->4189
                    LINES: 26->1|31->5|31->5|39->1|40->4|41->12|44->15|44->15|44->15|52->23|52->23|52->23|58->29|58->29|58->29|65->36|65->36|65->36|67->38|67->38|67->38|69->40|71->42|71->42|71->42|71->42|82->53|82->53|82->53|83->54|83->54|83->54|83->54|83->54|83->54|84->55|98->69|98->69|98->69|99->70|99->70|99->70|99->70|99->70|100->71|144->115|147->118|147->118|147->118|152->123
                    -- GENERATED --
                */
            