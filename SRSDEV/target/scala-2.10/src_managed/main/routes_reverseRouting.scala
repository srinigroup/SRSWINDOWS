// @SOURCE:D:/SRS PROJECT IN WINDOWS/SRSDEV/conf/routes
// @HASH:458e8eaf1eca6012eaa1ec72cfca5cd7eae99af6
// @DATE:Tue Nov 29 14:37:20 IST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:337
// @LINE:336
// @LINE:335
// @LINE:334
// @LINE:333
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:329
// @LINE:328
// @LINE:323
// @LINE:322
// @LINE:321
// @LINE:317
// @LINE:316
// @LINE:312
// @LINE:311
// @LINE:310
// @LINE:309
// @LINE:308
// @LINE:307
// @LINE:304
// @LINE:303
// @LINE:302
// @LINE:301
// @LINE:300
// @LINE:299
// @LINE:298
// @LINE:297
// @LINE:296
// @LINE:295
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:288
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:279
// @LINE:277
// @LINE:276
// @LINE:275
// @LINE:274
// @LINE:273
// @LINE:271
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:255
// @LINE:254
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
// @LINE:240
// @LINE:239
// @LINE:238
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:228
// @LINE:227
// @LINE:226
// @LINE:225
// @LINE:224
// @LINE:223
// @LINE:218
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:201
// @LINE:195
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
// @LINE:182
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:171
// @LINE:170
// @LINE:169
// @LINE:168
// @LINE:167
// @LINE:165
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:109
// @LINE:107
// @LINE:106
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:57
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:25
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
package controllers {

// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
class ReverseSalesHeads {
    

// @LINE:116
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "salesheads/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:112
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "salesheads/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:115
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "salesheads/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:114
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "salesheads/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:117
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "salesheads/")
}
                                                

// @LINE:113
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "salesheads/new")
}
                                                
    
}
                          

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseExpenseHeads {
    

// @LINE:148
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "expenseheads/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:144
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "expenseheads/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:147
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "expenseheads/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:146
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "expenseheads/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:149
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "expenseheads/")
}
                                                

// @LINE:145
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "expenseheads/new")
}
                                                
    
}
                          

// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
class ReverseTotalSalesHeads {
    

// @LINE:138
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "totalsalesheads/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:137
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "totalsalesheads/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:136
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "totalsalesheads/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:134
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "totalsalesheads/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:139
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "totalsalesheads/")
}
                                                

// @LINE:135
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "totalsalesheads/new")
}
                                                
    
}
                          

// @LINE:218
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
class ReverseShifts {
    

// @LINE:212
def update(id:Long, sid:Long, action:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shifts/edit/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[String]].unbind("action", dynamicString(action)))
}
                                                

// @LINE:214
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shifts/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:210
def list(p:Int = 0, s:String = "status", o:String = "asc", f:String = "OPEN", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shifts/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "status") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "OPEN") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:215
def save(id:Long, sid:Long, action:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shifts/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[String]].unbind("action", dynamicString(action)))
}
                                                

// @LINE:211
def showBlank(sid:Long, thead:String, action:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shifts/new/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[String]].unbind("action", dynamicString(action)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("thead", thead)))))
}
                                                

// @LINE:218
def storeSuppliersList(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shifts/storeSuppliers" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:216
def submit(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "shifts/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:213
def edit(id:Long, sid:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "shifts/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
class ReverseUsers {
    

// @LINE:36
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:31
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:35
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:34
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:38
def register(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/")
}
                                                

// @LINE:33
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/new")
}
                                                

// @LINE:39
def changePassword(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "users/changePassword/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                
    
}
                          

// @LINE:312
// @LINE:311
// @LINE:310
// @LINE:309
// @LINE:308
// @LINE:307
class ReverseMonthlyReports {
    

// @LINE:308
def uploadReports(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "monthlyReports/upload/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:307
def showUploadPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "monthlyReports/")
}
                                                

// @LINE:311
def viewUploadedReports(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "monthlyReports/view")
}
                                                

// @LINE:312
def getUploadedReports(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "monthlyReports/getUploaded")
}
                                                

// @LINE:310
def displayUploaded(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "monthlyReports/displayUploaded/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:309
def showUploadedReports(sid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "monthlyReports/uploaded/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                
    
}
                          

// @LINE:195
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
class ReverseDailyReconciliations {
    

// @LINE:187
def listByDate(p:Int = 0, s:String = "status", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "drs/listByDate" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "status") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:191
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "drs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:186
def list(p:Int = 0, s:String = "status", o:String = "asc", f:String = "OPEN", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "drs/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "status") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "OPEN") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:190
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "drs/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:188
def showBlank(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "drs/new/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:189
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "drs/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:194
def summary(id:Long, weekDate:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "drs/summary/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("weekDate", dynamicString(weekDate)))
}
                                                

// @LINE:195
def drViewOptions(p:Int = 0, s:String = "reportingBusinessDate", o:String = "desc", f:String = "SUBMITTED", action:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "drsdrViewOptions/" + implicitly[PathBindable[String]].unbind("action", dynamicString(action)) + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "reportingBusinessDate") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "desc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "SUBMITTED") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:193
def save(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "drs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/save")
}
                                                
    
}
                          

// @LINE:323
// @LINE:322
// @LINE:321
class ReverseHoForms {
    

// @LINE:323
def getAllHeadOfficeForms(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "HeadOfficeForms/headOfficeFormsList")
}
                                                

// @LINE:322
def uploadHoFormsByHeadOffice(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "HeadOfficeForms/upload")
}
                                                

// @LINE:321
def showHoFormUploadPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "HeadOfficeForms/")
}
                                                
    
}
                          

// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
class ReverseEmployees {
    

// @LINE:74
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:67
def list(p:Int = 0, s:String = "first_name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "first_name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:73
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:68
def listForFilterByStore(p:Int = 0, s:String = "store_name", o:String = "asc", sn:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees/byStore" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "store_name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(sn == "") None else Some(implicitly[QueryStringBindable[String]].unbind("sn", sn)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:75
def myProfile(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Long]].unbind("id", id) + "/myProfile")
}
                                                

// @LINE:72
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:77
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "employees/")
}
                                                

// @LINE:71
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "employees/new")
}
                                                
    
}
                          

// @LINE:266
// @LINE:265
// @LINE:264
class ReverseReports {
    

// @LINE:264
def getReportHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/")
}
                                                

// @LINE:265
def getReportHomeForStore(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "reports/Store")
}
                                                

// @LINE:266
def getReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "reports/getReport/")
}
                                                
    
}
                          

// @LINE:304
// @LINE:303
// @LINE:302
// @LINE:301
// @LINE:300
// @LINE:299
// @LINE:298
// @LINE:297
// @LINE:296
// @LINE:295
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:288
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
class ReverseInvoiceInventory {
    

// @LINE:303
def getInvoicesBySupplierName(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/invoicesBy/supplier/name")
}
                                                

// @LINE:295
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:288
def uploadInvoicesByHeadOffice(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/uploadByHeadOffice")
}
                                                

// @LINE:300
def dateSelectPageForHeadOffice(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/dateSelectPageForHeadOffice")
}
                                                

// @LINE:292
def move(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/list/move/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:296
def getInvoicesByStoreAndType(id:Long, playframework_escape_type:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/invoiceListjustView/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("type", dynamicString(playframework_escape_type)))
}
                                                

// @LINE:284
def showPaymentPage(selectedCompany:String, selectedStore:String, selectedCategory:String, selectedPaymentTerm:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/showPaymentPage/" + implicitly[PathBindable[String]].unbind("selectedCompany", dynamicString(selectedCompany)) + "/" + implicitly[PathBindable[String]].unbind("selectedStore", dynamicString(selectedStore)) + "/" + implicitly[PathBindable[String]].unbind("selectedCategory", dynamicString(selectedCategory)) + "/" + implicitly[PathBindable[String]].unbind("selectedPaymentTerm", dynamicString(selectedPaymentTerm)))
}
                                                

// @LINE:283
def showUploadPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/")
}
                                                

// @LINE:285
def showUploadPageForHeadOffice(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/HeadOfficeUpload")
}
                                                

// @LINE:301
def displayUploadedForHeadOffice(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/displayUploadedForHeadOffice/list/")
}
                                                

// @LINE:286
def showDownloadPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/download")
}
                                                

// @LINE:302
def filterPaymentInvoices(companyId:String, selectedCategoryForEnable:String, f:String = "", refInvoiceId:Long = 0L, paymentTerms:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/" + implicitly[PathBindable[String]].unbind("companyId", dynamicString(companyId)) + "/filter/" + implicitly[PathBindable[String]].unbind("selectedCategoryForEnable", dynamicString(selectedCategoryForEnable)) + queryString(List(if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(refInvoiceId == 0L) None else Some(implicitly[QueryStringBindable[Long]].unbind("refInvoiceId", refInvoiceId)), if(paymentTerms == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("paymentTerms", paymentTerms)))))
}
                                                

// @LINE:293
def headOfficeMove(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/headOfficeList/headOfficeMove/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:287
def uploadInvoices(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/upload/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:297
def getInvoicesForPayment(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/getInvoicesForPayment/list")
}
                                                

// @LINE:298
def displayUploadedForSK(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/displayUploaded/list/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:294
def paymentMove(id:Long, paymentTerms:String, companyId:Long, filter:String, selectedCategory:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/paymentList/paymentMove/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("paymentTerms", dynamicString(paymentTerms)) + "/" + implicitly[PathBindable[Long]].unbind("companyId", companyId) + "/" + implicitly[PathBindable[String]].unbind("selectedCategory", dynamicString(selectedCategory)) + "/" + implicitly[PathBindable[String]].unbind("filter", dynamicString(filter)))
}
                                                

// @LINE:299
def dateSelectPageForSK(sid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/dateSelectPageForSK/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:290
def getInvoicesAfterMove(id:Long, playframework_escape_type:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/download/list/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("type", dynamicString(playframework_escape_type)))
}
                                                

// @LINE:289
def getInvoices(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "InvoiceInventory/download/list")
}
                                                

// @LINE:304
def getInvoicesBySupplierNameInHeadOffice(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/HeadOffice/invoicesBy/supplier/name")
}
                                                

// @LINE:291
def getInvoicesAfterPaymentDone(id:Long, paymentTerms:String, companyId:Long, filter:String, selectedCategory:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "InvoiceInventory/list/invoicesAfterPayment/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("paymentTerms", dynamicString(paymentTerms)) + "/" + implicitly[PathBindable[Long]].unbind("companyId", companyId) + "/" + implicitly[PathBindable[String]].unbind("filter", dynamicString(filter)) + "/" + implicitly[PathBindable[String]].unbind("selectedCategory", dynamicString(selectedCategory)))
}
                                                
    
}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
class ReverseStores {
    

// @LINE:85
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stores/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:81
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stores/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:84
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stores/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:83
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "stores/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:86
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "Stores/")
}
                                                

// @LINE:82
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "stores/new")
}
                                                
    
}
                          

// @LINE:317
// @LINE:316
class ReverseManagementReports {
    

// @LINE:316
def getReportsHome(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "managementReports")
}
                                                

// @LINE:317
def getManagementReport(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "managementReports/getReport")
}
                                                
    
}
                          

// @LINE:171
// @LINE:170
// @LINE:169
// @LINE:168
// @LINE:167
// @LINE:165
class ReversePaymentTenders {
    

// @LINE:170
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "paymentTenders/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:165
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "paymentTenders/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:169
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "paymentTenders/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:168
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "paymentTenders/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:171
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "paymentTenders/")
}
                                                

// @LINE:167
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "paymentTenders/new")
}
                                                
    
}
                          

// @LINE:337
// @LINE:336
// @LINE:335
// @LINE:334
// @LINE:333
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:329
// @LINE:328
// @LINE:279
// @LINE:246
// @LINE:109
// @LINE:107
// @LINE:106
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:40
// @LINE:27
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:331
def checkTimesheetExistsEditPage(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String, tid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkTimesheetExistsEditPage/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + "/" + implicitly[PathBindable[String]].unbind("sh", dynamicString(sh)) + "/" + implicitly[PathBindable[String]].unbind("eh", dynamicString(eh)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)), Some(implicitly[QueryStringBindable[String]].unbind("leaveType", leaveType)), Some(implicitly[QueryStringBindable[String]].unbind("sm", sm)), Some(implicitly[QueryStringBindable[String]].unbind("em", em)), Some(implicitly[QueryStringBindable[Long]].unbind("tid", tid)))))
}
                                                

// @LINE:334
def checkHeadOfficeTimesheetExists(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkHeadOfficeTimesheetExists/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + "/" + implicitly[PathBindable[String]].unbind("sh", dynamicString(sh)) + "/" + implicitly[PathBindable[String]].unbind("eh", dynamicString(eh)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)), Some(implicitly[QueryStringBindable[String]].unbind("leaveType", leaveType)), Some(implicitly[QueryStringBindable[String]].unbind("sm", sm)), Some(implicitly[QueryStringBindable[String]].unbind("em", em)))))
}
                                                

// @LINE:106
def addPayroll(empId:Long, weekDate:String, drId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "payrolls/addPayroll/" + implicitly[PathBindable[Long]].unbind("empId", empId) + "/" + implicitly[PathBindable[String]].unbind("weekDate", dynamicString(weekDate)) + "/" + implicitly[PathBindable[Long]].unbind("drId", drId))
}
                                                

