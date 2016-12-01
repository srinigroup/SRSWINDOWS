
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
object drViewOptions extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template8[com.avaje.ebean.Page[DailyReconciliation],String,String,String,String,String,String,Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[DailyReconciliation], currentSortBy: String, currentOrder: String, currentFilter: String, pageAction: String, startDate:String, endDate:String, storeId:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/checkSelected/*3.15*/(id:Long) = {{

	var result = "";
	
	if(id==storeId){
       	
       	result = "selected";
       	}
    
    result


}};def /*19.2*/currentDateFormat/*19.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.194*/("""

"""),format.raw/*15.2*/("""



"""),format.raw/*27.2*/("""

"""),_display_(Seq[Any](/*29.2*/main/*29.6*/ {_display_(Seq[Any](format.raw/*29.8*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*37.24*/routes/*37.30*/.Application.index())),format.raw/*37.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">DR VIEW</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*43.27*/routes/*43.33*/.Application.index())),format.raw/*43.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
	
	
	
    <div id="actions">
     	
     	<form action=""""),_display_(Seq[Any](/*54.22*/routes/*54.28*/.DailyReconciliations.drViewOptions(0,"reportingBusinessDate","desc","SUBMITTED","VIEW"))),format.raw/*54.116*/("""" method="GET">
     		
     		<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
  						<td>
            				<div class="clearfix" id="storeId_field">
								<label for="storeId">Select Store</label>
									<div class="input">
										<select name="storeId" id="searchbox" required>
						            		<option class="blank" value="">-- Choose a Store --</option>
						  					"""),_display_(Seq[Any](/*65.15*/for(store <- Stores.getStoresList()) yield /*65.51*/{_display_(Seq[Any](format.raw/*65.52*/("""
						  						<option value=""""),_display_(Seq[Any](/*66.31*/store/*66.36*/.id)),format.raw/*66.39*/("""" """),_display_(Seq[Any](/*66.42*/checkSelected(store.id))),format.raw/*66.65*/(""">"""),_display_(Seq[Any](/*66.67*/store/*66.72*/.name)),format.raw/*66.77*/("""</option>
						  					""")))})),format.raw/*67.15*/("""
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
							<div class="clearfix  " id="date_field">
		    					<label for="date">Start Date</label>
		    					<div class="input">
		        					<input type="text" name="drStartDate" value=""""),_display_(Seq[Any](/*77.62*/startDate)),format.raw/*77.71*/("""" class="startDatePicker" required />
		    					</div>
							</div>
						</td>
						
						<td>
							<div class="clearfix  " id="endDate_field">
		    					<label for="endDate">End Date</label>
		    					<div class="input">
		        					<input type="text" name="drEndDate" value=""""),_display_(Seq[Any](/*86.60*/endDate)),format.raw/*86.67*/("""" class="endDatePicker" required />
		    					</div>
							</div>
						</td>
						
					  	<td>
            					<input type="submit" id="searchsubmit" value="View" class="btn btn-primary" style="margin-top:7px">
					  	</td>
     					
            		</tr>
            	</table>
            </div>
    
        </form>
        
        
    </div>
    
    """),_display_(Seq[Any](/*104.6*/if(currentPage.getTotalRowCount == 0)/*104.43*/ {_display_(Seq[Any](format.raw/*104.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*110.7*/else/*110.12*/{_display_(Seq[Any](format.raw/*110.13*/("""
        
        <div class="table-responsive">
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Created Date</th>
                  
                    <th>Reporting Business Date</th>
                    
                       
                    
                    
                      <th>Store Name</th>
                      
                        <th>Cash in Safe</th>
                        
                         <th>Cheques in Safe</th>
                         
                         <th>Total Sales Reported</th>
                      
                       <th>Status</th>
                       
                      
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*139.18*/for(dsr <- currentPage.getList) yield /*139.49*/ {_display_(Seq[Any](format.raw/*139.51*/("""
                    <tr>
                        <td><a href=""""),_display_(Seq[Any](/*141.39*/routes/*141.45*/.DailyReconciliations.edit(dsr.id,flash.get("pageAction")))),format.raw/*141.103*/("""">"""),_display_(Seq[Any](/*141.106*/currentDateFormat(dsr.createDate))),format.raw/*141.139*/("""</a></td>
                       
                       
                        <td>
                            """),_display_(Seq[Any](/*145.30*/if(dsr.reportingBusinessDate == null)/*145.67*/ {_display_(Seq[Any](format.raw/*145.69*/("""
                                <em>-</em>
                            """)))}/*147.31*/else/*147.36*/{_display_(Seq[Any](format.raw/*147.37*/("""
                            
                            	"""),_display_(Seq[Any](/*149.31*/currentDateFormat(dsr.reportingBusinessDate))),format.raw/*149.75*/("""
                               
                            """)))})),format.raw/*151.30*/("""
                        </td>
                        
                        
                         
                         <td>
                            """),_display_(Seq[Any](/*157.30*/if(dsr.store.name == null)/*157.56*/ {_display_(Seq[Any](format.raw/*157.58*/("""
                                <em>-</em>
                            """)))}/*159.31*/else/*159.36*/{_display_(Seq[Any](format.raw/*159.37*/("""
                                """),_display_(Seq[Any](/*160.34*/dsr/*160.37*/.store.name)),format.raw/*160.48*/("""  
                            """)))})),format.raw/*161.30*/("""
                        </td>
                      
                         <td>
                            """),_display_(Seq[Any](/*165.30*/if(dsr.open_cash  == null)/*165.56*/ {_display_(Seq[Any](format.raw/*165.58*/("""
                                <em>-</em>
                            """)))}/*167.31*/else/*167.36*/{_display_(Seq[Any](format.raw/*167.37*/("""
                              """),_display_(Seq[Any](/*168.32*/dsr/*168.35*/.close_cash)),format.raw/*168.46*/("""
                               
                            """)))})),format.raw/*170.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*173.30*/if(dsr.open_cheque == null)/*173.57*/ {_display_(Seq[Any](format.raw/*173.59*/("""
                                <em>-</em>
                            """)))}/*175.31*/else/*175.36*/{_display_(Seq[Any](format.raw/*175.37*/("""
                                """),_display_(Seq[Any](/*176.34*/dsr/*176.37*/.close_cheque)),format.raw/*176.50*/("""
                               
                            """)))})),format.raw/*178.30*/("""
                        </td>
                       	 	<td>
								"""),_display_(Seq[Any](/*181.10*/DailySalesReconciliation/*181.34*/.getTotalSalesAmount(dsr.dsr))),format.raw/*181.63*/("""
							</td>
                          <td>
                            """),_display_(Seq[Any](/*184.30*/if(dsr.status == null)/*184.52*/ {_display_(Seq[Any](format.raw/*184.54*/("""
                                <em>-</em>
                            """)))}/*186.31*/else/*186.36*/{_display_(Seq[Any](format.raw/*186.37*/("""
                                """),_display_(Seq[Any](/*187.34*/dsr/*187.37*/.status)),format.raw/*187.44*/(""" 
                            """)))})),format.raw/*188.30*/("""
                        </td>
                    </tr>
                """)))})),format.raw/*191.18*/("""

            </tbody>
        </table>
		</div>
        
    """)))})),format.raw/*197.6*/("""
        
       
       </div>
	</div>
       
""")))})),format.raw/*203.2*/("""

               """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[DailyReconciliation],currentSortBy:String,currentOrder:String,currentFilter:String,pageAction:String,startDate:String,endDate:String,storeId:Long): play.api.templates.HtmlFormat.Appendable = apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction,startDate,endDate,storeId)
    
    def f:((com.avaje.ebean.Page[DailyReconciliation],String,String,String,String,String,String,Long) => play.api.templates.HtmlFormat.Appendable) = (currentPage,currentSortBy,currentOrder,currentFilter,pageAction,startDate,endDate,storeId) => apply(currentPage,currentSortBy,currentOrder,currentFilter,pageAction,startDate,endDate,storeId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:04 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dr/drViewOptions.scala.html
                    HASH: c0ca1b3c666c2ac0ac3cc7f480a0ba708395616b
                    MATRIX: 867->1|1136->198|1157->211|1304->353|1330->370|1549->193|1580->344|1615->558|1655->563|1667->567|1706->569|1979->806|1994->812|2036->832|2351->1111|2366->1117|2408->1137|2673->1366|2688->1372|2799->1460|3318->1943|3370->1979|3409->1980|3477->2012|3491->2017|3516->2020|3555->2023|3600->2046|3638->2048|3652->2053|3679->2058|3736->2083|4097->2408|4128->2417|4463->2716|4492->2723|4909->3104|4956->3141|4997->3143|5128->3256|5142->3261|5182->3262|6062->4105|6110->4136|6151->4138|6254->4204|6270->4210|6352->4268|6393->4271|6450->4304|6607->4424|6654->4461|6695->4463|6790->4539|6804->4544|6844->4545|6943->4607|7010->4651|7107->4715|7316->4887|7352->4913|7393->4915|7488->4991|7502->4996|7542->4997|7614->5032|7627->5035|7661->5046|7727->5079|7881->5196|7917->5222|7958->5224|8053->5300|8067->5305|8107->5306|8177->5339|8190->5342|8224->5353|8321->5417|8450->5509|8487->5536|8528->5538|8623->5614|8637->5619|8677->5620|8749->5655|8762->5658|8798->5671|8895->5735|9006->5809|9040->5833|9092->5862|9206->5939|9238->5961|9279->5963|9374->6039|9388->6044|9428->6045|9500->6080|9513->6083|9543->6090|9608->6122|9718->6199|9819->6268|9906->6323
                    LINES: 26->1|28->3|28->3|40->19|40->19|49->1|51->15|55->27|57->29|57->29|57->29|65->37|65->37|65->37|71->43|71->43|71->43|82->54|82->54|82->54|93->65|93->65|93->65|94->66|94->66|94->66|94->66|94->66|94->66|94->66|94->66|95->67|105->77|105->77|114->86|114->86|132->104|132->104|132->104|138->110|138->110|138->110|167->139|167->139|167->139|169->141|169->141|169->141|169->141|169->141|173->145|173->145|173->145|175->147|175->147|175->147|177->149|177->149|179->151|185->157|185->157|185->157|187->159|187->159|187->159|188->160|188->160|188->160|189->161|193->165|193->165|193->165|195->167|195->167|195->167|196->168|196->168|196->168|198->170|201->173|201->173|201->173|203->175|203->175|203->175|204->176|204->176|204->176|206->178|209->181|209->181|209->181|212->184|212->184|212->184|214->186|214->186|214->186|215->187|215->187|215->187|216->188|219->191|225->197|231->203
                    -- GENERATED --
                */
            