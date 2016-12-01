
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
object home_headOffice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main/*1.7*/{_display_(Seq[Any](format.raw/*1.8*/("""
 <style>
.img-responsive """),format.raw/*3.17*/("""{"""),format.raw/*3.18*/("""
    width: 60px;
"""),format.raw/*5.1*/("""}"""),format.raw/*5.2*/("""
</style>
         
   
         <div class="wrapper">
            <div class="container">
                <div class="row">
                    <div class="span12">
                    
                 	  <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	 <div class="col-sm-4 col-md-4">
									      <div class="panel panel-success" >
									        <div class="panel-heading"><b>TIMESHEET</b></div>
                                				<div class="panel-body">
				                                	<a href=""""),_display_(Seq[Any](/*21.48*/routes/*21.54*/.Application.showOptions("ADD TIMESHEET","ALL"))),format.raw/*21.101*/(""""><img src=""""),_display_(Seq[Any](/*21.114*/routes/*21.120*/.Assets.at("images/tabImages/timesheet.png"))),format.raw/*21.164*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:60px;">
					                                        <p class="text-muted">
					                                           Head Office Time Sheet</p>
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
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_headOffice.scala.html
                    HASH: d2217d521e5aa3c58235c2832cd42a6e83bc9ec4
                    MATRIX: 874->2|885->6|922->7|975->33|1003->34|1047->52|1074->53|1753->696|1768->702|1838->749|1888->762|1904->768|1971->812
                    LINES: 29->1|29->1|29->1|31->3|31->3|33->5|33->5|49->21|49->21|49->21|49->21|49->21|49->21
                    -- GENERATED --
                */
            