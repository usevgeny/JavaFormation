package WriteReadCompareYT;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateFile {
	
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
			
			List<String> htmlLines= Arrays.asList("<html>","<head>","<title>","MyTitle","</title>","</head>","<body>","<p>","HelloWorld! ça va??","</p>","</body>","</html>");
			
			try {
				
				
				FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				for(String line:htmlLines) {
					
					bw.write(line);
					bw.newLine();
					System.out.println(line);
					
				}
				bw.close();
				writer.close();
			/*	bw.write("Salut c'es mon fichier"); 
				bw.newLine();
				bw.write("deuxieme ligne"); 
				bw.close();
				writer.close();
				*/
				
			} catch (Exception e) {
				// TODO: handle exception
			System.out.println(e);
			}
			
		}
		
		
				
	}

}
