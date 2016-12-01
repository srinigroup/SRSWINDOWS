
package views.html.suppliers

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[Supplier],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Supplier], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.Suppliers.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};
Seq[Any](format.raw/*1.135*/("""

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
            				<a href=""""),_display_(Seq[Any](/*48.27*/routes/*48.33*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*48.75*/("""" class="btn btn-default">SUPPLIER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*49.54*/pageAction)),format.raw/*49.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*54.27*/routes/*54.33*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*54.75*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*72.66*/currentFilter)),format.raw/*72.79*/("""" placeholder="Filter by Supplier name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*73.53*/pageAction)),format.raw/*73.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
            </p>
        </form>
    </div>
    
    """),_display_(Seq[Any](/*79.6*/if(currentPage.getTotalRowCount == 0)/*79.43*/ {_display_(Seq[Any](format.raw/*79.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*85.7*/else/*85.12*/{_display_(Seq[Any](format.raw/*85.13*/("""
       <div class="table-responsive"> 
        <table class="table table-hover  table-striped"  style="background-color: beige;">
            <thead style="background-color: gainsboro;">
                <tr>
                    """),_display_(Seq[Any](/*90.22*/header("name", "Supplier name"))),format.raw/*90.53*/("""
                    """),_display_(Seq[Any](/*91.22*/header("abn", "Supplier ABN"))),format.raw/*91.51*/("""
                  	"""),_display_(Seq[Any](/*92.21*/header("Phone1", "Supplier Phone1"))),format.raw/*92.56*/("""
                    """),_display_(Seq[Any](/*93.22*/header("description", "Supplier Email"))),format.raw/*93.61*/("""
                    """),_display_(Seq[Any](/*94.22*/header("Street", "Supplier Description"))),format.raw/*94.62*/("""
                </tr>
            </thead>
            <tbody>
            
            	"""),_display_(Seq[Any](/*99.15*/for(supplier <- currentPage.getList) yield /*99.51*/ {_display_(Seq[Any](format.raw/*99.53*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*101.39*/routes/*101.45*/.Suppliers.edit(supplier.id,flash.get("pageAction")))),format.raw/*101.97*/("""">"""),_display_(Seq[Any](/*101.100*/supplier/*101.108*/.name)),format.raw/*101.113*/("""</a></td>
                         <td>
                            """),_display_(Seq[Any](/*103.30*/if(supplier.abn == null)/*103.54*/ {_display_(Seq[Any](format.raw/*103.56*/("""
                                <em>-</em>
                            """)))}/*105.31*/else/*105.36*/{_display_(Seq[Any](format.raw/*105.37*/("""
                                """),_display_(Seq[Any](/*106.34*/supplier/*106.42*/.abn)),format.raw/*106.46*/("""
                            """)))})),format.raw/*107.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*110.30*/if(supplier.contactInfo.phone1 == null)/*110.69*/ {_display_(Seq[Any](format.raw/*110.71*/("""
                                <em>-</em>
                            """)))}/*112.31*/else/*112.36*/{_display_(Seq[Any](format.raw/*112.37*/("""
                                """),_display_(Seq[Any](/*113.34*/supplier/*113.42*/.contactInfo.phone1)),format.raw/*113.61*/(""" 
                            """)))})),format.raw/*114.30*/("""
                        </td>
                      	<td>
                            """),_display_(Seq[Any](/*117.30*/if(supplier.contactInfo.email  == null)/*117.69*/ {_display_(Seq[Any](format.raw/*117.71*/("""
                                <em>-</em>
                            """)))}/*119.31*/else/*119.36*/{_display_(Seq[Any](format.raw/*119.37*/("""
                                """),_display_(Seq[Any](/*120.34*/supplier/*120.42*/.contactInfo.email)),format.raw/*120.60*/(""" 
                            """)))})),format.raw/*121.30*/("""
                        </td>
                         <td>
                            """),_display_(Seq[Any](/*124.30*/if(supplier.description == null)/*124.62*/ {_display_(Seq[Any](format.raw/*124.64*/("""
                                <em>-</em>
                            """)))}/*126.31*/else/*126.36*/{_display_(Seq[Any](format.raw/*126.37*/("""
                                """),_display_(Seq[Any](/*127.34*/supplier/*127.42*/.description)),format.raw/*127.54*/(""" 
                            """)))})),format.raw/*128.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*131.18*/("""
            </tbody>
        </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*138.18*/if(currentPage.hasPrev)/*138.41*/ {_display_(Seq[Any](format.raw/*138.43*/("""
                    <li class="previous ">
                        <a href=""""),_display_(Seq[Any](/*140.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*140.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*142.19*/else/*142.24*/{_display_(Seq[Any](format.raw/*142.25*/("""
                    <li class="previous  disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*146.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*148.36*/currentPage/*148.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*148.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*150.18*/if(currentPage.hasNext)/*150.41*/ {_display_(Seq[Any](format.raw/*150.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*152.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*152.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*154.19*/else/*154.24*/{_display_(Seq[Any](format.raw/*154.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*158.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*162.6*/("""
    
    </div>
    </div>
        
""")))})),format.raw/*167.2*/("""

  
            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Supplier],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[Supplier],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/suppliers/list.scala.html
                    HASH: 5ebace512522d3f9e0365b511eb6e2d4df14ec62
                    MATRIX: 835->1|1046->921|1060->927|1171->957|1225->975|1237->978|1276->995|1321->1004|1355->1030|1443->1094|1501->1116|1535->1128|1574->1131|1601->1136|1641->268|1652->272|2215->134|2246->265|2275->804|2307->918|2336->1154|2376->1159|2388->1163|2427->1165|2713->1415|2728->1421|2770->1441|2889->1524|2904->1530|2968->1572|3097->1665|3129->1675|3328->1838|3343->1844|3407->1886|3620->2064|3661->2096|3701->2098|3818->2179|3832->2184|3869->2199|3923->2222|4021->2284|4058->2299|4234->2439|4269->2452|4402->2549|4434->2559|4629->2719|4675->2756|4715->2758|4845->2871|4858->2876|4897->2877|5168->3112|5221->3143|5280->3166|5331->3195|5389->3217|5446->3252|5505->3275|5566->3314|5625->3337|5687->3377|5819->3473|5871->3509|5911->3511|6014->3577|6030->3583|6105->3635|6146->3638|6165->3646|6194->3651|6302->3722|6336->3746|6377->3748|6472->3824|6486->3829|6526->3830|6598->3865|6616->3873|6643->3877|6707->3908|6836->4000|6885->4039|6926->4041|7021->4117|7035->4122|7075->4123|7147->4158|7165->4166|7207->4185|7272->4217|7400->4308|7449->4347|7490->4349|7585->4425|7599->4430|7639->4431|7711->4466|7729->4474|7770->4492|7835->4524|7965->4617|8007->4649|8048->4651|8143->4727|8157->4732|8197->4733|8269->4768|8287->4776|8322->4788|8387->4820|8497->4897|8673->5036|8706->5059|8747->5061|8864->5141|8927->5181|9014->5249|9028->5254|9068->5255|9248->5402|9360->5477|9381->5488|9437->5521|9520->5567|9553->5590|9594->5592|9706->5667|9769->5707|9852->5771|9866->5776|9906->5777|10077->5915|10161->5967|10236->6010
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|73->47|73->47|73->47|74->48|74->48|74->48|75->49|75->49|80->54|80->54|80->54|88->62|88->62|88->62|90->64|90->64|90->64|92->66|96->70|96->70|98->72|98->72|99->73|99->73|105->79|105->79|105->79|111->85|111->85|111->85|116->90|116->90|117->91|117->91|118->92|118->92|119->93|119->93|120->94|120->94|125->99|125->99|125->99|127->101|127->101|127->101|127->101|127->101|127->101|129->103|129->103|129->103|131->105|131->105|131->105|132->106|132->106|132->106|133->107|136->110|136->110|136->110|138->112|138->112|138->112|139->113|139->113|139->113|140->114|143->117|143->117|143->117|145->119|145->119|145->119|146->120|146->120|146->120|147->121|150->124|150->124|150->124|152->126|152->126|152->126|153->127|153->127|153->127|154->128|157->131|164->138|164->138|164->138|166->140|166->140|168->142|168->142|168->142|172->146|174->148|174->148|174->148|176->150|176->150|176->150|178->152|178->152|180->154|180->154|180->154|184->158|188->162|193->167
                    -- GENERATED --
                */
            