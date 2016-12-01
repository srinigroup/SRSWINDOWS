
package views.html.employees

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[Employee],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Employee], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*55.2*/header/*55.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*55.38*/("""
    <th class=""""),_display_(Seq[Any](/*56.17*/key/*56.20*/.replace(".","_"))),format.raw/*56.37*/(""" header """),_display_(Seq[Any](/*56.46*/if(currentSortBy == key){/*56.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*56.136*/("""">
        <a href=""""),_display_(Seq[Any](/*57.19*/link(0, key))),format.raw/*57.31*/("""">"""),_display_(Seq[Any](/*57.34*/title)),format.raw/*57.39*/("""</a>
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
    routes.Employees.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};def /*29.2*/link1/*29.7*/(newPage:Int, newSortBy:String) = {{
    
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
    routes.Employees.listForFilterByStore(newPage, sortBy, order, currentFilter, pageAction)
    
}};
Seq[Any](format.raw/*1.135*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*54.37*/("""
"""),format.raw/*59.2*/("""

"""),_display_(Seq[Any](/*61.2*/main/*61.6*/ {_display_(Seq[Any](format.raw/*61.8*/("""
    
   
   <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*70.24*/routes/*70.30*/.Application.index())),format.raw/*70.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*71.27*/routes/*71.33*/.Application.showOptions("STAFF","ALL"))),format.raw/*71.72*/("""" class="btn btn-default">STAFF</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*72.54*/pageAction)),format.raw/*72.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*77.27*/routes/*77.33*/.Application.showOptions("STAFF","ALL"))),format.raw/*77.72*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
   
   

    """),_display_(Seq[Any](/*86.6*/if(flash.containsKey("success"))/*86.38*/ {_display_(Seq[Any](format.raw/*86.40*/("""
         <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*88.37*/flash/*88.42*/.get("success"))),format.raw/*88.57*/("""
        </div>
    """)))})),format.raw/*90.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*94.24*/link(0, "name"))),format.raw/*94.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*96.66*/currentFilter)),format.raw/*96.79*/("""" placeholder="Filter by Employee name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*97.53*/pageAction)),format.raw/*97.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
            </p>
            
        </form>
        
    </div>
     <div id="actions1">
        
        <form action=""""),_display_(Seq[Any](/*106.24*/link1(1, "name"))),format.raw/*106.40*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <select name="sn" value="">
            <option>Choose Store</option>
            """),_display_(Seq[Any](/*110.14*/for(s <- Store.all()) yield /*110.35*/{_display_(Seq[Any](format.raw/*110.36*/("""
            <option value=""""),_display_(Seq[Any](/*111.29*/s/*111.30*/.id)),format.raw/*111.33*/("""">"""),_display_(Seq[Any](/*111.36*/s/*111.37*/.name)),format.raw/*111.42*/("""</option>
            """)))})),format.raw/*112.14*/("""
            </select>
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*114.53*/pageAction)),format.raw/*114.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Get Employees" class="btn btn-info">
            </p>
            
        </form>
        
    </div>
    
    """),_display_(Seq[Any](/*122.6*/if(currentPage.getTotalRowCount == 0)/*122.43*/ {_display_(Seq[Any](format.raw/*122.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*128.7*/else/*128.12*/{_display_(Seq[Any](format.raw/*128.13*/("""
        
        <div class="table-responsive"> 
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
            	<thead style="background-color: gainsboro;">
                	<tr>
                     	"""),_display_(Seq[Any](/*134.24*/header("firstName", "First Name"))),format.raw/*134.57*/("""
                  
                     	"""),_display_(Seq[Any](/*136.24*/header("lastName", "Last Name"))),format.raw/*136.55*/("""
                    
                     	<th>Store</th>
                    
                    
                      	"""),_display_(Seq[Any](/*141.25*/header("gender", "Gender"))),format.raw/*141.51*/("""
                      
                      	<th>Phone1</th>
                      
                       	<th>Email</th>
                      
                       	"""),_display_(Seq[Any](/*147.26*/header("address", " Address"))),format.raw/*147.55*/("""
                	</tr>
            	</thead>
            	<tbody>

	                """),_display_(Seq[Any](/*152.19*/for(employee <- currentPage.getList) yield /*152.55*/ {_display_(Seq[Any](format.raw/*152.57*/("""
	                    <tr>
	                        <td><a href=""""),_display_(Seq[Any](/*154.40*/routes/*154.46*/.Employees.edit(employee.id,flash.get("pageAction")))),format.raw/*154.98*/("""">"""),_display_(Seq[Any](/*154.101*/employee/*154.109*/.firstName)),format.raw/*154.119*/("""</a></td>
	                        
	                                              
	                         <td>
	                            """),_display_(Seq[Any](/*158.31*/if(employee.lastName == null)/*158.60*/ {_display_(Seq[Any](format.raw/*158.62*/("""
	                                <em>-</em>
	                            """)))}/*160.32*/else/*160.37*/{_display_(Seq[Any](format.raw/*160.38*/("""
	                                """),_display_(Seq[Any](/*161.35*/employee/*161.43*/.lastName)),format.raw/*161.52*/("""
	                            """)))})),format.raw/*162.31*/("""
	                        </td>
	                        
	                         <td>
	                            """),_display_(Seq[Any](/*166.31*/if(employee.store == null)/*166.57*/ {_display_(Seq[Any](format.raw/*166.59*/("""
	                                <em>-</em>
	                            """)))}/*168.32*/else/*168.37*/{_display_(Seq[Any](format.raw/*168.38*/("""
	                                """),_display_(Seq[Any](/*169.35*/employee/*169.43*/.store.name)),format.raw/*169.54*/("""
	                            """)))})),format.raw/*170.31*/("""
	                        </td>
	                                                
	                         <td>
	                            """),_display_(Seq[Any](/*174.31*/if(employee.gender == null)/*174.58*/ {_display_(Seq[Any](format.raw/*174.60*/("""
	                                <em>-</em>
	                            """)))}/*176.32*/else/*176.37*/{_display_(Seq[Any](format.raw/*176.38*/("""
	                                """),_display_(Seq[Any](/*177.35*/employee/*177.43*/.gender)),format.raw/*177.50*/("""
	                            """)))})),format.raw/*178.31*/("""
	                        </td>
	                        
	                      	<td>
	                            """),_display_(Seq[Any](/*182.31*/if(employee.contactInfo.phone1 == null)/*182.70*/ {_display_(Seq[Any](format.raw/*182.72*/("""
	                                <em>-</em>
	                            """)))}/*184.32*/else/*184.37*/{_display_(Seq[Any](format.raw/*184.38*/("""
	                                """),_display_(Seq[Any](/*185.35*/employee/*185.43*/.contactInfo.phone1)),format.raw/*185.62*/(""" 
	                            """)))})),format.raw/*186.31*/("""
	                        </td>
	                      
	                         <td>
	                            """),_display_(Seq[Any](/*190.31*/if(employee.contactInfo.email  == null)/*190.70*/ {_display_(Seq[Any](format.raw/*190.72*/("""
	                                <em>-</em>
	                            """)))}/*192.32*/else/*192.37*/{_display_(Seq[Any](format.raw/*192.38*/("""
	                                """),_display_(Seq[Any](/*193.35*/employee/*193.43*/.contactInfo.email)),format.raw/*193.61*/(""" 
	                            """)))})),format.raw/*194.31*/("""
	                        </td>
	                          <td>
	                            """),_display_(Seq[Any](/*197.31*/if(employee.address.street == null)/*197.66*/ {_display_(Seq[Any](format.raw/*197.68*/("""
	                                <em>-</em>
	                            """)))}/*199.32*/else/*199.37*/{_display_(Seq[Any](format.raw/*199.38*/("""
	                                """),_display_(Seq[Any](/*200.35*/employee/*200.43*/.address.number)),format.raw/*200.58*/(""" """),_display_(Seq[Any](/*200.60*/employee/*200.68*/.address.street)),format.raw/*200.83*/(""", """),_display_(Seq[Any](/*200.86*/employee/*200.94*/.address.city)),format.raw/*200.107*/(""" """),_display_(Seq[Any](/*200.109*/employee/*200.117*/.address.country)),format.raw/*200.133*/(""" """),_display_(Seq[Any](/*200.135*/employee/*200.143*/.address.postalCode)),format.raw/*200.162*/("""
	                            """)))})),format.raw/*201.31*/("""
	                        </td>
	                    </tr>
	                """)))})),format.raw/*204.19*/("""

            	</tbody>
        	</table>
        </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*212.18*/if(currentPage.hasPrev)/*212.41*/ {_display_(Seq[Any](format.raw/*212.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*214.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*214.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*216.19*/else/*216.24*/{_display_(Seq[Any](format.raw/*216.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*220.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*222.36*/currentPage/*222.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*222.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*224.18*/if(currentPage.hasNext)/*224.41*/ {_display_(Seq[Any](format.raw/*224.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*226.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*226.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*228.19*/else/*228.24*/{_display_(Seq[Any](format.raw/*228.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*232.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*236.6*/("""
    
     </div>
    </div>
""")))})),format.raw/*240.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Employee],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[Employee],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/employees/list.scala.html
                    HASH: 37f0418c7d02032be0223f03c60bc99835bc5314
                    MATRIX: 835->1|1046->1479|1060->1485|1171->1515|1225->1533|1237->1536|1276->1553|1321->1562|1355->1588|1443->1652|1501->1674|1535->1686|1574->1689|1601->1694|1641->268|1652->272|2198->809|2211->814|2790->134|2821->265|2850->804|2881->1362|2913->1476|2942->1712|2982->1717|2994->1721|3033->1723|3317->1971|3332->1977|3374->1997|3493->2080|3508->2086|3569->2125|3695->2215|3727->2225|3926->2388|3941->2394|4002->2433|4221->2617|4262->2649|4302->2651|4420->2733|4434->2738|4471->2753|4525->2776|4623->2838|4660->2853|4836->2993|4871->3006|5004->3103|5036->3113|5305->3345|5344->3361|5553->3533|5591->3554|5631->3555|5698->3585|5709->3586|5735->3589|5775->3592|5786->3593|5814->3598|5871->3622|5985->3699|6018->3709|6237->3892|6284->3929|6325->3931|6456->4044|6470->4049|6510->4050|6798->4301|6854->4334|6936->4379|6990->4410|7157->4540|7206->4566|7422->4745|7474->4774|7602->4865|7655->4901|7696->4903|7801->4971|7817->4977|7892->5029|7933->5032|7952->5040|7986->5050|8172->5199|8211->5228|8252->5230|8349->5308|8363->5313|8403->5314|8476->5350|8494->5358|8526->5367|8591->5399|8751->5522|8787->5548|8828->5550|8925->5628|8939->5633|8979->5634|9052->5670|9070->5678|9104->5689|9169->5721|9353->5868|9390->5895|9431->5897|9528->5975|9542->5980|9582->5981|9655->6017|9673->6025|9703->6032|9768->6064|9926->6185|9975->6224|10016->6226|10113->6304|10127->6309|10167->6310|10240->6346|10258->6354|10300->6373|10366->6406|10524->6527|10573->6566|10614->6568|10711->6646|10725->6651|10765->6652|10838->6688|10856->6696|10897->6714|10963->6747|11097->6844|11142->6879|11183->6881|11280->6959|11294->6964|11334->6965|11407->7001|11425->7009|11463->7024|11502->7026|11520->7034|11558->7049|11598->7052|11616->7060|11653->7073|11693->7075|11712->7083|11752->7099|11792->7101|11811->7109|11854->7128|11919->7160|12032->7240|12213->7384|12246->7407|12287->7409|12403->7488|12466->7528|12553->7596|12567->7601|12607->7602|12786->7748|12898->7823|12919->7834|12975->7867|13058->7913|13091->7936|13132->7938|13244->8013|13307->8053|13390->8117|13404->8122|13444->8123|13615->8261|13699->8313|13765->8347
                    LINES: 26->1|28->55|28->55|30->55|31->56|31->56|31->56|31->56|31->56|31->56|32->57|32->57|32->57|32->57|34->6|34->6|55->29|55->29|77->1|79->5|80->27|82->50|84->54|85->59|87->61|87->61|87->61|96->70|96->70|96->70|97->71|97->71|97->71|98->72|98->72|103->77|103->77|103->77|112->86|112->86|112->86|114->88|114->88|114->88|116->90|120->94|120->94|122->96|122->96|123->97|123->97|132->106|132->106|136->110|136->110|136->110|137->111|137->111|137->111|137->111|137->111|137->111|138->112|140->114|140->114|148->122|148->122|148->122|154->128|154->128|154->128|160->134|160->134|162->136|162->136|167->141|167->141|173->147|173->147|178->152|178->152|178->152|180->154|180->154|180->154|180->154|180->154|180->154|184->158|184->158|184->158|186->160|186->160|186->160|187->161|187->161|187->161|188->162|192->166|192->166|192->166|194->168|194->168|194->168|195->169|195->169|195->169|196->170|200->174|200->174|200->174|202->176|202->176|202->176|203->177|203->177|203->177|204->178|208->182|208->182|208->182|210->184|210->184|210->184|211->185|211->185|211->185|212->186|216->190|216->190|216->190|218->192|218->192|218->192|219->193|219->193|219->193|220->194|223->197|223->197|223->197|225->199|225->199|225->199|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|226->200|227->201|230->204|238->212|238->212|238->212|240->214|240->214|242->216|242->216|242->216|246->220|248->222|248->222|248->222|250->224|250->224|250->224|252->226|252->226|254->228|254->228|254->228|258->232|262->236|266->240
                    -- GENERATED --
                */
            