// @LINE:335
def checkHeadOfficeTimesheetExistsForLeave(sid:Long, empId:Long, date:String, endDate:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkHeadOfficeTimesheetExistsForLeave/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)))))
}
                                                

// @LINE:246
def getTimeSheetSave(empId:Long, date:String, startTimeHour:String, startTimeMin:String, endTimeHour:String, endTimeMin:String, duration:String, textArea:String, leaveType:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/saveTimeSheetHours/" + implicitly[PathBindable[Long]].unbind("empId", empId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("startTimeHour", startTimeHour)), Some(implicitly[QueryStringBindable[String]].unbind("startTimeMin", startTimeMin)), Some(implicitly[QueryStringBindable[String]].unbind("endTimeHour", endTimeHour)), Some(implicitly[QueryStringBindable[String]].unbind("endTimeMin", endTimeMin)), Some(implicitly[QueryStringBindable[String]].unbind("duration", duration)), Some(implicitly[QueryStringBindable[String]].unbind("textArea", textArea)), Some(implicitly[QueryStringBindable[String]].unbind("leaveType", leaveType)))))
}
                                                

// @LINE:329
def checkTimesheetExists(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkTimesheetExists/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + "/" + implicitly[PathBindable[String]].unbind("sh", dynamicString(sh)) + "/" + implicitly[PathBindable[String]].unbind("eh", dynamicString(eh)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)), Some(implicitly[QueryStringBindable[String]].unbind("leaveType", leaveType)), Some(implicitly[QueryStringBindable[String]].unbind("sm", sm)), Some(implicitly[QueryStringBindable[String]].unbind("em", em)))))
}
                                                

// @LINE:27
def checkUrl(filePath:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "file/checkUrl" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("filePath", filePath)))))
}
                                                

// @LINE:97
def getSupplierMapping(storeId:Long, suppid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suppliers/getSupplierMappings/" + implicitly[PathBindable[Long]].unbind("storeId", storeId) + "/" + implicitly[PathBindable[Long]].unbind("suppid", suppid))
}
                                                

// @LINE:330
def checkTimesheetExistsForLeave(sid:Long, empId:Long, date:String, endDate:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkTimesheetExistsForLeave/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)))))
}
                                                

// @LINE:328
def checkForUnique(param:String, playframework_escape_type:String, mode:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkForUnique/" + implicitly[PathBindable[String]].unbind("param", dynamicString(param)) + "/" + implicitly[PathBindable[String]].unbind("type", dynamicString(playframework_escape_type)) + "/" + implicitly[PathBindable[String]].unbind("mode", dynamicString(mode)))
}
                                                

// @LINE:16
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:98
def deleteSupplierMapping(suppMappingId:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suppliers/deleteSupplierMappings/" + implicitly[PathBindable[Long]].unbind("suppMappingId", suppMappingId))
}
                                                

// @LINE:101
def getPayout(paytype:String, sid:Long, supid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "payouts/getPayout/" + implicitly[PathBindable[String]].unbind("paytype", dynamicString(paytype)) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("supid", supid))
}
                                                

// @LINE:107
def deletePayroll(pid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "payrolls/deletePayroll/" + implicitly[PathBindable[Long]].unbind("pid", pid))
}
                                                

// @LINE:102
def deletePayout(pid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "payouts/deletePayout/" + implicitly[PathBindable[Long]].unbind("pid", pid))
}
                                                

// @LINE:332
def checkTimesheetExistsForLeaveEditPage(sid:Long, empId:Long, date:String, endDate:String, tid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkTimesheetExistsForLeaveEditPage/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)), Some(implicitly[QueryStringBindable[Long]].unbind("tid", tid)))))
}
                                                

// @LINE:336
def checkHeadOfficeTimesheetExistsInEditPage(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String, tid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "checkHeadOfficeTimesheetExistsForEdit/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + "/" + implicitly[PathBindable[String]].unbind("sh", dynamicString(sh)) + "/" + implicitly[PathBindable[String]].unbind("eh", dynamicString(eh)) + "/" + implicitly[PathBindable[Long]].unbind("tid", tid) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)), Some(implicitly[QueryStringBindable[String]].unbind("leaveType", leaveType)), Some(implicitly[QueryStringBindable[String]].unbind("sm", sm)), Some(implicitly[QueryStringBindable[String]].unbind("em", em)))))
}
                                                

// @LINE:337
def checkHOTTimesheetExistsInEditPageForLeave(storeId:Long, empId:Long, date:String, endDate:String, tid:Long, leaveType:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "updateHoEmployeeLeaveType/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("storeId", storeId)), Some(implicitly[QueryStringBindable[Long]].unbind("empId", empId)), Some(implicitly[QueryStringBindable[String]].unbind("date", date)), Some(implicitly[QueryStringBindable[String]].unbind("endDate", endDate)), Some(implicitly[QueryStringBindable[Long]].unbind("tid", tid)), Some(implicitly[QueryStringBindable[String]].unbind("leaveType", leaveType)))))
}
                                                

// @LINE:333
def storesByCompany(cid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "getStoresByCompany/" + implicitly[PathBindable[Long]].unbind("cid", cid))
}
                                                

// @LINE:40
def verifyCurrentPassword(id:Long, currPwd:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/verfiyPassword/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("currPwd", currPwd)))))
}
                                                

// @LINE:15
def authenticate(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:279
// @LINE:109
def javascriptRoutes(): Call = {
   () match {
// @LINE:109
case () if true => Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
                                                        
// @LINE:279
case () if true => Call("GET", _prefix + { _defaultPrefix } + "javascriptRoutes")
                                                        
   }
}
                                                

// @LINE:14
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:8
def showOptions(page:String, action:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "showOptions/" + implicitly[PathBindable[String]].unbind("page", dynamicString(page)) + "/" + implicitly[PathBindable[String]].unbind("action", dynamicString(action)))
}
                                                
    
}
                          

// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
class ReverseTerminalHeads {
    

// @LINE:127
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "terminalheads/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:122
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "terminalheads/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:126
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "terminalheads/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:125
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "terminalheads/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:128
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "terminalheads/")
}
                                                

// @LINE:124
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "terminalheads/new")
}
                                                
    
}
                          

// @LINE:182
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
class ReverseDailySalesReconciliations {
    

// @LINE:180
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dsrs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:176
def list(p:Int = 0, s:String = "status", o:String = "asc", f:String = "OPEN", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dsrs/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "status") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "OPEN") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:179
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dsrs/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:177
def showBlank(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dsrs/new/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:178
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "dsrs/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:182
def save(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "dsrs/" + implicitly[PathBindable[Long]].unbind("id", id) + "/save")
}
                                                
    
}
                          

// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:201
class ReverseTerminals {
    

// @LINE:204
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "terminals/")
}
                                                

// @LINE:201
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "terminals/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:203
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "terminals/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:205
def summary(id:Long, thead:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "terminals/" + implicitly[PathBindable[Long]].unbind("id", id) + "/" + implicitly[PathBindable[String]].unbind("thead", dynamicString(thead)))
}
                                                
    
}
                          

// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:255
// @LINE:254
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:247
// @LINE:245
// @LINE:240
// @LINE:239
// @LINE:238
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:228
// @LINE:227
// @LINE:226
// @LINE:225
// @LINE:224
// @LINE:223
class ReverseTimesheets {
    

// @LINE:228
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheets/delete/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:238
def showSelectPage(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetProcessing/showSelectPage")
}
                                                

// @LINE:223
def list(p:Int = 0, s:String = "status", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheets/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "status") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:245
def showBlankForHeadOffice(sid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/headOfficeNew/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:247
def saveForHeadOfficeTimeSheet(sid:Long, empId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/" + implicitly[PathBindable[Long]].unbind("sid", sid) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId))
}
                                                

// @LINE:255
def updateWeeklyHOTimesheetsByWeekDate(stDate:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateStatusToApproved" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("stDate", stDate)))))
}
                                                

// @LINE:253
def showSelectPageForVerify(date:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/showSelectPageForHOTVerification" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("date", date)))))
}
                                                

// @LINE:236
def updateForsk(tid:Long, sid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetsForsk/edit/" + implicitly[PathBindable[Long]].unbind("tid", tid) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:227
def update(tid:Long, sid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheets/edit/" + implicitly[PathBindable[Long]].unbind("tid", tid) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:256
def editFormForHeadOfficeRejectedTimesheetList(timesheetId:Long, empId:Long, storeId:Long, pageAction:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/RejectedTimesheetEdit/" + implicitly[PathBindable[Long]].unbind("timesheetId", timesheetId) + "/" + implicitly[PathBindable[Long]].unbind("empId", empId) + "/" + implicitly[PathBindable[Long]].unbind("storeId", storeId) + "/" + implicitly[PathBindable[String]].unbind("pageAction", dynamicString(pageAction)))
}
                                                

// @LINE:250
def showSelectPageForHeadOfficeTimeSheet(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/showSelectPageForHeadOfficeTimeSheet/")
}
                                                

// @LINE:257
def updateEditListForRejectedTS(empId:Long, storeId:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetUpdated/" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("empId", empId)), Some(implicitly[QueryStringBindable[Long]].unbind("storeId", storeId)))))
}
                                                

// @LINE:240
def showSelectPageForSK(sid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetProcessing/showSelectPageForSK/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:254
def getHeadOfficeTimesheetsForVerify(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/listForVerify/")
}
                                                

// @LINE:224
def showBlank(sid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheets/new/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:259
def updateRejectedStatusForHOTimesheets(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "updateRejectedHOTimesheets/")
}
                                                

// @LINE:248
def listForHeadOffice(p:Int = 0, s:String = "status", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "status") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:252
def getHeadOfficeTimesheets(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetProcessing/headOfficeTimesheetList/")
}
                                                

// @LINE:249
def editFormForHeadOffice(tid:Long, sid:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/" + implicitly[PathBindable[Long]].unbind("tid", tid) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:258
def verifyHOTimesheet(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "verifyHOTimesheet/")
}
                                                

// @LINE:225
def save(sid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheets/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:226
def edit(tid:Long, sid:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheets/" + implicitly[PathBindable[Long]].unbind("tid", tid) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:251
def getAllHeadOfficeTimesheetsToVerify(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForHeadOffice/listForApproval/")
}
                                                

// @LINE:239
def getTimesheets(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetProcessing/timesheetList")
}
                                                

// @LINE:234
def saveForsk(sid:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "timesheetsForsk/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:233
def showBlankForsk(sid:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForsk/new/" + implicitly[PathBindable[Long]].unbind("sid", sid))
}
                                                

// @LINE:235
def editForsk(tid:Long, sid:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForsk/" + implicitly[PathBindable[Long]].unbind("tid", tid) + "/" + implicitly[PathBindable[Long]].unbind("sid", sid) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:232
def listForsk(p:Int = 0, s:String = "status", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "timesheetsForsk/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "status") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                
    
}
                          

// @LINE:277
// @LINE:276
// @LINE:275
// @LINE:274
// @LINE:273
// @LINE:271
class ReverseAccountHolders {
    

// @LINE:277
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accountHolder/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:271
def list(p:Int = 0, s:String = "account_holder", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accountHolder/list" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "account_holder") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:275
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accountHolder/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:276
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accountHolder/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:274
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "accountHolder/")
}
                                                

// @LINE:273
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "accountHolder/new")
}
                                                
    
}
                          

// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
class ReverseMediaTenders {
    

// @LINE:159
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mediatenders/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:155
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mediatenders/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:158
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mediatenders/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:157
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "mediatenders/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:160
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "mediatenders/")
}
                                                

// @LINE:156
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "mediatenders/new")
}
                                                
    
}
                          

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
class ReverseSuppliers {
    

// @LINE:94
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suppliers/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:90
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suppliers/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:93
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suppliers/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:96
def getSuppliers(search:String, headOffice:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suppliers/getSuppliers/" + implicitly[PathBindable[String]].unbind("search", dynamicString(search)) + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("headOffice", headOffice)))))
}
                                                

// @LINE:92
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "suppliers/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:95
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "suppliers/")
}
                                                

// @LINE:91
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "suppliers/new")
}
                                                
    
}
                          

// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseProducts {
    

// @LINE:47
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:45
def edit(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:46
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "products/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:50
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = ""): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)))))
}
                                                

// @LINE:53
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "products/")
}
                                                

// @LINE:44
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "products/new")
}
                                                
    
}
                          

// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:57
class ReverseCompanies {
    

// @LINE:62
def delete(id:Long): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companies/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:57
def list(p:Int = 0, s:String = "name", o:String = "asc", f:String = "", pg:String = "VIEW"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companies/" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "name") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)), if(f == "") None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(pg == "VIEW") None else Some(implicitly[QueryStringBindable[String]].unbind("pg", pg)))))
}
                                                

// @LINE:61
def edit(id:Long, action:String = "ALL"): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companies/" + implicitly[PathBindable[Long]].unbind("id", id) + queryString(List(if(action == "ALL") None else Some(implicitly[QueryStringBindable[String]].unbind("action", action)))))
}
                                                

// @LINE:60
def update(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "companies/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                

// @LINE:64
def save(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "companies/")
}
                                                

// @LINE:59
def showBlank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "companies/new")
}
                                                
    
}
                          
}
                  


