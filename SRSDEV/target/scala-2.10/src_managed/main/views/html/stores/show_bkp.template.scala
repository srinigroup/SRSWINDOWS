
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
object show_bkp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template9[com.avaje.ebean.Page[Supplier],com.avaje.ebean.Page[SalesHead],com.avaje.ebean.Page[MediaTender],com.avaje.ebean.Page[ExpenseHead],com.avaje.ebean.Page[TerminalHead],com.avaje.ebean.Page[TotalSalesHead],Form[Store],Form[ContactInfo],Form[Address],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(supplierPage: com.avaje.ebean.Page[Supplier],salesHeadPage: com.avaje.ebean.Page[SalesHead],mediaTenderPage: com.avaje.ebean.Page[MediaTender],expenseHeadPage: com.avaje.ebean.Page[ExpenseHead],terminalHeadPage: com.avaje.ebean.Page[TerminalHead],totalSalesHeadPage: com.avaje.ebean.Page[TotalSalesHead], storeForm: Form[Store], contactForm: Form[ContactInfo], addressForm: Form[Address] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.392*/("""
 """),format.raw/*4.1*/(""" """),_display_(Seq[Any](/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""

"""),_display_(Seq[Any](/*7.2*/helper/*7.8*/.form(action = routes.Stores.save())/*7.44*/ {_display_(Seq[Any](format.raw/*7.46*/("""

   
			
    <article class="accordion">
	<section id="acc1" class="active">
		<h2><a href="#acc1">Store Details</a></h2>
		<hr/>
		<br/>
		<br/>
		<table>
			<tr>
				<td> """),_display_(Seq[Any](/*19.11*/select(
                storeForm("company.id"), 
                options(Company.options), 
                '_label -> "Company", '_default -> "-- Choose a company --",
                '_showConstraints -> false
            ))),format.raw/*24.14*/("""
				</td>
				
				
					<td>"""),_display_(Seq[Any](/*28.11*/helper/*28.17*/.inputText(storeForm("name"), '_label -> "Store Name:"))),format.raw/*28.72*/("""</td>
				
			</tr>
			<tr>
				<td>"""),_display_(Seq[Any](/*32.10*/helper/*32.16*/.inputText(storeForm("description"), '_label -> "Store Description:"))),format.raw/*32.85*/("""</td>
				<td></td>
				
			</tr>
		</table>
		<!-- <p class="accnav"><a href="#acc2">next ➧</a></p> -->
	</section>
	
	<section id="acc2">
		<h2><a href="#acc2">Contact Info</a></h2>
		<hr/>
		<br/>
		<br/>
		<table>
			<tr>
				
				<td>
					 """),_display_(Seq[Any](/*49.8*/helper/*49.14*/.inputText(contactForm("phone1"), '_label -> "Store phone1 :"))),format.raw/*49.76*/("""
				</td>
				
				<td>
					 """),_display_(Seq[Any](/*53.8*/helper/*53.14*/.inputText(contactForm("email"), '_label -> "Store E-Mail :"))),format.raw/*53.75*/("""
				</td>
			</tr>
			<tr>
				<td>  """),_display_(Seq[Any](/*57.12*/helper/*57.18*/.inputText(contactForm("phone2"), '_label -> "Store phone2"))),format.raw/*57.78*/(""" </td>
				
				
				<td>
					"""),_display_(Seq[Any](/*61.7*/helper/*61.13*/.inputText(contactForm("phone2"), '_label -> "Facsmile :"))),format.raw/*61.71*/("""
				</td>
			</tr>
		</table>
	<!--	<p class="accnav"><a href="#acc3">next ➧</a></p> -->
	</section>
	
	<section id="acc3">
		<h2><a href="#acc3">Address</a></h2>
		<hr/>
		<br/>
		<br/>	
		
		<table>
		<tr colspan=2>
				<td>
				<p><label>Search Address</label>
				<input class="text_field" id="addressid" name="searchAddress" type="text" value="" style="width:500px;" onblur="getParsedAddress();getSimilar();"/></p>

				
				<p><label>Similar Addresses </label>
                  <select class="text_field" id="similarAddressesid" name="similarAddresses" size="5" style="width:510px;" onchange="similarAddressesChange()" multiple></select>
                 
				</p>
				</td>
				
				
			</tr>
			<tr>
				<td> """),_display_(Seq[Any](/*90.11*/helper/*90.17*/.inputText(addressForm("street"), '_label -> "Street"))),format.raw/*90.71*/("""</td>
				
				<td> """),_display_(Seq[Any](/*92.11*/helper/*92.17*/.inputText(addressForm("city"), '_label -> "City :"))),format.raw/*92.69*/(""" </td>
				
			</tr>
			<tr>
				<td>"""),_display_(Seq[Any](/*96.10*/helper/*96.16*/.inputText(addressForm("number"), '_label -> "Number :"))),format.raw/*96.72*/("""  </td>
				
				
				<td>
					"""),_display_(Seq[Any](/*100.7*/helper/*100.13*/.inputText(addressForm("state"), '_label -> "State :"))),format.raw/*100.67*/("""
				</td>
			</tr>
			<tr>
				<td> """),_display_(Seq[Any](/*104.11*/helper/*104.17*/.inputText(addressForm("postalCode"), '_label -> "PostalCode :"))),format.raw/*104.81*/(""" </td>
				
				<td>  """),_display_(Seq[Any](/*106.12*/helper/*106.18*/.inputText(addressForm("country"), '_label -> "Country :"))),format.raw/*106.76*/(""" </td>
				
			</tr>
		</table>
		<!-- <p class="accnav"><a href="#acc4">next ➧</a></p> -->
	</section>
	<section id="acc4">
		<h2><a href="#acc4" >Head Mappings</a></h2>
		<hr/>
		<br/>
		<br/>
	<div id="tabpanel">
					<ul id="boxLinks">
                	<li><a href="#box1" id="tab1">SalesHeads</a></li>
                	<li><a href="#box2" id="tab2">MediaTenders</a></li>
                	<li><a href="#box3" id="tab3">ExpenseHeads</a></li>
                	<li><a href="#box4" id="tab4">TotalSalesHeads</a></li>
                	<li><a href="#box5" id="tab5">TerminalHeads</a></li>
                </ul>
                
                 <div id="box" class="box" > 
               
   <div id="box1" class="box" >
                	       
    """),_display_(Seq[Any](/*130.6*/if(salesHeadPage.getTotalRowCount == 0)/*130.45*/ {_display_(Seq[Any](format.raw/*130.47*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*136.7*/else/*136.12*/{_display_(Seq[Any](format.raw/*136.13*/("""
        
        <table class="computers zebra-striped">
           
            <tbody>

                """),_display_(Seq[Any](/*142.18*/for(saleshead <- salesHeadPage.getList) yield /*142.57*/ {_display_(Seq[Any](format.raw/*142.59*/("""
                    <tr>
                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*144.57*/saleshead/*144.66*/.id)),format.raw/*144.69*/("""" name="salesheadslist[]" value=""""),_display_(Seq[Any](/*144.103*/saleshead/*144.112*/.id)),format.raw/*144.115*/("""" > """),_display_(Seq[Any](/*144.120*/saleshead/*144.129*/.name)),format.raw/*144.134*/("""</td>
                                            
                             
               </tr>
               """)))})),format.raw/*148.17*/("""

            </tbody>
        </table>
      """)))})),format.raw/*152.8*/("""
    </div>
    
     <div id="box2" class="box" >
     
       """),_display_(Seq[Any](/*157.9*/if(mediaTenderPage.getTotalRowCount == 0)/*157.50*/ {_display_(Seq[Any](format.raw/*157.52*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*163.7*/else/*163.12*/{_display_(Seq[Any](format.raw/*163.13*/("""
        
        <table class="computers zebra-striped">
           
            <tbody>

                """),_display_(Seq[Any](/*169.18*/for(mediatender <- mediaTenderPage.getList) yield /*169.61*/ {_display_(Seq[Any](format.raw/*169.63*/("""
                    <tr>
                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*171.57*/mediatender/*171.68*/.id)),format.raw/*171.71*/("""" name="mediatenderslist[]" value=""""),_display_(Seq[Any](/*171.107*/mediatender/*171.118*/.id)),format.raw/*171.121*/("""" > """),_display_(Seq[Any](/*171.126*/mediatender/*171.137*/.name)),format.raw/*171.142*/("""</td>
                                            
                             
               </tr>
               """)))})),format.raw/*175.17*/("""

            </tbody>
        </table>
      """)))})),format.raw/*179.8*/("""
                	
     </div>
		     <div id="box3" class="box" >
		                	
		      """),_display_(Seq[Any](/*184.10*/if(expenseHeadPage.getTotalRowCount == 0)/*184.51*/ {_display_(Seq[Any](format.raw/*184.53*/("""
		        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*190.9*/else/*190.14*/{_display_(Seq[Any](format.raw/*190.15*/("""
		        
		        <table class="computers zebra-striped">
		           
		            <tbody>
		
		                """),_display_(Seq[Any](/*196.20*/for(expensehead <- expenseHeadPage.getList) yield /*196.63*/ {_display_(Seq[Any](format.raw/*196.65*/("""
		                    <tr>
		                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*198.59*/expensehead/*198.70*/.id)),format.raw/*198.73*/("""" name="expenseheadslist[]" value=""""),_display_(Seq[Any](/*198.109*/expensehead/*198.120*/.id)),format.raw/*198.123*/("""" > """),_display_(Seq[Any](/*198.128*/expensehead/*198.139*/.name)),format.raw/*198.144*/("""</td>
		                                            
		                             
		               </tr>
		               """)))})),format.raw/*202.19*/("""
		
		            </tbody>
		        </table>
		      """)))})),format.raw/*206.10*/("""
		                	
		                	
		    </div>
		    
			<div id="box4" class="box" >
		                	       
		    """),_display_(Seq[Any](/*213.8*/if(totalSalesHeadPage.getTotalRowCount == 0)/*213.52*/ {_display_(Seq[Any](format.raw/*213.54*/("""
		        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*219.9*/else/*219.14*/{_display_(Seq[Any](format.raw/*219.15*/("""
		        
		        <table class="computers zebra-striped">
		           
		            <tbody>
		
		                """),_display_(Seq[Any](/*225.20*/for(totalsaleshead <- totalSalesHeadPage.getList) yield /*225.69*/ {_display_(Seq[Any](format.raw/*225.71*/("""
		                    <tr>
		                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*227.59*/totalsaleshead/*227.73*/.id)),format.raw/*227.76*/("""" name="totalsalesheadslist[]" value=""""),_display_(Seq[Any](/*227.115*/totalsaleshead/*227.129*/.id)),format.raw/*227.132*/("""" > """),_display_(Seq[Any](/*227.137*/totalsaleshead/*227.151*/.name)),format.raw/*227.156*/("""</td>
		                                            
		                             
		               </tr>
		               """)))})),format.raw/*231.19*/("""
		
		            </tbody>
		        </table>
		      """)))})),format.raw/*235.10*/("""
		    </div>
		    
		    <div id="box5" class="box" >
		                	       
		    """),_display_(Seq[Any](/*240.8*/if(terminalHeadPage.getTotalRowCount == 0)/*240.50*/ {_display_(Seq[Any](format.raw/*240.52*/("""
		        
		        <div class="well">
		            <em>Nothing to display</em>
		        </div>
		        
		    """)))}/*246.9*/else/*246.14*/{_display_(Seq[Any](format.raw/*246.15*/("""
		        
		        <table class="computers zebra-striped">
		           
		            <tbody>
		
		                """),_display_(Seq[Any](/*252.20*/for(terminalhead <- terminalHeadPage.getList) yield /*252.65*/ {_display_(Seq[Any](format.raw/*252.67*/("""
		                    <tr>
		                        <td><input type="checkbox" id=""""),_display_(Seq[Any](/*254.59*/terminalhead/*254.71*/.id)),format.raw/*254.74*/("""" name="terminalheadslist[]" value=""""),_display_(Seq[Any](/*254.111*/terminalhead/*254.123*/.id)),format.raw/*254.126*/("""" > """),_display_(Seq[Any](/*254.131*/terminalhead/*254.143*/.name)),format.raw/*254.148*/("""</td>
		                                            
		                             
		               </tr>
		               """)))})),format.raw/*258.19*/("""
		
		            </tbody>
		        </table>
		      """)))})),format.raw/*262.10*/("""
		    </div>
      </div>
     
</section>
<section id="acc6" style="height:auto; ">
<p class="accnav"><input type="submit" class="btn primary" >  
<a href=""""),_display_(Seq[Any](/*269.11*/routes/*269.17*/.Stores.list())),format.raw/*269.31*/("""" class="btn">Cancel</a>  <!-- <a href="#acc1">up ➧</a>  --> </p>
</section>
</article>

""")))})),format.raw/*273.2*/("""

""")))})),format.raw/*275.2*/("""
"""))}
    }
    
    def render(supplierPage:com.avaje.ebean.Page[Supplier],salesHeadPage:com.avaje.ebean.Page[SalesHead],mediaTenderPage:com.avaje.ebean.Page[MediaTender],expenseHeadPage:com.avaje.ebean.Page[ExpenseHead],terminalHeadPage:com.avaje.ebean.Page[TerminalHead],totalSalesHeadPage:com.avaje.ebean.Page[TotalSalesHead],storeForm:Form[Store],contactForm:Form[ContactInfo],addressForm:Form[Address]): play.api.templates.HtmlFormat.Appendable = apply(supplierPage,salesHeadPage,mediaTenderPage,expenseHeadPage,terminalHeadPage,totalSalesHeadPage,storeForm,contactForm,addressForm)
    
    def f:((com.avaje.ebean.Page[Supplier],com.avaje.ebean.Page[SalesHead],com.avaje.ebean.Page[MediaTender],com.avaje.ebean.Page[ExpenseHead],com.avaje.ebean.Page[TerminalHead],com.avaje.ebean.Page[TotalSalesHead],Form[Store],Form[ContactInfo],Form[Address]) => play.api.templates.HtmlFormat.Appendable) = (supplierPage,salesHeadPage,mediaTenderPage,expenseHeadPage,terminalHeadPage,totalSalesHeadPage,storeForm,contactForm,addressForm) => apply(supplierPage,salesHeadPage,mediaTenderPage,expenseHeadPage,terminalHeadPage,totalSalesHeadPage,storeForm,contactForm,addressForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/stores/show_bkp.scala.html
                    HASH: 741ddb5606fcd04b5dced2145560a47874ffc665
                    MATRIX: 1024->3|1562->393|1591->415|1627->452|1638->456|1675->457|1714->462|1727->468|1771->504|1810->506|2033->693|2286->924|2357->959|2372->965|2449->1020|2526->1061|2541->1067|2632->1136|2931->1400|2946->1406|3030->1468|3101->1504|3116->1510|3199->1571|3278->1614|3293->1620|3375->1680|3446->1716|3461->1722|3541->1780|4326->2529|4341->2535|4417->2589|4476->2612|4491->2618|4565->2670|4643->2712|4658->2718|4736->2774|4809->2811|4825->2817|4902->2871|4981->2913|4997->2919|5084->2983|5146->3008|5162->3014|5243->3072|6053->3846|6102->3885|6143->3887|6274->4000|6288->4005|6328->4006|6479->4120|6535->4159|6576->4161|6697->4245|6716->4254|6742->4257|6814->4291|6834->4300|6861->4303|6904->4308|6924->4317|6953->4322|7108->4444|7191->4495|7297->4565|7348->4606|7389->4608|7520->4721|7534->4726|7574->4727|7725->4841|7785->4884|7826->4886|7947->4970|7968->4981|7994->4984|8068->5020|8090->5031|8117->5034|8160->5039|8182->5050|8211->5055|8366->5177|8449->5228|8587->5329|8638->5370|8679->5372|8822->5497|8836->5502|8876->5503|9039->5629|9099->5672|9140->5674|9265->5762|9286->5773|9312->5776|9386->5812|9408->5823|9435->5826|9478->5831|9500->5842|9529->5847|9692->5977|9784->6036|9954->6170|10008->6214|10049->6216|10192->6341|10206->6346|10246->6347|10409->6473|10475->6522|10516->6524|10641->6612|10665->6626|10691->6629|10768->6668|10793->6682|10820->6685|10863->6690|10888->6704|10917->6709|11080->6839|11172->6898|11303->6993|11355->7035|11396->7037|11539->7162|11553->7167|11593->7168|11756->7294|11818->7339|11859->7341|11984->7429|12006->7441|12032->7444|12107->7481|12130->7493|12157->7496|12200->7501|12223->7513|12252->7518|12415->7648|12507->7707|12710->7873|12726->7879|12763->7893|12889->7987|12926->7992
                    LINES: 26->2|32->2|33->4|33->5|33->5|33->5|35->7|35->7|35->7|35->7|47->19|52->24|56->28|56->28|56->28|60->32|60->32|60->32|77->49|77->49|77->49|81->53|81->53|81->53|85->57|85->57|85->57|89->61|89->61|89->61|118->90|118->90|118->90|120->92|120->92|120->92|124->96|124->96|124->96|128->100|128->100|128->100|132->104|132->104|132->104|134->106|134->106|134->106|158->130|158->130|158->130|164->136|164->136|164->136|170->142|170->142|170->142|172->144|172->144|172->144|172->144|172->144|172->144|172->144|172->144|172->144|176->148|180->152|185->157|185->157|185->157|191->163|191->163|191->163|197->169|197->169|197->169|199->171|199->171|199->171|199->171|199->171|199->171|199->171|199->171|199->171|203->175|207->179|212->184|212->184|212->184|218->190|218->190|218->190|224->196|224->196|224->196|226->198|226->198|226->198|226->198|226->198|226->198|226->198|226->198|226->198|230->202|234->206|241->213|241->213|241->213|247->219|247->219|247->219|253->225|253->225|253->225|255->227|255->227|255->227|255->227|255->227|255->227|255->227|255->227|255->227|259->231|263->235|268->240|268->240|268->240|274->246|274->246|274->246|280->252|280->252|280->252|282->254|282->254|282->254|282->254|282->254|282->254|282->254|282->254|282->254|286->258|290->262|297->269|297->269|297->269|301->273|303->275
                    -- GENERATED --
                */
            