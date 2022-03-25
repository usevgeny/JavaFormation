package WriteReadCompareYT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileReader {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		// String filePath = "/Users/evgeny/Desktop/POEI/15_03_2022";
		
		String separator = File.separator;
		String filePath = separator+"Users"+separator+"evgeny"+separator+"Desktop"+separator+"POEI"+separator+"test.txt";
		// System.out.println(filePath);
		
		// get current directory: System.getProperty("user.dir")
		
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		// boucle tant qu'il y a les lignes dans le file
		
		/* while(scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		 
		scanner.close();
		*/
		// 
		
		String line = scanner.nextLine();
		String[] numbers = line.split(" ");
		int[] numbersInt = new int[10];
		
		System.out.println(Arrays.toString(numbers));
		
		for(int i = 0; i<numbers.length; i++) {
			numbersInt[i]=Integer.parseInt(numbers[i]);
			
		}
		System.out.println("La meme liste avec les integers");
		System.out.println(Arrays.toString(numbers));
		scanner.close();
		
		
		
	}

}
 