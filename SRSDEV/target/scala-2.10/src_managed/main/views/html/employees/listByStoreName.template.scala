
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
object listByStoreName extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[Employee],String,String,String,String,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: List[Employee], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String,store:Store):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.131*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*54.37*/("""
"""),format.raw/*59.2*/("""

"""),_display_(Seq[Any](/*61.2*/main/*61.6*/ {_display_(Seq[Any](format.raw/*61.8*/("""
 <script>
 $('#sn2').ready(function()"""),format.raw/*63.28*/("""{"""),format.raw/*63.29*/("""
		var storeSelect = document.getElementById("sn2");
		var storeId = storeSelect.options[storeSelect.selectedIndex].value;
		var storeName =storeSelect.options[storeSelect.selectedIndex].text;
		console.log(storeId);
		
		console.log(storeName);
		$("#sn option[value='" + storeId + "']").attr("selected","selected");
	"""),format.raw/*71.2*/("""}"""),format.raw/*71.3*/(""");
 </script>   
   
   <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*80.24*/routes/*80.30*/.Application.index())),format.raw/*80.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*81.27*/routes/*81.33*/.Application.showOptions("STAFF","ALL"))),format.raw/*81.72*/("""" class="btn btn-default">STAFF</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*82.54*/pageAction)),format.raw/*82.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*87.27*/routes/*87.33*/.Application.showOptions("STAFF","ALL"))),format.raw/*87.72*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
   
   

    """),_display_(Seq[Any](/*96.6*/if(flash.containsKey("success"))/*96.38*/ {_display_(Seq[Any](format.raw/*96.40*/("""
         <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*98.37*/flash/*98.42*/.get("success"))),format.raw/*98.57*/("""
        </div>
    """)))})),format.raw/*100.6*/(""" 

    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*104.24*/link(0, "name"))),format.raw/*104.39*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
        	
            <input type="search" id="searchbox" name="f" value="" placeholder="Filter by Employee name...">
            
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*109.53*/pageAction)),format.raw/*109.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-info">
            </p>
            
        </form>
        
    </div>
     <div id="actions1">
        
        <form action=""""),_display_(Seq[Any](/*118.24*/link1(1, "name"))),format.raw/*118.40*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            <select name="sn" id="sn">
            <option>Choose Store</option>
            """),_display_(Seq[Any](/*122.14*/for(s <- Store.all()) yield /*122.35*/{_display_(Seq[Any](format.raw/*122.36*/("""
            <option value=""""),_display_(Seq[Any](/*123.29*/s/*123.30*/.id)),format.raw/*123.33*/("""">"""),_display_(Seq[Any](/*123.36*/s/*123.37*/.name)),format.raw/*123.42*/("""</option>
            """)))})),format.raw/*124.14*/("""
            </select>
             <select name="sn2" id="sn2" style="display:none;">
            <option value=""""),_display_(Seq[Any](/*127.29*/store/*127.34*/.id)),format.raw/*127.37*/("""">"""),_display_(Seq[Any](/*127.40*/store/*127.45*/.name)),format.raw/*127.50*/("""</option>
           </select>  
            <input type="hidden"  name="pg" value=""""),_display_(Seq[Any](/*129.53*/pageAction)),format.raw/*129.63*/(""""/>
            <input type="submit" id="searchsubmit" value="Filter by Store" class="btn btn-info">
            </p>
        </form>
    </div>
    
    """),_display_(Seq[Any](/*135.6*/if(currentPage.size == 0)/*135.31*/ {_display_(Seq[Any](format.raw/*135.33*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*141.7*/else/*141.12*/{_display_(Seq[Any](format.raw/*141.13*/("""
        
        <div class="table-responsive"> 
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
            	<thead style="background-color: gainsboro;">
                	<tr>
                     	"""),_display_(Seq[Any](/*147.24*/header("firstName", "First Name"))),format.raw/*147.57*/("""
                  
                     	"""),_display_(Seq[Any](/*149.24*/header("lastName", "Last Name"))),format.raw/*149.55*/("""
                    
                     	<th>Store</th>
                    
                    
                      	"""),_display_(Seq[Any](/*154.25*/header("gender", "Gender"))),format.raw/*154.51*/("""
                      
                      	<th>Phone1</th>
                      
                       	<th>Email</th>
                      
                       	"""),_display_(Seq[Any](/*160.26*/header("address", " Address"))),format.raw/*160.55*/("""
                	</tr>
            	</thead>
            	<tbody>

	                """),_display_(Seq[Any](/*165.19*/for(employee <- currentPage) yield /*165.47*/ {_display_(Seq[Any](format.raw/*165.49*/("""
	                    <tr>
	                        <td><a href=""""),_display_(Seq[Any](/*167.40*/routes/*167.46*/.Employees.edit(employee.id,flash.get("pageAction")))),format.raw/*167.98*/("""">"""),_display_(Seq[Any](/*167.101*/employee/*167.109*/.firstName)),format.raw/*167.119*/("""</a></td>
	                        
	                                              
	                         <td>
	                            """),_display_(Seq[Any](/*171.31*/if(employee.lastName == null)/*171.60*/ {_display_(Seq[Any](format.raw/*171.62*/("""
	                                <em>-</em>
	                            """)))}/*173.32*/else/*173.37*/{_display_(Seq[Any](format.raw/*173.38*/("""
	                                """),_display_(Seq[Any](/*174.35*/employee/*174.43*/.lastName)),format.raw/*174.52*/("""
	                            """)))})),format.raw/*175.31*/("""
	                        </td>
	                        
	                         <td>
	                            """),_display_(Seq[Any](/*179.31*/if(employee.store == null)/*179.57*/ {_display_(Seq[Any](format.raw/*179.59*/("""
	                                <em>-</em>
	                            """)))}/*181.32*/else/*181.37*/{_display_(Seq[Any](format.raw/*181.38*/("""
	                                """),_display_(Seq[Any](/*182.35*/employee/*182.43*/.store.name)),format.raw/*182.54*/("""
	                            """)))})),format.raw/*183.31*/("""
	                        </td>
	                                                
	                         <td>
	                            """),_display_(Seq[Any](/*187.31*/if(employee.gender == null)/*187.58*/ {_display_(Seq[Any](format.raw/*187.60*/("""
	                                <em>-</em>
	                            """)))}/*189.32*/else/*189.37*/{_display_(Seq[Any](format.raw/*189.38*/("""
	                                """),_display_(Seq[Any](/*190.35*/employee/*190.43*/.gender)),format.raw/*190.50*/("""
	                            """)))})),format.raw/*191.31*/("""
	                        </td>
	                        
	                      	<td>
	                            """),_display_(Seq[Any](/*195.31*/if(employee.contactInfo.phone1 == null)/*195.70*/ {_display_(Seq[Any](format.raw/*195.72*/("""
	                                <em>-</em>
	                            """)))}/*197.32*/else/*197.37*/{_display_(Seq[Any](format.raw/*197.38*/("""
	                                """),_display_(Seq[Any](/*198.35*/employee/*198.43*/.contactInfo.phone1)),format.raw/*198.62*/(""" 
	                            """)))})),format.raw/*199.31*/("""
	                        </td>
	                      
	                         <td>
	                            """),_display_(Seq[Any](/*203.31*/if(employee.contactInfo.email  == null)/*203.70*/ {_display_(Seq[Any](format.raw/*203.72*/("""
	                                <em>-</em>
	                            """)))}/*205.32*/else/*205.37*/{_display_(Seq[Any](format.raw/*205.38*/("""
	                                """),_display_(Seq[Any](/*206.35*/employee/*206.43*/.contactInfo.email)),format.raw/*206.61*/(""" 
	                            """)))})),format.raw/*207.31*/("""
	                        </td>
	                          <td>
	                            """),_display_(Seq[Any](/*210.31*/if(employee.address.street == null)/*210.66*/ {_display_(Seq[Any](format.raw/*210.68*/("""
	                                <em>-</em>
	                            """)))}/*212.32*/else/*212.37*/{_display_(Seq[Any](format.raw/*212.38*/("""
	                                """),_display_(Seq[Any](/*213.35*/employee/*213.43*/.address.number)),format.raw/*213.58*/(""" """),_display_(Seq[Any](/*213.60*/employee/*213.68*/.address.street)),format.raw/*213.83*/(""", """),_display_(Seq[Any](/*213.86*/employee/*213.94*/.address.city)),format.raw/*213.107*/(""" """),_display_(Seq[Any](/*213.109*/employee/*213.117*/.address.country)),format.raw/*213.133*/(""" """),_display_(Seq[Any](/*213.135*/employee/*213.143*/.address.postalCode)),format.raw/*213.162*/("""
	                            """)))})),format.raw/*214.31*/("""
	                        </td>
	                    </tr>
	                """)))})),format.raw/*217.19*/("""

            	</tbody>
        	</table>
        </div>

     """),format.raw/*247.17*/("""
        
    """)))})),format.raw/*249.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*254.2*/("""

            """))}
    }
    
    def render(currentPage:List[Employee],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String,store:Store): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction,store)
    
    def f:((List[Employee],String,String,String,String,Store) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction,store) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/employees/listByStoreName.scala.html
                    HASH: 77ed63e197333ffe7f878c0b597d5718c8cda30c
                    MATRIX: 836->1|1043->1475|1057->1481|1168->1511|1222->1529|1234->1532|1273->1549|1318->1558|1352->1584|1440->1648|1498->1670|1532->1682|1571->1685|1598->1690|1638->264|1649->268|2195->805|2208->810|2787->130|2818->261|2847->800|2878->1358|2910->1472|2939->1708|2979->1713|2991->1717|3030->1719|3098->1759|3127->1760|3481->2087|3509->2088|3804->2347|3819->2353|3861->2373|3980->2456|3995->2462|4056->2501|4182->2591|4214->2601|4413->2764|4428->2770|4489->2809|4708->2993|4749->3025|4789->3027|4907->3109|4921->3114|4958->3129|5013->3152|5112->3214|5150->3229|5448->3490|5481->3500|5750->3732|5789->3748|5997->3919|6035->3940|6075->3941|6142->3971|6153->3972|6179->3975|6219->3978|6230->3979|6258->3984|6315->4008|6470->4126|6485->4131|6511->4134|6551->4137|6566->4142|6594->4147|6718->4234|6751->4244|6948->4405|6983->4430|7024->4432|7155->4545|7169->4550|7209->4551|7497->4802|7553->4835|7635->4880|7689->4911|7856->5041|7905->5067|8121->5246|8173->5275|8301->5366|8346->5394|8387->5396|8492->5464|8508->5470|8583->5522|8624->5525|8643->5533|8677->5543|8863->5692|8902->5721|8943->5723|9040->5801|9054->5806|9094->5807|9167->5843|9185->5851|9217->5860|9282->5892|9442->6015|9478->6041|9519->6043|9616->6121|9630->6126|9670->6127|9743->6163|9761->6171|9795->6182|9860->6214|10044->6361|10081->6388|10122->6390|10219->6468|10233->6473|10273->6474|10346->6510|10364->6518|10394->6525|10459->6557|10617->6678|10666->6717|10707->6719|10804->6797|10818->6802|10858->6803|10931->6839|10949->6847|10991->6866|11057->6899|11215->7020|11264->7059|11305->7061|11402->7139|11416->7144|11456->7145|11529->7181|11547->7189|11588->7207|11654->7240|11788->7337|11833->7372|11874->7374|11971->7452|11985->7457|12025->7458|12098->7494|12116->7502|12154->7517|12193->7519|12211->7527|12249->7542|12289->7545|12307->7553|12344->7566|12384->7568|12403->7576|12443->7592|12483->7594|12502->7602|12545->7621|12610->7653|12723->7733|12821->8793|12870->8810|12946->8854
                    LINES: 26->1|28->55|28->55|30->55|31->56|31->56|31->56|31->56|31->56|31->56|32->57|32->57|32->57|32->57|34->6|34->6|55->29|55->29|77->1|79->5|80->27|82->50|84->54|85->59|87->61|87->61|87->61|89->63|89->63|97->71|97->71|106->80|106->80|106->80|107->81|107->81|107->81|108->82|108->82|113->87|113->87|113->87|122->96|122->96|122->96|124->98|124->98|124->98|126->100|130->104|130->104|135->109|135->109|144->118|144->118|148->122|148->122|148->122|149->123|149->123|149->123|149->123|149->123|149->123|150->124|153->127|153->127|153->127|153->127|153->127|153->127|155->129|155->129|161->135|161->135|161->135|167->141|167->141|167->141|173->147|173->147|175->149|175->149|180->154|180->154|186->160|186->160|191->165|191->165|191->165|193->167|193->167|193->167|193->167|193->167|193->167|197->171|197->171|197->171|199->173|199->173|199->173|200->174|200->174|200->174|201->175|205->179|205->179|205->179|207->181|207->181|207->181|208->182|208->182|208->182|209->183|213->187|213->187|213->187|215->189|215->189|215->189|216->190|216->190|216->190|217->191|221->195|221->195|221->195|223->197|223->197|223->197|224->198|224->198|224->198|225->199|229->203|229->203|229->203|231->205|231->205|231->205|232->206|232->206|232->206|233->207|236->210|236->210|236->210|238->212|238->212|238->212|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|239->213|240->214|243->217|249->247|251->249|256->254
                    -- GENERATED --
                */
            