// @LINE:337
// @LINE:336
// @LINE:335
// @LINE:334
// @LINE:333
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:329
// @LINE:328
// @LINE:323
// @LINE:322
// @LINE:321
// @LINE:317
// @LINE:316
// @LINE:312
// @LINE:311
// @LINE:310
// @LINE:309
// @LINE:308
// @LINE:307
// @LINE:304
// @LINE:303
// @LINE:302
// @LINE:301
// @LINE:300
// @LINE:299
// @LINE:298
// @LINE:297
// @LINE:296
// @LINE:295
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:288
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:279
// @LINE:277
// @LINE:276
// @LINE:275
// @LINE:274
// @LINE:273
// @LINE:271
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:255
// @LINE:254
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
// @LINE:240
// @LINE:239
// @LINE:238
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:228
// @LINE:227
// @LINE:226
// @LINE:225
// @LINE:224
// @LINE:223
// @LINE:218
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:201
// @LINE:195
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
// @LINE:182
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:171
// @LINE:170
// @LINE:169
// @LINE:168
// @LINE:167
// @LINE:165
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:109
// @LINE:107
// @LINE:106
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:57
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:25
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
class ReverseSalesHeads {
    

// @LINE:116
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SalesHeads.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salesheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:112
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SalesHeads.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salesheads/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:115
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SalesHeads.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salesheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:114
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SalesHeads.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "salesheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:117
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SalesHeads.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "salesheads/"})
      }
   """
)
                        

// @LINE:113
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SalesHeads.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "salesheads/new"})
      }
   """
)
                        
    
}
              

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseExpenseHeads {
    

// @LINE:148
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ExpenseHeads.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "expenseheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:144
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ExpenseHeads.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "expenseheads/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:147
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ExpenseHeads.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "expenseheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:146
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ExpenseHeads.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "expenseheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:149
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ExpenseHeads.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "expenseheads/"})
      }
   """
)
                        

// @LINE:145
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ExpenseHeads.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "expenseheads/new"})
      }
   """
)
                        
    
}
              

// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
class ReverseTotalSalesHeads {
    

// @LINE:138
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TotalSalesHeads.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "totalsalesheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:137
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TotalSalesHeads.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "totalsalesheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:136
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TotalSalesHeads.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "totalsalesheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:134
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TotalSalesHeads.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "totalsalesheads/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:139
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TotalSalesHeads.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "totalsalesheads/"})
      }
   """
)
                        

// @LINE:135
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TotalSalesHeads.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "totalsalesheads/new"})
      }
   """
)
                        
    
}
              

// @LINE:218
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
class ReverseShifts {
    

// @LINE:212
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.update",
   """
      function(id,sid,action) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("action", encodeURIComponent(action))})
      }
   """
)
                        

// @LINE:214
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:210
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:215
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.save",
   """
      function(id,sid,action) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("action", encodeURIComponent(action))})
      }
   """
)
                        

// @LINE:211
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.showBlank",
   """
      function(sid,thead,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/new/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("action", encodeURIComponent(action)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("thead", thead)])})
      }
   """
)
                        

// @LINE:218
def storeSuppliersList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.storeSuppliersList",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/storeSuppliers" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:216
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.submit",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:213
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Shifts.edit",
   """
      function(id,sid,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "shifts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        
    
}
              

// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
class ReverseUsers {
    

// @LINE:36
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:31
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:35
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:34
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:38
def register : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.register",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/"})
      }
   """
)
                        

// @LINE:33
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/new"})
      }
   """
)
                        

// @LINE:39
def changePassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.changePassword",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "users/changePassword/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        
    
}
              

// @LINE:312
// @LINE:311
// @LINE:310
// @LINE:309
// @LINE:308
// @LINE:307
class ReverseMonthlyReports {
    

// @LINE:308
def uploadReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MonthlyReports.uploadReports",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "monthlyReports/upload/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:307
def showUploadPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MonthlyReports.showUploadPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "monthlyReports/"})
      }
   """
)
                        

// @LINE:311
def viewUploadedReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MonthlyReports.viewUploadedReports",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "monthlyReports/view"})
      }
   """
)
                        

// @LINE:312
def getUploadedReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MonthlyReports.getUploadedReports",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "monthlyReports/getUploaded"})
      }
   """
)
                        

// @LINE:310
def displayUploaded : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MonthlyReports.displayUploaded",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "monthlyReports/displayUploaded/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:309
def showUploadedReports : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MonthlyReports.showUploadedReports",
   """
      function(sid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "monthlyReports/uploaded/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        
    
}
              

// @LINE:195
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
class ReverseDailyReconciliations {
    

// @LINE:187
def listByDate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.listByDate",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/listByDate" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:191
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:186
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:190
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:188
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.showBlank",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/new/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:189
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:194
def summary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.summary",
   """
      function(id,weekDate) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/summary/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("weekDate", encodeURIComponent(weekDate))})
      }
   """
)
                        

// @LINE:195
def drViewOptions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.drViewOptions",
   """
      function(p,s,o,f,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "drsdrViewOptions/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("action", encodeURIComponent(action)) + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:193
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailyReconciliations.save",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "drs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/save"})
      }
   """
)
                        
    
}
              

// @LINE:323
// @LINE:322
// @LINE:321
class ReverseHoForms {
    

// @LINE:323
def getAllHeadOfficeForms : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HoForms.getAllHeadOfficeForms",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HeadOfficeForms/headOfficeFormsList"})
      }
   """
)
                        

// @LINE:322
def uploadHoFormsByHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HoForms.uploadHoFormsByHeadOffice",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "HeadOfficeForms/upload"})
      }
   """
)
                        

// @LINE:321
def showHoFormUploadPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.HoForms.showHoFormUploadPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "HeadOfficeForms/"})
      }
   """
)
                        
    
}
              

// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
class ReverseEmployees {
    

// @LINE:74
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:67
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:73
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:68
def listForFilterByStore : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.listForFilterByStore",
   """
      function(p,s,o,sn,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/byStore" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (sn == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sn", sn)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:75
def myProfile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.myProfile",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/myProfile"})
      }
   """
)
                        

// @LINE:72
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:77
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/"})
      }
   """
)
                        

// @LINE:71
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Employees.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/new"})
      }
   """
)
                        
    
}
              

// @LINE:266
// @LINE:265
// @LINE:264
class ReverseReports {
    

// @LINE:264
def getReportHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.getReportHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/"})
      }
   """
)
                        

// @LINE:265
def getReportHomeForStore : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.getReportHomeForStore",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/Store"})
      }
   """
)
                        

// @LINE:266
def getReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Reports.getReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/getReport/"})
      }
   """
)
                        
    
}
              

// @LINE:304
// @LINE:303
// @LINE:302
// @LINE:301
// @LINE:300
// @LINE:299
// @LINE:298
// @LINE:297
// @LINE:296
// @LINE:295
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:288
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
class ReverseInvoiceInventory {
    

// @LINE:303
def getInvoicesBySupplierName : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.getInvoicesBySupplierName",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/invoicesBy/supplier/name"})
      }
   """
)
                        

// @LINE:295
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:288
def uploadInvoicesByHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.uploadInvoicesByHeadOffice",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/uploadByHeadOffice"})
      }
   """
)
                        

// @LINE:300
def dateSelectPageForHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.dateSelectPageForHeadOffice",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/dateSelectPageForHeadOffice"})
      }
   """
)
                        

// @LINE:292
def move : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.move",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/list/move/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:296
def getInvoicesByStoreAndType : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.getInvoicesByStoreAndType",
   """
      function(id,type) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/invoiceListjustView/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("type", encodeURIComponent(type))})
      }
   """
)
                        

// @LINE:284
def showPaymentPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.showPaymentPage",
   """
      function(selectedCompany,selectedStore,selectedCategory,selectedPaymentTerm) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/showPaymentPage/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("selectedCompany", encodeURIComponent(selectedCompany)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("selectedStore", encodeURIComponent(selectedStore)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("selectedCategory", encodeURIComponent(selectedCategory)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("selectedPaymentTerm", encodeURIComponent(selectedPaymentTerm))})
      }
   """
)
                        

// @LINE:283
def showUploadPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.showUploadPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/"})
      }
   """
)
                        

// @LINE:285
def showUploadPageForHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.showUploadPageForHeadOffice",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/HeadOfficeUpload"})
      }
   """
)
                        

// @LINE:301
def displayUploadedForHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.displayUploadedForHeadOffice",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/displayUploadedForHeadOffice/list/"})
      }
   """
)
                        

// @LINE:286
def showDownloadPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.showDownloadPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/download"})
      }
   """
)
                        

// @LINE:302
def filterPaymentInvoices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.filterPaymentInvoices",
   """
      function(companyId,selectedCategoryForEnable,f,refInvoiceId,paymentTerms) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("companyId", encodeURIComponent(companyId)) + "/filter/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("selectedCategoryForEnable", encodeURIComponent(selectedCategoryForEnable)) + _qS([(f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (refInvoiceId == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("refInvoiceId", refInvoiceId)), (paymentTerms == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("paymentTerms", paymentTerms))])})
      }
   """
)
                        

// @LINE:293
def headOfficeMove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.headOfficeMove",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/headOfficeList/headOfficeMove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:287
def uploadInvoices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.uploadInvoices",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/upload/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:297
def getInvoicesForPayment : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.getInvoicesForPayment",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/getInvoicesForPayment/list"})
      }
   """
)
                        

// @LINE:298
def displayUploadedForSK : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.displayUploadedForSK",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/displayUploaded/list/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:294
def paymentMove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.paymentMove",
   """
      function(id,paymentTerms,companyId,filter,selectedCategory) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/paymentList/paymentMove/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("paymentTerms", encodeURIComponent(paymentTerms)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("companyId", companyId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("selectedCategory", encodeURIComponent(selectedCategory)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filter", encodeURIComponent(filter))})
      }
   """
)
                        

// @LINE:299
def dateSelectPageForSK : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.dateSelectPageForSK",
   """
      function(sid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/dateSelectPageForSK/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:290
def getInvoicesAfterMove : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.getInvoicesAfterMove",
   """
      function(id,type) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/download/list/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("type", encodeURIComponent(type))})
      }
   """
)
                        

// @LINE:289
def getInvoices : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.getInvoices",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/download/list"})
      }
   """
)
                        

// @LINE:304
def getInvoicesBySupplierNameInHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.getInvoicesBySupplierNameInHeadOffice",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/HeadOffice/invoicesBy/supplier/name"})
      }
   """
)
                        

// @LINE:291
def getInvoicesAfterPaymentDone : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.InvoiceInventory.getInvoicesAfterPaymentDone",
   """
      function(id,paymentTerms,companyId,filter,selectedCategory) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "InvoiceInventory/list/invoicesAfterPayment/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("paymentTerms", encodeURIComponent(paymentTerms)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("companyId", companyId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filter", encodeURIComponent(filter)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("selectedCategory", encodeURIComponent(selectedCategory))})
      }
   """
)
                        
    
}
              

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
class ReverseStores {
    

// @LINE:85
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stores.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:81
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stores.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stores/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:84
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stores.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:83
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stores.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "stores/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:86
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stores.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Stores/"})
      }
   """
)
                        

// @LINE:82
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stores.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "stores/new"})
      }
   """
)
                        
    
}
              

// @LINE:317
// @LINE:316
class ReverseManagementReports {
    

// @LINE:316
def getReportsHome : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ManagementReports.getReportsHome",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "managementReports"})
      }
   """
)
                        

// @LINE:317
def getManagementReport : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ManagementReports.getManagementReport",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "managementReports/getReport"})
      }
   """
)
                        
    
}
              

// @LINE:171
// @LINE:170
// @LINE:169
// @LINE:168
// @LINE:167
// @LINE:165
class ReversePaymentTenders {
    

// @LINE:170
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaymentTenders.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentTenders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:165
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaymentTenders.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentTenders/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:169
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaymentTenders.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentTenders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:168
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaymentTenders.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentTenders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:171
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaymentTenders.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentTenders/"})
      }
   """
)
                        

// @LINE:167
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.PaymentTenders.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentTenders/new"})
      }
   """
)
                        
    
}
              

// @LINE:337
// @LINE:336
// @LINE:335
// @LINE:334
// @LINE:333
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:329
// @LINE:328
// @LINE:279
// @LINE:246
// @LINE:109
// @LINE:107
// @LINE:106
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:40
// @LINE:27
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:331
def checkTimesheetExistsEditPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkTimesheetExistsEditPage",
   """
      function(sid,empId,date,endDate,leaveType,sh,sm,eh,em,tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkTimesheetExistsEditPage/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("sh", encodeURIComponent(sh)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("eh", encodeURIComponent(eh)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("leaveType", leaveType), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sm", sm), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("em", em), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("tid", tid)])})
      }
   """
)
                        

// @LINE:334
def checkHeadOfficeTimesheetExists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkHeadOfficeTimesheetExists",
   """
      function(sid,empId,date,endDate,leaveType,sh,sm,eh,em) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkHeadOfficeTimesheetExists/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("sh", encodeURIComponent(sh)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("eh", encodeURIComponent(eh)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("leaveType", leaveType), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sm", sm), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("em", em)])})
      }
   """
)
                        

