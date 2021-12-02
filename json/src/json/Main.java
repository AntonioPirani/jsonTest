//lettura su file in formato json

//ok
package json;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prova run");
		String next;
		
		try {
			BufferedReader reader = new BufferedReader (new FileReader ("fileJSON.txt"));
			
			do {
				next = reader.readLine();
				if ( next != null) {
					
					System.out.println(next);
					
				}
				
			} while (next != null);
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
