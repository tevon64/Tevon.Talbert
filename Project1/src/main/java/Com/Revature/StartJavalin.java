package Com.Revature;

import java.util.Enumeration;
import io.javalin.Javalin;
import javax.servlet.http.HttpSession;


public class StartJavalin {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(3);
		 RequestAction obj = new  RequestAction();
		
		
		app.get("/hello", ctx -> {
			ctx.html("Whats up");
		});
		
		app.get("/free", ctx ->{
			ctx.res.getWriter().write("Wait til the next episode");
			
		});
		app.post("Mainpage", ctx ->{
		   
		});
	}
}