
package views.html.expenseheads

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[ExpenseHead],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[ExpenseHead], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*43.2*/header/*43.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*43.38*/("""
    <th class=""""),_display_(Seq[Any](/*44.17*/key/*44.20*/.replace(".","_"))),format.raw/*44.37*/(""" header """),_display_(Seq[Any](/*44.46*/if(currentSortBy == key){/*44.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*44.136*/("""">
        <a href=""""),_display_(Seq[Any](/*45.19*/link(0, key))),format.raw/*45.31*/("""">"""),_display_(Seq[Any](/*45.34*/title)),format.raw/*45.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
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
    routes.ExpenseHeads.list(newPage, sortBy, order, currentFilter,pageAction)
    
}};def /*29.3*/currentDateFormat/*29.20*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.138*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

 """),format.raw/*37.2*/("""


"""),format.raw/*42.37*/("""
"""),format.raw/*47.2*/("""

"""),_display_(Seq[Any](/*49.2*/main/*49.6*/ {_display_(Seq[Any](format.raw/*49.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*57.24*/routes/*57.30*/.Application.index())),format.raw/*57.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*58.27*/routes/*58.33*/.Application.showOptions("EXPENSE HEAD","ALL"))),format.raw/*58.79*/("""" class="btn btn-default">EXPENSE HEAD</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*59.54*/pageAction)),format.raw/*59.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*64.27*/routes/*64.33*/.Application.showOptions("EXPENSE HEAD","ALL"))),format.raw/*64.79*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*73.6*/if(flash.containsKey("success"))/*73.38*/ {_display_(Seq[Any](format.raw/*73.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*75.37*/flash/*75.42*/.get("success"))),format.raw/*75.57*/("""
        </div>
    """)))})),format.raw/*77.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*81.24*/link(0, "name"))),format.raw/*81.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*83.66*/currentFilter)),format.raw/*83.79*/("""" placeholder="Filter by ExpenseHead name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*84.53*/pageAction)),format.raw/*84.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
            </p>
            
        </form>
    </div>
    
    """),_display_(Seq[Any](/*91.6*/if(currentPage.getTotalRowCount == 0)/*91.43*/ {_display_(Seq[Any](format.raw/*91.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*97.7*/else/*97.12*/{_display_(Seq[Any](format.raw/*97.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    """),_display_(Seq[Any](/*102.22*/header("name", "ExpenseHead Name"))),format.raw/*102.56*/("""
                  
                    """),_display_(Seq[Any](/*104.22*/header("category", "ExpenseHead Category"))),format.raw/*104.64*/("""
                    
                    """),_display_(Seq[Any](/*106.22*/header("created_date", "Create Date"))),format.raw/*106.59*/("""
                    
                </tr>
            </thead>
            <tbody>
               	"""),_display_(Seq[Any](/*111.18*/for(expensehead <- currentPage.getList) yield /*111.57*/ {_display_(Seq[Any](format.raw/*111.59*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*113.39*/routes/*113.45*/.ExpenseHeads.edit(expensehead.id,flash.get("pageAction")))),format.raw/*113.103*/("""">"""),_display_(Seq[Any](/*113.106*/expensehead/*113.117*/.name)),format.raw/*113.122*/("""</a></td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*117.30*/if(expensehead.category == null)/*117.62*/ {_display_(Seq[Any](format.raw/*117.64*/("""
                                <em>-</em>
                            """)))}/*119.31*/else/*119.36*/{_display_(Seq[Any](format.raw/*119.37*/("""
                                """),_display_(Seq[Any](/*120.34*/expensehead/*120.45*/.category)),format.raw/*120.54*/("""
                            """)))})),format.raw/*121.30*/("""
                        </td>
                        
                         <td>
                            """),_display_(Seq[Any](/*125.30*/if(expensehead.created_date == null)/*125.66*/ {_display_(Seq[Any](format.raw/*125.68*/("""
                                <em>-</em>
                            """)))}/*127.31*/else/*127.36*/{_display_(Seq[Any](format.raw/*127.37*/("""
                               """),_display_(Seq[Any](/*128.33*/currentDateFormat(expensehead.created_date))),format.raw/*128.76*/("""
                            """)))})),format.raw/*129.30*/("""
                        </td>
                         
               	</tr>
                """)))})),format.raw/*133.18*/("""
               
            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*141.18*/if(currentPage.hasPrev)/*141.41*/ {_display_(Seq[Any](format.raw/*141.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*143.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*143.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*145.19*/else/*145.24*/{_display_(Seq[Any](format.raw/*145.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*149.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*151.36*/currentPage/*151.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*151.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*153.18*/if(currentPage.hasNext)/*153.41*/ {_display_(Seq[Any](format.raw/*153.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*155.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*155.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*157.19*/else/*157.24*/{_display_(Seq[Any](format.raw/*157.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*161.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*165.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*170.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[ExpenseHead],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[ExpenseHead],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/expenseheads/list.scala.html
                    HASH: 420efcd227743a30c7c9834f9c9415ec405cef6c
                    MATRIX: 841->1|1055->1139|1069->1145|1180->1175|1234->1193|1246->1196|1285->1213|1330->1222|1364->1248|1452->1312|1510->1334|1544->1346|1583->1349|1610->1354|1650->271|1661->275|2209->815|2235->832|2454->137|2485->268|2514->809|2546->1020|2580->1136|2609->1372|2649->1377|2661->1381|2700->1383|2978->1625|2993->1631|3035->1651|3154->1734|3169->1740|3237->1786|3370->1883|3402->1893|3601->2056|3616->2062|3684->2108|3901->2290|3942->2322|3982->2324|4099->2405|4113->2410|4150->2425|4204->2448|4302->2510|4339->2525|4515->2665|4550->2678|4686->2778|4718->2788|4927->2962|4973->2999|5013->3001|5143->3114|5156->3119|5195->3120|5466->3354|5523->3388|5603->3431|5668->3473|5750->3518|5810->3555|5954->3662|6010->3701|6051->3703|6154->3769|6170->3775|6252->3833|6293->3836|6315->3847|6344->3852|6502->3973|6544->4005|6585->4007|6680->4083|6694->4088|6734->4089|6806->4124|6827->4135|6859->4144|6923->4175|7079->4294|7125->4330|7166->4332|7261->4408|7275->4413|7315->4414|7386->4448|7452->4491|7516->4522|7649->4622|7843->4779|7876->4802|7917->4804|8033->4883|8096->4923|8183->4991|8197->4996|8237->4997|8416->5143|8528->5218|8549->5229|8605->5262|8688->5308|8721->5331|8762->5333|8874->5408|8937->5448|9020->5512|9034->5517|9074->5518|9245->5656|9329->5708|9405->5752
                    LINES: 26->1|28->43|28->43|30->43|31->44|31->44|31->44|31->44|31->44|31->44|32->45|32->45|32->45|32->45|34->6|34->6|55->29|55->29|64->1|66->5|67->27|69->37|72->42|73->47|75->49|75->49|75->49|83->57|83->57|83->57|84->58|84->58|84->58|85->59|85->59|90->64|90->64|90->64|99->73|99->73|99->73|101->75|101->75|101->75|103->77|107->81|107->81|109->83|109->83|110->84|110->84|117->91|117->91|117->91|123->97|123->97|123->97|128->102|128->102|130->104|130->104|132->106|132->106|137->111|137->111|137->111|139->113|139->113|139->113|139->113|139->113|139->113|143->117|143->117|143->117|145->119|145->119|145->119|146->120|146->120|146->120|147->121|151->125|151->125|151->125|153->127|153->127|153->127|154->128|154->128|155->129|159->133|167->141|167->141|167->141|169->143|169->143|171->145|171->145|171->145|175->149|177->151|177->151|177->151|179->153|179->153|179->153|181->155|181->155|183->157|183->157|183->157|187->161|191->165|196->170
                    -- GENERATED --
                */
            