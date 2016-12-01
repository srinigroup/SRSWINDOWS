
package views.html.dsr

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[com.avaje.ebean.Page[DailySalesReconciliation],String,String,String,Store,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[DailySalesReconciliation], currentSortBy: String, currentOrder: String, currentFilter: String, store:Store, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*62.2*/header/*62.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*62.38*/("""
    <th class=""""),_display_(Seq[Any](/*63.17*/key/*63.20*/.replace(".","_"))),format.raw/*63.37*/(""" header """),_display_(Seq[Any](/*63.46*/if(currentSortBy == key){/*63.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*63.136*/("""">
        <a href=""""),_display_(Seq[Any](/*64.19*/link(0, key))),format.raw/*64.31*/("""">"""),_display_(Seq[Any](/*64.34*/title)),format.raw/*64.39*/("""</a>
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
    routes.DailySalesReconciliations.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};def /*30.2*/checkSelected/*30.15*/(newFilter:String) = {{

	var result=""
 if(currentFilter == newFilter){
	result="selected"
 }
 	result
 
}};def /*40.2*/display/*40.9*/() = {{

var result = "";

		if(DailySalesReconciliations.getOPENStatus(store.id)){
		   result = "disabled";
		}							  

result;
}};def /*50.2*/currentDateFormat/*50.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.164*/("""


"""),format.raw/*6.42*/("""
"""),format.raw/*28.2*/("""

"""),format.raw/*38.2*/("""

"""),format.raw/*49.2*/("""
"""),format.raw/*58.2*/("""
"""),format.raw/*61.37*/("""
"""),format.raw/*66.2*/("""


"""),_display_(Seq[Any](/*69.2*/main/*69.6*/ {_display_(Seq[Any](format.raw/*69.8*/("""
    
   
   <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*78.24*/routes/*78.30*/.Application.index())),format.raw/*78.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*79.27*/routes/*79.33*/.Application.showOptions("SALES RECONCILIATION","ALL"))),format.raw/*79.87*/("""" class="btn btn-default">SALES RECONCILIATION</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*80.54*/pageAction)),format.raw/*80.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*85.27*/routes/*85.33*/.Application.showOptions("SALES RECONCILIATION","ALL"))),format.raw/*85.87*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br> 
	
	 """),_display_(Seq[Any](/*92.4*/if(flash.containsKey("success"))/*92.36*/ {_display_(Seq[Any](format.raw/*92.38*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*94.37*/flash/*94.42*/.get("success"))),format.raw/*94.57*/("""
        </div>
    """)))})),format.raw/*96.6*/(""" 
  """),_display_(Seq[Any](/*97.4*/if(flash.containsKey("DSRErr"))/*97.35*/ {_display_(Seq[Any](format.raw/*97.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*99.37*/flash/*99.42*/.get("DSRErr"))),format.raw/*99.56*/("""
        </div>
    """)))})),format.raw/*101.6*/("""
	
    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*105.24*/link(0, "status"))),format.raw/*105.41*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <select name="f" id="searchbox">
            	<option value="OPEN" """),_display_(Seq[Any](/*108.36*/checkSelected("OPEN"))),format.raw/*108.57*/(""">OPEN</option>
            	<option value="" """),_display_(Seq[Any](/*109.32*/checkSelected(""))),format.raw/*109.49*/(""">ALL</option>
            	<option value="SUBMITTED" """),_display_(Seq[Any](/*110.41*/checkSelected("SUBMITTED"))),format.raw/*110.67*/(""">SUBMITTED</option>
            </select>
            <input type="submit" id="searchsubmit" value="Filter by Status" class="btn btn-info">
            </p>
        </form>
        
        
        
    </div>
    
    """),_display_(Seq[Any](/*120.6*/if(currentPage.getTotalRowCount == 0)/*120.43*/ {_display_(Seq[Any](format.raw/*120.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*126.7*/else/*126.12*/{_display_(Seq[Any](format.raw/*126.13*/("""
        
        <div class="table-responsive"> 
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
            	<thead style="background-color: gainsboro;">
                	<tr>
                     	"""),_display_(Seq[Any](/*132.24*/header("todayDate", "Created Date"))),format.raw/*132.59*/("""
                  
                    	"""),_display_(Seq[Any](/*134.23*/header("reportingBusinessDate", "Reporting Business Date"))),format.raw/*134.81*/("""
                    
                      	"""),_display_(Seq[Any](/*136.25*/header("store.name", "Store Name"))),format.raw/*136.59*/("""
                      
                        <th>Cash Reported</th>
                        
                         <th>Cheques Reported</th>
                         
                         <th>Total Sales Reported</th>
                      
                       """),_display_(Seq[Any](/*144.25*/header("status", "Status"))),format.raw/*144.51*/("""
                	</tr>
            	</thead>
            	<tbody>

	                """),_display_(Seq[Any](/*149.19*/for(dsr <- currentPage.getList) yield /*149.50*/ {_display_(Seq[Any](format.raw/*149.52*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*151.39*/routes/*151.45*/.DailySalesReconciliations.edit(dsr.id,flash.get("pageAction")))),format.raw/*151.108*/("""">"""),_display_(Seq[Any](/*151.111*/currentDateFormat(dsr.todayDate))),format.raw/*151.143*/("""</a></td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*155.30*/if(dsr.reportingBusinessDate == null)/*155.67*/ {_display_(Seq[Any](format.raw/*155.69*/("""
                                <em>-</em>
                            """)))}/*157.31*/else/*157.36*/{_display_(Seq[Any](format.raw/*157.37*/("""
                            
                            	"""),_display_(Seq[Any](/*159.31*/currentDateFormat(dsr.reportingBusinessDate))),format.raw/*159.75*/("""
                               
                            """)))})),format.raw/*161.30*/("""
                        </td>
                         <td>
                            """),_display_(Seq[Any](/*164.30*/if(store.name == null)/*164.52*/ {_display_(Seq[Any](format.raw/*164.54*/("""
                                <em>-</em>
                            """)))}/*166.31*/else/*166.36*/{_display_(Seq[Any](format.raw/*166.37*/("""
                                """),_display_(Seq[Any](/*167.34*/store/*167.39*/.name)),format.raw/*167.44*/("""  
                            """)))})),format.raw/*168.30*/("""
                        </td>
                      
                         <td>
                            """),_display_(Seq[Any](/*172.30*/if(dsr.cashInSafe  == null)/*172.57*/ {_display_(Seq[Any](format.raw/*172.59*/("""
                                <em>-</em>
                            """)))}/*174.31*/else/*174.36*/{_display_(Seq[Any](format.raw/*174.37*/("""
                                """),_display_(Seq[Any](/*175.34*/DailySalesReconciliation/*175.58*/.getCashReported(dsr))),format.raw/*175.79*/("""  
                            """)))})),format.raw/*176.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*179.30*/if(dsr.chequesInSafe  == null)/*179.60*/ {_display_(Seq[Any](format.raw/*179.62*/("""
                                <em>-</em>
                            """)))}/*181.31*/else/*181.36*/{_display_(Seq[Any](format.raw/*181.37*/("""
                                 """),_display_(Seq[Any](/*182.35*/DailySalesReconciliation/*182.59*/.getChequesReported(dsr))),format.raw/*182.83*/("""  
                            """)))})),format.raw/*183.30*/("""
                        </td>
                       	 	<td>
							 """),_display_(Seq[Any](/*186.10*/DailySalesReconciliation/*186.34*/.getTotalSalesAmount(dsr))),format.raw/*186.59*/("""
							</td>
                          <td>
                            """),_display_(Seq[Any](/*189.30*/if(dsr.status == null)/*189.52*/ {_display_(Seq[Any](format.raw/*189.54*/("""
                                <em>-</em>
                            """)))}/*191.31*/else/*191.36*/{_display_(Seq[Any](format.raw/*191.37*/("""
                                """),_display_(Seq[Any](/*192.34*/dsr/*192.37*/.status)),format.raw/*192.44*/(""" 
                            """)))})),format.raw/*193.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*196.18*/("""

            	</tbody>
        	</table>
        </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*204.18*/if(currentPage.hasPrev)/*204.41*/ {_display_(Seq[Any](format.raw/*204.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*206.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*206.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*208.19*/else/*208.24*/{_display_(Seq[Any](format.raw/*208.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*212.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*214.36*/currentPage/*214.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*214.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*216.18*/if(currentPage.hasNext)/*216.41*/ {_display_(Seq[Any](format.raw/*216.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*218.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*218.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*220.19*/else/*220.24*/{_display_(Seq[Any](format.raw/*220.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*224.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*228.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*233.2*/("""
"""))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[DailySalesReconciliation],currentSortBy:String,currentOrder:String,currentFilter:String,store:Store,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def f:((com.avaje.ebean.Page[DailySalesReconciliation],String,String,String,Store,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dsr/list.scala.html
                    HASH: 90146c6258574c29ac37fd4212777a462b557db2
                    MATRIX: 851->1|1091->1460|1105->1466|1216->1496|1270->1514|1282->1517|1321->1534|1366->1543|1400->1569|1488->1633|1546->1655|1580->1667|1619->1670|1646->1675|1686->299|1697->303|2259->856|2281->869|2410->989|2425->996|2581->1140|2607->1157|2826->163|2859->296|2888->851|2919->984|2950->1137|2979->1345|3009->1457|3038->1693|3080->1700|3092->1704|3131->1706|3415->1954|3430->1960|3472->1980|3591->2063|3606->2069|3682->2123|3823->2228|3855->2238|4054->2401|4069->2407|4145->2461|4354->2635|4395->2667|4435->2669|4552->2750|4566->2755|4603->2770|4657->2793|4698->2799|4738->2830|4778->2832|4895->2913|4909->2918|4945->2932|5000->2955|5099->3017|5139->3034|5332->3190|5376->3211|5460->3258|5500->3275|5592->3330|5641->3356|5908->3587|5955->3624|5996->3626|6127->3739|6141->3744|6181->3745|6469->3996|6527->4031|6608->4075|6689->4133|6774->4181|6831->4215|7151->4498|7200->4524|7328->4615|7376->4646|7417->4648|7520->4714|7536->4720|7623->4783|7664->4786|7720->4818|7878->4939|7925->4976|7966->4978|8061->5054|8075->5059|8115->5060|8214->5122|8281->5166|8378->5230|8508->5323|8540->5345|8581->5347|8676->5423|8690->5428|8730->5429|8802->5464|8817->5469|8845->5474|8911->5507|9065->5624|9102->5651|9143->5653|9238->5729|9252->5734|9292->5735|9364->5770|9398->5794|9442->5815|9508->5848|9637->5940|9677->5970|9718->5972|9813->6048|9827->6053|9867->6054|9940->6090|9974->6114|10021->6138|10087->6171|10198->6245|10232->6269|10280->6294|10394->6371|10426->6393|10467->6395|10562->6471|10576->6476|10616->6477|10688->6512|10701->6515|10731->6522|10796->6554|10906->6631|11087->6775|11120->6798|11161->6800|11277->6879|11340->6919|11427->6987|11441->6992|11481->6993|11660->7139|11772->7214|11793->7225|11849->7258|11932->7304|11965->7327|12006->7329|12118->7404|12181->7444|12264->7508|12278->7513|12318->7514|12489->7652|12573->7704|12649->7748
                    LINES: 26->1|28->62|28->62|30->62|31->63|31->63|31->63|31->63|31->63|31->63|32->64|32->64|32->64|32->64|34->7|34->7|55->30|55->30|63->40|63->40|72->50|72->50|81->1|84->6|85->28|87->38|89->49|90->58|91->61|92->66|95->69|95->69|95->69|104->78|104->78|104->78|105->79|105->79|105->79|106->80|106->80|111->85|111->85|111->85|118->92|118->92|118->92|120->94|120->94|120->94|122->96|123->97|123->97|123->97|125->99|125->99|125->99|127->101|131->105|131->105|134->108|134->108|135->109|135->109|136->110|136->110|146->120|146->120|146->120|152->126|152->126|152->126|158->132|158->132|160->134|160->134|162->136|162->136|170->144|170->144|175->149|175->149|175->149|177->151|177->151|177->151|177->151|177->151|181->155|181->155|181->155|183->157|183->157|183->157|185->159|185->159|187->161|190->164|190->164|190->164|192->166|192->166|192->166|193->167|193->167|193->167|194->168|198->172|198->172|198->172|200->174|200->174|200->174|201->175|201->175|201->175|202->176|205->179|205->179|205->179|207->181|207->181|207->181|208->182|208->182|208->182|209->183|212->186|212->186|212->186|215->189|215->189|215->189|217->191|217->191|217->191|218->192|218->192|218->192|219->193|222->196|230->204|230->204|230->204|232->206|232->206|234->208|234->208|234->208|238->212|240->214|240->214|240->214|242->216|242->216|242->216|244->218|244->218|246->220|246->220|246->220|250->224|254->228|259->233
                    -- GENERATED --
                */
            