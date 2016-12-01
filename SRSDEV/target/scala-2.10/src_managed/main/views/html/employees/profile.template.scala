
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
object profile extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Employee,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(employee : Employee ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._

def /*5.2*/currentDateFormat/*5.19*/(currDate:Date) = {{
  import java.util.Calendar
  import java.text.SimpleDateFormat

 
  val curTimeFormat = new SimpleDateFormat("dd/MM/yyyy")

	if(currDate != null){
  curTimeFormat.format(currDate)
  }
}};
Seq[Any](format.raw/*1.24*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/(""" 
"""),format.raw/*15.2*/("""


"""),_display_(Seq[Any](/*18.2*/main/*18.6*/{_display_(Seq[Any](format.raw/*18.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*27.24*/routes/*27.30*/.Application.index())),format.raw/*27.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default"><div>PROFILE</div></a>
      					</div>
        			</span>
            		<span class="pull-right">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*33.27*/routes/*33.33*/.Application.index())),format.raw/*33.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		
         		 <br><br><br>

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
        				<table class="table table-hover  table-striped profileTable">
							<tr>
								<td><b>First Name</b></td><td>"""),_display_(Seq[Any](/*58.40*/employee/*58.48*/.firstName)),format.raw/*58.58*/("""</td>
								<td><b>Last Name</b></td><td>"""),_display_(Seq[Any](/*59.39*/employee/*59.47*/.lastName)),format.raw/*59.56*/("""</td>
							</tr>
							<tr>
								<td><b>Short Name(if any)</b></td><td>"""),_display_(Seq[Any](/*62.48*/employee/*62.56*/.shortName)),format.raw/*62.66*/("""</td>
								<td><b>Gender</b></td><td>"""),_display_(Seq[Any](/*63.36*/employee/*63.44*/.gender)),format.raw/*63.51*/("""</td>
							</tr>
							<tr>
								<td><b>Date Of Birth</b></td><td>"""),_display_(Seq[Any](/*66.43*/currentDateFormat(employee.dob))),format.raw/*66.74*/("""</td>
								<td></td><td></td>
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
        				<table class="table table-hover  table-striped profileTable">
							<tr>
								<td><b>Primary phone1</b></td><td>"""),_display_(Seq[Any](/*91.44*/employee/*91.52*/.contactInfo.phone1)),format.raw/*91.71*/("""</td>
								<td><b>Primary E-Mail</b></td><td>"""),_display_(Seq[Any](/*92.44*/employee/*92.52*/.contactInfo.email)),format.raw/*92.70*/("""</td>
							</tr>
							<tr>
								<td><b>Secondary phone2</b></td><td>"""),_display_(Seq[Any](/*95.46*/employee/*95.54*/.contactInfo.phone2)),format.raw/*95.73*/("""</td>
								<td><b>Facsmile</b></td><td>"""),_display_(Seq[Any](/*96.38*/employee/*96.46*/.contactInfo.facsimile)),format.raw/*96.68*/("""</td>
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
        				<table class="table table-hover  table-striped profileTable">
        					<tr>
								<td><b>Street :</b></td><td>"""),_display_(Seq[Any](/*120.38*/employee/*120.46*/.address.street)),format.raw/*120.61*/("""</td>
								<td><b>City :</b></td><td>"""),_display_(Seq[Any](/*121.36*/employee/*121.44*/.address.city)),format.raw/*121.57*/("""</td>
							</tr>
							<tr>
								<td><b>Number :</b></td><td>"""),_display_(Seq[Any](/*124.38*/employee/*124.46*/.address.number)),format.raw/*124.61*/("""</td>
								<td><b>State :</b></td><td>"""),_display_(Seq[Any](/*125.37*/employee/*125.45*/.address.state)),format.raw/*125.59*/("""</td>
							</tr>
							<tr>
								<td><b>PostalCode :</b></td><td>"""),_display_(Seq[Any](/*128.42*/employee/*128.50*/.address.postalCode)),format.raw/*128.69*/("""</td>
								<td><b>Country :</b></td><td>"""),_display_(Seq[Any](/*129.39*/employee/*129.47*/.address.country)),format.raw/*129.63*/("""</td>
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
              			Employement  Information
              			<i class="icon-lock icon-large pull-right"></i>
          			</h4>
                </a>
        	</div>
        	<div id="accordionFour" class="panel-collapse collapse">
          		<div class="panel-body">
          		
           			<div class="table-responsive"> 
        				<table class="table table-hover  table-striped profileTable">
        					<tr>
								<td><b>Company :</b></td><td>"""),_display_(Seq[Any](/*155.39*/employee/*155.47*/.company)),format.raw/*155.55*/("""</td>
								<td><b>Store :</b></td><td>"""),_display_(Seq[Any](/*156.37*/employee/*156.45*/.store)),format.raw/*156.51*/("""</td>
							</tr>
							<tr>
								<td><b>Employment Commence Date :</b></td><td>"""),_display_(Seq[Any](/*159.56*/currentDateFormat(employee.ecd))),format.raw/*159.87*/("""</td>
								<td><b>Approved Hourly Rate/Annual Salary :</b></td><td>"""),_display_(Seq[Any](/*160.66*/employee/*160.74*/.sal)),format.raw/*160.78*/("""</td>
							</tr>
							<tr>
								<td><b>Designation :</b></td><td>"""),_display_(Seq[Any](/*163.43*/employee/*163.51*/.designation)),format.raw/*163.63*/("""</td>
								<td></td><td></td>
							</tr>
						</table>
					</div>
					
      			</div>
        	</div>
      	</div><!-- panel-primary 4 End-->
      	
    </div><!-- panel-group End-->



					</div> <!-- span 12 -->
        		</div> <!-- row -->
      		</div> <!-- container -->
     	</div> <!-- wrapper -->
     	
""")))})),format.raw/*182.2*/("""<!-- main end -->

   """))}
    }
    
    def render(employee:Employee): play.api.templates.HtmlFormat.Appendable = apply(employee)
    
    def f:((Employee) => play.api.templates.HtmlFormat.Appendable) = (employee) => apply(employee)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/employees/profile.scala.html
                    HASH: 5bfe0ce1ad326c61899b5ec78a99b03859f074f4
                    MATRIX: 788->1|940->85|965->102|1212->23|1241->45|1268->81|1298->319|1340->326|1352->330|1390->331|1667->572|1682->578|1724->598|2022->860|2037->866|2079->886|3056->1827|3073->1835|3105->1845|3186->1890|3203->1898|3234->1907|3351->1988|3368->1996|3400->2006|3478->2048|3495->2056|3524->2063|3636->2139|3689->2170|4618->3063|4635->3071|4676->3090|4762->3140|4779->3148|4819->3166|4934->3245|4951->3253|4992->3272|5072->3316|5089->3324|5133->3346|6030->4206|6048->4214|6086->4229|6165->4271|6183->4279|6219->4292|6327->4363|6345->4371|6383->4386|6463->4429|6481->4437|6518->4451|6630->4526|6648->4534|6690->4553|6772->4598|6790->4606|6829->4622|7765->5521|7783->5529|7814->5537|7894->5580|7912->5588|7941->5594|8067->5683|8121->5714|8230->5786|8248->5794|8275->5798|8388->5874|8406->5882|8441->5894|8820->6241
                    LINES: 26->1|31->5|31->5|42->1|43->3|43->4|44->15|47->18|47->18|47->18|56->27|56->27|56->27|62->33|62->33|62->33|87->58|87->58|87->58|88->59|88->59|88->59|91->62|91->62|91->62|92->63|92->63|92->63|95->66|95->66|120->91|120->91|120->91|121->92|121->92|121->92|124->95|124->95|124->95|125->96|125->96|125->96|149->120|149->120|149->120|150->121|150->121|150->121|153->124|153->124|153->124|154->125|154->125|154->125|157->128|157->128|157->128|158->129|158->129|158->129|184->155|184->155|184->155|185->156|185->156|185->156|188->159|188->159|189->160|189->160|189->160|192->163|192->163|192->163|211->182
                    -- GENERATED --
                */
            