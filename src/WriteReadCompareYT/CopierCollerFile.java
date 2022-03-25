package WriteReadCompareYT;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CopierCollerFile {
public static void main(String[] args) {
	
	File source = new File ("/Users/evgeny/Desktop/index.html");
	File dest = new File ("/Users/evgeny/Desktop/Dossier1/"+source.getName());
	try {
		Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
	source.delete();
}
}
