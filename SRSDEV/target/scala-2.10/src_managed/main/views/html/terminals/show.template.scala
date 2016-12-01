
package views.html.terminals

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
object show extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Form[Shift],Store,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*2.2*/( shiftForm: Form[Shift], store: Store ):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*2.42*/("""
 """),format.raw/*4.1*/(""" """),_display_(Seq[Any](/*5.2*/main/*5.6*/{_display_(Seq[Any](format.raw/*5.7*/("""



""")))})),format.raw/*9.2*/("""
"""))}
    }
    
    def render(shiftForm:Form[Shift],store:Store): play.api.templates.HtmlFormat.Appendable = apply(shiftForm,store)
    
    def f:((Form[Shift],Store) => play.api.templates.HtmlFormat.Appendable) = (shiftForm,store) => apply(shiftForm,store)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 29 10:05:11 IST 2016
                    SOURCE: D:/SRS PROJECT IN WINDOWS/SRSDEV/app/views/terminals/show.scala.html
                    HASH: aa429bd005804d3573ecbaf0fed43d56192f3878
                    MATRIX: 794->3|981->43|1010->65|1046->102|1057->106|1094->107|1133->116
                    LINES: 26->2|32->2|33->4|33->5|33->5|33->5|37->9
                    -- GENERATED --
                */
            