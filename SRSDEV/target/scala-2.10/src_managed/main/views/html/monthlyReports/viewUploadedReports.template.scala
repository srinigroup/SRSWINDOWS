
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
object viewUploadedReports extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Long,List[MonthlyReport],Integer,Integer,play.api.templates.HtmlFormat.Appendable] {

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
}};def /*32.2*/checkSelectedStore/*32.20*/(newSid:Long) = {{

	val result="selected"
		if( id != null ){
			
			if(newSid == id){
				result
			}
		}
}};def /*44.2*/checkSelected/*44.15*/(newMonth:Integer) = {{

	val result="selected"
		if(newMonth == month){
			result
		}
}};
Seq[Any](format.raw/*1.78*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*13.2*/("""

"""),format.raw/*30.2*/("""

"""),format.raw/*41.2*/("""


"""),format.raw/*50.2*/("""

"""),_display_(Seq[Any](/*52.2*/main/*52.6*/{_display_(Seq[Any](format.raw/*52.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*60.24*/routes/*60.30*/.Application.index())),format.raw/*60.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">MONTHLY REPORTS</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*66.27*/routes/*66.33*/.Application.index())),format.raw/*66.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*73.12*/if(flash.containsKey("success"))/*73.44*/ {_display_(Seq[Any](format.raw/*73.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*75.39*/flash/*75.44*/.get("success"))),format.raw/*75.59*/("""
		        </div>
		    """)))})),format.raw/*77.8*/(""" 
	
	"""),_display_(Seq[Any](/*79.3*/helper/*79.9*/.form(action = routes.MonthlyReports.getUploadedReports())/*79.67*/ {_display_(Seq[Any](format.raw/*79.69*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
  						
  						<td>
            				<div class="clearfix" id="storeId_field">
								<label for="storeId">Select Store</label>
									<div class="input">
										<select name="storeId" id="invoiceStoreList" required>
						            		<option class="blank" value="">-- Choose a Store --</option>
						  					"""),_display_(Seq[Any](/*91.15*/for(store <- Stores.getStoresList()) yield /*91.51*/{_display_(Seq[Any](format.raw/*91.52*/("""
						  						<option value=""""),_display_(Seq[Any](/*92.31*/store/*92.36*/.id)),format.raw/*92.39*/("""" """),_display_(Seq[Any](/*92.42*/checkSelectedStore(store.id))),format.raw/*92.70*/(""">"""),_display_(Seq[Any](/*92.72*/store/*92.77*/.name)),format.raw/*92.82*/("""</option>
						  					""")))})),format.raw/*93.15*/("""
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	
					  	<td>
            				<div class="clearfix" id="reportingYear_field">
								<label for="reportingYear">Year</label>
									<div class="input">
										<select name="reportingYear" required>
						            		<option class="blank" value="">-- Choose a Year --</option>
						            		"""),_display_(Seq[Any](/*106.22*/for(i <- 2014 to 2025) yield /*106.44*/ {_display_(Seq[Any](format.raw/*106.46*/("""
						  						<option value=""""),_display_(Seq[Any](/*107.31*/i)),format.raw/*107.32*/("""" """),_display_(Seq[Any](/*107.35*/checkSelectedYear(i))),format.raw/*107.55*/(""">"""),_display_(Seq[Any](/*107.57*/i)),format.raw/*107.58*/("""</option>
						  					""")))})),format.raw/*108.15*/("""
						  					
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
						  					"""),_display_(Seq[Any](/*122.15*/for(i <- 0 to 11) yield /*122.32*/ {_display_(Seq[Any](format.raw/*122.34*/("""
						  						<option value=""""),_display_(Seq[Any](/*123.31*/i)),format.raw/*123.32*/("""" """),_display_(Seq[Any](/*123.35*/checkSelected(i))),format.raw/*123.51*/(""">"""),_display_(Seq[Any](/*123.53*/Application/*123.64*/.getMonthForInt(i))),format.raw/*123.82*/("""</option>
						  					""")))})),format.raw/*124.15*/("""
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
		
	""")))})),format.raw/*140.3*/(""" <!-- form ends -->
	
		<!-- display list based on selected date -->
		
			"""),_display_(Seq[Any](/*144.5*/if(reportList.size() == 0)/*144.31*/ {_display_(Seq[Any](format.raw/*144.33*/("""
        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*150.9*/else/*150.14*/{_display_(Seq[Any](format.raw/*150.15*/("""
		        <div class="table-responsive">
		        	<table class="table table-hover  table-striped"  style="background-color: beige;">
		        		<thead style="background-color: gainsboro;">
		                <tr>
		                    <th>File Name</th>
		                    
		                    <th>Uploaded Date</th>
		                    
		                    <th>Report Type</th>
		                    
		                    <th>Month</th>
		                    
		                    <th>Store</th>
		                    
		                </tr>
		            </thead>
		            <tbody>
		
		                """),_display_(Seq[Any](/*169.20*/for(report <- reportList) yield /*169.45*/ {_display_(Seq[Any](format.raw/*169.47*/("""
		                    <tr>
		                        """),format.raw/*171.206*/("""
		                        <td><a href=""""),_display_(Seq[Any](/*172.41*/routes/*172.47*/.Application.checkUrl(report.filePath))),format.raw/*172.85*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*172.115*/report/*172.121*/.fileName)),format.raw/*172.130*/("""" onclick="OpenFancyBoxForJustView('"""),_display_(Seq[Any](/*172.167*/report/*172.173*/.id)),format.raw/*172.176*/("""');">"""),_display_(Seq[Any](/*172.182*/report/*172.188*/.fileName)),format.raw/*172.197*/("""</a></td>
		                        <td>"""),_display_(Seq[Any](/*173.32*/report/*173.38*/.uploadedDate)),format.raw/*173.51*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*174.32*/report/*174.38*/.reportType)),format.raw/*174.49*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*175.32*/report/*175.38*/.reportingMonth)),format.raw/*175.53*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*176.32*/Store/*176.37*/.find.byId(report.storeId))),format.raw/*176.63*/("""</td>
		                    </tr>
		                """)))})),format.raw/*178.20*/("""
		
		            </tbody>
		         </table>
		       </div>
		        
		    """)))})),format.raw/*184.8*/("""
	
		</div>
	</div>
	
""")))})),format.raw/*189.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(id:Long,reportList:List[MonthlyReport],month:Integer,year:Integer): play.api.templates.HtmlFormat.Appendable = apply(id,reportList,month,year)
    
    def f:((Long,List[MonthlyReport],Integer,Integer) => play.api.templates.HtmlFormat.Appendable) = (id,reportList,month,year) => apply(id,reportList,month,year)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:19:37 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/monthlyReports/viewUploadedReports.scala.html
                    HASH: faaacb74b73c0804633c8413d0ca84bbeac545f8
                    MATRIX: 837->1|1043->136|1068->153|1270->346|1296->363|1522->579|1549->597|1681->721|1703->734|1827->77|1855->133|1884->341|1915->574|1946->714|1979->828|2019->833|2031->837|2069->838|2343->1076|2358->1082|2400->1102|2723->1389|2738->1395|2780->1415|3008->1607|3049->1639|3089->1641|3210->1726|3224->1731|3261->1746|3319->1773|3362->1781|3376->1787|3443->1845|3483->1847|3994->2322|4046->2358|4085->2359|4153->2391|4167->2396|4192->2399|4231->2402|4281->2430|4319->2432|4333->2437|4360->2442|4417->2467|4894->2907|4933->2929|4974->2931|5043->2963|5067->2964|5107->2967|5150->2987|5189->2989|5213->2990|5271->3015|5762->3469|5796->3486|5837->3488|5906->3520|5930->3521|5970->3524|6009->3540|6048->3542|6069->3553|6110->3571|6168->3596|6554->3950|6670->4030|6706->4056|6747->4058|6888->4181|6902->4186|6942->4187|7623->4831|7665->4856|7706->4858|7792->5093|7871->5135|7887->5141|7948->5179|8016->5209|8033->5215|8066->5224|8141->5261|8158->5267|8185->5270|8229->5276|8246->5282|8279->5291|8358->5333|8374->5339|8410->5352|8485->5390|8501->5396|8535->5407|8610->5445|8626->5451|8664->5466|8739->5504|8754->5509|8803->5535|8891->5590|9010->5677|9070->5705
                    LINES: 26->1|31->5|31->5|39->15|39->15|54->32|54->32|63->44|63->44|70->1|71->4|72->13|74->30|76->41|79->50|81->52|81->52|81->52|89->60|89->60|89->60|95->66|95->66|95->66|102->73|102->73|102->73|104->75|104->75|104->75|106->77|108->79|108->79|108->79|108->79|120->91|120->91|120->91|121->92|121->92|121->92|121->92|121->92|121->92|121->92|121->92|122->93|135->106|135->106|135->106|136->107|136->107|136->107|136->107|136->107|136->107|137->108|151->122|151->122|151->122|152->123|152->123|152->123|152->123|152->123|152->123|152->123|153->124|169->140|173->144|173->144|173->144|179->150|179->150|179->150|198->169|198->169|198->169|200->171|201->172|201->172|201->172|201->172|201->172|201->172|201->172|201->172|201->172|201->172|201->172|201->172|202->173|202->173|202->173|203->174|203->174|203->174|204->175|204->175|204->175|205->176|205->176|205->176|207->178|213->184|218->189
                    -- GENERATED --
                */
            