package errors;
import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.libs.F.*;

import static play.mvc.Results.*;

public class Global extends GlobalSettings {

    public Promise<SimpleResult> onHandlerNotFound(RequestHeader request) {
        
    	return Promise.<SimpleResult>pure(Results.notFound(
            views.html.notFoundPage.render()
        ));
    }
    
}