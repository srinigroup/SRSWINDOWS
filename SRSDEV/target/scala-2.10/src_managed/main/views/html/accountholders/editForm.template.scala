
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[Long,Form[AccountHolder],Form[ContactInfo],Form[Address],AccountHolder,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long,accountHolderForm: Form[AccountHolder], contactForm: Form[ContactInfo], addressForm: Form[Address],account:AccountHolder ):play.api.templates.HtmlFormat.Appendable = {
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
Seq[Any](format.raw/*1.134*/("""
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
            				<a href=""""),_display_(Seq[Any](/*40.27*/routes/*40.33*/.Application.showOptions("ACCOUNT HOLDER","ALL"))),format.raw/*40.81*/("""" class="btn btn-default">Account Holder</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*41.54*/flash/*41.59*/.get("pageAction"))),format.raw/*41.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*46.27*/routes/*46.33*/.Application.showOptions("ACCOUNT HOLDER",flash.get("pageAction")))),format.raw/*46.99*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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


"""),_display_(Seq[Any](/*61.2*/helper/*61.8*/.form(action = routes.AccountHolders.update(id))/*61.56*/ {_display_(Seq[Any](format.raw/*61.58*/("""

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
								<td> """),_display_(Seq[Any](/*83.15*/select(
					                accountHolderForm("store.id"), 
					                options(Store.options), 
					                '_label -> "Store", '_default -> "-- Choose a store --",
					                '_showConstraints -> false
					            	))),format.raw/*88.20*/("""
								</td>
								<td> """),_display_(Seq[Any](/*90.15*/helper/*90.21*/.inputText(accountHolderForm("accountHolder"), '_label -> "Account Holder Name"))),format.raw/*90.101*/("""</td>
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
									 """),_display_(Seq[Any](/*115.12*/helper/*115.18*/.inputText(contactForm("phone1"), '_label -> "Phone :"))),format.raw/*115.73*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*119.12*/helper/*119.18*/.inputText(contactForm("email"), '_label -> "E-Mail :"))),format.raw/*119.73*/("""
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
								<td> """),_display_(Seq[Any](/*153.15*/helper/*153.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*153.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*155.15*/helper/*155.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*155.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*159.14*/helper/*159.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*159.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*163.11*/helper/*163.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*163.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*167.15*/helper/*167.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*167.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*169.16*/helper/*169.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*169.80*/(""" </td>
								
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
				"""),_display_(Seq[Any](/*183.6*/if((flash.get("pageAction")).equals("MODIFY"))/*183.52*/{_display_(Seq[Any](format.raw/*183.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*186.6*/("""
				"""),_display_(Seq[Any](/*187.6*/if((flash.get("pageAction")).equals("DELETE"))/*187.52*/{_display_(Seq[Any](format.raw/*187.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*189.17*/routes/*189.23*/.Employees.delete(id))),format.raw/*189.44*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
	 			""")))})),format.raw/*191.7*/("""
 				</p>
		    </div>
        </div>
        
    
    </div><!-- panel-group End-->
  
""")))})),format.raw/*199.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*204.2*/("""<!-- main end -->

   """))}
    }
    
    def render(id:Long,accountHolderForm:Form[AccountHolder],contactForm:Form[ContactInfo],addressForm:Form[Address],account:AccountHolder): play.api.templates.HtmlFormat.Appendable = apply(id,accountHolderForm,contactForm,addressForm,account)
    
    def f:((Long,Form[AccountHolder],Form[ContactInfo],Form[Address],AccountHolder) => play.api.templates.HtmlFormat.Appendable) = (id,accountHolderForm,contactForm,addressForm,account) => apply(id,accountHolderForm,contactForm,addressForm,account)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:02 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/accountholders/editForm.scala.html
                    HASH: 479a272a2b68ce545adf917fd798291ac246bbc6
                    MATRIX: 856->1|1166->193|1187->206|1278->288|1304->305|1552->133|1581->155|1608->191|1635->283|1666->522|1697->574|1735->577|1830->663|1869->664|1910->670|1954->692|1990->697|2030->702|2042->706|2080->707|2353->944|2368->950|2410->970|2529->1053|2544->1059|2614->1107|2749->1206|2763->1211|2803->1229|3002->1392|3017->1398|3105->1464|3313->1637|3354->1669|3394->1671|3511->1752|3525->1757|3562->1772|3616->1795|3659->1803|3673->1809|3730->1857|3770->1859|4573->2626|4852->2883|4919->2914|4934->2920|5037->3000|5897->3823|5913->3829|5991->3884|6080->3936|6096->3942|6174->3997|7565->5351|7581->5357|7658->5411|7726->5442|7742->5448|7817->5500|7912->5558|7928->5564|8007->5620|8097->5673|8113->5679|8190->5733|8285->5791|8301->5797|8388->5861|8458->5894|8474->5900|8555->5958|8956->6323|9012->6369|9052->6370|9238->6524|9281->6531|9337->6577|9377->6578|9439->6603|9455->6609|9499->6630|9640->6739|9771->6838|9845->6880
                    LINES: 26->1|33->4|33->4|38->11|38->11|49->1|50->3|50->4|50->9|52->21|54->24|55->25|55->25|55->25|57->27|57->27|59->29|61->31|61->31|61->31|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|76->46|76->46|76->46|84->54|84->54|84->54|86->56|86->56|86->56|88->58|91->61|91->61|91->61|91->61|113->83|118->88|120->90|120->90|120->90|145->115|145->115|145->115|149->119|149->119|149->119|183->153|183->153|183->153|185->155|185->155|185->155|189->159|189->159|189->159|193->163|193->163|193->163|197->167|197->167|197->167|199->169|199->169|199->169|213->183|213->183|213->183|216->186|217->187|217->187|217->187|219->189|219->189|219->189|221->191|229->199|234->204
                    -- GENERATED --
                */
            