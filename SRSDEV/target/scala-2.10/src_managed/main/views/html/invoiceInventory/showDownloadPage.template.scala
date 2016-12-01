
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
object showDownloadPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Invoice],Long,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(invoiceList : List[Invoice], storeId:Long , invoiceType : String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*5.2*/checkSelected/*5.15*/(id:Long) = {{
	val result="selected"
		if(storeId != null){
			if(storeId == id){
				result
			}
		}
}};def /*14.2*/checkSelectedType/*14.19*/(invoiceTYPE:String) = {{
	val result="selected"
		if(invoiceType != null){
			if(invoiceTYPE.equals(invoiceType)){
				result
			}
		}
}};
Seq[Any](format.raw/*1.68*/("""
"""),format.raw/*4.1*/("""
"""),format.raw/*12.2*/("""

"""),format.raw/*21.2*/("""

"""),_display_(Seq[Any](/*23.2*/main/*23.6*/{_display_(Seq[Any](format.raw/*23.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*31.24*/routes/*31.30*/.Application.index())),format.raw/*31.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">INVOICE PROCESS</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*37.27*/routes/*37.33*/.Application.index())),format.raw/*37.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*44.12*/if(flash.containsKey("success"))/*44.44*/ {_display_(Seq[Any](format.raw/*44.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*46.39*/flash/*46.44*/.get("success"))),format.raw/*46.59*/("""
		        </div>
		    """)))})),format.raw/*48.8*/(""" 
	
	"""),_display_(Seq[Any](/*50.3*/helper/*50.9*/.form(action = routes.InvoiceInventory.getInvoices())/*50.62*/ {_display_(Seq[Any](format.raw/*50.64*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
					  	<td>
            				<div class="clearfix" id="storeId_field">
								<label for="storeId">Select Store</label>
									<div class="input">
										<select name="storeId" id="invoiceStoreList" required>
						            		<option class="blank" value="">-- Choose a Store --</option>
						  					"""),_display_(Seq[Any](/*61.15*/for(store <- Stores.getStoresList()) yield /*61.51*/{_display_(Seq[Any](format.raw/*61.52*/("""
						  						<option value=""""),_display_(Seq[Any](/*62.31*/store/*62.36*/.id)),format.raw/*62.39*/("""" """),_display_(Seq[Any](/*62.42*/checkSelected(store.id))),format.raw/*62.65*/(""">"""),_display_(Seq[Any](/*62.67*/store/*62.72*/.name)),format.raw/*62.77*/("""</option>
						  					""")))})),format.raw/*63.15*/("""
						  				</select>
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
            				<div class="clearfix" id="invoiceType_field">
								<label for="invoiceType">InvoiceType</label>
									<div class="input">
										<select name="invoiceType" required>
						            		<option class="blank" value="">-- Choose a Invoice Type --</option>
						  					<option value="CashPaid" """),_display_(Seq[Any](/*75.40*/checkSelectedType("CashPaid"))),format.raw/*75.69*/(""">CashPaid</option>
						  					<option value="Others" """),_display_(Seq[Any](/*76.38*/checkSelectedType("Others"))),format.raw/*76.65*/(""">Others</option>
						  					<option value="Statements" """),_display_(Seq[Any](/*77.42*/checkSelectedType("Statements"))),format.raw/*77.73*/(""">Statements</option>
						  					<option value="Fuel" """),_display_(Seq[Any](/*78.36*/checkSelectedType("Fuel"))),format.raw/*78.61*/(""">Fuel</option>
						  				</select> 
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
            		</tr>
            	</table>
         	</div>
		
        <center><input type="submit" value="Get Invoices" class="btn btn-primary"></center>
        
        
	
	""")))})),format.raw/*92.3*/(""" <!-- form ends -->
		
		<a href="#" data-toggle="popover" title="Total Invoices : """),_display_(Seq[Any](/*94.62*/Invoice/*94.69*/.pendingInvoicesByAllStores())),format.raw/*94.98*/("""" data-content="<ul>"""),_display_(Seq[Any](/*94.119*/for(store <- Stores.getStoresList()) yield /*94.155*/{_display_(Seq[Any](format.raw/*94.156*/("""<li>"""),_display_(Seq[Any](/*94.161*/store/*94.166*/.name)),format.raw/*94.171*/(""" : """),_display_(Seq[Any](/*94.175*/Invoice/*94.182*/.pendingInvoicesByStore(store.id))),format.raw/*94.215*/("""</li>""")))})),format.raw/*94.221*/("""</ul>" data-placement="bottom" data-trigger="hover" class="pull-right btn btn-danger">Pending Invoices</a>
		
		<br/>
		<br/>
		
		
		"""),_display_(Seq[Any](/*100.4*/if(invoiceList.size() == 0)/*100.31*/ {_display_(Seq[Any](format.raw/*100.33*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
	    """)))}/*106.8*/else/*106.13*/{_display_(Seq[Any](format.raw/*106.14*/("""
	        <div class="table-responsive">
	        	<table class="table table-hover  table-striped"  style="background-color: beige;">
	        		<thead style="background-color: gainsboro;">
	                <tr>
	                    <th>File Name</th>
	                    
	                    <th>Uploaded Date</th>
	                    
	                    <th>InvoiceType</th>
	                    
	                    <th>Store</th>
	                    
	                </tr>
	            </thead>
	            <tbody>
	
	                """),_display_(Seq[Any](/*123.19*/for(invoice <- invoiceList) yield /*123.46*/ {_display_(Seq[Any](format.raw/*123.48*/("""
	                    <tr>
	                    	"""),_display_(Seq[Any](/*125.24*/if(invoice.storeId != 1)/*125.48*/{_display_(Seq[Any](format.raw/*125.49*/("""
	                    		"""),format.raw/*126.196*/("""
	                    		<td><a href=""""),_display_(Seq[Any](/*127.38*/routes/*127.44*/.Application.checkUrl(invoice.filePath))),format.raw/*127.83*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*127.113*/invoice/*127.120*/.fileName)),format.raw/*127.129*/("""" onclick="OpenFancyBox('"""),_display_(Seq[Any](/*127.155*/invoice/*127.162*/.id)),format.raw/*127.165*/("""');">"""),_display_(Seq[Any](/*127.171*/invoice/*127.178*/.fileName)),format.raw/*127.187*/("""</a></td>
	                    	""")))})),format.raw/*128.24*/("""
	                    	"""),_display_(Seq[Any](/*129.24*/if(invoice.storeId == 1)/*129.48*/{_display_(Seq[Any](format.raw/*129.49*/("""
	                    		"""),format.raw/*130.209*/("""
	                    		<td><a href=""""),_display_(Seq[Any](/*131.38*/routes/*131.44*/.Application.checkUrl(invoice.filePath))),format.raw/*131.83*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*131.113*/invoice/*131.120*/.fileName)),format.raw/*131.129*/("""" onclick="OpenFancyBoxForHeadOffice('"""),_display_(Seq[Any](/*131.168*/invoice/*131.175*/.id)),format.raw/*131.178*/("""');">"""),_display_(Seq[Any](/*131.184*/invoice/*131.191*/.fileName)),format.raw/*131.200*/("""</a></td>
	                    	""")))})),format.raw/*132.24*/("""
	                        
	                        <td>"""),_display_(Seq[Any](/*134.31*/invoice/*134.38*/.uploadedDate)),format.raw/*134.51*/("""</td>
	                        <td>"""),_display_(Seq[Any](/*135.31*/invoice/*135.38*/.invoiceType)),format.raw/*135.50*/("""</td>
	                        <td>"""),_display_(Seq[Any](/*136.31*/Store/*136.36*/.find.byId(invoice.storeId))),format.raw/*136.63*/("""</td>
	                    </tr>
	                """)))})),format.raw/*138.19*/("""
	
	            </tbody>
	         </table>
	       </div>
	        
	    """)))})),format.raw/*144.7*/("""
		
		
							<!-- supplier list for Invoice Inventory ,while Processing Invoice-->
    							
    							<div id="supplierListByStoreForInvoiceDiv" style="display:none">
                       
									<select id="supplierListByStoreForInvoice" name="supplierlistByStoreForInvoice" >
										<option class="blank" value="">-- Choose a Supplier --</option>
					  					"""),_display_(Seq[Any](/*153.14*/for(supplierMapping <- Store.find.byId(storeId).supplierMapping) yield /*153.78*/{_display_(Seq[Any](format.raw/*153.79*/("""
						  						<option value=""""),_display_(Seq[Any](/*154.31*/supplierMapping/*154.46*/.supplier.id)),format.raw/*154.58*/("""">"""),_display_(Seq[Any](/*154.61*/supplierMapping/*154.76*/.supplier.name)),format.raw/*154.90*/("""</option>
						  					""")))})),format.raw/*155.15*/("""
		                            </select> 
                          		</div>  
                          		
                          	<!-- company list for Invoice Inventory ,while Processing Invoice-->
    							
    							<div id="companyListForInvoiceDiv" style="display:none">
                       
									<select id="companyListForInvoice" name="companyListForInvoice" >
										<option class="blank" value="">-- Choose a Company --</option>
					  					"""),_display_(Seq[Any](/*165.14*/for(company <- Company.find.where().eq("status", "ACTIVE").orderBy("name").findList() ) yield /*165.101*/{_display_(Seq[Any](format.raw/*165.102*/("""
						  						<option value=""""),_display_(Seq[Any](/*166.31*/company/*166.38*/.id)),format.raw/*166.41*/("""">"""),_display_(Seq[Any](/*166.44*/company/*166.51*/.name)),format.raw/*166.56*/("""</option>
						  					""")))})),format.raw/*167.15*/("""
		                            </select> 
                          		</div>
		
		</div>
	</div>
	
""")))})),format.raw/*174.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(invoiceList:List[Invoice],storeId:Long,invoiceType:String): play.api.templates.HtmlFormat.Appendable = apply(invoiceList,storeId,invoiceType)
    
    def f:((List[Invoice],Long,String) => play.api.templates.HtmlFormat.Appendable) = (invoiceList,storeId,invoiceType) => apply(invoiceList,storeId,invoiceType)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:08:04 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/showDownloadPage.scala.html
                    HASH: e4fbe9598a268b9427d276c59a42c3bf0848a536
                    MATRIX: 821->1|1017->126|1038->139|1163->254|1189->271|1363->67|1391->123|1420->249|1451->414|1491->419|1503->423|1541->424|1815->662|1830->668|1872->688|2195->975|2210->981|2252->1001|2480->1193|2521->1225|2561->1227|2682->1312|2696->1317|2733->1332|2791->1359|2834->1367|2848->1373|2910->1426|2950->1428|3451->1893|3503->1929|3542->1930|3610->1962|3624->1967|3649->1970|3688->1973|3733->1996|3771->1998|3785->2003|3812->2008|3869->2033|4362->2490|4413->2519|4506->2576|4555->2603|4650->2662|4703->2693|4796->2750|4843->2775|5193->3094|5315->3180|5331->3187|5382->3216|5440->3237|5493->3273|5533->3274|5575->3279|5590->3284|5618->3289|5659->3293|5676->3300|5732->3333|5771->3339|5948->3480|5985->3507|6026->3509|6158->3623|6172->3628|6212->3629|6814->4194|6858->4221|6899->4223|6988->4275|7022->4299|7062->4300|7117->4497|7193->4536|7209->4542|7271->4581|7339->4611|7357->4618|7390->4627|7454->4653|7472->4660|7499->4663|7543->4669|7561->4676|7594->4685|7661->4719|7723->4744|7757->4768|7797->4769|7852->4979|7928->5018|7944->5024|8006->5063|8074->5093|8092->5100|8125->5109|8202->5148|8220->5155|8247->5158|8291->5164|8309->5171|8342->5180|8409->5214|8505->5273|8522->5280|8558->5293|8632->5330|8649->5337|8684->5349|8758->5386|8773->5391|8823->5418|8909->5471|9022->5552|9442->5935|9523->5999|9563->6000|9632->6032|9657->6047|9692->6059|9732->6062|9757->6077|9794->6091|9852->6116|10368->6595|10473->6682|10514->6683|10583->6715|10600->6722|10626->6725|10666->6728|10683->6735|10711->6740|10769->6765|10908->6872
                    LINES: 26->1|31->5|31->5|38->14|38->14|46->1|47->4|48->12|50->21|52->23|52->23|52->23|60->31|60->31|60->31|66->37|66->37|66->37|73->44|73->44|73->44|75->46|75->46|75->46|77->48|79->50|79->50|79->50|79->50|90->61|90->61|90->61|91->62|91->62|91->62|91->62|91->62|91->62|91->62|91->62|92->63|104->75|104->75|105->76|105->76|106->77|106->77|107->78|107->78|121->92|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|129->100|129->100|129->100|135->106|135->106|135->106|152->123|152->123|152->123|154->125|154->125|154->125|155->126|156->127|156->127|156->127|156->127|156->127|156->127|156->127|156->127|156->127|156->127|156->127|156->127|157->128|158->129|158->129|158->129|159->130|160->131|160->131|160->131|160->131|160->131|160->131|160->131|160->131|160->131|160->131|160->131|160->131|161->132|163->134|163->134|163->134|164->135|164->135|164->135|165->136|165->136|165->136|167->138|173->144|182->153|182->153|182->153|183->154|183->154|183->154|183->154|183->154|183->154|184->155|194->165|194->165|194->165|195->166|195->166|195->166|195->166|195->166|195->166|196->167|203->174
                    -- GENERATED --
                */
            