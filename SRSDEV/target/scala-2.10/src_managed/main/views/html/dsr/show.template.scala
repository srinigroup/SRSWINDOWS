
package views.html.dsr

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Form[DailySalesReconciliation],DailySalesReconciliation,Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/( dsrForm: Form[DailySalesReconciliation],dsrObject: DailySalesReconciliation, store: Store):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.94*/("""
 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main/*6.6*/{_display_(Seq[Any](format.raw/*6.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*14.24*/routes/*14.30*/.Application.index())),format.raw/*14.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Application.showOptions("SALES RECONCILIATION","ALL"))),format.raw/*15.87*/("""" class="btn btn-default">SALES RECONCILIATION</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*21.27*/routes/*21.33*/.Application.showOptions("SALES RECONCILIATION","ALL"))),format.raw/*21.87*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
     
"""),_display_(Seq[Any](/*29.2*/helper/*29.8*/.form(action = routes.DailySalesReconciliations.update(dsrObject.id))/*29.77*/ {_display_(Seq[Any](format.raw/*29.79*/("""
	
	
	<h3>"""),_display_(Seq[Any](/*32.7*/store/*32.12*/.name)),format.raw/*32.17*/(""" Sales</h3>
		
		<hr/>
		<br/>
	<div class="table-responsive">
		<table class="table table-bordered" style="background-color: white;border-color: #fff;">
			 <tr>
				
				<td>
					"""),_display_(Seq[Any](/*41.7*/helper/*41.13*/.inputText(dsrForm("todayDate"), '_label -> "Created Date",'readonly -> "readonly"))),format.raw/*41.96*/("""
				</td>
				<td> 
					 <div class="clearfix" id="date_field">
    									<label for="LastReportingDate">Last Reporting Date</label>
    									<div class="input">
											<input type="text" name="LastReportingDate" value=""""),_display_(Seq[Any](/*47.64*/DailySalesReconciliation/*47.88*/.getLastReportingBusinessDate(store.id))),format.raw/*47.127*/("""" readonly="readonly"/>
										</div>
					</div>
				</td>
				
				<td>
					"""),_display_(Seq[Any](/*53.7*/helper/*53.13*/.inputText(dsrForm("store.name"), '_label -> "Store Name",'readonly -> "readonly"))),format.raw/*53.95*/("""
				</td>
			</tr>	
			<tr>
				<td>
					"""),_display_(Seq[Any](/*58.7*/helper/*58.13*/.inputText(dsrForm("reportingBusinessDate"), '_label -> "Reporting Business Date",'readonly -> "readonly"))),format.raw/*58.119*/("""
				</td>
				<td>
					"""),_display_(Seq[Any](/*61.7*/helper/*61.13*/.inputText(dsrForm("store.cashInSafe"), '_label -> "Cash in Safe",'readonly -> "readonly"))),format.raw/*61.103*/("""
				</td>
				<td>
					
					"""),_display_(Seq[Any](/*65.7*/select(
  				 dsrForm("status"),
  				 options(Seq("OPEN","SUBMITTED")),
 				 '_label -> "Status", '_default -> "-- Select Status --"
				))),format.raw/*69.6*/("""</td>
			</tr>
		</table>
       </div>
		
      		
      	
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
       
  
""")))})),format.raw/*87.2*/("""<!-- form end -->

	</div>
	</div>

""")))})),format.raw/*92.2*/("""<!-- main end -->
"""))}
    }
    
    def render(dsrForm:Form[DailySalesReconciliation],dsrObject:DailySalesReconciliation,store:Store): play.api.templates.HtmlFormat.Appendable = apply(dsrForm,dsrObject,store)
    
    def f:((Form[DailySalesReconciliation],DailySalesReconciliation,Store) => play.api.templates.HtmlFormat.Appendable) = (dsrForm,dsrObject,store) => apply(dsrForm,dsrObject,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:07 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/dsr/show.scala.html
                    HASH: 3720892b9feaec01b392f33d78536dc05421e52c
                    MATRIX: 832->3|1071->95|1100->117|1127->153|1164->156|1175->160|1212->161|1485->398|1500->404|1542->424|1661->507|1676->513|1752->567|2058->837|2073->843|2149->897|2373->1086|2387->1092|2465->1161|2505->1163|2554->1177|2568->1182|2595->1187|2822->1379|2837->1385|2942->1468|3218->1708|3251->1732|3313->1771|3437->1860|3452->1866|3556->1948|3640->1997|3655->2003|3784->2109|3848->2138|3863->2144|3976->2234|4047->2270|4214->2416|4712->2883|4785->2925
                    LINES: 26->2|32->2|33->4|33->5|34->6|34->6|34->6|42->14|42->14|42->14|43->15|43->15|43->15|49->21|49->21|49->21|57->29|57->29|57->29|57->29|60->32|60->32|60->32|69->41|69->41|69->41|75->47|75->47|75->47|81->53|81->53|81->53|86->58|86->58|86->58|89->61|89->61|89->61|93->65|97->69|115->87|120->92
                    -- GENERATED --
                */
            