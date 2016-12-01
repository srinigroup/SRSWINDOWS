
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
object invoiceListPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Invoice],Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(invoiceList : List[Invoice], storeId:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*3.2*/currentDateFormat/*3.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*11.2*/("""

"""),_display_(Seq[Any](/*13.2*/main/*13.6*/ {_display_(Seq[Any](format.raw/*13.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*21.24*/routes/*21.30*/.Application.index())),format.raw/*21.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.InvoiceInventory.showDownloadPage())),format.raw/*22.69*/("""" class="btn btn-default">INVOICE</a>
            				<a href="#" class="btn btn-default">LIST</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*28.27*/routes/*28.33*/.InvoiceInventory.showDownloadPage())),format.raw/*28.69*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
  

    """),_display_(Seq[Any](/*37.6*/if(flash.containsKey("success"))/*37.38*/ {_display_(Seq[Any](format.raw/*37.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*39.37*/flash/*39.42*/.get("success"))),format.raw/*39.57*/("""
        </div>
    """)))})),format.raw/*41.6*/(""" 

    
    """),_display_(Seq[Any](/*44.6*/if(invoiceList.size() == 0)/*44.33*/ {_display_(Seq[Any](format.raw/*44.35*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*50.7*/else/*50.12*/{_display_(Seq[Any](format.raw/*50.13*/("""
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

                """),_display_(Seq[Any](/*67.18*/for(invoice <- invoiceList) yield /*67.45*/ {_display_(Seq[Any](format.raw/*67.47*/("""
                    <tr>
                    	"""),_display_(Seq[Any](/*69.23*/if(invoice.storeId != 1)/*69.47*/{_display_(Seq[Any](format.raw/*69.48*/("""
                    		"""),format.raw/*70.195*/("""
                    		<td><a href=""""),_display_(Seq[Any](/*71.37*/routes/*71.43*/.Application.checkUrl(invoice.filePath))),format.raw/*71.82*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*71.112*/invoice/*71.119*/.fileName)),format.raw/*71.128*/("""" onclick="OpenFancyBox('"""),_display_(Seq[Any](/*71.154*/invoice/*71.161*/.id)),format.raw/*71.164*/("""');">"""),_display_(Seq[Any](/*71.170*/invoice/*71.177*/.fileName)),format.raw/*71.186*/("""</a></td>
                    	""")))})),format.raw/*72.23*/("""
                    	"""),_display_(Seq[Any](/*73.23*/if(invoice.storeId == 1)/*73.47*/{_display_(Seq[Any](format.raw/*73.48*/("""
                    		"""),format.raw/*74.208*/("""
                    		<td><a href=""""),_display_(Seq[Any](/*75.37*/routes/*75.43*/.Application.checkUrl(invoice.filePath))),format.raw/*75.82*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*75.112*/invoice/*75.119*/.fileName)),format.raw/*75.128*/("""" onclick="OpenFancyBoxForHeadOffice('"""),_display_(Seq[Any](/*75.167*/invoice/*75.174*/.id)),format.raw/*75.177*/("""');">"""),_display_(Seq[Any](/*75.183*/invoice/*75.190*/.fileName)),format.raw/*75.199*/("""</a></td>
                    	""")))})),format.raw/*76.23*/("""
                        
                        <td>"""),_display_(Seq[Any](/*78.30*/invoice/*78.37*/.uploadedDate)),format.raw/*78.50*/("""</td>
                        <td>"""),_display_(Seq[Any](/*79.30*/invoice/*79.37*/.invoiceType)),format.raw/*79.49*/("""</td>
                        <td>"""),_display_(Seq[Any](/*80.30*/Store/*80.35*/.find.byId(invoice.storeId))),format.raw/*80.62*/("""</td>
                    </tr>
                """)))})),format.raw/*82.18*/("""

            </tbody>
         </table>
       </div>
        
    """)))})),format.raw/*88.6*/("""
    						<!-- supplier list for Invoice Inventory ,while Processing Invoice-->
    							
    							<div id="supplierListByStoreForInvoiceDiv" style="display:none">
                       
									<select id="supplierListByStoreForInvoice" name="supplierlistByStoreForInvoice" >
										<option class="blank" value="">-- Choose a Supplier --</option>
					  					"""),_display_(Seq[Any](/*95.14*/for(supplierMapping <- Store.find.byId(storeId).supplierMapping) yield /*95.78*/{_display_(Seq[Any](format.raw/*95.79*/("""
						  						<option value=""""),_display_(Seq[Any](/*96.31*/supplierMapping/*96.46*/.supplier.id)),format.raw/*96.58*/("""">"""),_display_(Seq[Any](/*96.61*/supplierMapping/*96.76*/.supplier.name)),format.raw/*96.90*/("""</option>
						  					""")))})),format.raw/*97.15*/("""
		                            </select> 
                          		</div>  
                          		
                          	<!-- company list for Invoice Inventory ,while Processing Invoice-->
    							
    							<div id="companyListForInvoiceDiv" style="display:none">
                       
									<select id="companyListForInvoice" name="companyListForInvoice" >
										<option class="blank" value="">-- Choose a Company --</option>
					  					"""),_display_(Seq[Any](/*107.14*/for(company <- Company.all() ) yield /*107.44*/{_display_(Seq[Any](format.raw/*107.45*/("""
						  						<option value=""""),_display_(Seq[Any](/*108.31*/company/*108.38*/.id)),format.raw/*108.41*/("""">"""),_display_(Seq[Any](/*108.44*/company/*108.51*/.name)),format.raw/*108.56*/("""</option>
						  					""")))})),format.raw/*109.15*/("""
		                            </select> 
                          		</div>
     </div>
    </div>
   				
""")))})),format.raw/*115.2*/("""

            """))}
    }
    
    def render(invoiceList:List[Invoice],storeId:Long): play.api.templates.HtmlFormat.Appendable = apply(invoiceList,storeId)
    
    def f:((List[Invoice],Long) => play.api.templates.HtmlFormat.Appendable) = (invoiceList,storeId) => apply(invoiceList,storeId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:06:25 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/invoiceListPage.scala.html
                    HASH: 6c58ba547d5efeb979cb34b4ab6bf2780019c037
                    MATRIX: 813->1|933->49|958->66|1176->44|1207->254|1247->259|1259->263|1298->265|1576->507|1591->513|1633->533|1752->616|1767->622|1825->658|2119->916|2134->922|2192->958|2409->1140|2450->1172|2490->1174|2607->1255|2621->1260|2658->1275|2712->1298|2763->1314|2799->1341|2839->1343|2969->1456|2982->1461|3021->1462|3605->2010|3648->2037|3688->2039|3774->2089|3807->2113|3846->2114|3899->2310|3973->2348|3988->2354|4049->2393|4116->2423|4133->2430|4165->2439|4228->2465|4245->2472|4271->2475|4314->2481|4331->2488|4363->2497|4428->2530|4488->2554|4521->2578|4560->2579|4613->2788|4687->2826|4702->2832|4763->2871|4830->2901|4847->2908|4879->2917|4955->2956|4972->2963|4998->2966|5041->2972|5058->2979|5090->2988|5155->3021|5248->3078|5264->3085|5299->3098|5371->3134|5387->3141|5421->3153|5493->3189|5507->3194|5556->3221|5639->3272|5745->3347|6159->3725|6239->3789|6278->3790|6346->3822|6370->3837|6404->3849|6443->3852|6467->3867|6503->3881|6560->3906|7076->4385|7123->4415|7163->4416|7232->4448|7249->4455|7275->4458|7315->4461|7332->4468|7360->4473|7418->4498|7565->4613
                    LINES: 26->1|28->3|28->3|37->1|39->11|41->13|41->13|41->13|49->21|49->21|49->21|50->22|50->22|50->22|56->28|56->28|56->28|65->37|65->37|65->37|67->39|67->39|67->39|69->41|72->44|72->44|72->44|78->50|78->50|78->50|95->67|95->67|95->67|97->69|97->69|97->69|98->70|99->71|99->71|99->71|99->71|99->71|99->71|99->71|99->71|99->71|99->71|99->71|99->71|100->72|101->73|101->73|101->73|102->74|103->75|103->75|103->75|103->75|103->75|103->75|103->75|103->75|103->75|103->75|103->75|103->75|104->76|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|110->82|116->88|123->95|123->95|123->95|124->96|124->96|124->96|124->96|124->96|124->96|125->97|135->107|135->107|135->107|136->108|136->108|136->108|136->108|136->108|136->108|137->109|143->115
                    -- GENERATED --
                */
            