// @LINE:106
def addPayroll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addPayroll",
   """
      function(empId,weekDate,drId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payrolls/addPayroll/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("weekDate", encodeURIComponent(weekDate)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("drId", drId)})
      }
   """
)
                        

// @LINE:335
def checkHeadOfficeTimesheetExistsForLeave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkHeadOfficeTimesheetExistsForLeave",
   """
      function(sid,empId,date,endDate) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkHeadOfficeTimesheetExistsForLeave/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate)])})
      }
   """
)
                        

// @LINE:246
def getTimeSheetSave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getTimeSheetSave",
   """
      function(empId,date,startTimeHour,startTimeMin,endTimeHour,endTimeMin,duration,textArea,leaveType) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/saveTimeSheetHours/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("startTimeHour", startTimeHour), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("startTimeMin", startTimeMin), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endTimeHour", endTimeHour), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endTimeMin", endTimeMin), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("duration", duration), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("textArea", textArea), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("leaveType", leaveType)])})
      }
   """
)
                        

// @LINE:329
def checkTimesheetExists : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkTimesheetExists",
   """
      function(sid,empId,date,endDate,leaveType,sh,sm,eh,em) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkTimesheetExists/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("sh", encodeURIComponent(sh)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("eh", encodeURIComponent(eh)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("leaveType", leaveType), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sm", sm), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("em", em)])})
      }
   """
)
                        

// @LINE:27
def checkUrl : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkUrl",
   """
      function(filePath) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "file/checkUrl" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filePath", filePath)])})
      }
   """
)
                        

// @LINE:97
def getSupplierMapping : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getSupplierMapping",
   """
      function(storeId,suppid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/getSupplierMappings/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("storeId", storeId) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("suppid", suppid)})
      }
   """
)
                        

// @LINE:330
def checkTimesheetExistsForLeave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkTimesheetExistsForLeave",
   """
      function(sid,empId,date,endDate) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkTimesheetExistsForLeave/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate)])})
      }
   """
)
                        

// @LINE:328
def checkForUnique : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkForUnique",
   """
      function(param,type,mode) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkForUnique/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("param", encodeURIComponent(param)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("type", encodeURIComponent(type)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("mode", encodeURIComponent(mode))})
      }
   """
)
                        

// @LINE:16
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:98
def deleteSupplierMapping : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteSupplierMapping",
   """
      function(suppMappingId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/deleteSupplierMappings/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("suppMappingId", suppMappingId)})
      }
   """
)
                        

// @LINE:101
def getPayout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getPayout",
   """
      function(paytype,sid,supid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payouts/getPayout/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("paytype", encodeURIComponent(paytype)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("supid", supid)})
      }
   """
)
                        

// @LINE:107
def deletePayroll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deletePayroll",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payrolls/deletePayroll/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid)})
      }
   """
)
                        

// @LINE:102
def deletePayout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deletePayout",
   """
      function(pid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payouts/deletePayout/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("pid", pid)})
      }
   """
)
                        

// @LINE:332
def checkTimesheetExistsForLeaveEditPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkTimesheetExistsForLeaveEditPage",
   """
      function(sid,empId,date,endDate,tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkTimesheetExistsForLeaveEditPage/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("tid", tid)])})
      }
   """
)
                        

// @LINE:336
def checkHeadOfficeTimesheetExistsInEditPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkHeadOfficeTimesheetExistsInEditPage",
   """
      function(sid,empId,date,endDate,leaveType,sh,sm,eh,em,tid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "checkHeadOfficeTimesheetExistsForEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("sh", encodeURIComponent(sh)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("eh", encodeURIComponent(eh)) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("leaveType", leaveType), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("sm", sm), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("em", em)])})
      }
   """
)
                        

// @LINE:337
def checkHOTTimesheetExistsInEditPageForLeave : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.checkHOTTimesheetExistsInEditPageForLeave",
   """
      function(storeId,empId,date,endDate,tid,leaveType) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateHoEmployeeLeaveType/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("storeId", storeId), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("empId", empId), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("endDate", endDate), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("tid", tid), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("leaveType", leaveType)])})
      }
   """
)
                        

// @LINE:333
def storesByCompany : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.storesByCompany",
   """
      function(cid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getStoresByCompany/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("cid", cid)})
      }
   """
)
                        

// @LINE:40
def verifyCurrentPassword : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.verifyCurrentPassword",
   """
      function(id,currPwd) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/verfiyPassword/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("currPwd", currPwd)])})
      }
   """
)
                        

// @LINE:15
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:279
// @LINE:109
def javascriptRoutes : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.javascriptRoutes",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "javascriptRoutes"})
      }
      }
   """
)
                        

// @LINE:14
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:8
def showOptions : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showOptions",
   """
      function(page,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showOptions/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("page", encodeURIComponent(page)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("action", encodeURIComponent(action))})
      }
   """
)
                        
    
}
              

// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
class ReverseTerminalHeads {
    

// @LINE:127
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TerminalHeads.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminalheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:122
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TerminalHeads.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminalheads/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:126
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TerminalHeads.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminalheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:125
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TerminalHeads.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "terminalheads/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:128
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TerminalHeads.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "terminalheads/"})
      }
   """
)
                        

// @LINE:124
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.TerminalHeads.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminalheads/new"})
      }
   """
)
                        
    
}
              

// @LINE:182
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
class ReverseDailySalesReconciliations {
    

// @LINE:180
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailySalesReconciliations.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dsrs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:176
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailySalesReconciliations.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dsrs/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:179
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailySalesReconciliations.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dsrs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:177
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailySalesReconciliations.showBlank",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dsrs/new/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:178
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailySalesReconciliations.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dsrs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:182
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.DailySalesReconciliations.save",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "dsrs/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/save"})
      }
   """
)
                        
    
}
              

// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:201
class ReverseTerminals {
    

// @LINE:204
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Terminals.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "terminals/"})
      }
   """
)
                        

// @LINE:201
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Terminals.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "terminals/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:203
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Terminals.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminals/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:205
def summary : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Terminals.summary",
   """
      function(id,thead) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "terminals/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("thead", encodeURIComponent(thead))})
      }
   """
)
                        
    
}
              

// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:255
// @LINE:254
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:247
// @LINE:245
// @LINE:240
// @LINE:239
// @LINE:238
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:228
// @LINE:227
// @LINE:226
// @LINE:225
// @LINE:224
// @LINE:223
class ReverseTimesheets {
    

// @LINE:228
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheets/delete/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:238
def showSelectPage : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.showSelectPage",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetProcessing/showSelectPage"})
      }
   """
)
                        

// @LINE:223
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheets/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:245
def showBlankForHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.showBlankForHeadOffice",
   """
      function(sid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/headOfficeNew/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:247
def saveForHeadOfficeTimeSheet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.saveForHeadOfficeTimeSheet",
   """
      function(sid,empId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId)})
      }
   """
)
                        

// @LINE:255
def updateWeeklyHOTimesheetsByWeekDate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.updateWeeklyHOTimesheetsByWeekDate",
   """
      function(stDate) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateStatusToApproved" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("stDate", stDate)])})
      }
   """
)
                        

// @LINE:253
def showSelectPageForVerify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.showSelectPageForVerify",
   """
      function(date) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/showSelectPageForHOTVerification" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("date", date)])})
      }
   """
)
                        

// @LINE:236
def updateForsk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.updateForsk",
   """
      function(tid,sid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForsk/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:227
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.update",
   """
      function(tid,sid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheets/edit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:256
def editFormForHeadOfficeRejectedTimesheetList : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.editFormForHeadOfficeRejectedTimesheetList",
   """
      function(timesheetId,empId,storeId,pageAction) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/RejectedTimesheetEdit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("timesheetId", timesheetId) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("empId", empId) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("storeId", storeId) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("pageAction", encodeURIComponent(pageAction))})
      }
   """
)
                        

// @LINE:250
def showSelectPageForHeadOfficeTimeSheet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.showSelectPageForHeadOfficeTimeSheet",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/showSelectPageForHeadOfficeTimeSheet/"})
      }
   """
)
                        

// @LINE:257
def updateEditListForRejectedTS : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.updateEditListForRejectedTS",
   """
      function(empId,storeId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetUpdated/" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("empId", empId), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("storeId", storeId)])})
      }
   """
)
                        

// @LINE:240
def showSelectPageForSK : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.showSelectPageForSK",
   """
      function(sid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetProcessing/showSelectPageForSK/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:254
def getHeadOfficeTimesheetsForVerify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.getHeadOfficeTimesheetsForVerify",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/listForVerify/"})
      }
   """
)
                        

// @LINE:224
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.showBlank",
   """
      function(sid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheets/new/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:259
def updateRejectedStatusForHOTimesheets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.updateRejectedStatusForHOTimesheets",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateRejectedHOTimesheets/"})
      }
   """
)
                        

// @LINE:248
def listForHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.listForHeadOffice",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:252
def getHeadOfficeTimesheets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.getHeadOfficeTimesheets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetProcessing/headOfficeTimesheetList/"})
      }
   """
)
                        

// @LINE:249
def editFormForHeadOffice : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.editFormForHeadOffice",
   """
      function(tid,sid,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:258
def verifyHOTimesheet : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.verifyHOTimesheet",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "verifyHOTimesheet/"})
      }
   """
)
                        

// @LINE:225
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.save",
   """
      function(sid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheets/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:226
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.edit",
   """
      function(tid,sid,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheets/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:251
def getAllHeadOfficeTimesheetsToVerify : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.getAllHeadOfficeTimesheetsToVerify",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForHeadOffice/listForApproval/"})
      }
   """
)
                        

// @LINE:239
def getTimesheets : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.getTimesheets",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetProcessing/timesheetList"})
      }
   """
)
                        

// @LINE:234
def saveForsk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.saveForsk",
   """
      function(sid) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForsk/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:233
def showBlankForsk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.showBlankForsk",
   """
      function(sid) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForsk/new/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid)})
      }
   """
)
                        

// @LINE:235
def editForsk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.editForsk",
   """
      function(tid,sid,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForsk/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tid", tid) + "/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("sid", sid) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:232
def listForsk : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Timesheets.listForsk",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "timesheetsForsk/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        
    
}
              

// @LINE:277
// @LINE:276
// @LINE:275
// @LINE:274
// @LINE:273
// @LINE:271
class ReverseAccountHolders {
    

// @LINE:277
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountHolders.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accountHolder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:271
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountHolders.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accountHolder/list" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:275
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountHolders.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accountHolder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:276
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountHolders.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accountHolder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:274
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountHolders.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "accountHolder/"})
      }
   """
)
                        

// @LINE:273
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.AccountHolders.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accountHolder/new"})
      }
   """
)
                        
    
}
              

// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
class ReverseMediaTenders {
    

// @LINE:159
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MediaTenders.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatenders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:155
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MediaTenders.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatenders/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:158
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MediaTenders.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatenders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:157
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MediaTenders.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatenders/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:160
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MediaTenders.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatenders/"})
      }
   """
)
                        

// @LINE:156
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.MediaTenders.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mediatenders/new"})
      }
   """
)
                        
    
}
              

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
class ReverseSuppliers {
    

// @LINE:94
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Suppliers.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:90
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Suppliers.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:93
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Suppliers.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:96
def getSuppliers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Suppliers.getSuppliers",
   """
      function(search,headOffice) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/getSuppliers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("search", encodeURIComponent(search)) + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("headOffice", headOffice)])})
      }
   """
)
                        

// @LINE:92
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Suppliers.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:95
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Suppliers.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/"})
      }
   """
)
                        

// @LINE:91
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Suppliers.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "suppliers/new"})
      }
   """
)
                        
    
}
              

// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseProducts {
    

// @LINE:47
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:45
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:46
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:50
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.list",
   """
      function(p,s,o,f) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f))])})
      }
   """
)
                        

// @LINE:53
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "products/"})
      }
   """
)
                        

// @LINE:44
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Products.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products/new"})
      }
   """
)
                        
    
}
              

// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:57
class ReverseCompanies {
    

// @LINE:62
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Companies.delete",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companies/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:57
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Companies.list",
   """
      function(p,s,o,f,pg) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companies/" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (pg == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("pg", pg))])})
      }
   """
)
                        

// @LINE:61
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Companies.edit",
   """
      function(id,action) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companies/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + _qS([(action == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("action", action))])})
      }
   """
)
                        

