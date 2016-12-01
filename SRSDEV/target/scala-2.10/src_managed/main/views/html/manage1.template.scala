
package views.html

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
object manage1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*5.2*/link/*5.6*/(action:String) = {{

    
   
    var url = page+"_"+action
   	url
    
}};
Seq[Any](format.raw/*1.17*/("""



"""),format.raw/*12.2*/("""


"""),_display_(Seq[Any](/*15.2*/main/*15.6*/{_display_(Seq[Any](format.raw/*15.7*/("""               
        
        <div class="wrapper">
            <div class="container" >
			    <div class="row">
                    <div class="span12">
       
       					<span>
        					<div id="bc1" class="btn-group btn-breadcrumb">
            					<a href=""""),_display_(Seq[Any](/*24.28*/routes/*24.34*/.Application.index())),format.raw/*24.54*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            					<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*25.55*/page)),format.raw/*25.59*/("""</a>
        					</div>
        				</span>
        
         				<span class="pull-right" style="padding-right:50px;">
           					<div>
            					<a href=""""),_display_(Seq[Any](/*31.28*/routes/*31.34*/.Application.index())),format.raw/*31.54*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
        					</div>
        				</span>      
            		</div>
        		</div>
                     	<br><br>
            
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row  row-fluid">
                        			<div class="col-sm-6 col-md-6">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>ADD</b></div>
                                				<div class="panel-body">
				                                    <a href=""""),_display_(Seq[Any](/*45.51*/routes/*45.57*/.Application.showOptions(page,"ADD"))),format.raw/*45.93*/(""""><img src=""""),_display_(Seq[Any](/*45.106*/routes/*45.112*/.Assets.at("images/tabImages/add.png"))),format.raw/*45.150*/("""" class="img-responsive center-block" alt="Image" style="width:15%">
				                                        <p class="text-muted">
				                                            """),_display_(Seq[Any](/*47.50*/page)),format.raw/*47.54*/("""</p>
				                                    </a>
				                                     </div>
										   		</div> 
										  	</div>
                                <div class="col-sm-6 col-md-6">
									<div class="panel panel-success" >
									 	<div class="panel-heading"><b>VIEW</b></div>
                                			<div class="panel-body">
			                                 	<a href=""""),_display_(Seq[Any](/*56.48*/routes/*56.54*/.Application.showOptions(page,"VIEW"))),format.raw/*56.91*/(""""><img src=""""),_display_(Seq[Any](/*56.104*/routes/*56.110*/.Assets.at("images/tabImages/view.jpg"))),format.raw/*56.149*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:25%">
			                                        <p class="text-muted" style="margin-top:5px;">
			                                            """),_display_(Seq[Any](/*58.49*/page)),format.raw/*58.53*/("""</p>
			                                    </a>
			                                     </div>
										   		</div> 
										  	</div>
	                                </div>
	                            </div>
	                        </div> <!-- content -->
                        
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	<div class="col-sm-6 col-md-6">
									<div class="panel panel-success" >
									 	<div class="panel-heading"><b>MODIFY</b></div>
                                			<div class="panel-body">
			                                    <a href=""""),_display_(Seq[Any](/*74.50*/routes/*74.56*/.Application.showOptions(page,"MODIFY"))),format.raw/*74.95*/(""""><img src=""""),_display_(Seq[Any](/*74.108*/routes/*74.114*/.Assets.at("images/tabImages/modify.png"))),format.raw/*74.155*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:15%">
			                                        <p class="text-muted" style="margin-top:10px;">
			                                            """),_display_(Seq[Any](/*76.49*/page)),format.raw/*76.53*/("""</p>
			                                    </a>
                                       </div>
							   		</div> 
							  	</div>
                                    """),_display_(Seq[Any](/*81.38*/if((session.get("role")).contains("sa"))/*81.78*/{_display_(Seq[Any](format.raw/*81.79*/("""
                                  <div class="col-sm-6 col-md-6">
									<div class="panel panel-success" >
									 	<div class="panel-heading"><b>DELETE</b></div>
                                			<div class="panel-body">
			                                    <a href=""""),_display_(Seq[Any](/*86.50*/routes/*86.56*/.Application.showOptions(page,"DELETE"))),format.raw/*86.95*/(""""><img src=""""),_display_(Seq[Any](/*86.108*/routes/*86.114*/.Assets.at("images/tabImages/delete.png"))),format.raw/*86.155*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:15%">
                                        <p class="text-muted" style="margin-top:30px;">
                                            """),_display_(Seq[Any](/*88.46*/page)),format.raw/*88.50*/("""</p>
                                    </a>   
                                       </div>
							   		</div> 
							  	</div>
                                    """)))})),format.raw/*93.38*/("""
                                                                     
                                </div>
                             </div>
                         </div> <!-- content -->
                                   
				        <div class="footer">
				          <hr/>   
				            <div class="container">
				               <p  class="pull-right"> <b class="copyright">&copy; 2015 SRINI Group &nbsp;</b>All rights reserved.</p>
				            </div>
				        </div> <!-- footer -->
        
       				</div> <!-- span 12 -->
       			</div> <!-- row -->
      		</div> <!-- container -->
 		</div> <!-- wrapper -->
    
    """)))})),format.raw/*111.6*/("""
"""))}
    }
    
    def render(page:String): play.api.templates.HtmlFormat.Appendable = apply(page)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (page) => apply(page)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:02 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/manage1.scala.html
                    HASH: b5cb253e02e280c7a2749543d77119d29b19e92e
                    MATRIX: 776->1|868->25|879->29|991->16|1026->111|1068->118|1080->122|1118->123|1436->405|1451->411|1493->431|1640->542|1666->546|1878->722|1893->728|1935->748|2630->1407|2645->1413|2703->1449|2753->1462|2769->1468|2830->1506|3053->1693|3079->1697|3536->2118|3551->2124|3610->2161|3660->2174|3676->2180|3738->2219|3999->2444|4025->2448|4811->3198|4826->3204|4887->3243|4937->3256|4953->3262|5017->3303|5279->3529|5305->3533|5515->3707|5564->3747|5603->3748|5922->4031|5937->4037|5998->4076|6048->4089|6064->4095|6128->4136|6383->4355|6409->4359|6615->4533|7318->5204
                    LINES: 26->1|28->5|28->5|36->1|40->12|43->15|43->15|43->15|52->24|52->24|52->24|53->25|53->25|59->31|59->31|59->31|73->45|73->45|73->45|73->45|73->45|73->45|75->47|75->47|84->56|84->56|84->56|84->56|84->56|84->56|86->58|86->58|102->74|102->74|102->74|102->74|102->74|102->74|104->76|104->76|109->81|109->81|109->81|114->86|114->86|114->86|114->86|114->86|114->86|116->88|116->88|121->93|139->111
                    -- GENERATED --
                */
            