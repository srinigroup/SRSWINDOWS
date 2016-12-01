
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template6[Long,Form[Employee],Form[ContactInfo],Form[Address],Form[BankAccountInfo],Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long,employeeForm: Form[Employee], contactForm: Form[ContactInfo], addressForm: Form[Address],bankAccountForm: Form[BankAccountInfo],employee:Employee ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.lang.String; var fieldView = ""; 

def /*4.3*/checkSelected/*4.16*/(id:Long,category:String) = {{
    
    var result = ""
   
    result
}};def /*11.2*/currentDateFormat/*11.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

	if(currDate != null){
  curTimeFormat.format(currDate)
  }
}};
Seq[Any](format.raw/*1.159*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/(""" """),format.raw/*9.2*/("""

"""),format.raw/*21.2*/("""

"""),format.raw/*24.1*/("""
"""),_display_(Seq[Any](/*25.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*25.88*/{_display_(Seq[Any](format.raw/*25.89*/("""

	"""),_display_(Seq[Any](/*27.3*/{fieldView="disabled"})),format.raw/*27.25*/("""

""")))})),format.raw/*29.2*/("""

"""),_display_(Seq[Any](/*31.2*/main/*31.6*/{_display_(Seq[Any](format.raw/*31.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*39.24*/routes/*39.30*/.Application.index())),format.raw/*39.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Application.showOptions("STAFF","ALL"))),format.raw/*40.72*/("""" class="btn btn-default">STAFF</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*41.54*/flash/*41.59*/.get("pageAction"))),format.raw/*41.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*46.27*/routes/*46.33*/.Application.showOptions("STAFF",flash.get("pageAction")))),format.raw/*46.90*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*54.3*/if(flash.containsKey("success"))/*54.35*/ {_display_(Seq[Any](format.raw/*54.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*56.37*/flash/*56.42*/.get("success"))),format.raw/*56.57*/("""
        </div>
    """)))})),format.raw/*58.6*/(""" 


"""),_display_(Seq[Any](/*61.2*/helper/*61.8*/.form(action = routes.Employees.update(id),'enctype -> "multipart/form-data")/*61.85*/ {_display_(Seq[Any](format.raw/*61.87*/("""


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
								<td> """),_display_(Seq[Any](/*83.15*/helper/*83.21*/.inputText(employeeForm("firstName"), '_label -> "First Name"))),format.raw/*83.83*/("""</td>
								<td>"""),_display_(Seq[Any](/*84.14*/helper/*84.20*/.inputText(employeeForm("lastName"), '_label -> "Last Name"))),format.raw/*84.80*/("""</td>
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*87.14*/helper/*87.20*/.inputText(employeeForm("shortName"), '_label -> "Short Name(if any)"))),format.raw/*87.90*/("""</td>
								<td>
									"""),_display_(Seq[Any](/*89.11*/select(
					  				 employeeForm("gender"),
					  				 options(Seq("Female","Male")),
					 				 '_label -> "Gender", '_default -> "-- Select Gender --"
									))),format.raw/*93.11*/("""
								</td>
				
							</tr>
							<tr>
								<td>
									<div class="clearfix" id="dob_field">
    									<label for="dob">Date of Birth</label>
    									<div class="input">
											<input type="text" name="dob" class="datepicker1" value=""""),_display_(Seq[Any](/*102.70*/currentDateFormat(employee.dob))),format.raw/*102.101*/("""" />
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
									 """),_display_(Seq[Any](/*131.12*/helper/*131.18*/.inputText(contactForm("phone1"), '_label -> "Phone1 :"))),format.raw/*131.74*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*135.12*/helper/*135.18*/.inputText(contactForm("email"), '_label -> "E-Mail :"))),format.raw/*135.73*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*139.16*/helper/*139.22*/.inputText(contactForm("phone2"), '_label -> "Phone2"))),format.raw/*139.76*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*143.11*/helper/*143.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*143.75*/("""
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
        					"""),_display_(Seq[Any](/*167.15*/if(!fieldView.equals("disabled"))/*167.48*/{_display_(Seq[Any](format.raw/*167.49*/("""
								<tr colspan=2>
									<td>
										<p><label>Search Address</label>
										<input class="text_field" id="addressid" name="searchAddress" type="text" value="" style="width:500px;" onblur="getParsedAddress();getSimilar();"/></p>
										<p><label>Similar Addresses </label>
					                  	<select class="text_field" id="similarAddressesid" name="similarAddresses" size="5" style="width:510px;" onchange="similarAddressesChange()" multiple></select></p>
					                </td>
									<td></td>
								
								</tr>
							""")))})),format.raw/*178.9*/("""
							<tr>
								<td> """),_display_(Seq[Any](/*180.15*/helper/*180.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*180.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*182.15*/helper/*182.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*182.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*186.14*/helper/*186.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*186.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*190.11*/helper/*190.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*190.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*194.15*/helper/*194.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*194.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*196.16*/helper/*196.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*196.80*/(""" </td>
								
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
								<td> 
									"""),_display_(Seq[Any](/*222.11*/select(
					                employeeForm("company.id"), 
					                options(Company.options), 
					                '_label -> "Company", '_default -> "-- Choose a company --",
					                '_showConstraints -> false
					            	))),format.raw/*227.20*/("""
								</td>
								<td> 
									"""),_display_(Seq[Any](/*230.11*/select(
						                employeeForm("store.id"), 
						                options(Store.options), 
						                '_label -> "Store", '_default -> "-- Choose a store --",
						                '_showConstraints -> false
						            ))),format.raw/*235.20*/("""
								</td>
							</tr>
							<tr>
								<td>
									<div class="clearfix" id="ecd_field">
    									<label for="ecd">Employment Commence Date</label>
    									<div class="input">
											<input type="text" name="ecd" class="datepicker1" value=""""),_display_(Seq[Any](/*243.70*/currentDateFormat(employee.ecd))),format.raw/*243.101*/("""" />	
										</div>
									</div>
								</td>
								<td>
									"""),_display_(Seq[Any](/*248.11*/select(
					  				 employeeForm("empStatus"),
					  				 options(Seq("Full-time","Part-time","Casual")),
					 				 '_label -> "Employment Status :", '_default -> "-- Choose a Status --"
									))),format.raw/*252.11*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*256.15*/helper/*256.21*/.inputText(employeeForm("sal"), '_label -> "Approved Hourly Rate/Annual Salary :"))),format.raw/*256.103*/("""	</td>
			
								<td>
									"""),_display_(Seq[Any](/*259.11*/select(
					  				 employeeForm("Designation"),
					  				 options(Seq("Accountant","Customer Service Officer","Retail Area Manager","Store Manager")),
					 				 '_label -> "Designation :", '_default -> "-- Select Designation --"
									))),format.raw/*263.11*/("""
							  	</td>
							</tr>
		  					<tr >
								<td>
									<div class="control-group """),_display_(Seq[Any](/*268.37*/if(employeeForm("isTaxFree").hasErrors)/*268.76*/{_display_(Seq[Any](format.raw/*268.77*/(""" error """)))})),format.raw/*268.85*/("""">
					    	    	<label class="control-label" for="isTaxFree"> Applying for Tax Free Threshold :</label>
					        		<div class="controls">
					            		<span class="buttonset" id="isTaxFree">
					            			<label class="radio inline">
					                			<input type="radio" name="isTaxFree" value="Y" 
					            	   					"""),_display_(Seq[Any](/*274.28*/if(employeeForm("isTaxFree").value != null && employeeForm("isTaxFree").value == "Y")/*274.113*/ {_display_(Seq[Any](format.raw/*274.115*/(""" checked """)))})),format.raw/*274.125*/(""" >Yes</label>    
					                		<label class="radio inline">
					                			<input type="radio" name="isTaxFree" value="N"
					                   					"""),_display_(Seq[Any](/*277.31*/if(employeeForm("isTaxFree").value != null && employeeForm("isTaxFree").value == "N")/*277.116*/ {_display_(Seq[Any](format.raw/*277.118*/(""" checked """)))})),format.raw/*277.128*/(""">No</label>    
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
					 				"""),_display_(Seq[Any](/*307.12*/helper/*307.18*/.inputText(bankAccountForm("accountName"), '_label -> "Account Name :"))),format.raw/*307.89*/("""
								</td>
								<td>
					 				"""),_display_(Seq[Any](/*310.12*/helper/*310.18*/.inputText(bankAccountForm("accountNumber"), '_label -> "Account Number :"))),format.raw/*310.93*/("""
								</td>
							</tr>
							<tr>
								<td>
									"""),_display_(Seq[Any](/*315.11*/select(
					  				 bankAccountForm("accountType"),
					  				 options(Seq("Current","Savings")),
					 				 '_label -> "Account Type", '_default -> "-- Select Account Type --"
									))),format.raw/*319.11*/("""
								</td>
								<td>"""),_display_(Seq[Any](/*321.14*/helper/*321.20*/.inputText(bankAccountForm("bankName"), '_label -> "Bank Name :"))),format.raw/*321.85*/("""</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*324.16*/helper/*324.22*/.inputText(bankAccountForm("bsbNumber"), '_label -> "BSB Number"))),format.raw/*324.87*/(""" </td>
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
								<td>  """),_display_(Seq[Any](/*349.16*/helper/*349.22*/.inputFile(employeeForm("tfndf"), '_label -> "Tax File Number Declaration Form :"))),format.raw/*349.104*/("""</td><td>** """),_display_(Seq[Any](/*349.117*/employee/*349.125*/.tfndf)),format.raw/*349.131*/(""" </td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*352.16*/helper/*352.22*/.inputFile(employeeForm("saf"), '_label -> "Super Annuation Form :"))),format.raw/*352.90*/(""" </td><td>** """),_display_(Seq[Any](/*352.104*/employee/*352.112*/.saf)),format.raw/*352.116*/(""" </td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*355.16*/helper/*355.22*/.inputFile(employeeForm("resume"), '_label -> "Resume :"))),format.raw/*355.79*/(""" </td><td>** """),_display_(Seq[Any](/*355.93*/employee/*355.101*/.resume)),format.raw/*355.108*/(""" </td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*358.16*/helper/*358.22*/.inputFile(employeeForm("payroll"), '_label -> "Payroll Form :"))),format.raw/*358.86*/("""</td><td>** """),_display_(Seq[Any](/*358.99*/employee/*358.107*/.payroll)),format.raw/*358.115*/(""" </td>
							</tr>
						</table>
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 6 End-->
	    	
      	
      	
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*373.6*/if((flash.get("pageAction")).equals("MODIFY"))/*373.52*/{_display_(Seq[Any](format.raw/*373.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*376.6*/("""
				"""),_display_(Seq[Any](/*377.6*/if((flash.get("pageAction")).equals("DELETE"))/*377.52*/{_display_(Seq[Any](format.raw/*377.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*379.17*/routes/*379.23*/.Employees.delete(id))),format.raw/*379.44*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
	 			""")))})),format.raw/*381.7*/("""
 				</p>
		    </div>
        </div>
       
    
    </div><!-- panel-group End-->
	
	
	""")))})),format.raw/*390.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*395.2*/("""<!-- main end -->

   """))}
    }
    
    def render(id:Long,employeeForm:Form[Employee],contactForm:Form[ContactInfo],addressForm:Form[Address],bankAccountForm:Form[BankAccountInfo],employee:Employee): play.api.templates.HtmlFormat.Appendable = apply(id,employeeForm,contactForm,addressForm,bankAccountForm,employee)
    
    def f:((Long,Form[Employee],Form[ContactInfo],Form[Address],Form[BankAccountInfo],Employee) => play.api.templates.HtmlFormat.Appendable) = (id,employeeForm,contactForm,addressForm,bankAccountForm,employee) => apply(id,employeeForm,contactForm,addressForm,bankAccountForm,employee)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/employees/editForm.scala.html
                    HASH: 4208fb8075cdb3fc25efac58c51aed7a1c8fb1cd
                    MATRIX: 863->1|1198->218|1219->231|1310->313|1336->330|1584->158|1613->180|1640->216|1667->308|1698->547|1729->599|1767->602|1862->688|1901->689|1942->695|1986->717|2022->722|2062->727|2074->731|2112->732|2385->969|2400->975|2442->995|2561->1078|2576->1084|2637->1123|2763->1213|2777->1218|2817->1236|3016->1399|3031->1405|3110->1462|3318->1635|3359->1667|3399->1669|3516->1750|3530->1755|3567->1770|3621->1793|3664->1801|3678->1807|3764->1884|3804->1886|4588->2634|4603->2640|4687->2702|4743->2722|4758->2728|4840->2788|4923->2835|4938->2841|5030->2911|5097->2942|5287->3110|5592->3378|5647->3409|6575->4300|6591->4306|6670->4362|6759->4414|6775->4420|6853->4475|6949->4534|6965->4540|7042->4594|7131->4646|7147->4652|7228->4710|8069->5514|8112->5547|8152->5548|8750->6114|8816->6143|8832->6149|8909->6203|8977->6234|8993->6240|9068->6292|9163->6350|9179->6356|9258->6412|9348->6465|9364->6471|9441->6525|9536->6583|9552->6589|9639->6653|9709->6686|9725->6692|9806->6750|10680->7587|10963->7847|11042->7889|11321->8145|11631->8418|11686->8449|11804->8530|12030->8733|12125->8791|12141->8797|12247->8879|12321->8916|12591->9163|12727->9262|12776->9301|12816->9302|12857->9310|13251->9667|13347->9752|13389->9754|13433->9764|13644->9938|13740->10023|13782->10025|13826->10035|14805->10977|14821->10983|14915->11054|14994->11096|15010->11102|15108->11177|15213->11245|15428->11437|15495->11467|15511->11473|15599->11538|15685->11587|15701->11593|15789->11658|16651->12483|16667->12489|16773->12571|16824->12584|16843->12592|16873->12598|16960->12648|16976->12654|17067->12722|17119->12736|17138->12744|17166->12748|17253->12798|17269->12804|17349->12861|17400->12875|17419->12883|17450->12890|17537->12940|17553->12946|17640->13010|17690->13023|17709->13031|17741->13039|18142->13404|18198->13450|18238->13451|18424->13605|18467->13612|18523->13658|18563->13659|18625->13684|18641->13690|18685->13711|18826->13820|18959->13921|19034->13964
                    LINES: 26->1|33->4|33->4|38->11|38->11|49->1|50->3|50->4|50->9|52->21|54->24|55->25|55->25|55->25|57->27|57->27|59->29|61->31|61->31|61->31|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|76->46|76->46|76->46|84->54|84->54|84->54|86->56|86->56|86->56|88->58|91->61|91->61|91->61|91->61|113->83|113->83|113->83|114->84|114->84|114->84|117->87|117->87|117->87|119->89|123->93|132->102|132->102|161->131|161->131|161->131|165->135|165->135|165->135|169->139|169->139|169->139|173->143|173->143|173->143|197->167|197->167|197->167|208->178|210->180|210->180|210->180|212->182|212->182|212->182|216->186|216->186|216->186|220->190|220->190|220->190|224->194|224->194|224->194|226->196|226->196|226->196|252->222|257->227|260->230|265->235|273->243|273->243|278->248|282->252|286->256|286->256|286->256|289->259|293->263|298->268|298->268|298->268|298->268|304->274|304->274|304->274|304->274|307->277|307->277|307->277|307->277|337->307|337->307|337->307|340->310|340->310|340->310|345->315|349->319|351->321|351->321|351->321|354->324|354->324|354->324|379->349|379->349|379->349|379->349|379->349|379->349|382->352|382->352|382->352|382->352|382->352|382->352|385->355|385->355|385->355|385->355|385->355|385->355|388->358|388->358|388->358|388->358|388->358|388->358|403->373|403->373|403->373|406->376|407->377|407->377|407->377|409->379|409->379|409->379|411->381|420->390|425->395
                    -- GENERATED --
                */
            