// @LINE:60
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Companies.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "companies/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:64
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Companies.save",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "companies/"})
      }
   """
)
                        

// @LINE:59
def showBlank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Companies.showBlank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "companies/new"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:337
// @LINE:336
// @LINE:335
// @LINE:334
// @LINE:333
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:329
// @LINE:328
// @LINE:323
// @LINE:322
// @LINE:321
// @LINE:317
// @LINE:316
// @LINE:312
// @LINE:311
// @LINE:310
// @LINE:309
// @LINE:308
// @LINE:307
// @LINE:304
// @LINE:303
// @LINE:302
// @LINE:301
// @LINE:300
// @LINE:299
// @LINE:298
// @LINE:297
// @LINE:296
// @LINE:295
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:288
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
// @LINE:279
// @LINE:277
// @LINE:276
// @LINE:275
// @LINE:274
// @LINE:273
// @LINE:271
// @LINE:266
// @LINE:265
// @LINE:264
// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:255
// @LINE:254
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:247
// @LINE:246
// @LINE:245
// @LINE:240
// @LINE:239
// @LINE:238
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:228
// @LINE:227
// @LINE:226
// @LINE:225
// @LINE:224
// @LINE:223
// @LINE:218
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:201
// @LINE:195
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
// @LINE:182
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
// @LINE:171
// @LINE:170
// @LINE:169
// @LINE:168
// @LINE:167
// @LINE:165
// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
// @LINE:109
// @LINE:107
// @LINE:106
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:57
// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
// @LINE:40
// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:25
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:117
// @LINE:116
// @LINE:115
// @LINE:114
// @LINE:113
// @LINE:112
class ReverseSalesHeads {
    

// @LINE:116
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SalesHeads.delete(id), HandlerDef(this, "controllers.SalesHeads", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """salesheads/$id<[^/]+>/delete""")
)
                      

// @LINE:112
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SalesHeads.list(p, s, o, f, pg), HandlerDef(this, "controllers.SalesHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """salesheads/""")
)
                      

// @LINE:115
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SalesHeads.edit(id, action), HandlerDef(this, "controllers.SalesHeads", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """salesheads/$id<[^/]+>""")
)
                      

// @LINE:114
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SalesHeads.update(id), HandlerDef(this, "controllers.SalesHeads", "update", Seq(classOf[Long]), "POST", """""", _prefix + """salesheads/$id<[^/]+>""")
)
                      

// @LINE:117
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SalesHeads.save(), HandlerDef(this, "controllers.SalesHeads", "save", Seq(), "POST", """""", _prefix + """salesheads/""")
)
                      

// @LINE:113
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SalesHeads.showBlank(), HandlerDef(this, "controllers.SalesHeads", "showBlank", Seq(), "GET", """""", _prefix + """salesheads/new""")
)
                      
    
}
                          

// @LINE:25
class ReverseAssets {
    

// @LINE:25
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:149
// @LINE:148
// @LINE:147
// @LINE:146
// @LINE:145
// @LINE:144
class ReverseExpenseHeads {
    

// @LINE:148
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ExpenseHeads.delete(id), HandlerDef(this, "controllers.ExpenseHeads", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """expenseheads/$id<[^/]+>/delete""")
)
                      

// @LINE:144
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ExpenseHeads.list(p, s, o, f, pg), HandlerDef(this, "controllers.ExpenseHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """expenseheads/""")
)
                      

// @LINE:147
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ExpenseHeads.edit(id, action), HandlerDef(this, "controllers.ExpenseHeads", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """expenseheads/$id<[^/]+>""")
)
                      

// @LINE:146
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ExpenseHeads.update(id), HandlerDef(this, "controllers.ExpenseHeads", "update", Seq(classOf[Long]), "POST", """""", _prefix + """expenseheads/$id<[^/]+>""")
)
                      

// @LINE:149
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ExpenseHeads.save(), HandlerDef(this, "controllers.ExpenseHeads", "save", Seq(), "POST", """""", _prefix + """expenseheads/""")
)
                      

// @LINE:145
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ExpenseHeads.showBlank(), HandlerDef(this, "controllers.ExpenseHeads", "showBlank", Seq(), "GET", """""", _prefix + """expenseheads/new""")
)
                      
    
}
                          

// @LINE:139
// @LINE:138
// @LINE:137
// @LINE:136
// @LINE:135
// @LINE:134
class ReverseTotalSalesHeads {
    

// @LINE:138
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TotalSalesHeads.delete(id), HandlerDef(this, "controllers.TotalSalesHeads", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """totalsalesheads/$id<[^/]+>/delete""")
)
                      

// @LINE:137
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TotalSalesHeads.edit(id), HandlerDef(this, "controllers.TotalSalesHeads", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """totalsalesheads/$id<[^/]+>""")
)
                      

// @LINE:136
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TotalSalesHeads.update(id), HandlerDef(this, "controllers.TotalSalesHeads", "update", Seq(classOf[Long]), "POST", """""", _prefix + """totalsalesheads/$id<[^/]+>""")
)
                      

// @LINE:134
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TotalSalesHeads.list(p, s, o, f), HandlerDef(this, "controllers.TotalSalesHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """totalsalesheads/""")
)
                      

// @LINE:139
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TotalSalesHeads.save(), HandlerDef(this, "controllers.TotalSalesHeads", "save", Seq(), "POST", """""", _prefix + """totalsalesheads/""")
)
                      

// @LINE:135
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TotalSalesHeads.showBlank(), HandlerDef(this, "controllers.TotalSalesHeads", "showBlank", Seq(), "GET", """""", _prefix + """totalsalesheads/new""")
)
                      
    
}
                          

// @LINE:218
// @LINE:216
// @LINE:215
// @LINE:214
// @LINE:213
// @LINE:212
// @LINE:211
// @LINE:210
class ReverseShifts {
    

// @LINE:212
def update(id:Long, sid:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.update(id, sid, action), HandlerDef(this, "controllers.Shifts", "update", Seq(classOf[Long], classOf[Long], classOf[String]), "POST", """""", _prefix + """shifts/edit/$id<[^/]+>/$sid<[^/]+>/$action<[^/]+>""")
)
                      

// @LINE:214
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.delete(id), HandlerDef(this, "controllers.Shifts", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """shifts/$id<[^/]+>/delete""")
)
                      

// @LINE:210
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.list(p, s, o, f, pg), HandlerDef(this, "controllers.Shifts", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """shifts/""")
)
                      

// @LINE:215
def save(id:Long, sid:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.save(id, sid, action), HandlerDef(this, "controllers.Shifts", "save", Seq(classOf[Long], classOf[Long], classOf[String]), "POST", """""", _prefix + """shifts/$id<[^/]+>/$sid<[^/]+>/$action<[^/]+>""")
)
                      

// @LINE:211
def showBlank(sid:Long, thead:String, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.showBlank(sid, thead, action), HandlerDef(this, "controllers.Shifts", "showBlank", Seq(classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """shifts/new/$sid<[^/]+>/$action<[^/]+>""")
)
                      

// @LINE:218
def storeSuppliersList(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.storeSuppliersList(p, s, o, f), HandlerDef(this, "controllers.Shifts", "storeSuppliersList", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """#POST  /shifts/saveShiftSales         						controllers.Shifts.saveShiftSales()""", _prefix + """shifts/storeSuppliers""")
)
                      

// @LINE:216
def submit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.submit(id), HandlerDef(this, "controllers.Shifts", "submit", Seq(classOf[Long]), "POST", """""", _prefix + """shifts/$id<[^/]+>""")
)
                      

// @LINE:213
def edit(id:Long, sid:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Shifts.edit(id, sid, action), HandlerDef(this, "controllers.Shifts", "edit", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """shifts/$id<[^/]+>/$sid<[^/]+>""")
)
                      
    
}
                          

// @LINE:39
// @LINE:38
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:31
class ReverseUsers {
    

// @LINE:36
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.delete(id), HandlerDef(this, "controllers.Users", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """users/$id<[^/]+>/delete""")
)
                      

// @LINE:31
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(p, s, o, f, pg), HandlerDef(this, "controllers.Users", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """users/""")
)
                      

// @LINE:35
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.edit(id, action), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:34
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(id), HandlerDef(this, "controllers.Users", "update", Seq(classOf[Long]), "POST", """""", _prefix + """users/$id<[^/]+>""")
)
                      

// @LINE:38
def register(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.register(), HandlerDef(this, "controllers.Users", "register", Seq(), "POST", """""", _prefix + """users/""")
)
                      

// @LINE:33
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.showBlank(), HandlerDef(this, "controllers.Users", "showBlank", Seq(), "GET", """GET  /users/           									controllers.Users.list()""", _prefix + """users/new""")
)
                      

// @LINE:39
def changePassword(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.changePassword(id), HandlerDef(this, "controllers.Users", "changePassword", Seq(classOf[Long]), "POST", """""", _prefix + """users/changePassword/$id<[^/]+>""")
)
                      
    
}
                          

// @LINE:312
// @LINE:311
// @LINE:310
// @LINE:309
// @LINE:308
// @LINE:307
class ReverseMonthlyReports {
    

// @LINE:308
def uploadReports(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MonthlyReports.uploadReports(id), HandlerDef(this, "controllers.MonthlyReports", "uploadReports", Seq(classOf[Long]), "POST", """""", _prefix + """monthlyReports/upload/$id<[^/]+>""")
)
                      

// @LINE:307
def showUploadPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MonthlyReports.showUploadPage(), HandlerDef(this, "controllers.MonthlyReports", "showUploadPage", Seq(), "GET", """""", _prefix + """monthlyReports/""")
)
                      

// @LINE:311
def viewUploadedReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MonthlyReports.viewUploadedReports(), HandlerDef(this, "controllers.MonthlyReports", "viewUploadedReports", Seq(), "GET", """""", _prefix + """monthlyReports/view""")
)
                      

// @LINE:312
def getUploadedReports(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MonthlyReports.getUploadedReports(), HandlerDef(this, "controllers.MonthlyReports", "getUploadedReports", Seq(), "POST", """""", _prefix + """monthlyReports/getUploaded""")
)
                      

// @LINE:310
def displayUploaded(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MonthlyReports.displayUploaded(id), HandlerDef(this, "controllers.MonthlyReports", "displayUploaded", Seq(classOf[Long]), "POST", """""", _prefix + """monthlyReports/displayUploaded/$id<[^/]+>""")
)
                      

// @LINE:309
def showUploadedReports(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MonthlyReports.showUploadedReports(sid), HandlerDef(this, "controllers.MonthlyReports", "showUploadedReports", Seq(classOf[Long]), "GET", """""", _prefix + """monthlyReports/uploaded/$sid<[^/]+>""")
)
                      
    
}
                          

// @LINE:195
// @LINE:194
// @LINE:193
// @LINE:191
// @LINE:190
// @LINE:189
// @LINE:188
// @LINE:187
// @LINE:186
class ReverseDailyReconciliations {
    

// @LINE:187
def listByDate(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.listByDate(p, s, o, f, pg), HandlerDef(this, "controllers.DailyReconciliations", "listByDate", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """drs/listByDate""")
)
                      

// @LINE:191
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.delete(id), HandlerDef(this, "controllers.DailyReconciliations", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """drs/$id<[^/]+>/delete""")
)
                      

// @LINE:186
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.list(p, s, o, f, pg), HandlerDef(this, "controllers.DailyReconciliations", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """drs/""")
)
                      

// @LINE:190
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.edit(id, action), HandlerDef(this, "controllers.DailyReconciliations", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """drs/$id<[^/]+>""")
)
                      

// @LINE:188
def showBlank(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.showBlank(id), HandlerDef(this, "controllers.DailyReconciliations", "showBlank", Seq(classOf[Long]), "GET", """""", _prefix + """drs/new/$id<[^/]+>""")
)
                      

// @LINE:189
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.update(id), HandlerDef(this, "controllers.DailyReconciliations", "update", Seq(classOf[Long]), "POST", """""", _prefix + """drs/$id<[^/]+>""")
)
                      

// @LINE:194
def summary(id:Long, weekDate:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.summary(id, weekDate), HandlerDef(this, "controllers.DailyReconciliations", "summary", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """drs/summary/$id<[^/]+>/$weekDate<[^/]+>""")
)
                      

// @LINE:195
def drViewOptions(p:Int, s:String, o:String, f:String, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.drViewOptions(p, s, o, f, action), HandlerDef(this, "controllers.DailyReconciliations", "drViewOptions", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """drsdrViewOptions/$action<[^/]+>""")
)
                      

// @LINE:193
def save(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailyReconciliations.save(id), HandlerDef(this, "controllers.DailyReconciliations", "save", Seq(classOf[Long]), "POST", """""", _prefix + """drs/$id<[^/]+>/save""")
)
                      
    
}
                          

// @LINE:323
// @LINE:322
// @LINE:321
class ReverseHoForms {
    

// @LINE:323
def getAllHeadOfficeForms(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HoForms.getAllHeadOfficeForms(), HandlerDef(this, "controllers.HoForms", "getAllHeadOfficeForms", Seq(), "GET", """""", _prefix + """HeadOfficeForms/headOfficeFormsList""")
)
                      

// @LINE:322
def uploadHoFormsByHeadOffice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HoForms.uploadHoFormsByHeadOffice(), HandlerDef(this, "controllers.HoForms", "uploadHoFormsByHeadOffice", Seq(), "POST", """""", _prefix + """HeadOfficeForms/upload""")
)
                      

// @LINE:321
def showHoFormUploadPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.HoForms.showHoFormUploadPage(), HandlerDef(this, "controllers.HoForms", "showHoFormUploadPage", Seq(), "GET", """""", _prefix + """HeadOfficeForms/""")
)
                      
    
}
                          

// @LINE:77
// @LINE:75
// @LINE:74
// @LINE:73
// @LINE:72
// @LINE:71
// @LINE:68
// @LINE:67
class ReverseEmployees {
    

// @LINE:74
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.delete(id), HandlerDef(this, "controllers.Employees", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """employees/$id<[^/]+>/delete""")
)
                      

// @LINE:67
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.list(p, s, o, f, pg), HandlerDef(this, "controllers.Employees", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """employees/""")
)
                      

// @LINE:73
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.edit(id, action), HandlerDef(this, "controllers.Employees", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """employees/$id<[^/]+>""")
)
                      

