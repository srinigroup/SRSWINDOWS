
package views.html.mediatenders

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[MediaTender],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, mediaTenderForm: Form[MediaTender]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";


Seq[Any](format.raw/*1.48*/("""

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
            				<a href=""""),_display_(Seq[Any](/*25.27*/routes/*25.33*/.Application.showOptions("MEDIA TENDER","ALL"))),format.raw/*25.79*/("""" class="btn btn-default">MEDIA TENDER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*26.54*/flash/*26.59*/.get("pageAction"))),format.raw/*26.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*31.27*/routes/*31.33*/.Application.showOptions("MEDIA TENDER",flash.get("pageAction")))),format.raw/*31.97*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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

   
 
	 """),_display_(Seq[Any](/*47.4*/helper/*47.10*/.form(action = routes.MediaTenders.update(id))/*47.56*/ {_display_(Seq[Any](format.raw/*47.58*/("""


	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Edit Media Tender
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset>
           						"""),_display_(Seq[Any](/*69.19*/helper/*69.25*/.inputText(mediaTenderForm("name"), '_label -> "Name"))),format.raw/*69.79*/("""
         						"""),_display_(Seq[Any](/*70.17*/helper/*70.23*/.inputText(mediaTenderForm("category"), '_label -> "Category"))),format.raw/*70.85*/("""
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
					
	 				<a href=""""),_display_(Seq[Any](/*89.17*/routes/*89.23*/.MediaTenders.delete(id))),format.raw/*89.47*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
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
    
    def render(id:Long,mediaTenderForm:Form[MediaTender]): play.api.templates.HtmlFormat.Appendable = apply(id,mediaTenderForm)
    
    def f:((Long,Form[MediaTender]) => play.api.templates.HtmlFormat.Appendable) = (id,mediaTenderForm) => apply(id,mediaTenderForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/mediatenders/editForm.scala.html
                    HASH: 3e4a6b7aef07f04f660f240beee93d5a563d6b23
                    MATRIX: 806->1|1042->47|1070->66|1097->101|1125->149|1161->151|1255->237|1293->238|1332->242|1376->264|1410->267|1448->270|1460->274|1498->275|1766->507|1781->513|1823->533|1941->615|1956->621|2024->667|2156->763|2170->768|2210->786|2404->944|2419->950|2505->1014|2705->1179|2746->1211|2786->1213|2901->1292|2915->1297|2952->1312|3004->1333|3051->1345|3066->1351|3121->1397|3161->1399|3934->2136|3949->2142|4025->2196|4078->2213|4093->2219|4177->2281|4558->2627|4613->2673|4652->2674|4834->2825|4875->2831|4930->2877|4969->2878|5028->2901|5043->2907|5089->2931|5227->3038|5348->3127|5418->3165
                    LINES: 26->1|34->1|36->4|36->5|38->8|39->9|39->9|39->9|41->11|41->11|43->13|45->15|45->15|45->15|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|61->31|61->31|61->31|69->39|69->39|69->39|71->41|71->41|71->41|73->43|77->47|77->47|77->47|77->47|99->69|99->69|99->69|100->70|100->70|100->70|113->83|113->83|113->83|116->86|117->87|117->87|117->87|119->89|119->89|119->89|121->91|130->100|135->105
                    -- GENERATED --
                */
            