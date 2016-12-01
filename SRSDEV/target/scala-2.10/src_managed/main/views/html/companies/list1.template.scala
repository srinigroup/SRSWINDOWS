
package views.html.companies

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
object list1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Company],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Company], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
 //   routes.Companies.list(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.114*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
   <!-- <h1 id="homeTitle">"""),_display_(Seq[Any](/*40.29*/Messages("companies", currentPage.getTotalRowCount))),format.raw/*40.80*/("""</h1>-->

    """),_display_(Seq[Any](/*42.6*/if(flash.containsKey("success"))/*42.38*/ {_display_(Seq[Any](format.raw/*42.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*44.37*/flash/*44.42*/.get("success"))),format.raw/*44.57*/("""
        </div>
    """)))})),format.raw/*46.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*50.24*/link(0, "name"))),format.raw/*50.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*51.66*/currentFilter)),format.raw/*51.79*/("""" placeholder="Filter by Company name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn primary">
        </form>
        
        <a class="btn success" id="add" href=""""),_display_(Seq[Any](/*55.48*/routes/*55.54*/.Companies.showBlank())),format.raw/*55.76*/("""">Add a new company</a>
        
    </div>
    
    """),_display_(Seq[Any](/*59.6*/if(currentPage.getTotalRowCount == 0)/*59.43*/ {_display_(Seq[Any](format.raw/*59.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        
        <table class="computers zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*70.22*/header("name", "Company name"))),format.raw/*70.52*/("""
                  
                    """),_display_(Seq[Any](/*72.22*/header("description", "Company description"))),format.raw/*72.66*/("""
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*78.18*/for(company <- currentPage.getList) yield /*78.53*/ {_display_(Seq[Any](format.raw/*78.55*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*80.39*/routes/*80.45*/.Companies.edit(company.id))),format.raw/*80.72*/("""">"""),_display_(Seq[Any](/*80.75*/company/*80.82*/.name)),format.raw/*80.87*/("""</a></td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*84.30*/if(company.description == null)/*84.61*/ {_display_(Seq[Any](format.raw/*84.63*/("""
                                <em>-</em>
                            """)))}/*86.31*/else/*86.36*/{_display_(Seq[Any](format.raw/*86.37*/("""
                                """),_display_(Seq[Any](/*87.34*/company/*87.41*/.description)),format.raw/*87.53*/("""
                            """)))})),format.raw/*88.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*91.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*98.18*/if(currentPage.hasPrev)/*98.41*/ {_display_(Seq[Any](format.raw/*98.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*100.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*100.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*102.19*/else/*102.24*/{_display_(Seq[Any](format.raw/*102.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*106.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*108.36*/currentPage/*108.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*108.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*110.18*/if(currentPage.hasNext)/*110.41*/ {_display_(Seq[Any](format.raw/*110.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*112.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*112.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*114.19*/else/*114.24*/{_display_(Seq[Any](format.raw/*114.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*118.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*122.6*/("""
        
""")))})),format.raw/*124.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Company],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Company],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:03 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/companies/list1.scala.html
                    HASH: 6026c03b7b630d41f3aa473bb953193aebf57fc0
                    MATRIX: 828->1|1018->890|1032->896|1143->926|1197->944|1209->947|1248->964|1293->973|1327->999|1415->1063|1473->1085|1507->1097|1546->1100|1573->1105|1613->247|1624->251|2177->113|2208->244|2237->773|2269->887|2298->1123|2338->1128|2350->1132|2389->1134|2461->1170|2534->1221|2586->1238|2627->1270|2667->1272|2786->1355|2800->1360|2837->1375|2891->1398|2989->1460|3026->1475|3144->1557|3179->1570|3429->1784|3444->1790|3488->1812|3581->1870|3627->1907|3667->1909|3797->2022|3810->2027|3849->2028|4010->2153|4062->2183|4141->2226|4207->2270|4352->2379|4403->2414|4443->2416|4545->2482|4560->2488|4609->2515|4648->2518|4664->2525|4691->2530|4848->2651|4888->2682|4928->2684|5022->2760|5035->2765|5074->2766|5145->2801|5161->2808|5195->2820|5258->2851|5367->2928|5534->3059|5566->3082|5606->3084|5718->3159|5781->3199|5868->3267|5882->3272|5922->3273|6097->3415|6209->3490|6230->3501|6286->3534|6369->3580|6402->3603|6443->3605|6555->3680|6618->3720|6701->3784|6715->3789|6755->3790|6926->3928|7010->3980|7055->3993
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|66->40|66->40|68->42|68->42|68->42|70->44|70->44|70->44|72->46|76->50|76->50|77->51|77->51|81->55|81->55|81->55|85->59|85->59|85->59|91->65|91->65|91->65|96->70|96->70|98->72|98->72|104->78|104->78|104->78|106->80|106->80|106->80|106->80|106->80|106->80|110->84|110->84|110->84|112->86|112->86|112->86|113->87|113->87|113->87|114->88|117->91|124->98|124->98|124->98|126->100|126->100|128->102|128->102|128->102|132->106|134->108|134->108|134->108|136->110|136->110|136->110|138->112|138->112|140->114|140->114|140->114|144->118|148->122|150->124
                    -- GENERATED --
                */
            