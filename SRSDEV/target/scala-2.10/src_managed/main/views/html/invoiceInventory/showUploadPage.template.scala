
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
object showUploadPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id:Long ,invoiceTypeList : List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*13.24*/routes/*13.30*/.Application.index())),format.raw/*13.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">INVOICE</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Application.index())),format.raw/*19.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*26.12*/if(flash.containsKey("success"))/*26.44*/ {_display_(Seq[Any](format.raw/*26.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*28.39*/flash/*28.44*/.get("success"))),format.raw/*28.59*/("""
		        </div>
		    """)))})),format.raw/*30.8*/(""" 
	
	"""),_display_(Seq[Any](/*32.3*/helper/*32.9*/.form(action = routes.InvoiceInventory.uploadInvoices(id),'enctype -> "multipart/form-data")/*32.101*/ {_display_(Seq[Any](format.raw/*32.103*/("""
	<div class="panel panel-success" style="height:210px;border-color:#000000;" >
		<div class="panel-heading" style="background-color:#9fdf9f;height:60px;"><center> <h2 style="color:#000;margin-top: 5px">Upload Invoice </h2></center></div>
	   		 <div class="panel-body" style="font-size: 16px;">
				<div class="table-responsive">
	  				<table style="background-color: #dff0d8;border-color:#000000;" class="table table-bordered">
	  					<tr>
	            			<td>
	            				<div class="clearfix" id="invoiceType_field">
									<label for="invoiceType"><b style="font-size:15px;">InvoiceType</b></label>
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
									<label for="invoiceFiles"><b style="font-size:15px;">Select Files</b></label>
										<div class="input">
											<input type="file" id="invoiceFiles" name="invoiceFiles" accept="application/pdf" multiple="multiple" onchange="javascript:updateList()" required />
										    <span class="help-inline"></span>
										</div>
								</div>
						  	</td>
	            		</tr>
	            	</table>
	            	        <center><input type="submit" value="Upload" class="btn btn-primary" onclick="return invoiceformValidation()"></center>
	            	
	         	</div>
	         </div>
		</div>			
		 
        <span id="displaySelected" style="display:none;"><b>Selected Invoices:</b></span>
		<div id="fileList" style="background-color: white;border-color: #fff;"></div><br/>
		
        
        
	
	""")))})),format.raw/*77.3*/(""" <!-- form ends -->
	
		<!--<a href="#" data-toggle="popover" title="Total Invoices : """),_display_(Seq[Any](/*79.66*/Invoice/*79.73*/.pendingInvoicesByStore(id))),format.raw/*79.100*/("""" data-content="<ul>"""),_display_(Seq[Any](/*79.121*/for(invoiceType <- invoiceTypeList) yield /*79.156*/{_display_(Seq[Any](format.raw/*79.157*/("""<li><a href='"""),_display_(Seq[Any](/*79.171*/routes/*79.177*/.InvoiceInventory.getInvoicesByStoreAndType(id,invoiceType))),format.raw/*79.236*/("""'>"""),_display_(Seq[Any](/*79.239*/invoiceType)),format.raw/*79.250*/("""</a> : """),_display_(Seq[Any](/*79.258*/Invoice/*79.265*/.pendingInvoicesByStoreAndType(id,invoiceType))),format.raw/*79.311*/("""</li>""")))})),format.raw/*79.317*/("""</ul>" data-placement="bottom" class="pull-right btn btn-success">Uploaded Invoices</a> -->
		<a href=""""),_display_(Seq[Any](/*80.13*/routes/*80.19*/.InvoiceInventory.dateSelectPageForSK(id))),format.raw/*80.60*/("""" class="pull-right btn btn-success">Uploaded invoices</a>
	
		</div>
	</div>
	
""")))})),format.raw/*85.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(id:Long,invoiceTypeList:List[String]): play.api.templates.HtmlFormat.Appendable = apply(id,invoiceTypeList)
    
    def f:((Long,List[String]) => play.api.templates.HtmlFormat.Appendable) = (id,invoiceTypeList) => apply(id,invoiceTypeList)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/invoiceInventory/showUploadPage.scala.html
                    HASH: 704d0ccaf0faa4a19e6ee7b19c971da24853ece9
                    MATRIX: 811->1|999->42|1027->98|1064->101|1075->105|1112->106|1386->344|1401->350|1443->370|1758->649|1773->655|1815->675|2043->867|2084->899|2124->901|2245->986|2259->991|2296->1006|2354->1033|2397->1041|2411->1047|2513->1139|2554->1141|4650->3206|4775->3295|4791->3302|4841->3329|4899->3350|4951->3385|4991->3386|5042->3400|5058->3406|5140->3465|5180->3468|5214->3479|5259->3487|5276->3494|5345->3540|5384->3546|5525->3651|5540->3657|5603->3698|5720->3784
                    LINES: 26->1|32->1|33->4|34->5|34->5|34->5|42->13|42->13|42->13|48->19|48->19|48->19|55->26|55->26|55->26|57->28|57->28|57->28|59->30|61->32|61->32|61->32|61->32|106->77|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|108->79|109->80|109->80|109->80|114->85
                    -- GENERATED --
                */
            