package x.y.javalin.restapi;

import java.util.HashMap;
import java.util.Map;

import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Map<String, Object> m = new HashMap<>() {{
			put("test", "set");
		}};
	    var app = Javalin.create(/*config*/)
	        .get("/", ctx -> ctx.result("Hello World")) // text/plain
	        .get("/json", ctx -> ctx.json(m)) // application/json
	        .start(7070);
	}
}
