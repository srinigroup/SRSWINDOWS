
package views.html.shifts

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[com.avaje.ebean.Page[Shift],String,String,String,Store,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Shift], currentSortBy: String, currentOrder: String, currentFilter: String, store:Store, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*64.2*/header/*64.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*64.38*/("""
    <th class=""""),_display_(Seq[Any](/*65.17*/key/*65.20*/.replace(".","_"))),format.raw/*65.37*/(""" header """),_display_(Seq[Any](/*65.46*/if(currentSortBy == key){/*65.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*65.136*/("""">
        <a href=""""),_display_(Seq[Any](/*66.19*/link(0, key))),format.raw/*66.31*/("""">"""),_display_(Seq[Any](/*66.34*/title)),format.raw/*66.39*/("""</a>
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
    routes.Shifts.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};def /*30.2*/shiftlink/*30.11*/(storeId:Long, term_head:String) = {{
    
      // Generate the link
    routes.Shifts.showBlank(storeId, term_head,pageAction)
    
}};def /*38.2*/checkSelected/*38.15*/(newFilter:String) = {{

	var result=""
 if(currentFilter == newFilter){
	result="selected"
 }
 	result
 
}};def /*48.2*/display/*48.9*/() = {{

var result = "";

	
		if(Shifts.getOPENStatus()){
		   result = "disabled";
		}	
									  

result;
}};
Seq[Any](format.raw/*1.145*/("""


"""),format.raw/*6.42*/("""
"""),format.raw/*28.2*/("""

"""),format.raw/*35.2*/("""


"""),format.raw/*46.2*/("""

"""),format.raw/*59.2*/("""

"""),format.raw/*63.37*/("""
"""),format.raw/*68.2*/("""

"""),_display_(Seq[Any](/*70.2*/main/*70.6*/ {_display_(Seq[Any](format.raw/*70.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*78.24*/routes/*78.30*/.Application.index())),format.raw/*78.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*79.27*/routes/*79.33*/.Application.showOptions("SHIFT","ALL"))),format.raw/*79.72*/("""" class="btn btn-default">SHIFT</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*80.54*/pageAction)),format.raw/*80.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*85.27*/routes/*85.33*/.Application.showOptions("SHIFT","ALL"))),format.raw/*85.72*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*94.6*/if(flash.containsKey("success"))/*94.38*/ {_display_(Seq[Any](format.raw/*94.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*96.37*/flash/*96.42*/.get("success"))),format.raw/*96.57*/("""
        </div>
    """)))})),format.raw/*98.6*/(""" 
    
      """),_display_(Seq[Any](/*100.8*/if(flash.containsKey("ShiftErr"))/*100.41*/ {_display_(Seq[Any](format.raw/*100.43*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*102.37*/flash/*102.42*/.get("ShiftErr"))),format.raw/*102.58*/("""
        </div>
    """)))})),format.raw/*104.6*/(""" 

     <div id="actions">
        
        <table>
        	<tr>
        		<td> 
        			<form action=""""),_display_(Seq[Any](/*111.27*/link(0, "status"))),format.raw/*111.44*/("""" method="GET">
          				<p class="pull-left" style="padding-top:-10px">
      					<select name="f" id="searchbox">
			            	<option value="OPEN" """),_display_(Seq[Any](/*114.39*/checkSelected("OPEN"))),format.raw/*114.60*/(""">OPEN / SAVED</option>
			            	<option value="" """),_display_(Seq[Any](/*115.35*/checkSelected(""))),format.raw/*115.52*/(""">ALL</option>
			            	<option value="SUBMITTED" """),_display_(Seq[Any](/*116.44*/checkSelected("SUBMITTED"))),format.raw/*116.70*/(""">SUBMITTED</option>
            			</select>
            			<input type="submit" id="searchsubmit" value="Filter by Status" class="btn btn-info">
           				</p> 
       			 	</form>
        		</td>
        		
        	</tr>
        </table>
         
 </div>
    
    """),_display_(Seq[Any](/*128.6*/if(currentPage.getTotalRowCount == 0)/*128.43*/ {_display_(Seq[Any](format.raw/*128.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*134.7*/else/*134.12*/{_display_(Seq[Any](format.raw/*134.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    """),_display_(Seq[Any](/*139.22*/header("shiftStartDateTime", "Shift StartTime"))),format.raw/*139.69*/("""
                  
                    """),_display_(Seq[Any](/*141.22*/header("shiftEndDateTime", "Shift EndTime"))),format.raw/*141.65*/("""
                    
                    <th>Terminal</th>
                    
                    <th>Shift Sales</th>
                      
                   	<th>Media Collects</th>
                        
                    <th>Register Payouts</th>
                        
                    """),_display_(Seq[Any](/*151.22*/header("shiftVariance", "Variance"))),format.raw/*151.57*/("""
                        
                     <th>Shift Owner</th>
                      
                     """),_display_(Seq[Any](/*155.23*/header("status", "Status"))),format.raw/*155.49*/("""
                    
                </tr>
            </thead>
            <tbody>
                """),_display_(Seq[Any](/*160.18*/for(shift <- currentPage.getList) yield /*160.51*/ {_display_(Seq[Any](format.raw/*160.53*/("""
									  
					<tr>
						<td><a href=""""),_display_(Seq[Any](/*163.21*/routes/*163.27*/.Shifts.edit(shift.id,store.id,flash.get("pageAction")))),format.raw/*163.82*/("""">"""),_display_(Seq[Any](/*163.85*/shift/*163.90*/.shiftStartDateTime)),format.raw/*163.109*/("""</a></td>
											
						<td>"""),_display_(Seq[Any](/*165.12*/shift/*165.17*/.shiftEndDateTime)),format.raw/*165.34*/("""</td>	
						<td>"""),_display_(Seq[Any](/*166.12*/shift/*166.17*/.terminal.terminalHead.name)),format.raw/*166.44*/("""</td>					
						<td>"""),_display_(Seq[Any](/*167.12*/Shift/*167.17*/.getTotalSales(shift))),format.raw/*167.38*/("""</td>		
						<td>"""),_display_(Seq[Any](/*168.12*/Shift/*168.17*/.getTotalMedialCollected(shift))),format.raw/*168.48*/("""</td>		
						<td>"""),_display_(Seq[Any](/*169.12*/Shift/*169.17*/.getTotalPayoutsbyType(shift,"REGISTERPAYOUT"))),format.raw/*169.63*/("""</td>		
						<td>"""),_display_(Seq[Any](/*170.12*/Shift/*170.17*/.getTotalVariance(shift))),format.raw/*170.41*/("""</td>		
						<td>"""),_display_(Seq[Any](/*171.12*/Timesheet/*171.21*/.getEmployee(shift))),format.raw/*171.40*/("""</td>		
						<td>"""),_display_(Seq[Any](/*172.12*/shift/*172.17*/.status)),format.raw/*172.24*/("""</td>				
					</tr>
					""")))})),format.raw/*174.7*/("""

            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*182.18*/if(currentPage.hasPrev)/*182.41*/ {_display_(Seq[Any](format.raw/*182.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*184.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*184.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*186.19*/else/*186.24*/{_display_(Seq[Any](format.raw/*186.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*190.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*192.36*/currentPage/*192.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*192.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*194.18*/if(currentPage.hasNext)/*194.41*/ {_display_(Seq[Any](format.raw/*194.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*196.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*196.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*198.19*/else/*198.24*/{_display_(Seq[Any](format.raw/*198.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*202.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*206.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*211.2*/("""

              """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Shift],currentSortBy:String,currentOrder:String,currentFilter:String,store:Store,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def f:((com.avaje.ebean.Page[Shift],String,String,String,Store,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/shifts/list.scala.html
                    HASH: 09d5b61b1c315870a0b729038ba3f80a3ed175c8
                    MATRIX: 835->1|1056->1353|1070->1359|1181->1389|1235->1407|1247->1410|1286->1427|1331->1436|1365->1462|1453->1526|1511->1548|1545->1560|1584->1563|1611->1568|1651->280|1662->284|2205->818|2223->827|2377->974|2399->987|2528->1107|2543->1114|2697->144|2730->277|2759->813|2790->967|2823->1102|2854->1236|2886->1350|2915->1586|2955->1591|2967->1595|3006->1597|3284->1839|3299->1845|3341->1865|3460->1948|3475->1954|3536->1993|3662->2083|3694->2093|3893->2256|3908->2262|3969->2301|4186->2483|4227->2515|4267->2517|4384->2598|4398->2603|4435->2618|4489->2641|4541->2657|4584->2690|4625->2692|4743->2773|4758->2778|4797->2794|4852->2817|5004->2932|5044->2949|5244->3112|5288->3133|5383->3191|5423->3208|5518->3266|5567->3292|5889->3578|5936->3615|5977->3617|6108->3730|6122->3735|6162->3736|6433->3970|6503->4017|6583->4060|6649->4103|7002->4419|7060->4454|7214->4571|7263->4597|7407->4704|7457->4737|7498->4739|7581->4785|7597->4791|7675->4846|7715->4849|7730->4854|7773->4873|7845->4908|7860->4913|7900->4930|7956->4949|7971->4954|8021->4981|8081->5004|8096->5009|8140->5030|8197->5050|8212->5055|8266->5086|8323->5106|8338->5111|8407->5157|8464->5177|8479->5182|8526->5206|8583->5226|8602->5235|8644->5254|8701->5274|8716->5279|8746->5286|8807->5315|8986->5457|9019->5480|9060->5482|9176->5561|9239->5601|9326->5669|9340->5674|9380->5675|9559->5821|9671->5896|9692->5907|9748->5940|9831->5986|9864->6009|9905->6011|10017->6086|10080->6126|10163->6190|10177->6195|10217->6196|10388->6334|10472->6386|10548->6430
                    LINES: 26->1|28->64|28->64|30->64|31->65|31->65|31->65|31->65|31->65|31->65|32->66|32->66|32->66|32->66|34->7|34->7|55->30|55->30|60->38|60->38|68->48|68->48|80->1|83->6|84->28|86->35|89->46|91->59|93->63|94->68|96->70|96->70|96->70|104->78|104->78|104->78|105->79|105->79|105->79|106->80|106->80|111->85|111->85|111->85|120->94|120->94|120->94|122->96|122->96|122->96|124->98|126->100|126->100|126->100|128->102|128->102|128->102|130->104|137->111|137->111|140->114|140->114|141->115|141->115|142->116|142->116|154->128|154->128|154->128|160->134|160->134|160->134|165->139|165->139|167->141|167->141|177->151|177->151|181->155|181->155|186->160|186->160|186->160|189->163|189->163|189->163|189->163|189->163|189->163|191->165|191->165|191->165|192->166|192->166|192->166|193->167|193->167|193->167|194->168|194->168|194->168|195->169|195->169|195->169|196->170|196->170|196->170|197->171|197->171|197->171|198->172|198->172|198->172|200->174|208->182|208->182|208->182|210->184|210->184|212->186|212->186|212->186|216->190|218->192|218->192|218->192|220->194|220->194|220->194|222->196|222->196|224->198|224->198|224->198|228->202|232->206|237->211
                    -- GENERATED --
                */
            