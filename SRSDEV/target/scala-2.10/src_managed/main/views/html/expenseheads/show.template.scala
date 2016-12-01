
package views.html.expenseheads

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[ExpenseHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(expenseHeadForm: Form[ExpenseHead] ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.39*/("""

 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*15.24*/routes/*15.30*/.Application.index())),format.raw/*15.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Application.showOptions("EXPENSE HEAD","ALL"))),format.raw/*16.79*/("""" class="btn btn-default">EXPENSE HEAD</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Application.showOptions("EXPENSE HEAD","ALL"))),format.raw/*22.79*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         	<br><br>
         	
         	"""),_display_(Seq[Any](/*29.12*/if(flash.containsKey("success"))/*29.44*/ {_display_(Seq[Any](format.raw/*29.46*/("""
       			<div class="alert alert-warning">
            		<strong>Done!</strong> """),_display_(Seq[Any](/*31.39*/flash/*31.44*/.get("success"))),format.raw/*31.59*/("""
        		</div>
    		""")))})),format.raw/*33.8*/("""
	
  
  	"""),_display_(Seq[Any](/*36.5*/helper/*36.11*/.form(action = routes.ExpenseHeads.save())/*36.53*/ {_display_(Seq[Any](format.raw/*36.55*/("""
		

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			ExpenseHead Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset> 
	         					<legend> New ExpenseHead</legend>    
								"""),_display_(Seq[Any](/*59.10*/helper/*59.16*/.inputText(expenseHeadForm("name"), '_label -> "Name", 'onblur -> "javascript:checkForUnique(this,'EXPENSEHEAD','NAME');"))),format.raw/*59.138*/("""
         						"""),_display_(Seq[Any](/*60.17*/helper/*60.23*/.inputText(expenseHeadForm("category"), '_label -> "Category"))),format.raw/*60.85*/(""" 
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


	""")))})),format.raw/*80.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*85.2*/("""<!-- main end -->
"""))}
    }
    
    def render(expenseHeadForm:Form[ExpenseHead]): play.api.templates.HtmlFormat.Appendable = apply(expenseHeadForm)
    
    def f:((Form[ExpenseHead]) => play.api.templates.HtmlFormat.Appendable) = (expenseHeadForm) => apply(expenseHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/expenseheads/show.scala.html
                    HASH: 1a4097511b9ca6dc92b5e7caec7cc37da4dfc6f9
                    MATRIX: 797->1|981->38|1012->62|1039->98|1078->103|1089->107|1126->108|1399->345|1414->351|1456->371|1575->454|1590->460|1658->506|1956->768|1971->774|2039->820|2263->1008|2304->1040|2344->1042|2465->1127|2479->1132|2516->1147|2574->1174|2622->1187|2637->1193|2688->1235|2728->1237|3573->2046|3588->2052|3733->2174|3787->2192|3802->2198|3886->2260|4482->2825|4556->2868
                    LINES: 26->1|32->1|34->4|34->5|36->7|36->7|36->7|44->15|44->15|44->15|45->16|45->16|45->16|51->22|51->22|51->22|58->29|58->29|58->29|60->31|60->31|60->31|62->33|65->36|65->36|65->36|65->36|88->59|88->59|88->59|89->60|89->60|89->60|109->80|114->85
                    -- GENERATED --
                */
            