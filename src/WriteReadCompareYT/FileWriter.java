package WriteReadCompareYT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
	
	
	public static void main(String[] args) throws FileNotFoundException{
		
		
		File file = new File("Test2.txt");
		PrintWriter pw = new PrintWriter(file);
		pw.println("HelloWorld!");
		
		pw.close();
	}

}
