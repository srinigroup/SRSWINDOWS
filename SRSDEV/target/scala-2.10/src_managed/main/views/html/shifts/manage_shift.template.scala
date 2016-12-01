
package views.html.shifts

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
object manage_shift extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(page : String, store : Store):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*5.2*/link/*5.6*/(action:String) = {{

    
   
    var url = page+"_"+action
   	url
    
}};def /*15.2*/shiftlink/*15.11*/(storeId:Long, term_head:String) = {{
    
      // Generate the link
    routes.Shifts.showBlank(storeId, term_head,"ADD")
    
}};def /*22.2*/display/*22.9*/() = {{

var result = "";

	
		if(Shifts.getOPENStatus()){
		   result = "disabled";
		}	
									  

result;
}};
Seq[Any](format.raw/*1.32*/("""



"""),format.raw/*12.2*/("""


"""),format.raw/*20.2*/("""

"""),format.raw/*33.2*/("""

"""),_display_(Seq[Any](/*35.2*/main/*35.6*/{_display_(Seq[Any](format.raw/*35.7*/("""

  
          
 			
      
               
        <div class="wrapper">
            <div class="container" >
                <div class="row">
                 	<div class="span12">
       
       					<span>
        					<div id="bc1" class="btn-group btn-breadcrumb">
            					<a href=""""),_display_(Seq[Any](/*49.28*/routes/*49.34*/.Application.index())),format.raw/*49.54*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            					<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*50.55*/page)),format.raw/*50.59*/("""</a>
        					</div>
        				</span>
         				<span class="pull-right" style="padding-right:50px;">
           					<div>
            					<a href=""""),_display_(Seq[Any](/*55.28*/routes/*55.34*/.Application.index())),format.raw/*55.54*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
		                                     	 	<a href="#myModal" role="button"  data-toggle="modal"><img src=""""),_display_(Seq[Any](/*69.108*/routes/*69.114*/.Assets.at("images/tabImages/add.png"))),format.raw/*69.152*/("""" class="img-responsive center-block" alt="Image" style="width:15%">
	                            					<p class="text-muted">Profit</p>
                                            		</a>
				                                     </div>
										   		</div> 
										  	</div>
			                                <div class="col-sm-6 col-md-6">
												<div class="panel panel-success" >
												 	<div class="panel-heading"><b>VIEW</b></div>
			                                			<div class="panel-body">
						                                 		<a href=""""),_display_(Seq[Any](/*79.52*/routes/*79.58*/.Application.showOptions(page,"VIEW"))),format.raw/*79.95*/(""""><img src=""""),_display_(Seq[Any](/*79.108*/routes/*79.114*/.Assets.at("images/tabImages/view.jpg"))),format.raw/*79.153*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:25%">
						                                        <p class="text-muted">New Users</p>
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
				                                     	 	 <a href=""""),_display_(Seq[Any](/*97.56*/routes/*97.62*/.Application.showOptions(page,"MODIFY"))),format.raw/*97.101*/("""" ><img src=""""),_display_(Seq[Any](/*97.115*/routes/*97.121*/.Assets.at("images/tabImages/modify.png"))),format.raw/*97.162*/("""" class="img-responsive center-block" alt="Image" align="middle"  style="width:15%">
						                                     <p class="text-muted"> Growth</p>
						                                    </a>
						                                     </div>
												   		</div> 
												  	</div>
												  	 """),_display_(Seq[Any](/*103.18*/if((session.get("role")).contains("sa"))/*103.58*/{_display_(Seq[Any](format.raw/*103.59*/("""
					                                <div class="col-sm-6 col-md-6">
														<div class="panel panel-success" >
														 	<div class="panel-heading"><b>DELETE</b></div>
					                                			<div class="panel-body">
						                                 		 
								                                    <a href=""""),_display_(Seq[Any](/*109.55*/routes/*109.61*/.Application.showOptions(page,"DELETE"))),format.raw/*109.100*/(""""><img src=""""),_display_(Seq[Any](/*109.113*/routes/*109.119*/.Assets.at("images/tabImages/delete.png"))),format.raw/*109.160*/("""" class="img-responsive center-block" alt="Image" align="middle" style="width:15%">
								                                        <p class="text-muted">New Users</p>
								                                    </a>
								                                  
					                                     		</div>
												   		</div> 
												  	</div>
				                                     """)))})),format.raw/*116.43*/("""                                 
		                                </div>
		                             </div>
		                         </div> <!-- content -->                     
                                   
				        <div class="footer">
				          <hr/>   
				            <div class="container">
				               <p  class="pull-right"> <b class="copyright">&copy; 2015 SRINI Group &nbsp;</b>All rights reserved.</p>
				            </div>
				        </div> <!-- footer -->
        
       
       
				       <!-- Model  start-->
				
						<div
						id="myModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
						aria-hidden="true" style="background-color: rgba(0, 0, 0,0.3);">
						    <div class="modal-dialog" style="margin-top:8%">
						        <div class="modal-content">
						            <div class="modal-header" style="padding:0px;">
						                <!--   <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button> -->
						                	<h3 id="myModalLabel" style="text-align:center;">Select Terminal</h3>
						
						            </div>
						            <div class="modal-body" style="  width: 100%; padding-right: 0px; padding-left: 0px;">
						               <form action=""""),_display_(Seq[Any](/*143.37*/shiftlink(store.id,""))),format.raw/*143.59*/("""" method="GET" style="text-align:center;" id='shiftAddForm'>
				 						
								          <select id="thead" name="thead" class="form-control" style="width:80%; margin-left:10%">
											  """),_display_(Seq[Any](/*146.15*/for(terminalHead <- store.terminalHeads) yield /*146.55*/ {_display_(Seq[Any](format.raw/*146.57*/("""
								                    
								                         <option value="""),_display_(Seq[Any](/*148.49*/terminalHead/*148.61*/.name)),format.raw/*148.66*/(""" >"""),_display_(Seq[Any](/*148.69*/terminalHead/*148.81*/.name)),format.raw/*148.86*/(""" </option>
								                                            
								                  """)))})),format.raw/*150.28*/(""" 
								           </select>
								          
								           <hr style="width:100%"/>
								            <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">Close</button>
								          <input type="submit" id="newshift" value="Add new Shift" class="btn btn-info" """),_display_(Seq[Any](/*155.98*/display)),format.raw/*155.105*/("""></p>
								        </form>
						            </div>
						            
						        </div>
						    </div>
						    </div>
				      
				 		 <!-- Model  end-->
				 		 
				 		 
					</div>
				</div>
			</div>
		</div> <!- wrapper -->
    
    """)))})),format.raw/*171.6*/("""

										  	
										  	
	 		
                                
                                 """))}
    }
    
    def render(page:String,store:Store): play.api.templates.HtmlFormat.Appendable = apply(page,store)
    
    def f:((String,Store) => play.api.templates.HtmlFormat.Appendable) = (page,store) => apply(page,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/shifts/manage_shift.scala.html
                    HASH: 6aa87f3884327dad214e5a83c9cf4aa2744bfbd4
                    MATRIX: 794->1|901->40|912->44|1008->133|1026->142|1175->282|1190->289|1343->31|1378->126|1411->277|1442->411|1482->416|1494->420|1532->421|1881->734|1896->740|1938->760|2085->871|2111->875|2313->1041|2328->1047|2370->1067|3143->1803|3159->1809|3220->1847|3831->2422|3846->2428|3905->2465|3955->2478|3971->2484|4033->2523|5039->3493|5054->3499|5116->3538|5167->3552|5183->3558|5247->3599|5613->3928|5663->3968|5703->3969|6090->4319|6106->4325|6169->4364|6220->4377|6237->4383|6302->4424|6742->4831|8098->6150|8143->6172|8377->6369|8434->6409|8475->6411|8592->6491|8614->6503|8642->6508|8682->6511|8704->6523|8732->6528|8858->6621|9198->6924|9229->6931|9530->7200
                    LINES: 26->1|28->5|28->5|35->15|35->15|40->22|40->22|52->1|56->12|59->20|61->33|63->35|63->35|63->35|77->49|77->49|77->49|78->50|78->50|83->55|83->55|83->55|97->69|97->69|97->69|107->79|107->79|107->79|107->79|107->79|107->79|125->97|125->97|125->97|125->97|125->97|125->97|131->103|131->103|131->103|137->109|137->109|137->109|137->109|137->109|137->109|144->116|171->143|171->143|174->146|174->146|174->146|176->148|176->148|176->148|176->148|176->148|176->148|178->150|183->155|183->155|199->171
                    -- GENERATED --
                */
            