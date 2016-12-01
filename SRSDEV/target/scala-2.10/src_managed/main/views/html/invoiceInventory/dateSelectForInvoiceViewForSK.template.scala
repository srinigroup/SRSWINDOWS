
package views.html.invoiceInventory

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
object dateSelectForInvoiceViewForSK extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[Long,List[Invoice],Date,Date,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id:Long, invoiceList : List[Invoice], startDate : Date, endDate : Date,supplierName:String,invoiceStatus:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*5.2*/currentDateFormat/*5.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.115*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/main/*15.6*/{_display_(Seq[Any](format.raw/*15.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*23.24*/routes/*23.30*/.Application.index())),format.raw/*23.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						<a href=""""),_display_(Seq[Any](/*24.24*/routes/*24.30*/.InvoiceInventory.showUploadPage())),format.raw/*24.64*/("""" class="btn btn-default">INVOICE</a>
            				<a href="#" class="btn btn-default">UPLOADED</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*30.27*/routes/*30.33*/.InvoiceInventory.showUploadPage())),format.raw/*30.67*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*37.12*/if(flash.containsKey("success"))/*37.44*/ {_display_(Seq[Any](format.raw/*37.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*39.39*/flash/*39.44*/.get("success"))),format.raw/*39.59*/("""
		        </div>
		    """)))})),format.raw/*41.8*/(""" 
	
	"""),_display_(Seq[Any](/*43.3*/helper/*43.9*/.form(action = routes.InvoiceInventory.displayUploadedForSK(id))/*43.73*/ {_display_(Seq[Any](format.raw/*43.75*/("""
	<div class="panel panel-success" style="height:210px;border-color:#000000;" >
		<div class="panel-heading" style="background-color:#9fdf9f;height:60px;"><center> <h2 style="color:#000;margin-top: 5px">Get Invoice </h2></center></div>
	   		 <div class="panel-body" style="font-size: 16px;">
				<div class="table-responsive">
	  				<table style="background-color: #dff0d8;border-color:#000000;" class="table table-bordered">
	  					<tr>
	  						<td>
	  					
								<div class="clearfix  " id="date_field">
			    					<label for="date"><b style="font-size:15px;">Start Date :</b></label>
			    					<div class="input">
			    						
			        					<input type="text" name="invoiceStartDate" value=""""),_display_(Seq[Any](/*56.68*/currentDateFormat(startDate))),format.raw/*56.96*/("""" class="startDatePicker" required />
			    					</div>
								</div>
							</td>
							
							<td>
								<div class="clearfix  " id="endDate_field">
			    					<label for="endDate"><b style="font-size:15px;">End Date :</b></label>
			    					<div class="input">
			    						
			        					<input type="text" name="invoiceEndDate" value=""""),_display_(Seq[Any](/*66.66*/currentDateFormat(endDate))),format.raw/*66.92*/("""" class="endDatePicker" required />
			    					
			    					</div>
								</div>
								
							
							</td>
							
						  	<td>
	            					<input type="submit" value="Get Uploaded Invoices" class="btn btn-primary" style="margin-top:15px">
						  	</td>
			
		""")))})),format.raw/*78.4*/(""" <!-- form ends -->
							<td>
							"""),_display_(Seq[Any](/*80.9*/helper/*80.15*/.form(action =routes.InvoiceInventory.getInvoicesBySupplierName())/*80.81*/{_display_(Seq[Any](format.raw/*80.82*/("""
							<input type="number" value=""""),_display_(Seq[Any](/*81.37*/id)),format.raw/*81.39*/("""" name="store_id" style="display:none;">
							<input type="search" id="searchboxInInvoice" name="s" value=""""),_display_(Seq[Any](/*82.70*/supplierName)),format.raw/*82.82*/("""" placeholder="Filter by Supplier name..." style="margin-top: 18px;" required />
							<select name="invoice_status" id="invoice_statusInStore" /required>
								<option value="ALL">ALL</option>
								<option value="UPLOADED">UPLOADED</option>
								<option value="PROCESSED">PROCESSED</option>
								<option value="PAID">PAID</option>
							</select>
							<input type="submit" id="searchsubmitInInvoice" value="Filter by Supplier " class="btn btn-info" style="background-color:green;font-size:14px;">
							</td>
							</tr>
	            	</table>
	         	</div>
		</div>
	</div>
	""")))})),format.raw/*96.3*/("""
	
		<!-- display list based on selected date -->
		
			"""),_display_(Seq[Any](/*100.5*/if(invoiceList.size() == 0)/*100.32*/ {_display_(Seq[Any](format.raw/*100.34*/("""
        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*106.9*/else/*106.14*/{_display_(Seq[Any](format.raw/*106.15*/("""
		        <div class="table-responsive">
		        	<table class="table table-hover  table-striped"  style="background-color: beige;">
		        		<thead style="background-color: gainsboro;">
		                <tr>
		                    <th>File Name</th>
		                    
		                    <th>Uploaded Date</th>
		                    
		                    <th>InvoiceType</th>
		                    
		                    <th>Status</th>
		                    
		                </tr>
		            </thead>
		            <tbody>
		
		                """),_display_(Seq[Any](/*123.20*/for(invoice <- invoiceList) yield /*123.47*/ {_display_(Seq[Any](format.raw/*123.49*/("""
		                    <tr>
		                        """),format.raw/*125.210*/("""
		                        <td><a href=""""),_display_(Seq[Any](/*126.41*/routes/*126.47*/.Application.checkUrl(invoice.filePath))),format.raw/*126.86*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*126.116*/invoice/*126.123*/.fileName)),format.raw/*126.132*/("""" onclick="OpenFancyBoxForJustView('"""),_display_(Seq[Any](/*126.169*/invoice/*126.176*/.id)),format.raw/*126.179*/("""');">"""),_display_(Seq[Any](/*126.185*/invoice/*126.192*/.fileName)),format.raw/*126.201*/("""</a></td>
		                        <td>"""),_display_(Seq[Any](/*127.32*/invoice/*127.39*/.uploadedDate)),format.raw/*127.52*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*128.32*/invoice/*128.39*/.invoiceType)),format.raw/*128.51*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*129.32*/invoice/*129.39*/.status)),format.raw/*129.46*/("""</td>
		                    </tr>
		                """)))})),format.raw/*131.20*/("""
		
		            </tbody>
		         </table>
		       </div>
		        
		    """)))})),format.raw/*137.8*/("""
	
		</div>
	</div>
			<input type="hidden" id="statusSelectedInStore" name="statusSelectedInStore" value=""""),_display_(Seq[Any](/*141.89*/invoiceStatus)),format.raw/*141.102*/("""">
	
""")))})),format.raw/*143.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(id:Long,invoiceList:List[Invoice],startDate:Date,endDate:Date,supplierName:String,invoiceStatus:String): play.api.templates.HtmlFormat.Appendable = apply(id,invoiceList,startDate,endDate,supplierName,invoiceStatus)
    
    def f:((Long,List[Invoice],Date,Date,String,String) => play.api.templates.HtmlFormat.Appendable) = (id,invoiceList,startDate,endDate,supplierName,invoiceStatus) => apply(id,invoiceList,startDate,endDate,supplierName,invoiceStatus)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:14:12 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/dateSelectForInvoiceViewForSK.scala.html
                    HASH: ed1d7288f1ab194c3f7a5df0117c17337b736ff9
                    MATRIX: 851->1|1094->173|1119->190|1338->114|1366->170|1395->378|1435->383|1447->387|1485->388|1758->625|1773->631|1815->651|1931->731|1946->737|2002->771|2300->1033|2315->1039|2371->1073|2599->1265|2640->1297|2680->1299|2801->1384|2815->1389|2852->1404|2910->1431|2953->1439|2967->1445|3040->1509|3080->1511|3837->2232|3887->2260|4284->2621|4332->2647|4650->2934|4727->2976|4742->2982|4817->3048|4856->3049|4930->3087|4954->3089|5101->3200|5135->3212|5779->3825|5876->3886|5913->3913|5954->3915|6095->4038|6109->4043|6149->4044|6769->4627|6813->4654|6854->4656|6940->4895|7019->4937|7035->4943|7097->4982|7165->5012|7183->5019|7216->5028|7291->5065|7309->5072|7336->5075|7380->5081|7398->5088|7431->5097|7510->5139|7527->5146|7563->5159|7638->5197|7655->5204|7690->5216|7765->5254|7782->5261|7812->5268|7900->5323|8019->5410|8168->5522|8205->5535|8245->5543
                    LINES: 26->1|31->5|31->5|40->1|41->4|42->13|44->15|44->15|44->15|52->23|52->23|52->23|53->24|53->24|53->24|59->30|59->30|59->30|66->37|66->37|66->37|68->39|68->39|68->39|70->41|72->43|72->43|72->43|72->43|85->56|85->56|95->66|95->66|107->78|109->80|109->80|109->80|109->80|110->81|110->81|111->82|111->82|125->96|129->100|129->100|129->100|135->106|135->106|135->106|152->123|152->123|152->123|154->125|155->126|155->126|155->126|155->126|155->126|155->126|155->126|155->126|155->126|155->126|155->126|155->126|156->127|156->127|156->127|157->128|157->128|157->128|158->129|158->129|158->129|160->131|166->137|170->141|170->141|172->143
                    -- GENERATED --
                */
            