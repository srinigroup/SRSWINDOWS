
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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[MediaTender],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(MediaTenderForm: Form[MediaTender] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.39*/("""

 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*14.24*/routes/*14.30*/.Application.index())),format.raw/*14.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Application.showOptions("MEDIA TENDER","ALL"))),format.raw/*15.79*/("""" class="btn btn-default">MEDIA TENDER</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.showOptions("MEDIA TENDER","ALL"))),format.raw/*21.79*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
	
  
  	"""),_display_(Seq[Any](/*35.5*/helper/*35.11*/.form(action = routes.MediaTenders.save())/*35.53*/ {_display_(Seq[Any](format.raw/*35.55*/("""
		

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			MediaTender Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset> 
	         					<legend> New MediaTender</legend>    
									"""),_display_(Seq[Any](/*58.11*/helper/*58.17*/.inputText(MediaTenderForm("name"), '_label -> "Name", 'onblur -> "javascript:checkForUnique(this,'MEDIATENDER','NAME');"))),format.raw/*58.139*/("""
         							"""),_display_(Seq[Any](/*59.18*/helper/*59.24*/.inputText(MediaTenderForm("category"), '_label -> "Category"))),format.raw/*59.86*/(""" 
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
    
    def render(MediaTenderForm:Form[MediaTender]): play.api.templates.HtmlFormat.Appendable = apply(MediaTenderForm)
    
    def f:((Form[MediaTender]) => play.api.templates.HtmlFormat.Appendable) = (MediaTenderForm) => apply(MediaTenderForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/mediatenders/show.scala.html
                    HASH: bcd0aed006bff41c754cac307e8bbb3a36fbd5b1
                    MATRIX: 797->1|981->38|1012->62|1039->98|1076->101|1087->105|1124->106|1397->343|1412->349|1454->369|1573->452|1588->458|1656->504|1954->766|1969->772|2037->818|2261->1006|2302->1038|2342->1040|2463->1125|2477->1130|2514->1145|2572->1172|2620->1185|2635->1191|2686->1233|2726->1235|3572->2045|3587->2051|3732->2173|3787->2192|3802->2198|3886->2260|4482->2825|4556->2868
                    LINES: 26->1|32->1|34->4|34->5|35->6|35->6|35->6|43->14|43->14|43->14|44->15|44->15|44->15|50->21|50->21|50->21|57->28|57->28|57->28|59->30|59->30|59->30|61->32|64->35|64->35|64->35|64->35|87->58|87->58|87->58|88->59|88->59|88->59|108->79|113->84
                    -- GENERATED --
                */
            