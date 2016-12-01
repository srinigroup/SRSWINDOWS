
package views.html.salesheads

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[SalesHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, salesHeadForm: Form[SalesHead]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";


Seq[Any](format.raw/*1.44*/("""

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
            				<a href=""""),_display_(Seq[Any](/*25.27*/routes/*25.33*/.Application.showOptions("SALES HEAD","ALL"))),format.raw/*25.77*/("""" class="btn btn-default">SALES HEAD</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*26.54*/flash/*26.59*/.get("pageAction"))),format.raw/*26.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.Application.showOptions("SALES HEAD",flash.get("pageAction")))),format.raw/*31.95*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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

   
 
	 """),_display_(Seq[Any](/*47.4*/helper/*47.10*/.form(action = routes.SalesHeads.update(id))/*47.54*/ {_display_(Seq[Any](format.raw/*47.56*/("""


	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Edit SalesHead
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset>
           						"""),_display_(Seq[Any](/*69.19*/helper/*69.25*/.inputText(salesHeadForm("name"), '_label -> "Name"))),format.raw/*69.77*/("""
         						"""),_display_(Seq[Any](/*70.17*/helper/*70.23*/.inputText(salesHeadForm("category"), '_label -> "Category"))),format.raw/*70.83*/("""
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
					
	 				<a href=""""),_display_(Seq[Any](/*89.17*/routes/*89.23*/.SalesHeads.delete(id))),format.raw/*89.45*/("""" class="btn btn-danger" onclick="return confirm('Are you sure Want to Delete ?')">Delete</a>
	 				
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
    
    def render(id:Long,salesHeadForm:Form[SalesHead]): play.api.templates.HtmlFormat.Appendable = apply(id,salesHeadForm)
    
    def f:((Long,Form[SalesHead]) => play.api.templates.HtmlFormat.Appendable) = (id,salesHeadForm) => apply(id,salesHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/salesheads/editForm.scala.html
                    HASH: f3996dbc8e2c31d1c8d64e2651b1f2e78bfa4806
                    MATRIX: 802->1|1034->43|1062->62|1089->97|1117->145|1153->147|1247->233|1285->234|1324->238|1368->260|1402->263|1440->266|1452->270|1490->271|1758->503|1773->509|1815->529|1933->611|1948->617|2014->661|2144->755|2158->760|2198->778|2392->936|2407->942|2491->1004|2691->1169|2732->1201|2772->1203|2887->1282|2901->1287|2938->1302|2990->1323|3037->1335|3052->1341|3105->1385|3145->1387|3915->2121|3930->2127|4004->2179|4057->2196|4072->2202|4154->2262|4535->2608|4590->2654|4629->2655|4811->2806|4852->2812|4907->2858|4946->2859|5005->2882|5020->2888|5064->2910|5202->3017|5323->3106|5393->3144
                    LINES: 26->1|34->1|36->4|36->5|38->8|39->9|39->9|39->9|41->11|41->11|43->13|45->15|45->15|45->15|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|61->31|61->31|61->31|69->39|69->39|69->39|71->41|71->41|71->41|73->43|77->47|77->47|77->47|77->47|99->69|99->69|99->69|100->70|100->70|100->70|113->83|113->83|113->83|116->86|117->87|117->87|117->87|119->89|119->89|119->89|121->91|130->100|135->105
                    -- GENERATED --
                */
            