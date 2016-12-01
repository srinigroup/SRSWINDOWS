
package views.html.mediatenders

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[MediaTender],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[MediaTender], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.MediaTenders.list(newPage, sortBy, order, currentFilter,pageAction)
    
}};
Seq[Any](format.raw/*1.138*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*31.37*/("""
"""),format.raw/*36.2*/("""

"""),_display_(Seq[Any](/*38.2*/main/*38.6*/ {_display_(Seq[Any](format.raw/*38.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*46.24*/routes/*46.30*/.Application.index())),format.raw/*46.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*47.27*/routes/*47.33*/.Application.showOptions("MEDIA TENDER","ALL"))),format.raw/*47.79*/("""" class="btn btn-default">MEDIA TENDER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*48.54*/pageAction)),format.raw/*48.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*53.27*/routes/*53.33*/.Application.showOptions("MEDIA TENDER","ALL"))),format.raw/*53.79*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*62.6*/if(flash.containsKey("success"))/*62.38*/ {_display_(Seq[Any](format.raw/*62.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*64.37*/flash/*64.42*/.get("success"))),format.raw/*64.57*/("""
        </div>
    """)))})),format.raw/*66.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*70.24*/link(0, "name"))),format.raw/*70.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*72.66*/currentFilter)),format.raw/*72.79*/("""" placeholder="Filter by MediaTender name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*73.53*/pageAction)),format.raw/*73.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
            </p>
           
        </form>
    </div>
    
    """),_display_(Seq[Any](/*80.6*/if(currentPage.getTotalRowCount == 0)/*80.43*/ {_display_(Seq[Any](format.raw/*80.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*86.7*/else/*86.12*/{_display_(Seq[Any](format.raw/*86.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                     """),_display_(Seq[Any](/*91.23*/header("name", "MediaTender Name"))),format.raw/*91.57*/("""
                  
                    """),_display_(Seq[Any](/*93.22*/header("category", "MediaTender Category"))),format.raw/*93.64*/("""
                    
                </tr>
            </thead>
            <tbody>
               	 """),_display_(Seq[Any](/*98.19*/for(mediatender <- currentPage.getList) yield /*98.58*/ {_display_(Seq[Any](format.raw/*98.60*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*100.39*/routes/*100.45*/.MediaTenders.edit(mediatender.id,flash.get("pageAction")))),format.raw/*100.103*/("""">"""),_display_(Seq[Any](/*100.106*/mediatender/*100.117*/.name)),format.raw/*100.122*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*102.30*/if(mediatender.category == null)/*102.62*/ {_display_(Seq[Any](format.raw/*102.64*/("""
                                <em>-</em>
                            """)))}/*104.31*/else/*104.36*/{_display_(Seq[Any](format.raw/*104.37*/("""
                                """),_display_(Seq[Any](/*105.34*/mediatender/*105.45*/.category)),format.raw/*105.54*/("""
                            """)))})),format.raw/*106.30*/("""
                        </td> 
               	 	</tr>
                """)))})),format.raw/*109.18*/("""
               
            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*117.18*/if(currentPage.hasPrev)/*117.41*/ {_display_(Seq[Any](format.raw/*117.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*119.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*119.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*121.19*/else/*121.24*/{_display_(Seq[Any](format.raw/*121.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*125.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*127.36*/currentPage/*127.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*127.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*129.18*/if(currentPage.hasNext)/*129.41*/ {_display_(Seq[Any](format.raw/*129.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*131.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*131.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*133.19*/else/*133.24*/{_display_(Seq[Any](format.raw/*133.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*137.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*141.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*146.2*/("""
            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[MediaTender],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[MediaTender],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/mediatenders/list.scala.html
                    HASH: 7d53078674e143a54099f40a8014791c41d72c2c
                    MATRIX: 841->1|1055->926|1069->932|1180->962|1234->980|1246->983|1285->1000|1330->1009|1364->1035|1452->1099|1510->1121|1544->1133|1583->1136|1610->1141|1650->271|1661->275|2226->137|2257->268|2286->809|2318->923|2347->1159|2387->1164|2399->1168|2438->1170|2716->1412|2731->1418|2773->1438|2892->1521|2907->1527|2975->1573|3108->1670|3140->1680|3339->1843|3354->1849|3422->1895|3639->2077|3680->2109|3720->2111|3837->2192|3851->2197|3888->2212|3942->2235|4040->2297|4077->2312|4253->2452|4288->2465|4424->2565|4456->2575|4664->2748|4710->2785|4750->2787|4880->2900|4893->2905|4932->2906|5203->3141|5259->3175|5338->3218|5402->3260|5546->3368|5601->3407|5641->3409|5744->3475|5760->3481|5842->3539|5883->3542|5905->3553|5934->3558|6041->3628|6083->3660|6124->3662|6219->3738|6233->3743|6273->3744|6345->3779|6366->3790|6398->3799|6462->3830|6571->3906|6765->4063|6798->4086|6839->4088|6955->4167|7018->4207|7105->4275|7119->4280|7159->4281|7338->4427|7450->4502|7471->4513|7527->4546|7610->4592|7643->4615|7684->4617|7796->4692|7859->4732|7942->4796|7956->4801|7996->4802|8167->4940|8251->4992|8327->5036
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|72->46|72->46|72->46|73->47|73->47|73->47|74->48|74->48|79->53|79->53|79->53|88->62|88->62|88->62|90->64|90->64|90->64|92->66|96->70|96->70|98->72|98->72|99->73|99->73|106->80|106->80|106->80|112->86|112->86|112->86|117->91|117->91|119->93|119->93|124->98|124->98|124->98|126->100|126->100|126->100|126->100|126->100|126->100|128->102|128->102|128->102|130->104|130->104|130->104|131->105|131->105|131->105|132->106|135->109|143->117|143->117|143->117|145->119|145->119|147->121|147->121|147->121|151->125|153->127|153->127|153->127|155->129|155->129|155->129|157->131|157->131|159->133|159->133|159->133|163->137|167->141|172->146
                    -- GENERATED --
                */
            