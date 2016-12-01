
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
object invoiceListPageForPaymentPeople extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[List[Invoice],String,Long,String,String,String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(invoiceList : List[Invoice], paymentTerms : String, refInvoiceId : Long, currentFilter : String,selectedCompany : String,selectedStore :String,selectedCategory :String,selectedPaymentTerm:String,selectedCategoryForBack:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*6.2*/currentDateFormat/*6.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.229*/("""

"""),format.raw/*5.1*/(""" 
"""),format.raw/*14.2*/("""

"""),_display_(Seq[Any](/*16.2*/main/*16.6*/ {_display_(Seq[Any](format.raw/*16.8*/("""
    
  <div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*24.24*/routes/*24.30*/.Application.index())),format.raw/*24.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*25.27*/routes/*25.33*/.InvoiceInventory.showPaymentPage("noCompany","noStore","noCategory","noPaymentTerm"))),format.raw/*25.118*/("""" class="btn btn-default">PAYMENT</a>
            				<a href="#" class="btn btn-default">LIST</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.InvoiceInventory.showPaymentPage(selectedCompany,selectedStore,selectedCategoryForBack,selectedPaymentTerm))),format.raw/*31.141*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
  
      """),_display_(Seq[Any](/*38.8*/if(flash.containsKey("success"))/*38.40*/ {_display_(Seq[Any](format.raw/*38.42*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*40.37*/flash/*40.42*/.get("success"))),format.raw/*40.57*/("""
        </div>
    """)))})),format.raw/*42.6*/("""
   
   <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*46.24*/routes/*46.30*/.InvoiceInventory.filterPaymentInvoices(selectedCompany,selectedCategoryForBack))),format.raw/*46.110*/("""" method="GET">
        	<p class="pull-left" style="padding-top:-10px">
            	<input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*48.67*/currentFilter)),format.raw/*48.80*/("""" placeholder="Filter by Supplier name...">
            	<input type="hidden"  name="refInvoiceId" value=""""),_display_(Seq[Any](/*49.64*/refInvoiceId)),format.raw/*49.76*/(""""/>
            	<input type="hidden"  name="paymentTerms" value=""""),_display_(Seq[Any](/*50.64*/paymentTerms)),format.raw/*50.76*/(""""/>
            	<input type="submit" id="searchsubmit" value="Filter by Supplier" class="btn btn-info">
          	</p>
             
        </form>
          
    </div>  
   
    
    """),_display_(Seq[Any](/*59.6*/if(invoiceList.size() == 0)/*59.33*/ {_display_(Seq[Any](format.raw/*59.35*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*65.7*/else/*65.12*/{_display_(Seq[Any](format.raw/*65.13*/("""
        <div class="table-responsive">
        	<table class="table table-hover  table-striped"  style="background-color: beige;">
        		<thead style="background-color: gainsboro;">
                <tr>
                    <th>File Name</th>
                    
                    <th>Invoice Date</th>
                    
                    <th>Invoice category</th>
                    
                    <th>Supplier</th>
                    
                    <th>Payment Term</th>
                    
                    <th>Company</th>
                    
                    <th>Store</th>
                    
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*88.18*/for(invoice <- invoiceList) yield /*88.45*/ {_display_(Seq[Any](format.raw/*88.47*/("""
                    <tr>
                        <td>
                        	"""),_display_(Seq[Any](/*91.27*/if(currentFilter.equals(""))/*91.55*/{_display_(Seq[Any](format.raw/*91.56*/(""" <!-- if current Filter is empty send a dummy value for filter, check that in server side -->
                        	
                        		"""),format.raw/*93.248*/("""
                        		<a href=""""),_display_(Seq[Any](/*94.37*/routes/*94.43*/.Application.checkUrl(invoice.filePath))),format.raw/*94.82*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*94.112*/invoice/*94.119*/.fileName)),format.raw/*94.128*/("""" onclick="OpenFancyBoxForPaymentDone('"""),_display_(Seq[Any](/*94.168*/invoice/*94.175*/.id)),format.raw/*94.178*/("""','"""),_display_(Seq[Any](/*94.182*/paymentTerms)),format.raw/*94.194*/("""','EMPTY','"""),_display_(Seq[Any](/*94.206*/selectedCategory)),format.raw/*94.222*/("""');">"""),_display_(Seq[Any](/*94.228*/invoice/*94.235*/.fileName)),format.raw/*94.244*/("""</a>
                        	""")))}/*95.27*/else/*95.31*/{_display_(Seq[Any](format.raw/*95.32*/("""
                        		"""),format.raw/*96.257*/("""
                        		<a href=""""),_display_(Seq[Any](/*97.37*/routes/*97.43*/.Application.checkUrl(invoice.filePath))),format.raw/*97.82*/("""" class="fancyboxPDF" title=""""),_display_(Seq[Any](/*97.112*/invoice/*97.119*/.fileName)),format.raw/*97.128*/("""" onclick="OpenFancyBoxForPaymentDone('"""),_display_(Seq[Any](/*97.168*/invoice/*97.175*/.id)),format.raw/*97.178*/("""','"""),_display_(Seq[Any](/*97.182*/paymentTerms)),format.raw/*97.194*/("""','"""),_display_(Seq[Any](/*97.198*/currentFilter)),format.raw/*97.211*/("""','"""),_display_(Seq[Any](/*97.215*/selectedCategory)),format.raw/*97.231*/("""');">"""),_display_(Seq[Any](/*97.237*/invoice/*97.244*/.fileName)),format.raw/*97.253*/("""</a>
                        	""")))})),format.raw/*98.27*/("""
                        </td>
                        <td>"""),_display_(Seq[Any](/*100.30*/currentDateFormat(invoice.invoiceDate))),format.raw/*100.68*/("""</td>
                        """),_display_(Seq[Any](/*101.26*/if(invoice.companyId != null)/*101.55*/{_display_(Seq[Any](format.raw/*101.56*/("""
                        	<td>"""),_display_(Seq[Any](/*102.31*/Invoice/*102.38*/.getParentDirectory(invoice.filePath))),format.raw/*102.75*/("""</td>
                        """)))}/*103.26*/else/*103.30*/{_display_(Seq[Any](format.raw/*103.31*/("""
                        	<td>"""),_display_(Seq[Any](/*104.31*/selectedCategoryForBack)),format.raw/*104.54*/(""" </td>
                        """)))})),format.raw/*105.26*/("""
                        """),_display_(Seq[Any](/*106.26*/if(invoice.companyId != null)/*106.55*/{_display_(Seq[Any](format.raw/*106.56*/("""
                        	<td> - </td>
                        """)))}/*108.26*/else/*108.30*/{_display_(Seq[Any](format.raw/*108.31*/("""
                        	<td>"""),_display_(Seq[Any](/*109.31*/Invoice/*109.38*/.getParentDirectory(invoice.filePath))),format.raw/*109.75*/("""</td>
                        """)))})),format.raw/*110.26*/("""
                        <td>"""),_display_(Seq[Any](/*111.30*/invoice/*111.37*/.paymentMode)),format.raw/*111.49*/("""</td>
                        """),_display_(Seq[Any](/*112.26*/if(invoice.companyId != null)/*112.55*/{_display_(Seq[Any](format.raw/*112.56*/("""
                        	<td>"""),_display_(Seq[Any](/*113.31*/Company/*113.38*/.find.byId(invoice.companyId).name)),format.raw/*113.72*/("""</td>
                        """)))}/*114.26*/else/*114.30*/{_display_(Seq[Any](format.raw/*114.31*/("""
                        	<td> - </td>
                        """)))})),format.raw/*116.26*/("""
                        <td>"""),_display_(Seq[Any](/*117.30*/Store/*117.35*/.find.byId(invoice.storeId))),format.raw/*117.62*/("""</td>
                    </tr>
                """)))})),format.raw/*119.18*/("""

            </tbody>
         </table>
       </div>
        
    """)))})),format.raw/*125.6*/("""
    <input type="hidden" id="paymentSelectedPaymentTerm" name="paymentSelectedPaymentTerm" value=""""),_display_(Seq[Any](/*126.100*/selectedPaymentTerm)),format.raw/*126.119*/("""">
    <input type="hidden" id="paymentSelectedInvoiceType" name="paymentSelectedInvoiceType" value=""""),_display_(Seq[Any](/*127.100*/selectedCategory)),format.raw/*127.116*/("""">
	<input type="hidden" id="paymentSelectedCompany" name="paymentSelectedCompany" value=""""),_display_(Seq[Any](/*128.89*/selectedCompany)),format.raw/*128.104*/("""">
	<input type="hidden" id="paymentSelectedStore" name="paymentSelectedStore" value=""""),_display_(Seq[Any](/*129.85*/selectedStore)),format.raw/*129.98*/("""">
    
     </div>
    </div>
   				
""")))})),format.raw/*134.2*/("""

            """))}
    }
    
    def render(invoiceList:List[Invoice],paymentTerms:String,refInvoiceId:Long,currentFilter:String,selectedCompany:String,selectedStore:String,selectedCategory:String,selectedPaymentTerm:String,selectedCategoryForBack:String): play.api.templates.HtmlFormat.Appendable = apply(invoiceList,paymentTerms,refInvoiceId,currentFilter,selectedCompany,selectedStore,selectedCategory,selectedPaymentTerm,selectedCategoryForBack)
    
    def f:((List[Invoice],String,Long,String,String,String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (invoiceList,paymentTerms,refInvoiceId,currentFilter,selectedCompany,selectedStore,selectedCategory,selectedPaymentTerm,selectedCategoryForBack) => apply(invoiceList,paymentTerms,refInvoiceId,currentFilter,selectedCompany,selectedStore,selectedCategory,selectedPaymentTerm,selectedCategoryForBack)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 15:14:12 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/invoiceListPageForPaymentPeople.scala.html
                    HASH: aea0024fc00625d9137d0cbfc7651f5c4026a6a0
                    MATRIX: 878->1|1235->290|1260->307|1479->228|1509->286|1539->495|1579->500|1591->504|1630->506|1908->748|1923->754|1965->774|2084->857|2099->863|2207->948|2501->1206|2516->1212|2647->1320|2860->1498|2901->1530|2941->1532|3058->1613|3072->1618|3109->1633|3163->1656|3262->1719|3277->1725|3380->1805|3557->1946|3592->1959|3736->2067|3770->2079|3874->2147|3908->2159|4141->2357|4177->2384|4217->2386|4347->2499|4360->2504|4399->2505|5173->3243|5216->3270|5256->3272|5376->3356|5413->3384|5452->3385|5629->3754|5703->3792|5718->3798|5779->3837|5846->3867|5863->3874|5895->3883|5972->3923|5989->3930|6015->3933|6056->3937|6091->3949|6140->3961|6179->3977|6222->3983|6239->3990|6271->3999|6322->4031|6335->4035|6374->4036|6431->4294|6505->4332|6520->4338|6581->4377|6648->4407|6665->4414|6697->4423|6774->4463|6791->4470|6817->4473|6858->4477|6893->4489|6934->4493|6970->4506|7011->4510|7050->4526|7093->4532|7110->4539|7142->4548|7206->4580|7305->4642|7366->4680|7435->4712|7474->4741|7514->4742|7583->4774|7600->4781|7660->4818|7712->4850|7726->4854|7766->4855|7835->4887|7881->4910|7947->4943|8011->4970|8050->4999|8090->5000|8176->5066|8190->5070|8230->5071|8299->5103|8316->5110|8376->5147|8441->5179|8509->5210|8526->5217|8561->5229|8630->5261|8669->5290|8709->5291|8778->5323|8795->5330|8852->5364|8904->5396|8918->5400|8958->5401|9057->5467|9125->5498|9140->5503|9190->5530|9274->5581|9381->5656|9520->5757|9563->5776|9704->5879|9744->5895|9873->5987|9912->6002|10037->6090|10073->6103|10150->6148
                    LINES: 26->1|31->6|31->6|40->1|42->5|43->14|45->16|45->16|45->16|53->24|53->24|53->24|54->25|54->25|54->25|60->31|60->31|60->31|67->38|67->38|67->38|69->40|69->40|69->40|71->42|75->46|75->46|75->46|77->48|77->48|78->49|78->49|79->50|79->50|88->59|88->59|88->59|94->65|94->65|94->65|117->88|117->88|117->88|120->91|120->91|120->91|122->93|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|123->94|124->95|124->95|124->95|125->96|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|126->97|127->98|129->100|129->100|130->101|130->101|130->101|131->102|131->102|131->102|132->103|132->103|132->103|133->104|133->104|134->105|135->106|135->106|135->106|137->108|137->108|137->108|138->109|138->109|138->109|139->110|140->111|140->111|140->111|141->112|141->112|141->112|142->113|142->113|142->113|143->114|143->114|143->114|145->116|146->117|146->117|146->117|148->119|154->125|155->126|155->126|156->127|156->127|157->128|157->128|158->129|158->129|163->134
                    -- GENERATED --
                */
            