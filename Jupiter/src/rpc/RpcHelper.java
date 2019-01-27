package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

//Do extraction for without writing repeated codes
//Since recommendation, query, liked all need these functions
public class RpcHelper {
	public static void writeJSONArray(HttpServletResponse response, JSONArray array) throws IOException {
		response.setContentType("application/json");
		response.setHeader("Access-Control-Allow-Origin", "*");
		//Get the response writer from the response so can write out something to the front end
		PrintWriter out = response.getWriter();
		//print the array to the frontEnd
		out.print(array);
		out.close();
	}
	
	public static void writeJSONObject(HttpServletResponse response, JSONObject obj) throws IOException {
		response.setContentType("application/json");
		response.setHeader("Access-Control-Allow-Origin", "*");
		PrintWriter out = response.getWriter();	
		out.print(obj);
		out.close();

	}
}
