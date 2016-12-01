
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
object listForHeadOffice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[com.avaje.ebean.Page[Timesheet],String,String,String,Store,String,play.api.templates.HtmlFormat.Appendable] {

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
    routes.Timesheets.listForHeadOffice(newPage, sortBy, order, currentFilter, pageAction)
    
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
            				<a href=""""),_display_(Seq[Any](/*70.27*/routes/*70.33*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*70.80*/("""" class="btn btn-default">TIMESHEET</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*71.54*/pageAction)),format.raw/*71.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*76.27*/routes/*76.33*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*76.80*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
          <a href=""""),_display_(Seq[Any](/*100.21*/routes/*100.27*/.Timesheets.showSelectPageForSK(store.id))),format.raw/*100.68*/("""" class="pull-right btn btn-primary" style="display:none">View Weekly Timesheet</a>
    </div>
    <br/>
    <br/>
    """),_display_(Seq[Any](/*104.6*/if(currentPage.getTotalRowCount == 0)/*104.43*/ {_display_(Seq[Any](format.raw/*104.45*/("""
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*109.7*/else/*109.12*/{_display_(Seq[Any](format.raw/*109.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
				    """),_display_(Seq[Any](/*114.10*/header("date", "Timesheet Date "))),format.raw/*114.43*/("""
				  
				    """),_display_(Seq[Any](/*116.10*/header("duration", "Timesheet Duration"))),format.raw/*116.50*/("""
				    
				    """),_display_(Seq[Any](/*118.10*/header("empid", "Employee"))),format.raw/*118.37*/("""
				        
				    """),_display_(Seq[Any](/*120.10*/header("jobTitle", "Job Title"))),format.raw/*120.41*/("""
				    
					"""),_display_(Seq[Any](/*122.7*/header("status", "Status"))),format.raw/*122.33*/("""
					
                </tr>
            </thead>
            <tbody>
                """),_display_(Seq[Any](/*127.18*/for(timesheet <- currentPage.getList) yield /*127.55*/ {_display_(Seq[Any](format.raw/*127.57*/("""
									  
					<tr>
						<!-- make sure add flash variable pageAction -->
						"""),_display_(Seq[Any](/*131.8*/if(timesheet.status.equals("SUBMITTED") || timesheet.status.equals("APPROVED"))/*131.87*/{_display_(Seq[Any](format.raw/*131.88*/("""
							<td><a href=""""),_display_(Seq[Any](/*132.22*/routes/*132.28*/.Timesheets.editFormForHeadOffice(timesheet.id,store.id,flash.get("pageAction")))),format.raw/*132.108*/("""">"""),_display_(Seq[Any](/*132.111*/currentDateFormat(timesheet.date))),format.raw/*132.144*/("""</a></td>	
						""")))})),format.raw/*133.8*/("""
						"""),_display_(Seq[Any](/*134.8*/if(timesheet.status.equals("REJECTED"))/*134.47*/{_display_(Seq[Any](format.raw/*134.48*/("""
							<td><a href=""""),_display_(Seq[Any](/*135.22*/routes/*135.28*/.Timesheets.editFormForHeadOfficeRejectedTimesheetList(timesheet.id,timesheet.empid,store.id,flash.get("pageAction")))),format.raw/*135.145*/("""">"""),_display_(Seq[Any](/*135.148*/currentDateFormat(timesheet.date))),format.raw/*135.181*/("""</a></td>
						""")))})),format.raw/*136.8*/("""
						"""),_display_(Seq[Any](/*137.8*/if(timesheet.leaveType == "None")/*137.41*/{_display_(Seq[Any](format.raw/*137.42*/("""
							<td>"""),_display_(Seq[Any](/*138.13*/timesheet/*138.22*/.duration)),format.raw/*138.31*/("""</td>
						""")))})),format.raw/*139.8*/("""		
						"""),_display_(Seq[Any](/*140.8*/if(timesheet.leaveType != "None")/*140.41*/{_display_(Seq[Any](format.raw/*140.42*/("""
							<td>Leave</td>
						""")))})),format.raw/*142.8*/("""			
						<td>"""),_display_(Seq[Any](/*143.12*/Employee/*143.20*/.getEmployee(timesheet.empid))),format.raw/*143.49*/("""</td>		
							
						<td>"""),_display_(Seq[Any](/*145.12*/timesheet/*145.21*/.jobTitle)),format.raw/*145.30*/("""</td>	
						"""),_display_(Seq[Any](/*146.8*/if(timesheet.status.equals("REJECTED"))/*146.47*/{_display_(Seq[Any](format.raw/*146.48*/("""
							<td style="color:red;">"""),_display_(Seq[Any](/*147.32*/timesheet/*147.41*/.status)),format.raw/*147.48*/("""</td>
						""")))})),format.raw/*148.8*/("""
						"""),_display_(Seq[Any](/*149.8*/if((timesheet.status.equals("APPROVED")))/*149.49*/{_display_(Seq[Any](format.raw/*149.50*/("""
							<td style="color:green;">"""),_display_(Seq[Any](/*150.34*/timesheet/*150.43*/.status)),format.raw/*150.50*/("""</td>	
						""")))})),format.raw/*151.8*/("""
						"""),_display_(Seq[Any](/*152.8*/if(timesheet.status.equals("SUBMITTED"))/*152.48*/{_display_(Seq[Any](format.raw/*152.49*/("""
							<td style="color:blue;">"""),_display_(Seq[Any](/*153.33*/timesheet/*153.42*/.status)),format.raw/*153.49*/("""</td>
						""")))})),format.raw/*154.8*/("""
						
					</tr>
					
					""")))})),format.raw/*158.7*/("""

            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*166.18*/if(currentPage.hasPrev)/*166.41*/ {_display_(Seq[Any](format.raw/*166.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*168.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*168.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*170.19*/else/*170.24*/{_display_(Seq[Any](format.raw/*170.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*174.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*176.36*/currentPage/*176.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*176.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*178.18*/if(currentPage.hasNext)/*178.41*/ {_display_(Seq[Any](format.raw/*178.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*180.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*180.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*182.19*/else/*182.24*/{_display_(Seq[Any](format.raw/*182.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*186.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*190.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*195.2*/("""

  """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Timesheet],currentSortBy:String,currentOrder:String,currentFilter:String,store:Store,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def f:((com.avaje.ebean.Page[Timesheet],String,String,String,Store,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:12 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/timesheets/listForHeadOffice.scala.html
                    HASH: 9c7b36565e474d086f5083a200cf5847fd0f1339
                    MATRIX: 856->1|1081->1298|1095->1304|1206->1334|1260->1352|1272->1355|1311->1372|1356->1381|1390->1407|1478->1471|1536->1493|1570->1505|1609->1508|1636->1513|1676->284|1687->288|2247->839|2269->852|2398->972|2424->989|2643->148|2676->281|2705->834|2736->967|2767->1177|2803->1295|2832->1531|2872->1536|2884->1540|2923->1542|3201->1784|3216->1790|3258->1810|3377->1893|3392->1899|3461->1946|3591->2040|3623->2050|3822->2213|3837->2219|3906->2266|4123->2448|4164->2480|4204->2482|4321->2563|4335->2568|4372->2583|4426->2606|4525->2669|4562->2684|4786->2871|4822->2884|4934->2960|4966->2970|5163->3130|5179->3136|5243->3177|5403->3301|5450->3338|5491->3340|5612->3443|5626->3448|5666->3449|5925->3671|5981->3704|6037->3723|6100->3763|6158->3784|6208->3811|6270->3836|6324->3867|6378->3885|6427->3911|6556->4003|6610->4040|6651->4042|6776->4131|6865->4210|6905->4211|6965->4234|6981->4240|7085->4320|7126->4323|7183->4356|7234->4375|7279->4384|7328->4423|7368->4424|7428->4447|7444->4453|7585->4570|7626->4573|7683->4606|7733->4624|7778->4633|7821->4666|7861->4667|7912->4681|7931->4690|7963->4699|8009->4713|8056->4724|8099->4757|8139->4758|8203->4790|8256->4806|8274->4814|8326->4843|8392->4872|8411->4881|8443->4890|8494->4905|8543->4944|8583->4945|8653->4978|8672->4987|8702->4994|8748->5008|8793->5017|8844->5058|8884->5059|8956->5094|8975->5103|9005->5110|9052->5125|9097->5134|9147->5174|9187->5175|9258->5209|9277->5218|9307->5225|9353->5239|9420->5274|9599->5416|9632->5439|9673->5441|9789->5520|9852->5560|9939->5628|9953->5633|9993->5634|10172->5780|10284->5855|10305->5866|10361->5899|10444->5945|10477->5968|10518->5970|10630->6045|10693->6085|10776->6149|10790->6154|10830->6155|11001->6293|11085->6345|11161->6389
                    LINES: 26->1|28->55|28->55|30->55|31->56|31->56|31->56|31->56|31->56|31->56|32->57|32->57|32->57|32->57|34->7|34->7|55->30|55->30|63->40|63->40|72->1|75->6|76->28|78->38|80->48|84->54|85->59|87->61|87->61|87->61|95->69|95->69|95->69|96->70|96->70|96->70|97->71|97->71|102->76|102->76|102->76|111->85|111->85|111->85|113->87|113->87|113->87|115->89|119->93|119->93|121->95|121->95|122->96|122->96|126->100|126->100|126->100|130->104|130->104|130->104|135->109|135->109|135->109|140->114|140->114|142->116|142->116|144->118|144->118|146->120|146->120|148->122|148->122|153->127|153->127|153->127|157->131|157->131|157->131|158->132|158->132|158->132|158->132|158->132|159->133|160->134|160->134|160->134|161->135|161->135|161->135|161->135|161->135|162->136|163->137|163->137|163->137|164->138|164->138|164->138|165->139|166->140|166->140|166->140|168->142|169->143|169->143|169->143|171->145|171->145|171->145|172->146|172->146|172->146|173->147|173->147|173->147|174->148|175->149|175->149|175->149|176->150|176->150|176->150|177->151|178->152|178->152|178->152|179->153|179->153|179->153|180->154|184->158|192->166|192->166|192->166|194->168|194->168|196->170|196->170|196->170|200->174|202->176|202->176|202->176|204->178|204->178|204->178|206->180|206->180|208->182|208->182|208->182|212->186|216->190|221->195
                    -- GENERATED --
                */
            