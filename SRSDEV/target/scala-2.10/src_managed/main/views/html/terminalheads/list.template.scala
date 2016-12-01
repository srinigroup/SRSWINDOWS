
package views.html.terminalheads

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[TerminalHead],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[TerminalHead], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.TerminalHeads.list(newPage, sortBy, order, currentFilter,pageAction)
    
}};
Seq[Any](format.raw/*1.139*/("""

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
            				<a href=""""),_display_(Seq[Any](/*47.27*/routes/*47.33*/.Application.showOptions("TERMINAL HEAD","ALL"))),format.raw/*47.80*/("""" class="btn btn-default">TERMINAL HEAD</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*48.54*/pageAction)),format.raw/*48.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*53.27*/routes/*53.33*/.Application.showOptions("TERMINAL HEAD","ALL"))),format.raw/*53.80*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*72.66*/currentFilter)),format.raw/*72.79*/("""" placeholder="Filter by TerminalHead name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*73.53*/pageAction)),format.raw/*73.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
            </p>
            
        </form>
      
    </div>
    
    """),_display_(Seq[Any](/*81.6*/if(currentPage.getTotalRowCount == 0)/*81.43*/ {_display_(Seq[Any](format.raw/*81.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*87.7*/else/*87.12*/{_display_(Seq[Any](format.raw/*87.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    """),_display_(Seq[Any](/*92.22*/header("name", "TerminalHead Name"))),format.raw/*92.57*/("""
                  
                    """),_display_(Seq[Any](/*94.22*/header("category", "TerminalHead Category"))),format.raw/*94.65*/("""
                    
                </tr>
            </thead>
            <tbody>
               	"""),_display_(Seq[Any](/*99.18*/for(terminalhead <- currentPage.getList) yield /*99.58*/ {_display_(Seq[Any](format.raw/*99.60*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*101.39*/routes/*101.45*/.TerminalHeads.edit(terminalhead.id,flash.get("pageAction")))),format.raw/*101.105*/("""">"""),_display_(Seq[Any](/*101.108*/terminalhead/*101.120*/.name)),format.raw/*101.125*/("""</a></td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*105.30*/if(terminalhead.category == null)/*105.63*/ {_display_(Seq[Any](format.raw/*105.65*/("""
                                <em>-</em>
                            """)))}/*107.31*/else/*107.36*/{_display_(Seq[Any](format.raw/*107.37*/("""
                                """),_display_(Seq[Any](/*108.34*/terminalhead/*108.46*/.category)),format.raw/*108.55*/("""
                            """)))})),format.raw/*109.30*/("""
                        </td>
                     
               	</tr>
                """)))})),format.raw/*113.18*/("""
               
            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*121.18*/if(currentPage.hasPrev)/*121.41*/ {_display_(Seq[Any](format.raw/*121.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*123.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*123.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*125.19*/else/*125.24*/{_display_(Seq[Any](format.raw/*125.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*129.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*131.36*/currentPage/*131.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*131.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*133.18*/if(currentPage.hasNext)/*133.41*/ {_display_(Seq[Any](format.raw/*133.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*135.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*135.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*137.19*/else/*137.24*/{_display_(Seq[Any](format.raw/*137.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*141.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*145.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*150.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[TerminalHead],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[TerminalHead],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/terminalheads/list.scala.html
                    HASH: f114fe36c91cdcdb388c06598fc81730126194fe
                    MATRIX: 843->1|1058->928|1072->934|1183->964|1237->982|1249->985|1288->1002|1333->1011|1367->1037|1455->1101|1513->1123|1547->1135|1586->1138|1613->1143|1653->272|1664->276|2230->138|2261->269|2290->811|2322->925|2351->1161|2391->1166|2403->1170|2442->1172|2720->1414|2735->1420|2777->1440|2896->1523|2911->1529|2980->1576|3114->1674|3146->1684|3345->1847|3360->1853|3429->1900|3646->2082|3687->2114|3727->2116|3844->2197|3858->2202|3895->2217|3949->2240|4047->2302|4084->2317|4260->2457|4295->2470|4432->2571|4464->2581|4681->2763|4727->2800|4767->2802|4897->2915|4910->2920|4949->2921|5219->3155|5276->3190|5355->3233|5420->3276|5563->3383|5619->3423|5659->3425|5762->3491|5778->3497|5862->3557|5903->3560|5926->3572|5955->3577|6113->3698|6156->3731|6197->3733|6292->3809|6306->3814|6346->3815|6418->3850|6440->3862|6472->3871|6536->3902|6665->3998|6859->4155|6892->4178|6933->4180|7049->4259|7112->4299|7199->4367|7213->4372|7253->4373|7432->4519|7544->4594|7565->4605|7621->4638|7704->4684|7737->4707|7778->4709|7890->4784|7953->4824|8036->4888|8050->4893|8090->4894|8261->5032|8345->5084|8421->5128
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|72->46|72->46|72->46|73->47|73->47|73->47|74->48|74->48|79->53|79->53|79->53|88->62|88->62|88->62|90->64|90->64|90->64|92->66|96->70|96->70|98->72|98->72|99->73|99->73|107->81|107->81|107->81|113->87|113->87|113->87|118->92|118->92|120->94|120->94|125->99|125->99|125->99|127->101|127->101|127->101|127->101|127->101|127->101|131->105|131->105|131->105|133->107|133->107|133->107|134->108|134->108|134->108|135->109|139->113|147->121|147->121|147->121|149->123|149->123|151->125|151->125|151->125|155->129|157->131|157->131|157->131|159->133|159->133|159->133|161->135|161->135|163->137|163->137|163->137|167->141|171->145|176->150
                    -- GENERATED --
                */
            