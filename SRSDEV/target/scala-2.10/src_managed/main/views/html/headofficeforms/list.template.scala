
package views.html.headofficeforms

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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[HoForm],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(hoFormList : List[HoForm]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*4.1*/("""


"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*15.24*/routes/*15.30*/.Application.index())),format.raw/*15.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						<a href="" class="btn btn-default">HEAD OFFICE FORMS</a>
            				<a href="#" class="btn btn-default">UPLOADED</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           				  """),_display_(Seq[Any](/*22.19*/if((session.get("role")).contains("sa") || (session.get("role")).contains("admin"))/*22.102*/{_display_(Seq[Any](format.raw/*22.103*/("""
           					<a href=""""),_display_(Seq[Any](/*23.27*/routes/*23.33*/.HoForms.showHoFormUploadPage())),format.raw/*23.64*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 """)))})),format.raw/*24.17*/("""
          				 """),_display_(Seq[Any](/*25.17*/if((session.get("role")).contains("sm") || (session.get("role")).contains("sk"))/*25.97*/{_display_(Seq[Any](format.raw/*25.98*/("""
          				 <a href=""""),_display_(Seq[Any](/*26.26*/routes/*26.32*/.Application.index())),format.raw/*26.52*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 """)))})),format.raw/*27.17*/("""
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*34.12*/if(flash.containsKey("success"))/*34.44*/ {_display_(Seq[Any](format.raw/*34.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*36.39*/flash/*36.44*/.get("success"))),format.raw/*36.59*/("""
		        </div>
		    """)))})),format.raw/*38.8*/(""" 
	
	
		<!-- display list based on selected date -->
		
			"""),_display_(Seq[Any](/*43.5*/if(hoFormList.size() == 0)/*43.31*/ {_display_(Seq[Any](format.raw/*43.33*/("""
        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*49.9*/else/*49.14*/{_display_(Seq[Any](format.raw/*49.15*/("""
		        <div class="table-responsive">
		        	<table class="table table-hover  table-striped"  style="background-color: beige;">
		        		<thead style="background-color: gainsboro;">
		                <tr>
		                    <th>File Name</th>
		                    
		                    <th>Uploaded Date</th>
		                    
		                    <th>FormType</th>
		                </tr>
		            </thead>
		            <tbody>
						 """),_display_(Seq[Any](/*62.9*/if(hoFormList.size() == 0)/*62.35*/{_display_(Seq[Any](format.raw/*62.36*/("""
		                <div class="well">
           					 <em>Nothing to display</em>
        				</div>
		                """)))}/*66.20*/else/*66.24*/{_display_(Seq[Any](format.raw/*66.25*/("""
		                """),_display_(Seq[Any](/*67.20*/for(hoForm <- hoFormList) yield /*67.45*/ {_display_(Seq[Any](format.raw/*67.47*/("""
		                    <tr>
		                       """),format.raw/*69.235*/("""
		                        <td><a href=""""),_display_(Seq[Any](/*70.41*/routes/*70.47*/.Application.checkUrl(hoForm.filePath))),format.raw/*70.85*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*70.115*/hoForm/*70.121*/.fileName)),format.raw/*70.130*/("""" onclick="OpenFancyBoxForHeadOfficeFormsView('"""),_display_(Seq[Any](/*70.178*/hoForm/*70.184*/.id)),format.raw/*70.187*/("""');">"""),_display_(Seq[Any](/*70.193*/hoForm/*70.199*/.fileName)),format.raw/*70.208*/("""</a></td>
		                        <td>"""),_display_(Seq[Any](/*71.32*/hoForm/*71.38*/.uploadedDate)),format.raw/*71.51*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*72.32*/hoForm/*72.38*/.formType)),format.raw/*72.47*/("""</td>
		                       
		                    </tr>
		                """)))})),format.raw/*75.20*/("""
		                """)))})),format.raw/*76.20*/("""
		            </tbody>
		         </table>
		       </div>
		        
		    """)))})),format.raw/*81.8*/("""
	
		</div>
	</div>
	
""")))})),format.raw/*86.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(hoFormList:List[HoForm]): play.api.templates.HtmlFormat.Appendable = apply(hoFormList)
    
    def f:((List[HoForm]) => play.api.templates.HtmlFormat.Appendable) = (hoFormList) => apply(hoFormList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 14:39:48 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/headofficeforms/list.scala.html
                    HASH: 495375127a4e20452797be76eb4290dbe2cc6d3e
                    MATRIX: 795->1|969->28|997->84|1038->91|1049->95|1086->96|1360->334|1375->340|1417->360|1796->703|1889->786|1929->787|1993->815|2008->821|2061->852|2176->935|2230->953|2319->1033|2358->1034|2421->1061|2436->1067|2478->1087|2593->1170|2756->1297|2797->1329|2837->1331|2958->1416|2972->1421|3009->1436|3067->1463|3167->1528|3202->1554|3242->1556|3382->1679|3395->1684|3434->1685|3947->2163|3982->2189|4021->2190|4165->2315|4178->2319|4217->2320|4274->2341|4315->2366|4355->2368|4439->2632|4517->2674|4532->2680|4592->2718|4659->2748|4675->2754|4707->2763|4792->2811|4808->2817|4834->2820|4877->2826|4893->2832|4925->2841|5003->2883|5018->2889|5053->2902|5127->2940|5142->2946|5173->2955|5287->3037|5340->3058|5454->3141|5513->3169
                    LINES: 26->1|32->1|33->4|36->7|36->7|36->7|44->15|44->15|44->15|51->22|51->22|51->22|52->23|52->23|52->23|53->24|54->25|54->25|54->25|55->26|55->26|55->26|56->27|63->34|63->34|63->34|65->36|65->36|65->36|67->38|72->43|72->43|72->43|78->49|78->49|78->49|91->62|91->62|91->62|95->66|95->66|95->66|96->67|96->67|96->67|98->69|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|99->70|100->71|100->71|100->71|101->72|101->72|101->72|104->75|105->76|110->81|115->86
                    -- GENERATED --
                */
            