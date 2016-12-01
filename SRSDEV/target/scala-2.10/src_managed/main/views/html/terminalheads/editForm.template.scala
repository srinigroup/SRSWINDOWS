
package views.html.terminalheads

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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[TerminalHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, terminalHeadForm: Form[TerminalHead]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";


Seq[Any](format.raw/*1.50*/("""

"""),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""


"""),format.raw/*9.1*/("""
"""),_display_(Seq[Any](/*10.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*10.88*/{_display_(Seq[Any](format.raw/*10.89*/("""

	"""),_display_(Seq[Any](/*12.3*/{fieldView="disabled"})),format.raw/*12.25*/("""

""")))})),format.raw/*14.2*/("""

"""),_display_(Seq[Any](/*16.2*/main/*16.6*/{_display_(Seq[Any](format.raw/*16.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*25.24*/routes/*25.30*/.Application.index())),format.raw/*25.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*26.27*/routes/*26.33*/.Application.showOptions("TERMINAL HEAD","ALL"))),format.raw/*26.80*/("""" class="btn btn-default">TERMINAL HEAD</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*27.54*/flash/*27.59*/.get("pageAction"))),format.raw/*27.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*32.27*/routes/*32.33*/.Application.showOptions("TERMINAL HEAD",flash.get("pageAction")))),format.raw/*32.98*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*40.3*/if(flash.containsKey("success"))/*40.35*/ {_display_(Seq[Any](format.raw/*40.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*42.37*/flash/*42.42*/.get("success"))),format.raw/*42.57*/("""
        </div>
    """)))})),format.raw/*44.6*/(""" 

   
 
	  """),_display_(Seq[Any](/*48.5*/helper/*48.11*/.form(action = routes.TerminalHeads.update(id))/*48.58*/ {_display_(Seq[Any](format.raw/*48.60*/("""


	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Edit TerminalHead
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset>
           						"""),_display_(Seq[Any](/*70.19*/helper/*70.25*/.inputText(terminalHeadForm("name"), '_label -> "Name"))),format.raw/*70.80*/("""
         						"""),_display_(Seq[Any](/*71.17*/helper/*71.23*/.inputText(terminalHeadForm("category"), '_label -> "Category"))),format.raw/*71.86*/("""
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
				"""),_display_(Seq[Any](/*84.6*/if((flash.get("pageAction")).equals("MODIFY"))/*84.52*/{_display_(Seq[Any](format.raw/*84.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;
					
				""")))})),format.raw/*87.6*/("""
				"""),_display_(Seq[Any](/*88.6*/if((flash.get("pageAction")).equals("DELETE"))/*88.52*/{_display_(Seq[Any](format.raw/*88.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*90.17*/routes/*90.23*/.TerminalHeads.delete(id))),format.raw/*90.48*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
	 			""")))})),format.raw/*92.7*/("""
 				</p>
		    </div>
        </div>
       
    
    </div><!-- panel-group End-->


""")))})),format.raw/*101.2*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*106.2*/("""<!-- main end -->
"""))}
    }
    
    def render(id:Long,terminalHeadForm:Form[TerminalHead]): play.api.templates.HtmlFormat.Appendable = apply(id,terminalHeadForm)
    
    def f:((Long,Form[TerminalHead]) => play.api.templates.HtmlFormat.Appendable) = (id,terminalHeadForm) => apply(id,terminalHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/terminalheads/editForm.scala.html
                    HASH: d486170440c1dc58d7adba2b835628202130b1a7
                    MATRIX: 808->1|1046->49|1074->68|1101->103|1130->152|1167->154|1262->240|1301->241|1340->245|1384->267|1418->270|1456->273|1468->277|1506->278|1774->510|1789->516|1831->536|1949->618|1964->624|2033->671|2166->768|2180->773|2220->791|2414->949|2429->955|2516->1020|2716->1185|2757->1217|2797->1219|2912->1298|2926->1303|2963->1318|3015->1339|3063->1352|3078->1358|3134->1405|3174->1407|3947->2144|3962->2150|4039->2205|4092->2222|4107->2228|4192->2291|4573->2637|4628->2683|4667->2684|4849->2835|4890->2841|4945->2887|4984->2888|5043->2911|5058->2917|5105->2942|5243->3049|5364->3138|5434->3176
                    LINES: 26->1|34->1|36->4|36->5|39->9|40->10|40->10|40->10|42->12|42->12|44->14|46->16|46->16|46->16|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|62->32|62->32|62->32|70->40|70->40|70->40|72->42|72->42|72->42|74->44|78->48|78->48|78->48|78->48|100->70|100->70|100->70|101->71|101->71|101->71|114->84|114->84|114->84|117->87|118->88|118->88|118->88|120->90|120->90|120->90|122->92|131->101|136->106
                    -- GENERATED --
                */
            