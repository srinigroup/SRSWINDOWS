
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
object dateSelectForInvoiceViewForHeadOffice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[List[Invoice],Long,Date,Date,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(invoiceList : List[Invoice], sid:Long, startDate : Date, endDate : Date,supplierName:String,invoiceStatus:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*5.2*/checkSelected/*5.15*/(id:Long) = {{
	val result="selected"
		if(sid != null){
			if(sid == id){
				result
			}
		}
}};def /*14.2*/currentDateFormat/*14.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")
  
	if(currDate != null){
		curTimeFormat.format(currDate)
	}
  
}};
Seq[Any](format.raw/*1.116*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*25.2*/("""

"""),_display_(Seq[Any](/*27.2*/main/*27.6*/{_display_(Seq[Any](format.raw/*27.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*35.24*/routes/*35.30*/.Application.index())),format.raw/*35.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
       						<a href=""""),_display_(Seq[Any](/*36.24*/routes/*36.30*/.InvoiceInventory.showUploadPageForHeadOffice())),format.raw/*36.77*/("""" class="btn btn-default">INVOICE</a>
            				<a href="#" class="btn btn-default">UPLOADED</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*42.27*/routes/*42.33*/.InvoiceInventory.showUploadPageForHeadOffice())),format.raw/*42.80*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*49.12*/if(flash.containsKey("success"))/*49.44*/ {_display_(Seq[Any](format.raw/*49.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*51.39*/flash/*51.44*/.get("success"))),format.raw/*51.59*/("""
		        </div>
		    """)))})),format.raw/*53.8*/(""" 
	
	"""),_display_(Seq[Any](/*55.3*/helper/*55.9*/.form(action = routes.InvoiceInventory.displayUploadedForHeadOffice())/*55.79*/ {_display_(Seq[Any](format.raw/*55.81*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
  						<td>
            				<div class="clearfix" id="storeId_field">
								<label for="storeId">Select Store</label>
									<div class="input">
										<select name="storeId" id="invoiceStoreList" required>
						            		<option class="blank" value="">-- Choose a Store --</option>
						  					"""),_display_(Seq[Any](/*66.15*/for(store <- Stores.getStoresList()) yield /*66.51*/{_display_(Seq[Any](format.raw/*66.52*/("""
						  						<option value=""""),_display_(Seq[Any](/*67.31*/store/*67.36*/.id)),format.raw/*67.39*/("""" """),_display_(Seq[Any](/*67.42*/checkSelected(store.id))),format.raw/*67.65*/(""">"""),_display_(Seq[Any](/*67.67*/store/*67.72*/.name)),format.raw/*67.77*/("""</option>
						  					""")))})),format.raw/*68.15*/("""
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
							<div class="clearfix  " id="date_field">
		    					<label for="date">Start Date</label>
		    					<div class="input">
		        					<input type="text" name="invoiceStartDate" value=""""),_display_(Seq[Any](/*78.67*/currentDateFormat(startDate))),format.raw/*78.95*/("""" class="startDatePicker">
		    					</div>
							</div>
						</td>
						
						<td>
							<div class="clearfix  " id="endDate_field">
		    					<label for="endDate">End Date</label>
		    					<div class="input">
		        					<input type="text" name="invoiceEndDate" value=""""),_display_(Seq[Any](/*87.65*/currentDateFormat(endDate))),format.raw/*87.91*/("""" class="endDatePicker" >
		    					</div>
							</div>
						</td>
						</tr>
						<tr>
						
						<td>
							<div class="clearfix  " id=searchbox_field">
		    					<label for="searchbox">Search By Supplier</label>
		    					<div class="input">
									<input type="search" id="searchboxInInvoice" name="s" value=""""),_display_(Seq[Any](/*98.72*/supplierName)),format.raw/*98.84*/("""" placeholder="Filter by Supplier name...">
								</div>
							</div>
						</td>
						<td>
							<div class="clearfix  " id="invoice_status_field">
		    					<label for="invoice_status">Select Status</label>
		    					<div class="input">
								<select name="invoice_status" id="invoice_status">
									<option value="ALL">ALL</option>
									<option value="UPLOADED">UPLOADED</option>
									<option value="PROCESSED">PROCESSED</option>
									<option value="PAID">PAID</option>
								</select>
								</div>
							</div>
						</td>
					  	<td>
            					<input type="submit" value="Get Invoices" class="btn btn-primary" style="margin-top:7px">
					  	</td>
					  	</tr>
			</table>
		
	""")))})),format.raw/*121.3*/(""" <!-- form ends -->
						"""),format.raw/*136.5*/("""
	
		<!-- display list based on selected date -->
		
			"""),_display_(Seq[Any](/*140.5*/if(invoiceList.size() == 0)/*140.32*/ {_display_(Seq[Any](format.raw/*140.34*/("""
        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*146.9*/else/*146.14*/{_display_(Seq[Any](format.raw/*146.15*/("""
		        <div class="table-responsive">
		        	<table class="table table-hover  table-striped"  style="background-color: beige;">
		        		<thead style="background-color: gainsboro;">
		                <tr>
		                    <th>File Name</th>
		                    
		                    <th>Uploaded Date</th>
		                    
		                    <th>InvoiceType</th>
		                    
		                    <th>Store</th>
		                    
		                    <th>Status</th>
		                    
		                </tr>
		            </thead>
		            <tbody>
		
		                """),_display_(Seq[Any](/*165.20*/for(invoice <- invoiceList) yield /*165.47*/ {_display_(Seq[Any](format.raw/*165.49*/("""
		                    <tr>
		                        """),format.raw/*167.210*/("""
								<td><a href=""""),_display_(Seq[Any](/*168.23*/routes/*168.29*/.Application.checkUrl(invoice.filePath))),format.raw/*168.68*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*168.98*/invoice/*168.105*/.fileName)),format.raw/*168.114*/("""" onclick="OpenFancyBoxForJustView('"""),_display_(Seq[Any](/*168.151*/invoice/*168.158*/.id)),format.raw/*168.161*/("""');">"""),_display_(Seq[Any](/*168.167*/invoice/*168.174*/.fileName)),format.raw/*168.183*/("""</a></td>
		                        <td>"""),_display_(Seq[Any](/*169.32*/invoice/*169.39*/.uploadedDate)),format.raw/*169.52*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*170.32*/invoice/*170.39*/.invoiceType)),format.raw/*170.51*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*171.32*/Store/*171.37*/.find.byId(invoice.storeId))),format.raw/*171.64*/("""</td>
		                        <td>"""),_display_(Seq[Any](/*172.32*/invoice/*172.39*/.status)),format.raw/*172.46*/("""</td>
		                    </tr>
		                """)))})),format.raw/*174.20*/("""
		
		            </tbody>
		         </table>
		       </div>
		        
		    """)))})),format.raw/*180.8*/("""
	
		</div>
	</div>
		<input type="hidden" id="statusSelectedInInvoice" name="statusSelectedInInvoice" value=""""),_display_(Seq[Any](/*184.92*/invoiceStatus)),format.raw/*184.105*/("""">
	
""")))})),format.raw/*186.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(invoiceList:List[Invoice],sid:Long,startDate:Date,endDate:Date,supplierName:String,invoiceStatus:String): play.api.templates.HtmlFormat.Appendable = apply(invoiceList,sid,startDate,endDate,supplierName,invoiceStatus)
    
    def f:((List[Invoice],Long,Date,Date,String,String) => play.api.templates.HtmlFormat.Appendable) = (invoiceList,sid,startDate,endDate,supplierName,invoiceStatus) => apply(invoiceList,sid,startDate,endDate,supplierName,invoiceStatus)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:10:28 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/dateSelectForInvoiceViewForHeadOffice.scala.html
                    HASH: 552cfcb514e70307b057a62b03c2853e9d16a679
                    MATRIX: 859->1|1103->174|1124->187|1241->294|1267->311|1520->115|1548->171|1577->289|1608->533|1648->538|1660->542|1698->543|1972->781|1987->787|2029->807|2145->887|2160->893|2229->940|2527->1202|2542->1208|2611->1255|2839->1447|2880->1479|2920->1481|3041->1566|3055->1571|3092->1586|3150->1613|3193->1621|3207->1627|3286->1697|3326->1699|3827->2164|3879->2200|3918->2201|3986->2233|4000->2238|4025->2241|4064->2244|4109->2267|4147->2269|4161->2274|4188->2279|4245->2304|4611->2634|4661->2662|4990->2955|5038->2981|5411->3318|5445->3330|6221->4074|6276->4898|6373->4959|6410->4986|6451->4988|6592->5111|6606->5116|6646->5117|7328->5762|7372->5789|7413->5791|7499->6030|7560->6054|7576->6060|7638->6099|7705->6129|7723->6136|7756->6145|7831->6182|7849->6189|7876->6192|7920->6198|7938->6205|7971->6214|8050->6256|8067->6263|8103->6276|8178->6314|8195->6321|8230->6333|8305->6371|8320->6376|8370->6403|8445->6441|8462->6448|8492->6455|8580->6510|8699->6597|8851->6712|8888->6725|8928->6733
                    LINES: 26->1|31->5|31->5|38->14|38->14|50->1|51->4|52->12|54->25|56->27|56->27|56->27|64->35|64->35|64->35|65->36|65->36|65->36|71->42|71->42|71->42|78->49|78->49|78->49|80->51|80->51|80->51|82->53|84->55|84->55|84->55|84->55|95->66|95->66|95->66|96->67|96->67|96->67|96->67|96->67|96->67|96->67|96->67|97->68|107->78|107->78|116->87|116->87|127->98|127->98|150->121|151->136|155->140|155->140|155->140|161->146|161->146|161->146|180->165|180->165|180->165|182->167|183->168|183->168|183->168|183->168|183->168|183->168|183->168|183->168|183->168|183->168|183->168|183->168|184->169|184->169|184->169|185->170|185->170|185->170|186->171|186->171|186->171|187->172|187->172|187->172|189->174|195->180|199->184|199->184|201->186
                    -- GENERATED --
                */
            