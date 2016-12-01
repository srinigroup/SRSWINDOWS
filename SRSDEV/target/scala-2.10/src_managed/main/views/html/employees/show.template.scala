
package views.html.employees

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[Form[Employee],Form[ContactInfo],Form[Address],Form[BankAccountInfo],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(employeeForm: Form[Employee], contactForm: Form[ContactInfo], addressForm: Form[Address],bankAccountForm: Form[BankAccountInfo] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*5.2*/currentDateFormat/*5.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

  curTimeFormat.format(currDate)
}};
Seq[Any](format.raw/*1.132*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/("""
"""),format.raw/*13.2*/("""

"""),_display_(Seq[Any](/*15.2*/main/*15.6*/{_display_(Seq[Any](format.raw/*15.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*23.24*/routes/*23.30*/.Application.index())),format.raw/*23.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*24.27*/routes/*24.33*/.Application.showOptions("STAFF","ALL"))),format.raw/*24.72*/("""" class="btn btn-default">STAFF</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*30.27*/routes/*30.33*/.Application.showOptions("STAFF","ALL"))),format.raw/*30.72*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
     
"""),_display_(Seq[Any](/*43.2*/helper/*43.8*/.form(action = routes.Employees.save(), 'enctype -> "multipart/form-data")/*43.82*/ {_display_(Seq[Any](format.raw/*43.84*/("""

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Employee Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*64.15*/helper/*64.21*/.inputText(employeeForm("firstName"), '_label -> "First Name"))),format.raw/*64.83*/("""</td>
								<td>"""),_display_(Seq[Any](/*65.14*/helper/*65.20*/.inputText(employeeForm("lastName"), '_label -> "Last Name"))),format.raw/*65.80*/("""</td>
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*68.14*/helper/*68.20*/.inputText(employeeForm("shortName"), '_label -> "Short Name(if any)"))),format.raw/*68.90*/("""</td>
								<td>"""),_display_(Seq[Any](/*69.14*/select(
					  				 employeeForm("gender"),
					  				 options(Seq("Female","Male")),
					 				 '_label -> "Gender", '_default -> "-- Select Gender --"
									))),format.raw/*73.11*/("""</td>
							</tr>
							<tr>
								<td>
									<div class="clearfix" id="dob_field">
    									<label for="dob">Date of Birth</label>
    									<div class="input">
											<input type="text" name="dob" class="datepicker1"/>
										</div>
									</div> 
								</td>
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
									 """),_display_(Seq[Any](/*109.12*/helper/*109.18*/.inputText(contactForm("phone1"), '_label -> "Phone1 :"))),format.raw/*109.74*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*113.12*/helper/*113.18*/.inputText(contactForm("email"), '_label -> "E-Mail :", 'onblur -> "javascript:checkForUnique(this,'EMPLOYEE','EMAIL');"))),format.raw/*113.139*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*117.16*/helper/*117.22*/.inputText(contactForm("phone2"), '_label -> "Phone2"))),format.raw/*117.76*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*121.11*/helper/*121.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*121.75*/("""
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
								<td> """),_display_(Seq[Any](/*155.15*/helper/*155.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*155.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*157.15*/helper/*157.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*157.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*161.14*/helper/*161.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*161.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*165.11*/helper/*165.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*165.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*169.15*/helper/*169.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*169.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*171.16*/helper/*171.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*171.80*/(""" </td>
								
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 3 End-->
      	
      	<!-- panel-primary 4-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionFour">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Employement Info
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionFour" class="panel-collapse collapse">
          		<div class="panel-body">
           			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
				
								<td> """),_display_(Seq[Any](/*197.15*/select(
					                employeeForm("company.id"), 
					                options(Company.options), 
					                '_label -> "Company", '_default -> "-- Choose a company --",
					                '_showConstraints -> false
					            	))),format.raw/*202.20*/("""
								</td>
				
								<td> """),_display_(Seq[Any](/*205.15*/select(
					                employeeForm("store.id"), 
					                options(Store.options), 
					                '_label -> "Store", '_default -> "-- Choose a store --",
					                '_showConstraints -> false
					            	))),format.raw/*210.20*/("""
								</td>
							</tr>
							<tr>
								<td>
									<div class="clearfix" id="ecd_field">
    									<label for="ecd">Employment Commence Date</label>
    									<div class="input">
											<input type="text" name="ecd" class="datepicker1" />
										</div>
									</div> 
								</td>
			
								<td>
									"""),_display_(Seq[Any](/*224.11*/select(
						  				 employeeForm("empStatus"),
						  				 options(Seq("Full-time","Part-time","Casual")),
						 				 '_label -> "Employment Status :", '_default -> "-- Choose a Status --"
									))),format.raw/*228.11*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*232.15*/helper/*232.21*/.inputText(employeeForm("sal"), '_label -> "Approved Hourly Rate/Annual Salary :"))),format.raw/*232.103*/("""	</td>
			
								<td>
									"""),_display_(Seq[Any](/*235.11*/select(
					  				 employeeForm("designation"),
					  				 options(Seq("Accountant","Customer Service Officer","Retail Area Manager","Store Manager")),
					 				 '_label -> "Designation :", '_default -> "-- Select Designation --"
									))),format.raw/*239.11*/("""
								</td>
		  
		 
		  					</tr>
		  					<tr >
								<td>
									<div class="control-group """),_display_(Seq[Any](/*246.37*/if(employeeForm("isTaxFree").hasErrors)/*246.76*/{_display_(Seq[Any](format.raw/*246.77*/(""" error """)))})),format.raw/*246.85*/("""">
					    	    	<label class="control-label" for="isTaxFree"> Applying for Tax Free Threshold :</label>
					        		<div class="controls">
					            		<span class="buttonset" id="isTaxFree">
					            			<label class="radio inline">
					                			<input type="radio" name="isTaxFree" value="Y" 
					            	   					"""),_display_(Seq[Any](/*252.28*/if(employeeForm("id").value == null)/*252.64*/ {_display_(Seq[Any](format.raw/*252.66*/(""" checked """)))})),format.raw/*252.76*/(""" >Yes</label>    
					                		<label class="radio inline">
					                			<input type="radio" name="isTaxFree" value="N">No</label>    
					                	</span>
					            	</div>
		  						</td>
		  	  					<td></td>
		  					</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 4 End-->
      	
      	
      	<!-- panel-primary 5-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionFive">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Bank Account Info
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionFive" class="panel-collapse collapse">
          		<div class="panel-body">
           			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
				
								<td>
									 """),_display_(Seq[Any](/*285.12*/helper/*285.18*/.inputText(bankAccountForm("accountName"), '_label -> "Account Name :"))),format.raw/*285.89*/("""
								</td>
				
								<td>
									 """),_display_(Seq[Any](/*289.12*/helper/*289.18*/.inputText(bankAccountForm("accountNumber"), '_label -> "Account Number :"))),format.raw/*289.93*/("""
								</td>
							</tr>
							<tr>
								<td>
									"""),_display_(Seq[Any](/*294.11*/select(
					  				 bankAccountForm("accountType"),
					  				 options(Seq("Current","Savings")),
					 				 '_label -> "Account Type", '_default -> "-- Select Account Type --"
									))),format.raw/*298.11*/("""
								</td>
								<td>
									"""),_display_(Seq[Any](/*301.11*/helper/*301.17*/.inputText(bankAccountForm("bankName"), '_label -> "Bank Name :"))),format.raw/*301.82*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*305.16*/helper/*305.22*/.inputText(bankAccountForm("bsbNumber"), '_label -> "BSB Number"))),format.raw/*305.87*/(""" </td>
								<td></td>
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 5 End-->
      	
      	<!-- panel-primary 6-->
      	<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionSix">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
              			Others
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionSix" class="panel-collapse collapse">
          		<div class="panel-body">
           			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td>  """),_display_(Seq[Any](/*330.16*/helper/*330.22*/.inputFile(employeeForm("tfndf"), '_label -> "Tax File Number Declaration Form :"))),format.raw/*330.104*/(""" </td>
							
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*334.16*/helper/*334.22*/.inputFile(employeeForm("saf"), '_label -> "Super Annuation Form :"))),format.raw/*334.90*/(""" </td>
							
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*338.16*/helper/*338.22*/.inputFile(employeeForm("resume"), '_label -> "Resume :"))),format.raw/*338.79*/(""" </td>
								
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*342.16*/helper/*342.22*/.inputFile(employeeForm("payroll"), '_label -> "Payroll Form :"))),format.raw/*342.86*/(""" </td>
							
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 6 End-->
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
    
    </div><!-- panel-group End-->
  
""")))})),format.raw/*362.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*367.2*/("""<!-- main end -->
 """))}
    }
    
    def render(employeeForm:Form[Employee],contactForm:Form[ContactInfo],addressForm:Form[Address],bankAccountForm:Form[BankAccountInfo]): play.api.templates.HtmlFormat.Appendable = apply(employeeForm,contactForm,addressForm,bankAccountForm)
    
    def f:((Form[Employee],Form[ContactInfo],Form[Address],Form[BankAccountInfo]) => play.api.templates.HtmlFormat.Appendable) = (employeeForm,contactForm,addressForm,bankAccountForm) => apply(employeeForm,contactForm,addressForm,bankAccountForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/employees/show.scala.html
                    HASH: 8665773a302f7db72ce1a1cf2272919d31bdba55
                    MATRIX: 845->1|1105->192|1130->209|1349->131|1378->153|1405->189|1434->397|1474->402|1486->406|1524->407|1797->644|1812->650|1854->670|1973->753|1988->759|2049->798|2340->1053|2355->1059|2416->1098|2637->1284|2678->1316|2718->1318|2835->1399|2849->1404|2886->1419|2940->1442|2986->1453|3000->1459|3083->1533|3123->1535|3905->2281|3920->2287|4004->2349|4060->2369|4075->2375|4157->2435|4240->2482|4255->2488|4347->2558|4403->2578|4593->2746|5763->3879|5779->3885|5858->3941|5947->3993|5963->3999|6108->4120|6204->4179|6220->4185|6297->4239|6386->4291|6402->4297|6483->4355|7874->5709|7890->5715|7967->5769|8035->5800|8051->5806|8126->5858|8221->5916|8237->5922|8316->5978|8406->6031|8422->6037|8499->6091|8594->6149|8610->6155|8697->6219|8767->6252|8783->6258|8864->6316|9732->7147|10015->7407|10089->7444|10364->7696|10750->8045|10979->8251|11074->8309|11090->8315|11196->8397|11270->8434|11540->8681|11687->8791|11736->8830|11776->8831|11817->8839|12211->9196|12257->9232|12298->9234|12341->9244|13470->10336|13486->10342|13580->10413|13665->10461|13681->10467|13779->10542|13884->10610|14099->10802|14177->10843|14193->10849|14281->10914|14377->10973|14393->10979|14481->11044|15341->11867|15357->11873|15463->11955|15559->12014|15575->12020|15666->12088|15762->12147|15778->12153|15858->12210|15955->12270|15971->12276|16058->12340|16658->12908|16732->12950
                    LINES: 26->1|31->5|31->5|40->1|41->3|41->4|42->13|44->15|44->15|44->15|52->23|52->23|52->23|53->24|53->24|53->24|59->30|59->30|59->30|66->37|66->37|66->37|68->39|68->39|68->39|70->41|72->43|72->43|72->43|72->43|93->64|93->64|93->64|94->65|94->65|94->65|97->68|97->68|97->68|98->69|102->73|138->109|138->109|138->109|142->113|142->113|142->113|146->117|146->117|146->117|150->121|150->121|150->121|184->155|184->155|184->155|186->157|186->157|186->157|190->161|190->161|190->161|194->165|194->165|194->165|198->169|198->169|198->169|200->171|200->171|200->171|226->197|231->202|234->205|239->210|253->224|257->228|261->232|261->232|261->232|264->235|268->239|275->246|275->246|275->246|275->246|281->252|281->252|281->252|281->252|314->285|314->285|314->285|318->289|318->289|318->289|323->294|327->298|330->301|330->301|330->301|334->305|334->305|334->305|359->330|359->330|359->330|363->334|363->334|363->334|367->338|367->338|367->338|371->342|371->342|371->342|391->362|396->367
                    -- GENERATED --
                */
            