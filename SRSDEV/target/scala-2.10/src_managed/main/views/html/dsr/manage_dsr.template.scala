
package views.html.dsr

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
object manage_dsr extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page : String,store : Store):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*5.2*/link/*5.6*/(action:String) = {{

    
   
    var url = page+"_"+action
   	url
    
}};def /*15.2*/display/*15.9*/() = {{

var result = "";

		if(DailySalesReconciliations.getOPENStatus(store.id)){
		   result = "disabled";
		}							  

result;
}};
Seq[Any](format.raw/*1.31*/("""



"""),format.raw/*12.2*/("""


"""),format.raw/*24.2*/("""

"""),_display_(Seq[Any](/*26.2*/main/*26.6*/{_display_(Seq[Any](format.raw/*26.7*/("""

        <div class="wrapper">
            <div class="container" >
                <div class="row">
                    <div class="span12">
       
       					<span>
        					<div id="bc1" class="btn-group btn-breadcrumb">
            					<a href=""""),_display_(Seq[Any](/*35.28*/routes/*35.34*/.Application.index())),format.raw/*35.54*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            					<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*36.55*/page)),format.raw/*36.59*/("""</a>
            				</div>
            			</span>
         				<span class="pull-right" style="padding-right:50px;">
           					<div>
            					<a href=""""),_display_(Seq[Any](/*41.28*/routes/*41.34*/.Application.index())),format.raw/*41.54*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
				                                    <a href="#myModal" role="button" data-toggle="modal"><img src=""""),_display_(Seq[Any](/*56.105*/routes/*56.111*/.Assets.at("images/tabImages/add.png"))),format.raw/*56.149*/("""" class="img-responsive center-block" alt="Image" style="width:15%">
				                                        <p class="text-muted">
				                                            Profit</p>
				                                    </a>
				                                     </div>
										   		</div> 
										  	</div>
                                <div class="col-sm-6 col-md-6">
									<div class="panel panel-success" >
									 	<div class="panel-heading"><b>VIEW</b></div>
                                			<div class="panel-body">
			                                 	<a href=""""),_display_(Seq[Any](/*67.48*/routes/*67.54*/.Application.showOptions(page,"VIEW"))),format.raw/*67.91*/(""""><img src=""""),_display_(Seq[Any](/*67.104*/routes/*67.110*/.Assets.at("images/tabImages/view.jpg"))),format.raw/*67.149*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:25%">
			                                        <p class="text-muted" style="margin-top:5px;">
			                                           New Users</p>
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
			                                    <a href=""""),_display_(Seq[Any](/*88.50*/routes/*88.56*/.Application.showOptions(page,"MODIFY"))),format.raw/*88.95*/(""""><img src=""""),_display_(Seq[Any](/*88.108*/routes/*88.114*/.Assets.at("images/tabImages/modify.png"))),format.raw/*88.155*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:15%">
			                                        <p class="text-muted" style="margin-top:10px;">
			                                           Growth</p>
			                                    </a>
                                       </div>
							   		</div> 
							  	</div>
                                    """),_display_(Seq[Any](/*95.38*/if((session.get("role")).contains("sa"))/*95.78*/{_display_(Seq[Any](format.raw/*95.79*/("""
                                  <div class="col-sm-6 col-md-6">
									<div class="panel panel-success" >
									 	<div class="panel-heading"><b>DELETE</b></div>
                                			<div class="panel-body">
			                                    <a href=""""),_display_(Seq[Any](/*100.50*/routes/*100.56*/.Application.showOptions(page,"DELETE"))),format.raw/*100.95*/(""""><img src=""""),_display_(Seq[Any](/*100.108*/routes/*100.114*/.Assets.at("images/tabImages/delete.png"))),format.raw/*100.155*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:15%">
                                        <p class="text-muted" style="margin-top:30px;">
                                            New Users</p>
                                    </a>   
                                       </div>
							   		</div> 
							  	</div>
                                    """)))})),format.raw/*107.38*/("""
                                                              
                                </div>
                             </div>
                         </div> <!-- content -->
                                              
                                   
				        <div class="footer">
				          <hr/>   
				            <div class="container">
				               <p  class="pull-right"> <b class="copyright">&copy; 2015 SRINI Group &nbsp;</b>All rights reserved.</p>
				            </div>
				        </div>
        
				      <!-- Model  start-->
				
						<div
						id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
						aria-hidden="true" style="background-color: rgba(0, 0, 0,0.3);">
						    <div class="modal-dialog" style="margin-top:8%">
						        <div class="modal-content">
						            <div class="modal-header" style="padding:0px;">
						                  <button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="font-size:30px;font-weight:200;line-height: 1;color:blue;margin-right:30px;">×</button>
						                	<h3 id="myModalLabel" style="text-align:center;">SALES RECONCILIATION</h3>
						
						            </div>
						            <div class="modal-body" style="  width: 100%; padding-right: 0px; padding-left: 0px;">
						               
								          <a class="btn btn-primary" style="margin-left:30%;" id="add" href=""""),_display_(Seq[Any](/*135.87*/routes/*135.93*/.DailySalesReconciliations.showBlank(store.id))),format.raw/*135.139*/("""" """),_display_(Seq[Any](/*135.142*/display)),format.raw/*135.149*/(""">Add DailySalesReconciliation</a>
								           <hr style="width:100%"/>
								           <!--  <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">Close</button>  -->
								         
						            </div>
						            
						        </div>
						    </div>
						    </div>
				      
				 		 <!-- Model  end-->
				 		 
				 		 
				 	</div> <!-- span 12 -->
        		</div> <!-- row -->
      		</div> <!-- container -->
     	</div> <!-- wrapper -->
 
    
    """)))})),format.raw/*154.6*/("""
"""))}
    }
    
    def render(page:String,store:Store): play.api.templates.HtmlFormat.Appendable = apply(page,store)
    
    def f:((String,Store) => play.api.templates.HtmlFormat.Appendable) = (page,store) => apply(page,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dsr/manage_dsr.scala.html
                    HASH: decb3e5990eecc0d4f0b6a894844eb0ad49cdc79
                    MATRIX: 789->1|895->39|906->43|1002->132|1017->139|1189->30|1224->125|1257->280|1297->285|1309->289|1347->290|1651->558|1666->564|1708->584|1855->695|1881->699|2089->871|2104->877|2146->897|2916->1630|2932->1636|2993->1674|3642->2287|3657->2293|3716->2330|3766->2343|3782->2349|3844->2388|4970->3478|4985->3484|5046->3523|5096->3536|5112->3542|5176->3583|5616->3987|5665->4027|5704->4028|6024->4311|6040->4317|6102->4356|6153->4369|6170->4375|6235->4416|6669->4817|8195->6306|8211->6312|8281->6358|8322->6361|8353->6368|8908->6891
                    LINES: 26->1|28->5|28->5|35->15|35->15|45->1|49->12|52->24|54->26|54->26|54->26|63->35|63->35|63->35|64->36|64->36|69->41|69->41|69->41|84->56|84->56|84->56|95->67|95->67|95->67|95->67|95->67|95->67|116->88|116->88|116->88|116->88|116->88|116->88|123->95|123->95|123->95|128->100|128->100|128->100|128->100|128->100|128->100|135->107|163->135|163->135|163->135|163->135|163->135|182->154
                    -- GENERATED --
                */
            