// @LINE:68
def listForFilterByStore(p:Int, s:String, o:String, sn:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.listForFilterByStore(p, s, o, sn, pg), HandlerDef(this, "controllers.Employees", "listForFilterByStore", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """employees/byStore""")
)
                      

// @LINE:75
def myProfile(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.myProfile(id), HandlerDef(this, "controllers.Employees", "myProfile", Seq(classOf[Long]), "GET", """""", _prefix + """employees/$id<[^/]+>/myProfile""")
)
                      

// @LINE:72
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.update(id), HandlerDef(this, "controllers.Employees", "update", Seq(classOf[Long]), "POST", """""", _prefix + """employees/$id<[^/]+>""")
)
                      

// @LINE:77
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.save(), HandlerDef(this, "controllers.Employees", "save", Seq(), "POST", """""", _prefix + """employees/""")
)
                      

// @LINE:71
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Employees.showBlank(), HandlerDef(this, "controllers.Employees", "showBlank", Seq(), "GET", """GET  /employees/           								controllers.Employees.list()""", _prefix + """employees/new""")
)
                      
    
}
                          

// @LINE:266
// @LINE:265
// @LINE:264
class ReverseReports {
    

// @LINE:264
def getReportHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.getReportHome(), HandlerDef(this, "controllers.Reports", "getReportHome", Seq(), "GET", """""", _prefix + """reports/""")
)
                      

// @LINE:265
def getReportHomeForStore(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.getReportHomeForStore(), HandlerDef(this, "controllers.Reports", "getReportHomeForStore", Seq(), "GET", """""", _prefix + """reports/Store""")
)
                      

// @LINE:266
def getReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Reports.getReport(), HandlerDef(this, "controllers.Reports", "getReport", Seq(), "POST", """""", _prefix + """reports/getReport/""")
)
                      
    
}
                          

// @LINE:304
// @LINE:303
// @LINE:302
// @LINE:301
// @LINE:300
// @LINE:299
// @LINE:298
// @LINE:297
// @LINE:296
// @LINE:295
// @LINE:294
// @LINE:293
// @LINE:292
// @LINE:291
// @LINE:290
// @LINE:289
// @LINE:288
// @LINE:287
// @LINE:286
// @LINE:285
// @LINE:284
// @LINE:283
class ReverseInvoiceInventory {
    

// @LINE:303
def getInvoicesBySupplierName(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.getInvoicesBySupplierName(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesBySupplierName", Seq(), "GET", """""", _prefix + """InvoiceInventory/invoicesBy/supplier/name""")
)
                      

// @LINE:295
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.delete(id), HandlerDef(this, "controllers.InvoiceInventory", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """InvoiceInventory/delete/$id<[^/]+>""")
)
                      

// @LINE:288
def uploadInvoicesByHeadOffice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.uploadInvoicesByHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "uploadInvoicesByHeadOffice", Seq(), "POST", """""", _prefix + """InvoiceInventory/uploadByHeadOffice""")
)
                      

// @LINE:300
def dateSelectPageForHeadOffice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.dateSelectPageForHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "dateSelectPageForHeadOffice", Seq(), "GET", """""", _prefix + """InvoiceInventory/dateSelectPageForHeadOffice""")
)
                      

// @LINE:292
def move(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.move(id), HandlerDef(this, "controllers.InvoiceInventory", "move", Seq(classOf[Long]), "POST", """""", _prefix + """InvoiceInventory/list/move/$id<[^/]+>""")
)
                      

// @LINE:296
def getInvoicesByStoreAndType(id:Long, playframework_escape_type:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.getInvoicesByStoreAndType(id, playframework_escape_type), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesByStoreAndType", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """InvoiceInventory/invoiceListjustView/$id<[^/]+>/$type<[^/]+>""")
)
                      

// @LINE:284
def showPaymentPage(selectedCompany:String, selectedStore:String, selectedCategory:String, selectedPaymentTerm:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.showPaymentPage(selectedCompany, selectedStore, selectedCategory, selectedPaymentTerm), HandlerDef(this, "controllers.InvoiceInventory", "showPaymentPage", Seq(classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """InvoiceInventory/showPaymentPage/$selectedCompany<[^/]+>/$selectedStore<[^/]+>/$selectedCategory<[^/]+>/$selectedPaymentTerm<[^/]+>""")
)
                      

// @LINE:283
def showUploadPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.showUploadPage(), HandlerDef(this, "controllers.InvoiceInventory", "showUploadPage", Seq(), "GET", """""", _prefix + """InvoiceInventory/""")
)
                      

// @LINE:285
def showUploadPageForHeadOffice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.showUploadPageForHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "showUploadPageForHeadOffice", Seq(), "GET", """""", _prefix + """InvoiceInventory/HeadOfficeUpload""")
)
                      

// @LINE:301
def displayUploadedForHeadOffice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.displayUploadedForHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "displayUploadedForHeadOffice", Seq(), "POST", """""", _prefix + """InvoiceInventory/displayUploadedForHeadOffice/list/""")
)
                      

// @LINE:286
def showDownloadPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.showDownloadPage(), HandlerDef(this, "controllers.InvoiceInventory", "showDownloadPage", Seq(), "GET", """""", _prefix + """InvoiceInventory/download""")
)
                      

// @LINE:302
def filterPaymentInvoices(companyId:String, selectedCategoryForEnable:String, f:String, refInvoiceId:Long, paymentTerms:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.filterPaymentInvoices(companyId, selectedCategoryForEnable, f, refInvoiceId, paymentTerms), HandlerDef(this, "controllers.InvoiceInventory", "filterPaymentInvoices", Seq(classOf[String], classOf[String], classOf[String], classOf[Long], classOf[String]), "GET", """""", _prefix + """InvoiceInventory/$companyId<[^/]+>/filter/$selectedCategoryForEnable<[^/]+>""")
)
                      

// @LINE:293
def headOfficeMove(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.headOfficeMove(id), HandlerDef(this, "controllers.InvoiceInventory", "headOfficeMove", Seq(classOf[Long]), "POST", """""", _prefix + """InvoiceInventory/headOfficeList/headOfficeMove/$id<[^/]+>""")
)
                      

// @LINE:287
def uploadInvoices(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.uploadInvoices(id), HandlerDef(this, "controllers.InvoiceInventory", "uploadInvoices", Seq(classOf[Long]), "POST", """""", _prefix + """InvoiceInventory/upload/$id<[^/]+>""")
)
                      

// @LINE:297
def getInvoicesForPayment(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.getInvoicesForPayment(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesForPayment", Seq(), "POST", """""", _prefix + """InvoiceInventory/getInvoicesForPayment/list""")
)
                      

// @LINE:298
def displayUploadedForSK(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.displayUploadedForSK(id), HandlerDef(this, "controllers.InvoiceInventory", "displayUploadedForSK", Seq(classOf[Long]), "POST", """""", _prefix + """InvoiceInventory/displayUploaded/list/$id<[^/]+>""")
)
                      

// @LINE:294
def paymentMove(id:Long, paymentTerms:String, companyId:Long, filter:String, selectedCategory:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.paymentMove(id, paymentTerms, companyId, filter, selectedCategory), HandlerDef(this, "controllers.InvoiceInventory", "paymentMove", Seq(classOf[Long], classOf[String], classOf[Long], classOf[String], classOf[String]), "POST", """""", _prefix + """InvoiceInventory/paymentList/paymentMove/$id<[^/]+>/$paymentTerms<[^/]+>/$companyId<[^/]+>/$selectedCategory<[^/]+>/$filter<[^/]+>""")
)
                      

// @LINE:299
def dateSelectPageForSK(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.dateSelectPageForSK(sid), HandlerDef(this, "controllers.InvoiceInventory", "dateSelectPageForSK", Seq(classOf[Long]), "GET", """""", _prefix + """InvoiceInventory/dateSelectPageForSK/$sid<[^/]+>""")
)
                      

// @LINE:290
def getInvoicesAfterMove(id:Long, playframework_escape_type:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.getInvoicesAfterMove(id, playframework_escape_type), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesAfterMove", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """InvoiceInventory/download/list/$id<[^/]+>/$type<[^/]+>""")
)
                      

// @LINE:289
def getInvoices(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.getInvoices(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoices", Seq(), "POST", """""", _prefix + """InvoiceInventory/download/list""")
)
                      

// @LINE:304
def getInvoicesBySupplierNameInHeadOffice(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.getInvoicesBySupplierNameInHeadOffice(), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesBySupplierNameInHeadOffice", Seq(), "GET", """""", _prefix + """InvoiceInventory/HeadOffice/invoicesBy/supplier/name""")
)
                      

// @LINE:291
def getInvoicesAfterPaymentDone(id:Long, paymentTerms:String, companyId:Long, filter:String, selectedCategory:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.InvoiceInventory.getInvoicesAfterPaymentDone(id, paymentTerms, companyId, filter, selectedCategory), HandlerDef(this, "controllers.InvoiceInventory", "getInvoicesAfterPaymentDone", Seq(classOf[Long], classOf[String], classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """InvoiceInventory/list/invoicesAfterPayment/$id<[^/]+>/$paymentTerms<[^/]+>/$companyId<[^/]+>/$filter<[^/]+>/$selectedCategory<[^/]+>""")
)
                      
    
}
                          

// @LINE:86
// @LINE:85
// @LINE:84
// @LINE:83
// @LINE:82
// @LINE:81
class ReverseStores {
    

// @LINE:85
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stores.delete(id), HandlerDef(this, "controllers.Stores", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """stores/$id<[^/]+>/delete""")
)
                      

// @LINE:81
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stores.list(p, s, o, f, pg), HandlerDef(this, "controllers.Stores", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """stores/""")
)
                      

// @LINE:84
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stores.edit(id, action), HandlerDef(this, "controllers.Stores", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """stores/$id<[^/]+>""")
)
                      

// @LINE:83
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stores.update(id), HandlerDef(this, "controllers.Stores", "update", Seq(classOf[Long]), "POST", """""", _prefix + """stores/$id<[^/]+>""")
)
                      

// @LINE:86
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stores.save(), HandlerDef(this, "controllers.Stores", "save", Seq(), "POST", """""", _prefix + """Stores/""")
)
                      

// @LINE:82
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stores.showBlank(), HandlerDef(this, "controllers.Stores", "showBlank", Seq(), "GET", """""", _prefix + """stores/new""")
)
                      
    
}
                          

// @LINE:317
// @LINE:316
class ReverseManagementReports {
    

// @LINE:316
def getReportsHome(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ManagementReports.getReportsHome(), HandlerDef(this, "controllers.ManagementReports", "getReportsHome", Seq(), "GET", """""", _prefix + """managementReports""")
)
                      

// @LINE:317
def getManagementReport(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ManagementReports.getManagementReport(), HandlerDef(this, "controllers.ManagementReports", "getManagementReport", Seq(), "POST", """""", _prefix + """managementReports/getReport""")
)
                      
    
}
                          

// @LINE:171
// @LINE:170
// @LINE:169
// @LINE:168
// @LINE:167
// @LINE:165
class ReversePaymentTenders {
    

// @LINE:170
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaymentTenders.delete(id), HandlerDef(this, "controllers.PaymentTenders", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """paymentTenders/$id<[^/]+>/delete""")
)
                      

// @LINE:165
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaymentTenders.list(p, s, o, f, pg), HandlerDef(this, "controllers.PaymentTenders", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """paymentTenders/""")
)
                      

// @LINE:169
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaymentTenders.edit(id, action), HandlerDef(this, "controllers.PaymentTenders", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """paymentTenders/$id<[^/]+>""")
)
                      

// @LINE:168
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaymentTenders.update(id), HandlerDef(this, "controllers.PaymentTenders", "update", Seq(classOf[Long]), "POST", """""", _prefix + """paymentTenders/$id<[^/]+>""")
)
                      

// @LINE:171
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaymentTenders.save(), HandlerDef(this, "controllers.PaymentTenders", "save", Seq(), "POST", """""", _prefix + """paymentTenders/""")
)
                      

// @LINE:167
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.PaymentTenders.showBlank(), HandlerDef(this, "controllers.PaymentTenders", "showBlank", Seq(), "GET", """""", _prefix + """paymentTenders/new""")
)
                      
    
}
                          

// @LINE:337
// @LINE:336
// @LINE:335
// @LINE:334
// @LINE:333
// @LINE:332
// @LINE:331
// @LINE:330
// @LINE:329
// @LINE:328
// @LINE:279
// @LINE:246
// @LINE:109
// @LINE:107
// @LINE:106
// @LINE:102
// @LINE:101
// @LINE:98
// @LINE:97
// @LINE:40
// @LINE:27
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:331
def checkTimesheetExistsEditPage(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String, tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkTimesheetExistsEditPage(sid, empId, date, endDate, leaveType, sh, sm, eh, em, tid), HandlerDef(this, "controllers.Application", "checkTimesheetExistsEditPage", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Long]), "GET", """""", _prefix + """checkTimesheetExistsEditPage/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>""")
)
                      

// @LINE:334
def checkHeadOfficeTimesheetExists(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkHeadOfficeTimesheetExists(sid, empId, date, endDate, leaveType, sh, sm, eh, em), HandlerDef(this, "controllers.Application", "checkHeadOfficeTimesheetExists", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """checkHeadOfficeTimesheetExists/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>""")
)
                      

// @LINE:106
def addPayroll(empId:Long, weekDate:String, drId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addPayroll(empId, weekDate, drId), HandlerDef(this, "controllers.Application", "addPayroll", Seq(classOf[Long], classOf[String], classOf[Long]), "GET", """""", _prefix + """payrolls/addPayroll/$empId<[^/]+>/$weekDate<[^/]+>/$drId<[^/]+>""")
)
                      

// @LINE:335
def checkHeadOfficeTimesheetExistsForLeave(sid:Long, empId:Long, date:String, endDate:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkHeadOfficeTimesheetExistsForLeave(sid, empId, date, endDate), HandlerDef(this, "controllers.Application", "checkHeadOfficeTimesheetExistsForLeave", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """checkHeadOfficeTimesheetExistsForLeave/$sid<[^/]+>/$empId<[^/]+>""")
)
                      

// @LINE:246
def getTimeSheetSave(empId:Long, date:String, startTimeHour:String, startTimeMin:String, endTimeHour:String, endTimeMin:String, duration:String, textArea:String, leaveType:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getTimeSheetSave(empId, date, startTimeHour, startTimeMin, endTimeHour, endTimeMin, duration, textArea, leaveType), HandlerDef(this, "controllers.Application", "getTimeSheetSave", Seq(classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """timesheetsForHeadOffice/saveTimeSheetHours/$empId<[^/]+>""")
)
                      

// @LINE:329
def checkTimesheetExists(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkTimesheetExists(sid, empId, date, endDate, leaveType, sh, sm, eh, em), HandlerDef(this, "controllers.Application", "checkTimesheetExists", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """checkTimesheetExists/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>""")
)
                      

// @LINE:27
def checkUrl(filePath:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkUrl(filePath), HandlerDef(this, "controllers.Application", "checkUrl", Seq(classOf[String]), "GET", """""", _prefix + """file/checkUrl""")
)
                      

// @LINE:97
def getSupplierMapping(storeId:Long, suppid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getSupplierMapping(storeId, suppid), HandlerDef(this, "controllers.Application", "getSupplierMapping", Seq(classOf[Long], classOf[Long]), "GET", """""", _prefix + """suppliers/getSupplierMappings/$storeId<[^/]+>/$suppid<[^/]+>""")
)
                      

// @LINE:330
def checkTimesheetExistsForLeave(sid:Long, empId:Long, date:String, endDate:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkTimesheetExistsForLeave(sid, empId, date, endDate), HandlerDef(this, "controllers.Application", "checkTimesheetExistsForLeave", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String]), "GET", """""", _prefix + """checkTimesheetExistsForLeave/$sid<[^/]+>/$empId<[^/]+>""")
)
                      

// @LINE:328
def checkForUnique(param:String, playframework_escape_type:String, mode:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkForUnique(param, playframework_escape_type, mode), HandlerDef(this, "controllers.Application", "checkForUnique", Seq(classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """checkForUnique/$param<[^/]+>/$type<[^/]+>/$mode<[^/]+>""")
)
                      

// @LINE:16
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:98
def deleteSupplierMapping(suppMappingId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteSupplierMapping(suppMappingId), HandlerDef(this, "controllers.Application", "deleteSupplierMapping", Seq(classOf[Long]), "GET", """""", _prefix + """suppliers/deleteSupplierMappings/$suppMappingId<[^/]+>""")
)
                      

// @LINE:101
def getPayout(paytype:String, sid:Long, supid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getPayout(paytype, sid, supid), HandlerDef(this, "controllers.Application", "getPayout", Seq(classOf[String], classOf[Long], classOf[Long]), "GET", """""", _prefix + """payouts/getPayout/$paytype<[^/]+>/$sid<[^/]+>/$supid<[^/]+>""")
)
                      

// @LINE:107
def deletePayroll(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deletePayroll(pid), HandlerDef(this, "controllers.Application", "deletePayroll", Seq(classOf[Long]), "GET", """""", _prefix + """payrolls/deletePayroll/$pid<[^/]+>""")
)
                      

// @LINE:102
def deletePayout(pid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deletePayout(pid), HandlerDef(this, "controllers.Application", "deletePayout", Seq(classOf[Long]), "GET", """""", _prefix + """payouts/deletePayout/$pid<[^/]+>""")
)
                      

// @LINE:332
def checkTimesheetExistsForLeaveEditPage(sid:Long, empId:Long, date:String, endDate:String, tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkTimesheetExistsForLeaveEditPage(sid, empId, date, endDate, tid), HandlerDef(this, "controllers.Application", "checkTimesheetExistsForLeaveEditPage", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[Long]), "GET", """""", _prefix + """checkTimesheetExistsForLeaveEditPage/$sid<[^/]+>/$empId<[^/]+>""")
)
                      

// @LINE:336
def checkHeadOfficeTimesheetExistsInEditPage(sid:Long, empId:Long, date:String, endDate:String, leaveType:String, sh:String, sm:String, eh:String, em:String, tid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkHeadOfficeTimesheetExistsInEditPage(sid, empId, date, endDate, leaveType, sh, sm, eh, em, tid), HandlerDef(this, "controllers.Application", "checkHeadOfficeTimesheetExistsInEditPage", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[String], classOf[Long]), "GET", """""", _prefix + """checkHeadOfficeTimesheetExistsForEdit/$sid<[^/]+>/$empId<[^/]+>/$sh<[^/]+>/$eh<[^/]+>/$tid<[^/]+>""")
)
                      

// @LINE:337
def checkHOTTimesheetExistsInEditPageForLeave(storeId:Long, empId:Long, date:String, endDate:String, tid:Long, leaveType:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.checkHOTTimesheetExistsInEditPageForLeave(storeId, empId, date, endDate, tid, leaveType), HandlerDef(this, "controllers.Application", "checkHOTTimesheetExistsInEditPageForLeave", Seq(classOf[Long], classOf[Long], classOf[String], classOf[String], classOf[Long], classOf[String]), "GET", """""", _prefix + """updateHoEmployeeLeaveType/""")
)
                      

// @LINE:333
def storesByCompany(cid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.storesByCompany(cid), HandlerDef(this, "controllers.Application", "storesByCompany", Seq(classOf[Long]), "GET", """""", _prefix + """getStoresByCompany/$cid<[^/]+>""")
)
                      

// @LINE:40
def verifyCurrentPassword(id:Long, currPwd:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.verifyCurrentPassword(id, currPwd), HandlerDef(this, "controllers.Application", "verifyCurrentPassword", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """users/verfiyPassword/$id<[^/]+>""")
)
                      

// @LINE:15
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:109
def javascriptRoutes(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.javascriptRoutes(), HandlerDef(this, "controllers.Application", "javascriptRoutes", Seq(), "GET", """""", _prefix + """javascriptRoutes""")
)
                      

// @LINE:14
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      

// @LINE:8
def showOptions(page:String, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showOptions(page, action), HandlerDef(this, "controllers.Application", "showOptions", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """showOptions/$page<[^/]+>/$action<[^/]+>""")
)
                      
    
}
                          

// @LINE:128
// @LINE:127
// @LINE:126
// @LINE:125
// @LINE:124
// @LINE:122
class ReverseTerminalHeads {
    

// @LINE:127
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TerminalHeads.delete(id), HandlerDef(this, "controllers.TerminalHeads", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """terminalheads/$id<[^/]+>/delete""")
)
                      

// @LINE:122
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TerminalHeads.list(p, s, o, f, pg), HandlerDef(this, "controllers.TerminalHeads", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """terminalheads/""")
)
                      

// @LINE:126
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TerminalHeads.edit(id, action), HandlerDef(this, "controllers.TerminalHeads", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """terminalheads/$id<[^/]+>""")
)
                      

// @LINE:125
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TerminalHeads.update(id), HandlerDef(this, "controllers.TerminalHeads", "update", Seq(classOf[Long]), "POST", """""", _prefix + """terminalheads/$id<[^/]+>""")
)
                      

// @LINE:128
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TerminalHeads.save(), HandlerDef(this, "controllers.TerminalHeads", "save", Seq(), "POST", """""", _prefix + """terminalheads/""")
)
                      

// @LINE:124
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.TerminalHeads.showBlank(), HandlerDef(this, "controllers.TerminalHeads", "showBlank", Seq(), "GET", """""", _prefix + """terminalheads/new""")
)
                      
    
}
                          

// @LINE:182
// @LINE:180
// @LINE:179
// @LINE:178
// @LINE:177
// @LINE:176
class ReverseDailySalesReconciliations {
    

// @LINE:180
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailySalesReconciliations.delete(id), HandlerDef(this, "controllers.DailySalesReconciliations", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """dsrs/$id<[^/]+>/delete""")
)
                      

// @LINE:176
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailySalesReconciliations.list(p, s, o, f, pg), HandlerDef(this, "controllers.DailySalesReconciliations", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """dsrs/""")
)
                      

// @LINE:179
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailySalesReconciliations.edit(id, action), HandlerDef(this, "controllers.DailySalesReconciliations", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """dsrs/$id<[^/]+>""")
)
                      

// @LINE:177
def showBlank(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailySalesReconciliations.showBlank(id), HandlerDef(this, "controllers.DailySalesReconciliations", "showBlank", Seq(classOf[Long]), "GET", """""", _prefix + """dsrs/new/$id<[^/]+>""")
)
                      

// @LINE:178
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailySalesReconciliations.update(id), HandlerDef(this, "controllers.DailySalesReconciliations", "update", Seq(classOf[Long]), "POST", """""", _prefix + """dsrs/$id<[^/]+>""")
)
                      

// @LINE:182
def save(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.DailySalesReconciliations.save(id), HandlerDef(this, "controllers.DailySalesReconciliations", "save", Seq(classOf[Long]), "POST", """""", _prefix + """dsrs/$id<[^/]+>/save""")
)
                      
    
}
                          

// @LINE:205
// @LINE:204
// @LINE:203
// @LINE:201
class ReverseTerminals {
    

// @LINE:204
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Terminals.save(), HandlerDef(this, "controllers.Terminals", "save", Seq(), "POST", """""", _prefix + """terminals/""")
)
                      

// @LINE:201
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Terminals.update(id), HandlerDef(this, "controllers.Terminals", "update", Seq(classOf[Long]), "POST", """#GET   /terminals/                 						controllers.Terminals.list()
#GET   /terminals/new/:sid/:tid   							controllers.Terminals.showBlank(sid:Long, tid:Long) """, _prefix + """terminals/$id<[^/]+>""")
)
                      

// @LINE:203
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Terminals.delete(id), HandlerDef(this, "controllers.Terminals", "delete", Seq(classOf[Long]), "GET", """#GET   /terminals/:id/:sid         						controllers.Terminals.edit(id:Long, sid:Long)""", _prefix + """terminals/$id<[^/]+>/delete""")
)
                      

// @LINE:205
def summary(id:Long, thead:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Terminals.summary(id, thead), HandlerDef(this, "controllers.Terminals", "summary", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """terminals/$id<[^/]+>/$thead<[^/]+>""")
)
                      
    
}
                          

