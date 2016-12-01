
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
object reportsHomeForStore extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Long,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(sid:Long):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.12*/("""
 """),format.raw/*3.1*/(""" """),format.raw/*4.1*/("""
 
 """),_display_(Seq[Any](/*6.3*/main/*6.7*/{_display_(Seq[Any](format.raw/*6.8*/("""
	 	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.65*/routes/*7.71*/.Assets.at("stylesheets/reports.css"))),format.raw/*7.108*/("""">
	

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*16.24*/routes/*16.30*/.Application.index())),format.raw/*16.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">REPORTS</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Application.index())),format.raw/*22.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
    
	
	<form id="ajaxform" action=""""),_display_(Seq[Any](/*30.31*/routes/*30.37*/.Reports.getReport())),format.raw/*30.57*/("""" method="POST">

  	<div class="panel panel-success" style="height:210px;border-color:#000000;" >
		<div class="panel-heading" style="background-color:#9fdf9f;height:60px;"><center> <h2 style="color:#000;margin-top: 5px">Srini Group DashBoard</h2></center></div>
	   		 <div class="panel-body" style="font-size: 16px;">
			  	<div class="table-responsive">
			  		<table  style="background-color: #dff0d8;border-color:#000000;" class="table table-bordered">
			  			<tr>
			  				<td><b>Start Date :</b> <input type="text" name="reportStartDate" class="datepicker1"  readonly='readonly'/></td>
			  				<td><b>End Date : </b><input type="text" name="reportEndDate" class="datepicker1"  readonly='readonly'/> </td>
			  				<td> <b> """),_display_(Seq[Any](/*40.20*/Store/*40.25*/.find.byId(sid))),format.raw/*40.40*/("""</b> <input type="hidden" name="reportStore" value=""""),_display_(Seq[Any](/*40.93*/sid)),format.raw/*40.96*/("""" ></td>
			  			</tr>
			  			<tr>
			  				<td><b>Category&nbsp;&nbsp; : </b>
			  					<select name="byType" id="byType">
				  					<option value="sales">Sales</option>
				  					<option value="media">MediaTender</option>
				  					<option value="invoices">Invoices</option>
				  					<option value="ReconciliationReport">Reconciliation Report</option>
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
			  				<input type="reset" class="btn btn-danger"  value="Reset"/> 
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
     		<tr>
	     		<td> 
	     		<div id="visualizationbar"> 
	     		</div>
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

""")))})),format.raw/*130.2*/("""<!-- main end -->
 """))}
    }
    
    def render(sid:Long): play.api.templates.HtmlFormat.Appendable = apply(sid)
    
    def f:((Long) => play.api.templates.HtmlFormat.Appendable) = (sid) => apply(sid)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/reports/reportsHomeForStore.scala.html
                    HASH: ff73f0e90d7cfbb801808b15db21f8070af5c0b9
                    MATRIX: 794->1|951->11|980->33|1007->69|1048->76|1059->80|1096->81|1197->147|1211->153|1270->190|1548->432|1563->438|1605->458|1920->737|1935->743|1977->763|2219->969|2234->975|2276->995|3056->1739|3070->1744|3107->1759|3196->1812|3221->1815|5919->4481
                    LINES: 26->1|32->1|33->3|33->4|35->6|35->6|35->6|36->7|36->7|36->7|45->16|45->16|45->16|51->22|51->22|51->22|59->30|59->30|59->30|69->40|69->40|69->40|69->40|69->40|159->130
                    -- GENERATED --
                */
            