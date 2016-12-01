
package views.html.paymentTenders

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[PaymentTender],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, paymentTenderForm: Form[PaymentTender]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";


Seq[Any](format.raw/*1.52*/("""

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
            				<a href=""""),_display_(Seq[Any](/*25.27*/routes/*25.33*/.Application.showOptions("PAYMENT TENDER","ALL"))),format.raw/*25.81*/("""" class="btn btn-default">PAYMENT TENDER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*26.54*/flash/*26.59*/.get("pageAction"))),format.raw/*26.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.Application.showOptions("PAYMENT TENDER",flash.get("pageAction")))),format.raw/*31.99*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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

   
 
	 """),_display_(Seq[Any](/*47.4*/helper/*47.10*/.form(action = routes.PaymentTenders.update(id))/*47.58*/ {_display_(Seq[Any](format.raw/*47.60*/("""


	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Edit Payment Tender
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset>
           						"""),_display_(Seq[Any](/*69.19*/helper/*69.25*/.inputText(paymentTenderForm("name"), '_label -> "Name"))),format.raw/*69.81*/("""
         						"""),_display_(Seq[Any](/*70.17*/helper/*70.23*/.inputText(paymentTenderForm("category"), '_label -> "Category"))),format.raw/*70.87*/("""
        					</fieldset>
						</table>
					</div>
            	</div>
        	</div>
      	</div><!-- panel-primary 1 End-->
      	
      	
      	 <!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*83.6*/if((flash.get("pageAction")).equals("MODIFY"))/*83.52*/{_display_(Seq[Any](format.raw/*83.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*86.6*/("""
				"""),_display_(Seq[Any](/*87.6*/if((flash.get("pageAction")).equals("DELETE"))/*87.52*/{_display_(Seq[Any](format.raw/*87.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*89.17*/routes/*89.23*/.PaymentTenders.delete(id))),format.raw/*89.49*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
	 			""")))})),format.raw/*91.7*/("""
 				</p>
		    </div>
        </div>
       
    
    </div><!-- panel-group End-->


""")))})),format.raw/*100.2*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*105.2*/("""<!-- main end -->

"""))}
    }
    
    def render(id:Long,paymentTenderForm:Form[PaymentTender]): play.api.templates.HtmlFormat.Appendable = apply(id,paymentTenderForm)
    
    def f:((Long,Form[PaymentTender]) => play.api.templates.HtmlFormat.Appendable) = (id,paymentTenderForm) => apply(id,paymentTenderForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/paymentTenders/editForm.scala.html
                    HASH: 6b38c04f23968f137a9105131985a2b4028ad4c0
                    MATRIX: 810->1|1050->51|1078->70|1105->105|1133->153|1169->155|1263->241|1301->242|1340->246|1384->268|1418->271|1456->274|1468->278|1506->279|1774->511|1789->517|1831->537|1949->619|1964->625|2034->673|2168->771|2182->776|2222->794|2416->952|2431->958|2519->1024|2719->1189|2760->1221|2800->1223|2915->1302|2929->1307|2966->1322|3018->1343|3065->1355|3080->1361|3137->1409|3177->1411|3952->2150|3967->2156|4045->2212|4098->2229|4113->2235|4199->2299|4580->2645|4635->2691|4674->2692|4856->2843|4897->2849|4952->2895|4991->2896|5050->2919|5065->2925|5113->2951|5251->3058|5372->3147|5442->3185
                    LINES: 26->1|34->1|36->4|36->5|38->8|39->9|39->9|39->9|41->11|41->11|43->13|45->15|45->15|45->15|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|61->31|61->31|61->31|69->39|69->39|69->39|71->41|71->41|71->41|73->43|77->47|77->47|77->47|77->47|99->69|99->69|99->69|100->70|100->70|100->70|113->83|113->83|113->83|116->86|117->87|117->87|117->87|119->89|119->89|119->89|121->91|130->100|135->105
                    -- GENERATED --
                */
            