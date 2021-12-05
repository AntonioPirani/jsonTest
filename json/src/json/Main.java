//lettura su file in formato json

//ok
package json;

import java.io.*;
import org.json.simple.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prova run #2");
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
			
			System.out.println(s);
			
			//Object obj = JSONValue.parse(s);
		   // JSONArray array = (JSONArray)obj;
			//System.out.println("Stampa di obj: \n" + obj);
			
			JSONObject obj = (JSONObject)JSONValue.parse(s);
			String id = (String) obj.get("id");
			System.out.println("Impiegato: "+id);
			
		    
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
