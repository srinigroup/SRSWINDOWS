
package views.html.totalsalesheads

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[TotalSalesHead],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[TotalSalesHead], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.TotalSalesHeads.list(newPage, sortBy, order, currentFilter)
    
}};def /*30.2*/currentDateFormat/*30.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.121*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""


"""),format.raw/*38.2*/("""

"""),format.raw/*42.37*/("""
"""),format.raw/*47.2*/("""

"""),_display_(Seq[Any](/*49.2*/main/*49.6*/ {_display_(Seq[Any](format.raw/*49.8*/("""
    
   <!-- <h1 id="homeTitle">"""),_display_(Seq[Any](/*51.29*/Messages("totalsalesheads", currentPage.getTotalRowCount))),format.raw/*51.86*/("""</h1>-->

    """),_display_(Seq[Any](/*53.6*/if(flash.containsKey("success"))/*53.38*/ {_display_(Seq[Any](format.raw/*53.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*55.37*/flash/*55.42*/.get("success"))),format.raw/*55.57*/("""
        </div>
    """)))})),format.raw/*57.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*61.24*/link(0, "name"))),format.raw/*61.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*62.66*/currentFilter)),format.raw/*62.79*/("""" placeholder="Filter by SalesHead name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
            <p class="pull-right" style="padding-right:10px"><a class="btn success" id="add" href=""""),_display_(Seq[Any](/*64.101*/routes/*64.107*/.TotalSalesHeads.showBlank())),format.raw/*64.135*/("""">Add a new TotalSalesHead</a></p>
        </form>
        
        
        
    </div>
    
    """),_display_(Seq[Any](/*71.6*/if(currentPage.getTotalRowCount == 0)/*71.43*/ {_display_(Seq[Any](format.raw/*71.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*77.7*/else/*77.12*/{_display_(Seq[Any](format.raw/*77.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*82.22*/header("name", "TotalSalesHead Name"))),format.raw/*82.59*/("""
                  
                    """),_display_(Seq[Any](/*84.22*/header("category", "TotalSalesHead Category"))),format.raw/*84.67*/("""
                    
                       
                    
                    
                      """),_display_(Seq[Any](/*89.24*/header("created_date", "Create Date"))),format.raw/*89.61*/("""
                      
                     
                      
                     
                       
                      
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*101.18*/for(totalsaleshead <- currentPage.getList) yield /*101.60*/ {_display_(Seq[Any](format.raw/*101.62*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*103.39*/routes/*103.45*/.TotalSalesHeads.edit(totalsaleshead.id))),format.raw/*103.85*/("""">"""),_display_(Seq[Any](/*103.88*/totalsaleshead/*103.102*/.name)),format.raw/*103.107*/("""</a></td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*107.30*/if(totalsaleshead.category == null)/*107.65*/ {_display_(Seq[Any](format.raw/*107.67*/("""
                                <em>-</em>
                            """)))}/*109.31*/else/*109.36*/{_display_(Seq[Any](format.raw/*109.37*/("""
                                """),_display_(Seq[Any](/*110.34*/totalsaleshead/*110.48*/.category)),format.raw/*110.57*/("""
                            """)))})),format.raw/*111.30*/("""
                        </td>
                        
                         <td>
                            """),_display_(Seq[Any](/*115.30*/if(totalsaleshead.created_date == null)/*115.69*/ {_display_(Seq[Any](format.raw/*115.71*/("""
                                <em>-</em>
                            """)))}/*117.31*/else/*117.36*/{_display_(Seq[Any](format.raw/*117.37*/("""
                              """),_display_(Seq[Any](/*118.32*/currentDateFormat(totalsaleshead.created_date))),format.raw/*118.78*/("""
                            """)))})),format.raw/*119.30*/("""
                        </td>
                        
                        
                         
               </tr>
                """)))})),format.raw/*125.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*132.18*/if(currentPage.hasPrev)/*132.41*/ {_display_(Seq[Any](format.raw/*132.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*134.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*134.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*136.19*/else/*136.24*/{_display_(Seq[Any](format.raw/*136.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*140.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*142.36*/currentPage/*142.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*142.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*144.18*/if(currentPage.hasNext)/*144.41*/ {_display_(Seq[Any](format.raw/*144.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*146.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*146.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*148.19*/else/*148.24*/{_display_(Seq[Any](format.raw/*148.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*152.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*156.6*/("""
        
""")))})),format.raw/*158.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[TotalSalesHead],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[TotalSalesHead],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/totalsalesheads/list.scala.html
                    HASH: 88e5b7ba17a36268419483dceae7ec47aac135ea
                    MATRIX: 840->1|1037->1113|1051->1119|1162->1149|1216->1167|1228->1170|1267->1187|1312->1196|1346->1222|1434->1286|1492->1308|1526->1320|1565->1323|1592->1328|1632->254|1643->258|2183->791|2209->808|2428->120|2459->251|2488->784|2521->996|2553->1110|2582->1346|2622->1351|2634->1355|2673->1357|2745->1393|2824->1450|2876->1467|2917->1499|2957->1501|3076->1584|3090->1589|3127->1604|3181->1627|3279->1689|3316->1704|3434->1786|3469->1799|3748->2041|3764->2047|3815->2075|3956->2181|4002->2218|4042->2220|4172->2333|4185->2338|4224->2339|4385->2464|4444->2501|4523->2544|4590->2589|4742->2705|4801->2742|5090->2994|5149->3036|5190->3038|5293->3104|5309->3110|5372->3150|5412->3153|5437->3167|5466->3172|5624->3293|5669->3328|5710->3330|5805->3406|5819->3411|5859->3412|5931->3447|5955->3461|5987->3470|6051->3501|6207->3620|6256->3659|6297->3661|6392->3737|6406->3742|6446->3743|6516->3776|6585->3822|6649->3853|6833->4004|7001->4135|7034->4158|7075->4160|7187->4235|7250->4275|7337->4343|7351->4348|7391->4349|7566->4491|7678->4566|7699->4577|7755->4610|7838->4656|7871->4679|7912->4681|8024->4756|8087->4796|8170->4860|8184->4865|8224->4866|8395->5004|8479->5056|8524->5069
                    LINES: 26->1|28->43|28->43|30->43|31->44|31->44|31->44|31->44|31->44|31->44|32->45|32->45|32->45|32->45|34->6|34->6|55->30|55->30|64->1|66->5|67->27|70->38|72->42|73->47|75->49|75->49|75->49|77->51|77->51|79->53|79->53|79->53|81->55|81->55|81->55|83->57|87->61|87->61|88->62|88->62|90->64|90->64|90->64|97->71|97->71|97->71|103->77|103->77|103->77|108->82|108->82|110->84|110->84|115->89|115->89|127->101|127->101|127->101|129->103|129->103|129->103|129->103|129->103|129->103|133->107|133->107|133->107|135->109|135->109|135->109|136->110|136->110|136->110|137->111|141->115|141->115|141->115|143->117|143->117|143->117|144->118|144->118|145->119|151->125|158->132|158->132|158->132|160->134|160->134|162->136|162->136|162->136|166->140|168->142|168->142|168->142|170->144|170->144|170->144|172->146|172->146|174->148|174->148|174->148|178->152|182->156|184->158
                    -- GENERATED --
                */
            