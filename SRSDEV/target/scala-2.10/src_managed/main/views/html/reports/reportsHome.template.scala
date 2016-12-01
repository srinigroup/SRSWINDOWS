
package views.html.reports

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
object reportsHome extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.1*/(""" """),format.raw/*3.1*/("""
 
 """),_display_(Seq[Any](/*5.3*/main/*5.7*/{_display_(Seq[Any](format.raw/*5.8*/("""
 	 	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.66*/routes/*6.72*/.Assets.at("stylesheets/reports.css"))),format.raw/*6.109*/("""">
 
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
			 	
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*15.24*/routes/*15.30*/.Application.index())),format.raw/*15.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">REPORTS</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.index())),format.raw/*21.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
	
	<form id="ajaxform" action=""""),_display_(Seq[Any](/*28.31*/routes/*28.37*/.Reports.getReport())),format.raw/*28.57*/("""" method="POST" onreset="myFunction()">
	<div class="panel panel-success" style="height:210px;border-color:#000000;" >
		<div class="panel-heading" style="background-color:#9fdf9f;height:60px;"><center> <h2 style="color:#000;margin-top: 5px">Srini Group DashBoard</h2></center></div>
	   		 <div class="panel-body" style="font-size: 16px;">
  	
			  	<div class="table-responsive">
			  		<table style="background-color: #dff0d8;border-color:#000000;" class="table table-bordered">
			  			<tr>
			  				<td><b>Start Date :</b> <input type="text" name="reportStartDate" class="datepicker1" style="position: relative; z-index: 10;"   readonly='readonly'/></td>
			  				<td><b>End Date : </b><input type="text" name="reportEndDate" class="datepicker1" style="position: relative; z-index: 10;"  readonly='readonly'/> </td>
			  				<td><b>Store : </b><select name="reportStore">
			  					<option value="ALL">ALL</option>
			  					"""),_display_(Seq[Any](/*40.12*/for(store <- Stores.getStoresList()) yield /*40.48*/{_display_(Seq[Any](format.raw/*40.49*/("""
			  						<option value=""""),_display_(Seq[Any](/*41.28*/store/*41.33*/.id)),format.raw/*41.36*/("""">"""),_display_(Seq[Any](/*41.39*/store/*41.44*/.name)),format.raw/*41.49*/("""</option>
			  					""")))})),format.raw/*42.12*/("""
			  				</select> </td>
			  			</tr>
			  			<tr>
			  			<td><b>Category&nbsp; : </b><select name="byType" id="byType">
			  					<option value="sales">Sales</option>
			  					<option value="media">MediaTender</option>
			  					<option value="invoices">Invoices</option>
			  					<option value="ReconciliationReport">Reconciliation Report</option>
			  				</select></td>
							<td><b>SortBy&nbsp;&nbsp;&nbsp; : </b><select name="sortBy" id="sortBy">
								<option value="DATE">DATE</option>
			  					<option value="STORE">STORE</option>
			  				</select> </td>
			  				
			  				<td><input type="submit" id="reportButton" class="btn btn-primary" name="reportButton" value="GetReport"/>
			  				<input type="reset" id="resetClear"class="btn btn-danger"  value="Reset"/> </td>
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
     		<a href="#" class="pull-right" onclick="$('.google-visualization-table-table').tableExport("""),format.raw/*87.99*/("""{"""),format.raw/*87.100*/("""type:'excel',escape:'false'"""),format.raw/*87.127*/("""}"""),format.raw/*87.128*/(""");"> <img src=""""),_display_(Seq[Any](/*87.144*/routes/*87.150*/.Assets.at("javascripts/tableToExcelExport/icons/xls.png"))),format.raw/*87.208*/("""" width="24px">Export</a>
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
    </div>
    <!-- BootsTrap Modal Ends -->
    
 	</form>
		</div>
	</div>

""")))})),format.raw/*117.2*/("""<!-- main end -->
 """))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/reports/reportsHome.scala.html
                    HASH: 0697015fa287f59a6a514b78032b291cd3a8de1e
                    MATRIX: 922->20|949->56|990->63|1001->67|1038->68|1140->135|1154->141|1213->178|1496->425|1511->431|1553->451|1868->730|1883->736|1925->756|2161->956|2176->962|2218->982|3197->1925|3249->1961|3288->1962|3353->1991|3367->1996|3392->1999|3431->2002|3445->2007|3472->2012|3526->2034|5308->3788|5338->3789|5394->3816|5424->3817|5477->3833|5493->3839|5574->3897|6427->4718
                    LINES: 32->2|32->3|34->5|34->5|34->5|35->6|35->6|35->6|44->15|44->15|44->15|50->21|50->21|50->21|57->28|57->28|57->28|69->40|69->40|69->40|70->41|70->41|70->41|70->41|70->41|70->41|71->42|116->87|116->87|116->87|116->87|116->87|116->87|116->87|146->117
                    -- GENERATED --
                */
            