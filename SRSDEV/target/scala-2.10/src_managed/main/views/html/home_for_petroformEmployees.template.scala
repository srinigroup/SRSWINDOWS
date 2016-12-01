
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
object home_for_petroformEmployees extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

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
									        <div class="panel-heading"><b>Verify Timesheets</b></div>
                                				<div class="panel-body">
                                					<a href=""""),_display_(Seq[Any](/*15.48*/routes/*15.54*/.Timesheets.showSelectPageForVerify("no_date"))),format.raw/*15.100*/(""""><img src=""""),_display_(Seq[Any](/*15.113*/routes/*15.119*/.Assets.at("images/tabImages/approval.jpg"))),format.raw/*15.162*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:70px;">
					                                        <p class="text-muted">
					                                         Approve Time Sheet</p>
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
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_for_petroformEmployees.scala.html
                    HASH: c9add34d1b9ecbb318060fb98fdaba765ce383ff
                    MATRIX: 886->2|897->6|934->7|1605->642|1620->648|1689->694|1739->707|1755->713|1821->756
                    LINES: 29->1|29->1|29->1|43->15|43->15|43->15|43->15|43->15|43->15
                    -- GENERATED --
                */
            