
package views.html.paymentTenders

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[PaymentTender],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[PaymentTender], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.PaymentTenders.list(newPage, sortBy, order, currentFilter,pageAction)
    
}};
Seq[Any](format.raw/*1.140*/("""

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
            				<a href=""""),_display_(Seq[Any](/*47.27*/routes/*47.33*/.Application.showOptions("PAYMENT TENDER","ALL"))),format.raw/*47.81*/("""" class="btn btn-default">PAYMENT TENDER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*48.54*/pageAction)),format.raw/*48.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*53.27*/routes/*53.33*/.Application.showOptions("PAYMENT TENDER","ALL"))),format.raw/*53.81*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*72.66*/currentFilter)),format.raw/*72.79*/("""" placeholder="Filter by PaymentTender name...">
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
                     """),_display_(Seq[Any](/*91.23*/header("name", "PaymentTender Name"))),format.raw/*91.59*/("""
                  
                    """),_display_(Seq[Any](/*93.22*/header("category", "PaymentTender Category"))),format.raw/*93.66*/("""
                    
                </tr>
            </thead>
            <tbody>
               	 """),_display_(Seq[Any](/*98.19*/for(paymentTender <- currentPage.getList) yield /*98.60*/ {_display_(Seq[Any](format.raw/*98.62*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*100.39*/routes/*100.45*/.PaymentTenders.edit(paymentTender.id,flash.get("pageAction")))),format.raw/*100.107*/("""">"""),_display_(Seq[Any](/*100.110*/paymentTender/*100.123*/.name)),format.raw/*100.128*/("""</a></td>
                        <td>
                            """),_display_(Seq[Any](/*102.30*/if(paymentTender.category == null)/*102.64*/ {_display_(Seq[Any](format.raw/*102.66*/("""
                                <em>-</em>
                            """)))}/*104.31*/else/*104.36*/{_display_(Seq[Any](format.raw/*104.37*/("""
                                """),_display_(Seq[Any](/*105.34*/paymentTender/*105.47*/.category)),format.raw/*105.56*/("""
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
    
    def render(currentPage:com.avaje.ebean.Page[PaymentTender],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[PaymentTender],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/paymentTenders/list.scala.html
                    HASH: 559fcfa384f1c7be1d0bf548b61a3b1d6b2246bb
                    MATRIX: 845->1|1061->930|1075->936|1186->966|1240->984|1252->987|1291->1004|1336->1013|1370->1039|1458->1103|1516->1125|1550->1137|1589->1140|1616->1145|1656->273|1667->277|2234->139|2265->270|2294->813|2326->927|2355->1163|2395->1168|2407->1172|2446->1174|2724->1416|2739->1422|2781->1442|2900->1525|2915->1531|2985->1579|3120->1678|3152->1688|3351->1851|3366->1857|3436->1905|3653->2087|3694->2119|3734->2121|3851->2202|3865->2207|3902->2222|3956->2245|4054->2307|4091->2322|4267->2462|4302->2475|4440->2577|4472->2587|4680->2760|4726->2797|4766->2799|4896->2912|4909->2917|4948->2918|5219->3153|5277->3189|5356->3232|5422->3276|5566->3384|5623->3425|5663->3427|5766->3493|5782->3499|5868->3561|5909->3564|5933->3577|5962->3582|6069->3652|6113->3686|6154->3688|6249->3764|6263->3769|6303->3770|6375->3805|6398->3818|6430->3827|6494->3858|6603->3934|6797->4091|6830->4114|6871->4116|6987->4195|7050->4235|7137->4303|7151->4308|7191->4309|7370->4455|7482->4530|7503->4541|7559->4574|7642->4620|7675->4643|7716->4645|7828->4720|7891->4760|7974->4824|7988->4829|8028->4830|8199->4968|8283->5020|8359->5064
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|72->46|72->46|72->46|73->47|73->47|73->47|74->48|74->48|79->53|79->53|79->53|88->62|88->62|88->62|90->64|90->64|90->64|92->66|96->70|96->70|98->72|98->72|99->73|99->73|106->80|106->80|106->80|112->86|112->86|112->86|117->91|117->91|119->93|119->93|124->98|124->98|124->98|126->100|126->100|126->100|126->100|126->100|126->100|128->102|128->102|128->102|130->104|130->104|130->104|131->105|131->105|131->105|132->106|135->109|143->117|143->117|143->117|145->119|145->119|147->121|147->121|147->121|151->125|153->127|153->127|153->127|155->129|155->129|155->129|157->131|157->131|159->133|159->133|159->133|163->137|167->141|172->146
                    -- GENERATED --
                */
            