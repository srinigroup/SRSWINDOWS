
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
object home_management extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main/*1.7*/{_display_(Seq[Any](format.raw/*1.8*/("""
   
         <div class="wrapper">
            <div class="container">
                <div class="row">
                    <div class="span12">
                      
                 	  <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	 <div class="col-sm-4" col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>MANAGEMENT REPORTS</b></div>
                                				<div class="panel-body">
                                
				                                   <a href=""""),_display_(Seq[Any](/*16.50*/routes/*16.56*/.ManagementReports.getReportsHome())),format.raw/*16.91*/(""""><img src=""""),_display_(Seq[Any](/*16.104*/routes/*16.110*/.Assets.at("images/tabImages/reports.jpg"))),format.raw/*16.152*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:60px;">
				                                        <p class="text-muted">
				                                            View Managed Reports</p>
				                                    </a>
                                    				</div>
                           					</div>
                           				</div>
                                    
                                   
                                       
                                </div>
                           </div>
                       </div> <!-- content -->
                  
                                               
				        <div class="footer" style="color: #999;padding: 385px 0 60px;">
				          <hr/>   
				            <div class="container">
				               <p  class="pull-right"> <b class="copyright">&copy; 2014 SRINI Group &nbsp;</b>All rights reserved.</p>
				            </div> <!-- container -->
				        </div> <!-- footer -->
        
       
       				</div> <!-- span 12 -->
        		</div> <!-- row -->
      		</div> <!-- container -->
     	</div> <!-- wrapper -->
	
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:01 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_management.scala.html
                    HASH: 84064767374f9fbb28938c827123474b7e0f2847
                    MATRIX: 874->2|885->6|922->7|1629->678|1644->684|1701->719|1751->732|1767->738|1832->780
                    LINES: 29->1|29->1|29->1|44->16|44->16|44->16|44->16|44->16|44->16
                    -- GENERATED --
                */
            