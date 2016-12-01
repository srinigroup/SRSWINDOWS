
package views.html.managementreports

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
object reportsHomePageForManagement extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.1*/(""" """),format.raw/*3.1*/("""
 
 """),_display_(Seq[Any](/*5.3*/main/*5.7*/{_display_(Seq[Any](format.raw/*5.8*/("""
 	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.64*/routes/*6.70*/.Assets.at("stylesheets/reports.css"))),format.raw/*6.107*/("""">

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*14.24*/routes/*14.30*/.Application.index())),format.raw/*14.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">MANAGEMENT REPORTS</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*20.27*/routes/*20.33*/.Application.index())),format.raw/*20.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
    
	
	<form id="ajaxform" class="ajaxform" action=""""),_display_(Seq[Any](/*28.48*/routes/*28.54*/.ManagementReports.getManagementReport())),format.raw/*28.94*/("""" method="POST"> 

  
  	<div class="panel panel-success" style="height:210px;border-color:#000000;" >
		<div class="panel-heading" style="background-color:#9fdf9f;height:60px;"><center> <h2 style="color:#000;margin-top: 5px">Srini Group DashBoard</h2></center></div>
	   		 <div class="panel-body" style="font-size: 16px;">
  	
			  	<div class="table-responsive">
			  		<table  style="background-color: #dff0d8;border-color:#000000;" class="table table-bordered">
			  			<tr>
			  				<td><b>Start Date :</b> <input type="text" name="reportStartDate" class="datepicker1" style="position: relative; z-index: 10;"  readonly='readonly'/></td>
			  				<td><b>End Date : </b><input type="text" name="reportEndDate" class="datepicker1" style="position: relative; z-index: 10;" readonly='readonly'/> </td>
			  				<td><b>Store : </b>
				  				<select name="reportStore">
				  					<option value="ALL">ALL</option>
				  					"""),_display_(Seq[Any](/*43.13*/for(store <- Stores.getStoresList()) yield /*43.49*/{_display_(Seq[Any](format.raw/*43.50*/("""
				  						<option value=""""),_display_(Seq[Any](/*44.29*/store/*44.34*/.id)),format.raw/*44.37*/("""">"""),_display_(Seq[Any](/*44.40*/store/*44.45*/.name)),format.raw/*44.50*/("""</option>
				  					""")))})),format.raw/*45.13*/("""
				  				</select> 
				  			</td>
			  			 </tr>
			  			 <tr>
			  				<td><b>Category&nbsp;&nbsp; : </b>
			  				<select name="byType" id="byType">
			  					<option value="sales">Sales</option>
			  					<option value="media">MediaTender</option>
			  					<option value="ManagementStoreReconciliationReport">Reconciliation Report</option>
			  					"""),format.raw/*55.97*/("""
			  				</select>
			  				</td>
							<td><b>SortBy&nbsp;&nbsp;&nbsp; : </b>
							<select name="sortBy" id="sortBy">
								<option value="DATE">DATE</option>
			  					<option value="STORE">STORE</option>
			  				</select>
			  				</td>
			  				<td>
			  				<input type="submit" id="reportButton" class="btn btn-primary" name="reportButton" value="GetReport"/>
			  				<input type="reset" id="resetClear"class="btn btn-danger"  value="Reset"/>
			  				</td>
			  			</tr>
			  		</table>
			  	</div>
	  	</div>
		  		<div id="sortByDiv" style="display:none">
					<select  id="sortBySelectTagForSales">
					<option value="DATE">DATE</option>
					<option value="STORE">STORE</option>
					</select>
					<select  id="sortBySelectTagForSupp">
					<option value="DATE">DATE</option>
					<option value="STORE">STORE</option>
					<option value="SUPPLIER">SUPPLIER</option>
					<option value="PAYTERMS">PAYTERMS</option>
					</select>
				</div>
	</div>
	<br/>
				
	<div class="table-responsive" style="max-width: 100%;overflow-x: overlay;">
	   	<table class="table table-bordered" style="background-color: white;border-color: #fff;"> 
	     <tr>
	     	<td>
	     		<div id="visualizationtable"></div> 
	     	</td>
	     </tr>
	     <tr>
	     	<td>
	     		<a href="#" class="pull-right" onclick="$('.google-visualization-table-table').tableExport("""),format.raw/*96.100*/("""{"""),format.raw/*96.101*/("""type:'excel',escape:'false'"""),format.raw/*96.128*/("""}"""),format.raw/*96.129*/(""");"> <img src=""""),_display_(Seq[Any](/*96.145*/routes/*96.151*/.Assets.at("javascripts/tableToExcelExport/icons/xls.png"))),format.raw/*96.209*/("""" width="24px">Export</a>
	     		<div id="visualizationbar"> </div>
	     	</td>
	     </tr>
	     </table>
    </div>
				
	<!-- BootsTrap Modal for Report Click Event -->
	
	<div class="modal fade" id="myModalReportClick" role="dialog" style="background-color: rgba(0, 0, 0,0.3);">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Modal Header</h4>
        </div>
        <div class="modal-body">
          <p>Gopi</p>
          	
		  		<div id="chartpopUP"> // div for chart,Here our Chart Comes
		  		</div>
		  	
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
    
    <!-- BootsTrap Modal Ends -->
 </form>
	
	</div>
	</div>

""")))})),format.raw/*134.2*/("""<!-- main end -->
 """))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/managementreports/reportsHomePageForManagement.scala.html
                    HASH: eb7cbcdbc71e72f23f6c7cff1eaf0245cb03f582
                    MATRIX: 949->20|976->56|1017->63|1028->67|1065->68|1165->133|1179->139|1238->176|1513->415|1528->421|1570->441|1896->731|1911->737|1953->757|2212->980|2227->986|2289->1026|3267->1968|3319->2004|3358->2005|3424->2035|3438->2040|3463->2043|3502->2046|3516->2051|3543->2056|3598->2079|3993->2532|5432->3942|5462->3943|5518->3970|5548->3971|5601->3987|5617->3993|5698->4051|6745->5066
                    LINES: 32->2|32->3|34->5|34->5|34->5|35->6|35->6|35->6|43->14|43->14|43->14|49->20|49->20|49->20|57->28|57->28|57->28|72->43|72->43|72->43|73->44|73->44|73->44|73->44|73->44|73->44|74->45|84->55|125->96|125->96|125->96|125->96|125->96|125->96|125->96|163->134
                    -- GENERATED --
                */
            