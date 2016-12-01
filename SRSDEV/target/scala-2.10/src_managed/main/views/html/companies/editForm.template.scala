
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template5[Long,Form[Company],Form[ContactInfo],Form[Address],Company,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long,companyForm: Form[Company], contactForm: Form[ContactInfo], addressForm: Form[Address] , company : Company ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";


Seq[Any](format.raw/*1.120*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/(""" 
"""),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*7.88*/{_display_(Seq[Any](format.raw/*7.89*/("""

	"""),_display_(Seq[Any](/*9.3*/{fieldView="disabled"})),format.raw/*9.25*/("""

""")))})),format.raw/*11.2*/("""

"""),_display_(Seq[Any](/*13.2*/main/*13.6*/{_display_(Seq[Any](format.raw/*13.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*22.24*/routes/*22.30*/.Application.index())),format.raw/*22.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*23.27*/routes/*23.33*/.Application.showOptions("COMPANY","ALL"))),format.raw/*23.74*/("""" class="btn btn-default">COMPANY</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*24.54*/flash/*24.59*/.get("pageAction"))),format.raw/*24.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*29.27*/routes/*29.33*/.Application.showOptions("COMPANY",flash.get("pageAction")))),format.raw/*29.92*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*37.3*/if(flash.containsKey("success"))/*37.35*/ {_display_(Seq[Any](format.raw/*37.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*39.37*/flash/*39.42*/.get("success"))),format.raw/*39.57*/("""
        </div>
    """)))})),format.raw/*41.6*/(""" 

   
 
	"""),_display_(Seq[Any](/*45.3*/helper/*45.9*/.form(action = routes.Companies.update(id))/*45.52*/ {_display_(Seq[Any](format.raw/*45.54*/("""


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
								<td> """),_display_(Seq[Any](/*67.15*/helper/*67.21*/.inputText(companyForm("name"), '_label -> "Company Name"))),format.raw/*67.79*/("""</td>
								<td>"""),_display_(Seq[Any](/*68.14*/helper/*68.20*/.inputText(companyForm("director"), '_label -> "Company Director"))),format.raw/*68.86*/("""</td>
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*71.14*/helper/*71.20*/.inputText(companyForm("description"), '_label -> "Company Description"))),format.raw/*71.92*/("""</td>
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
									 """),_display_(Seq[Any](/*97.12*/helper/*97.18*/.inputText(contactForm("phone1"), '_label -> "Phone1 :"))),format.raw/*97.74*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*101.12*/helper/*101.18*/.inputText(contactForm("email"), '_label -> "E-Mail :"))),format.raw/*101.73*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*105.16*/helper/*105.22*/.inputText(contactForm("phone2"), '_label -> "Phone2"))),format.raw/*105.76*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*109.11*/helper/*109.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*109.75*/("""
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
        					"""),_display_(Seq[Any](/*133.15*/if(!fieldView.equals("disabled"))/*133.48*/{_display_(Seq[Any](format.raw/*133.49*/("""
								<tr colspan=2>
									<td>
										<p><label>Search Address</label>
										<input class="text_field" id="addressid" name="searchAddress" type="text" value="" style="width:500px;" onblur="getParsedAddress();getSimilar();"/></p>
										<p><label>Similar Addresses </label>
					                  	<select class="text_field" id="similarAddressesid" name="similarAddresses" size="5" style="width:510px;" onchange="similarAddressesChange()" multiple></select></p>
					                </td>
									<td></td>
								
								</tr>
							""")))})),format.raw/*144.9*/("""
							<tr>
								<td> """),_display_(Seq[Any](/*146.15*/helper/*146.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*146.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*148.15*/helper/*148.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*148.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*152.14*/helper/*152.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*152.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*156.11*/helper/*156.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*156.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*160.15*/helper/*160.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*160.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*162.16*/helper/*162.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*162.80*/(""" </td>
								
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
              			Store Details
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionFour" class="panel-collapse collapse">
          		<div class="panel-body">
          			"""),_display_(Seq[Any](/*185.15*/if(company.stores.size() == 0)/*185.45*/ {_display_(Seq[Any](format.raw/*185.47*/("""
        
       					 <div class="well">
            				<em>Nothing to display</em>
        				</div>
        
    				""")))}/*191.11*/else/*191.16*/{_display_(Seq[Any](format.raw/*191.17*/("""
        					<div class="table-responsive">
        						<table class="table table-hover  table-striped"  style="background-color: beige;">
        							<thead style="background-color: gainsboro;">
                						<tr>
						                   	<th>Store Name</th>
											<th>Store Description</th>
						                    <th>Store Phone1</th>
						                    <th>Store Email</th>
                						</tr>
            						</thead>
            						<tbody>

                						"""),_display_(Seq[Any](/*204.24*/for(store <- company.stores) yield /*204.52*/ {_display_(Seq[Any](format.raw/*204.54*/("""
                    						<tr>
                    							"""),_display_(Seq[Any](/*206.29*/if(fieldView.equals("disabled"))/*206.61*/{_display_(Seq[Any](format.raw/*206.62*/("""
                    								<td>"""),_display_(Seq[Any](/*207.34*/store/*207.39*/.name)),format.raw/*207.44*/("""</td>
                    							""")))}/*208.30*/else/*208.35*/{_display_(Seq[Any](format.raw/*208.36*/("""
                    								<td><a href=""""),_display_(Seq[Any](/*209.43*/routes/*209.49*/.Stores.edit(store.id,"MODIFY"))),format.raw/*209.80*/("""">"""),_display_(Seq[Any](/*209.83*/store/*209.88*/.name)),format.raw/*209.93*/("""</a></td>
                    							""")))})),format.raw/*210.29*/("""
                        						
                         						<td>
						                            """),_display_(Seq[Any](/*213.36*/if(store.description == null)/*213.65*/ {_display_(Seq[Any](format.raw/*213.67*/("""
						                                <em>-</em>
						                            """)))}/*215.37*/else/*215.42*/{_display_(Seq[Any](format.raw/*215.43*/("""
						                                """),_display_(Seq[Any](/*216.40*/store/*216.45*/.description)),format.raw/*216.57*/("""
						                            """)))})),format.raw/*217.36*/("""
                        						</td>
							                    <td>
							                    	"""),_display_(Seq[Any](/*220.30*/if(store.contactInfo.phone1 == null)/*220.66*/ {_display_(Seq[Any](format.raw/*220.68*/("""
							                        	<em>-</em>
							                        """)))}/*222.34*/else/*222.39*/{_display_(Seq[Any](format.raw/*222.40*/("""
							                        	"""),_display_(Seq[Any](/*223.34*/store/*223.39*/.contactInfo.phone1)),format.raw/*223.58*/(""" 
							                        """)))})),format.raw/*224.33*/("""
							                    </td>
						                      	 <td>
						                            """),_display_(Seq[Any](/*227.36*/if(store.contactInfo.email  == null)/*227.72*/ {_display_(Seq[Any](format.raw/*227.74*/("""
						                                <em>-</em>
						                            """)))}/*229.37*/else/*229.42*/{_display_(Seq[Any](format.raw/*229.43*/("""
						                                """),_display_(Seq[Any](/*230.40*/store/*230.45*/.contactInfo.email)),format.raw/*230.63*/(""" 
						                            """)))})),format.raw/*231.36*/("""
						                        </td>
                    						</tr>
                						""")))})),format.raw/*234.24*/("""

            						</tbody>
         						</table>
       						</div>
       					""")))})),format.raw/*239.14*/("""
					</div>
      			</div>
        	</div>
      	</div><!-- panel-primary 4 End-->
      		
	     
	    	
      	
      	
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*254.6*/if((flash.get("pageAction")).equals("MODIFY"))/*254.52*/{_display_(Seq[Any](format.raw/*254.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*257.6*/("""
				"""),_display_(Seq[Any](/*258.6*/if((flash.get("pageAction")).equals("DELETE"))/*258.52*/{_display_(Seq[Any](format.raw/*258.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*260.17*/routes/*260.23*/.Companies.delete(id))),format.raw/*260.44*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
	 			""")))})),format.raw/*262.7*/("""
 				</p>
		    </div>
        </div>
       
    
    </div><!-- panel-group End-->


""")))})),format.raw/*271.2*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*276.2*/("""<!-- main end -->

   """))}
    }
    
    def render(id:Long,companyForm:Form[Company],contactForm:Form[ContactInfo],addressForm:Form[Address],company:Company): play.api.templates.HtmlFormat.Appendable = apply(id,companyForm,contactForm,addressForm,company)
    
    def f:((Long,Form[Company],Form[ContactInfo],Form[Address],Company) => play.api.templates.HtmlFormat.Appendable) = (id,companyForm,contactForm,addressForm,company) => apply(id,companyForm,contactForm,addressForm,company)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:02 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/companies/editForm.scala.html
                    HASH: 03b8fc8ce31288a7d85d9012c4ef83960b7e2031
                    MATRIX: 839->1|1152->119|1181->141|1208->177|1237->227|1274->230|1368->316|1406->317|1446->323|1489->345|1525->350|1565->355|1577->359|1615->360|1892->601|1907->607|1949->627|2068->710|2083->716|2146->757|2274->849|2288->854|2328->872|2527->1035|2542->1041|2623->1100|2831->1273|2872->1305|2912->1307|3029->1388|3043->1393|3080->1408|3134->1431|3184->1446|3198->1452|3250->1495|3290->1497|4073->2244|4088->2250|4168->2308|4224->2328|4239->2334|4327->2400|4410->2447|4425->2453|4519->2525|5397->3367|5412->3373|5490->3429|5579->3481|5595->3487|5673->3542|5769->3601|5785->3607|5862->3661|5951->3713|5967->3719|6048->3777|6889->4581|6932->4614|6972->4615|7570->5181|7636->5210|7652->5216|7729->5270|7797->5301|7813->5307|7888->5359|7983->5417|7999->5423|8078->5479|8168->5532|8184->5538|8261->5592|8356->5650|8372->5656|8459->5720|8529->5753|8545->5759|8626->5817|9383->6537|9423->6567|9464->6569|9613->6699|9627->6704|9667->6705|10230->7231|10275->7259|10316->7261|10415->7323|10457->7355|10497->7356|10569->7391|10584->7396|10612->7401|10667->7437|10681->7442|10721->7443|10802->7487|10818->7493|10872->7524|10912->7527|10927->7532|10955->7537|11027->7576|11170->7682|11209->7711|11250->7713|11357->7801|11371->7806|11411->7807|11489->7848|11504->7853|11539->7865|11609->7902|11747->8003|11793->8039|11834->8041|11932->8120|11946->8125|11986->8126|12058->8161|12073->8166|12115->8185|12183->8220|12327->8327|12373->8363|12414->8365|12521->8453|12535->8458|12575->8459|12653->8500|12668->8505|12709->8523|12780->8561|12908->8656|13032->8747|13415->9094|13471->9140|13511->9141|13697->9295|13740->9302|13796->9348|13836->9349|13898->9374|13914->9380|13958->9401|14099->9510|14229->9608|14304->9651
                    LINES: 26->1|34->1|35->3|35->4|36->6|37->7|37->7|37->7|39->9|39->9|41->11|43->13|43->13|43->13|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|59->29|59->29|59->29|67->37|67->37|67->37|69->39|69->39|69->39|71->41|75->45|75->45|75->45|75->45|97->67|97->67|97->67|98->68|98->68|98->68|101->71|101->71|101->71|127->97|127->97|127->97|131->101|131->101|131->101|135->105|135->105|135->105|139->109|139->109|139->109|163->133|163->133|163->133|174->144|176->146|176->146|176->146|178->148|178->148|178->148|182->152|182->152|182->152|186->156|186->156|186->156|190->160|190->160|190->160|192->162|192->162|192->162|215->185|215->185|215->185|221->191|221->191|221->191|234->204|234->204|234->204|236->206|236->206|236->206|237->207|237->207|237->207|238->208|238->208|238->208|239->209|239->209|239->209|239->209|239->209|239->209|240->210|243->213|243->213|243->213|245->215|245->215|245->215|246->216|246->216|246->216|247->217|250->220|250->220|250->220|252->222|252->222|252->222|253->223|253->223|253->223|254->224|257->227|257->227|257->227|259->229|259->229|259->229|260->230|260->230|260->230|261->231|264->234|269->239|284->254|284->254|284->254|287->257|288->258|288->258|288->258|290->260|290->260|290->260|292->262|301->271|306->276
                    -- GENERATED --
                */
            