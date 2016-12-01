
package views.html.shifts

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
object supplierList extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[SupplierMapping],String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(storeSupplierMappingList: List[SupplierMapping], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.Shifts.storeSuppliersList(newPage, sortBy, order, currentFilter)
    
}};
Seq[Any](format.raw/*1.119*/("""

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
            				<a href="#" class="btn btn-default">SUPPLIER</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*52.27*/routes/*52.33*/.Application.index())),format.raw/*52.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*61.6*/if(flash.containsKey("success"))/*61.38*/ {_display_(Seq[Any](format.raw/*61.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*63.37*/flash/*63.42*/.get("success"))),format.raw/*63.57*/("""
        </div>
    """)))})),format.raw/*65.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*69.24*/link(0, "name"))),format.raw/*69.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*71.66*/currentFilter)),format.raw/*71.79*/("""" placeholder="Filter by Supplier name...">
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
           </p>
        </form>
    </div>
    
    """),_display_(Seq[Any](/*77.6*/if(storeSupplierMappingList.size() == 0)/*77.46*/ {_display_(Seq[Any](format.raw/*77.48*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*83.7*/else/*83.12*/{_display_(Seq[Any](format.raw/*83.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    """),_display_(Seq[Any](/*88.22*/header("name", "Supplier name"))),format.raw/*88.53*/("""
                  
                    """),_display_(Seq[Any](/*90.22*/header("abn", "Supplier ABN"))),format.raw/*90.51*/("""
                    
                    """),_display_(Seq[Any](/*92.22*/header("Phone1", "Supplier Phone1"))),format.raw/*92.57*/("""
                      
                    """),_display_(Seq[Any](/*94.22*/header("description", "Supplier Email"))),format.raw/*94.61*/("""
                      
                    <th>Payment Terms</th>
                       
                    <th>Payment Mode</th>
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*104.18*/for(supplierMapping <- storeSupplierMappingList) yield /*104.66*/ {_display_(Seq[Any](format.raw/*104.68*/("""
                    <tr>
                        <td>"""),_display_(Seq[Any](/*106.30*/supplierMapping/*106.45*/.supplier.name)),format.raw/*106.59*/("""</td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*110.30*/if(supplierMapping.supplier.abn == null)/*110.70*/ {_display_(Seq[Any](format.raw/*110.72*/("""
                                <em>-</em>
                            """)))}/*112.31*/else/*112.36*/{_display_(Seq[Any](format.raw/*112.37*/("""
                                """),_display_(Seq[Any](/*113.34*/supplierMapping/*113.49*/.supplier.abn)),format.raw/*113.62*/("""
                            """)))})),format.raw/*114.30*/("""
                        </td>
                        
                        
                         
                         <td>
                            """),_display_(Seq[Any](/*120.30*/if(supplierMapping.supplier.contactInfo.phone1 == null)/*120.85*/ {_display_(Seq[Any](format.raw/*120.87*/("""
                                <em>-</em>
                            """)))}/*122.31*/else/*122.36*/{_display_(Seq[Any](format.raw/*122.37*/("""
                                """),_display_(Seq[Any](/*123.34*/supplierMapping/*123.49*/.supplier.contactInfo.phone1)),format.raw/*123.77*/(""" 
                            """)))})),format.raw/*124.30*/("""
                        </td>
                      
                         <td>
                            """),_display_(Seq[Any](/*128.30*/if(supplierMapping.supplier.contactInfo.email  == null)/*128.85*/ {_display_(Seq[Any](format.raw/*128.87*/("""
                                <em>-</em>
                            """)))}/*130.31*/else/*130.36*/{_display_(Seq[Any](format.raw/*130.37*/("""
                                """),_display_(Seq[Any](/*131.34*/supplierMapping/*131.49*/.supplier.contactInfo.email)),format.raw/*131.76*/(""" 
                            """)))})),format.raw/*132.30*/("""
                        </td>
                          <td>
                            """),_display_(Seq[Any](/*135.30*/if(supplierMapping.paymentTerms == null)/*135.70*/ {_display_(Seq[Any](format.raw/*135.72*/("""
                                <em>-</em>
                            """)))}/*137.31*/else/*137.36*/{_display_(Seq[Any](format.raw/*137.37*/("""
                                """),_display_(Seq[Any](/*138.34*/Application/*138.45*/.propertiesMap.get(supplierMapping.paymentTerms))),format.raw/*138.93*/(""" 
                            """)))})),format.raw/*139.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*142.30*/if(supplierMapping.paymentMode == null)/*142.69*/ {_display_(Seq[Any](format.raw/*142.71*/("""
                                <em>-</em>
                            """)))}/*144.31*/else/*144.36*/{_display_(Seq[Any](format.raw/*144.37*/("""
                              """),_display_(Seq[Any](/*145.32*/Application/*145.43*/.propertiesMap.get(supplierMapping.paymentMode))),format.raw/*145.90*/("""
                            """)))})),format.raw/*146.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*149.18*/("""

            </tbody>
         </table>
       </div>       
        
    """)))})),format.raw/*155.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*160.2*/("""


            """))}
    }
    
    def render(storeSupplierMappingList:List[SupplierMapping],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.HtmlFormat.Appendable = apply(storeSupplierMappingList,currentSortBy,currentOrder,currentFilter)
    
    def f:((List[SupplierMapping],String,String,String) => play.api.templates.HtmlFormat.Appendable) = (storeSupplierMappingList,currentSortBy,currentOrder,currentFilter) => apply(storeSupplierMappingList,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:10 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/shifts/supplierList.scala.html
                    HASH: 83cec37dc331f97cd1d99eabe9e4fed83df253f4
                    MATRIX: 824->1|1019->904|1033->910|1144->940|1198->958|1210->961|1249->978|1294->987|1328->1013|1416->1077|1474->1099|1508->1111|1547->1114|1574->1119|1614->252|1625->256|2187->118|2218->249|2247->787|2279->901|2308->1137|2348->1142|2360->1146|2399->1148|2677->1390|2692->1396|2734->1416|3050->1696|3065->1702|3107->1722|3324->1904|3365->1936|3405->1938|3522->2019|3536->2024|3573->2039|3627->2062|3725->2124|3762->2139|3938->2279|3973->2292|4207->2491|4256->2531|4296->2533|4426->2646|4439->2651|4478->2652|4748->2886|4801->2917|4880->2960|4931->2989|5012->3034|5069->3069|5152->3116|5213->3155|5495->3400|5560->3448|5601->3450|5695->3507|5720->3522|5757->3536|5911->3653|5961->3693|6002->3695|6097->3771|6111->3776|6151->3777|6223->3812|6248->3827|6284->3840|6348->3871|6557->4043|6622->4098|6663->4100|6758->4176|6772->4181|6812->4182|6884->4217|6909->4232|6960->4260|7025->4292|7179->4409|7244->4464|7285->4466|7380->4542|7394->4547|7434->4548|7506->4583|7531->4598|7581->4625|7646->4657|7777->4751|7827->4791|7868->4793|7963->4869|7977->4874|8017->4875|8089->4910|8110->4921|8181->4969|8246->5001|8375->5093|8424->5132|8465->5134|8560->5210|8574->5215|8614->5216|8684->5249|8705->5260|8775->5307|8839->5338|8949->5415|9063->5497|9139->5541
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|72->46|72->46|72->46|78->52|78->52|78->52|87->61|87->61|87->61|89->63|89->63|89->63|91->65|95->69|95->69|97->71|97->71|103->77|103->77|103->77|109->83|109->83|109->83|114->88|114->88|116->90|116->90|118->92|118->92|120->94|120->94|130->104|130->104|130->104|132->106|132->106|132->106|136->110|136->110|136->110|138->112|138->112|138->112|139->113|139->113|139->113|140->114|146->120|146->120|146->120|148->122|148->122|148->122|149->123|149->123|149->123|150->124|154->128|154->128|154->128|156->130|156->130|156->130|157->131|157->131|157->131|158->132|161->135|161->135|161->135|163->137|163->137|163->137|164->138|164->138|164->138|165->139|168->142|168->142|168->142|170->144|170->144|170->144|171->145|171->145|171->145|172->146|175->149|181->155|186->160
                    -- GENERATED --
                */
            