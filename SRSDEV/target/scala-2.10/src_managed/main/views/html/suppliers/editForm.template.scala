
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Long,Form[Supplier],Form[ContactInfo],Form[Address],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, supplierForm: Form[Supplier], contactForm: Form[ContactInfo], addressForm: Form[Address]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";


Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" 
 
 """),format.raw/*8.1*/("""
"""),_display_(Seq[Any](/*9.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*9.88*/{_display_(Seq[Any](format.raw/*9.89*/("""

	"""),_display_(Seq[Any](/*11.3*/{fieldView="disabled"})),format.raw/*11.25*/("""

""")))})),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/main/*15.6*/{_display_(Seq[Any](format.raw/*15.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*24.24*/routes/*24.30*/.Application.index())),format.raw/*24.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*25.27*/routes/*25.33*/.Application.showOptions("SUPPLIER","ALL"))),format.raw/*25.75*/("""" class="btn btn-default">SUPPLIER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*26.54*/flash/*26.59*/.get("pageAction"))),format.raw/*26.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.Application.showOptions("SUPPLIER",flash.get("pageAction")))),format.raw/*31.93*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*39.3*/if(flash.containsKey("success"))/*39.35*/ {_display_(Seq[Any](format.raw/*39.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*41.37*/flash/*41.42*/.get("success"))),format.raw/*41.57*/("""
        </div>
    """)))})),format.raw/*43.6*/(""" 

   
 
	"""),_display_(Seq[Any](/*47.3*/helper/*47.9*/.form(action = routes.Suppliers.update(id))/*47.52*/ {_display_(Seq[Any](format.raw/*47.54*/("""


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
								<td>"""),_display_(Seq[Any](/*69.14*/helper/*69.20*/.inputText(supplierForm("name"), '_label -> "Supplier Name"))),format.raw/*69.80*/("""</td>
								<td>"""),_display_(Seq[Any](/*70.14*/helper/*70.20*/.inputText(supplierForm("description"), '_label -> "Supplier Description"))),format.raw/*70.94*/("""</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*73.15*/helper/*73.21*/.inputText(supplierForm("abn"), '_label -> "Supplier ABN"))),format.raw/*73.79*/(""" </td>
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
									 """),_display_(Seq[Any](/*99.12*/helper/*99.18*/.inputText(contactForm("phone1"), '_label -> "Phone1 :"))),format.raw/*99.74*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*103.12*/helper/*103.18*/.inputText(contactForm("email"), '_label -> "E-Mail :"))),format.raw/*103.73*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*107.16*/helper/*107.22*/.inputText(contactForm("phone2"), '_label -> "Phone2"))),format.raw/*107.76*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*111.11*/helper/*111.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*111.75*/("""
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
        					"""),_display_(Seq[Any](/*135.15*/if(!fieldView.equals("disabled"))/*135.48*/{_display_(Seq[Any](format.raw/*135.49*/("""
								<tr colspan=2>
									<td>
										<p><label>Search Address</label>
										<input class="text_field" id="addressid" name="searchAddress" type="text" value="" style="width:500px;" onblur="getParsedAddress();getSimilar();"/></p>
										<p><label>Similar Addresses </label>
					                  	<select class="text_field" id="similarAddressesid" name="similarAddresses" size="5" style="width:510px;" onchange="similarAddressesChange()" multiple></select></p>
					                </td>
									<td></td>
								
								</tr>
							""")))})),format.raw/*146.9*/("""
							<tr>
								<td> """),_display_(Seq[Any](/*148.15*/helper/*148.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*148.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*150.15*/helper/*150.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*150.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*154.14*/helper/*154.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*154.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*158.11*/helper/*158.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*158.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*162.15*/helper/*162.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*162.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*164.16*/helper/*164.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*164.80*/(""" </td>
								
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 3 End-->
      	      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*177.6*/if((flash.get("pageAction")).equals("MODIFY"))/*177.52*/{_display_(Seq[Any](format.raw/*177.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*180.6*/("""
				"""),_display_(Seq[Any](/*181.6*/if((flash.get("pageAction")).equals("DELETE"))/*181.52*/{_display_(Seq[Any](format.raw/*181.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*183.17*/routes/*183.23*/.Suppliers.delete(id))),format.raw/*183.44*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
	 			""")))})),format.raw/*185.7*/("""
 				</p>
		    </div>
        </div>
       
    
    </div><!-- panel-group End-->


""")))})),format.raw/*194.2*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*199.2*/("""<!-- main end -->
"""))}
    }
    
    def render(id:Long,supplierForm:Form[Supplier],contactForm:Form[ContactInfo],addressForm:Form[Address]): play.api.templates.HtmlFormat.Appendable = apply(id,supplierForm,contactForm,addressForm)
    
    def f:((Long,Form[Supplier],Form[ContactInfo],Form[Address]) => play.api.templates.HtmlFormat.Appendable) = (id,supplierForm,contactForm,addressForm) => apply(id,supplierForm,contactForm,addressForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/suppliers/editForm.scala.html
                    HASH: c375a30ac78f2514b5e0340f3690bf35192bc29e
                    MATRIX: 832->1|1123->101|1151->120|1178->155|1209->206|1245->208|1339->294|1377->295|1416->299|1460->321|1494->324|1532->327|1544->331|1582->332|1850->564|1865->570|1907->590|2025->672|2040->678|2104->720|2232->812|2246->817|2286->835|2480->993|2495->999|2577->1059|2777->1224|2818->1256|2858->1258|2973->1337|2987->1342|3024->1357|3076->1378|3122->1389|3136->1395|3188->1438|3228->1440|3989->2165|4004->2171|4086->2231|4141->2250|4156->2256|4252->2330|4333->2375|4348->2381|4428->2439|5281->3256|5296->3262|5374->3318|5459->3366|5475->3372|5553->3427|5645->3482|5661->3488|5738->3542|5823->3590|5839->3596|5920->3654|6737->4434|6780->4467|6820->4468|7407->5023|7471->5050|7487->5056|7564->5110|7630->5139|7646->5145|7721->5197|7812->5251|7828->5257|7907->5313|7993->5362|8009->5368|8086->5422|8177->5476|8193->5482|8280->5546|8348->5577|8364->5583|8445->5641|8824->5984|8880->6030|8920->6031|9103->6182|9145->6188|9201->6234|9241->6235|9301->6258|9317->6264|9361->6285|9500->6392|9621->6481|9691->6519
                    LINES: 26->1|34->1|36->4|36->5|38->8|39->9|39->9|39->9|41->11|41->11|43->13|45->15|45->15|45->15|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|61->31|61->31|61->31|69->39|69->39|69->39|71->41|71->41|71->41|73->43|77->47|77->47|77->47|77->47|99->69|99->69|99->69|100->70|100->70|100->70|103->73|103->73|103->73|129->99|129->99|129->99|133->103|133->103|133->103|137->107|137->107|137->107|141->111|141->111|141->111|165->135|165->135|165->135|176->146|178->148|178->148|178->148|180->150|180->150|180->150|184->154|184->154|184->154|188->158|188->158|188->158|192->162|192->162|192->162|194->164|194->164|194->164|207->177|207->177|207->177|210->180|211->181|211->181|211->181|213->183|213->183|213->183|215->185|224->194|229->199
                    -- GENERATED --
                */
            