// @LINE:259
// @LINE:258
// @LINE:257
// @LINE:256
// @LINE:255
// @LINE:254
// @LINE:253
// @LINE:252
// @LINE:251
// @LINE:250
// @LINE:249
// @LINE:248
// @LINE:247
// @LINE:245
// @LINE:240
// @LINE:239
// @LINE:238
// @LINE:236
// @LINE:235
// @LINE:234
// @LINE:233
// @LINE:232
// @LINE:228
// @LINE:227
// @LINE:226
// @LINE:225
// @LINE:224
// @LINE:223
class ReverseTimesheets {
    

// @LINE:228
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.delete(id), HandlerDef(this, "controllers.Timesheets", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """timesheets/delete/$id<[^/]+>""")
)
                      

// @LINE:238
def showSelectPage(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.showSelectPage(), HandlerDef(this, "controllers.Timesheets", "showSelectPage", Seq(), "GET", """""", _prefix + """timesheetProcessing/showSelectPage""")
)
                      

// @LINE:223
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.list(p, s, o, f, pg), HandlerDef(this, "controllers.Timesheets", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """timesheets/""")
)
                      

// @LINE:245
def showBlankForHeadOffice(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.showBlankForHeadOffice(sid), HandlerDef(this, "controllers.Timesheets", "showBlankForHeadOffice", Seq(classOf[Long]), "GET", """""", _prefix + """timesheetsForHeadOffice/headOfficeNew/$sid<[^/]+>""")
)
                      

// @LINE:247
def saveForHeadOfficeTimeSheet(sid:Long, empId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.saveForHeadOfficeTimeSheet(sid, empId), HandlerDef(this, "controllers.Timesheets", "saveForHeadOfficeTimeSheet", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """timesheetsForHeadOffice/$sid<[^/]+>/$empId<[^/]+>""")
)
                      

// @LINE:255
def updateWeeklyHOTimesheetsByWeekDate(stDate:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.updateWeeklyHOTimesheetsByWeekDate(stDate), HandlerDef(this, "controllers.Timesheets", "updateWeeklyHOTimesheetsByWeekDate", Seq(classOf[String]), "POST", """""", _prefix + """updateStatusToApproved""")
)
                      

