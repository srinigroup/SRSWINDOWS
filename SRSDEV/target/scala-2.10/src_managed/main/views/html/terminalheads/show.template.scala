
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[TerminalHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(terminalHeadForm: Form[TerminalHead]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.40*/("""

 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*14.24*/routes/*14.30*/.Application.index())),format.raw/*14.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Application.showOptions("TERMINAL HEAD","ALL"))),format.raw/*15.80*/("""" class="btn btn-default">TERMINAL HEAD</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.showOptions("TERMINAL HEAD","ALL"))),format.raw/*21.80*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         	<br><br>
         	
         	"""),_display_(Seq[Any](/*28.12*/if(flash.containsKey("success"))/*28.44*/ {_display_(Seq[Any](format.raw/*28.46*/("""
       			<div class="alert alert-warning">
            		<strong>Done!</strong> """),_display_(Seq[Any](/*30.39*/flash/*30.44*/.get("success"))),format.raw/*30.59*/("""
        		</div>
    		""")))})),format.raw/*32.8*/("""
	
  
  	"""),_display_(Seq[Any](/*35.5*/helper/*35.11*/.form(action = routes.TerminalHeads.save())/*35.54*/ {_display_(Seq[Any](format.raw/*35.56*/("""
		

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			TerminalHead Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset> 
	         					<legend> New TerminalHead</legend>    
								"""),_display_(Seq[Any](/*58.10*/helper/*58.16*/.inputText(terminalHeadForm("name"), '_label -> "Name", 'onblur -> "javascript:checkForUnique(this,'TERMINALHEAD','NAME');"))),format.raw/*58.140*/("""
         						"""),_display_(Seq[Any](/*59.17*/helper/*59.23*/.inputText(terminalHeadForm("category"), '_label -> "Category"))),format.raw/*59.86*/(""" 
							</fieldset>
						</table>
					</div>
            	</div>
        	</div>
      	</div><!-- panel-primary 1 End-->
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
    
    </div><!-- panel-group End-->


	""")))})),format.raw/*79.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*84.2*/("""<!-- main end -->
"""))}
    }
    
    def render(terminalHeadForm:Form[TerminalHead]): play.api.templates.HtmlFormat.Appendable = apply(terminalHeadForm)
    
    def f:((Form[TerminalHead]) => play.api.templates.HtmlFormat.Appendable) = (terminalHeadForm) => apply(terminalHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/terminalheads/show.scala.html
                    HASH: 019eaaae14de463ea73e7fb60f173d30e9f2a45f
                    MATRIX: 799->1|984->39|1015->63|1042->99|1079->102|1090->106|1127->107|1400->344|1415->350|1457->370|1576->453|1591->459|1660->506|1959->769|1974->775|2043->822|2267->1010|2308->1042|2348->1044|2469->1129|2483->1134|2520->1149|2578->1176|2626->1189|2641->1195|2693->1238|2733->1240|3580->2051|3595->2057|3742->2181|3796->2199|3811->2205|3896->2268|4492->2833|4566->2876
                    LINES: 26->1|32->1|34->4|34->5|35->6|35->6|35->6|43->14|43->14|43->14|44->15|44->15|44->15|50->21|50->21|50->21|57->28|57->28|57->28|59->30|59->30|59->30|61->32|64->35|64->35|64->35|64->35|87->58|87->58|87->58|88->59|88->59|88->59|108->79|113->84
                    -- GENERATED --
                */
            