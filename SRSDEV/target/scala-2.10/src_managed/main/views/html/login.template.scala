
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(loginForm: Form[Application.Login]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.38*/("""

 """),format.raw/*4.1*/(""" """),format.raw/*5.1*/("""

<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Srini Group</title>
        
   		 <script type="text/javascript" src='"""),_display_(Seq[Any](/*13.44*/routes/*13.50*/.Application.javascriptRoutes())),format.raw/*13.81*/("""'></script>
   		 
   		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
   		
   		<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
   		
	    <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script> 
   		 
   		
   		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*22.67*/routes/*22.73*/.Assets.at("stylesheets/theme.css"))),format.raw/*22.108*/("""">
       	
       	 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*24.40*/routes/*24.46*/.Assets.at("bootstrap/css/bootstrap.min.css"))),format.raw/*24.91*/(""""> 
       	
         <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*26.71*/routes/*26.77*/.Assets.at("bootstrap/css/bootstrap-responsive.min.css"))),format.raw/*26.133*/(""""> 
        
       <!-- <link rel="stylesheet" href=""""),_display_(Seq[Any](/*28.43*/routes/*28.49*/.Assets.at("bootstrap/css/bootstrap-theme.min.css"))),format.raw/*28.100*/(""""> -->
 
		 <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*30.65*/routes/*30.71*/.Assets.at("stylesheets/style_accordian.css"))),format.raw/*30.116*/(""""> 
		
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*32.64*/routes/*32.70*/.Assets.at("stylesheets/style.css"))),format.raw/*32.105*/("""">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*33.64*/routes/*33.70*/.Assets.at("images/icons/css/font-awesome.css"))),format.raw/*33.117*/("""">
		
       
        <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600'
            rel='stylesheet'>
			
		
		<link href="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/themes/ui-darkness/jquery-ui.min.css" rel="stylesheet">
  	
   		<script type="text/javascript" src=""""),_display_(Seq[Any](/*42.43*/routes/*42.49*/.Assets.at("javascripts/common.js"))),format.raw/*42.84*/(""""></script>
   		
   		
   		 <link rel="stylesheet" href=""""),_display_(Seq[Any](/*45.37*/routes/*45.43*/.Assets.at("fancybox/jquery.fancybox.css?v=2.1.5"))),format.raw/*45.93*/("""" type="text/css" media="screen" /> <!-- Fancybox css -->
		<script type="text/javascript" src=""""),_display_(Seq[Any](/*46.40*/routes/*46.46*/.Assets.at("fancybox/jquery.fancybox.pack.js?v=2.1.5"))),format.raw/*46.100*/(""""></script> <!-- Fancybox js, need jquery advanced -->
  	
  		<!-- To convert Table to Excel download in Reports page -->
  		<script type="text/javascript" src=""""),_display_(Seq[Any](/*49.42*/routes/*49.48*/.Assets.at("javascripts/tableToExcelExport/jquery.base64.js"))),format.raw/*49.109*/(""""></script>
  		<script type="text/javascript" src=""""),_display_(Seq[Any](/*50.42*/routes/*50.48*/.Assets.at("javascripts/tableToExcelExport/tableExport.js"))),format.raw/*50.107*/(""""></script>
  			
  		 
     <script type="text/javascript" src="http://www.google.com/jsapi"></script>
	<script type="text/javascript">
	google.load('visualization', '1', """),format.raw/*55.36*/("""{"""),format.raw/*55.37*/("""packages: ['columnchart','table']"""),format.raw/*55.70*/("""}"""),format.raw/*55.71*/(""");
	</script>
     
    
    	<style>
				.panel-title"""),format.raw/*60.17*/("""{"""),format.raw/*60.18*/("""color:white"""),format.raw/*60.29*/("""}"""),format.raw/*60.30*/("""
			</style>
	

    
    </head>
    
    <nav class="navbar navbar-default" role="navigation" /*style="background-color:#C73B0B"*/>
			<div class="container">
				<div class="row">
					<div class="col-sm-12">
					
		        		<div class="navbar-header">
		        			<a class="brand" href=""""),_display_(Seq[Any](/*73.38*/routes/*73.44*/.Application.index())),format.raw/*73.64*/(""""> <img src=""""),_display_(Seq[Any](/*73.78*/routes/*73.84*/.Assets.at("images/updated_srini_logo.png"))),format.raw/*73.127*/("""" style="height:70px"></a>
							<a type="button" class="btn navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
		                		<i class="icon-reorder shaded"></i>
		            		</a>
		        		</div>
						
						<div class="collapse navbar-collapse navbar-ex1-collapse">
							<ul class="nav navbar-nav">
								<li class="active"><a href=""""),_display_(Seq[Any](/*81.38*/routes/*81.44*/.Application.index())),format.raw/*81.64*/(""""><i class="icon-home icon-large" style="color:lightcoral;"></i>HOME</a></li>
								<li><a href="http://www.srini.com.au" target="_blank">ABOUT US</a></li>
                    			<li><a href="http://www.srini.com.au#srini-contactus" target="_blank">SUPPORT</a></li>
                    			<li><a href="http://www.srini.com.au#srini-contactus" target="_blank">CONTACT US</a></li>
							</ul>
							<ul class="nav navbar-nav pull-right">
						
								"""),_display_(Seq[Any](/*88.10*/if(!session.containsKey("role"))/*88.42*/ {_display_(Seq[Any](format.raw/*88.44*/("""
	                    			<li><a href=""""),_display_(Seq[Any](/*89.39*/routes/*89.45*/.Application.login())),format.raw/*89.65*/(""""><i class="icon-signin icon-large" style="color:lightcoral;"></i>Login</a></li>
	                 			""")))})),format.raw/*90.23*/("""
	                 			"""),_display_(Seq[Any](/*91.23*/if(session.containsKey("role"))/*91.54*/ {_display_(Seq[Any](format.raw/*91.56*/("""
	                 			
	                 				<li class="dropdown">
								      <a class="dropdown-toggle" data-toggle="dropdown" href="#"><i class="icon-user icon-large" style="color:lightcoral;"></i>My Account<span class="caret"></span></a>
								      <ul class="dropdown-menu">
								        <li><a href=""""),_display_(Seq[Any](/*96.31*/routes/*96.37*/.Employees.myProfile(session.get("empid").toLong))),format.raw/*96.86*/("""">My Profile</a></li>
								        <li><a href="#password_modal" data-toggle="modal">Change Password</a></li>
								      </ul>
								    </li>
							    
	                     			<li><a href=""""),_display_(Seq[Any](/*101.40*/routes/*101.46*/.Application.logout())),format.raw/*101.67*/(""""><i class="icon-signout icon-large" style="color:lightcoral;"></i>Logout</a></li>
	                  			""")))})),format.raw/*102.24*/("""
							</ul>
						</div>					
					
					</div> <!-- col-sm-12 -->
		    	</div> <!-- row -->
		  	</div> <!-- container -->
		</nav>
       
     <body style="background: url("""),_display_(Seq[Any](/*111.36*/routes/*111.42*/.Assets.at("images/loginpage.png"))),format.raw/*111.76*/(""") #5CCAEA;">

	<div class="wrapper1" style="height:100%;">
     	<div class="container">
     		<div class="row">
            	<div class="span8">
            	<div class="col-md-10 col-md-offset-4">
			  	 <div class="panel panel-default" style="margin-top:30px;">
               				 <div class="panel-heading" style="background-color:cadetblue;"> <strong class="">
               				 <h2 style="color:#fff;">Login<i class="icon-user" style="color:#fff;margin-left: 80%;font-size:48px;"></i></h2>
               				 </strong>
               			 </div>
			     
			          """),_display_(Seq[Any](/*124.15*/if(loginForm.hasGlobalErrors)/*124.44*/ {_display_(Seq[Any](format.raw/*124.46*/(""" 
			                <p class="error" style="color:red;font-size:16px;">
			                    """),_display_(Seq[Any](/*126.25*/loginForm/*126.34*/.globalError.message)),format.raw/*126.54*/("""
			                </p>
			            """)))})),format.raw/*128.17*/("""
			            
			            """),_display_(Seq[Any](/*130.17*/if(flash.contains("success"))/*130.46*/ {_display_(Seq[Any](format.raw/*130.48*/("""
			                <p class="success" style="color:#5f58c3;font-size:16px;">
			                    """),_display_(Seq[Any](/*132.25*/flash/*132.30*/.get("success"))),format.raw/*132.45*/("""
			                </p>
			            """)))})),format.raw/*134.17*/("""
			           """),_display_(Seq[Any](/*135.16*/if(flash.containsKey("employeeStatus"))/*135.55*/ {_display_(Seq[Any](format.raw/*135.57*/("""
					        <div class="alert alert-danger">
					            <strong>Error! </strong> """),_display_(Seq[Any](/*137.44*/flash/*137.49*/.get("employeeStatus"))),format.raw/*137.71*/("""
					        </div>
					    """)))})),format.raw/*139.11*/("""
					    """),_display_(Seq[Any](/*140.11*/if(flash.containsKey("changePasswordFailure"))/*140.57*/ {_display_(Seq[Any](format.raw/*140.59*/("""
					        <div class="alert alert-danger">
					            <strong>Error! </strong> """),_display_(Seq[Any](/*142.44*/flash/*142.49*/.get("changePasswordFailure"))),format.raw/*142.78*/("""
					        </div>
					    """)))})),format.raw/*144.11*/("""
					    """),_display_(Seq[Any](/*145.11*/if(flash.containsKey("changePasswordSuccess"))/*145.57*/ {_display_(Seq[Any](format.raw/*145.59*/("""
					        <div class="alert alert-success">
					            <strong>Success! </strong> """),_display_(Seq[Any](/*147.46*/flash/*147.51*/.get("changePasswordSuccess"))),format.raw/*147.80*/("""
					        </div>
					    """)))})),format.raw/*149.11*/("""  
						
						<div class="panel-body" style="background-color:rgba(237, 255, 220, 0.56);">
						
						"""),_display_(Seq[Any](/*153.8*/helper/*153.14*/.form(routes.Application.authenticate)/*153.52*/ {_display_(Seq[Any](format.raw/*153.54*/("""    
  						<hr>
							<div class="form-group">
								<div class="form-group has-success has-feedback">
								
					      		<label for="email" style="font-size: 14px;">Username :</label>
					      		<input type="email" class="form-control" name="email" id="email" placeholder="Enter email">
					      		<span class="icon icon-envelope form-control-feedback" style="font-size: 22px;"></span>
					      		<p id="emailError" style="display:none;color:red;">Please enter your username</p>
					      		</div>
					    	</div>
			    	
					    	<div class="form-group">
					    		<div class="form-group has-success has-feedback">
					      		<label for="password" style="font-size: 14px;">Password :</label>
					      		<input type="password" class="form-control" name="password" id="password" placeholder="Enter password">
					      		<span class="icon icon-lock form-control-feedback"" style="font-size: 26px;"></span>
					      		<p id="passwordError" style="display:none;color:red;">Please enter password</p>
					      		</div>
					    	</div>
			    
			   				<center>	<input type="submit" class="btn btn-success btn-large" value="sign in" onclick="return loginValidate()"> </center>
			 
						""")))})),format.raw/*176.8*/("""
						</div>
					</div>
				</div>
				</div> <!-- span12 -->
			 </div> 	<!-- row -->
		</div>	<!-- container -->
	</div>	<!-- wrapper -->
</body>
</html>
"""))}
    }
    
    def render(loginForm:Form[Application.Login]): play.api.templates.HtmlFormat.Appendable = apply(loginForm)
    
    def f:((Form[Application.Login]) => play.api.templates.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:01 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/login.scala.html
                    HASH: 85b06cfd3b887c4a0753b86b0796f222325a11d6
                    MATRIX: 791->1|974->37|1005->61|1032->97|1341->370|1356->376|1409->407|1843->805|1858->811|1916->846|2005->899|2020->905|2087->950|2208->1035|2223->1041|2302->1097|2395->1154|2410->1160|2484->1211|2595->1286|2610->1292|2678->1337|2786->1409|2801->1415|2859->1450|2962->1517|2977->1523|3047->1570|3421->1908|3436->1914|3493->1949|3592->2012|3607->2018|3679->2068|3813->2166|3828->2172|3905->2226|4108->2393|4123->2399|4207->2460|4297->2514|4312->2520|4394->2579|4599->2756|4628->2757|4689->2790|4718->2791|4805->2850|4834->2851|4873->2862|4902->2863|5245->3170|5260->3176|5302->3196|5352->3210|5367->3216|5433->3259|5853->3643|5868->3649|5910->3669|6409->4132|6450->4164|6490->4166|6566->4206|6581->4212|6623->4232|6759->4336|6819->4360|6859->4391|6899->4393|7255->4713|7270->4719|7341->4768|7585->4975|7601->4981|7645->5002|7785->5109|8010->5297|8026->5303|8083->5337|8712->5929|8751->5958|8792->5960|8928->6059|8947->6068|8990->6088|9066->6131|9138->6166|9177->6195|9218->6197|9359->6301|9374->6306|9412->6321|9488->6364|9542->6381|9591->6420|9632->6422|9761->6514|9776->6519|9821->6541|9887->6574|9936->6586|9992->6632|10033->6634|10162->6726|10177->6731|10229->6760|10295->6793|10344->6805|10400->6851|10441->6853|10573->6948|10588->6953|10640->6982|10706->7015|10853->7126|10869->7132|10917->7170|10958->7172|12227->8409
                    LINES: 26->1|32->1|34->4|34->5|42->13|42->13|42->13|51->22|51->22|51->22|53->24|53->24|53->24|55->26|55->26|55->26|57->28|57->28|57->28|59->30|59->30|59->30|61->32|61->32|61->32|62->33|62->33|62->33|71->42|71->42|71->42|74->45|74->45|74->45|75->46|75->46|75->46|78->49|78->49|78->49|79->50|79->50|79->50|84->55|84->55|84->55|84->55|89->60|89->60|89->60|89->60|102->73|102->73|102->73|102->73|102->73|102->73|110->81|110->81|110->81|117->88|117->88|117->88|118->89|118->89|118->89|119->90|120->91|120->91|120->91|125->96|125->96|125->96|130->101|130->101|130->101|131->102|140->111|140->111|140->111|153->124|153->124|153->124|155->126|155->126|155->126|157->128|159->130|159->130|159->130|161->132|161->132|161->132|163->134|164->135|164->135|164->135|166->137|166->137|166->137|168->139|169->140|169->140|169->140|171->142|171->142|171->142|173->144|174->145|174->145|174->145|176->147|176->147|176->147|178->149|182->153|182->153|182->153|182->153|205->176
                    -- GENERATED --
                */
            