package Com.Revature;
import Com.Revature.Request;


import io.javalin.http.Handler;
import jdk.jfr.events.Handlers;

public class RequestHandlers  {

	private RequestService RequestService;

	public RequestHandlers() {
		RequestService = new RequestService();
	}


	
	public Handlers findAllrequest = ctx -> {
		
		System.out.println("Find all Requests.");

		/*
		 * As a general note, you can grab a query string (the query parameters added to
		 * the URL using the "?" symbol. These can be useful for allowing the client to
		 * filter results, etc.
		 */

		System.out.println(ctx.queryString());

		// To isolate a parameter:

		System.out.println(ctx.queryParam("minCost"));
		System.out.println(ctx.queryParam("maxCost"));

		/*
		 * The json() method serializes a Java object as JSON. This is necessary if you
		 * want to send data as JSON - otherwise we'd just be writing a Java object to
		 * the response body. Javalin uses Jackson Databind to achieve this.
		 */
		ctx.json(RequestService.findAll());
	};

	public Handler saveRequest = ctx -> {
		// Proof of concept that we received the JSON string which the client sent in
		// the
		// request body.
		System.out.println(ctx.body());
		// We'll have Javalin automatically deserialize the JSON string so that it can
		// be
		// stored as an Ingredient immediately. Again, Javalin uses Jackson Databind to
		// achieve this.
		Request retrievedRequest = ctx.bodyAsClass(Request.class);
		System.out.println(retrievedRequest);
		// Save the ingredient
		RequestService.save(retrievedRequest);
		// We should be intentional about setting response status codes when applicable.
		ctx.status(201);
	};

	public Handler Request_id = ctx -> {
		// Proof of Concept
		System.out.println(ctx.pathParam("id"));
		Request retrievedRequest = RequestService.findById(Integer.parseInt(ctx.pathParam("id")));
		// Don't forget to write the ingredient to the response body as JSON.
		if (retrievedRequest != null)
			ctx.json(retrievedRequest);
		else
			ctx.res.getWriter().write("Sorry. ");

	};
}