// @LINE:253
def showSelectPageForVerify(date:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.showSelectPageForVerify(date), HandlerDef(this, "controllers.Timesheets", "showSelectPageForVerify", Seq(classOf[String]), "GET", """""", _prefix + """timesheetsForHeadOffice/showSelectPageForHOTVerification""")
)
                      

// @LINE:236
def updateForsk(tid:Long, sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.updateForsk(tid, sid), HandlerDef(this, "controllers.Timesheets", "updateForsk", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """timesheetsForsk/edit/$tid<[^/]+>/$sid<[^/]+>""")
)
                      

// @LINE:227
def update(tid:Long, sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.update(tid, sid), HandlerDef(this, "controllers.Timesheets", "update", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """timesheets/edit/$tid<[^/]+>/$sid<[^/]+>""")
)
                      

// @LINE:256
def editFormForHeadOfficeRejectedTimesheetList(timesheetId:Long, empId:Long, storeId:Long, pageAction:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.editFormForHeadOfficeRejectedTimesheetList(timesheetId, empId, storeId, pageAction), HandlerDef(this, "controllers.Timesheets", "editFormForHeadOfficeRejectedTimesheetList", Seq(classOf[Long], classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """timesheetsForHeadOffice/RejectedTimesheetEdit/$timesheetId<[^/]+>/$empId<[^/]+>/$storeId<[^/]+>/$pageAction<[^/]+>""")
)
                      

// @LINE:250
def showSelectPageForHeadOfficeTimeSheet(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.showSelectPageForHeadOfficeTimeSheet(), HandlerDef(this, "controllers.Timesheets", "showSelectPageForHeadOfficeTimeSheet", Seq(), "GET", """""", _prefix + """timesheetsForHeadOffice/showSelectPageForHeadOfficeTimeSheet/""")
)
                      

// @LINE:257
def updateEditListForRejectedTS(empId:Long, storeId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.updateEditListForRejectedTS(empId, storeId), HandlerDef(this, "controllers.Timesheets", "updateEditListForRejectedTS", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """timesheetUpdated/""")
)
                      

// @LINE:240
def showSelectPageForSK(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.showSelectPageForSK(sid), HandlerDef(this, "controllers.Timesheets", "showSelectPageForSK", Seq(classOf[Long]), "GET", """""", _prefix + """timesheetProcessing/showSelectPageForSK/$sid<[^/]+>""")
)
                      

// @LINE:254
def getHeadOfficeTimesheetsForVerify(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.getHeadOfficeTimesheetsForVerify(), HandlerDef(this, "controllers.Timesheets", "getHeadOfficeTimesheetsForVerify", Seq(), "GET", """""", _prefix + """timesheetsForHeadOffice/listForVerify/""")
)
                      

// @LINE:224
def showBlank(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.showBlank(sid), HandlerDef(this, "controllers.Timesheets", "showBlank", Seq(classOf[Long]), "GET", """""", _prefix + """timesheets/new/$sid<[^/]+>""")
)
                      

// @LINE:259
def updateRejectedStatusForHOTimesheets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.updateRejectedStatusForHOTimesheets(), HandlerDef(this, "controllers.Timesheets", "updateRejectedStatusForHOTimesheets", Seq(), "GET", """""", _prefix + """updateRejectedHOTimesheets/""")
)
                      

// @LINE:248
def listForHeadOffice(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.listForHeadOffice(p, s, o, f, pg), HandlerDef(this, "controllers.Timesheets", "listForHeadOffice", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """timesheetsForHeadOffice/""")
)
                      

// @LINE:252
def getHeadOfficeTimesheets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.getHeadOfficeTimesheets(), HandlerDef(this, "controllers.Timesheets", "getHeadOfficeTimesheets", Seq(), "POST", """""", _prefix + """timesheetProcessing/headOfficeTimesheetList/""")
)
                      

// @LINE:249
def editFormForHeadOffice(tid:Long, sid:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.editFormForHeadOffice(tid, sid, action), HandlerDef(this, "controllers.Timesheets", "editFormForHeadOffice", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """timesheetsForHeadOffice/$tid<[^/]+>/$sid<[^/]+>""")
)
                      

// @LINE:258
def verifyHOTimesheet(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.verifyHOTimesheet(), HandlerDef(this, "controllers.Timesheets", "verifyHOTimesheet", Seq(), "GET", """""", _prefix + """verifyHOTimesheet/""")
)
                      

// @LINE:225
def save(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.save(sid), HandlerDef(this, "controllers.Timesheets", "save", Seq(classOf[Long]), "POST", """""", _prefix + """timesheets/$sid<[^/]+>""")
)
                      

// @LINE:226
def edit(tid:Long, sid:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.edit(tid, sid, action), HandlerDef(this, "controllers.Timesheets", "edit", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """timesheets/$tid<[^/]+>/$sid<[^/]+>""")
)
                      

// @LINE:251
def getAllHeadOfficeTimesheetsToVerify(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.getAllHeadOfficeTimesheetsToVerify(), HandlerDef(this, "controllers.Timesheets", "getAllHeadOfficeTimesheetsToVerify", Seq(), "GET", """""", _prefix + """timesheetsForHeadOffice/listForApproval/""")
)
                      

// @LINE:239
def getTimesheets(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.getTimesheets(), HandlerDef(this, "controllers.Timesheets", "getTimesheets", Seq(), "POST", """""", _prefix + """timesheetProcessing/timesheetList""")
)
                      

// @LINE:234
def saveForsk(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.saveForsk(sid), HandlerDef(this, "controllers.Timesheets", "saveForsk", Seq(classOf[Long]), "POST", """""", _prefix + """timesheetsForsk/$sid<[^/]+>""")
)
                      

// @LINE:233
def showBlankForsk(sid:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.showBlankForsk(sid), HandlerDef(this, "controllers.Timesheets", "showBlankForsk", Seq(classOf[Long]), "GET", """""", _prefix + """timesheetsForsk/new/$sid<[^/]+>""")
)
                      

// @LINE:235
def editForsk(tid:Long, sid:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.editForsk(tid, sid, action), HandlerDef(this, "controllers.Timesheets", "editForsk", Seq(classOf[Long], classOf[Long], classOf[String]), "GET", """""", _prefix + """timesheetsForsk/$tid<[^/]+>/$sid<[^/]+>""")
)
                      

// @LINE:232
def listForsk(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Timesheets.listForsk(p, s, o, f, pg), HandlerDef(this, "controllers.Timesheets", "listForsk", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """timesheetsForsk/""")
)
                      
    
}
                          

// @LINE:277
// @LINE:276
// @LINE:275
// @LINE:274
// @LINE:273
// @LINE:271
class ReverseAccountHolders {
    

// @LINE:277
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountHolders.delete(id), HandlerDef(this, "controllers.AccountHolders", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """accountHolder/$id<[^/]+>/delete""")
)
                      

// @LINE:271
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountHolders.list(p, s, o, f, pg), HandlerDef(this, "controllers.AccountHolders", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """accountHolder/list""")
)
                      

// @LINE:275
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountHolders.edit(id, action), HandlerDef(this, "controllers.AccountHolders", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """accountHolder/$id<[^/]+>""")
)
                      

// @LINE:276
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountHolders.update(id), HandlerDef(this, "controllers.AccountHolders", "update", Seq(classOf[Long]), "POST", """""", _prefix + """accountHolder/$id<[^/]+>""")
)
                      

// @LINE:274
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountHolders.save(), HandlerDef(this, "controllers.AccountHolders", "save", Seq(), "POST", """""", _prefix + """accountHolder/""")
)
                      

// @LINE:273
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.AccountHolders.showBlank(), HandlerDef(this, "controllers.AccountHolders", "showBlank", Seq(), "GET", """""", _prefix + """accountHolder/new""")
)
                      
    
}
                          

// @LINE:160
// @LINE:159
// @LINE:158
// @LINE:157
// @LINE:156
// @LINE:155
class ReverseMediaTenders {
    

// @LINE:159
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MediaTenders.delete(id), HandlerDef(this, "controllers.MediaTenders", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """mediatenders/$id<[^/]+>/delete""")
)
                      

// @LINE:155
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MediaTenders.list(p, s, o, f, pg), HandlerDef(this, "controllers.MediaTenders", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """mediatenders/""")
)
                      

// @LINE:158
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MediaTenders.edit(id, action), HandlerDef(this, "controllers.MediaTenders", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """mediatenders/$id<[^/]+>""")
)
                      

// @LINE:157
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MediaTenders.update(id), HandlerDef(this, "controllers.MediaTenders", "update", Seq(classOf[Long]), "POST", """""", _prefix + """mediatenders/$id<[^/]+>""")
)
                      

// @LINE:160
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MediaTenders.save(), HandlerDef(this, "controllers.MediaTenders", "save", Seq(), "POST", """""", _prefix + """mediatenders/""")
)
                      

// @LINE:156
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.MediaTenders.showBlank(), HandlerDef(this, "controllers.MediaTenders", "showBlank", Seq(), "GET", """""", _prefix + """mediatenders/new""")
)
                      
    
}
                          

// @LINE:96
// @LINE:95
// @LINE:94
// @LINE:93
// @LINE:92
// @LINE:91
// @LINE:90
class ReverseSuppliers {
    

// @LINE:94
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Suppliers.delete(id), HandlerDef(this, "controllers.Suppliers", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """suppliers/$id<[^/]+>/delete""")
)
                      

// @LINE:90
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Suppliers.list(p, s, o, f, pg), HandlerDef(this, "controllers.Suppliers", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """suppliers/""")
)
                      

// @LINE:93
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Suppliers.edit(id, action), HandlerDef(this, "controllers.Suppliers", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """suppliers/$id<[^/]+>""")
)
                      

// @LINE:96
def getSuppliers(search:String, headOffice:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Suppliers.getSuppliers(search, headOffice), HandlerDef(this, "controllers.Suppliers", "getSuppliers", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """suppliers/getSuppliers/$search<[^/]+>""")
)
                      

// @LINE:92
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Suppliers.update(id), HandlerDef(this, "controllers.Suppliers", "update", Seq(classOf[Long]), "POST", """""", _prefix + """suppliers/$id<[^/]+>""")
)
                      

// @LINE:95
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Suppliers.save(), HandlerDef(this, "controllers.Suppliers", "save", Seq(), "POST", """""", _prefix + """suppliers/""")
)
                      

// @LINE:91
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Suppliers.showBlank(), HandlerDef(this, "controllers.Suppliers", "showBlank", Seq(), "GET", """""", _prefix + """suppliers/new""")
)
                      
    
}
                          

// @LINE:53
// @LINE:50
// @LINE:47
// @LINE:46
// @LINE:45
// @LINE:44
class ReverseProducts {
    

// @LINE:47
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.delete(id), HandlerDef(this, "controllers.Products", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """products/$id<[^/]+>/delete""")
)
                      

// @LINE:45
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.edit(id), HandlerDef(this, "controllers.Products", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """products/$id<[^/]+>""")
)
                      

// @LINE:46
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.update(id), HandlerDef(this, "controllers.Products", "update", Seq(classOf[Long]), "POST", """""", _prefix + """products/$id<[^/]+>""")
)
                      

// @LINE:50
def list(p:Int, s:String, o:String, f:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.list(p, s, o, f), HandlerDef(this, "controllers.Products", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """GET /products/           									controllers.Products.list()""", _prefix + """products/""")
)
                      

// @LINE:53
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.save(), HandlerDef(this, "controllers.Products", "save", Seq(), "POST", """GET /products/:ean       									controllers.Products.show(ean:Long) """, _prefix + """products/""")
)
                      

// @LINE:44
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Products.showBlank(), HandlerDef(this, "controllers.Products", "showBlank", Seq(), "GET", """#################### Sample Products Page ###############################################
 Edit existing products""", _prefix + """products/new""")
)
                      
    
}
                          

// @LINE:64
// @LINE:62
// @LINE:61
// @LINE:60
// @LINE:59
// @LINE:57
class ReverseCompanies {
    

// @LINE:62
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Companies.delete(id), HandlerDef(this, "controllers.Companies", "delete", Seq(classOf[Long]), "GET", """""", _prefix + """companies/$id<[^/]+>/delete""")
)
                      

// @LINE:57
def list(p:Int, s:String, o:String, f:String, pg:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Companies.list(p, s, o, f, pg), HandlerDef(this, "controllers.Companies", "list", Seq(classOf[Int], classOf[String], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """companies/""")
)
                      

// @LINE:61
def edit(id:Long, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Companies.edit(id, action), HandlerDef(this, "controllers.Companies", "edit", Seq(classOf[Long], classOf[String]), "GET", """""", _prefix + """companies/$id<[^/]+>""")
)
                      

// @LINE:60
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Companies.update(id), HandlerDef(this, "controllers.Companies", "update", Seq(classOf[Long]), "POST", """""", _prefix + """companies/$id<[^/]+>""")
)
                      

// @LINE:64
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Companies.save(), HandlerDef(this, "controllers.Companies", "save", Seq(), "POST", """""", _prefix + """companies/""")
)
                      

// @LINE:59
def showBlank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Companies.showBlank(), HandlerDef(this, "controllers.Companies", "showBlank", Seq(), "GET", """GET  /companies/           								controllers.Companies.list()""", _prefix + """companies/new""")
)
                      
    
}
                          
}
        
    