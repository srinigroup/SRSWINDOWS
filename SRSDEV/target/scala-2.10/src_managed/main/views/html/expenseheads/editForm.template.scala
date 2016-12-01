
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[ExpenseHead],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, expenseHeadForm: Form[ExpenseHead]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";


Seq[Any](format.raw/*1.48*/("""

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
            				<a href=""""),_display_(Seq[Any](/*26.27*/routes/*26.33*/.Application.showOptions("EXPENSE HEAD","ALL"))),format.raw/*26.79*/("""" class="btn btn-default">EXPENSE HEAD</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*27.54*/flash/*27.59*/.get("pageAction"))),format.raw/*27.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*32.27*/routes/*32.33*/.Application.showOptions("EXPENSE HEAD",flash.get("pageAction")))),format.raw/*32.97*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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

   
 
	 """),_display_(Seq[Any](/*48.4*/helper/*48.10*/.form(action = routes.ExpenseHeads.update(id))/*48.56*/ {_display_(Seq[Any](format.raw/*48.58*/("""


	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Edit ExpenseHead
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<fieldset>
           						"""),_display_(Seq[Any](/*70.19*/helper/*70.25*/.inputText(expenseHeadForm("name"), '_label -> "Name"))),format.raw/*70.79*/("""
         						"""),_display_(Seq[Any](/*71.17*/helper/*71.23*/.inputText(expenseHeadForm("category"), '_label -> "Category"))),format.raw/*71.85*/("""
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
					
	 				<a href=""""),_display_(Seq[Any](/*90.17*/routes/*90.23*/.ExpenseHeads.delete(id))),format.raw/*90.47*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want  to Delete ?')">Delete</a>
	 				
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
    
    def render(id:Long,expenseHeadForm:Form[ExpenseHead]): play.api.templates.HtmlFormat.Appendable = apply(id,expenseHeadForm)
    
    def f:((Long,Form[ExpenseHead]) => play.api.templates.HtmlFormat.Appendable) = (id,expenseHeadForm) => apply(id,expenseHeadForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/expenseheads/editForm.scala.html
                    HASH: a3496d7e6a916130c43e713ad10c457acb26b09a
                    MATRIX: 806->1|1042->47|1070->66|1097->101|1126->150|1163->152|1258->238|1297->239|1336->243|1380->265|1414->268|1452->271|1464->275|1502->276|1770->508|1785->514|1827->534|1945->616|1960->622|2028->668|2160->764|2174->769|2214->787|2408->945|2423->951|2509->1015|2709->1180|2750->1212|2790->1214|2905->1293|2919->1298|2956->1313|3008->1334|3055->1346|3070->1352|3125->1398|3165->1400|3937->2136|3952->2142|4028->2196|4081->2213|4096->2219|4180->2281|4561->2627|4616->2673|4655->2674|4837->2825|4878->2831|4933->2877|4972->2878|5031->2901|5046->2907|5092->2931|5231->3039|5352->3128|5422->3166
                    LINES: 26->1|34->1|36->4|36->5|39->9|40->10|40->10|40->10|42->12|42->12|44->14|46->16|46->16|46->16|55->25|55->25|55->25|56->26|56->26|56->26|57->27|57->27|57->27|62->32|62->32|62->32|70->40|70->40|70->40|72->42|72->42|72->42|74->44|78->48|78->48|78->48|78->48|100->70|100->70|100->70|101->71|101->71|101->71|114->84|114->84|114->84|117->87|118->88|118->88|118->88|120->90|120->90|120->90|122->92|131->101|136->106
                    -- GENERATED --
                */
            