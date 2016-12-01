// @SOURCE:D:/SRS PROJECT IN WINDOWS/SRSDEV/conf/routes
// @HASH:458e8eaf1eca6012eaa1ec72cfca5cd7eae99af6
// @DATE:Tue Nov 29 14:37:20 IST 2016


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_showOptions1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showOptions/"),DynamicPart("page", """[^/]+""",true),StaticPart("/"),DynamicPart("action", """[^/]+""",true))))
        

// @LINE:14
private[this] lazy val controllers_Application_login2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:15
private[this] lazy val controllers_Application_authenticate3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:16
private[this] lazy val controllers_Application_logout4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:25
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:27
private[this] lazy val controllers_Application_checkUrl6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("file/checkUrl"))))
        

// @LINE:31
private[this] lazy val controllers_Users_list7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"))))
        

// @LINE:33
private[this] lazy val controllers_Users_showBlank8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/new"))))
        

// @LINE:34
private[this] lazy val controllers_Users_update9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:35
private[this] lazy val controllers_Users_edit10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:36
private[this] lazy val controllers_Users_delete11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:38
private[this] lazy val controllers_Users_register12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/"))))
        

// @LINE:39
private[this] lazy val controllers_Users_changePassword13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/changePassword/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:40
private[this] lazy val controllers_Application_verifyCurrentPassword14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/verfiyPassword/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:44
private[this] lazy val controllers_Products_showBlank15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/new"))))
        

// @LINE:45
private[this] lazy val controllers_Products_edit16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:46
private[this] lazy val controllers_Products_update17 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:47
private[this] lazy val controllers_Products_delete18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:50
private[this] lazy val controllers_Products_list19 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"))))
        

// @LINE:53
private[this] lazy val controllers_Products_save20 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products/"))))
        

// @LINE:57
private[this] lazy val controllers_Companies_list21 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companies/"))))
        

// @LINE:59
private[this] lazy val controllers_Companies_showBlank22 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companies/new"))))
        

// @LINE:60
private[this] lazy val controllers_Companies_update23 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companies/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:61
private[this] lazy val controllers_Companies_edit24 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companies/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:62
private[this] lazy val controllers_Companies_delete25 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companies/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:64
private[this] lazy val controllers_Companies_save26 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("companies/"))))
        

// @LINE:67
private[this] lazy val controllers_Employees_list27 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"))))
        

// @LINE:68
private[this] lazy val controllers_Employees_listForFilterByStore28 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/byStore"))))
        

// @LINE:71
private[this] lazy val controllers_Employees_showBlank29 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/new"))))
        

// @LINE:72
private[this] lazy val controllers_Employees_update30 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:73
private[this] lazy val controllers_Employees_edit31 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:74
private[this] lazy val controllers_Employees_delete32 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:75
private[this] lazy val controllers_Employees_myProfile33 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"),DynamicPart("id", """[^/]+""",true),StaticPart("/myProfile"))))
        

// @LINE:77
private[this] lazy val controllers_Employees_save34 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"))))
        

// @LINE:81
private[this] lazy val controllers_Stores_list35 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stores/"))))
        

// @LINE:82
private[this] lazy val controllers_Stores_showBlank36 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stores/new"))))
        

// @LINE:83
private[this] lazy val controllers_Stores_update37 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stores/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:84
private[this] lazy val controllers_Stores_edit38 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stores/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:85
private[this] lazy val controllers_Stores_delete39 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("stores/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:86
private[this] lazy val controllers_Stores_save40 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("Stores/"))))
        

// @LINE:90
private[this] lazy val controllers_Suppliers_list41 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/"))))
        

// @LINE:91
private[this] lazy val controllers_Suppliers_showBlank42 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/new"))))
        

// @LINE:92
private[this] lazy val controllers_Suppliers_update43 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:93
private[this] lazy val controllers_Suppliers_edit44 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:94
private[this] lazy val controllers_Suppliers_delete45 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:95
private[this] lazy val controllers_Suppliers_save46 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/"))))
        

// @LINE:96
private[this] lazy val controllers_Suppliers_getSuppliers47 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/getSuppliers/"),DynamicPart("search", """[^/]+""",true))))
        

// @LINE:97
private[this] lazy val controllers_Application_getSupplierMapping48 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/getSupplierMappings/"),DynamicPart("storeId", """[^/]+""",true),StaticPart("/"),DynamicPart("suppid", """[^/]+""",true))))
        

// @LINE:98
private[this] lazy val controllers_Application_deleteSupplierMapping49 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("suppliers/deleteSupplierMappings/"),DynamicPart("suppMappingId", """[^/]+""",true))))
        

// @LINE:101
private[this] lazy val controllers_Application_getPayout50 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("payouts/getPayout/"),DynamicPart("paytype", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("supid", """[^/]+""",true))))
        

// @LINE:102
private[this] lazy val controllers_Application_deletePayout51 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("payouts/deletePayout/"),DynamicPart("pid", """[^/]+""",true))))
        

// @LINE:106
private[this] lazy val controllers_Application_addPayroll52 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("payrolls/addPayroll/"),DynamicPart("empId", """[^/]+""",true),StaticPart("/"),DynamicPart("weekDate", """[^/]+""",true),StaticPart("/"),DynamicPart("drId", """[^/]+""",true))))
        

// @LINE:107
private[this] lazy val controllers_Application_deletePayroll53 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("payrolls/deletePayroll/"),DynamicPart("pid", """[^/]+""",true))))
        

// @LINE:109
private[this] lazy val controllers_Application_javascriptRoutes54 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("javascriptRoutes"))))
        

// @LINE:112
private[this] lazy val controllers_SalesHeads_list55 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("salesheads/"))))
        

// @LINE:113
private[this] lazy val controllers_SalesHeads_showBlank56 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("salesheads/new"))))
        

// @LINE:114
private[this] lazy val controllers_SalesHeads_update57 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("salesheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:115
private[this] lazy val controllers_SalesHeads_edit58 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("salesheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:116
private[this] lazy val controllers_SalesHeads_delete59 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("salesheads/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:117
private[this] lazy val controllers_SalesHeads_save60 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("salesheads/"))))
        

// @LINE:122
private[this] lazy val controllers_TerminalHeads_list61 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminalheads/"))))
        

// @LINE:124
private[this] lazy val controllers_TerminalHeads_showBlank62 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminalheads/new"))))
        

// @LINE:125
private[this] lazy val controllers_TerminalHeads_update63 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminalheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:126
private[this] lazy val controllers_TerminalHeads_edit64 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminalheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:127
private[this] lazy val controllers_TerminalHeads_delete65 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminalheads/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:128
private[this] lazy val controllers_TerminalHeads_save66 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminalheads/"))))
        

// @LINE:134
private[this] lazy val controllers_TotalSalesHeads_list67 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("totalsalesheads/"))))
        

// @LINE:135
private[this] lazy val controllers_TotalSalesHeads_showBlank68 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("totalsalesheads/new"))))
        

// @LINE:136
private[this] lazy val controllers_TotalSalesHeads_update69 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("totalsalesheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:137
private[this] lazy val controllers_TotalSalesHeads_edit70 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("totalsalesheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:138
private[this] lazy val controllers_TotalSalesHeads_delete71 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("totalsalesheads/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:139
private[this] lazy val controllers_TotalSalesHeads_save72 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("totalsalesheads/"))))
        

// @LINE:144
private[this] lazy val controllers_ExpenseHeads_list73 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("expenseheads/"))))
        

// @LINE:145
private[this] lazy val controllers_ExpenseHeads_showBlank74 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("expenseheads/new"))))
        

// @LINE:146
private[this] lazy val controllers_ExpenseHeads_update75 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("expenseheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:147
private[this] lazy val controllers_ExpenseHeads_edit76 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("expenseheads/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:148
private[this] lazy val controllers_ExpenseHeads_delete77 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("expenseheads/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:149
private[this] lazy val controllers_ExpenseHeads_save78 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("expenseheads/"))))
        

// @LINE:155
private[this] lazy val controllers_MediaTenders_list79 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mediatenders/"))))
        

// @LINE:156
private[this] lazy val controllers_MediaTenders_showBlank80 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mediatenders/new"))))
        

// @LINE:157
private[this] lazy val controllers_MediaTenders_update81 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mediatenders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:158
private[this] lazy val controllers_MediaTenders_edit82 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mediatenders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:159
private[this] lazy val controllers_MediaTenders_delete83 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mediatenders/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:160
private[this] lazy val controllers_MediaTenders_save84 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("mediatenders/"))))
        

// @LINE:165
private[this] lazy val controllers_PaymentTenders_list85 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paymentTenders/"))))
        

// @LINE:167
private[this] lazy val controllers_PaymentTenders_showBlank86 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paymentTenders/new"))))
        

// @LINE:168
private[this] lazy val controllers_PaymentTenders_update87 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paymentTenders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:169
private[this] lazy val controllers_PaymentTenders_edit88 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paymentTenders/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:170
private[this] lazy val controllers_PaymentTenders_delete89 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paymentTenders/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:171
private[this] lazy val controllers_PaymentTenders_save90 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("paymentTenders/"))))
        

// @LINE:176
private[this] lazy val controllers_DailySalesReconciliations_list91 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dsrs/"))))
        

// @LINE:177
private[this] lazy val controllers_DailySalesReconciliations_showBlank92 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dsrs/new/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:178
private[this] lazy val controllers_DailySalesReconciliations_update93 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dsrs/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:179
private[this] lazy val controllers_DailySalesReconciliations_edit94 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dsrs/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:180
private[this] lazy val controllers_DailySalesReconciliations_delete95 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dsrs/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:182
private[this] lazy val controllers_DailySalesReconciliations_save96 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dsrs/"),DynamicPart("id", """[^/]+""",true),StaticPart("/save"))))
        

// @LINE:186
private[this] lazy val controllers_DailyReconciliations_list97 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/"))))
        

// @LINE:187
private[this] lazy val controllers_DailyReconciliations_listByDate98 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/listByDate"))))
        

// @LINE:188
private[this] lazy val controllers_DailyReconciliations_showBlank99 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/new/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:189
private[this] lazy val controllers_DailyReconciliations_update100 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:190
private[this] lazy val controllers_DailyReconciliations_edit101 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:191
private[this] lazy val controllers_DailyReconciliations_delete102 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:193
private[this] lazy val controllers_DailyReconciliations_save103 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/"),DynamicPart("id", """[^/]+""",true),StaticPart("/save"))))
        

// @LINE:194
private[this] lazy val controllers_DailyReconciliations_summary104 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drs/summary/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("weekDate", """[^/]+""",true))))
        

// @LINE:195
private[this] lazy val controllers_DailyReconciliations_drViewOptions105 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("drsdrViewOptions/"),DynamicPart("action", """[^/]+""",true))))
        

// @LINE:201
private[this] lazy val controllers_Terminals_update106 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminals/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:203
private[this] lazy val controllers_Terminals_delete107 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminals/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:204
private[this] lazy val controllers_Terminals_save108 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminals/"))))
        

// @LINE:205
private[this] lazy val controllers_Terminals_summary109 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("terminals/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("thead", """[^/]+""",true))))
        

// @LINE:210
private[this] lazy val controllers_Shifts_list110 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/"))))
        

// @LINE:211
private[this] lazy val controllers_Shifts_showBlank111 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/new/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("action", """[^/]+""",true))))
        

// @LINE:212
private[this] lazy val controllers_Shifts_update112 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/edit/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("action", """[^/]+""",true))))
        

// @LINE:213
private[this] lazy val controllers_Shifts_edit113 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:214
private[this] lazy val controllers_Shifts_delete114 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:215
private[this] lazy val controllers_Shifts_save115 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("action", """[^/]+""",true))))
        

// @LINE:216
private[this] lazy val controllers_Shifts_submit116 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:218
private[this] lazy val controllers_Shifts_storeSuppliersList117 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("shifts/storeSuppliers"))))
        

// @LINE:223
private[this] lazy val controllers_Timesheets_list118 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheets/"))))
        

// @LINE:224
private[this] lazy val controllers_Timesheets_showBlank119 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheets/new/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:225
private[this] lazy val controllers_Timesheets_save120 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheets/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:226
private[this] lazy val controllers_Timesheets_edit121 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheets/"),DynamicPart("tid", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:227
private[this] lazy val controllers_Timesheets_update122 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheets/edit/"),DynamicPart("tid", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:228
private[this] lazy val controllers_Timesheets_delete123 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheets/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:232
private[this] lazy val controllers_Timesheets_listForsk124 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForsk/"))))
        

// @LINE:233
private[this] lazy val controllers_Timesheets_showBlankForsk125 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForsk/new/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:234
private[this] lazy val controllers_Timesheets_saveForsk126 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForsk/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:235
private[this] lazy val controllers_Timesheets_editForsk127 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForsk/"),DynamicPart("tid", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:236
private[this] lazy val controllers_Timesheets_updateForsk128 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForsk/edit/"),DynamicPart("tid", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:238
private[this] lazy val controllers_Timesheets_showSelectPage129 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetProcessing/showSelectPage"))))
        

// @LINE:239
private[this] lazy val controllers_Timesheets_getTimesheets130 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetProcessing/timesheetList"))))
        

// @LINE:240
private[this] lazy val controllers_Timesheets_showSelectPageForSK131 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetProcessing/showSelectPageForSK/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:245
private[this] lazy val controllers_Timesheets_showBlankForHeadOffice132 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/headOfficeNew/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:246
private[this] lazy val controllers_Application_getTimeSheetSave133 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/saveTimeSheetHours/"),DynamicPart("empId", """[^/]+""",true))))
        

// @LINE:247
private[this] lazy val controllers_Timesheets_saveForHeadOfficeTimeSheet134 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true))))
        

// @LINE:248
private[this] lazy val controllers_Timesheets_listForHeadOffice135 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/"))))
        

// @LINE:249
private[this] lazy val controllers_Timesheets_editFormForHeadOffice136 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/"),DynamicPart("tid", """[^/]+""",true),StaticPart("/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:250
private[this] lazy val controllers_Timesheets_showSelectPageForHeadOfficeTimeSheet137 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/showSelectPageForHeadOfficeTimeSheet/"))))
        

// @LINE:251
private[this] lazy val controllers_Timesheets_getAllHeadOfficeTimesheetsToVerify138 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/listForApproval/"))))
        

// @LINE:252
private[this] lazy val controllers_Timesheets_getHeadOfficeTimesheets139 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetProcessing/headOfficeTimesheetList/"))))
        

// @LINE:253
private[this] lazy val controllers_Timesheets_showSelectPageForVerify140 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/showSelectPageForHOTVerification"))))
        

// @LINE:254
private[this] lazy val controllers_Timesheets_getHeadOfficeTimesheetsForVerify141 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/listForVerify/"))))
        

// @LINE:255
private[this] lazy val controllers_Timesheets_updateWeeklyHOTimesheetsByWeekDate142 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateStatusToApproved"))))
        

// @LINE:256
private[this] lazy val controllers_Timesheets_editFormForHeadOfficeRejectedTimesheetList143 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetsForHeadOffice/RejectedTimesheetEdit/"),DynamicPart("timesheetId", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true),StaticPart("/"),DynamicPart("storeId", """[^/]+""",true),StaticPart("/"),DynamicPart("pageAction", """[^/]+""",true))))
        

// @LINE:257
private[this] lazy val controllers_Timesheets_updateEditListForRejectedTS144 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("timesheetUpdated/"))))
        

// @LINE:258
private[this] lazy val controllers_Timesheets_verifyHOTimesheet145 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("verifyHOTimesheet/"))))
        

// @LINE:259
private[this] lazy val controllers_Timesheets_updateRejectedStatusForHOTimesheets146 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateRejectedHOTimesheets/"))))
        

// @LINE:264
private[this] lazy val controllers_Reports_getReportHome147 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/"))))
        

// @LINE:265
private[this] lazy val controllers_Reports_getReportHomeForStore148 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/Store"))))
        

// @LINE:266
private[this] lazy val controllers_Reports_getReport149 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reports/getReport/"))))
        

// @LINE:271
private[this] lazy val controllers_AccountHolders_list150 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accountHolder/list"))))
        

// @LINE:273
private[this] lazy val controllers_AccountHolders_showBlank151 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accountHolder/new"))))
        

// @LINE:274
private[this] lazy val controllers_AccountHolders_save152 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accountHolder/"))))
        

// @LINE:275
private[this] lazy val controllers_AccountHolders_edit153 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accountHolder/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:276
private[this] lazy val controllers_AccountHolders_update154 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accountHolder/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:277
private[this] lazy val controllers_AccountHolders_delete155 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("accountHolder/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
        

// @LINE:279
private[this] lazy val controllers_Application_javascriptRoutes156 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("javascriptRoutes"))))
        

// @LINE:283
private[this] lazy val controllers_InvoiceInventory_showUploadPage157 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/"))))
        

// @LINE:284
private[this] lazy val controllers_InvoiceInventory_showPaymentPage158 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/showPaymentPage/"),DynamicPart("selectedCompany", """[^/]+""",true),StaticPart("/"),DynamicPart("selectedStore", """[^/]+""",true),StaticPart("/"),DynamicPart("selectedCategory", """[^/]+""",true),StaticPart("/"),DynamicPart("selectedPaymentTerm", """[^/]+""",true))))
        

// @LINE:285
private[this] lazy val controllers_InvoiceInventory_showUploadPageForHeadOffice159 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/HeadOfficeUpload"))))
        

// @LINE:286
private[this] lazy val controllers_InvoiceInventory_showDownloadPage160 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/download"))))
        

// @LINE:287
private[this] lazy val controllers_InvoiceInventory_uploadInvoices161 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/upload/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:288
private[this] lazy val controllers_InvoiceInventory_uploadInvoicesByHeadOffice162 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/uploadByHeadOffice"))))
        

// @LINE:289
private[this] lazy val controllers_InvoiceInventory_getInvoices163 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/download/list"))))
        

// @LINE:290
private[this] lazy val controllers_InvoiceInventory_getInvoicesAfterMove164 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/download/list/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("type", """[^/]+""",true))))
        

// @LINE:291
private[this] lazy val controllers_InvoiceInventory_getInvoicesAfterPaymentDone165 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/list/invoicesAfterPayment/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("paymentTerms", """[^/]+""",true),StaticPart("/"),DynamicPart("companyId", """[^/]+""",true),StaticPart("/"),DynamicPart("filter", """[^/]+""",true),StaticPart("/"),DynamicPart("selectedCategory", """[^/]+""",true))))
        

// @LINE:292
private[this] lazy val controllers_InvoiceInventory_move166 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/list/move/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:293
private[this] lazy val controllers_InvoiceInventory_headOfficeMove167 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/headOfficeList/headOfficeMove/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:294
private[this] lazy val controllers_InvoiceInventory_paymentMove168 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/paymentList/paymentMove/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("paymentTerms", """[^/]+""",true),StaticPart("/"),DynamicPart("companyId", """[^/]+""",true),StaticPart("/"),DynamicPart("selectedCategory", """[^/]+""",true),StaticPart("/"),DynamicPart("filter", """[^/]+""",true))))
        

// @LINE:295
private[this] lazy val controllers_InvoiceInventory_delete169 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/delete/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:296
private[this] lazy val controllers_InvoiceInventory_getInvoicesByStoreAndType170 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/invoiceListjustView/"),DynamicPart("id", """[^/]+""",true),StaticPart("/"),DynamicPart("type", """[^/]+""",true))))
        

// @LINE:297
private[this] lazy val controllers_InvoiceInventory_getInvoicesForPayment171 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/getInvoicesForPayment/list"))))
        

// @LINE:298
private[this] lazy val controllers_InvoiceInventory_displayUploadedForSK172 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/displayUploaded/list/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:299
private[this] lazy val controllers_InvoiceInventory_dateSelectPageForSK173 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/dateSelectPageForSK/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:300
private[this] lazy val controllers_InvoiceInventory_dateSelectPageForHeadOffice174 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/dateSelectPageForHeadOffice"))))
        

// @LINE:301
private[this] lazy val controllers_InvoiceInventory_displayUploadedForHeadOffice175 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/displayUploadedForHeadOffice/list/"))))
        

// @LINE:302
private[this] lazy val controllers_InvoiceInventory_filterPaymentInvoices176 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/"),DynamicPart("companyId", """[^/]+""",true),StaticPart("/filter/"),DynamicPart("selectedCategoryForEnable", """[^/]+""",true))))
        

// @LINE:303
private[this] lazy val controllers_InvoiceInventory_getInvoicesBySupplierName177 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/invoicesBy/supplier/name"))))
        

// @LINE:304
private[this] lazy val controllers_InvoiceInventory_getInvoicesBySupplierNameInHeadOffice178 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("InvoiceInventory/HeadOffice/invoicesBy/supplier/name"))))
        

// @LINE:307
private[this] lazy val controllers_MonthlyReports_showUploadPage179 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("monthlyReports/"))))
        

// @LINE:308
private[this] lazy val controllers_MonthlyReports_uploadReports180 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("monthlyReports/upload/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:309
private[this] lazy val controllers_MonthlyReports_showUploadedReports181 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("monthlyReports/uploaded/"),DynamicPart("sid", """[^/]+""",true))))
        

// @LINE:310
private[this] lazy val controllers_MonthlyReports_displayUploaded182 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("monthlyReports/displayUploaded/"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:311
private[this] lazy val controllers_MonthlyReports_viewUploadedReports183 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("monthlyReports/view"))))
        

// @LINE:312
private[this] lazy val controllers_MonthlyReports_getUploadedReports184 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("monthlyReports/getUploaded"))))
        

// @LINE:316
private[this] lazy val controllers_ManagementReports_getReportsHome185 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("managementReports"))))
        

// @LINE:317
private[this] lazy val controllers_ManagementReports_getManagementReport186 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("managementReports/getReport"))))
        

// @LINE:321
private[this] lazy val controllers_HoForms_showHoFormUploadPage187 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("HeadOfficeForms/"))))
        

// @LINE:322
private[this] lazy val controllers_HoForms_uploadHoFormsByHeadOffice188 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("HeadOfficeForms/upload"))))
        

// @LINE:323
private[this] lazy val controllers_HoForms_getAllHeadOfficeForms189 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("HeadOfficeForms/headOfficeFormsList"))))
        

// @LINE:328
private[this] lazy val controllers_Application_checkForUnique190 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkForUnique/"),DynamicPart("param", """[^/]+""",true),StaticPart("/"),DynamicPart("type", """[^/]+""",true),StaticPart("/"),DynamicPart("mode", """[^/]+""",true))))
        

// @LINE:329
private[this] lazy val controllers_Application_checkTimesheetExists191 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkTimesheetExists/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true),StaticPart("/"),DynamicPart("sh", """[^/]+""",true),StaticPart("/"),DynamicPart("eh", """[^/]+""",true))))
        

// @LINE:330
private[this] lazy val controllers_Application_checkTimesheetExistsForLeave192 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkTimesheetExistsForLeave/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true))))
        

// @LINE:331
private[this] lazy val controllers_Application_checkTimesheetExistsEditPage193 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkTimesheetExistsEditPage/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true),StaticPart("/"),DynamicPart("sh", """[^/]+""",true),StaticPart("/"),DynamicPart("eh", """[^/]+""",true))))
        

// @LINE:332
private[this] lazy val controllers_Application_checkTimesheetExistsForLeaveEditPage194 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkTimesheetExistsForLeaveEditPage/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true))))
        

// @LINE:333
private[this] lazy val controllers_Application_storesByCompany195 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getStoresByCompany/"),DynamicPart("cid", """[^/]+""",true))))
        

// @LINE:334
private[this] lazy val controllers_Application_checkHeadOfficeTimesheetExists196 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkHeadOfficeTimesheetExists/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true),StaticPart("/"),DynamicPart("sh", """[^/]+""",true),StaticPart("/"),DynamicPart("eh", """[^/]+""",true))))
        

// @LINE:335
private[this] lazy val controllers_Application_checkHeadOfficeTimesheetExistsForLeave197 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkHeadOfficeTimesheetExistsForLeave/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true))))
        

// @LINE:336
private[this] lazy val controllers_Application_checkHeadOfficeTimesheetExistsInEditPage198 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("checkHeadOfficeTimesheetExistsForEdit/"),DynamicPart("sid", """[^/]+""",true),StaticPart("/"),DynamicPart("empId", """[^/]+""",true),StaticPart("/"),DynamicPart("sh", """[^/]+""",true),StaticPart("/"),DynamicPart("eh", """[^/]+""",true),StaticPart("/"),DynamicPart("tid", """[^/]+""",true))))
        

// @LINE:337
private[this] lazy val controllers_Application_checkHOTTimesheetExistsInEditPageForLeave199 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateHoEmployeeLeaveType/"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showOptions/$page<[^/]+>/$action<[^/]+>""","""controllers.Application.showOptions(page:String, action:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """file/checkUrl""","""controllers.Application.checkUrl(filePath:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/""","""controllers.Users.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/new""","""controllers.Users.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""controllers.Users.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>""","""controllers.Users.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/$id<[^/]+>/delete""","""controllers.Users.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/""","""controllers.Users.register()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/changePassword/$id<[^/]+>""","""controllers.Users.changePassword(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/verfiyPassword/$id<[^/]+>""","""controllers.Application.verifyCurrentPassword(id:Long, currPwd:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/new""","""controllers.Products.showBlank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$id<[^/]+>""","""controllers.Products.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$id<[^/]+>""","""controllers.Products.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/$id<[^/]+>/delete""","""controllers.Products.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/""","""controllers.Products.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products/""","""controllers.Products.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companies/""","""controllers.Companies.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companies/new""","""controllers.Companies.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companies/$id<[^/]+>""","""controllers.Companies.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companies/$id<[^/]+>""","""controllers.Companies.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companies/$id<[^/]+>/delete""","""controllers.Companies.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """companies/""","""controllers.Companies.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/""","""controllers.Employees.list(p:Int ?= 0, s:String ?= "first_name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/byStore""","""controllers.Employees.listForFilterByStore(p:Int ?= 0, s:String ?= "store_name", o:String ?= "asc", sn:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/new""","""controllers.Employees.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/$id<[^/]+>""","""controllers.Employees.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/$id<[^/]+>""","""controllers.Employees.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/$id<[^/]+>/delete""","""controllers.Employees.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/$id<[^/]+>/myProfile""","""controllers.Employees.myProfile(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/""","""controllers.Employees.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stores/""","""controllers.Stores.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stores/new""","""controllers.Stores.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stores/$id<[^/]+>""","""controllers.Stores.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stores/$id<[^/]+>""","""controllers.Stores.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """stores/$id<[^/]+>/delete""","""controllers.Stores.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """Stores/""","""controllers.Stores.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/""","""controllers.Suppliers.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/new""","""controllers.Suppliers.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/$id<[^/]+>""","""controllers.Suppliers.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/$id<[^/]+>""","""controllers.Suppliers.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/$id<[^/]+>/delete""","""controllers.Suppliers.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/""","""controllers.Suppliers.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/getSuppliers/$search<[^/]+>""","""controllers.Suppliers.getSuppliers(search:String, headOffice:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/getSupplierMappings/$storeId<[^/]+>/$suppid<[^/]+>""","""controllers.Application.getSupplierMapping(storeId:Long, suppid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """suppliers/deleteSupplierMappings/$suppMappingId<[^/]+>""","""controllers.Application.deleteSupplierMapping(suppMappingId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """payouts/getPayout/$paytype<[^/]+>/$sid<[^/]+>/$supid<[^/]+>""","""controllers.Application.getPayout(paytype:String, sid:Long, supid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """payouts/deletePayout/$pid<[^/]+>""","""controllers.Application.deletePayout(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """payrolls/addPayroll/$empId<[^/]+>/$weekDate<[^/]+>/$drId<[^/]+>""","""controllers.Application.addPayroll(empId:Long, weekDate:String, drId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """payrolls/deletePayroll/$pid<[^/]+>""","""controllers.Application.deletePayroll(pid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""","""controllers.Application.javascriptRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """salesheads/""","""controllers.SalesHeads.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """salesheads/new""","""controllers.SalesHeads.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """salesheads/$id<[^/]+>""","""controllers.SalesHeads.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """salesheads/$id<[^/]+>""","""controllers.SalesHeads.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """salesheads/$id<[^/]+>/delete""","""controllers.SalesHeads.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """salesheads/""","""controllers.SalesHeads.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminalheads/""","""controllers.TerminalHeads.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminalheads/new""","""controllers.TerminalHeads.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminalheads/$id<[^/]+>""","""controllers.TerminalHeads.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminalheads/$id<[^/]+>""","""controllers.TerminalHeads.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminalheads/$id<[^/]+>/delete""","""controllers.TerminalHeads.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminalheads/""","""controllers.TerminalHeads.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """totalsalesheads/""","""controllers.TotalSalesHeads.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """totalsalesheads/new""","""controllers.TotalSalesHeads.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """totalsalesheads/$id<[^/]+>""","""controllers.TotalSalesHeads.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """totalsalesheads/$id<[^/]+>""","""controllers.TotalSalesHeads.edit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """totalsalesheads/$id<[^/]+>/delete""","""controllers.TotalSalesHeads.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """totalsalesheads/""","""controllers.TotalSalesHeads.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """expenseheads/""","""controllers.ExpenseHeads.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """expenseheads/new""","""controllers.ExpenseHeads.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """expenseheads/$id<[^/]+>""","""controllers.ExpenseHeads.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """expenseheads/$id<[^/]+>""","""controllers.ExpenseHeads.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """expenseheads/$id<[^/]+>/delete""","""controllers.ExpenseHeads.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """expenseheads/""","""controllers.ExpenseHeads.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mediatenders/""","""controllers.MediaTenders.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mediatenders/new""","""controllers.MediaTenders.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mediatenders/$id<[^/]+>""","""controllers.MediaTenders.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mediatenders/$id<[^/]+>""","""controllers.MediaTenders.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mediatenders/$id<[^/]+>/delete""","""controllers.MediaTenders.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """mediatenders/""","""controllers.MediaTenders.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paymentTenders/""","""controllers.PaymentTenders.list(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paymentTenders/new""","""controllers.PaymentTenders.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paymentTenders/$id<[^/]+>""","""controllers.PaymentTenders.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paymentTenders/$id<[^/]+>""","""controllers.PaymentTenders.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paymentTenders/$id<[^/]+>/delete""","""controllers.PaymentTenders.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """paymentTenders/""","""controllers.PaymentTenders.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dsrs/""","""controllers.DailySalesReconciliations.list(p:Int ?= 0, s:String ?= "status", o:String ?= "asc", f:String ?= "OPEN", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dsrs/new/$id<[^/]+>""","""controllers.DailySalesReconciliations.showBlank(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dsrs/$id<[^/]+>""","""controllers.DailySalesReconciliations.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dsrs/$id<[^/]+>""","""controllers.DailySalesReconciliations.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dsrs/$id<[^/]+>/delete""","""controllers.DailySalesReconciliations.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dsrs/$id<[^/]+>/save""","""controllers.DailySalesReconciliations.save(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/""","""controllers.DailyReconciliations.list(p:Int ?= 0, s:String ?= "status", o:String ?= "asc", f:String ?= "OPEN", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/listByDate""","""controllers.DailyReconciliations.listByDate(p:Int ?= 0, s:String ?= "status", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/new/$id<[^/]+>""","""controllers.DailyReconciliations.showBlank(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/$id<[^/]+>""","""controllers.DailyReconciliations.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/$id<[^/]+>""","""controllers.DailyReconciliations.edit(id:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/$id<[^/]+>/delete""","""controllers.DailyReconciliations.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/$id<[^/]+>/save""","""controllers.DailyReconciliations.save(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drs/summary/$id<[^/]+>/$weekDate<[^/]+>""","""controllers.DailyReconciliations.summary(id:Long, weekDate:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """drsdrViewOptions/$action<[^/]+>""","""controllers.DailyReconciliations.drViewOptions(p:Int ?= 0, s:String ?= "reportingBusinessDate", o:String ?= "desc", f:String ?= "SUBMITTED", action:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminals/$id<[^/]+>""","""controllers.Terminals.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminals/$id<[^/]+>/delete""","""controllers.Terminals.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminals/""","""controllers.Terminals.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """terminals/$id<[^/]+>/$thead<[^/]+>""","""controllers.Terminals.summary(id:Long, thead:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/""","""controllers.Shifts.list(p:Int ?= 0, s:String ?= "status", o:String ?= "asc", f:String ?= "OPEN", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/new/$sid<[^/]+>/$action<[^/]+>""","""controllers.Shifts.showBlank(sid:Long, thead:String, action:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/edit/$id<[^/]+>/$sid<[^/]+>/$action<[^/]+>""","""controllers.Shifts.update(id:Long, sid:Long, action:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/$id<[^/]+>/$sid<[^/]+>""","""controllers.Shifts.edit(id:Long, sid:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/$id<[^/]+>/delete""","""controllers.Shifts.delete(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/$id<[^/]+>/$sid<[^/]+>/$action<[^/]+>""","""controllers.Shifts.save(id:Long, sid:Long, action:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/$id<[^/]+>""","""controllers.Shifts.submit(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """shifts/storeSuppliers""","""controllers.Shifts.storeSuppliersList(p:Int ?= 0, s:String ?= "name", o:String ?= "asc", f:String ?= "")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheets/""","""controllers.Timesheets.list(p:Int ?= 0, s:String ?= "status", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheets/new/$sid<[^/]+>""","""controllers.Timesheets.showBlank(sid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheets/$sid<[^/]+>""","""controllers.Timesheets.save(sid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheets/$tid<[^/]+>/$sid<[^/]+>""","""controllers.Timesheets.edit(tid:Long, sid:Long, action:String ?= "ALL")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheets/edit/$tid<[^/]+>/$sid<[^/]+>""","""controllers.Timesheets.update(tid:Long, sid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheets/delete/$id<[^/]+>""","""controllers.Timesheets.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForsk/""","""controllers.Timesheets.listForsk(p:Int ?= 0, s:String ?= "status", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForsk/new/$sid<[^/]+>""","""controllers.Timesheets.showBlankForsk(sid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForsk/$sid<[^/]+>""","""controllers.Timesheets.saveForsk(sid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForsk/$tid<[^/]+>/$sid<[^/]+>""","""controllers.Timesheets.editForsk(tid:Long, sid:Long, action:String ?= "ALL")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForsk/edit/$tid<[^/]+>/$sid<[^/]+>""","""controllers.Timesheets.updateForsk(tid:Long, sid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetProcessing/showSelectPage""","""controllers.Timesheets.showSelectPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetProcessing/timesheetList""","""controllers.Timesheets.getTimesheets()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetProcessing/showSelectPageForSK/$sid<[^/]+>""","""controllers.Timesheets.showSelectPageForSK(sid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/headOfficeNew/$sid<[^/]+>""","""controllers.Timesheets.showBlankForHeadOffice(sid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/saveTimeSheetHours/$empId<[^/]+>""","""controllers.Application.getTimeSheetSave(empId:Long, date:String, startTimeHour:String, startTimeMin:String, endTimeHour:String, endTimeMin:String, duration:String, textArea:String, leaveType:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/$sid<[^/]+>/$empId<[^/]+>""","""controllers.Timesheets.saveForHeadOfficeTimeSheet(sid:Long, empId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/""","""controllers.Timesheets.listForHeadOffice(p:Int ?= 0, s:String ?= "status", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/$tid<[^/]+>/$sid<[^/]+>""","""controllers.Timesheets.editFormForHeadOffice(tid:Long, sid:Long, action:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/showSelectPageForHeadOfficeTimeSheet/""","""controllers.Timesheets.showSelectPageForHeadOfficeTimeSheet()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/listForApproval/""","""controllers.Timesheets.getAllHeadOfficeTimesheetsToVerify()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetProcessing/headOfficeTimesheetList/""","""controllers.Timesheets.getHeadOfficeTimesheets()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/showSelectPageForHOTVerification""","""controllers.Timesheets.showSelectPageForVerify(date:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/listForVerify/""","""controllers.Timesheets.getHeadOfficeTimesheetsForVerify()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateStatusToApproved""","""controllers.Timesheets.updateWeeklyHOTimesheetsByWeekDate(stDate:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetsForHeadOffice/RejectedTimesheetEdit/$timesheetId<[^/]+>/$empId<[^/]+>/$storeId<[^/]+>/$pageAction<[^/]+>""","""controllers.Timesheets.editFormForHeadOfficeRejectedTimesheetList(timesheetId:Long, empId:Long, storeId:Long, pageAction:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """timesheetUpdated/""","""controllers.Timesheets.updateEditListForRejectedTS(empId:Long, storeId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """verifyHOTimesheet/""","""controllers.Timesheets.verifyHOTimesheet()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateRejectedHOTimesheets/""","""controllers.Timesheets.updateRejectedStatusForHOTimesheets()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/""","""controllers.Reports.getReportHome()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/Store""","""controllers.Reports.getReportHomeForStore()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reports/getReport/""","""controllers.Reports.getReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accountHolder/list""","""controllers.AccountHolders.list(p:Int ?= 0, s:String ?= "account_holder", o:String ?= "asc", f:String ?= "", pg:String ?= "VIEW")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accountHolder/new""","""controllers.AccountHolders.showBlank()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accountHolder/""","""controllers.AccountHolders.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accountHolder/$id<[^/]+>""","""controllers.AccountHolders.edit(id:Long, action:String ?= "ALL")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accountHolder/$id<[^/]+>""","""controllers.AccountHolders.update(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """accountHolder/$id<[^/]+>/delete""","""controllers.AccountHolders.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """javascriptRoutes""","""controllers.Application.javascriptRoutes"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/""","""controllers.InvoiceInventory.showUploadPage()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/showPaymentPage/$selectedCompany<[^/]+>/$selectedStore<[^/]+>/$selectedCategory<[^/]+>/$selectedPaymentTerm<[^/]+>""","""controllers.InvoiceInventory.showPaymentPage(selectedCompany:String, selectedStore:String, selectedCategory:String, selectedPaymentTerm:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/HeadOfficeUpload""","""controllers.InvoiceInventory.showUploadPageForHeadOffice()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/download""","""controllers.InvoiceInventory.showDownloadPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/upload/$id<[^/]+>""","""controllers.InvoiceInventory.uploadInvoices(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/uploadByHeadOffice""","""controllers.InvoiceInventory.uploadInvoicesByHeadOffice()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/download/list""","""controllers.InvoiceInventory.getInvoices()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/download/list/$id<[^/]+>/$type<[^/]+>""","""controllers.InvoiceInventory.getInvoicesAfterMove(id:Long, type:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/list/invoicesAfterPayment/$id<[^/]+>/$paymentTerms<[^/]+>/$companyId<[^/]+>/$filter<[^/]+>/$selectedCategory<[^/]+>""","""controllers.InvoiceInventory.getInvoicesAfterPaymentDone(id:Long, paymentTerms:String, companyId:Long, filter:String, selectedCategory:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/list/move/$id<[^/]+>""","""controllers.InvoiceInventory.move(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/headOfficeList/headOfficeMove/$id<[^/]+>""","""controllers.InvoiceInventory.headOfficeMove(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/paymentList/paymentMove/$id<[^/]+>/$paymentTerms<[^/]+>/$companyId<[^/]+>/$selectedCategory<[^/]+>/$filter<[^/]+>""","""controllers.InvoiceInventory.paymentMove(id:Long, paymentTerms:String, companyId:Long, filter:String, selectedCategory:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/delete/$id<[^/]+>""","""controllers.InvoiceInventory.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/invoiceListjustView/$id<[^/]+>/$type<[^/]+>""","""controllers.InvoiceInventory.getInvoicesByStoreAndType(id:Long, type:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/getInvoicesForPayment/list""","""controllers.InvoiceInventory.getInvoicesForPayment()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/displayUploaded/list/$id<[^/]+>""","""controllers.InvoiceInventory.displayUploadedForSK(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/dateSelectPageForSK/$sid<[^/]+>""","""controllers.InvoiceInventory.dateSelectPageForSK(sid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/dateSelectPageForHeadOffice""","""controllers.InvoiceInventory.dateSelectPageForHeadOffice()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/displayUploadedForHeadOffice/list/""","""controllers.InvoiceInventory.displayUploadedForHeadOffice()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/$companyId<[^/]+>/filter/$selectedCategoryForEnable<[^/]+>""","""controllers.InvoiceInventory.filterPaymentInvoices(companyId:String, selectedCategoryForEnable:String, f:String ?= "", refInvoiceId:Long ?= 0L, paymentTerms:String ?= "ALL")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/invoicesBy/supplier/name""","""controllers.InvoiceInventory.getInvoicesBySupplierName()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """InvoiceInventory/HeadOffice/invoicesBy/supplier/name""","""controllers.InvoiceInventory.getInvoicesBySupplierNameInHeadOffice()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """monthlyReports/""","""controllers.MonthlyReports.showUploadPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """monthlyReports/upload/$id<[^/]+>""","""controllers.MonthlyReports.uploadReports(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """monthlyReports/uploaded/$sid<[^/]+>""","""controllers.MonthlyReports.showUploadedReports(sid:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """monthlyReports/displayUploaded/$id<[^/]+>""","""controllers.MonthlyReports.displayUploaded(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """monthlyReports/view""","""controllers.MonthlyReports.viewUploadedReports()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """monthlyReports/getUploaded""","""controllers.MonthlyReports.getUploadedReports()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """managementReports""","""controllers.ManagementReports.getReportsHome()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """managementReports/getReport""","""controllers.ManagementReports.getManagementReport()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """HeadOfficeForms/""","""controllers.HoForms.showHoFormUploadPage()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """HeadOfficeForms/upload""","""controllers.HoForms.uploadHoFormsByHeadOffice()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """HeadOfficeForms/headOfficeFormsList""","""controllers.HoForms.getAllHeadOfficeForms()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkForUnique/$param<[^/]+>/$type<[^/]+>/$mode<[^/]+>""","""controllers.Application.checkForUnique(param:String, type:String, mode:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkTimesheetExists/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>""","""controllers.Application.checkTimesheetExists(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkTimesheetExistsForLeave/$sid<[^/]+>/$empId<[^/]+>""","""controllers.Application.checkTimesheetExistsForLeave(sid:Long, empId:Long, date:String, endDate:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkTimesheetExistsEditPage/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>""","""controllers.Application.checkTimesheetExistsEditPage(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String, tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkTimesheetExistsForLeaveEditPage/$sid<[^/]+>/$empId<[^/]+>""","""controllers.Application.checkTimesheetExistsForLeaveEditPage(sid:Long, empId:Long, date:String, endDate:String, tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getStoresByCompany/$cid<[^/]+>""","""controllers.Application.storesByCompany(cid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkHeadOfficeTimesheetExists/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>""","""controllers.Application.checkHeadOfficeTimesheetExists(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkHeadOfficeTimesheetExistsForLeave/$sid<[^/]+>/$empId<[^/]+>""","""controllers.Application.checkHeadOfficeTimesheetExistsForLeave(sid:Long, empId:Long, date:String, endDate:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """checkHeadOfficeTimesheetExistsForEdit/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>/$tid<[^/]+>""","""controllers.Application.checkHeadOfficeTimesheetExistsInEditPage(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String, tid:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateHoEmployeeLeaveType/""","""controllers.Application.checkHOTTimesheetExistsInEditPageForLeave(storeId:Long, empId:Long, date:String, endDate:String, tid:Long, leaveType:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_showOptions1(params) => {
   call(params.fromPath[String]("page", None), params.fromPath[String]("action", None)) { (page, action) =>
        invokeHandler(controllers.Application.showOptions(page, action), HandlerDef(this, "controllers.Application", "showOptions", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """showOptions/$page<[^/]+>/$action<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_Application_login2(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:15
case controllers_Application_authenticate3(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:16
case controllers_Application_logout4(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:25
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:27
case controllers_Application_checkUrl6(params) => {
   call(params.fromQuery[String]("filePath", None)) { (filePath) =>
        invokeHandler(controllers.Application.checkUrl(filePath), HandlerDef(this, "controllers.Application", "checkUrl", Seq(classOf[String]),"GET", """""", Routes.prefix + """file/checkUrl"""))
   }
}
        

// @LINE:31
case controllers_Users_list7(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Users.list(p, s, o, f, pg), HandlerDef(this, "controllers.Users", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """users/"""))
   }
}
        

// @LINE:33
case controllers_Users_showBlank8(params) => {
   call { 
        invokeHandler(controllers.Users.showBlank(), HandlerDef(this, "controllers.Users", "showBlank", Nil,"GET", """GET  /users/           									controllers.Users.list()""", Routes.prefix + """users/new"""))
   }
}
        

// @LINE:34
case controllers_Users_update9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/$id<[^/]+>"""))
   }
}
        

// @LINE:35
case controllers_Users_edit10(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.Users.edit(id, action), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """users/$id<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_Users_delete11(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """users/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:38
case controllers_Users_register12(params) => {
   call { 
        invokeHandler(controllers.Users.register(), HandlerDef(this, "controllers.Users", "register", Nil,"POST", """""", Routes.prefix + """users/"""))
   }
}
        

// @LINE:39
case controllers_Users_changePassword13(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Users.changePassword(id), HandlerDef(this, "controllers.Users", "changePassword", Seq(classOf[Long]),"POST", """""", Routes.prefix + """users/changePassword/$id<[^/]+>"""))
   }
}
        

// @LINE:40
case controllers_Application_verifyCurrentPassword14(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("currPwd", None)) { (id, currPwd) =>
        invokeHandler(controllers.Application.verifyCurrentPassword(id, currPwd), HandlerDef(this, "controllers.Application", "verifyCurrentPassword", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """users/verfiyPassword/$id<[^/]+>"""))
   }
}
        

// @LINE:44
case controllers_Products_showBlank15(params) => {
   call { 
        invokeHandler(controllers.Products.showBlank(), HandlerDef(this, "controllers.Products", "showBlank", Nil,"GET", """#################### Sample Products Page ###############################################
 Edit existing products""", Routes.prefix + """products/new"""))
   }
}
        

// @LINE:45
case controllers_Products_edit16(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Products.edit(id), HandlerDef(this, "controllers.Products", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """products/$id<[^/]+>"""))
   }
}
        

// @LINE:46
case controllers_Products_update17(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Products.update(id), HandlerDef(this, "controllers.Products", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """products/$id<[^/]+>"""))
   }
}
        

// @LINE:47
case controllers_Products_delete18(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Products.delete(id), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """products/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:50
case controllers_Products_list19(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Products.list(p, s, o, f), HandlerDef(this, "controllers.Products", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """GET /products/           									controllers.Products.list()""", Routes.prefix + """products/"""))
   }
}
        

// @LINE:53
case controllers_Products_save20(params) => {
   call { 
        invokeHandler(controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Nil,"POST", """GET /products/:ean       									controllers.Products.show(ean:Long) """, Routes.prefix + """products/"""))
   }
}
        

// @LINE:57
case controllers_Companies_list21(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Companies.list(p, s, o, f, pg), HandlerDef(this, "controllers.Companies", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """companies/"""))
   }
}
        

// @LINE:59
case controllers_Companies_showBlank22(params) => {
   call { 
        invokeHandler(controllers.Companies.showBlank(), HandlerDef(this, "controllers.Companies", "showBlank", Nil,"GET", """GET  /companies/           								controllers.Companies.list()""", Routes.prefix + """companies/new"""))
   }
}
        

// @LINE:60
case controllers_Companies_update23(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Companies.update(id), HandlerDef(this, "controllers.Companies", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """companies/$id<[^/]+>"""))
   }
}
        

// @LINE:61
case controllers_Companies_edit24(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.Companies.edit(id, action), HandlerDef(this, "controllers.Companies", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """companies/$id<[^/]+>"""))
   }
}
        

// @LINE:62
case controllers_Companies_delete25(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Companies.delete(id), HandlerDef(this, "controllers.Companies", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """companies/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:64
case controllers_Companies_save26(params) => {
   call { 
        invokeHandler(controllers.Companies.save(), HandlerDef(this, "controllers.Companies", "save", Nil,"POST", """""", Routes.prefix + """companies/"""))
   }
}
        

// @LINE:67
case controllers_Employees_list27(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("first_name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Employees.list(p, s, o, f, pg), HandlerDef(this, "controllers.Employees", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """employees/"""))
   }
}
        

// @LINE:68
case controllers_Employees_listForFilterByStore28(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("store_name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("sn", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, sn, pg) =>
        invokeHandler(controllers.Employees.listForFilterByStore(p, s, o, sn, pg), HandlerDef(this, "controllers.Employees", "listForFilterByStore", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """employees/byStore"""))
   }
}
        

// @LINE:71
case controllers_Employees_showBlank29(params) => {
   call { 
        invokeHandler(controllers.Employees.showBlank(), HandlerDef(this, "controllers.Employees", "showBlank", Nil,"GET", """GET  /employees/           								controllers.Employees.list()""", Routes.prefix + """employees/new"""))
   }
}
        

// @LINE:72
case controllers_Employees_update30(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Employees.update(id), HandlerDef(this, "controllers.Employees", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """employees/$id<[^/]+>"""))
   }
}
        

// @LINE:73
case controllers_Employees_edit31(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.Employees.edit(id, action), HandlerDef(this, "controllers.Employees", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """employees/$id<[^/]+>"""))
   }
}
        

// @LINE:74
case controllers_Employees_delete32(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Employees.delete(id), HandlerDef(this, "controllers.Employees", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """employees/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:75
case controllers_Employees_myProfile33(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Employees.myProfile(id), HandlerDef(this, "controllers.Employees", "myProfile", Seq(classOf[Long]),"GET", """""", Routes.prefix + """employees/$id<[^/]+>/myProfile"""))
   }
}
        

// @LINE:77
case controllers_Employees_save34(params) => {
   call { 
        invokeHandler(controllers.Employees.save(), HandlerDef(this, "controllers.Employees", "save", Nil,"POST", """""", Routes.prefix + """employees/"""))
   }
}
        

// @LINE:81
case controllers_Stores_list35(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Stores.list(p, s, o, f, pg), HandlerDef(this, "controllers.Stores", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """stores/"""))
   }
}
        

// @LINE:82
case controllers_Stores_showBlank36(params) => {
   call { 
        invokeHandler(controllers.Stores.showBlank(), HandlerDef(this, "controllers.Stores", "showBlank", Nil,"GET", """""", Routes.prefix + """stores/new"""))
   }
}
        

// @LINE:83
case controllers_Stores_update37(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Stores.update(id), HandlerDef(this, "controllers.Stores", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """stores/$id<[^/]+>"""))
   }
}
        

// @LINE:84
case controllers_Stores_edit38(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.Stores.edit(id, action), HandlerDef(this, "controllers.Stores", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """stores/$id<[^/]+>"""))
   }
}
        

// @LINE:85
case controllers_Stores_delete39(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Stores.delete(id), HandlerDef(this, "controllers.Stores", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """stores/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:86
case controllers_Stores_save40(params) => {
   call { 
        invokeHandler(controllers.Stores.save(), HandlerDef(this, "controllers.Stores", "save", Nil,"POST", """""", Routes.prefix + """Stores/"""))
   }
}
        

// @LINE:90
case controllers_Suppliers_list41(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Suppliers.list(p, s, o, f, pg), HandlerDef(this, "controllers.Suppliers", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """suppliers/"""))
   }
}
        

// @LINE:91
case controllers_Suppliers_showBlank42(params) => {
   call { 
        invokeHandler(controllers.Suppliers.showBlank(), HandlerDef(this, "controllers.Suppliers", "showBlank", Nil,"GET", """""", Routes.prefix + """suppliers/new"""))
   }
}
        

// @LINE:92
case controllers_Suppliers_update43(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Suppliers.update(id), HandlerDef(this, "controllers.Suppliers", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """suppliers/$id<[^/]+>"""))
   }
}
        

// @LINE:93
case controllers_Suppliers_edit44(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.Suppliers.edit(id, action), HandlerDef(this, "controllers.Suppliers", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """suppliers/$id<[^/]+>"""))
   }
}
        

// @LINE:94
case controllers_Suppliers_delete45(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Suppliers.delete(id), HandlerDef(this, "controllers.Suppliers", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """suppliers/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:95
case controllers_Suppliers_save46(params) => {
   call { 
        invokeHandler(controllers.Suppliers.save(), HandlerDef(this, "controllers.Suppliers", "save", Nil,"POST", """""", Routes.prefix + """suppliers/"""))
   }
}
        

// @LINE:96
case controllers_Suppliers_getSuppliers47(params) => {
   call(params.fromPath[String]("search", None), params.fromQuery[String]("headOffice", None)) { (search, headOffice) =>
        invokeHandler(controllers.Suppliers.getSuppliers(search, headOffice), HandlerDef(this, "controllers.Suppliers", "getSuppliers", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """suppliers/getSuppliers/$search<[^/]+>"""))
   }
}
        

// @LINE:97
case controllers_Application_getSupplierMapping48(params) => {
   call(params.fromPath[Long]("storeId", None), params.fromPath[Long]("suppid", None)) { (storeId, suppid) =>
        invokeHandler(controllers.Application.getSupplierMapping(storeId, suppid), HandlerDef(this, "controllers.Application", "getSupplierMapping", Seq(classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """suppliers/getSupplierMappings/$storeId<[^/]+>/$suppid<[^/]+>"""))
   }
}
        

// @LINE:98
case controllers_Application_deleteSupplierMapping49(params) => {
   call(params.fromPath[Long]("suppMappingId", None)) { (suppMappingId) =>
        invokeHandler(controllers.Application.deleteSupplierMapping(suppMappingId), HandlerDef(this, "controllers.Application", "deleteSupplierMapping", Seq(classOf[Long]),"GET", """""", Routes.prefix + """suppliers/deleteSupplierMappings/$suppMappingId<[^/]+>"""))
   }
}
        

// @LINE:101
case controllers_Application_getPayout50(params) => {
   call(params.fromPath[String]("paytype", None), params.fromPath[Long]("sid", None), params.fromPath[Long]("supid", None)) { (paytype, sid, supid) =>
        invokeHandler(controllers.Application.getPayout(paytype, sid, supid), HandlerDef(this, "controllers.Application", "getPayout", Seq(classOf[String], classOf[Long], classOf[Long]),"GET", """""", Routes.prefix + """payouts/getPayout/$paytype<[^/]+>/$sid<[^/]+>/$supid<[^/]+>"""))
   }
}
        

// @LINE:102
case controllers_Application_deletePayout51(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        invokeHandler(controllers.Application.deletePayout(pid), HandlerDef(this, "controllers.Application", "deletePayout", Seq(classOf[Long]),"GET", """""", Routes.prefix + """payouts/deletePayout/$pid<[^/]+>"""))
   }
}
        

// @LINE:106
case controllers_Application_addPayroll52(params) => {
   call(params.fromPath[Long]("empId", None), params.fromPath[String]("weekDate", None), params.fromPath[Long]("drId", None)) { (empId, weekDate, drId) =>
        invokeHandler(controllers.Application.addPayroll(empId, weekDate, drId), HandlerDef(this, "controllers.Application", "addPayroll", Seq(classOf[Long], classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """payrolls/addPayroll/$empId<[^/]+>/$weekDate<[^/]+>/$drId<[^/]+>"""))
   }
}
        

// @LINE:107
case controllers_Application_deletePayroll53(params) => {
   call(params.fromPath[Long]("pid", None)) { (pid) =>
        invokeHandler(controllers.Application.deletePayroll(pid), HandlerDef(this, "controllers.Application", "deletePayroll", Seq(classOf[Long]),"GET", """""", Routes.prefix + """payrolls/deletePayroll/$pid<[^/]+>"""))
   }
}
        

// @LINE:109
case controllers_Application_javascriptRoutes54(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes, HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """javascriptRoutes"""))
   }
}
        

// @LINE:112
case controllers_SalesHeads_list55(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.SalesHeads.list(p, s, o, f, pg), HandlerDef(this, "controllers.SalesHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """salesheads/"""))
   }
}
        

// @LINE:113
case controllers_SalesHeads_showBlank56(params) => {
   call { 
        invokeHandler(controllers.SalesHeads.showBlank(), HandlerDef(this, "controllers.SalesHeads", "showBlank", Nil,"GET", """""", Routes.prefix + """salesheads/new"""))
   }
}
        

// @LINE:114
case controllers_SalesHeads_update57(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SalesHeads.update(id), HandlerDef(this, "controllers.SalesHeads", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """salesheads/$id<[^/]+>"""))
   }
}
        

// @LINE:115
case controllers_SalesHeads_edit58(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.SalesHeads.edit(id, action), HandlerDef(this, "controllers.SalesHeads", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """salesheads/$id<[^/]+>"""))
   }
}
        

// @LINE:116
case controllers_SalesHeads_delete59(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.SalesHeads.delete(id), HandlerDef(this, "controllers.SalesHeads", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """salesheads/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:117
case controllers_SalesHeads_save60(params) => {
   call { 
        invokeHandler(controllers.SalesHeads.save(), HandlerDef(this, "controllers.SalesHeads", "save", Nil,"POST", """""", Routes.prefix + """salesheads/"""))
   }
}
        

// @LINE:122
case controllers_TerminalHeads_list61(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.TerminalHeads.list(p, s, o, f, pg), HandlerDef(this, "controllers.TerminalHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """terminalheads/"""))
   }
}
        

// @LINE:124
case controllers_TerminalHeads_showBlank62(params) => {
   call { 
        invokeHandler(controllers.TerminalHeads.showBlank(), HandlerDef(this, "controllers.TerminalHeads", "showBlank", Nil,"GET", """""", Routes.prefix + """terminalheads/new"""))
   }
}
        

// @LINE:125
case controllers_TerminalHeads_update63(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TerminalHeads.update(id), HandlerDef(this, "controllers.TerminalHeads", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """terminalheads/$id<[^/]+>"""))
   }
}
        

// @LINE:126
case controllers_TerminalHeads_edit64(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.TerminalHeads.edit(id, action), HandlerDef(this, "controllers.TerminalHeads", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """terminalheads/$id<[^/]+>"""))
   }
}
        

// @LINE:127
case controllers_TerminalHeads_delete65(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TerminalHeads.delete(id), HandlerDef(this, "controllers.TerminalHeads", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """terminalheads/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:128
case controllers_TerminalHeads_save66(params) => {
   call { 
        invokeHandler(controllers.TerminalHeads.save(), HandlerDef(this, "controllers.TerminalHeads", "save", Nil,"POST", """""", Routes.prefix + """terminalheads/"""))
   }
}
        

// @LINE:134
case controllers_TotalSalesHeads_list67(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.TotalSalesHeads.list(p, s, o, f), HandlerDef(this, "controllers.TotalSalesHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """totalsalesheads/"""))
   }
}
        

// @LINE:135
case controllers_TotalSalesHeads_showBlank68(params) => {
   call { 
        invokeHandler(controllers.TotalSalesHeads.showBlank(), HandlerDef(this, "controllers.TotalSalesHeads", "showBlank", Nil,"GET", """""", Routes.prefix + """totalsalesheads/new"""))
   }
}
        

// @LINE:136
case controllers_TotalSalesHeads_update69(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TotalSalesHeads.update(id), HandlerDef(this, "controllers.TotalSalesHeads", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """totalsalesheads/$id<[^/]+>"""))
   }
}
        

// @LINE:137
case controllers_TotalSalesHeads_edit70(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TotalSalesHeads.edit(id), HandlerDef(this, "controllers.TotalSalesHeads", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """totalsalesheads/$id<[^/]+>"""))
   }
}
        

// @LINE:138
case controllers_TotalSalesHeads_delete71(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.TotalSalesHeads.delete(id), HandlerDef(this, "controllers.TotalSalesHeads", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """totalsalesheads/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:139
case controllers_TotalSalesHeads_save72(params) => {
   call { 
        invokeHandler(controllers.TotalSalesHeads.save(), HandlerDef(this, "controllers.TotalSalesHeads", "save", Nil,"POST", """""", Routes.prefix + """totalsalesheads/"""))
   }
}
        

// @LINE:144
case controllers_ExpenseHeads_list73(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.ExpenseHeads.list(p, s, o, f, pg), HandlerDef(this, "controllers.ExpenseHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """expenseheads/"""))
   }
}
        

// @LINE:145
case controllers_ExpenseHeads_showBlank74(params) => {
   call { 
        invokeHandler(controllers.ExpenseHeads.showBlank(), HandlerDef(this, "controllers.ExpenseHeads", "showBlank", Nil,"GET", """""", Routes.prefix + """expenseheads/new"""))
   }
}
        

// @LINE:146
case controllers_ExpenseHeads_update75(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ExpenseHeads.update(id), HandlerDef(this, "controllers.ExpenseHeads", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """expenseheads/$id<[^/]+>"""))
   }
}
        

// @LINE:147
case controllers_ExpenseHeads_edit76(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.ExpenseHeads.edit(id, action), HandlerDef(this, "controllers.ExpenseHeads", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """expenseheads/$id<[^/]+>"""))
   }
}
        

// @LINE:148
case controllers_ExpenseHeads_delete77(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.ExpenseHeads.delete(id), HandlerDef(this, "controllers.ExpenseHeads", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """expenseheads/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:149
case controllers_ExpenseHeads_save78(params) => {
   call { 
        invokeHandler(controllers.ExpenseHeads.save(), HandlerDef(this, "controllers.ExpenseHeads", "save", Nil,"POST", """""", Routes.prefix + """expenseheads/"""))
   }
}
        

// @LINE:155
case controllers_MediaTenders_list79(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.MediaTenders.list(p, s, o, f, pg), HandlerDef(this, "controllers.MediaTenders", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """mediatenders/"""))
   }
}
        

// @LINE:156
case controllers_MediaTenders_showBlank80(params) => {
   call { 
        invokeHandler(controllers.MediaTenders.showBlank(), HandlerDef(this, "controllers.MediaTenders", "showBlank", Nil,"GET", """""", Routes.prefix + """mediatenders/new"""))
   }
}
        

// @LINE:157
case controllers_MediaTenders_update81(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.MediaTenders.update(id), HandlerDef(this, "controllers.MediaTenders", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """mediatenders/$id<[^/]+>"""))
   }
}
        

// @LINE:158
case controllers_MediaTenders_edit82(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.MediaTenders.edit(id, action), HandlerDef(this, "controllers.MediaTenders", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """mediatenders/$id<[^/]+>"""))
   }
}
        

// @LINE:159
case controllers_MediaTenders_delete83(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.MediaTenders.delete(id), HandlerDef(this, "controllers.MediaTenders", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """mediatenders/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:160
case controllers_MediaTenders_save84(params) => {
   call { 
        invokeHandler(controllers.MediaTenders.save(), HandlerDef(this, "controllers.MediaTenders", "save", Nil,"POST", """""", Routes.prefix + """mediatenders/"""))
   }
}
        

// @LINE:165
case controllers_PaymentTenders_list85(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.PaymentTenders.list(p, s, o, f, pg), HandlerDef(this, "controllers.PaymentTenders", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """paymentTenders/"""))
   }
}
        

// @LINE:167
case controllers_PaymentTenders_showBlank86(params) => {
   call { 
        invokeHandler(controllers.PaymentTenders.showBlank(), HandlerDef(this, "controllers.PaymentTenders", "showBlank", Nil,"GET", """""", Routes.prefix + """paymentTenders/new"""))
   }
}
        

// @LINE:168
case controllers_PaymentTenders_update87(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.PaymentTenders.update(id), HandlerDef(this, "controllers.PaymentTenders", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """paymentTenders/$id<[^/]+>"""))
   }
}
        

// @LINE:169
case controllers_PaymentTenders_edit88(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.PaymentTenders.edit(id, action), HandlerDef(this, "controllers.PaymentTenders", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """paymentTenders/$id<[^/]+>"""))
   }
}
        

// @LINE:170
case controllers_PaymentTenders_delete89(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.PaymentTenders.delete(id), HandlerDef(this, "controllers.PaymentTenders", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """paymentTenders/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:171
case controllers_PaymentTenders_save90(params) => {
   call { 
        invokeHandler(controllers.PaymentTenders.save(), HandlerDef(this, "controllers.PaymentTenders", "save", Nil,"POST", """""", Routes.prefix + """paymentTenders/"""))
   }
}
        

// @LINE:176
case controllers_DailySalesReconciliations_list91(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("status")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("OPEN")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.DailySalesReconciliations.list(p, s, o, f, pg), HandlerDef(this, "controllers.DailySalesReconciliations", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """dsrs/"""))
   }
}
        

// @LINE:177
case controllers_DailySalesReconciliations_showBlank92(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailySalesReconciliations.showBlank(id), HandlerDef(this, "controllers.DailySalesReconciliations", "showBlank", Seq(classOf[Long]),"GET", """""", Routes.prefix + """dsrs/new/$id<[^/]+>"""))
   }
}
        

// @LINE:178
case controllers_DailySalesReconciliations_update93(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailySalesReconciliations.update(id), HandlerDef(this, "controllers.DailySalesReconciliations", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """dsrs/$id<[^/]+>"""))
   }
}
        

// @LINE:179
case controllers_DailySalesReconciliations_edit94(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.DailySalesReconciliations.edit(id, action), HandlerDef(this, "controllers.DailySalesReconciliations", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """dsrs/$id<[^/]+>"""))
   }
}
        

// @LINE:180
case controllers_DailySalesReconciliations_delete95(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailySalesReconciliations.delete(id), HandlerDef(this, "controllers.DailySalesReconciliations", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """dsrs/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:182
case controllers_DailySalesReconciliations_save96(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailySalesReconciliations.save(id), HandlerDef(this, "controllers.DailySalesReconciliations", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """dsrs/$id<[^/]+>/save"""))
   }
}
        

// @LINE:186
case controllers_DailyReconciliations_list97(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("status")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("OPEN")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.DailyReconciliations.list(p, s, o, f, pg), HandlerDef(this, "controllers.DailyReconciliations", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """drs/"""))
   }
}
        

// @LINE:187
case controllers_DailyReconciliations_listByDate98(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("status")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.DailyReconciliations.listByDate(p, s, o, f, pg), HandlerDef(this, "controllers.DailyReconciliations", "listByDate", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """drs/listByDate"""))
   }
}
        

// @LINE:188
case controllers_DailyReconciliations_showBlank99(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailyReconciliations.showBlank(id), HandlerDef(this, "controllers.DailyReconciliations", "showBlank", Seq(classOf[Long]),"GET", """""", Routes.prefix + """drs/new/$id<[^/]+>"""))
   }
}
        

// @LINE:189
case controllers_DailyReconciliations_update100(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailyReconciliations.update(id), HandlerDef(this, "controllers.DailyReconciliations", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """drs/$id<[^/]+>"""))
   }
}
        

// @LINE:190
case controllers_DailyReconciliations_edit101(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.DailyReconciliations.edit(id, action), HandlerDef(this, "controllers.DailyReconciliations", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """drs/$id<[^/]+>"""))
   }
}
        

// @LINE:191
case controllers_DailyReconciliations_delete102(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailyReconciliations.delete(id), HandlerDef(this, "controllers.DailyReconciliations", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """drs/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:193
case controllers_DailyReconciliations_save103(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.DailyReconciliations.save(id), HandlerDef(this, "controllers.DailyReconciliations", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """drs/$id<[^/]+>/save"""))
   }
}
        

// @LINE:194
case controllers_DailyReconciliations_summary104(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("weekDate", None)) { (id, weekDate) =>
        invokeHandler(controllers.DailyReconciliations.summary(id, weekDate), HandlerDef(this, "controllers.DailyReconciliations", "summary", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """drs/summary/$id<[^/]+>/$weekDate<[^/]+>"""))
   }
}
        

// @LINE:195
case controllers_DailyReconciliations_drViewOptions105(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("reportingBusinessDate")), params.fromQuery[String]("o", Some("desc")), params.fromQuery[String]("f", Some("SUBMITTED")), params.fromPath[String]("action", None)) { (p, s, o, f, action) =>
        invokeHandler(controllers.DailyReconciliations.drViewOptions(p, s, o, f, action), HandlerDef(this, "controllers.DailyReconciliations", "drViewOptions", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """drsdrViewOptions/$action<[^/]+>"""))
   }
}
        

// @LINE:201
case controllers_Terminals_update106(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Terminals.update(id), HandlerDef(this, "controllers.Terminals", "update", Seq(classOf[Long]),"POST", """#GET   /terminals/                 						controllers.Terminals.list()
#GET   /terminals/new/:sid/:tid   							controllers.Terminals.showBlank(sid:Long, tid:Long) """, Routes.prefix + """terminals/$id<[^/]+>"""))
   }
}
        

// @LINE:203
case controllers_Terminals_delete107(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Terminals.delete(id), HandlerDef(this, "controllers.Terminals", "delete", Seq(classOf[Long]),"GET", """#GET   /terminals/:id/:sid         						controllers.Terminals.edit(id:Long, sid:Long)""", Routes.prefix + """terminals/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:204
case controllers_Terminals_save108(params) => {
   call { 
        invokeHandler(controllers.Terminals.save(), HandlerDef(this, "controllers.Terminals", "save", Nil,"POST", """""", Routes.prefix + """terminals/"""))
   }
}
        

// @LINE:205
case controllers_Terminals_summary109(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("thead", None)) { (id, thead) =>
        invokeHandler(controllers.Terminals.summary(id, thead), HandlerDef(this, "controllers.Terminals", "summary", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """terminals/$id<[^/]+>/$thead<[^/]+>"""))
   }
}
        

// @LINE:210
case controllers_Shifts_list110(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("status")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("OPEN")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Shifts.list(p, s, o, f, pg), HandlerDef(this, "controllers.Shifts", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """shifts/"""))
   }
}
        

// @LINE:211
case controllers_Shifts_showBlank111(params) => {
   call(params.fromPath[Long]("sid", None), params.fromQuery[String]("thead", None), params.fromPath[String]("action", None)) { (sid, thead, action) =>
        invokeHandler(controllers.Shifts.showBlank(sid, thead, action), HandlerDef(this, "controllers.Shifts", "showBlank", Seq(classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """shifts/new/$sid<[^/]+>/$action<[^/]+>"""))
   }
}
        

// @LINE:212
case controllers_Shifts_update112(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("sid", None), params.fromPath[String]("action", None)) { (id, sid, action) =>
        invokeHandler(controllers.Shifts.update(id, sid, action), HandlerDef(this, "controllers.Shifts", "update", Seq(classOf[Long], classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """shifts/edit/$id<[^/]+>/$sid<[^/]+>/$action<[^/]+>"""))
   }
}
        

// @LINE:213
case controllers_Shifts_edit113(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("sid", None), params.fromQuery[String]("action", Some("ALL"))) { (id, sid, action) =>
        invokeHandler(controllers.Shifts.edit(id, sid, action), HandlerDef(this, "controllers.Shifts", "edit", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """shifts/$id<[^/]+>/$sid<[^/]+>"""))
   }
}
        

// @LINE:214
case controllers_Shifts_delete114(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Shifts.delete(id), HandlerDef(this, "controllers.Shifts", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """shifts/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:215
case controllers_Shifts_save115(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[Long]("sid", None), params.fromPath[String]("action", None)) { (id, sid, action) =>
        invokeHandler(controllers.Shifts.save(id, sid, action), HandlerDef(this, "controllers.Shifts", "save", Seq(classOf[Long], classOf[Long], classOf[String]),"POST", """""", Routes.prefix + """shifts/$id<[^/]+>/$sid<[^/]+>/$action<[^/]+>"""))
   }
}
        

// @LINE:216
case controllers_Shifts_submit116(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Shifts.submit(id), HandlerDef(this, "controllers.Shifts", "submit", Seq(classOf[Long]),"POST", """""", Routes.prefix + """shifts/$id<[^/]+>"""))
   }
}
        

// @LINE:218
case controllers_Shifts_storeSuppliersList117(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("name")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some(""))) { (p, s, o, f) =>
        invokeHandler(controllers.Shifts.storeSuppliersList(p, s, o, f), HandlerDef(this, "controllers.Shifts", "storeSuppliersList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """#POST  /shifts/saveShiftSales         						controllers.Shifts.saveShiftSales()""", Routes.prefix + """shifts/storeSuppliers"""))
   }
}
        

// @LINE:223
case controllers_Timesheets_list118(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("status")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Timesheets.list(p, s, o, f, pg), HandlerDef(this, "controllers.Timesheets", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """timesheets/"""))
   }
}
        

// @LINE:224
case controllers_Timesheets_showBlank119(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.Timesheets.showBlank(sid), HandlerDef(this, "controllers.Timesheets", "showBlank", Seq(classOf[Long]),"GET", """""", Routes.prefix + """timesheets/new/$sid<[^/]+>"""))
   }
}
        

// @LINE:225
case controllers_Timesheets_save120(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.Timesheets.save(sid), HandlerDef(this, "controllers.Timesheets", "save", Seq(classOf[Long]),"POST", """""", Routes.prefix + """timesheets/$sid<[^/]+>"""))
   }
}
        

// @LINE:226
case controllers_Timesheets_edit121(params) => {
   call(params.fromPath[Long]("tid", None), params.fromPath[Long]("sid", None), params.fromQuery[String]("action", Some("ALL"))) { (tid, sid, action) =>
        invokeHandler(controllers.Timesheets.edit(tid, sid, action), HandlerDef(this, "controllers.Timesheets", "edit", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """timesheets/$tid<[^/]+>/$sid<[^/]+>"""))
   }
}
        

// @LINE:227
case controllers_Timesheets_update122(params) => {
   call(params.fromPath[Long]("tid", None), params.fromPath[Long]("sid", None)) { (tid, sid) =>
        invokeHandler(controllers.Timesheets.update(tid, sid), HandlerDef(this, "controllers.Timesheets", "update", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """timesheets/edit/$tid<[^/]+>/$sid<[^/]+>"""))
   }
}
        

// @LINE:228
case controllers_Timesheets_delete123(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.Timesheets.delete(id), HandlerDef(this, "controllers.Timesheets", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """timesheets/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:232
case controllers_Timesheets_listForsk124(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("status")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Timesheets.listForsk(p, s, o, f, pg), HandlerDef(this, "controllers.Timesheets", "listForsk", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """timesheetsForsk/"""))
   }
}
        

// @LINE:233
case controllers_Timesheets_showBlankForsk125(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.Timesheets.showBlankForsk(sid), HandlerDef(this, "controllers.Timesheets", "showBlankForsk", Seq(classOf[Long]),"GET", """""", Routes.prefix + """timesheetsForsk/new/$sid<[^/]+>"""))
   }
}
        

// @LINE:234
case controllers_Timesheets_saveForsk126(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.Timesheets.saveForsk(sid), HandlerDef(this, "controllers.Timesheets", "saveForsk", Seq(classOf[Long]),"POST", """""", Routes.prefix + """timesheetsForsk/$sid<[^/]+>"""))
   }
}
        

// @LINE:235
case controllers_Timesheets_editForsk127(params) => {
   call(params.fromPath[Long]("tid", None), params.fromPath[Long]("sid", None), params.fromQuery[String]("action", Some("ALL"))) { (tid, sid, action) =>
        invokeHandler(controllers.Timesheets.editForsk(tid, sid, action), HandlerDef(this, "controllers.Timesheets", "editForsk", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """timesheetsForsk/$tid<[^/]+>/$sid<[^/]+>"""))
   }
}
        

// @LINE:236
case controllers_Timesheets_updateForsk128(params) => {
   call(params.fromPath[Long]("tid", None), params.fromPath[Long]("sid", None)) { (tid, sid) =>
        invokeHandler(controllers.Timesheets.updateForsk(tid, sid), HandlerDef(this, "controllers.Timesheets", "updateForsk", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """timesheetsForsk/edit/$tid<[^/]+>/$sid<[^/]+>"""))
   }
}
        

// @LINE:238
case controllers_Timesheets_showSelectPage129(params) => {
   call { 
        invokeHandler(controllers.Timesheets.showSelectPage(), HandlerDef(this, "controllers.Timesheets", "showSelectPage", Nil,"GET", """""", Routes.prefix + """timesheetProcessing/showSelectPage"""))
   }
}
        

// @LINE:239
case controllers_Timesheets_getTimesheets130(params) => {
   call { 
        invokeHandler(controllers.Timesheets.getTimesheets(), HandlerDef(this, "controllers.Timesheets", "getTimesheets", Nil,"POST", """""", Routes.prefix + """timesheetProcessing/timesheetList"""))
   }
}
        

// @LINE:240
case controllers_Timesheets_showSelectPageForSK131(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.Timesheets.showSelectPageForSK(sid), HandlerDef(this, "controllers.Timesheets", "showSelectPageForSK", Seq(classOf[Long]),"GET", """""", Routes.prefix + """timesheetProcessing/showSelectPageForSK/$sid<[^/]+>"""))
   }
}
        

// @LINE:245
case controllers_Timesheets_showBlankForHeadOffice132(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.Timesheets.showBlankForHeadOffice(sid), HandlerDef(this, "controllers.Timesheets", "showBlankForHeadOffice", Seq(classOf[Long]),"GET", """""", Routes.prefix + """timesheetsForHeadOffice/headOfficeNew/$sid<[^/]+>"""))
   }
}
        

// @LINE:246
case controllers_Application_getTimeSheetSave133(params) => {
   call(params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("startTimeHour", None), params.fromQuery[String]("startTimeMin", None), params.fromQuery[String]("endTimeHour", None), params.fromQuery[String]("endTimeMin", None), params.fromQuery[String]("duration", None), params.fromQuery[String]("textArea", None), params.fromQuery[String]("leaveType", None)) { (empId, date, startTimeHour, startTimeMin, endTimeHour, endTimeMin, duration, textArea, leaveType) =>
        invokeHandler(controllers.Application.getTimeSheetSave(empId, date, startTimeHour, startTimeMin, endTimeHour, endTimeMin, duration, textArea, leaveType), HandlerDef(this, "controllers.Application", "getTimeSheetSave", Seq(classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """timesheetsForHeadOffice/saveTimeSheetHours/$empId<[^/]+>"""))
   }
}
        

// @LINE:247
case controllers_Timesheets_saveForHeadOfficeTimeSheet134(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None)) { (sid, empId) =>
        invokeHandler(controllers.Timesheets.saveForHeadOfficeTimeSheet(sid, empId), HandlerDef(this, "controllers.Timesheets", "saveForHeadOfficeTimeSheet", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """timesheetsForHeadOffice/$sid<[^/]+>/$empId<[^/]+>"""))
   }
}
        

// @LINE:248
case controllers_Timesheets_listForHeadOffice135(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("status")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.Timesheets.listForHeadOffice(p, s, o, f, pg), HandlerDef(this, "controllers.Timesheets", "listForHeadOffice", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """timesheetsForHeadOffice/"""))
   }
}
        

// @LINE:249
case controllers_Timesheets_editFormForHeadOffice136(params) => {
   call(params.fromPath[Long]("tid", None), params.fromPath[Long]("sid", None), params.fromQuery[String]("action", Some("ALL"))) { (tid, sid, action) =>
        invokeHandler(controllers.Timesheets.editFormForHeadOffice(tid, sid, action), HandlerDef(this, "controllers.Timesheets", "editFormForHeadOffice", Seq(classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """timesheetsForHeadOffice/$tid<[^/]+>/$sid<[^/]+>"""))
   }
}
        

// @LINE:250
case controllers_Timesheets_showSelectPageForHeadOfficeTimeSheet137(params) => {
   call { 
        invokeHandler(controllers.Timesheets.showSelectPageForHeadOfficeTimeSheet(), HandlerDef(this, "controllers.Timesheets", "showSelectPageForHeadOfficeTimeSheet", Nil,"GET", """""", Routes.prefix + """timesheetsForHeadOffice/showSelectPageForHeadOfficeTimeSheet/"""))
   }
}
        

// @LINE:251
case controllers_Timesheets_getAllHeadOfficeTimesheetsToVerify138(params) => {
   call { 
        invokeHandler(controllers.Timesheets.getAllHeadOfficeTimesheetsToVerify(), HandlerDef(this, "controllers.Timesheets", "getAllHeadOfficeTimesheetsToVerify", Nil,"GET", """""", Routes.prefix + """timesheetsForHeadOffice/listForApproval/"""))
   }
}
        

// @LINE:252
case controllers_Timesheets_getHeadOfficeTimesheets139(params) => {
   call { 
        invokeHandler(controllers.Timesheets.getHeadOfficeTimesheets(), HandlerDef(this, "controllers.Timesheets", "getHeadOfficeTimesheets", Nil,"POST", """""", Routes.prefix + """timesheetProcessing/headOfficeTimesheetList/"""))
   }
}
        

// @LINE:253
case controllers_Timesheets_showSelectPageForVerify140(params) => {
   call(params.fromQuery[String]("date", None)) { (date) =>
        invokeHandler(controllers.Timesheets.showSelectPageForVerify(date), HandlerDef(this, "controllers.Timesheets", "showSelectPageForVerify", Seq(classOf[String]),"GET", """""", Routes.prefix + """timesheetsForHeadOffice/showSelectPageForHOTVerification"""))
   }
}
        

// @LINE:254
case controllers_Timesheets_getHeadOfficeTimesheetsForVerify141(params) => {
   call { 
        invokeHandler(controllers.Timesheets.getHeadOfficeTimesheetsForVerify(), HandlerDef(this, "controllers.Timesheets", "getHeadOfficeTimesheetsForVerify", Nil,"GET", """""", Routes.prefix + """timesheetsForHeadOffice/listForVerify/"""))
   }
}
        

// @LINE:255
case controllers_Timesheets_updateWeeklyHOTimesheetsByWeekDate142(params) => {
   call(params.fromQuery[String]("stDate", None)) { (stDate) =>
        invokeHandler(controllers.Timesheets.updateWeeklyHOTimesheetsByWeekDate(stDate), HandlerDef(this, "controllers.Timesheets", "updateWeeklyHOTimesheetsByWeekDate", Seq(classOf[String]),"POST", """""", Routes.prefix + """updateStatusToApproved"""))
   }
}
        

// @LINE:256
case controllers_Timesheets_editFormForHeadOfficeRejectedTimesheetList143(params) => {
   call(params.fromPath[Long]("timesheetId", None), params.fromPath[Long]("empId", None), params.fromPath[Long]("storeId", None), params.fromPath[String]("pageAction", None)) { (timesheetId, empId, storeId, pageAction) =>
        invokeHandler(controllers.Timesheets.editFormForHeadOfficeRejectedTimesheetList(timesheetId, empId, storeId, pageAction), HandlerDef(this, "controllers.Timesheets", "editFormForHeadOfficeRejectedTimesheetList", Seq(classOf[Long], classOf[Long], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """timesheetsForHeadOffice/RejectedTimesheetEdit/$timesheetId<[^/]+>/$empId<[^/]+>/$storeId<[^/]+>/$pageAction<[^/]+>"""))
   }
}
        

// @LINE:257
case controllers_Timesheets_updateEditListForRejectedTS144(params) => {
   call(params.fromQuery[Long]("empId", None), params.fromQuery[Long]("storeId", None)) { (empId, storeId) =>
        invokeHandler(controllers.Timesheets.updateEditListForRejectedTS(empId, storeId), HandlerDef(this, "controllers.Timesheets", "updateEditListForRejectedTS", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """timesheetUpdated/"""))
   }
}
        

// @LINE:258
case controllers_Timesheets_verifyHOTimesheet145(params) => {
   call { 
        invokeHandler(controllers.Timesheets.verifyHOTimesheet(), HandlerDef(this, "controllers.Timesheets", "verifyHOTimesheet", Nil,"GET", """""", Routes.prefix + """verifyHOTimesheet/"""))
   }
}
        

// @LINE:259
case controllers_Timesheets_updateRejectedStatusForHOTimesheets146(params) => {
   call { 
        invokeHandler(controllers.Timesheets.updateRejectedStatusForHOTimesheets(), HandlerDef(this, "controllers.Timesheets", "updateRejectedStatusForHOTimesheets", Nil,"GET", """""", Routes.prefix + """updateRejectedHOTimesheets/"""))
   }
}
        

// @LINE:264
case controllers_Reports_getReportHome147(params) => {
   call { 
        invokeHandler(controllers.Reports.getReportHome(), HandlerDef(this, "controllers.Reports", "getReportHome", Nil,"GET", """""", Routes.prefix + """reports/"""))
   }
}
        

// @LINE:265
case controllers_Reports_getReportHomeForStore148(params) => {
   call { 
        invokeHandler(controllers.Reports.getReportHomeForStore(), HandlerDef(this, "controllers.Reports", "getReportHomeForStore", Nil,"GET", """""", Routes.prefix + """reports/Store"""))
   }
}
        

// @LINE:266
case controllers_Reports_getReport149(params) => {
   call { 
        invokeHandler(controllers.Reports.getReport(), HandlerDef(this, "controllers.Reports", "getReport", Nil,"POST", """""", Routes.prefix + """reports/getReport/"""))
   }
}
        

// @LINE:271
case controllers_AccountHolders_list150(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("account_holder")), params.fromQuery[String]("o", Some("asc")), params.fromQuery[String]("f", Some("")), params.fromQuery[String]("pg", Some("VIEW"))) { (p, s, o, f, pg) =>
        invokeHandler(controllers.AccountHolders.list(p, s, o, f, pg), HandlerDef(this, "controllers.AccountHolders", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """accountHolder/list"""))
   }
}
        

// @LINE:273
case controllers_AccountHolders_showBlank151(params) => {
   call { 
        invokeHandler(controllers.AccountHolders.showBlank(), HandlerDef(this, "controllers.AccountHolders", "showBlank", Nil,"GET", """""", Routes.prefix + """accountHolder/new"""))
   }
}
        

// @LINE:274
case controllers_AccountHolders_save152(params) => {
   call { 
        invokeHandler(controllers.AccountHolders.save(), HandlerDef(this, "controllers.AccountHolders", "save", Nil,"POST", """""", Routes.prefix + """accountHolder/"""))
   }
}
        

// @LINE:275
case controllers_AccountHolders_edit153(params) => {
   call(params.fromPath[Long]("id", None), params.fromQuery[String]("action", Some("ALL"))) { (id, action) =>
        invokeHandler(controllers.AccountHolders.edit(id, action), HandlerDef(this, "controllers.AccountHolders", "edit", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """accountHolder/$id<[^/]+>"""))
   }
}
        

// @LINE:276
case controllers_AccountHolders_update154(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.AccountHolders.update(id), HandlerDef(this, "controllers.AccountHolders", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """accountHolder/$id<[^/]+>"""))
   }
}
        

// @LINE:277
case controllers_AccountHolders_delete155(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.AccountHolders.delete(id), HandlerDef(this, "controllers.AccountHolders", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """accountHolder/$id<[^/]+>/delete"""))
   }
}
        

// @LINE:279
case controllers_Application_javascriptRoutes156(params) => {
   call { 
        invokeHandler(controllers.Application.javascriptRoutes, HandlerDef(this, "controllers.Application", "javascriptRoutes", Nil,"GET", """""", Routes.prefix + """javascriptRoutes"""))
   }
}
        

// @LINE:283
case controllers_InvoiceInventory_showUploadPage157(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.showUploadPage(), HandlerDef(this, "controllers.InvoiceInventory", "showUploadPage", Nil,"GET", """""", Routes.prefix + """InvoiceInventory/"""))
   }
}
        

// @LINE:284
case controllers_InvoiceInventory_showPaymentPage158(params) => {
   call(params.fromPath[String]("selectedCompany", None), params.fromPath[String]("selectedStore", None), params.fromPath[String]("selectedCategory", None), params.fromPath[String]("selectedPaymentTerm", None)) { (selectedCompany, selectedStore, selectedCategory, selectedPaymentTerm) =>
        invokeHandler(controllers.InvoiceInventory.showPaymentPage(selectedCompany, selectedStore, selectedCategory, selectedPaymentTerm), HandlerDef(this, "controllers.InvoiceInventory", "showPaymentPage", Seq(classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """InvoiceInventory/showPaymentPage/$selectedCompany<[^/]+>/$selectedStore<[^/]+>/$selectedCategory<[^/]+>/$selectedPaymentTerm<[^/]+>"""))
   }
}
        

// @LINE:285
case controllers_InvoiceInventory_showUploadPageForHeadOffice159(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.showUploadPageForHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "showUploadPageForHeadOffice", Nil,"GET", """""", Routes.prefix + """InvoiceInventory/HeadOfficeUpload"""))
   }
}
        

// @LINE:286
case controllers_InvoiceInventory_showDownloadPage160(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.showDownloadPage(), HandlerDef(this, "controllers.InvoiceInventory", "showDownloadPage", Nil,"GET", """""", Routes.prefix + """InvoiceInventory/download"""))
   }
}
        

// @LINE:287
case controllers_InvoiceInventory_uploadInvoices161(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.InvoiceInventory.uploadInvoices(id), HandlerDef(this, "controllers.InvoiceInventory", "uploadInvoices", Seq(classOf[Long]),"POST", """""", Routes.prefix + """InvoiceInventory/upload/$id<[^/]+>"""))
   }
}
        

// @LINE:288
case controllers_InvoiceInventory_uploadInvoicesByHeadOffice162(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.uploadInvoicesByHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "uploadInvoicesByHeadOffice", Nil,"POST", """""", Routes.prefix + """InvoiceInventory/uploadByHeadOffice"""))
   }
}
        

// @LINE:289
case controllers_InvoiceInventory_getInvoices163(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.getInvoices(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoices", Nil,"POST", """""", Routes.prefix + """InvoiceInventory/download/list"""))
   }
}
        

// @LINE:290
case controllers_InvoiceInventory_getInvoicesAfterMove164(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("type", None)) { (id, playframework_escape_type) =>
        invokeHandler(controllers.InvoiceInventory.getInvoicesAfterMove(id, playframework_escape_type), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesAfterMove", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """InvoiceInventory/download/list/$id<[^/]+>/$type<[^/]+>"""))
   }
}
        

// @LINE:291
case controllers_InvoiceInventory_getInvoicesAfterPaymentDone165(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("paymentTerms", None), params.fromPath[Long]("companyId", None), params.fromPath[String]("filter", None), params.fromPath[String]("selectedCategory", None)) { (id, paymentTerms, companyId, filter, selectedCategory) =>
        invokeHandler(controllers.InvoiceInventory.getInvoicesAfterPaymentDone(id, paymentTerms, companyId, filter, selectedCategory), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesAfterPaymentDone", Seq(classOf[Long], classOf[String], classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """InvoiceInventory/list/invoicesAfterPayment/$id<[^/]+>/$paymentTerms<[^/]+>/$companyId<[^/]+>/$filter<[^/]+>/$selectedCategory<[^/]+>"""))
   }
}
        

// @LINE:292
case controllers_InvoiceInventory_move166(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.InvoiceInventory.move(id), HandlerDef(this, "controllers.InvoiceInventory", "move", Seq(classOf[Long]),"POST", """""", Routes.prefix + """InvoiceInventory/list/move/$id<[^/]+>"""))
   }
}
        

// @LINE:293
case controllers_InvoiceInventory_headOfficeMove167(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.InvoiceInventory.headOfficeMove(id), HandlerDef(this, "controllers.InvoiceInventory", "headOfficeMove", Seq(classOf[Long]),"POST", """""", Routes.prefix + """InvoiceInventory/headOfficeList/headOfficeMove/$id<[^/]+>"""))
   }
}
        

// @LINE:294
case controllers_InvoiceInventory_paymentMove168(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("paymentTerms", None), params.fromPath[Long]("companyId", None), params.fromPath[String]("filter", None), params.fromPath[String]("selectedCategory", None)) { (id, paymentTerms, companyId, filter, selectedCategory) =>
        invokeHandler(controllers.InvoiceInventory.paymentMove(id, paymentTerms, companyId, filter, selectedCategory), HandlerDef(this, "controllers.InvoiceInventory", "paymentMove", Seq(classOf[Long], classOf[String], classOf[Long], classOf[String], classOf[String]),"POST", """""", Routes.prefix + """InvoiceInventory/paymentList/paymentMove/$id<[^/]+>/$paymentTerms<[^/]+>/$companyId<[^/]+>/$selectedCategory<[^/]+>/$filter<[^/]+>"""))
   }
}
        

// @LINE:295
case controllers_InvoiceInventory_delete169(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.InvoiceInventory.delete(id), HandlerDef(this, "controllers.InvoiceInventory", "delete", Seq(classOf[Long]),"GET", """""", Routes.prefix + """InvoiceInventory/delete/$id<[^/]+>"""))
   }
}
        

// @LINE:296
case controllers_InvoiceInventory_getInvoicesByStoreAndType170(params) => {
   call(params.fromPath[Long]("id", None), params.fromPath[String]("type", None)) { (id, playframework_escape_type) =>
        invokeHandler(controllers.InvoiceInventory.getInvoicesByStoreAndType(id, playframework_escape_type), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesByStoreAndType", Seq(classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """InvoiceInventory/invoiceListjustView/$id<[^/]+>/$type<[^/]+>"""))
   }
}
        

// @LINE:297
case controllers_InvoiceInventory_getInvoicesForPayment171(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.getInvoicesForPayment(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesForPayment", Nil,"POST", """""", Routes.prefix + """InvoiceInventory/getInvoicesForPayment/list"""))
   }
}
        

// @LINE:298
case controllers_InvoiceInventory_displayUploadedForSK172(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.InvoiceInventory.displayUploadedForSK(id), HandlerDef(this, "controllers.InvoiceInventory", "displayUploadedForSK", Seq(classOf[Long]),"POST", """""", Routes.prefix + """InvoiceInventory/displayUploaded/list/$id<[^/]+>"""))
   }
}
        

// @LINE:299
case controllers_InvoiceInventory_dateSelectPageForSK173(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.InvoiceInventory.dateSelectPageForSK(sid), HandlerDef(this, "controllers.InvoiceInventory", "dateSelectPageForSK", Seq(classOf[Long]),"GET", """""", Routes.prefix + """InvoiceInventory/dateSelectPageForSK/$sid<[^/]+>"""))
   }
}
        

// @LINE:300
case controllers_InvoiceInventory_dateSelectPageForHeadOffice174(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.dateSelectPageForHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "dateSelectPageForHeadOffice", Nil,"GET", """""", Routes.prefix + """InvoiceInventory/dateSelectPageForHeadOffice"""))
   }
}
        

// @LINE:301
case controllers_InvoiceInventory_displayUploadedForHeadOffice175(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.displayUploadedForHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "displayUploadedForHeadOffice", Nil,"POST", """""", Routes.prefix + """InvoiceInventory/displayUploadedForHeadOffice/list/"""))
   }
}
        

// @LINE:302
case controllers_InvoiceInventory_filterPaymentInvoices176(params) => {
   call(params.fromPath[String]("companyId", None), params.fromPath[String]("selectedCategoryForEnable", None), params.fromQuery[String]("f", Some("")), params.fromQuery[Long]("refInvoiceId", Some(0L)), params.fromQuery[String]("paymentTerms", Some("ALL"))) { (companyId, selectedCategoryForEnable, f, refInvoiceId, paymentTerms) =>
        invokeHandler(controllers.InvoiceInventory.filterPaymentInvoices(companyId, selectedCategoryForEnable, f, refInvoiceId, paymentTerms), HandlerDef(this, "controllers.InvoiceInventory", "filterPaymentInvoices", Seq(classOf[String], classOf[String], classOf[String], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """InvoiceInventory/$companyId<[^/]+>/filter/$selectedCategoryForEnable<[^/]+>"""))
   }
}
        

// @LINE:303
case controllers_InvoiceInventory_getInvoicesBySupplierName177(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.getInvoicesBySupplierName(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesBySupplierName", Nil,"GET", """""", Routes.prefix + """InvoiceInventory/invoicesBy/supplier/name"""))
   }
}
        

// @LINE:304
case controllers_InvoiceInventory_getInvoicesBySupplierNameInHeadOffice178(params) => {
   call { 
        invokeHandler(controllers.InvoiceInventory.getInvoicesBySupplierNameInHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesBySupplierNameInHeadOffice", Nil,"GET", """""", Routes.prefix + """InvoiceInventory/HeadOffice/invoicesBy/supplier/name"""))
   }
}
        

// @LINE:307
case controllers_MonthlyReports_showUploadPage179(params) => {
   call { 
        invokeHandler(controllers.MonthlyReports.showUploadPage(), HandlerDef(this, "controllers.MonthlyReports", "showUploadPage", Nil,"GET", """""", Routes.prefix + """monthlyReports/"""))
   }
}
        

// @LINE:308
case controllers_MonthlyReports_uploadReports180(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.MonthlyReports.uploadReports(id), HandlerDef(this, "controllers.MonthlyReports", "uploadReports", Seq(classOf[Long]),"POST", """""", Routes.prefix + """monthlyReports/upload/$id<[^/]+>"""))
   }
}
        

// @LINE:309
case controllers_MonthlyReports_showUploadedReports181(params) => {
   call(params.fromPath[Long]("sid", None)) { (sid) =>
        invokeHandler(controllers.MonthlyReports.showUploadedReports(sid), HandlerDef(this, "controllers.MonthlyReports", "showUploadedReports", Seq(classOf[Long]),"GET", """""", Routes.prefix + """monthlyReports/uploaded/$sid<[^/]+>"""))
   }
}
        

// @LINE:310
case controllers_MonthlyReports_displayUploaded182(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(controllers.MonthlyReports.displayUploaded(id), HandlerDef(this, "controllers.MonthlyReports", "displayUploaded", Seq(classOf[Long]),"POST", """""", Routes.prefix + """monthlyReports/displayUploaded/$id<[^/]+>"""))
   }
}
        

// @LINE:311
case controllers_MonthlyReports_viewUploadedReports183(params) => {
   call { 
        invokeHandler(controllers.MonthlyReports.viewUploadedReports(), HandlerDef(this, "controllers.MonthlyReports", "viewUploadedReports", Nil,"GET", """""", Routes.prefix + """monthlyReports/view"""))
   }
}
        

// @LINE:312
case controllers_MonthlyReports_getUploadedReports184(params) => {
   call { 
        invokeHandler(controllers.MonthlyReports.getUploadedReports(), HandlerDef(this, "controllers.MonthlyReports", "getUploadedReports", Nil,"POST", """""", Routes.prefix + """monthlyReports/getUploaded"""))
   }
}
        

// @LINE:316
case controllers_ManagementReports_getReportsHome185(params) => {
   call { 
        invokeHandler(controllers.ManagementReports.getReportsHome(), HandlerDef(this, "controllers.ManagementReports", "getReportsHome", Nil,"GET", """""", Routes.prefix + """managementReports"""))
   }
}
        

// @LINE:317
case controllers_ManagementReports_getManagementReport186(params) => {
   call { 
        invokeHandler(controllers.ManagementReports.getManagementReport(), HandlerDef(this, "controllers.ManagementReports", "getManagementReport", Nil,"POST", """""", Routes.prefix + """managementReports/getReport"""))
   }
}
        

// @LINE:321
case controllers_HoForms_showHoFormUploadPage187(params) => {
   call { 
        invokeHandler(controllers.HoForms.showHoFormUploadPage(), HandlerDef(this, "controllers.HoForms", "showHoFormUploadPage", Nil,"GET", """""", Routes.prefix + """HeadOfficeForms/"""))
   }
}
        

// @LINE:322
case controllers_HoForms_uploadHoFormsByHeadOffice188(params) => {
   call { 
        invokeHandler(controllers.HoForms.uploadHoFormsByHeadOffice(), HandlerDef(this, "controllers.HoForms", "uploadHoFormsByHeadOffice", Nil,"POST", """""", Routes.prefix + """HeadOfficeForms/upload"""))
   }
}
        

// @LINE:323
case controllers_HoForms_getAllHeadOfficeForms189(params) => {
   call { 
        invokeHandler(controllers.HoForms.getAllHeadOfficeForms(), HandlerDef(this, "controllers.HoForms", "getAllHeadOfficeForms", Nil,"GET", """""", Routes.prefix + """HeadOfficeForms/headOfficeFormsList"""))
   }
}
        

// @LINE:328
case controllers_Application_checkForUnique190(params) => {
   call(params.fromPath[String]("param", None), params.fromPath[String]("type", None), params.fromPath[String]("mode", None)) { (param, playframework_escape_type, mode) =>
        invokeHandler(controllers.Application.checkForUnique(param, playframework_escape_type, mode), HandlerDef(this, "controllers.Application", "checkForUnique", Seq(classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """checkForUnique/$param<[^/]+>/$type<[^/]+>/$mode<[^/]+>"""))
   }
}
        

// @LINE:329
case controllers_Application_checkTimesheetExists191(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None), params.fromQuery[String]("leaveType", None), params.fromPath[String]("sh", None), params.fromQuery[String]("sm", None), params.fromPath[String]("eh", None), params.fromQuery[String]("em", None)) { (sid, empId, date, endDate, leaveType, sh, sm, eh, em) =>
        invokeHandler(controllers.Application.checkTimesheetExists(sid, empId, date, endDate, leaveType, sh, sm, eh, em), HandlerDef(this, "controllers.Application", "checkTimesheetExists", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """checkTimesheetExists/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>"""))
   }
}
        

// @LINE:330
case controllers_Application_checkTimesheetExistsForLeave192(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None)) { (sid, empId, date, endDate) =>
        invokeHandler(controllers.Application.checkTimesheetExistsForLeave(sid, empId, date, endDate), HandlerDef(this, "controllers.Application", "checkTimesheetExistsForLeave", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """checkTimesheetExistsForLeave/$sid<[^/]+>/$empId<[^/]+>"""))
   }
}
        

// @LINE:331
case controllers_Application_checkTimesheetExistsEditPage193(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None), params.fromQuery[String]("leaveType", None), params.fromPath[String]("sh", None), params.fromQuery[String]("sm", None), params.fromPath[String]("eh", None), params.fromQuery[String]("em", None), params.fromQuery[Long]("tid", None)) { (sid, empId, date, endDate, leaveType, sh, sm, eh, em, tid) =>
        invokeHandler(controllers.Application.checkTimesheetExistsEditPage(sid, empId, date, endDate, leaveType, sh, sm, eh, em, tid), HandlerDef(this, "controllers.Application", "checkTimesheetExistsEditPage", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """checkTimesheetExistsEditPage/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>"""))
   }
}
        

// @LINE:332
case controllers_Application_checkTimesheetExistsForLeaveEditPage194(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None), params.fromQuery[Long]("tid", None)) { (sid, empId, date, endDate, tid) =>
        invokeHandler(controllers.Application.checkTimesheetExistsForLeaveEditPage(sid, empId, date, endDate, tid), HandlerDef(this, "controllers.Application", "checkTimesheetExistsForLeaveEditPage", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """checkTimesheetExistsForLeaveEditPage/$sid<[^/]+>/$empId<[^/]+>"""))
   }
}
        

// @LINE:333
case controllers_Application_storesByCompany195(params) => {
   call(params.fromPath[Long]("cid", None)) { (cid) =>
        invokeHandler(controllers.Application.storesByCompany(cid), HandlerDef(this, "controllers.Application", "storesByCompany", Seq(classOf[Long]),"GET", """""", Routes.prefix + """getStoresByCompany/$cid<[^/]+>"""))
   }
}
        

// @LINE:334
case controllers_Application_checkHeadOfficeTimesheetExists196(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None), params.fromQuery[String]("leaveType", None), params.fromPath[String]("sh", None), params.fromQuery[String]("sm", None), params.fromPath[String]("eh", None), params.fromQuery[String]("em", None)) { (sid, empId, date, endDate, leaveType, sh, sm, eh, em) =>
        invokeHandler(controllers.Application.checkHeadOfficeTimesheetExists(sid, empId, date, endDate, leaveType, sh, sm, eh, em), HandlerDef(this, "controllers.Application", "checkHeadOfficeTimesheetExists", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """checkHeadOfficeTimesheetExists/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>"""))
   }
}
        

// @LINE:335
case controllers_Application_checkHeadOfficeTimesheetExistsForLeave197(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None)) { (sid, empId, date, endDate) =>
        invokeHandler(controllers.Application.checkHeadOfficeTimesheetExistsForLeave(sid, empId, date, endDate), HandlerDef(this, "controllers.Application", "checkHeadOfficeTimesheetExistsForLeave", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """checkHeadOfficeTimesheetExistsForLeave/$sid<[^/]+>/$empId<[^/]+>"""))
   }
}
        

// @LINE:336
case controllers_Application_checkHeadOfficeTimesheetExistsInEditPage198(params) => {
   call(params.fromPath[Long]("sid", None), params.fromPath[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None), params.fromQuery[String]("leaveType", None), params.fromPath[String]("sh", None), params.fromQuery[String]("sm", None), params.fromPath[String]("eh", None), params.fromQuery[String]("em", None), params.fromPath[Long]("tid", None)) { (sid, empId, date, endDate, leaveType, sh, sm, eh, em, tid) =>
        invokeHandler(controllers.Application.checkHeadOfficeTimesheetExistsInEditPage(sid, empId, date, endDate, leaveType, sh, sm, eh, em, tid), HandlerDef(this, "controllers.Application", "checkHeadOfficeTimesheetExistsInEditPage", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Long]),"GET", """""", Routes.prefix + """checkHeadOfficeTimesheetExistsForEdit/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>/$tid<[^/]+>"""))
   }
}
        

// @LINE:337
case controllers_Application_checkHOTTimesheetExistsInEditPageForLeave199(params) => {
   call(params.fromQuery[Long]("storeId", None), params.fromQuery[Long]("empId", None), params.fromQuery[String]("date", None), params.fromQuery[String]("endDate", None), params.fromQuery[Long]("tid", None), params.fromQuery[String]("leaveType", None)) { (storeId, empId, date, endDate, tid, leaveType) =>
        invokeHandler(controllers.Application.checkHOTTimesheetExistsInEditPageForLeave(storeId, empId, date, endDate, tid, leaveType), HandlerDef(this, "controllers.Application", "checkHOTTimesheetExistsInEditPageForLeave", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[Long], classOf[String]),"GET", """""", Routes.prefix + """updateHoEmployeeLeaveType/"""))
   }
}
        
}

}
     