
package views.html.users

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[com.avaje.ebean.Page[User],String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[User], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String):play.api.templates.HtmlFormat.Appendable = {
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
    routes.Users.list(newPage, sortBy, order, currentFilter,pageAction)
    
}};
Seq[Any](format.raw/*1.131*/("""

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
            				<a href=""""),_display_(Seq[Any](/*47.27*/routes/*47.33*/.Application.showOptions("USER","ALL"))),format.raw/*47.71*/("""" class="btn btn-default">USER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*48.54*/pageAction)),format.raw/*48.64*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*53.27*/routes/*53.33*/.Application.showOptions("USER","ALL"))),format.raw/*53.71*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*72.66*/currentFilter)),format.raw/*72.79*/("""" placeholder="Filter by User name...">
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
                    """),_display_(Seq[Any](/*90.22*/header("name", "User Name"))),format.raw/*90.49*/("""
                  
                    """),_display_(Seq[Any](/*92.22*/header("email", "User Email"))),format.raw/*92.51*/("""
                    
                    """),_display_(Seq[Any](/*94.22*/header("roles", "Roles"))),format.raw/*94.46*/("""
                    
                </tr>
            </thead>
            <tbody>

               """),_display_(Seq[Any](/*100.17*/for(user <- currentPage.getList) yield /*100.49*/ {_display_(Seq[Any](format.raw/*100.51*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*102.39*/routes/*102.45*/.Users.edit(user.id,flash.get("pageAction")))),format.raw/*102.89*/("""">"""),_display_(Seq[Any](/*102.92*/user/*102.96*/.name)),format.raw/*102.101*/("""</a></td>
                         <td>
                            """),_display_(Seq[Any](/*104.30*/if(user.email == null)/*104.52*/ {_display_(Seq[Any](format.raw/*104.54*/("""
                                <em>-</em>
                            """)))}/*106.31*/else/*106.36*/{_display_(Seq[Any](format.raw/*106.37*/("""
                                """),_display_(Seq[Any](/*107.34*/user/*107.38*/.email)),format.raw/*107.44*/("""
                            """)))})),format.raw/*108.30*/("""
                        </td>
                        
                         <td>
                            """),_display_(Seq[Any](/*112.30*/if(user.roles == null)/*112.52*/ {_display_(Seq[Any](format.raw/*112.54*/("""
                                <em>-</em>
                            """)))}/*114.31*/else/*114.36*/{_display_(Seq[Any](format.raw/*114.37*/("""
                              """),_display_(Seq[Any](/*115.32*/for(role <- user.roles) yield /*115.55*/ {_display_(Seq[Any](format.raw/*115.57*/("""
                              	"""),_display_(Seq[Any](/*116.33*/role/*116.37*/.description)),format.raw/*116.49*/("""
                               """)))})),format.raw/*117.33*/("""
                            """)))})),format.raw/*118.30*/("""
                        </td>    
               		</tr>
                """)))})),format.raw/*121.18*/("""
            </tbody>
         </table>
       </div>

        <div id="pagination" class="pager">
            <ul>
                """),_display_(Seq[Any](/*128.18*/if(currentPage.hasPrev)/*128.41*/ {_display_(Seq[Any](format.raw/*128.43*/("""
                    <li class="previous">
                        <a href=""""),_display_(Seq[Any](/*130.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*130.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*132.19*/else/*132.24*/{_display_(Seq[Any](format.raw/*132.25*/("""
                    <li class="previous disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*136.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*138.36*/currentPage/*138.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*138.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*140.18*/if(currentPage.hasNext)/*140.41*/ {_display_(Seq[Any](format.raw/*140.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*142.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*142.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*144.19*/else/*144.24*/{_display_(Seq[Any](format.raw/*144.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*148.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*152.6*/("""
    
     </div>
    </div>
        
""")))})),format.raw/*157.2*/("""

          
            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[User],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def f:((com.avaje.ebean.Page[User],String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/users/list.scala.html
                    HASH: eaf2aa86985f2576515dd3e9be682adce99ff34c
                    MATRIX: 827->1|1034->881|1048->887|1159->917|1212->934|1224->937|1263->954|1308->963|1342->989|1430->1053|1487->1074|1521->1086|1560->1089|1587->1094|1625->259|1636->263|2173->130|2202->257|2230->769|2260->879|2288->1110|2326->1113|2338->1117|2377->1119|2647->1353|2662->1359|2704->1379|2822->1461|2837->1467|2897->1505|3021->1593|3053->1603|3247->1761|3262->1767|3322->1805|3530->1978|3571->2010|3611->2012|3726->2091|3740->2096|3777->2111|3829->2132|3923->2190|3960->2205|4134->2343|4169->2356|4297->2448|4329->2458|4518->2612|4564->2649|4604->2651|4728->2758|4741->2763|4780->2764|5045->2993|5094->3020|5171->3061|5222->3090|5301->3133|5347->3157|5486->3259|5535->3291|5576->3293|5677->3357|5693->3363|5760->3407|5800->3410|5814->3414|5843->3419|5949->3488|5981->3510|6022->3512|6115->3586|6129->3591|6169->3592|6240->3626|6254->3630|6283->3636|6346->3666|6498->3781|6530->3803|6571->3805|6664->3879|6678->3884|6718->3885|6787->3917|6827->3940|6868->3942|6938->3975|6952->3979|6987->3991|7053->4024|7116->4054|7224->4129|7394->4262|7427->4285|7468->4287|7582->4364|7645->4404|7730->4470|7744->4475|7784->4476|7959->4618|8069->4691|8090->4702|8146->4735|8227->4779|8260->4802|8301->4804|8411->4877|8474->4917|8555->4979|8569->4984|8609->4985|8776->5119|8856->5167|8927->5206
                    LINES: 26->1|28->32|28->32|30->32|31->33|31->33|31->33|31->33|31->33|31->33|32->34|32->34|32->34|32->34|34->6|34->6|56->1|58->5|59->27|61->31|62->36|64->38|64->38|64->38|72->46|72->46|72->46|73->47|73->47|73->47|74->48|74->48|79->53|79->53|79->53|88->62|88->62|88->62|90->64|90->64|90->64|92->66|96->70|96->70|98->72|98->72|99->73|99->73|105->79|105->79|105->79|111->85|111->85|111->85|116->90|116->90|118->92|118->92|120->94|120->94|126->100|126->100|126->100|128->102|128->102|128->102|128->102|128->102|128->102|130->104|130->104|130->104|132->106|132->106|132->106|133->107|133->107|133->107|134->108|138->112|138->112|138->112|140->114|140->114|140->114|141->115|141->115|141->115|142->116|142->116|142->116|143->117|144->118|147->121|154->128|154->128|154->128|156->130|156->130|158->132|158->132|158->132|162->136|164->138|164->138|164->138|166->140|166->140|166->140|168->142|168->142|170->144|170->144|170->144|174->148|178->152|183->157
                    -- GENERATED --
                */
            