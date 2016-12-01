
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
object editForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Long,Form[User],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(id: Long, userForm: Form[User], user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

import java.lang.String; var fieldView = "";

def /*6.2*/checkSelected/*6.15*/(id:Long) = {{
    
    var result = ""
    for(role <- user.roles) {
       if(role.id==id){
       	
       	result = "selected"
       	}
    }
    result
}};
Seq[Any](format.raw/*1.46*/("""

"""),format.raw/*4.1*/(""" """),format.raw/*5.1*/(""" 
"""),format.raw/*16.2*/("""
 
"""),format.raw/*19.1*/("""
"""),_display_(Seq[Any](/*20.2*/if(flash.get("pageAction").equals("VIEW") || flash.get("pageAction").equals("DELETE"))/*20.88*/{_display_(Seq[Any](format.raw/*20.89*/("""

	"""),_display_(Seq[Any](/*22.3*/{fieldView="disabled"})),format.raw/*22.25*/("""

""")))})),format.raw/*24.2*/("""

"""),_display_(Seq[Any](/*26.2*/main/*26.6*/{_display_(Seq[Any](format.raw/*26.7*/("""
 
	
	<div class="wrapper">
     	<div class="container" >
			 <div class="row">
            	<div class="span12">
               		 <span>
                    	<div id="bc1" class="btn-group btn-breadcrumb">
       						<a href=""""),_display_(Seq[Any](/*35.24*/routes/*35.30*/.Application.index())),format.raw/*35.50*/("""" class="btn btn-success"><i class="icon-home"></i></a>
            				<a href=""""),_display_(Seq[Any](/*36.27*/routes/*36.33*/.Application.showOptions("USER","ALL"))),format.raw/*36.71*/("""" class="btn btn-default">USER</a>
            				<a href="#" class="btn btn-default">"""),_display_(Seq[Any](/*37.54*/flash/*37.59*/.get("pageAction"))),format.raw/*37.77*/("""</a>
      					</div>
        			</span>
            		<span class="pull-right" style="padding-right:50px;">
           				 <div>
           					<a href=""""),_display_(Seq[Any](/*42.27*/routes/*42.33*/.Application.showOptions("USER",flash.get("pageAction")))),format.raw/*42.89*/("""" class="btn btn-default"><i class="icon-arrow-left"></i>BACK</a>
          				 </div>
        			</span>
        		</div>
        	</div>
         		 <br><br>


	"""),_display_(Seq[Any](/*50.3*/if(flash.containsKey("success"))/*50.35*/ {_display_(Seq[Any](format.raw/*50.37*/("""
        <div class="alert alert-warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*52.37*/flash/*52.42*/.get("success"))),format.raw/*52.57*/("""
        </div>
    """)))})),format.raw/*54.6*/(""" 

   
 
	"""),_display_(Seq[Any](/*58.3*/helper/*58.9*/.form(action = routes.Users.update(id))/*58.48*/ {_display_(Seq[Any](format.raw/*58.50*/("""


	<!-- panel-group -->
	<div class="panel-group" id="accordion">
		
		<!-- panel-primary 1-->
   		<div class="panel panel-primary">
        	<div class="panel-heading">
            	<a data-toggle="collapse" data-parent="#accordion" href="#accordionOne">
          			<h4 class="panel-title">
          				<i class="icon-reorder"></i>&nbsp;
            			Edit User Details
            			<i class="icon-unlock icon-large pull-right"></i>
             		</h4>
             	</a>  
        	</div>
        	<div id="accordionOne" class="panel-collapse collapse in">
          		<div class="panel-body">
          			<div class="table-responsive"> 
        				<table class="table table-bordered" >
							<tr>
								<td> """),_display_(Seq[Any](/*80.15*/helper/*80.21*/.inputText(userForm("name"), '_label -> "Name",'readonly -> "readonly"))),format.raw/*80.92*/("""	</td>
							</tr>
							<tr>
								<td> """),_display_(Seq[Any](/*83.15*/helper/*83.21*/.inputText(userForm("email"), '_label -> "Email",'readonly -> "readonly"))),format.raw/*83.94*/("""	</td>
							</tr>
							<tr>
								<td> 
									<div class="clearfix  " id="roles[]_field">
    									<label for="roles[]">Roles</label>
    										<div class="input">
								
												<select id="roles[]" name="roles[]"  style="width:40%;" multiple>
					  								"""),_display_(Seq[Any](/*92.17*/for(role <- Role.all()) yield /*92.40*/ {_display_(Seq[Any](format.raw/*92.42*/("""
		                         						<option value="""),_display_(Seq[Any](/*93.49*/role/*93.53*/.id)),format.raw/*93.56*/("""  """),_display_(Seq[Any](/*93.59*/checkSelected(role.id))),format.raw/*93.81*/(""">"""),_display_(Seq[Any](/*93.83*/role/*93.87*/.name)),format.raw/*93.92*/(""" </option>
		                                            """)))})),format.raw/*94.48*/(""" 
		                  						</select> 
						                    </div>
						             </div>
                  				</td>         
               				</tr>
						</table>
					</div>
            	</div>
        	</div>
      	</div><!-- panel-primary 1 End-->
      	
      	
      	 <!-- bottom div ,for submit and cancel button's -->
        <div style="height:50px; margin-right:50px;  margin-top:10px;">
        	<div>
            	<p style="text-align: right; /">  
				"""),_display_(Seq[Any](/*111.6*/if((flash.get("pageAction")).equals("MODIFY"))/*111.52*/{_display_(Seq[Any](format.raw/*111.53*/("""
					<input type="submit" class="btn btn-large btn-success" style="padding-right:40px; padding-left:40px; text-align:center;" onclick="return isRolesSelected()">&nbsp;&nbsp;
					
				""")))})),format.raw/*114.6*/("""
				"""),_display_(Seq[Any](/*115.6*/if((flash.get("pageAction")).equals("DELETE"))/*115.52*/{_display_(Seq[Any](format.raw/*115.53*/("""
					
	 				<a href=""""),_display_(Seq[Any](/*117.17*/routes/*117.23*/.Users.delete(id))),format.raw/*117.40*/("""" class="btn btn-danger" onclick="return confirm('Are you sure want to Delete ?')">Delete</a>
	 				
	 			""")))})),format.raw/*119.7*/("""
 				</p>
		    </div>
        </div>
       
    
    </div><!-- panel-group End-->


""")))})),format.raw/*128.2*/("""<!-- form end -->
	
	</div>
	</div>

""")))})),format.raw/*133.2*/("""<!-- main end -->


"""))}
    }
    
    def render(id:Long,userForm:Form[User],user:User): play.api.templates.HtmlFormat.Appendable = apply(id,userForm,user)
    
    def f:((Long,Form[User],User) => play.api.templates.HtmlFormat.Appendable) = (id,userForm,user) => apply(id,userForm,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:13 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/users/editForm.scala.html
                    HASH: a74fa5310a94232db02189baf470081bd9ecc6e1
                    MATRIX: 797->1|1014->102|1035->115|1224->45|1252->64|1279->99|1308->274|1338->323|1375->325|1470->411|1509->412|1548->416|1592->438|1626->441|1664->444|1676->448|1714->449|1982->681|1997->687|2039->707|2157->789|2172->795|2232->833|2356->921|2370->926|2410->944|2604->1102|2619->1108|2697->1164|2897->1329|2938->1361|2978->1363|3093->1442|3107->1447|3144->1462|3196->1483|3242->1494|3256->1500|3304->1539|3344->1541|4107->2268|4122->2274|4215->2345|4297->2391|4312->2397|4407->2470|4727->2754|4766->2777|4806->2779|4891->2828|4904->2832|4929->2835|4968->2838|5012->2860|5050->2862|5063->2866|5090->2871|5180->2929|5696->3409|5752->3455|5792->3456|6010->3642|6052->3648|6108->3694|6148->3695|6208->3718|6224->3724|6264->3741|6403->3848|6524->3937|6594->3975
                    LINES: 26->1|33->6|33->6|44->1|46->4|46->5|47->16|49->19|50->20|50->20|50->20|52->22|52->22|54->24|56->26|56->26|56->26|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|72->42|72->42|72->42|80->50|80->50|80->50|82->52|82->52|82->52|84->54|88->58|88->58|88->58|88->58|110->80|110->80|110->80|113->83|113->83|113->83|122->92|122->92|122->92|123->93|123->93|123->93|123->93|123->93|123->93|123->93|123->93|124->94|141->111|141->111|141->111|144->114|145->115|145->115|145->115|147->117|147->117|147->117|149->119|158->128|163->133
                    -- GENERATED --
                */
            