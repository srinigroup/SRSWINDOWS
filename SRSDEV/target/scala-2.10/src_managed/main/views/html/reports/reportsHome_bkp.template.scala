
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
object reportsHome_bkp extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.1*/(""" """),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""   
	 	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*5.65*/routes/*5.71*/.Assets.at("stylesheets/reports.css"))),format.raw/*5.108*/("""">
	

<form id="ajaxform" action=""""),_display_(Seq[Any](/*8.30*/routes/*8.36*/.Reports.getReport())),format.raw/*8.56*/("""" method="POST">

  <h1><center> <h1>Srini Group DashBoard</h1></center></h1><br><br>
  	
  	<div>
  		<table style="background-color: white;border-color: #fff;">
  			<tr>
  				<td><b>Start Date :</b> <input type="text" name="reportStartDate" class="datepicker1"  readonly='readonly'/></td>
  				<td><b>End Date : </b><input type="text" name="reportEndDate" class="datepicker1"  readonly='readonly'/> </td>
  				<td><b>Store : </b><select name="reportStore">
  					<option value="ALL">ALL</option>
  					"""),_display_(Seq[Any](/*19.9*/for(store <- Stores.getStoresList()) yield /*19.45*/{_display_(Seq[Any](format.raw/*19.46*/("""
  						<option value=""""),_display_(Seq[Any](/*20.25*/store/*20.30*/.id)),format.raw/*20.33*/("""">"""),_display_(Seq[Any](/*20.36*/store/*20.41*/.name)),format.raw/*20.46*/("""</option>
  					""")))})),format.raw/*21.9*/("""
  				</select> </td>
  			</tr>
  			<tr>
  				
  				<td><b>Category&nbsp;&nbsp; </b><select name="byType" id="byType">
  					<option value="sales">Sales</option>
  					<option value="media">MediaTender</option>
  					<option value="invoices">Invoices</option>
  					<option value="ReconciliationReport">Reconciliation Report</option>
  				</select></td>
				<td><b>SortBy : </b><select name="sortBy" id="sortBy">
					<option value="DATE">DATE</option>
  					<option value="STORE">STORE</option>
  				</select> </td>
  				
  				<td><input type="submit" id="reportButton" class="btn primary" name="reportButton" value="GetReport"/>
  				<input type="reset" class="btn"  value="Reset"/> </td>
  			</tr>
  		</table>
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
	
   <table> 
     <tr><td><div id="visualizationtable" style="height:300px; width: 1000px;"></div> </td>
     
     <tr><td> <div id="visualizationbar" style="height:400px; width: 1000px;"> </div></td></tr>
      </table>
      
      <!-- div's for pop up -->
      <div id="modal_chart" class="modal" style="display:none">
       <button id="popUpClose"><span>X</span></button>
	  <div id="chart_div" style="height: 350px;" > 
	  </div>
	 
	</div> 
 </form>

 """)))})),format.raw/*73.3*/("""    """))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:09 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/reports/reportsHome_bkp.scala.html
                    HASH: c2e966baa2fba477f3bd424e1a19fc89636c9992
                    MATRIX: 926->20|953->56|990->59|1001->63|1038->64|1142->133|1156->139|1215->176|1288->214|1302->220|1343->240|1900->762|1952->798|1991->799|2053->825|2067->830|2092->833|2131->836|2145->841|2172->846|2222->865|3981->2593
                    LINES: 32->2|32->3|33->4|33->4|33->4|34->5|34->5|34->5|37->8|37->8|37->8|48->19|48->19|48->19|49->20|49->20|49->20|49->20|49->20|49->20|50->21|102->73
                    -- GENERATED --
                */
            