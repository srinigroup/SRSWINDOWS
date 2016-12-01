
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
object home_su extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.3*/main/*1.7*/{_display_(Seq[Any](format.raw/*1.8*/("""
 
 <style>
.img-responsive """),format.raw/*4.17*/("""{"""),format.raw/*4.18*/("""
    width: 60px;
"""),format.raw/*6.1*/("""}"""),format.raw/*6.2*/("""

</style>           
        <div class="wrapper">
            <div class="container">
                <div class="row">
                    <div class="span12">
                    
                        <div class="content">
                            <div class="btn-controls">
                                <div class="btn-box-row row-fluid">
                                	 <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>REPORTS</b></div>
                                				<div class="panel-body">
			                                		<a href=""""),_display_(Seq[Any](/*21.48*/routes/*21.54*/.Reports.getReportHome())),format.raw/*21.78*/(""""><img src=""""),_display_(Seq[Any](/*21.91*/routes/*21.97*/.Assets.at("images/tabImages/reports.jpg"))),format.raw/*21.139*/("""" class="img-responsive center-block" alt="Image">
			                                        <p class="text-muted"> Reports Generation</p>
			                                   		 </a>
	                                     		</div>
										      </div> 
										   </div>
										   <div class="col-sm-3 col-md-3">
									      <div class="panel panel-success">
									        <div class="panel-heading"><b>INVOICE PAYMENT</b></div>
                                				<div class="panel-body">
				                                  	  <a href=""""),_display_(Seq[Any](/*31.52*/routes/*31.58*/.InvoiceInventory.showPaymentPage("noCompany","noStore","noCategory","noPaymentTerm"))),format.raw/*31.143*/(""""><img src=""""),_display_(Seq[Any](/*31.156*/routes/*31.162*/.Assets.at("images/tabImages/payment.jpg"))),format.raw/*31.204*/("""" class="img-responsive center-block" alt="Image">
				                                        <p class="text-muted">Payments Done Here</p>
				                                   	</a>  
	                                     		</div>
										   </div> 
										  </div>
                                
                                  
                                    
                            	</div>
                        	</div>
                        </div>  <!-- content -->
       
       				</div> <!-- span 12 -->
        		</div> <!-- row -->
      		</div> <!-- container -->
     	</div> <!-- wrapper -->
		 <div class="wrapper">
            <div class="container">
                <div class="row">
			     	 <div class="footer">
				          <hr/>   
				            <div class="container">
				               <p  class="pull-right"> <b class="copyright">&copy; 2014 SRINI Group &nbsp;</b>All rights reserved.</p>
				            </div>
					 </div> <!-- footer -->
					 </div> <!-- row -->
      		</div> <!-- container -->
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:01 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/home_su.scala.html
                    HASH: b66cd1212d6227fb413c2d95ba69b8178f1d968a
                    MATRIX: 866->2|877->6|914->7|969->35|997->36|1041->54|1068->55|1745->696|1760->702|1806->726|1855->739|1870->745|1935->787|2527->1343|2542->1349|2650->1434|2700->1447|2716->1453|2781->1495
                    LINES: 29->1|29->1|29->1|32->4|32->4|34->6|34->6|49->21|49->21|49->21|49->21|49->21|49->21|59->31|59->31|59->31|59->31|59->31|59->31
                    -- GENERATED --
                */
            