
package views.html.stores

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[Store],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Store], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.Stores.list(newPage, sortBy, order, currentFilter, pageAction)
    
}};
Seq[Any](format.raw/*1.132*/("""

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
            				<a href=""""),_display_(Seq[Any](/*48.27*/routes/*48.33*/.Application.showOptions("STORE","ALL"))),format.raw/*48.72*/("""" class="btn btn-default">STORE</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*49.54*/pageAction)),format.raw/*49.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*54.27*/routes/*54.33*/.Application.showOptions("STORE","ALL"))),format.raw/*54.72*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*72.66*/currentFilter)),format.raw/*72.79*/("""" placeholder="Filter by Store name...">
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*73.53*/pageAction)),format.raw/*73.63*/(""""/>
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
                    """),_display_(Seq[Any](/*93.22*/header("name", "Store name"))),format.raw/*93.50*/("""
                  
                    """),_display_(Seq[Any](/*95.22*/header("description", "Store Description"))),format.raw/*95.64*/("""
                    
                       
                    
                    
                      <th>Store Phone1</th>
                      
                        <th>Store Email</th>
                      
                       <th>Company</th>
                       
                      
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*112.18*/for(store <- currentPage.getList) yield /*112.51*/ {_display_(Seq[Any](format.raw/*112.53*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*114.39*/routes/*114.45*/.Stores.edit(store.id,flash.get("pageAction")))),format.raw/*114.91*/("""">"""),_display_(Seq[Any](/*114.94*/store/*114.99*/.name)),format.raw/*114.104*/("""</a></td>
                        
                       
                        <td>
                            """),_display_(Seq[Any](/*118.30*/if(store.description == null)/*118.59*/ {_display_(Seq[Any](format.raw/*118.61*/("""
                                <em>-</em>
                            """)))}/*120.31*/else/*120.36*/{_display_(Seq[Any](format.raw/*120.37*/("""
                                """),_display_(Seq[Any](/*121.34*/store/*121.39*/.description)),format.raw/*121.51*/("""
                            """)))})),format.raw/*122.30*/("""
                        </td>
                        
                        
                         
                         <td>
                            """),_display_(Seq[Any](/*128.30*/if(store.contactInfo.phone1 == null)/*128.66*/ {_display_(Seq[Any](format.raw/*128.68*/("""
                                <em>-</em>
                            """)))}/*130.31*/else/*130.36*/{_display_(Seq[Any](format.raw/*130.37*/("""
                                """),_display_(Seq[Any](/*131.34*/store/*131.39*/.contactInfo.phone1)),format.raw/*131.58*/(""" 
                            """)))})),format.raw/*132.30*/("""
                        </td>
                      
                         <td>
                            """),_display_(Seq[Any](/*136.30*/if(store.contactInfo.email  == null)/*136.66*/ {_display_(Seq[Any](format.raw/*136.68*/("""
                                <em>-</em>
                            """)))}/*138.31*/else/*138.36*/{_display_(Seq[Any](format.raw/*138.37*/("""
                                """),_display_(Seq[Any](/*139.34*/store/*139.39*/.contactInfo.email)),format.raw/*139.57*/(""" 
                            """)))})),format.raw/*140.30*/("""
                        </td>
                          <td>
                            """),_display_(Seq[Any](/*143.30*/if(store.company == null)/*143.55*/ {_display_(Seq[Any](format.raw/*143.57*/("""
                                <em>-</em>
                            """)))}/*145.31*/else/*145.36*/{_display_(Seq[Any](format.raw/*145.37*/("""
                                """),_display_(Seq[Any](/*146.34*/store/*146.39*/.company.name)),format.raw/*146.52*/(""" 
                            """)))})),format.raw/*147.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*150.18*/("""

            </tbody>
        </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*158.18*/if(currentPage.hasPrev)/*158.41*/ {_display_(Seq[Any](format.raw/*158.43*/("""
                    <li class="previous ">
                        <a href=""""),_display_(Seq[Any](/*160.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*160.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*162.19*/else/*162.24*/{_display_(Seq[Any](format.raw/*162.25*/("""
                    <li class="previous  disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*166.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*168.36*/currentPage/*168.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*168.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*170.18*/if(currentPage.hasNext)/*170.41*/ {_display_(Seq[Any](format.raw/*170.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*172.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*172.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*174.19*/else/*174.24*/{_display_(Seq[Any](format.raw/*174.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*178.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*182.6*/("""
    
    </div>
    </div>
        
""")))})),format.raw/*187.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Store],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[Store],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:10 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/stores/list.scala.html
                    HASH: 645f1606924fa0a931e3429969f18369aa13b01a
                    MATRIX: 829->1|1037->915|1051->921|1162->951|1216->969|1228->972|1267->989|1312->998|1346->1024|1434->1088|1492->1110|1526->1122|1565->1125|1592->1130|1632->265|1643->269|2203->131|2234->262|2263->798|2295->912|2324->1148|2364->1153|2376->1157|2415->1159|2701->1409|2716->1415|2758->1435|2877->1518|2892->1524|2953->1563|3079->1653|3111->1663|3310->1826|3325->1832|3386->1871|3599->2049|3640->2081|3680->2083|3797->2164|3811->2169|3848->2184|3902->2207|4000->2269|4037->2284|4213->2424|4248->2437|4378->2531|4410->2541|4635->2731|4681->2768|4721->2770|4851->2883|4864->2888|4903->2889|5174->3124|5224->3152|5303->3195|5367->3237|5833->3666|5883->3699|5924->3701|6027->3767|6043->3773|6112->3819|6152->3822|6167->3827|6196->3832|6354->3953|6393->3982|6434->3984|6529->4060|6543->4065|6583->4066|6655->4101|6670->4106|6705->4118|6769->4149|6978->4321|7024->4357|7065->4359|7160->4435|7174->4440|7214->4441|7286->4476|7301->4481|7343->4500|7408->4532|7562->4649|7608->4685|7649->4687|7744->4763|7758->4768|7798->4769|7870->4804|7885->4809|7926->4827|7991->4859|8122->4953|8157->4978|8198->4980|8293->5056|8307->5061|8347->5062|8419->5097|8434->5102|8470->5115|8535->5147|8645->5224|8823->5365|8856->5388|8897->5390|9014->5470|9077->5510|9164->5578|9178->5583|9218->5584|9398->5731|9510->5806|9531->5817|9587->5850|9670->5896|9703->5919|9744->5921|9856->5996|9919->6036|10002->6100|10016->6105|10056->6106|10227->6244|10311->6296|10386->6339
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|73->47|73->47|73->47|74->48|74->48|74->48|75->49|75->49|80->54|80->54|80->54|88->62|88->62|88->62|90->64|90->64|90->64|92->66|96->70|96->70|98->72|98->72|99->73|99->73|108->82|108->82|108->82|114->88|114->88|114->88|119->93|119->93|121->95|121->95|138->112|138->112|138->112|140->114|140->114|140->114|140->114|140->114|140->114|144->118|144->118|144->118|146->120|146->120|146->120|147->121|147->121|147->121|148->122|154->128|154->128|154->128|156->130|156->130|156->130|157->131|157->131|157->131|158->132|162->136|162->136|162->136|164->138|164->138|164->138|165->139|165->139|165->139|166->140|169->143|169->143|169->143|171->145|171->145|171->145|172->146|172->146|172->146|173->147|176->150|184->158|184->158|184->158|186->160|186->160|188->162|188->162|188->162|192->166|194->168|194->168|194->168|196->170|196->170|196->170|198->172|198->172|200->174|200->174|200->174|204->178|208->182|213->187
                    -- GENERATED --
                */
            