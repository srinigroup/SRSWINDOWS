
package views.html.products

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Product],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Product], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*32.2*/header/*32.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*32.38*/("""
    <th class=""""),_display_(Seq[Any](/*33.17*/key/*33.20*/.replace(".","_"))),format.raw/*33.37*/(""" header """),_display_(Seq[Any](/*33.46*/if(currentSortBy == key){/*33.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*33.136*/("""">
        <a href=""""),_display_(Seq[Any](/*34.19*/link(0, key))),format.raw/*34.31*/("""">"""),_display_(Seq[Any](/*34.34*/title)),format.raw/*34.39*/("""</a>
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
    routes.Products.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.114*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
   <!-- <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.29*/Messages("products", currentPage.getTotalRowCount))),format.raw/*40.79*/("""</h1>-->

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by product name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Products.showBlank())),format.raw/*55.75*/("""">Add a new product</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Product name"))),format.raw/*70.52*/("""
                    """),_display_(Seq[Any](/*71.22*/header("ean", "EAN"))),format.raw/*71.42*/("""
                    """),_display_(Seq[Any](/*72.22*/header("description", "Product description"))),format.raw/*72.66*/("""
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*78.18*/for(product <- currentPage.getList) yield /*78.53*/ {_display_(Seq[Any](format.raw/*78.55*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*80.39*/routes/*80.45*/.Products.edit(product.id))),format.raw/*80.71*/("""">"""),_display_(Seq[Any](/*80.74*/product/*80.81*/.name)),format.raw/*80.86*/("""</a></td>
                        
                        <td>
                            """),_display_(Seq[Any](/*83.30*/if(product.ean == null)/*83.53*/ {_display_(Seq[Any](format.raw/*83.55*/("""
                                <em>-</em>
                            """)))}/*85.31*/else/*85.36*/{_display_(Seq[Any](format.raw/*85.37*/("""
                                """),_display_(Seq[Any](/*86.34*/product/*86.41*/.ean)),format.raw/*86.45*/("""
                            """)))})),format.raw/*87.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*90.30*/if(product.description == null)/*90.61*/ {_display_(Seq[Any](format.raw/*90.63*/("""
                                <em>-</em>
                            """)))}/*92.31*/else/*92.36*/{_display_(Seq[Any](format.raw/*92.37*/("""
                                """),_display_(Seq[Any](/*93.34*/product/*93.41*/.description)),format.raw/*93.53*/("""
                            """)))})),format.raw/*94.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*97.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*104.18*/if(currentPage.hasPrev)/*104.41*/ {_display_(Seq[Any](format.raw/*104.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*106.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*106.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*108.19*/else/*108.24*/{_display_(Seq[Any](format.raw/*108.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*112.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*114.36*/currentPage/*114.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*114.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*116.18*/if(currentPage.hasNext)/*116.41*/ {_display_(Seq[Any](format.raw/*116.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*118.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*118.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*120.19*/else/*120.24*/{_display_(Seq[Any](format.raw/*120.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*124.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*128.6*/("""
        
""")))})),format.raw/*130.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Product],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Product],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/products/list.scala.html
                    HASH: 0c99d6cb9f0c4fbe912ef9050df27e0118d2cd07
                    MATRIX: 826->1|1016->887|1030->893|1141->923|1195->941|1207->944|1246->961|1291->970|1325->996|1413->1060|1471->1082|1505->1094|1544->1097|1571->1102|1611->247|1622->251|2172->113|2203->244|2232->770|2264->884|2293->1120|2333->1125|2345->1129|2384->1131|2456->1167|2528->1217|2580->1234|2621->1266|2661->1268|2780->1351|2794->1356|2831->1371|2885->1394|2983->1456|3020->1471|3138->1553|3173->1566|3423->1780|3438->1786|3481->1807|3574->1865|3620->1902|3660->1904|3790->2017|3803->2022|3842->2023|4003->2148|4055->2178|4114->2201|4156->2221|4215->2244|4281->2288|4426->2397|4477->2432|4517->2434|4619->2500|4634->2506|4682->2532|4721->2535|4737->2542|4764->2547|4896->2643|4928->2666|4968->2668|5062->2744|5075->2749|5114->2750|5185->2785|5201->2792|5227->2796|5290->2827|5418->2919|5458->2950|5498->2952|5592->3028|5605->3033|5644->3034|5715->3069|5731->3076|5765->3088|5828->3119|5937->3196|6105->3327|6138->3350|6179->3352|6291->3427|6354->3467|6441->3535|6455->3540|6495->3541|6670->3683|6782->3758|6803->3769|6859->3802|6942->3848|6975->3871|7016->3873|7128->3948|7191->3988|7274->4052|7288->4057|7328->4058|7499->4196|7583->4248|7628->4261
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|97->71|97->71|98->72|98->72|104->78|104->78|104->78|106->80|106->80|106->80|106->80|106->80|106->80|109->83|109->83|109->83|111->85|111->85|111->85|112->86|112->86|112->86|113->87|116->90|116->90|116->90|118->92|118->92|118->92|119->93|119->93|119->93|120->94|123->97|130->104|130->104|130->104|132->106|132->106|134->108|134->108|134->108|138->112|140->114|140->114|140->114|142->116|142->116|142->116|144->118|144->118|146->120|146->120|146->120|150->124|154->128|156->130
                    -- GENERATED --
                */
            