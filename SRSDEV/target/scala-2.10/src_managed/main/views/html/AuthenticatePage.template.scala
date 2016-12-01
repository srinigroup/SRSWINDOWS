
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
object AuthenticatePage extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<html>
<head>
<head>
<body style="background-color:#fff;">
        <div class="wrapper">
            <div class="container" >
			    <div class="row">
                   <div class="span12">
        		</div>
                     	<br><br>
                     	<h5 style="color: red;font-size: 28px;text-align: center;margin-top:10%;">
                     	<img src=""""),_display_(Seq[Any](/*12.34*/routes/*12.40*/.Assets.at("images/tabImages/authentication.jpg"))),format.raw/*12.89*/("""" class="img-responsive center-block" alt="Image">
                     	<br/>
                     	<div>You're not authorised user, you must <p style="color:green;">logged in!</p></div></h5>
            
       				</div> <!-- span 12 -->
       			</div> <!-- row -->
      		</div> <!-- container -->
 		</div> <!-- wrapper -->
</body>
</head>
</html>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 14:37:26 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/AuthenticatePage.scala.html
                    HASH: 7c89783157a77411c6f9b8c053c172b820b3379e
                    MATRIX: 866->0|1282->380|1297->386|1368->435
                    LINES: 29->1|40->12|40->12|40->12
                    -- GENERATED --
                */
            