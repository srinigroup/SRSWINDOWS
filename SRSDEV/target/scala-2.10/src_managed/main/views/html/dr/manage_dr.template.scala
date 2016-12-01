
package views.html.dr

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
object manage_dr extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page : String,store : Store):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*5.2*/link/*5.6*/(action:String) = {{

    
   
    var url = page+"_"+action
   	url
    
}};def /*15.2*/display/*15.9*/() = {{

var result = "";

		if(DailyReconciliations.getOPENStatus(store.id)){
		   result = "disabled";
		}							  

result;
}};
Seq[Any](format.raw/*1.31*/("""



"""),format.raw/*12.2*/("""


"""),format.raw/*24.2*/("""
"""),_display_(Seq[Any](/*25.2*/main/*25.6*/{_display_(Seq[Any](format.raw/*25.7*/("""

        <div class="wrapper">
            <div class="container" >
                <div class="row">
                    <div class="span12">
       
       					<span>
        					<div id="bc1" class="btn-group btn-breadcrumb">
            					<a href=""""),_display_(Seq[Any](/*34.28*/routes/*34.34*/.Application.index())),format.raw/*34.54*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            					<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*35.55*/page)),format.raw/*35.59*/("""</a>
            				</div>
            			</span>
         				<span class="pull-right" style="padding-right:50px;">
           					<div>
            					<a href=""""),_display_(Seq[Any](/*40.28*/routes/*40.34*/.Application.index())),format.raw/*40.54*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
				                                    <a href="#myModal" data-toggle="modal"><img src=""""),_display_(Seq[Any](/*55.91*/routes/*55.97*/.Assets.at("images/tabImages/add.png"))),format.raw/*55.135*/("""" class="img-responsive center-block" alt="Image" style="width:15%">
				                                        <p class="text-muted">
				                                            profit</p>
				                                    </a>
				                                     </div>
										   		</div> 
										  	</div>
                                <div class="col-sm-6 col-md-6">
									<div class="panel panel-success" >
									 	<div class="panel-heading"><b>VIEW</b></div>
                                			<div class="panel-body">
			                                 	<a href=""""),_display_(Seq[Any](/*66.48*/routes/*66.54*/.Application.showOptions(page,"VIEW"))),format.raw/*66.91*/(""""><img src=""""),_display_(Seq[Any](/*66.104*/routes/*66.110*/.Assets.at("images/tabImages/view.jpg"))),format.raw/*66.149*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:25%">
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
			                                    <a href=""""),_display_(Seq[Any](/*86.50*/routes/*86.56*/.Application.showOptions(page,"MODIFY"))),format.raw/*86.95*/(""""><img src=""""),_display_(Seq[Any](/*86.108*/routes/*86.114*/.Assets.at("images/tabImages/modify.png"))),format.raw/*86.155*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:15%">
			                                        <p class="text-muted" style="margin-top:10px;">
			                                             Growth</p>
			                                    </a>
                                       </div>
							   		</div> 
							  	</div>
                                    """),_display_(Seq[Any](/*93.38*/if((session.get("role")).contains("sa"))/*93.78*/{_display_(Seq[Any](format.raw/*93.79*/("""
                                  <div class="col-sm-6 col-md-6">
									<div class="panel panel-success" >
									 	<div class="panel-heading"><b>DELETE</b></div>
                                			<div class="panel-body">
			                                    <a href=""""),_display_(Seq[Any](/*98.50*/routes/*98.56*/.Application.showOptions(page,"DELETE"))),format.raw/*98.95*/(""""><img src=""""),_display_(Seq[Any](/*98.108*/routes/*98.114*/.Assets.at("images/tabImages/delete.png"))),format.raw/*98.155*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:15%">
                                        <p class="text-muted" style="margin-top:30px;">
                                            New Users</p>
                                    </a>   
                                       </div>
							   		</div> 
							  	</div>
                                    """)))})),format.raw/*105.38*/("""
                                                     
                                   
                                                                      
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
						                	<h3 id="myModalLabel" style="text-align:center;">DAILY RECONCILIATION</h3>
						
						            </div>
						            <div class="modal-body" style="  width: 100%; padding-right: 0px; padding-left: 0px;">
						               
								          <a class="btn btn-primary" style="margin-left:30%;" id="add" href=""""),_display_(Seq[Any](/*136.87*/routes/*136.93*/.DailyReconciliations.showBlank(store.id))),format.raw/*136.134*/("""" """),_display_(Seq[Any](/*136.137*/display)),format.raw/*136.144*/(""">Add DailyReconciliation</a>
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
 
    
    """)))})),format.raw/*155.6*/("""
"""))}
    }
    
    def render(page:String,store:Store): play.api.templates.HtmlFormat.Appendable = apply(page,store)
    
    def f:((String,Store) => play.api.templates.HtmlFormat.Appendable) = (page,store) => apply(page,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:06 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dr/manage_dr.scala.html
                    HASH: 5c37ee5f7e7a2884a705afad1d48d494fd561075
                    MATRIX: 787->1|893->39|904->43|1000->132|1015->139|1182->30|1217->125|1250->275|1288->278|1300->282|1338->283|1642->551|1657->557|1699->577|1846->688|1872->692|2080->864|2095->870|2137->890|2893->1610|2908->1616|2969->1654|3618->2267|3633->2273|3692->2310|3742->2323|3758->2329|3820->2368|4907->3419|4922->3425|4983->3464|5033->3477|5049->3483|5113->3524|5555->3930|5604->3970|5643->3971|5962->4254|5977->4260|6038->4299|6088->4312|6104->4318|6168->4359|6602->4760|8197->6318|8213->6324|8278->6365|8319->6368|8350->6375|8899->6892
                    LINES: 26->1|28->5|28->5|35->15|35->15|45->1|49->12|52->24|53->25|53->25|53->25|62->34|62->34|62->34|63->35|63->35|68->40|68->40|68->40|83->55|83->55|83->55|94->66|94->66|94->66|94->66|94->66|94->66|114->86|114->86|114->86|114->86|114->86|114->86|121->93|121->93|121->93|126->98|126->98|126->98|126->98|126->98|126->98|133->105|164->136|164->136|164->136|164->136|164->136|183->155
                    -- GENERATED --
                */
            