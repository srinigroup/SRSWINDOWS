
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
object listForsk extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[com.avaje.ebean.Page[Timesheet],String,String,String,Store,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Timesheet], currentSortBy: String, currentOrder: String, currentFilter: String, store:Store, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*47.2*/header/*47.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*47.38*/("""
    <th class=""""),_display_(Seq[Any](/*48.17*/key/*48.20*/.replace(".","_"))),format.raw/*48.37*/(""" header """),_display_(Seq[Any](/*48.46*/if(currentSortBy == key){/*48.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*48.136*/("""">
        <a href=""""),_display_(Seq[Any](/*49.19*/link(0, key))),format.raw/*49.31*/("""">"""),_display_(Seq[Any](/*49.34*/title)),format.raw/*49.39*/("""</a>
    </th>
""")))};def /*7.2*/link/*7.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Timesheets.listForsk(newPage, sortBy, order, currentFilter, pageAction)
    
}};def /*32.2*/currentDateFormat/*32.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.149*/("""


"""),format.raw/*6.42*/("""
"""),format.raw/*28.2*/("""



"""),format.raw/*40.2*/("""



"""),format.raw/*46.37*/("""
"""),format.raw/*51.2*/("""

  
"""),_display_(Seq[Any](/*54.2*/main/*54.6*/ {_display_(Seq[Any](format.raw/*54.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*62.24*/routes/*62.30*/.Application.index())),format.raw/*62.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*63.27*/routes/*63.33*/.Application.showOptions("EMP TIMESHEET","ALL"))),format.raw/*63.80*/("""" class="btn btn-default">EMP TIMESHEET</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*64.54*/pageAction)),format.raw/*64.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*69.27*/routes/*69.33*/.Application.showOptions("EMP TIMESHEET","ALL"))),format.raw/*69.80*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*78.6*/if(flash.containsKey("success"))/*78.38*/ {_display_(Seq[Any](format.raw/*78.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*80.37*/flash/*80.42*/.get("success"))),format.raw/*80.57*/("""
        </div>
    """)))})),format.raw/*82.6*/(""" 

     <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*86.24*/link(0, "todayDate"))),format.raw/*86.44*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="text" class="datepicker1" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*88.84*/currentFilter)),format.raw/*88.97*/("""" readonly='readonly' >
          	<input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*89.52*/pageAction)),format.raw/*89.62*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by date" class="btn btn-info">
            </p>
          </form> 
    </div>
    
    """),_display_(Seq[Any](/*95.6*/if(currentPage.getTotalRowCount == 0)/*95.43*/ {_display_(Seq[Any](format.raw/*95.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*101.7*/else/*101.12*/{_display_(Seq[Any](format.raw/*101.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    """),_display_(Seq[Any](/*106.22*/header("date", "Timesheet Date "))),format.raw/*106.55*/("""
                  
                    """),_display_(Seq[Any](/*108.22*/header("duration", "Timesheet Duration"))),format.raw/*108.62*/("""
                    
                    """),_display_(Seq[Any](/*110.22*/header("empid", "Employee"))),format.raw/*110.49*/("""
                    
                  
                      
                    """),_display_(Seq[Any](/*114.22*/header("jobTitle", "Job Title"))),format.raw/*114.53*/("""
                   
                     """),_display_(Seq[Any](/*116.23*/header("status", "Status"))),format.raw/*116.49*/("""
                    
                </tr>
            </thead>
            <tbody>
                """),_display_(Seq[Any](/*121.18*/for(timesheet <- currentPage.getList) yield /*121.55*/ {_display_(Seq[Any](format.raw/*121.57*/("""
									  
					<tr>
						<!-- make sure add flash variable pageAction -->
						<td><a href=""""),_display_(Seq[Any](/*125.21*/routes/*125.27*/.Timesheets.editForsk(timesheet.id,store.id,flash.get("pageAction")))),format.raw/*125.95*/("""">"""),_display_(Seq[Any](/*125.98*/currentDateFormat(timesheet.date))),format.raw/*125.131*/("""</a></td>	
						<td>"""),_display_(Seq[Any](/*126.12*/timesheet/*126.21*/.duration)),format.raw/*126.30*/("""</td>					
						<td>"""),_display_(Seq[Any](/*127.12*/Employee/*127.20*/.getEmployee(timesheet.empid))),format.raw/*127.49*/("""</td>		
							
						<td>"""),_display_(Seq[Any](/*129.12*/timesheet/*129.21*/.jobTitle)),format.raw/*129.30*/("""</td>		
						<td>"""),_display_(Seq[Any](/*130.12*/timesheet/*130.21*/.status)),format.raw/*130.28*/("""</td>	
									
					</tr>
					
					""")))})),format.raw/*134.7*/("""

            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*142.18*/if(currentPage.hasPrev)/*142.41*/ {_display_(Seq[Any](format.raw/*142.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*144.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*144.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*146.19*/else/*146.24*/{_display_(Seq[Any](format.raw/*146.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*150.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*152.36*/currentPage/*152.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*152.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*154.18*/if(currentPage.hasNext)/*154.41*/ {_display_(Seq[Any](format.raw/*154.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*156.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*156.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*158.19*/else/*158.24*/{_display_(Seq[Any](format.raw/*158.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*162.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*166.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*171.2*/("""

  """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Timesheet],currentSortBy:String,currentOrder:String,currentFilter:String,store:Store,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def f:((com.avaje.ebean.Page[Timesheet],String,String,String,Store,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:12 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/listForsk.scala.html
                    HASH: 0b184beff41b217eeb6546ec3d597c30c6ebf72e
                    MATRIX: 848->1|1073->1161|1087->1167|1198->1197|1252->1215|1264->1218|1303->1235|1348->1244|1382->1270|1470->1334|1528->1356|1562->1368|1601->1371|1628->1376|1668->284|1679->288|2231->835|2257->852|2476->148|2509->281|2538->826|2573->1040|2609->1158|2638->1394|2682->1403|2694->1407|2733->1409|3011->1651|3026->1657|3068->1677|3187->1760|3202->1766|3271->1813|3405->1911|3437->1921|3636->2084|3651->2090|3720->2137|3937->2319|3978->2351|4018->2353|4135->2434|4149->2439|4186->2454|4240->2477|4339->2540|4381->2560|4575->2718|4610->2731|4722->2807|4754->2817|4952->2980|4998->3017|5038->3019|5169->3132|5183->3137|5223->3138|5494->3372|5550->3405|5630->3448|5693->3488|5775->3533|5825->3560|5951->3649|6005->3680|6087->3725|6136->3751|6280->3858|6334->3895|6375->3897|6514->3999|6530->4005|6621->4073|6661->4076|6718->4109|6778->4132|6797->4141|6829->4150|6889->4173|6907->4181|6959->4210|7025->4239|7044->4248|7076->4257|7133->4277|7152->4286|7182->4293|7258->4337|7437->4479|7470->4502|7511->4504|7627->4583|7690->4623|7777->4691|7791->4696|7831->4697|8010->4843|8122->4918|8143->4929|8199->4962|8282->5008|8315->5031|8356->5033|8468->5108|8531->5148|8614->5212|8628->5217|8668->5218|8839->5356|8923->5408|8999->5452
                    LINES: 26->1|28->47|28->47|30->47|31->48|31->48|31->48|31->48|31->48|31->48|32->49|32->49|32->49|32->49|34->7|34->7|55->32|55->32|64->1|67->6|68->28|72->40|76->46|77->51|80->54|80->54|80->54|88->62|88->62|88->62|89->63|89->63|89->63|90->64|90->64|95->69|95->69|95->69|104->78|104->78|104->78|106->80|106->80|106->80|108->82|112->86|112->86|114->88|114->88|115->89|115->89|121->95|121->95|121->95|127->101|127->101|127->101|132->106|132->106|134->108|134->108|136->110|136->110|140->114|140->114|142->116|142->116|147->121|147->121|147->121|151->125|151->125|151->125|151->125|151->125|152->126|152->126|152->126|153->127|153->127|153->127|155->129|155->129|155->129|156->130|156->130|156->130|160->134|168->142|168->142|168->142|170->144|170->144|172->146|172->146|172->146|176->150|178->152|178->152|178->152|180->154|180->154|180->154|182->156|182->156|184->158|184->158|184->158|188->162|192->166|197->171
                    -- GENERATED --
                */
            