
package views.html.salesheads

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[SalesHead],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[SalesHead], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*42.2*/header/*42.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*42.38*/("""
    <th class=""""),_display_(Seq[Any](/*43.17*/key/*43.20*/.replace(".","_"))),format.raw/*43.37*/(""" header """),_display_(Seq[Any](/*43.46*/if(currentSortBy == key){/*43.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*43.136*/("""">
        <a href=""""),_display_(Seq[Any](/*44.19*/link(0, key))),format.raw/*44.31*/("""">"""),_display_(Seq[Any](/*44.34*/title)),format.raw/*44.39*/("""</a>
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
    routes.SalesHeads.list(newPage, sortBy, order, currentFilter,pageAction)
    
}};def /*28.2*/currentDateFormat/*28.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.136*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""
"""),format.raw/*36.2*/("""


"""),format.raw/*41.37*/("""
"""),format.raw/*46.2*/("""

"""),_display_(Seq[Any](/*48.2*/main/*48.6*/ {_display_(Seq[Any](format.raw/*48.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*56.24*/routes/*56.30*/.Application.index())),format.raw/*56.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*57.27*/routes/*57.33*/.Application.showOptions("SALES HEAD","ALL"))),format.raw/*57.77*/("""" class="btn btn-default">SALES HEAD</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*58.54*/pageAction)),format.raw/*58.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*63.27*/routes/*63.33*/.Application.showOptions("SALES HEAD","ALL"))),format.raw/*63.77*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*72.6*/if(flash.containsKey("success"))/*72.38*/ {_display_(Seq[Any](format.raw/*72.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*74.37*/flash/*74.42*/.get("success"))),format.raw/*74.57*/("""
        </div>
    """)))})),format.raw/*76.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*80.24*/link(0, "name"))),format.raw/*80.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*82.66*/currentFilter)),format.raw/*82.79*/("""" placeholder="Filter by SalesHead name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*83.53*/pageAction)),format.raw/*83.63*/(""""/>
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
                    """),_display_(Seq[Any](/*102.22*/header("name", "SalesHead Name"))),format.raw/*102.54*/("""
                  
                    """),_display_(Seq[Any](/*104.22*/header("category", "SalesHead Category"))),format.raw/*104.62*/("""
                    
                    """),_display_(Seq[Any](/*106.22*/header("created_date", "Create Date"))),format.raw/*106.59*/("""
                    
                </tr>
            </thead>
            <tbody>
               	"""),_display_(Seq[Any](/*111.18*/for(saleshead <- currentPage.getList) yield /*111.55*/ {_display_(Seq[Any](format.raw/*111.57*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*113.39*/routes/*113.45*/.SalesHeads.edit(saleshead.id,flash.get("pageAction")))),format.raw/*113.99*/("""">"""),_display_(Seq[Any](/*113.102*/saleshead/*113.111*/.name)),format.raw/*113.116*/("""</a></td>
                       
                        <td>
                            """),_display_(Seq[Any](/*116.30*/if(saleshead.category == null)/*116.60*/ {_display_(Seq[Any](format.raw/*116.62*/("""
                                <em>-</em>
                            """)))}/*118.31*/else/*118.36*/{_display_(Seq[Any](format.raw/*118.37*/("""
                                """),_display_(Seq[Any](/*119.34*/saleshead/*119.43*/.category)),format.raw/*119.52*/("""
                            """)))})),format.raw/*120.30*/("""
                        </td>
                        
                         <td>
                            """),_display_(Seq[Any](/*124.30*/if(saleshead.created_date == null)/*124.64*/ {_display_(Seq[Any](format.raw/*124.66*/("""
                                <em>-</em>
                            """)))}/*126.31*/else/*126.36*/{_display_(Seq[Any](format.raw/*126.37*/("""
                               """),_display_(Seq[Any](/*127.33*/currentDateFormat(saleshead.created_date))),format.raw/*127.74*/("""
                            """)))})),format.raw/*128.30*/("""
                        </td>
                         
               		</tr>
                """)))})),format.raw/*132.18*/("""
               
            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*140.18*/if(currentPage.hasPrev)/*140.41*/ {_display_(Seq[Any](format.raw/*140.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*142.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*142.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*144.19*/else/*144.24*/{_display_(Seq[Any](format.raw/*144.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*148.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*150.36*/currentPage/*150.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*150.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*152.18*/if(currentPage.hasNext)/*152.41*/ {_display_(Seq[Any](format.raw/*152.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*154.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*154.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*156.19*/else/*156.24*/{_display_(Seq[Any](format.raw/*156.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*160.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*164.6*/("""
    
     </div>
    </div>
        
""")))})))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[SalesHead],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[SalesHead],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/salesheads/list.scala.html
                    HASH: 3d184b7a379eefca1a1d3e9bdc13a4467eb3e0d7
                    MATRIX: 837->1|1049->1132|1063->1138|1174->1168|1228->1186|1240->1189|1279->1206|1324->1215|1358->1241|1446->1305|1504->1327|1538->1339|1577->1342|1604->1347|1644->269|1655->273|2201->808|2227->825|2446->135|2477->266|2506->805|2535->1013|2569->1129|2598->1365|2638->1370|2650->1374|2689->1376|2967->1618|2982->1624|3024->1644|3143->1727|3158->1733|3224->1777|3355->1872|3387->1882|3586->2045|3601->2051|3667->2095|3884->2277|3925->2309|3965->2311|4082->2392|4096->2397|4133->2412|4187->2435|4285->2497|4322->2512|4498->2652|4533->2665|4667->2763|4699->2773|4913->2952|4959->2989|4999->2991|5129->3104|5142->3109|5181->3110|5452->3344|5507->3376|5587->3419|5650->3459|5732->3504|5792->3541|5936->3648|5990->3685|6031->3687|6134->3753|6150->3759|6227->3813|6268->3816|6288->3825|6317->3830|6449->3925|6489->3955|6530->3957|6625->4033|6639->4038|6679->4039|6751->4074|6770->4083|6802->4092|6866->4123|7022->4242|7066->4276|7107->4278|7202->4354|7216->4359|7256->4360|7327->4394|7391->4435|7455->4466|7589->4567|7783->4724|7816->4747|7857->4749|7973->4828|8036->4868|8123->4936|8137->4941|8177->4942|8356->5088|8468->5163|8489->5174|8545->5207|8628->5253|8661->5276|8702->5278|8814->5353|8877->5393|8960->5457|8974->5462|9014->5463|9185->5601|9269->5653
                    LINES: 26->1|28->42|28->42|30->42|31->43|31->43|31->43|31->43|31->43|31->43|32->44|32->44|32->44|32->44|34->6|34->6|55->28|55->28|64->1|66->5|67->27|68->36|71->41|72->46|74->48|74->48|74->48|82->56|82->56|82->56|83->57|83->57|83->57|84->58|84->58|89->63|89->63|89->63|98->72|98->72|98->72|100->74|100->74|100->74|102->76|106->80|106->80|108->82|108->82|109->83|109->83|117->91|117->91|117->91|123->97|123->97|123->97|128->102|128->102|130->104|130->104|132->106|132->106|137->111|137->111|137->111|139->113|139->113|139->113|139->113|139->113|139->113|142->116|142->116|142->116|144->118|144->118|144->118|145->119|145->119|145->119|146->120|150->124|150->124|150->124|152->126|152->126|152->126|153->127|153->127|154->128|158->132|166->140|166->140|166->140|168->142|168->142|170->144|170->144|170->144|174->148|176->150|176->150|176->150|178->152|178->152|178->152|180->154|180->154|182->156|182->156|182->156|186->160|190->164
                    -- GENERATED --
                */
            