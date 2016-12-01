
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[SalesHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(salesHeadForm: Form[SalesHead] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.35*/("""

 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" 
"""),_display_(Seq[Any](/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*14.24*/routes/*14.30*/.Application.index())),format.raw/*14.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Application.showOptions("SALES HEAD","ALL"))),format.raw/*15.77*/("""" class="btn btn-default">SALES HEAD</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.showOptions("SALES HEAD","ALL"))),format.raw/*21.77*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
	
  
  	"""),_display_(Seq[Any](/*35.5*/helper/*35.11*/.form(action = routes.SalesHeads.save())/*35.51*/ {_display_(Seq[Any](format.raw/*35.53*/("""
		

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			SalesHead Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset> 
	         					<legend> New SalesHead</legend>    
								"""),_display_(Seq[Any](/*58.10*/helper/*58.16*/.inputText(salesHeadForm("name"), '_label -> "Name", 'onblur -> "javascript:checkForUnique(this,'SALESHEAD','NAME');"))),format.raw/*58.134*/("""
					         	"""),_display_(Seq[Any](/*59.17*/helper/*59.23*/.inputText(salesHeadForm("category"), '_label -> "Category"))),format.raw/*59.83*/(""" 
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
    
    def render(salesHeadForm:Form[SalesHead]): play.api.templates.HtmlFormat.Appendable = apply(salesHeadForm)
    
    def f:((Form[SalesHead]) => play.api.templates.HtmlFormat.Appendable) = (salesHeadForm) => apply(salesHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/salesheads/show.scala.html
                    HASH: aabd70ddfdf699709a927eee326a68eee618abbb
                    MATRIX: 793->1|973->34|1004->58|1031->94|1069->98|1080->102|1117->103|1390->340|1405->346|1447->366|1566->449|1581->455|1647->499|1943->759|1958->765|2024->809|2248->997|2289->1029|2329->1031|2450->1116|2464->1121|2501->1136|2559->1163|2607->1176|2622->1182|2671->1222|2711->1224|3552->2029|3567->2035|3708->2153|3762->2171|3777->2177|3859->2237|4455->2802|4529->2845
                    LINES: 26->1|32->1|34->4|34->5|35->6|35->6|35->6|43->14|43->14|43->14|44->15|44->15|44->15|50->21|50->21|50->21|57->28|57->28|57->28|59->30|59->30|59->30|61->32|64->35|64->35|64->35|64->35|87->58|87->58|87->58|88->59|88->59|88->59|108->79|113->84
                    -- GENERATED --
                */
            