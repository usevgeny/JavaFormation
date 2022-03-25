package WriteReadCompareYT;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadMyFile {
	
	public static void main(String[] args) {
		
		File folder = new File ("/Users/evgeny/Desktop/Dossier1/");
		
		File file = new File ("/Users/evgeny/Desktop/index.html");
		
		
		if (!folder.exists()) {
			folder.mkdir();
			
		}
		
		if(!file.exists()) {
			try { 
			file.createNewFile();
			}
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			};
		}
		
		else
		{
			
			
			try {
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
				
				String line = reader.readLine();
				
				while (line!=null) {
					
					System.out.println(line);  // à ce point la boucle est infinie
					line = reader.readLine();
				}
				
				reader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
		
				
	}

}
