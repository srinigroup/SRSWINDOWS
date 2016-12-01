
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
object showUploadedReports extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Long,List[MonthlyReport],Integer,Integer,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id:Long, reportList : List[MonthlyReport], month : Integer, year : Integer):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*5.2*/currentDateFormat/*5.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};def /*15.2*/checkSelectedYear/*15.19*/(newYear:Integer) = {{

	val result="selected"
	if(year == null){
		if(Calendar.getInstance().get(Calendar.YEAR) == newYear){
		
			result
		}
	}else{
	
		if(newYear == year){
		
			result
		}
	}
}};def /*32.2*/checkSelected/*32.15*/(newMonth:Integer) = {{

	val result="selected"
		if(newMonth == month){
			result
		}
}};
Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*30.2*/("""

"""),format.raw/*38.2*/("""

"""),_display_(Seq[Any](/*40.2*/main/*40.6*/{_display_(Seq[Any](format.raw/*40.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*48.24*/routes/*48.30*/.Application.index())),format.raw/*48.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						<a href=""""),_display_(Seq[Any](/*49.24*/routes/*49.30*/.MonthlyReports.showUploadPage())),format.raw/*49.62*/("""" class="btn btn-default">Monthly Reports</a>
            				<a href="#" class="btn btn-default">UPLOADED</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*55.27*/routes/*55.33*/.MonthlyReports.showUploadPage())),format.raw/*55.65*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*62.12*/if(flash.containsKey("success"))/*62.44*/ {_display_(Seq[Any](format.raw/*62.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*64.39*/flash/*64.44*/.get("success"))),format.raw/*64.59*/("""
		        </div>
		    """)))})),format.raw/*66.8*/(""" 
	
	"""),_display_(Seq[Any](/*68.3*/helper/*68.9*/.form(action = routes.MonthlyReports.displayUploaded(id))/*68.66*/ {_display_(Seq[Any](format.raw/*68.68*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
  						<td>
            				<div class="clearfix" id="reportingYear_field">
								<label for="reportingYear">Year</label>
									<div class="input">
										<select name="reportingYear" required>
						            		<option class="blank" value="">-- Choose a Year --</option>
						            		"""),_display_(Seq[Any](/*79.22*/for(i <- 2014 to 2025) yield /*79.44*/ {_display_(Seq[Any](format.raw/*79.46*/("""
						  						<option value=""""),_display_(Seq[Any](/*80.31*/i)),format.raw/*80.32*/("""" """),_display_(Seq[Any](/*80.35*/checkSelectedYear(i))),format.raw/*80.55*/(""">"""),_display_(Seq[Any](/*80.57*/i)),format.raw/*80.58*/("""</option>
						  					""")))})),format.raw/*81.15*/("""
						  					
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
						  					"""),_display_(Seq[Any](/*95.15*/for(i <- 0 to 11) yield /*95.32*/ {_display_(Seq[Any](format.raw/*95.34*/("""
						  						<option value=""""),_display_(Seq[Any](/*96.31*/i)),format.raw/*96.32*/("""" """),_display_(Seq[Any](/*96.35*/checkSelected(i))),format.raw/*96.51*/(""">"""),_display_(Seq[Any](/*96.53*/Application/*96.64*/.getMonthForInt(i))),format.raw/*96.82*/("""</option>
						  					""")))})),format.raw/*97.15*/("""
						  				</select> 
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>

						
					  	<td>
            					<input type="submit" value="Get Uploaded Reports" class="btn btn-primary" style="margin-top:7px">
					  	</td>
					  	
            		</tr>
            	</table>
         	</div>
		
	""")))})),format.raw/*113.3*/(""" <!-- form ends -->
	
		<!-- display list based on selected date -->
		
			"""),_display_(Seq[Any](/*117.5*/if(reportList.size() == 0)/*117.31*/ {_display_(Seq[Any](format.raw/*117.33*/("""
        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*123.9*/else/*123.14*/{_display_(Seq[Any](format.raw/*123.15*/("""
		        <div class="table-responsive">
		        	<table class="table table-hover  table-striped"  style="background-color: beige;">
		        		<thead style="background-color: gainsboro;">
		                <tr>
		                    <th>File Name</th>
		                    
		                    <th>Uploaded Date</th>
		                    
		                    <th>Report Type</th>
		                    
		                    <th>Month</th>
		                    
		                </tr>
		            </thead>
		            <tbody>
		
		                """),_display_(Seq[Any](/*140.20*/for(report <- reportList) yield /*140.45*/ {_display_(Seq[Any](format.raw/*140.47*/("""
		                    <tr>
		                        """),format.raw/*142.206*/("""
		                         <td><a href=""""),_display_(Seq[Any](/*143.42*/routes/*143.48*/.Application.checkUrl(report.filePath))),format.raw/*143.86*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*143.116*/report/*143.122*/.fileName)),format.raw/*143.131*/("""" onclick="OpenFancyBoxForJustView('"""),_display_(Seq[Any](/*143.168*/report/*143.174*/.id)),format.raw/*143.177*/("""');">"""),_display_(Seq[Any](/*143.183*/report/*143.189*/.fileName)),format.raw/*143.198*/("""</a></td>
		                        <td>"""),_display_(Seq[Any](/*144.32*/report/*144.38*/.uploadedDate)),format.raw/*144.51*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*145.32*/report/*145.38*/.reportType)),format.raw/*145.49*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*146.32*/report/*146.38*/.reportingMonth)),format.raw/*146.53*/("""</td>
		                    </tr>
		                """)))})),format.raw/*148.20*/("""
		
		            </tbody>
		         </table>
		       </div>
		        
		    """)))})),format.raw/*154.8*/("""
	
		</div>
	</div>
	
""")))})),format.raw/*159.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(id:Long,reportList:List[MonthlyReport],month:Integer,year:Integer): play.api.templates.HtmlFormat.Appendable = apply(id,reportList,month,year)
    
    def f:((Long,List[MonthlyReport],Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (id,reportList,month,year) => apply(id,reportList,month,year)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:19:37 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/monthlyReports/showUploadedReports.scala.html
                    HASH: 89863fef18f24f62ebbd0050ab17547c14634621
                    MATRIX: 837->1|1043->136|1068->153|1270->346|1296->363|1522->579|1544->592|1668->77|1696->133|1725->341|1756->574|1787->686|1827->691|1839->695|1877->696|2151->934|2166->940|2208->960|2324->1040|2339->1046|2393->1078|2699->1348|2714->1354|2768->1386|2996->1578|3037->1610|3077->1612|3198->1697|3212->1702|3249->1717|3307->1744|3350->1752|3364->1758|3430->1815|3470->1817|3965->2276|4003->2298|4043->2300|4111->2332|4134->2333|4173->2336|4215->2356|4253->2358|4276->2359|4333->2384|4823->2838|4856->2855|4896->2857|4964->2889|4987->2890|5026->2893|5064->2909|5102->2911|5122->2922|5162->2940|5219->2965|5605->3319|5721->3399|5757->3425|5798->3427|5939->3550|5953->3555|5993->3556|6612->4138|6654->4163|6695->4165|6781->4400|6861->4443|6877->4449|6938->4487|7006->4517|7023->4523|7056->4532|7131->4569|7148->4575|7175->4578|7219->4584|7236->4590|7269->4599|7348->4641|7364->4647|7400->4660|7475->4698|7491->4704|7525->4715|7600->4753|7616->4759|7654->4774|7742->4829|7861->4916|7921->4944
                    LINES: 26->1|31->5|31->5|39->15|39->15|54->32|54->32|61->1|62->4|63->13|65->30|67->38|69->40|69->40|69->40|77->48|77->48|77->48|78->49|78->49|78->49|84->55|84->55|84->55|91->62|91->62|91->62|93->64|93->64|93->64|95->66|97->68|97->68|97->68|97->68|108->79|108->79|108->79|109->80|109->80|109->80|109->80|109->80|109->80|110->81|124->95|124->95|124->95|125->96|125->96|125->96|125->96|125->96|125->96|125->96|126->97|142->113|146->117|146->117|146->117|152->123|152->123|152->123|169->140|169->140|169->140|171->142|172->143|172->143|172->143|172->143|172->143|172->143|172->143|172->143|172->143|172->143|172->143|172->143|173->144|173->144|173->144|174->145|174->145|174->145|175->146|175->146|175->146|177->148|183->154|188->159
                    -- GENERATED --
                */
            