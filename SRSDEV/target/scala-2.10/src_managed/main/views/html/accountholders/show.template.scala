
package views.html.accountholders

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[AccountHolder],Form[ContactInfo],Form[Address],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(accountHolderForm: Form[AccountHolder], contactForm: Form[ContactInfo], addressForm: Form[Address] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.103*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*15.24*/routes/*15.30*/.Application.index())),format.raw/*15.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*16.75*/("""" class="btn btn-default">ACCOUNT HOLDER</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Application.showOptions("ACCOUNT HOLDER","ALL"))),format.raw/*22.81*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
     
"""),_display_(Seq[Any](/*35.2*/helper/*35.8*/.form(action = routes.AccountHolders.save())/*35.52*/ {_display_(Seq[Any](format.raw/*35.54*/("""

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			AccountHolder Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>
             	  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*57.15*/select(
					                accountHolderForm("store.id"), 
					                options(Store.options), 
					                '_label -> "Store", '_default -> "-- Choose a store --",
					                '_showConstraints -> false
					            	))),format.raw/*62.20*/("""
								</td>
								<td> """),_display_(Seq[Any](/*64.15*/helper/*64.21*/.inputText(accountHolderForm("accountHolder"), '_label -> "Account Holder Name"))),format.raw/*64.101*/("""</td>
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
									 """),_display_(Seq[Any](/*89.12*/helper/*89.18*/.inputText(contactForm("phone1"), '_label -> "Phone :"))),format.raw/*89.73*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*93.12*/helper/*93.18*/.inputText(contactForm("email"), '_label -> "E-Mail :"))),format.raw/*93.73*/("""
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
								<td> """),_display_(Seq[Any](/*127.15*/helper/*127.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*127.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*129.15*/helper/*129.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*129.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*133.14*/helper/*133.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*133.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*137.11*/helper/*137.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*137.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*141.15*/helper/*141.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*141.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*143.16*/helper/*143.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*143.80*/(""" </td>
								
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
  
""")))})),format.raw/*164.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*169.2*/("""<!-- main end -->
"""))}
    }
    
    def render(accountHolderForm:Form[AccountHolder],contactForm:Form[ContactInfo],addressForm:Form[Address]): play.api.templates.HtmlFormat.Appendable = apply(accountHolderForm,contactForm,addressForm)
    
    def f:((Form[AccountHolder],Form[ContactInfo],Form[Address]) => play.api.templates.HtmlFormat.Appendable) = (accountHolderForm,contactForm,addressForm) => apply(accountHolderForm,contactForm,addressForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:02 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/accountholders/show.scala.html
                    HASH: 8d747d685e8a81ca94cd59c52b1767104a4e8d34
                    MATRIX: 833->3|1082->104|1111->126|1138->162|1177->167|1188->171|1225->172|1498->409|1513->415|1555->435|1674->518|1689->524|1753->566|2053->830|2068->836|2138->884|2359->1070|2400->1102|2440->1104|2557->1185|2571->1190|2608->1205|2662->1228|2708->1239|2722->1245|2775->1289|2815->1291|3618->2058|3897->2315|3964->2346|3979->2352|4082->2432|4941->3255|4956->3261|5033->3316|5121->3368|5136->3374|5213->3429|6604->4783|6620->4789|6697->4843|6765->4874|6781->4880|6856->4932|6951->4990|6967->4996|7046->5052|7136->5105|7152->5111|7229->5165|7324->5223|7340->5229|7427->5293|7497->5326|7513->5332|7594->5390|8211->5975|8285->6017
                    LINES: 26->2|32->2|33->4|33->5|35->7|35->7|35->7|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|57->29|57->29|57->29|59->31|59->31|59->31|61->33|63->35|63->35|63->35|63->35|85->57|90->62|92->64|92->64|92->64|117->89|117->89|117->89|121->93|121->93|121->93|155->127|155->127|155->127|157->129|157->129|157->129|161->133|161->133|161->133|165->137|165->137|165->137|169->141|169->141|169->141|171->143|171->143|171->143|192->164|197->169
                    -- GENERATED --
                */
            