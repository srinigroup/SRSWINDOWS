
package views.html.dr

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[com.avaje.ebean.Page[DailyReconciliation],String,String,String,Store,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[DailyReconciliation], currentSortBy: String, currentOrder: String, currentFilter: String, store:Store, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*85.2*/header/*85.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*85.38*/("""
    <th class=""""),_display_(Seq[Any](/*86.17*/key/*86.20*/.replace(".","_"))),format.raw/*86.37*/(""" header """),_display_(Seq[Any](/*86.46*/if(currentSortBy == key){/*86.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*86.136*/("""">
        <a href=""""),_display_(Seq[Any](/*87.19*/link(0, key))),format.raw/*87.31*/("""">"""),_display_(Seq[Any](/*87.34*/title)),format.raw/*87.39*/("""</a>
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
    routes.DailyReconciliations.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};def /*30.2*/link1/*30.7*/(newPage:Int, newSortBy:String) = {{
    
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
    routes.DailyReconciliations.listByDate(newPage, sortBy, order, currentFilter, pageAction)
    
}};def /*53.2*/checkSelected/*53.15*/(newFilter:String) = {{

	var result=""
 if(currentFilter == newFilter){
	result="selected"
 }
 	result
 
}};def /*63.2*/display/*63.9*/() = {{

var result = "";

		if(DailyReconciliations.getOPENStatus(store.id)){
		   result = "disabled";
		}							  

result;
}};def /*73.2*/currentDateFormat/*73.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.159*/("""


"""),format.raw/*6.42*/("""
"""),format.raw/*28.2*/("""

"""),format.raw/*51.2*/("""

"""),format.raw/*61.2*/("""

"""),format.raw/*72.2*/("""
"""),format.raw/*81.2*/("""
"""),format.raw/*84.37*/("""
"""),format.raw/*89.2*/("""

 
 """),_display_(Seq[Any](/*92.3*/main/*92.7*/ {_display_(Seq[Any](format.raw/*92.9*/("""
    
   
   <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*101.24*/routes/*101.30*/.Application.index())),format.raw/*101.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*102.27*/routes/*102.33*/.Application.showOptions("DAILY RECONCILIATION","ALL"))),format.raw/*102.87*/("""" class="btn btn-default">DAILY RECONCILIATION</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*103.54*/pageAction)),format.raw/*103.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*108.27*/routes/*108.33*/.Application.showOptions("DAILY RECONCILIATION","ALL"))),format.raw/*108.87*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
	
	  """),_display_(Seq[Any](/*115.5*/if(flash.containsKey("success"))/*115.37*/ {_display_(Seq[Any](format.raw/*115.39*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*117.37*/flash/*117.42*/.get("success"))),format.raw/*117.57*/("""
        </div>
    """)))})),format.raw/*119.6*/(""" 

    <div id="actions">
     	
     	<form action=""""),_display_(Seq[Any](/*123.22*/link(0, "status"))),format.raw/*123.39*/("""" method="GET">
	     	<p class="pull-left" style="padding-top:-10px">
		      	<select name="f" id="searchbox">
		            	<option value="OPEN" """),_display_(Seq[Any](/*126.38*/checkSelected("OPEN"))),format.raw/*126.59*/(""">OPEN</option>
		            	<option value="" """),_display_(Seq[Any](/*127.34*/checkSelected(""))),format.raw/*127.51*/(""">ALL</option>
		            	<option value="SUBMITTED" """),_display_(Seq[Any](/*128.43*/checkSelected("SUBMITTED"))),format.raw/*128.69*/(""">SUBMITTED</option>
		        </select>
		        <input type="submit" id="searchsubmit" value="Filter by Status" class="btn btn-info">
		    </p>
        </form>
        
        
    </div>
    
     <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*139.24*/link1(1, "date"))),format.raw/*139.40*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            """),format.raw/*141.131*/("""
            <input type="text" name="f" placeholder="Filter By date" class="startDatePicker" required  />
            <input type="submit" id="searchDatesubmit" value="Filter by date" class="btn btn-info">
            </p>
          </form> 
    </div>
    
    """),_display_(Seq[Any](/*148.6*/if(currentPage.getTotalRowCount == 0)/*148.43*/ {_display_(Seq[Any](format.raw/*148.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*154.7*/else/*154.12*/{_display_(Seq[Any](format.raw/*154.13*/("""
        
        <div class="table-responsive"> 
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
            	<thead style="background-color: gainsboro;">
                	<tr>
                     	<th>Created Date</th>
                  
                    """),_display_(Seq[Any](/*162.22*/header("reportingBusinessDate", "Reporting Business Date"))),format.raw/*162.80*/("""
                    
                       
                    
                    
                      """),_display_(Seq[Any](/*167.24*/header("store.name", "Store Name"))),format.raw/*167.58*/("""
                      
                        <th>Cash in Safe</th>
                        
                         <th>Cheques in Safe</th>
                         
                         <th>Total Sales Reported</th>
                      
                       """),_display_(Seq[Any](/*175.25*/header("status", "Status"))),format.raw/*175.51*/("""
                	</tr>
            	</thead>
            	<tbody>

	               """),_display_(Seq[Any](/*180.18*/for(dsr <- currentPage.getList) yield /*180.49*/ {_display_(Seq[Any](format.raw/*180.51*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*182.39*/routes/*182.45*/.DailyReconciliations.edit(dsr.id,flash.get("pageAction")))),format.raw/*182.103*/("""">"""),_display_(Seq[Any](/*182.106*/currentDateFormat(dsr.createDate))),format.raw/*182.139*/("""</a></td>
                       
                       
                        <td>
                            """),_display_(Seq[Any](/*186.30*/if(dsr.reportingBusinessDate == null)/*186.67*/ {_display_(Seq[Any](format.raw/*186.69*/("""
                                <em>-</em>
                            """)))}/*188.31*/else/*188.36*/{_display_(Seq[Any](format.raw/*188.37*/("""
                            
                            	"""),_display_(Seq[Any](/*190.31*/currentDateFormat(dsr.reportingBusinessDate))),format.raw/*190.75*/("""
                               
                            """)))})),format.raw/*192.30*/("""
                        </td>
                        
                        
                         
                         <td>
                            """),_display_(Seq[Any](/*198.30*/if(store.name == null)/*198.52*/ {_display_(Seq[Any](format.raw/*198.54*/("""
                                <em>-</em>
                            """)))}/*200.31*/else/*200.36*/{_display_(Seq[Any](format.raw/*200.37*/("""
                                """),_display_(Seq[Any](/*201.34*/store/*201.39*/.name)),format.raw/*201.44*/("""  
                            """)))})),format.raw/*202.30*/("""
                        </td>
                      
                         <td>
                            """),_display_(Seq[Any](/*206.30*/if(dsr.open_cash  == null)/*206.56*/ {_display_(Seq[Any](format.raw/*206.58*/("""
                                <em>-</em>
                            """)))}/*208.31*/else/*208.36*/{_display_(Seq[Any](format.raw/*208.37*/("""
                              """),_display_(Seq[Any](/*209.32*/dsr/*209.35*/.close_cash)),format.raw/*209.46*/("""
                               
                            """)))})),format.raw/*211.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*214.30*/if(dsr.open_cheque == null)/*214.57*/ {_display_(Seq[Any](format.raw/*214.59*/("""
                                <em>-</em>
                            """)))}/*216.31*/else/*216.36*/{_display_(Seq[Any](format.raw/*216.37*/("""
                                """),_display_(Seq[Any](/*217.34*/dsr/*217.37*/.close_cheque)),format.raw/*217.50*/("""
                               
                            """)))})),format.raw/*219.30*/("""
                        </td>
                       	 	<td>
								"""),_display_(Seq[Any](/*222.10*/DailySalesReconciliation/*222.34*/.getTotalSalesAmount(dsr.dsr))),format.raw/*222.63*/("""
							</td>
                          <td>
                            """),_display_(Seq[Any](/*225.30*/if(dsr.status == null)/*225.52*/ {_display_(Seq[Any](format.raw/*225.54*/("""
                                <em>-</em>
                            """)))}/*227.31*/else/*227.36*/{_display_(Seq[Any](format.raw/*227.37*/("""
                                """),_display_(Seq[Any](/*228.34*/dsr/*228.37*/.status)),format.raw/*228.44*/(""" 
                            """)))})),format.raw/*229.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*232.18*/("""


            	</tbody>
        	</table>
        </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*241.18*/if(currentPage.hasPrev)/*241.41*/ {_display_(Seq[Any](format.raw/*241.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*243.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*243.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*245.19*/else/*245.24*/{_display_(Seq[Any](format.raw/*245.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*249.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*251.36*/currentPage/*251.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*251.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*253.18*/if(currentPage.hasNext)/*253.41*/ {_display_(Seq[Any](format.raw/*253.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*255.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*255.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*257.19*/else/*257.24*/{_display_(Seq[Any](format.raw/*257.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*261.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*265.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*270.2*/("""
 """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[DailyReconciliation],currentSortBy:String,currentOrder:String,currentFilter:String,store:Store,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def f:((com.avaje.ebean.Page[DailyReconciliation],String,String,String,Store,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,store,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:06 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dr/list.scala.html
                    HASH: 9c66f11418e391b62fbe49bb721b617f26c1d475
                    MATRIX: 845->1|1080->2004|1094->2010|1205->2040|1259->2058|1271->2061|1310->2078|1355->2087|1389->2113|1477->2177|1535->2199|1569->2211|1608->2214|1635->2219|1675->294|1686->298|2243->846|2256->851|2819->1405|2841->1418|2970->1538|2985->1545|3136->1684|3162->1701|3381->158|3414->291|3443->841|3474->1400|3505->1533|3536->1681|3565->1889|3595->2001|3624->2237|3668->2246|3680->2250|3719->2252|4004->2500|4020->2506|4063->2526|4183->2609|4199->2615|4276->2669|4418->2774|4451->2784|4651->2947|4667->2953|4744->3007|4954->3181|4996->3213|5037->3215|5157->3298|5172->3303|5210->3318|5265->3341|5360->3399|5400->3416|5590->3569|5634->3590|5720->3639|5760->3656|5854->3713|5903->3739|6204->4003|6243->4019|6360->4224|6667->4495|6714->4532|6755->4534|6886->4647|6900->4652|6940->4653|7291->4967|7372->5025|7525->5141|7582->5175|7900->5456|7949->5482|8076->5572|8124->5603|8165->5605|8268->5671|8284->5677|8366->5735|8407->5738|8464->5771|8621->5891|8668->5928|8709->5930|8804->6006|8818->6011|8858->6012|8957->6074|9024->6118|9121->6182|9330->6354|9362->6376|9403->6378|9498->6454|9512->6459|9552->6460|9624->6495|9639->6500|9667->6505|9733->6538|9887->6655|9923->6681|9964->6683|10059->6759|10073->6764|10113->6765|10183->6798|10196->6801|10230->6812|10327->6876|10456->6968|10493->6995|10534->6997|10629->7073|10643->7078|10683->7079|10755->7114|10768->7117|10804->7130|10901->7194|11012->7268|11046->7292|11098->7321|11212->7398|11244->7420|11285->7422|11380->7498|11394->7503|11434->7504|11506->7539|11519->7542|11549->7549|11614->7581|11724->7658|11907->7804|11940->7827|11981->7829|12097->7908|12160->7948|12247->8016|12261->8021|12301->8022|12480->8168|12592->8243|12613->8254|12669->8287|12752->8333|12785->8356|12826->8358|12938->8433|13001->8473|13084->8537|13098->8542|13138->8543|13309->8681|13393->8733|13469->8777
                    LINES: 26->1|28->85|28->85|30->85|31->86|31->86|31->86|31->86|31->86|31->86|32->87|32->87|32->87|32->87|34->7|34->7|55->30|55->30|76->53|76->53|84->63|84->63|93->73|93->73|102->1|105->6|106->28|108->51|110->61|112->72|113->81|114->84|115->89|118->92|118->92|118->92|127->101|127->101|127->101|128->102|128->102|128->102|129->103|129->103|134->108|134->108|134->108|141->115|141->115|141->115|143->117|143->117|143->117|145->119|149->123|149->123|152->126|152->126|153->127|153->127|154->128|154->128|165->139|165->139|167->141|174->148|174->148|174->148|180->154|180->154|180->154|188->162|188->162|193->167|193->167|201->175|201->175|206->180|206->180|206->180|208->182|208->182|208->182|208->182|208->182|212->186|212->186|212->186|214->188|214->188|214->188|216->190|216->190|218->192|224->198|224->198|224->198|226->200|226->200|226->200|227->201|227->201|227->201|228->202|232->206|232->206|232->206|234->208|234->208|234->208|235->209|235->209|235->209|237->211|240->214|240->214|240->214|242->216|242->216|242->216|243->217|243->217|243->217|245->219|248->222|248->222|248->222|251->225|251->225|251->225|253->227|253->227|253->227|254->228|254->228|254->228|255->229|258->232|267->241|267->241|267->241|269->243|269->243|271->245|271->245|271->245|275->249|277->251|277->251|277->251|279->253|279->253|279->253|281->255|281->255|283->257|283->257|283->257|287->261|291->265|296->270
                    -- GENERATED --
                */
            