
package views.html.users

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
object register extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/(userForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.24*/("""

 """),format.raw/*5.1*/(""" """),format.raw/*6.1*/("""
"""),_display_(Seq[Any](/*7.2*/main/*7.6*/{_display_(Seq[Any](format.raw/*7.7*/("""

	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*15.24*/routes/*15.30*/.Application.index())),format.raw/*15.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Application.showOptions("USER","ALL"))),format.raw/*16.71*/("""" class="btn btn-default">USER</a>
            				<a href="#" class="btn btn-default">ADD</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*22.27*/routes/*22.33*/.Application.showOptions("USER","ALL"))),format.raw/*22.71*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
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
	
  
  	"""),_display_(Seq[Any](/*36.5*/helper/*36.11*/.form(action = routes.Users.register())/*36.50*/ {_display_(Seq[Any](format.raw/*36.52*/("""
		

	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			User Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*58.15*/helper/*58.21*/.inputText(userForm("name"), '_label -> "Name"))),format.raw/*58.68*/("""</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*61.15*/helper/*61.21*/.inputText(userForm("email"), '_label -> "Email", 'onblur -> "javascript:checkForUnique(this,'USER','EMAIL');"))),format.raw/*61.132*/("""</td>
							</tr>
							<tr>
								<td>
									<div class="clearfix  " id="roles[]_field">
    									<label for="roles[]">Roles</label>
    										<div class="input">
								
												<select id="roles[]" name="roles[]" style="width:40%;" multiple>
					  								"""),_display_(Seq[Any](/*70.17*/for(role <- Role.all()) yield /*70.40*/ {_display_(Seq[Any](format.raw/*70.42*/("""
		                         						<option value="""),_display_(Seq[Any](/*71.49*/role/*71.53*/.id)),format.raw/*71.56*/(""" >"""),_display_(Seq[Any](/*71.59*/role/*71.63*/.description)),format.raw/*71.75*/(""" </option>
		                                            """)))})),format.raw/*72.48*/(""" 
		                  						</select> 
						                    </div>
						             </div>
                  				</td>         
               				</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*79.15*/helper/*79.21*/.inputPassword(userForm("password"), '_label -> "Password"))),format.raw/*79.80*/("""</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*82.15*/helper/*82.21*/.inputPassword(userForm("password"), '_label -> "Confirm Password"))),format.raw/*82.88*/("""</td>
							</tr>
						</table>
					</div>
            	</div>
        	</div>
      	</div><!-- panel-primary 1 End-->
      	
      	<!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /"><input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;" onclick="return isRolesSelected()">&nbsp;&nbsp;  
				
		    </div>
        </div>
        
    
    </div><!-- panel-group End-->


	""")))})),format.raw/*102.3*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*107.2*/("""<!-- main end -->









    


"""))}
    }
    
    def render(userForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:14 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/users/register.scala.html
                    HASH: fab2f5a6ef8a9dac96ca63eb29f6d9a2e280e2de
                    MATRIX: 787->3|956->25|987->49|1014->85|1051->88|1062->92|1099->93|1372->330|1387->336|1429->356|1548->439|1563->445|1623->483|1913->737|1928->743|1988->781|2212->969|2253->1001|2293->1003|2414->1088|2428->1093|2465->1108|2523->1135|2571->1148|2586->1154|2634->1193|2674->1195|3456->1941|3471->1947|3540->1994|3624->2042|3639->2048|3773->2159|4099->2449|4138->2472|4178->2474|4264->2524|4277->2528|4302->2531|4341->2534|4354->2538|4388->2550|4479->2609|4708->2802|4723->2808|4804->2867|4888->2915|4903->2921|4992->2988|5622->3586|5697->3629
                    LINES: 26->2|32->2|34->5|34->6|35->7|35->7|35->7|43->15|43->15|43->15|44->16|44->16|44->16|50->22|50->22|50->22|57->29|57->29|57->29|59->31|59->31|59->31|61->33|64->36|64->36|64->36|64->36|86->58|86->58|86->58|89->61|89->61|89->61|98->70|98->70|98->70|99->71|99->71|99->71|99->71|99->71|99->71|100->72|107->79|107->79|107->79|110->82|110->82|110->82|130->102|135->107
                    -- GENERATED --
                */
            