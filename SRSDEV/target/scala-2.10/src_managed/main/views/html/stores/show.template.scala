
package views.html.stores

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template10[com.avaje.ebean.Page[Supplier],com.avaje.ebean.Page[SalesHead],com.avaje.ebean.Page[MediaTender],com.avaje.ebean.Page[ExpenseHead],com.avaje.ebean.Page[TerminalHead],com.avaje.ebean.Page[TotalSalesHead],com.avaje.ebean.Page[PaymentTender],Form[Store],Form[ContactInfo],Form[Address],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(supplierPage: com.avaje.ebean.Page[Supplier],salesHeadPage: com.avaje.ebean.Page[SalesHead],mediaTenderPage: com.avaje.ebean.Page[MediaTender],expenseHeadPage: com.avaje.ebean.Page[ExpenseHead],terminalHeadPage: com.avaje.ebean.Page[TerminalHead],totalSalesHeadPage: com.avaje.ebean.Page[TotalSalesHead], paymentTenderPage: com.avaje.ebean.Page[PaymentTender], storeForm: Form[Store], contactForm: Form[ContactInfo], addressForm: Form[Address] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.448*/("""
 """),format.raw/*3.1*/(""" """),_display_(Seq[Any](/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*12.24*/routes/*12.30*/.Application.index())),format.raw/*12.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*13.27*/routes/*13.33*/.Application.showOptions("STORE","ALL"))),format.raw/*13.72*/("""" class="btn btn-default">STORE</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Application.showOptions("STORE","ALL"))),format.raw/*19.72*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
    """),_display_(Seq[Any](/*26.6*/if(flash.containsKey("success"))/*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*28.37*/flash/*28.42*/.get("success"))),format.raw/*28.57*/("""
        </div>
    """)))})),format.raw/*30.6*/(""" 
     
"""),_display_(Seq[Any](/*32.2*/helper/*32.8*/.form(action = routes.Stores.save())/*32.44*/ {_display_(Seq[Any](format.raw/*32.46*/("""

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Store Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>
             	  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*54.15*/select(
					                storeForm("company.id"), 
					                options(Company.options), 
					                '_label -> "Company", '_default -> "-- Choose a company --",
					                '_showConstraints -> false
					            	))),format.raw/*59.20*/("""
								</td>
								<td>"""),_display_(Seq[Any](/*61.14*/helper/*61.20*/.inputText(storeForm("name"), '_label -> "Store Name:", 'onblur -> "javascript:checkForUnique(this,'STORE','NAME');"))),format.raw/*61.137*/("""</td>
					
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*65.14*/helper/*65.20*/.inputText(storeForm("description"), '_label -> "Store Description:"))),format.raw/*65.89*/("""</td>
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
									 """),_display_(Seq[Any](/*91.12*/helper/*91.18*/.inputText(contactForm("phone1"), '_label -> "Store phone1 :"))),format.raw/*91.80*/("""
								</td>
								
								<td>
									 """),_display_(Seq[Any](/*95.12*/helper/*95.18*/.inputText(contactForm("email"), '_label -> "Store E-Mail :", 'onblur -> "javascript:checkForUnique(this,'STORE','EMAIL');"))),format.raw/*95.142*/("""
								</td>
							</tr>
							<tr>
								<td>  """),_display_(Seq[Any](/*99.16*/helper/*99.22*/.inputText(contactForm("phone2"), '_label -> "Store phone2"))),format.raw/*99.82*/(""" </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*103.11*/helper/*103.17*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*103.75*/("""
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
								<td> """),_display_(Seq[Any](/*137.15*/helper/*137.21*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*137.75*/("""</td>
								
								<td> """),_display_(Seq[Any](/*139.15*/helper/*139.21*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*139.73*/(""" </td>
								
							</tr>
							<tr>
								<td>"""),_display_(Seq[Any](/*143.14*/helper/*143.20*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*143.76*/("""  </td>
								
								
								<td>
									"""),_display_(Seq[Any](/*147.11*/helper/*147.17*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*147.71*/("""
								</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*151.15*/helper/*151.21*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*151.85*/(""" </td>
								
								<td>  """),_display_(Seq[Any](/*153.16*/helper/*153.22*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*153.80*/(""" </td>
								
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
              			Head Mappings
              			<i class="icon-lock icon-large pull-right"></i>
              		 </h4>
             	</a>     
        	</div>
        	<div id="accordionFour" class="panel-collapse collapse">
          		<div class="panel-body">
              		<ul class="tabs">
  						<li class="active" rel="tab1">SalesHeads</li>
  						<li rel="tab2">MediaTenders</li>
  						<li rel="tab3">ExpenseHeads</li>
  						<li rel="tab4">TerminalHeads</li>
  						<li rel="tab5">PaymentTenders</li>
					</ul>
					<div class="tab_container">
  						<h3 class="d_active tab_drawer_heading" rel="tab1">SalesHeads</h3>
  						<div id="tab1" class="tab_content">
						 	"""),_display_(Seq[Any](/*185.10*/if(salesHeadPage.getTotalRowCount == 0)/*185.49*/ {_display_(Seq[Any](format.raw/*185.51*/("""
						    	<div class="well">
						            <em>Nothing to display</em>
						        </div>
						    """)))}/*189.13*/else/*189.18*/{_display_(Seq[Any](format.raw/*189.19*/("""
        						<table class="table table-bordered">
            						<tbody>
                						"""),_display_(Seq[Any](/*192.24*/for(saleshead <- salesHeadPage.getList) yield /*192.63*/ {_display_(Seq[Any](format.raw/*192.65*/("""
                    						<tr>
                        						<td><input type="checkbox" id=""""),_display_(Seq[Any](/*194.63*/saleshead/*194.72*/.id)),format.raw/*194.75*/("""" name="salesheadslist[]" value=""""),_display_(Seq[Any](/*194.109*/saleshead/*194.118*/.id)),format.raw/*194.121*/("""" > """),_display_(Seq[Any](/*194.126*/saleshead/*194.135*/.name)),format.raw/*194.140*/("""</td>
                               				</tr>
               							""")))})),format.raw/*196.24*/("""
               						</tbody>
        						</table>
      						""")))})),format.raw/*199.14*/("""
  						</div>
  						<!-- #tab1 -->
  						<h3 class="tab_drawer_heading" rel="tab2">MediaTenders</h3>
  						<div id="tab2" class="tab_content">
 							"""),_display_(Seq[Any](/*204.10*/if(mediaTenderPage.getTotalRowCount == 0)/*204.51*/ {_display_(Seq[Any](format.raw/*204.53*/("""
        						<div class="well">
            						<em>Nothing to display</em>
        						</div>
    						""")))}/*208.13*/else/*208.18*/{_display_(Seq[Any](format.raw/*208.19*/("""
        						<table class="table table-bordered">
            						<tbody>
                						"""),_display_(Seq[Any](/*211.24*/for(mediatender <- mediaTenderPage.getList) yield /*211.67*/ {_display_(Seq[Any](format.raw/*211.69*/("""
                    						<tr>
                        						<td><input type="checkbox" id=""""),_display_(Seq[Any](/*213.63*/mediatender/*213.74*/.id)),format.raw/*213.77*/("""" name="mediatenderslist[]" value=""""),_display_(Seq[Any](/*213.113*/mediatender/*213.124*/.id)),format.raw/*213.127*/("""" > """),_display_(Seq[Any](/*213.132*/mediatender/*213.143*/.name)),format.raw/*213.148*/("""</td>
                                            </tr>
               							""")))})),format.raw/*215.24*/("""
               						</tbody>
        						</table>
      						""")))})),format.raw/*218.14*/("""
  						</div>
  						<!-- #tab2 -->
  						<h3 class="tab_drawer_heading" rel="tab3">ExpenseHeads</h3>
  						<div id="tab3" class="tab_content">
     						"""),_display_(Seq[Any](/*223.13*/if(expenseHeadPage.getTotalRowCount == 0)/*223.54*/ {_display_(Seq[Any](format.raw/*223.56*/("""
		        				<div class="well">
		            				<em>Nothing to display</em>
		        				</div>
		    				""")))}/*227.13*/else/*227.18*/{_display_(Seq[Any](format.raw/*227.19*/("""
		        				<table class="table table-bordered">
		            				<tbody>
		                				"""),_display_(Seq[Any](/*230.24*/for(expensehead <- expenseHeadPage.getList) yield /*230.67*/ {_display_(Seq[Any](format.raw/*230.69*/("""
		                    				<tr>
		                        				<td><input type="checkbox" id=""""),_display_(Seq[Any](/*232.63*/expensehead/*232.74*/.id)),format.raw/*232.77*/("""" name="expenseheadslist[]" value=""""),_display_(Seq[Any](/*232.113*/expensehead/*232.124*/.id)),format.raw/*232.127*/("""" > """),_display_(Seq[Any](/*232.132*/expensehead/*232.143*/.name)),format.raw/*232.148*/("""</td>
		                             		</tr>
		               					""")))})),format.raw/*234.24*/("""
		               	            </tbody>
		        				</table>
		      				""")))})),format.raw/*237.14*/("""
  						</div>
  						<!-- #tab3 -->
  						<h3 class="tab_drawer_heading" rel="tab4">TerminalHeads</h3>
  						<div id="tab4" class="tab_content">
	     					"""),_display_(Seq[Any](/*242.13*/if(terminalHeadPage.getTotalRowCount == 0)/*242.55*/ {_display_(Seq[Any](format.raw/*242.57*/("""
			        			<div class="well">
			            			<em>Nothing to display</em>
			        			</div>
			    			""")))}/*246.13*/else/*246.18*/{_display_(Seq[Any](format.raw/*246.19*/("""	
			        			<table class="table table-bordered">
			            			<tbody>
			            				"""),_display_(Seq[Any](/*249.21*/for(terminalhead <- terminalHeadPage.getList) yield /*249.66*/ {_display_(Seq[Any](format.raw/*249.68*/("""
			                    			<tr>
			                        			<td><input type="checkbox" id=""""),_display_(Seq[Any](/*251.63*/terminalhead/*251.75*/.id)),format.raw/*251.78*/("""" name="terminalheadslist[]" value=""""),_display_(Seq[Any](/*251.115*/terminalhead/*251.127*/.id)),format.raw/*251.130*/("""" > """),_display_(Seq[Any](/*251.135*/terminalhead/*251.147*/.name)),format.raw/*251.152*/("""</td>
			                                </tr>
			               				""")))})),format.raw/*253.24*/("""
			            			</tbody>
			        			</table>
			      			""")))})),format.raw/*256.14*/("""
  						</div>
  						<!-- #tab4 -->
  						<h3 class="tab_drawer_heading" rel="tab5">PaymentTenders</h3>
  						<div id="tab5" class="tab_content">
	     					"""),_display_(Seq[Any](/*261.13*/if(paymentTenderPage.getTotalRowCount == 0)/*261.56*/ {_display_(Seq[Any](format.raw/*261.58*/("""
			        			<div class="well">
			            			<em>Nothing to display</em>
			        			</div>
			    			""")))}/*265.13*/else/*265.18*/{_display_(Seq[Any](format.raw/*265.19*/("""	
			        			<table class="table table-bordered">
			            			<tbody>
			            				"""),_display_(Seq[Any](/*268.21*/for(paymentTender <- paymentTenderPage.getList) yield /*268.68*/ {_display_(Seq[Any](format.raw/*268.70*/("""
			                    			<tr>
			                        			<td><input type="checkbox" id=""""),_display_(Seq[Any](/*270.63*/paymentTender/*270.76*/.id)),format.raw/*270.79*/("""" name="paymentTenderslist[]" value=""""),_display_(Seq[Any](/*270.117*/paymentTender/*270.130*/.id)),format.raw/*270.133*/("""" > """),_display_(Seq[Any](/*270.138*/paymentTender/*270.151*/.name)),format.raw/*270.156*/("""</td>
			                                </tr>
			               				""")))})),format.raw/*272.24*/("""
			            			</tbody>
			        			</table>
			      			""")))})),format.raw/*275.14*/("""
  						</div>
  						<!-- #tab5 -->
					</div>
					<!-- .tab_container -->
      			</div><!-- panel body -->
      		</div><!-- accordion -->
      	</div><!-- panel-primary 4 End-->
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right;"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;"></p>  
				
		    </div>
        </div>
        
    
    </div><!-- panel-group End-->
  
""")))})),format.raw/*295.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*300.2*/("""<!-- main end -->
"""))}
    }
    
    def render(supplierPage:com.avaje.ebean.Page[Supplier],salesHeadPage:com.avaje.ebean.Page[SalesHead],mediaTenderPage:com.avaje.ebean.Page[MediaTender],expenseHeadPage:com.avaje.ebean.Page[ExpenseHead],terminalHeadPage:com.avaje.ebean.Page[TerminalHead],totalSalesHeadPage:com.avaje.ebean.Page[TotalSalesHead],paymentTenderPage:com.avaje.ebean.Page[PaymentTender],storeForm:Form[Store],contactForm:Form[ContactInfo],addressForm:Form[Address]): play.api.templates.HtmlFormat.Appendable = apply(supplierPage,salesHeadPage,mediaTenderPage,expenseHeadPage,terminalHeadPage,totalSalesHeadPage,paymentTenderPage,storeForm,contactForm,addressForm)
    
    def f:((com.avaje.ebean.Page[Supplier],com.avaje.ebean.Page[SalesHead],com.avaje.ebean.Page[MediaTender],com.avaje.ebean.Page[ExpenseHead],com.avaje.ebean.Page[TerminalHead],com.avaje.ebean.Page[TotalSalesHead],com.avaje.ebean.Page[PaymentTender],Form[Store],Form[ContactInfo],Form[Address]) => play.api.templates.HtmlFormat.Appendable) = (supplierPage,salesHeadPage,mediaTenderPage,expenseHeadPage,terminalHeadPage,totalSalesHeadPage,paymentTenderPage,storeForm,contactForm,addressForm) => apply(supplierPage,salesHeadPage,mediaTenderPage,expenseHeadPage,terminalHeadPage,totalSalesHeadPage,paymentTenderPage,storeForm,contactForm,addressForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:10 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/stores/show.scala.html
                    HASH: 0835d4018e47d147a985ecfed48cdb116a4ef22a
                    MATRIX: 1057->1|1651->447|1680->469|1716->506|1727->510|1764->511|2037->748|2052->754|2094->774|2213->857|2228->863|2289->902|2580->1157|2595->1163|2656->1202|2877->1388|2918->1420|2958->1422|3075->1503|3089->1508|3126->1523|3180->1546|3226->1557|3240->1563|3285->1599|3325->1601|4120->2360|4399->2617|4465->2647|4480->2653|4620->2770|4710->2824|4725->2830|4816->2899|5694->3741|5709->3747|5793->3809|5881->3861|5896->3867|6043->3991|6138->4050|6153->4056|6235->4116|6324->4168|6340->4174|6421->4232|7812->5586|7828->5592|7905->5646|7973->5677|7989->5683|8064->5735|8159->5793|8175->5799|8254->5855|8344->5908|8360->5914|8437->5968|8532->6026|8548->6032|8635->6096|8705->6129|8721->6135|8802->6193|9980->7334|10029->7373|10070->7375|10203->7489|10217->7494|10257->7495|10398->7599|10454->7638|10495->7640|10628->7736|10647->7745|10673->7748|10745->7782|10765->7791|10792->7794|10835->7799|10855->7808|10884->7813|10989->7885|11092->7955|11294->8120|11345->8161|11386->8163|11522->8280|11536->8285|11576->8286|11717->8390|11777->8433|11818->8435|11951->8531|11972->8542|11998->8545|12072->8581|12094->8592|12121->8595|12164->8600|12186->8611|12215->8616|12329->8697|12432->8767|12637->8935|12688->8976|12729->8978|12865->9095|12879->9100|12919->9101|13060->9205|13120->9248|13161->9250|13294->9346|13315->9357|13341->9360|13415->9396|13437->9407|13464->9410|13507->9415|13529->9426|13558->9431|13661->9501|13773->9580|13979->9749|14031->9791|14072->9793|14208->9910|14222->9915|14262->9916|14401->10018|14463->10063|14504->10065|14637->10161|14659->10173|14685->10176|14760->10213|14783->10225|14810->10228|14853->10233|14876->10245|14905->10250|15010->10322|15110->10389|15317->10559|15370->10602|15411->10604|15547->10721|15561->10726|15601->10727|15740->10829|15804->10876|15845->10878|15978->10974|16001->10987|16027->10990|16103->11028|16127->11041|16154->11044|16197->11049|16221->11062|16250->11067|16355->11139|16455->11206|17106->11825|17180->11867
                    LINES: 26->1|32->1|33->3|33->4|33->4|33->4|41->12|41->12|41->12|42->13|42->13|42->13|48->19|48->19|48->19|55->26|55->26|55->26|57->28|57->28|57->28|59->30|61->32|61->32|61->32|61->32|83->54|88->59|90->61|90->61|90->61|94->65|94->65|94->65|120->91|120->91|120->91|124->95|124->95|124->95|128->99|128->99|128->99|132->103|132->103|132->103|166->137|166->137|166->137|168->139|168->139|168->139|172->143|172->143|172->143|176->147|176->147|176->147|180->151|180->151|180->151|182->153|182->153|182->153|214->185|214->185|214->185|218->189|218->189|218->189|221->192|221->192|221->192|223->194|223->194|223->194|223->194|223->194|223->194|223->194|223->194|223->194|225->196|228->199|233->204|233->204|233->204|237->208|237->208|237->208|240->211|240->211|240->211|242->213|242->213|242->213|242->213|242->213|242->213|242->213|242->213|242->213|244->215|247->218|252->223|252->223|252->223|256->227|256->227|256->227|259->230|259->230|259->230|261->232|261->232|261->232|261->232|261->232|261->232|261->232|261->232|261->232|263->234|266->237|271->242|271->242|271->242|275->246|275->246|275->246|278->249|278->249|278->249|280->251|280->251|280->251|280->251|280->251|280->251|280->251|280->251|280->251|282->253|285->256|290->261|290->261|290->261|294->265|294->265|294->265|297->268|297->268|297->268|299->270|299->270|299->270|299->270|299->270|299->270|299->270|299->270|299->270|301->272|304->275|324->295|329->300
                    -- GENERATED --
                */
            