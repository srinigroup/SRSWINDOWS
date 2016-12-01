
package views.html.accountholders

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[AccountHolder],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[AccountHolder], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.AccountHolders.list(newPage, sortBy, order, currentFilter, pageAction)
    
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
       						<a href=""""),_display_(Seq[Any](/*47.24*/routes/*47.30*/.Application.index())),format.raw/*47.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*48.27*/routes/*48.33*/.Application.showOptions("ACCOUNT HOLDER","ALL"))),format.raw/*48.81*/("""" class="btn btn-default">ACCOUNT HOLDER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*49.54*/pageAction)),format.raw/*49.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*54.27*/routes/*54.33*/.Application.showOptions("ACCOUNT HOLDER","ALL"))),format.raw/*54.81*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
   
   

    """),_display_(Seq[Any](/*63.6*/if(flash.containsKey("success"))/*63.38*/ {_display_(Seq[Any](format.raw/*63.40*/("""
         <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*65.37*/flash/*65.42*/.get("success"))),format.raw/*65.57*/("""
        </div>
    """)))})),format.raw/*67.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*71.24*/link(0, "name"))),format.raw/*71.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*73.66*/currentFilter)),format.raw/*73.79*/("""" placeholder="Filter by Account Holder name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*74.53*/pageAction)),format.raw/*74.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
            </p>
            
        </form>
        
    </div>
    
    """),_display_(Seq[Any](/*82.6*/if(currentPage.getTotalRowCount == 0)/*82.43*/ {_display_(Seq[Any](format.raw/*82.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*88.7*/else/*88.12*/{_display_(Seq[Any](format.raw/*88.13*/("""
        
        <div class="table-responsive"> 
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
            	<thead style="background-color: gainsboro;">
                	<tr>
                     	"""),_display_(Seq[Any](/*94.24*/header("accountHolder", "Account Holder Name"))),format.raw/*94.70*/("""
                                     
                     	<th>Store</th>
                      
                      	<th>Phone</th>
                      
                       	<th>Email</th>
                      
                	</tr>
            	</thead>
            	<tbody>

	                """),_display_(Seq[Any](/*106.19*/for(account <- currentPage.getList) yield /*106.54*/ {_display_(Seq[Any](format.raw/*106.56*/("""
	                    <tr>
	                                              
	                         <td><a href=""""),_display_(Seq[Any](/*109.41*/routes/*109.47*/.AccountHolders.edit(account.id,flash.get("pageAction")))),format.raw/*109.103*/("""">"""),_display_(Seq[Any](/*109.106*/account/*109.113*/.accountHolder)),format.raw/*109.127*/("""</a></td>
	                        
	                         <td>
	                            """),_display_(Seq[Any](/*112.31*/if(account.store == null)/*112.56*/ {_display_(Seq[Any](format.raw/*112.58*/("""
	                                <em>-</em>
	                            """)))}/*114.32*/else/*114.37*/{_display_(Seq[Any](format.raw/*114.38*/("""
	                                """),_display_(Seq[Any](/*115.35*/account/*115.42*/.store.name)),format.raw/*115.53*/("""
	                            """)))})),format.raw/*116.31*/("""
	                        </td>
	                                                
	                                             
	                      	<td>
	                            """),_display_(Seq[Any](/*121.31*/if(account.contactInfo.phone1 == null)/*121.69*/ {_display_(Seq[Any](format.raw/*121.71*/("""
	                                <em>-</em>
	                            """)))}/*123.32*/else/*123.37*/{_display_(Seq[Any](format.raw/*123.38*/("""
	                                """),_display_(Seq[Any](/*124.35*/account/*124.42*/.contactInfo.phone1)),format.raw/*124.61*/(""" 
	                            """)))})),format.raw/*125.31*/("""
	                        </td>
	                      
	                         <td>
	                            """),_display_(Seq[Any](/*129.31*/if(account.contactInfo.email  == null)/*129.69*/ {_display_(Seq[Any](format.raw/*129.71*/("""
	                                <em>-</em>
	                            """)))}/*131.32*/else/*131.37*/{_display_(Seq[Any](format.raw/*131.38*/("""
	                                """),_display_(Seq[Any](/*132.35*/account/*132.42*/.contactInfo.email)),format.raw/*132.60*/(""" 
	                            """)))})),format.raw/*133.31*/("""
	                        </td>
	                         
	                    </tr>
	                """)))})),format.raw/*137.19*/("""

            	</tbody>
        	</table>
        </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*145.18*/if(currentPage.hasPrev)/*145.41*/ {_display_(Seq[Any](format.raw/*145.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*147.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*147.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*149.19*/else/*149.24*/{_display_(Seq[Any](format.raw/*149.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*153.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*155.36*/currentPage/*155.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*155.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*157.18*/if(currentPage.hasNext)/*157.41*/ {_display_(Seq[Any](format.raw/*157.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*159.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*159.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*161.19*/else/*161.24*/{_display_(Seq[Any](format.raw/*161.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*165.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*169.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*174.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[AccountHolder],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[AccountHolder],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:02 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/accountholders/list.scala.html
                    HASH: d7de20837c57e4085f6e56e06fe675a43a8b7a53
                    MATRIX: 845->1|1061->931|1075->937|1186->967|1240->985|1252->988|1291->1005|1336->1014|1370->1040|1458->1104|1516->1126|1550->1138|1589->1141|1616->1146|1656->273|1667->277|2235->139|2266->270|2295->814|2327->928|2356->1164|2396->1169|2408->1173|2447->1175|2731->1423|2746->1429|2788->1449|2907->1532|2922->1538|2992->1586|3127->1685|3159->1695|3358->1858|3373->1864|3443->1912|3662->2096|3703->2128|3743->2130|3861->2212|3875->2217|3912->2232|3966->2255|4064->2317|4101->2332|4277->2472|4312->2485|4451->2588|4483->2598|4702->2782|4748->2819|4788->2821|4918->2934|4931->2939|4970->2940|5257->3191|5325->3237|5681->3556|5733->3591|5774->3593|5929->3711|5945->3717|6025->3773|6066->3776|6084->3783|6122->3797|6259->3897|6294->3922|6335->3924|6432->4002|6446->4007|6486->4008|6559->4044|6576->4051|6610->4062|6675->4094|6905->4287|6953->4325|6994->4327|7091->4405|7105->4410|7145->4411|7218->4447|7235->4454|7277->4473|7343->4506|7501->4627|7549->4665|7590->4667|7687->4745|7701->4750|7741->4751|7814->4787|7831->4794|7872->4812|7938->4845|8079->4953|8260->5097|8293->5120|8334->5122|8450->5201|8513->5241|8600->5309|8614->5314|8654->5315|8833->5461|8945->5536|8966->5547|9022->5580|9105->5626|9138->5649|9179->5651|9291->5726|9354->5766|9437->5830|9451->5835|9491->5836|9662->5974|9746->6026|9822->6070
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|73->47|73->47|73->47|74->48|74->48|74->48|75->49|75->49|80->54|80->54|80->54|89->63|89->63|89->63|91->65|91->65|91->65|93->67|97->71|97->71|99->73|99->73|100->74|100->74|108->82|108->82|108->82|114->88|114->88|114->88|120->94|120->94|132->106|132->106|132->106|135->109|135->109|135->109|135->109|135->109|135->109|138->112|138->112|138->112|140->114|140->114|140->114|141->115|141->115|141->115|142->116|147->121|147->121|147->121|149->123|149->123|149->123|150->124|150->124|150->124|151->125|155->129|155->129|155->129|157->131|157->131|157->131|158->132|158->132|158->132|159->133|163->137|171->145|171->145|171->145|173->147|173->147|175->149|175->149|175->149|179->153|181->155|181->155|181->155|183->157|183->157|183->157|185->159|185->159|187->161|187->161|187->161|191->165|195->169|200->174
                    -- GENERATED --
                */
            