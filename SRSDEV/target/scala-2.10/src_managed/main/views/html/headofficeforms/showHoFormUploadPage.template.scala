
package views.html.headofficeforms

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
object showHoFormUploadPage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main/*4.6*/{_display_(Seq[Any](format.raw/*4.7*/("""
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*12.24*/routes/*12.30*/.Application.index())),format.raw/*12.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href="#" class="btn btn-default">UPLOAD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Application.index())),format.raw/*18.53*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>
         		 
         	"""),_display_(Seq[Any](/*25.12*/if(flash.containsKey("success"))/*25.44*/ {_display_(Seq[Any](format.raw/*25.46*/("""
		        <div class="alert alert-warning">
		            <strong>Done!</strong> """),_display_(Seq[Any](/*27.39*/flash/*27.44*/.get("success"))),format.raw/*27.59*/("""
		        </div>
		    """)))})),format.raw/*29.8*/(""" 
	"""),format.raw/*30.121*/("""
	
	"""),_display_(Seq[Any](/*32.3*/helper/*32.9*/.form(action = routes.HoForms.uploadHoFormsByHeadOffice(),'enctype -> "multipart/form-data" ,'id -> "shiftSummaryForm")/*32.128*/ {_display_(Seq[Any](format.raw/*32.130*/("""
	 <div class="panel panel-default">
    <div class="panel-heading" style="background-color:lightcoral;font-size:17px;color: #fff;"><b style="color:#fff">Upload Head Office Forms :</b></div>
    <div class="panel-body" style="background-color: white;border-color: #fff;">
			<div class="table-responsive">
  				<table """),format.raw/*37.69*/(""" class="table table-bordered">
  					<tr>
            			<td>
            				<div class="clearfix" id="formType_field">
								<label for="formType">Form Type</label>
									<div class="input">
										<select id="formType" name="formType" required>
						            		<option class="blank" value="">-- Choose a Form Type --</option>
						  					<option value="Super Annuation">Super Annuation</option>
						  					<option value="TFN">TFN</option>
						  					<option value="Payroll Form">Payroll Form</option>
						  					<option value="Sira Blank">Sira Blank</option>
						  					<option value="Others">Others</option>
						  					
						  				</select> 
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
					  	<td>
            				<div class="clearfix" id="hoForm_field">
							<label  for="file-upload" >Select File</label>
									<div class="input">
										<input type="file" id="hoFormFiles" name="hoFormFiles" style="background-color:#333;color:#fff;font-size:16px;"  accept="application/pdf" multiple="multiple" onchange="HoFormUpdateList(this)" required />
									    <span class="help-inline"></span>
									</div>
							</div>
					  	</td>
            		</tr>
            	</table>
         	</div>
		</div>
      </div>
        
         <span id="displaySelected" style="display:none;"><b>Selected Form Details:</b></span>
		<div id="fileList" style="background-color: white;border-color: #fff;"></div><br/>
		
       <center><input type="submit" value="Upload" id="upload" class="btn btn-primary"></center>
        
	""")))})),format.raw/*76.3*/(""" <!-- form ends -->
	
	<a href=""""),_display_(Seq[Any](/*78.12*/routes/*78.18*/.HoForms.getAllHeadOfficeForms())),format.raw/*78.50*/("""" class="pull-right btn btn-success">Uploaded invoices</a>
		</div>
	</div>
	
""")))})),format.raw/*82.2*/(""" <!-- main ends -->"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:08 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/headofficeforms/showHoFormUploadPage.scala.html
                    HASH: a5d53cdbfe75c44563510bf6f6e672a2cf536cb2
                    MATRIX: 939->54|976->57|987->61|1024->62|1298->300|1313->306|1355->326|1669->604|1684->610|1726->630|1954->822|1995->854|2035->856|2156->941|2170->946|2207->961|2265->988|2298->1111|2340->1118|2354->1124|2483->1243|2524->1245|2876->1624|4547->3264|4618->3299|4633->3305|4687->3337|4801->3420
                    LINES: 32->3|33->4|33->4|33->4|41->12|41->12|41->12|47->18|47->18|47->18|54->25|54->25|54->25|56->27|56->27|56->27|58->29|59->30|61->32|61->32|61->32|61->32|66->37|105->76|107->78|107->78|107->78|111->82
                    -- GENERATED --
                */
            