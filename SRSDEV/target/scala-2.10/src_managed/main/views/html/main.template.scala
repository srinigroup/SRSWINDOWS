
package views.html

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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {
def /*2.2*/checkPermission/*2.17*/(user:String) = {{
    
   var role =  user 
    if(role == null) {
       	role = "null";
    }
     role
}};def /*11.2*/checkAction/*11.13*/(action: String) = {{

var result = " success" ;
  if(flash.containsKey("action")) {
      if((flash.get("action")).equals(action)){
      
       result ="danger" ;
      }
      
    } 
	result
}};
Seq[Any](format.raw/*1.17*/("""
"""),format.raw/*9.2*/("""

"""),format.raw/*22.2*/("""
  
 
<!DOCTYPE html>
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <title>Srini Group</title>
        
   		 <script type="text/javascript" src='"""),_display_(Seq[Any](/*33.44*/routes/*33.50*/.Application.javascriptRoutes())),format.raw/*33.81*/("""'></script>
   		 
   		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
   		
   		<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
   		
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
   		
   		
   		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*42.67*/routes/*42.73*/.Assets.at("stylesheets/theme.css"))),format.raw/*42.108*/("""">
       	
       	 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*44.40*/routes/*44.46*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*44.91*/(""""> 
       	
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*46.71*/routes/*46.77*/.Assets.at("bootstrap/css/bootstrap-responsive.min.css"))),format.raw/*46.133*/(""""> 
        
       <!-- <link rel="stylesheet" href=""""),_display_(Seq[Any](/*48.43*/routes/*48.49*/.Assets.at("bootstrap/css/bootstrap-theme.min.css"))),format.raw/*48.100*/(""""> -->
 
		 <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*50.65*/routes/*50.71*/.Assets.at("stylesheets/style_accordian.css"))),format.raw/*50.116*/(""""> 
		
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*52.64*/routes/*52.70*/.Assets.at("stylesheets/style.css"))),format.raw/*52.105*/("""">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*53.64*/routes/*53.70*/.Assets.at("images/icons/css/font-awesome.css"))),format.raw/*53.117*/("""">
		
       
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600'
            rel='stylesheet'>
			
		
		<link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
  	
   		<script type="text/javascript" src=""""),_display_(Seq[Any](/*62.43*/routes/*62.49*/.Assets.at("javascripts/common.js"))),format.raw/*62.84*/(""""></script>
   		
   		
   		 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*65.37*/routes/*65.43*/.Assets.at("fancybox/jquery.fancybox.css?v=2.1.5"))),format.raw/*65.93*/("""" type="text/css" media="screen" /> <!-- Fancybox css -->
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*66.40*/routes/*66.46*/.Assets.at("fancybox/jquery.fancybox.pack.js?v=2.1.5"))),format.raw/*66.100*/(""""></script> <!-- Fancybox js, need jquery advanced -->
  	
  		<!-- To convert Table to Excel download in Reports page -->
  		<script type="text/javascript" src=""""),_display_(Seq[Any](/*69.42*/routes/*69.48*/.Assets.at("javascripts/tableToExcelExport/jquery.base64.js"))),format.raw/*69.109*/(""""></script>
  		<script type="text/javascript" src=""""),_display_(Seq[Any](/*70.42*/routes/*70.48*/.Assets.at("javascripts/tableToExcelExport/tableExport.js"))),format.raw/*70.107*/(""""></script>
  			
  		 
     <script type="text/javascript" src="http://www.google.com/jsapi"></script>
	<script type="text/javascript">
	google.load('visualization', '1', """),format.raw/*75.36*/("""{"""),format.raw/*75.37*/("""packages: ['columnchart','table']"""),format.raw/*75.70*/("""}"""),format.raw/*75.71*/(""");
	</script>
     
    
    	<style>
				.panel-title"""),format.raw/*80.17*/("""{"""),format.raw/*80.18*/("""color:white"""),format.raw/*80.29*/("""}"""),format.raw/*80.30*/("""
			</style>
	

    
    </head>
     <body style="background: url("""),_display_(Seq[Any](/*86.36*/routes/*86.42*/.Assets.at("images/bg.png"))),format.raw/*86.69*/(""") #5CCAEA;">
        
        <nav class="navbar navbar-default" role="navigation" /*style="background-color:#C73B0B"*/>
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
					
		        		<div class="navbar-header">
		        			<a class="brand" href=""""),_display_(Seq[Any](/*94.38*/routes/*94.44*/.Application.index())),format.raw/*94.64*/(""""> <img src=""""),_display_(Seq[Any](/*94.78*/routes/*94.84*/.Assets.at("images/updated_srini_logo.png"))),format.raw/*94.127*/("""" style="height:70px"></a>
							<a type="button" class="btn navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
		                		<i class="icon-reorder shaded"></i>
		            		</a>
		        		</div>
						
						<div class="collapse navbar-collapse navbar-ex1-collapse">
							<ul class="nav navbar-nav">
								<li class="active"><a href=""""),_display_(Seq[Any](/*102.38*/routes/*102.44*/.Application.index())),format.raw/*102.64*/(""""><i class="icon-home icon-large" style="color:lightcoral;"></i>HOME</a></li>
								<li><a href="http://www.srini.com.au" target="_blank">ABOUT US</a></li>
                    			<li><a href="http://www.srini.com.au#srini-contactus" target="_blank">SUPPORT</a></li>
                    			<li><a href="http://www.srini.com.au#srini-contactus" target="_blank">CONTACT US</a></li>
							</ul>
							<ul class="nav navbar-nav pull-right">
						
								"""),_display_(Seq[Any](/*109.10*/if(!session.containsKey("role"))/*109.42*/ {_display_(Seq[Any](format.raw/*109.44*/("""
	                    			<li><a href=""""),_display_(Seq[Any](/*110.39*/routes/*110.45*/.Application.login())),format.raw/*110.65*/(""""><i class="icon-signin icon-large" style="color:lightcoral;"></i>Login</a></li>
	                 			""")))})),format.raw/*111.23*/("""
	                 			"""),_display_(Seq[Any](/*112.23*/if(session.containsKey("role"))/*112.54*/ {_display_(Seq[Any](format.raw/*112.56*/("""
	                 			
	                 				<li class="dropdown">
								      <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="icon-user icon-large" style="color:lightcoral;"></i>My Account<span class="caret"></span></a>
								      <ul class="dropdown-menu">
								        <li><a href=""""),_display_(Seq[Any](/*117.31*/routes/*117.37*/.Employees.myProfile(session.get("empid").toLong))),format.raw/*117.86*/("""">My Profile</a></li>
								        <li><a href="#password_modal" data-toggle="modal">Change Password</a></li>
								      </ul>
								    </li>
							    
	                     			<li><a href=""""),_display_(Seq[Any](/*122.40*/routes/*122.46*/.Application.logout())),format.raw/*122.67*/(""""><i class="icon-signout icon-large" style="color:lightcoral;"></i>Logout</a></li>
	                  			""")))})),format.raw/*123.24*/("""
							</ul>
						</div>					
					
					</div> <!-- col-sm-12 -->
		    	</div> <!-- row -->
		  	</div> <!-- container -->
		</nav>
       
       
      					"""),_display_(Seq[Any](/*133.13*/content)),format.raw/*133.20*/("""
      					
   		
   		
		<!-- retain below script tag for tab's functionality inside accordion -->
		
  		 <script src=""""),_display_(Seq[Any](/*139.20*/routes/*139.26*/.Assets.at("javascripts/index.js"))),format.raw/*139.60*/(""""></script> 
  		
  		
  		
  		<!-- Modal code for alert instead of traditional javascript alert() Msg -->
  		
				<div class="modal fade" id="myModalForJSAlertBox" role="dialog" style="background-color: rgba(0, 0, 0,0.3);">
			    	<div class="modal-dialog">
			      
				      	<div class="modal-content">
				        	<div class="modal-body" style="background-color: cadetblue;text-align:center;font-weight: bold;font-color:blue;">
				         	<h3></h3>
						  
				        	</div>
				        
				        	<div class="modal-footer" style="text-align:right;padding:5px 5px 5px;border-top:0px;margin-top:0px;">
				          		<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				        	</div>
				        </div> <!-- modal-content -->
			      
			    	</div> <!-- modal-dialog -->
			  </div> <!-- modal -->
    
   
  	  <!-- Modal end-->
  	  
  	  
  	  
  	  <!-- Password change model start -->
  	  
		<div id="password_modal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="background-color: rgb(229, 238, 255);">
			<div class="modal-dialog" style="margin-top:8%">
				<div class="modal-content">
				
					<div class="modal-header" style="padding:0px;">
						<!--   <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button> -->
						<h3 id="myModalLabel" style="text-align:center;color:blue;">Change Password</h3>
					</div>
					
					<div class="modal-body" style="  width: 100%; padding-right: 0px; padding-left: 0px;">
				 		
				 		"""),_display_(Seq[Any](/*180.9*/if( session.get("empid") != null )/*180.43*/{_display_(Seq[Any](format.raw/*180.44*/("""
				 		
				 			<form action=""""),_display_(Seq[Any](/*182.24*/routes/*182.30*/.Users.changePassword(session.get("empid").toLong))),format.raw/*182.80*/("""" method="post" id="passwordForm">
					 			<br/>
					 			<input type="password" class="form-control" name="currentPassword" id="currentPassword" placeholder="Current Password" autocomplete="off" style="width:80%; margin-left:10%" onblur="verifyCurrentPassword("""),_display_(Seq[Any](/*184.214*/session/*184.221*/.get("empid").toLong)),format.raw/*184.241*/(""")">
					 				<div class="row" style="margin-left:10%">
										<div class="col-sm-12">
											<span id="currentPasswordMatch" class="icon icon-remove" style="color:#FF0004;"></span> Current Password Verified
										</div>
									</div><br/>
								<input type="password" class="form-control" name="password1" id="password1" placeholder="New Password" autocomplete="off" style="width:80%; margin-left:10%" disabled>
									<div class="row" style="margin-left:10%">
										<div class="col-sm-6">
											<span id="8char" class="icon icon-remove" style="color:#FF0004;"></span> 8 Characters Long<br>
											<span id="ucase" class="icon icon-remove" style="color:#FF0004;"></span> One Uppercase Letter
										</div>
										<div class="col-sm-6">
											<span id="lcase" class="icon icon-remove" style="color:#FF0004;"></span> One Lowercase Letter<br>
											<span id="num" class="icon icon-remove" style="color:#FF0004;"></span> One Number
										</div>
									</div><br/>
								<input type="password" class="form-control" name="password2" id="password2" placeholder="Repeat Password" autocomplete="off" style="width:80%; margin-left:10%" disabled>
									<div class="row" style="margin-left:10%">
										<div class="col-sm-12">
											<span id="pwmatch" class="icon icon-remove" style="color:#FF0004;"></span> Passwords Match
										</div>
									</div><br/>
								
								<hr style="width:100%"/>
								<center><input type="submit" id="password_modal_sub_btn" class="btn btn-primary btn-load btn-sm" data-loading-text="Changing Password..." value="Change Password" disabled></center>
							</form>
				 		""")))})),format.raw/*211.9*/("""
				 		
					</div>
						            
				</div>
			</div>
		</div>
  	  
  	<!-- Password change model end -->
  	  
   </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.HtmlFormat.Appendable = apply(content)
    
    def f:((Html) => play.api.templates.HtmlFormat.Appendable) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:02 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/main.scala.html
                    HASH: a575cad51e811dd6c8ccbe53f044926cb605662e
                    MATRIX: 771->1|863->18|886->33|1008->144|1028->155|1255->16|1282->141|1311->352|1641->646|1656->652|1709->683|2133->1071|2148->1077|2206->1112|2293->1163|2308->1169|2375->1214|2494->1297|2509->1303|2588->1359|2679->1414|2694->1420|2768->1471|2877->1544|2892->1550|2960->1595|3066->1665|3081->1671|3139->1706|3241->1772|3256->1778|3326->1825|3691->2154|3706->2160|3763->2195|3859->2255|3874->2261|3946->2311|4079->2408|4094->2414|4171->2468|4371->2632|4386->2638|4470->2699|4559->2752|4574->2758|4656->2817|4856->2989|4885->2990|4946->3023|4975->3024|5057->3078|5086->3079|5125->3090|5154->3091|5258->3159|5273->3165|5322->3192|5640->3474|5655->3480|5697->3500|5747->3514|5762->3520|5828->3563|6241->3939|6257->3945|6300->3965|6793->4421|6835->4453|6876->4455|6952->4494|6968->4500|7011->4520|7147->4623|7207->4646|7248->4677|7289->4679|7641->4994|7657->5000|7729->5049|7968->5251|7984->5257|8028->5278|8167->5384|8368->5548|8398->5555|8558->5678|8574->5684|8631->5718|10249->7300|10293->7334|10333->7335|10402->7367|10418->7373|10491->7423|10792->7686|10810->7693|10854->7713|12556->9383
                    LINES: 26->1|28->2|28->2|35->11|35->11|47->1|48->9|50->22|61->33|61->33|61->33|70->42|70->42|70->42|72->44|72->44|72->44|74->46|74->46|74->46|76->48|76->48|76->48|78->50|78->50|78->50|80->52|80->52|80->52|81->53|81->53|81->53|90->62|90->62|90->62|93->65|93->65|93->65|94->66|94->66|94->66|97->69|97->69|97->69|98->70|98->70|98->70|103->75|103->75|103->75|103->75|108->80|108->80|108->80|108->80|114->86|114->86|114->86|122->94|122->94|122->94|122->94|122->94|122->94|130->102|130->102|130->102|137->109|137->109|137->109|138->110|138->110|138->110|139->111|140->112|140->112|140->112|145->117|145->117|145->117|150->122|150->122|150->122|151->123|161->133|161->133|167->139|167->139|167->139|208->180|208->180|208->180|210->182|210->182|210->182|212->184|212->184|212->184|239->211
                    -- GENERATED --
                */
            