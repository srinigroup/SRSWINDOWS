
package views.html.companies

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[Company],Form[ContactInfo],Form[Address],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(companyForm: Form[Company], contactForm: Form[ContactInfo], addressForm: Form[Address] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.91*/("""
 """),format.raw/*3.1*/(""" """),_display_(Seq[Any](/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*12.24*/routes/*12.30*/.Application.index())),format.raw/*12.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*13.27*/routes/*13.33*/.Application.showOptions("COMPANY","ALL"))),format.raw/*13.74*/("""" class="btn btn-default">COMPANY</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Application.showOptions("COMPANY","ALL"))),format.raw/*19.74*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
	
  
  	"""),_display_(Seq[Any](/*33.5*/helper/*33.11*/.form(action = routes.Companies.save())/*33.50*/ {_display_(Seq[Any](format.raw/*33.52*/("""
		

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Company Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*55.15*/helper/*55.21*/.inputText(companyForm("name"), '_label -> "Company Name", 'onblur -> "javascript:checkForUnique(this,'COMPANY','NAME');"))),format.raw/*55.143*/("""</td>
								<td>"""),_display_(Seq[Any](/*56.14*/helper/*56.20*/.inputText(companyForm("director"), '_label -> "Company Director"))),format.raw/*56.86*/("""</td>
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*59.14*/helper/*59.20*/.inputText(companyForm("description"), '_label -> "Company Description"))),format.raw/*59.92*/("""</td>
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
									 """),_display_(Seq[Any](/*85.12*/helper/*85.18*/.inputText(contactForm("phone1"), '_label -> "Phone1 :"))),format.raw/*85.74*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*89.12*/helper/*89.18*/.inputText(contactForm("email"), '_label -> "E-Mail :"))),format.raw/*89.73*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*93.16*/helper/*93.22*/.inputText(contactForm("phone2"), '_label -> "Phone2"))),format.raw/*93.76*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*97.11*/helper/*97.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*97.75*/("""
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
								<td> """),_display_(Seq[Any](/*131.15*/helper/*131.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*131.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*133.15*/helper/*133.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*133.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*137.14*/helper/*137.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*137.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*141.11*/helper/*141.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*141.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*145.15*/helper/*145.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*145.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*147.16*/helper/*147.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*147.80*/(""" </td>
								
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


	""")))})),format.raw/*169.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*174.2*/("""<!-- main end -->
   """))}
    }
    
    def render(companyForm:Form[Company],contactForm:Form[ContactInfo],addressForm:Form[Address]): play.api.templates.HtmlFormat.Appendable = apply(companyForm,contactForm,addressForm)
    
    def f:((Form[Company],Form[ContactInfo],Form[Address]) => play.api.templates.HtmlFormat.Appendable) = (companyForm,contactForm,addressForm) => apply(companyForm,contactForm,addressForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:03 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/companies/show.scala.html
                    HASH: b8fe5cd1cae62af87cf218756d467dd72cb69497
                    MATRIX: 822->1|1058->90|1087->112|1123->149|1134->153|1171->154|1444->391|1459->397|1501->417|1620->500|1635->506|1698->547|1991->804|2006->810|2069->851|2293->1039|2334->1071|2374->1073|2495->1158|2509->1163|2546->1178|2604->1205|2652->1218|2667->1224|2715->1263|2755->1265|3540->2014|3555->2020|3700->2142|3756->2162|3771->2168|3859->2234|3942->2281|3957->2287|4051->2359|4929->3201|4944->3207|5022->3263|5110->3315|5125->3321|5202->3376|5297->3435|5312->3441|5388->3495|5476->3547|5491->3553|5571->3611|6962->4965|6978->4971|7055->5025|7123->5056|7139->5062|7214->5114|7309->5172|7325->5178|7404->5234|7494->5287|7510->5293|7587->5347|7682->5405|7698->5411|7785->5475|7855->5508|7871->5514|7952->5572|8563->6151|8638->6194
                    LINES: 26->1|32->1|33->3|33->4|33->4|33->4|41->12|41->12|41->12|42->13|42->13|42->13|48->19|48->19|48->19|55->26|55->26|55->26|57->28|57->28|57->28|59->30|62->33|62->33|62->33|62->33|84->55|84->55|84->55|85->56|85->56|85->56|88->59|88->59|88->59|114->85|114->85|114->85|118->89|118->89|118->89|122->93|122->93|122->93|126->97|126->97|126->97|160->131|160->131|160->131|162->133|162->133|162->133|166->137|166->137|166->137|170->141|170->141|170->141|174->145|174->145|174->145|176->147|176->147|176->147|198->169|203->174
                    -- GENERATED --
                */
            