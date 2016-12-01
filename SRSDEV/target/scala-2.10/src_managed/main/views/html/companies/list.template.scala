
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[Company],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Company], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*33.2*/header/*33.8*/(key:String, title:String):play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*33.38*/("""
    <th class=""""),_display_(Seq[Any](/*34.17*/key/*34.20*/.replace(".","_"))),format.raw/*34.37*/(""" header """),_display_(Seq[Any](/*34.46*/if(currentSortBy == key){/*34.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*34.136*/("""">
        <a href=""""),_display_(Seq[Any](/*35.19*/link(0, key))),format.raw/*35.31*/("""">"""),_display_(Seq[Any](/*35.34*/title)),format.raw/*35.39*/("""</a>
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
    routes.Companies.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};
Seq[Any](format.raw/*1.134*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*28.2*/("""

"""),format.raw/*32.37*/("""
"""),format.raw/*37.2*/("""

"""),_display_(Seq[Any](/*39.2*/main/*39.6*/ {_display_(Seq[Any](format.raw/*39.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*47.24*/routes/*47.30*/.Application.index())),format.raw/*47.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*48.27*/routes/*48.33*/.Application.showOptions("COMPANY","ALL"))),format.raw/*48.74*/("""" class="btn btn-default">COMPANY</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*49.54*/pageAction)),format.raw/*49.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*54.27*/routes/*54.33*/.Application.showOptions("COMPANY","ALL"))),format.raw/*54.74*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
            	<input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*73.67*/currentFilter)),format.raw/*73.80*/("""" placeholder="Filter by Company name...">
            	<input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*74.54*/pageAction)),format.raw/*74.64*/(""""/>
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
                    """),_display_(Seq[Any](/*93.22*/header("name", "Company name"))),format.raw/*93.52*/("""
                  
                    """),_display_(Seq[Any](/*95.22*/header("description", "Company Description"))),format.raw/*95.66*/("""
                    
                    """),_display_(Seq[Any](/*97.22*/header("director", "Company Director"))),format.raw/*97.60*/("""
                    
                    <th>Company Phone1</th>
                    
                    """),_display_(Seq[Any](/*101.22*/header("description", "Company Email"))),format.raw/*101.60*/("""
                      
                    <th>Company Address</th>
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*109.18*/for(company <- currentPage.getList) yield /*109.53*/ {_display_(Seq[Any](format.raw/*109.55*/("""
                	 
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*112.39*/routes/*112.45*/.Companies.edit(company.id,flash.get("pageAction")))),format.raw/*112.96*/("""">"""),_display_(Seq[Any](/*112.99*/company/*112.106*/.name)),format.raw/*112.111*/("""</a></td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*116.30*/if(company.description == null)/*116.61*/ {_display_(Seq[Any](format.raw/*116.63*/("""
                                <em>-</em>
                            """)))}/*118.31*/else/*118.36*/{_display_(Seq[Any](format.raw/*118.37*/("""
                                """),_display_(Seq[Any](/*119.34*/company/*119.41*/.description)),format.raw/*119.53*/("""
                            """)))})),format.raw/*120.30*/("""
                        </td>
                        
                        
                         <td>
                            """),_display_(Seq[Any](/*125.30*/if(company.director == null)/*125.58*/ {_display_(Seq[Any](format.raw/*125.60*/("""
                                <em>-</em>
                            """)))}/*127.31*/else/*127.36*/{_display_(Seq[Any](format.raw/*127.37*/("""
                                """),_display_(Seq[Any](/*128.34*/company/*128.41*/.director)),format.raw/*128.50*/("""
                            """)))})),format.raw/*129.30*/("""
                        </td>
                         <td>
                            """),_display_(Seq[Any](/*132.30*/if(company.contactInfo.phone1 == null)/*132.68*/ {_display_(Seq[Any](format.raw/*132.70*/("""
                                <em>-</em>
                            """)))}/*134.31*/else/*134.36*/{_display_(Seq[Any](format.raw/*134.37*/("""
                                """),_display_(Seq[Any](/*135.34*/company/*135.41*/.contactInfo.phone1)),format.raw/*135.60*/(""" 
                            """)))})),format.raw/*136.30*/("""
                        </td>
                      
                         <td>
                            """),_display_(Seq[Any](/*140.30*/if(company.contactInfo.email  == null)/*140.68*/ {_display_(Seq[Any](format.raw/*140.70*/("""
                                <em>-</em>
                            """)))}/*142.31*/else/*142.36*/{_display_(Seq[Any](format.raw/*142.37*/("""
                                """),_display_(Seq[Any](/*143.34*/company/*143.41*/.contactInfo.email)),format.raw/*143.59*/(""" 
                            """)))})),format.raw/*144.30*/("""
                        </td>
                          <td>
                            """),_display_(Seq[Any](/*147.30*/if(company.address.street == null)/*147.64*/ {_display_(Seq[Any](format.raw/*147.66*/("""
                                <em>-</em>
                            """)))}/*149.31*/else/*149.36*/{_display_(Seq[Any](format.raw/*149.37*/("""
                                """),_display_(Seq[Any](/*150.34*/company/*150.41*/.address.number)),format.raw/*150.56*/(""" """),_display_(Seq[Any](/*150.58*/company/*150.65*/.address.street)),format.raw/*150.80*/(""", """),_display_(Seq[Any](/*150.83*/company/*150.90*/.address.city)),format.raw/*150.103*/(""" """),_display_(Seq[Any](/*150.105*/company/*150.112*/.address.country)),format.raw/*150.128*/(""" """),_display_(Seq[Any](/*150.130*/company/*150.137*/.address.postalCode)),format.raw/*150.156*/("""
                            """)))})),format.raw/*151.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*154.18*/("""

            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*162.18*/if(currentPage.hasPrev)/*162.41*/ {_display_(Seq[Any](format.raw/*162.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*164.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*164.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*166.19*/else/*166.24*/{_display_(Seq[Any](format.raw/*166.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*170.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*172.36*/currentPage/*172.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*172.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*174.18*/if(currentPage.hasNext)/*174.41*/ {_display_(Seq[Any](format.raw/*174.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*176.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*176.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*178.19*/else/*178.24*/{_display_(Seq[Any](format.raw/*178.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*182.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*186.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*191.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Company],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[Company],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:02 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/companies/list.scala.html
                    HASH: 6a641fd003e931d280f7fc75c75489bfc61cb969
                    MATRIX: 834->1|1044->925|1058->931|1169->961|1223->979|1235->982|1274->999|1319->1008|1353->1034|1441->1098|1499->1120|1533->1132|1572->1135|1599->1140|1639->267|1650->271|2218->133|2249->264|2278->808|2310->922|2339->1158|2379->1163|2391->1167|2430->1169|2708->1411|2723->1417|2765->1437|2884->1520|2899->1526|2962->1567|3090->1659|3122->1669|3321->1832|3336->1838|3399->1879|3616->2061|3657->2093|3697->2095|3814->2176|3828->2181|3865->2196|3919->2219|4017->2281|4054->2296|4231->2437|4266->2450|4399->2547|4431->2557|4653->2744|4699->2781|4739->2783|4869->2896|4882->2901|4921->2902|5191->3136|5243->3166|5322->3209|5388->3253|5469->3298|5529->3336|5678->3448|5739->3486|5955->3665|6007->3700|6048->3702|6171->3788|6187->3794|6261->3845|6301->3848|6319->3855|6348->3860|6506->3981|6547->4012|6588->4014|6683->4090|6697->4095|6737->4096|6809->4131|6826->4138|6861->4150|6925->4181|7107->4326|7145->4354|7186->4356|7281->4432|7295->4437|7335->4438|7407->4473|7424->4480|7456->4489|7520->4520|7650->4613|7698->4651|7739->4653|7834->4729|7848->4734|7888->4735|7960->4770|7977->4777|8019->4796|8084->4828|8238->4945|8286->4983|8327->4985|8422->5061|8436->5066|8476->5067|8548->5102|8565->5109|8606->5127|8671->5159|8802->5253|8846->5287|8887->5289|8982->5365|8996->5370|9036->5371|9108->5406|9125->5413|9163->5428|9202->5430|9219->5437|9257->5452|9297->5455|9314->5462|9351->5475|9391->5477|9409->5484|9449->5500|9489->5502|9507->5509|9550->5528|9614->5559|9724->5636|9903->5778|9936->5801|9977->5803|10093->5882|10156->5922|10243->5990|10257->5995|10297->5996|10476->6142|10588->6217|10609->6228|10665->6261|10748->6307|10781->6330|10822->6332|10934->6407|10997->6447|11080->6511|11094->6516|11134->6517|11305->6655|11389->6707|11465->6751
                    LINES: 26->1|28->33|28->33|30->33|31->34|31->34|31->34|31->34|31->34|31->34|32->35|32->35|32->35|32->35|34->6|34->6|57->1|59->5|60->28|62->32|63->37|65->39|65->39|65->39|73->47|73->47|73->47|74->48|74->48|74->48|75->49|75->49|80->54|80->54|80->54|89->63|89->63|89->63|91->65|91->65|91->65|93->67|97->71|97->71|99->73|99->73|100->74|100->74|108->82|108->82|108->82|114->88|114->88|114->88|119->93|119->93|121->95|121->95|123->97|123->97|127->101|127->101|135->109|135->109|135->109|138->112|138->112|138->112|138->112|138->112|138->112|142->116|142->116|142->116|144->118|144->118|144->118|145->119|145->119|145->119|146->120|151->125|151->125|151->125|153->127|153->127|153->127|154->128|154->128|154->128|155->129|158->132|158->132|158->132|160->134|160->134|160->134|161->135|161->135|161->135|162->136|166->140|166->140|166->140|168->142|168->142|168->142|169->143|169->143|169->143|170->144|173->147|173->147|173->147|175->149|175->149|175->149|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|176->150|177->151|180->154|188->162|188->162|188->162|190->164|190->164|192->166|192->166|192->166|196->170|198->172|198->172|198->172|200->174|200->174|200->174|202->176|202->176|204->178|204->178|204->178|208->182|212->186|217->191
                    -- GENERATED --
                */
            