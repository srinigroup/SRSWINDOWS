
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[com.avaje.ebean.Page[Timesheet],String,String,String,Store,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Timesheet], currentSortBy: String, currentOrder: String, currentFilter: String, store:Store, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*55.2*/header/*55.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*55.38*/("""
    <th class=""""),_display_(Seq[Any](/*56.17*/key/*56.20*/.replace(".","_"))),format.raw/*56.37*/(""" header """),_display_(Seq[Any](/*56.46*/if(currentSortBy == key){/*56.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*56.136*/("""">
        <a href=""""),_display_(Seq[Any](/*57.19*/link(0, key))),format.raw/*57.31*/("""">"""),_display_(Seq[Any](/*57.34*/title)),format.raw/*57.39*/("""</a>
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
    routes.Timesheets.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};def /*30.2*/checkSelected/*30.15*/(newFilter:String) = {{

	var result=""
 if(currentFilter == newFilter){
	result="selected"
 }
 	result
 
}};def /*40.2*/currentDateFormat/*40.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.149*/("""


"""),format.raw/*6.42*/("""
"""),format.raw/*28.2*/("""

"""),format.raw/*38.2*/("""

"""),format.raw/*48.2*/("""



"""),format.raw/*54.37*/("""
"""),format.raw/*59.2*/("""

"""),_display_(Seq[Any](/*61.2*/main/*61.6*/ {_display_(Seq[Any](format.raw/*61.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*69.24*/routes/*69.30*/.Application.index())),format.raw/*69.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*70.27*/routes/*70.33*/.Application.showOptions("TIMESHEET","ALL"))),format.raw/*70.76*/("""" class="btn btn-default">TIMESHEET</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*71.54*/pageAction)),format.raw/*71.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*76.27*/routes/*76.33*/.Application.showOptions("TIMESHEET","ALL"))),format.raw/*76.76*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*85.6*/if(flash.containsKey("success"))/*85.38*/ {_display_(Seq[Any](format.raw/*85.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*87.37*/flash/*87.42*/.get("success"))),format.raw/*87.57*/("""
        </div>
    """)))})),format.raw/*89.6*/(""" 

     <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*93.24*/link(0, "date"))),format.raw/*93.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="text" class="datepicker1" id="searchbox" name="f" placeholder="Filter By date" value=""""),_display_(Seq[Any](/*95.113*/currentFilter)),format.raw/*95.126*/("""" readonly='readonly' >
          	<input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*96.52*/pageAction)),format.raw/*96.62*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by date" class="btn btn-info">
            </p>
          </form> 
          <a href=""""),_display_(Seq[Any](/*100.21*/routes/*100.27*/.Timesheets.showSelectPageForSK(store.id))),format.raw/*100.68*/("""" class="pull-right btn btn-primary">View Weekly Timesheet</a>
    </div>
    
    
    """),_display_(Seq[Any](/*104.6*/if(currentPage.getTotalRowCount == 0)/*104.43*/ {_display_(Seq[Any](format.raw/*104.45*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*109.7*/else/*109.12*/{_display_(Seq[Any](format.raw/*109.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    """),_display_(Seq[Any](/*114.22*/header("date", "Timesheet Date "))),format.raw/*114.55*/("""
                  
                    """),_display_(Seq[Any](/*116.22*/header("duration", "Timesheet Duration"))),format.raw/*116.62*/("""
                    
                    """),_display_(Seq[Any](/*118.22*/header("empid", "Employee"))),format.raw/*118.49*/("""
                        
                    """),_display_(Seq[Any](/*120.22*/header("jobTitle", "Job Title"))),format.raw/*120.53*/("""
                   
                     """),_display_(Seq[Any](/*122.23*/header("status", "Status"))),format.raw/*122.49*/("""
                    
                </tr>
            </thead>
            <tbody>
                """),_display_(Seq[Any](/*127.18*/for(timesheet <- currentPage.getList) yield /*127.55*/ {_display_(Seq[Any](format.raw/*127.57*/("""
									  
					<tr>
						<!-- make sure add flash variable pageAction -->
						<td><a href=""""),_display_(Seq[Any](/*131.21*/routes/*131.27*/.Timesheets.edit(timesheet.id,store.id,flash.get("pageAction")))),format.raw/*131.90*/("""">"""),_display_(Seq[Any](/*131.93*/currentDateFormat(timesheet.date))),format.raw/*131.126*/("""</a></td>	
						<td>"""),_display_(Seq[Any](/*132.12*/timesheet/*132.21*/.duration)),format.raw/*132.30*/("""</td>					
						<td>"""),_display_(Seq[Any](/*133.12*/Employee/*133.20*/.getEmployee(timesheet.empid))),format.raw/*133.49*/("""</td>		
							
						<td>"""),_display_(Seq[Any](/*135.12*/timesheet/*135.21*/.jobTitle)),format.raw/*135.30*/("""</td>		
						<td>"""),_display_(Seq[Any](/*136.12*/timesheet/*136.21*/.status)),format.raw/*136.28*/("""</td>	
									
					</tr>
					
					""")))})),format.raw/*140.7*/("""

            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*148.18*/if(currentPage.hasPrev)/*148.41*/ {_display_(Seq[Any](format.raw/*148.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*150.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*150.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*152.19*/else/*152.24*/{_display_(Seq[Any](format.raw/*152.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*156.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*158.36*/currentPage/*158.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*158.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*160.18*/if(currentPage.hasNext)/*160.41*/ {_display_(Seq[Any](format.raw/*160.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*162.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*162.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*164.19*/else/*164.24*/{_display_(Seq[Any](format.raw/*164.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*168.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*172.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*177.2*/("""

  """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Timesheet],currentSortBy:String,currentOrder:String,currentFilter:String,store:Store,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def f:((com.avaje.ebean.Page[Timesheet],String,String,String,Store,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/list.scala.html
                    HASH: 532d1eda84aaba71cc81e034327f4c64b7e52e0f
                    MATRIX: 843->1|1068->1285|1082->1291|1193->1321|1247->1339|1259->1342|1298->1359|1343->1368|1377->1394|1465->1458|1523->1480|1557->1492|1596->1495|1623->1500|1663->284|1674->288|2221->826|2243->839|2372->959|2398->976|2617->148|2650->281|2679->821|2710->954|2741->1164|2777->1282|2806->1518|2846->1523|2858->1527|2897->1529|3175->1771|3190->1777|3232->1797|3351->1880|3366->1886|3431->1929|3561->2023|3593->2033|3792->2196|3807->2202|3872->2245|4089->2427|4130->2459|4170->2461|4287->2542|4301->2547|4338->2562|4392->2585|4491->2648|4528->2663|4752->2850|4788->2863|4900->2939|4932->2949|5129->3109|5145->3115|5209->3156|5338->3249|5385->3286|5426->3288|5547->3391|5561->3396|5601->3397|5872->3631|5928->3664|6008->3707|6071->3747|6153->3792|6203->3819|6289->3868|6343->3899|6425->3944|6474->3970|6618->4077|6672->4114|6713->4116|6852->4218|6868->4224|6954->4287|6994->4290|7051->4323|7111->4346|7130->4355|7162->4364|7222->4387|7240->4395|7292->4424|7358->4453|7377->4462|7409->4471|7466->4491|7485->4500|7515->4507|7591->4551|7770->4693|7803->4716|7844->4718|7960->4797|8023->4837|8110->4905|8124->4910|8164->4911|8343->5057|8455->5132|8476->5143|8532->5176|8615->5222|8648->5245|8689->5247|8801->5322|8864->5362|8947->5426|8961->5431|9001->5432|9172->5570|9256->5622|9332->5666
                    LINES: 26->1|28->55|28->55|30->55|31->56|31->56|31->56|31->56|31->56|31->56|32->57|32->57|32->57|32->57|34->7|34->7|55->30|55->30|63->40|63->40|72->1|75->6|76->28|78->38|80->48|84->54|85->59|87->61|87->61|87->61|95->69|95->69|95->69|96->70|96->70|96->70|97->71|97->71|102->76|102->76|102->76|111->85|111->85|111->85|113->87|113->87|113->87|115->89|119->93|119->93|121->95|121->95|122->96|122->96|126->100|126->100|126->100|130->104|130->104|130->104|135->109|135->109|135->109|140->114|140->114|142->116|142->116|144->118|144->118|146->120|146->120|148->122|148->122|153->127|153->127|153->127|157->131|157->131|157->131|157->131|157->131|158->132|158->132|158->132|159->133|159->133|159->133|161->135|161->135|161->135|162->136|162->136|162->136|166->140|174->148|174->148|174->148|176->150|176->150|178->152|178->152|178->152|182->156|184->158|184->158|184->158|186->160|186->160|186->160|188->162|188->162|190->164|190->164|190->164|194->168|198->172|203->177
                    -- GENERATED --
                */
            