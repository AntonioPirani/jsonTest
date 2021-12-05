//lettura su file in formato json

//ok
package json;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prova run #3");
		String next;
		
		String s="";
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader ("fileJSON.txt"));
			
			do {
				next = reader.readLine();
				if ( next != null) {
					
					//System.out.println(next);
					s=s+next;
					
				}
				
			} while (next != null);
			
			//System.out.println(s);
			
			//Object obj = JSONValue.parse(s);
		   // JSONArray array = (JSONArray)obj;
			//System.out.println("Stampa di obj: \n" + obj);
			
//			JSONObject obj = (JSONObject)JSONValue.parse(s);
//			String id = (String) obj.get("id");
//			System.out.println("ID: "+id);
			
			// convert json to Java
		    //JSONObject obj = (JSONObject) JSONValue.parse(json);
			
			JSONParser parser = new JSONParser();
			try {
				
				JSONObject json = (JSONObject)parser.parse(s);
				JSONArray results = (JSONArray) json.get("results");
				for (int i = 0; i < results.size(); i++) {
				    // obtaining the i-th result
					JSONObject result = (JSONObject) results.get(i);
				    JSONObject geometry = (JSONObject) result.get("geometry");
				    JSONObject location = (JSONObject) geometry.get("location");
				    System.out.println(location.get("lat"));
				    System.out.println(location.get("lng"));
				}
				
				String status = (String )json.get("status");
				System.out.println("Status: "+status);
				
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		    
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
