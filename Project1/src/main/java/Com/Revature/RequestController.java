package Com.Revature;


import static io.javalin.apibuilder.ApiBuilder.get;
import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.post;

import org.eclipse.jetty.http.HttpParser.RequestHandler;

import io.javalin.Javalin;
public class RequestController {



	private Javalin app;
	private RequestHandlers RequestHandler;
	
	public RequestController(Javalin app) {
		this.app = app;
		this.RequestHandler = new RequestHandlers();
	}

  
	
	
}