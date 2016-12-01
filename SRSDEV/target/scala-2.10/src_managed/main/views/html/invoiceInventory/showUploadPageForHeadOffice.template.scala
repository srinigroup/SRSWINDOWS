
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
object showUploadPageForHeadOffice extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*12.24*/routes/*12.30*/.Application.index())),format.raw/*12.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">UPLOAD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Application.index())),format.raw/*18.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*25.12*/if(flash.containsKey("success"))/*25.44*/ {_display_(Seq[Any](format.raw/*25.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*27.39*/flash/*27.44*/.get("success"))),format.raw/*27.59*/("""
		        </div>
		    """)))})),format.raw/*29.8*/(""" 
	
	"""),_display_(Seq[Any](/*31.3*/helper/*31.9*/.form(action = routes.InvoiceInventory.uploadInvoicesByHeadOffice(),'enctype -> "multipart/form-data")/*31.111*/ {_display_(Seq[Any](format.raw/*31.113*/("""
	
			<div class="table-responsive">
  				<table style="background-color: white;border-color: #fff;" class="table table-bordered">
  					<tr>
  						<td>
            				<div class="clearfix" id="storeId_field">
								<label for="storeId">Select Store</label>
									<div class="input">
										<select name="storeId" id="invoiceStoreList" required>
						            		<option class="blank" value="">-- Choose a Store --</option>
						  					"""),_display_(Seq[Any](/*42.15*/for(store <- Stores.getStoresList()) yield /*42.51*/{_display_(Seq[Any](format.raw/*42.52*/("""
						  						<option value=""""),_display_(Seq[Any](/*43.31*/store/*43.36*/.id)),format.raw/*43.39*/("""">"""),_display_(Seq[Any](/*43.42*/store/*43.47*/.name)),format.raw/*43.52*/("""</option>
						  					""")))})),format.raw/*44.15*/("""
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
						  					<option value="CashPaid">CashPaid</option>
						  					<option value="Others">Others</option>
						  					<option value="Statements">Statements</option>
						  					<option value="Fuel">Fuel</option>
						  				</select> 
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
            				<div class="clearfix" id="invoiceFiles_field">
								<label for="invoiceFiles">Select Files</label>
									<div class="input">
										<input type="file" id="invoiceFiles" name="invoiceFiles" accept="application/pdf" multiple="multiple" onchange="updateList()" required />
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
            		</tr>
            	</table>
         	</div>
		
		 
        
        <span id="displaySelected" style="display:none;"><b>Selected Invoices:</b></span>
		<div id="fileList" style="background-color: white;border-color: #fff;"></div><br/>
		
        <center><input type="submit" value="Upload" class="btn btn-primary" onclick="return invoiceformValidation()"></center>
        
        
	
	""")))})),format.raw/*87.3*/(""" <!-- form ends -->
	
	<a href=""""),_display_(Seq[Any](/*89.12*/routes/*89.18*/.InvoiceInventory.dateSelectPageForHeadOffice())),format.raw/*89.65*/("""" class="pull-right btn btn-success">Uploaded invoices</a>
		</div>
	</div>
	
""")))})),format.raw/*93.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/showUploadPageForHeadOffice.scala.html
                    HASH: f46f7099c930f839e16717e88b159cc0a879fe11
                    MATRIX: 947->54|984->57|995->61|1032->62|1306->300|1321->306|1363->326|1677->604|1692->610|1734->630|1962->822|2003->854|2043->856|2164->941|2178->946|2215->961|2273->988|2316->996|2330->1002|2442->1104|2483->1106|2984->1571|3036->1607|3075->1608|3143->1640|3157->1645|3182->1648|3221->1651|3235->1656|3262->1661|3319->1686|4937->3273|5008->3308|5023->3314|5092->3361|5206->3444
                    LINES: 32->3|33->4|33->4|33->4|41->12|41->12|41->12|47->18|47->18|47->18|54->25|54->25|54->25|56->27|56->27|56->27|58->29|60->31|60->31|60->31|60->31|71->42|71->42|71->42|72->43|72->43|72->43|72->43|72->43|72->43|73->44|116->87|118->89|118->89|118->89|122->93
                    -- GENERATED --
                */
            