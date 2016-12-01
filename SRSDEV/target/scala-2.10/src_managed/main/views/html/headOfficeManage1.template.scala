
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
object headOfficeManage1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

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
            					<a href="#" class="btn btn-default">TIMESHEET</a>
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
                                            				ADD TIMESHEET</p>
				                                    </a>
				                                     </div>
										   		</div> 
										  	</div>
	                                <div class="col-sm-6 col-md-6">
										<div class="panel panel-success" >
										 	<div class="panel-heading"><b>VIEW</b></div>
	                                			<div class="panel-body">
				                                 	<a href=""""),_display_(Seq[Any](/*56.49*/routes/*56.55*/.Application.showOptions(page,"VIEW"))),format.raw/*56.92*/(""""><img src=""""),_display_(Seq[Any](/*56.105*/routes/*56.111*/.Assets.at("images/tabImages/view.jpg"))),format.raw/*56.150*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:25%">
				                                        <p class="text-muted" style="margin-top:5px;">
				                                            VIEW TIMESHEET</p>
				                                    </a>
				                                     </div>
											   		</div> 
											  	</div>
                                </div>
                            </div>
                        </div> <!-- content -->
                        
                      """),format.raw/*85.51*/("""
                                   
				        <div class="footer" style="color: #999;padding: 308px 0 60px;">
				          <hr/>   
				            <div class="container">
				               <p  class="pull-right"> <b class="copyright">&copy; 2015 SRINI Group &nbsp;</b>All rights reserved.</p>
				            </div>
				        </div> <!-- footer -->
        
       				</div> <!-- span 12 -->
       			</div> <!-- row -->
      		</div> <!-- container -->
 		</div> <!-- wrapper -->
    
    """)))})),format.raw/*99.6*/("""
"""))}
    }
    
    def render(page:String): play.api.templates.HtmlFormat.Appendable = apply(page)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (page) => apply(page)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:00 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/headOfficeManage1.scala.html
                    HASH: aa6b7ac016cf711fa393272a507bedcdf3edf421
                    MATRIX: 786->1|878->25|889->29|1001->16|1036->111|1078->118|1090->122|1128->123|1446->405|1461->411|1503->431|1834->726|1849->732|1891->752|2592->1417|2607->1423|2665->1459|2715->1472|2731->1478|2792->1516|3454->2142|3469->2148|3528->2185|3578->2198|3594->2204|3656->2243|4245->3983|4792->4499
                    LINES: 26->1|28->5|28->5|36->1|40->12|43->15|43->15|43->15|52->24|52->24|52->24|59->31|59->31|59->31|73->45|73->45|73->45|73->45|73->45|73->45|84->56|84->56|84->56|84->56|84->56|84->56|95->85|109->99
                    -- GENERATED --
                */
            