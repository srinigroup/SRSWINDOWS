
package views.html.suppliers

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Supplier],Form[ContactInfo],Form[Address],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(supplierForm: Form[Supplier], contactForm: Form[ContactInfo], addressForm: Form[Address] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.93*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*15.24*/routes/*15.30*/.Application.index())),format.raw/*15.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*16.75*/("""" class="btn btn-default">SUPPLIER</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*22.75*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
    """),_display_(Seq[Any](/*29.6*/if(flash.containsKey("success"))/*29.38*/ {_display_(Seq[Any](format.raw/*29.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*31.37*/flash/*31.42*/.get("success"))),format.raw/*31.57*/("""
        </div>
    """)))})),format.raw/*33.6*/(""" 
     
"""),_display_(Seq[Any](/*35.2*/helper/*35.8*/.form(action = routes.Suppliers.save())/*35.47*/ {_display_(Seq[Any](format.raw/*35.49*/("""

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Supplier Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>
             	  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*57.15*/helper/*57.21*/.inputText(supplierForm("name"), '_label -> "Supplier Name", 'onblur -> "javascript:checkForUnique(this,'SUPPLIER','NAME');"))),format.raw/*57.146*/("""</td>
								<td>"""),_display_(Seq[Any](/*58.14*/helper/*58.20*/.inputText(supplierForm("description"), '_label -> "Supplier Description"))),format.raw/*58.94*/("""</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*61.15*/helper/*61.21*/.inputText(supplierForm("abn"), '_label -> "Supplier ABN"))),format.raw/*61.79*/(""" </td>
								<td></td>
							</tr>
						</table>
					</div>
            	</div>
        	</div>
      	</div><!-- panel-primary 1 End-->
      	
      	<!-- panel-primary 2-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionTwo">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Contact Info
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionTwo" class="panel-collapse collapse">
          		<div class="panel-body">
           			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td>
									 """),_display_(Seq[Any](/*87.12*/helper/*87.18*/.inputText(contactForm("phone1"), '_label -> "Phone1 :"))),format.raw/*87.74*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*91.12*/helper/*91.18*/.inputText(contactForm("email"), '_label -> "E-Mail :"))),format.raw/*91.73*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*95.16*/helper/*95.22*/.inputText(contactForm("phone2"), '_label -> "Phone2"))),format.raw/*95.76*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*99.11*/helper/*99.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*99.75*/("""
								</td>
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 2 End-->
      	
      	<!-- panel-primary 3-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionThree">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Address
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionThree" class="panel-collapse collapse">
          		<div class="panel-body">
           			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr colspan=2>
								<td>
									<p><label>Search Address</label>
									<input class="text_field" id="addressid" name="searchAddress" type="text" value="" style="width:500px;" onblur="getParsedAddress();getSimilar();"/></p>
									<p><label>Similar Addresses </label>
				                  	<select class="text_field" id="similarAddressesid" name="similarAddresses" size="5" style="width:510px;" onchange="similarAddressesChange()" multiple></select></p>
				                </td>
								<td></td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*133.15*/helper/*133.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*133.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*135.15*/helper/*135.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*135.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*139.14*/helper/*139.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*139.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*143.11*/helper/*143.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*143.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*147.15*/helper/*147.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*147.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*149.16*/helper/*149.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*149.80*/(""" </td>
								
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 3 End-->
      	
      	      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
    
    </div><!-- panel-group End-->
  
""")))})),format.raw/*170.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*175.2*/("""<!-- main end -->
"""))}
    }
    
    def render(supplierForm:Form[Supplier],contactForm:Form[ContactInfo],addressForm:Form[Address]): play.api.templates.HtmlFormat.Appendable = apply(supplierForm,contactForm,addressForm)
    
    def f:((Form[Supplier],Form[ContactInfo],Form[Address]) => play.api.templates.HtmlFormat.Appendable) = (supplierForm,contactForm,addressForm) => apply(supplierForm,contactForm,addressForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/suppliers/show.scala.html
                    HASH: f7817b831a5aaa3a8d46b2f9289eaf35f71376fd
                    MATRIX: 823->3|1061->94|1090->116|1117->152|1156->157|1167->161|1204->162|1477->399|1492->405|1534->425|1653->508|1668->514|1732->556|2026->814|2041->820|2105->862|2326->1048|2367->1080|2407->1082|2524->1163|2538->1168|2575->1183|2629->1206|2675->1217|2689->1223|2737->1262|2777->1264|3575->2026|3590->2032|3738->2157|3794->2177|3809->2183|3905->2257|3989->2305|4004->2311|4084->2369|4963->3212|4978->3218|5056->3274|5144->3326|5159->3332|5236->3387|5331->3446|5346->3452|5422->3506|5510->3558|5525->3564|5605->3622|6996->4976|7012->4982|7089->5036|7157->5067|7173->5073|7248->5125|7343->5183|7359->5189|7438->5245|7528->5298|7544->5304|7621->5358|7716->5416|7732->5422|7819->5486|7889->5519|7905->5525|7986->5583|8603->6168|8677->6210
                    LINES: 26->2|32->2|33->4|33->5|35->7|35->7|35->7|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|57->29|57->29|57->29|59->31|59->31|59->31|61->33|63->35|63->35|63->35|63->35|85->57|85->57|85->57|86->58|86->58|86->58|89->61|89->61|89->61|115->87|115->87|115->87|119->91|119->91|119->91|123->95|123->95|123->95|127->99|127->99|127->99|161->133|161->133|161->133|163->135|163->135|163->135|167->139|167->139|167->139|171->143|171->143|171->143|175->147|175->147|175->147|177->149|177->149|177->149|198->170|203->175
                    -- GENERATED --
                */
            