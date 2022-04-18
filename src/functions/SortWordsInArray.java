package functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
/*
public class SortWordsInArray {
    
    public static void main(String[] args) {
		System.out.print("Please, enter words separated by space: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		List<String> strList = new ArrayList<>(Arrays.asList(str1.split(" ")));
		
		strList.sort(Comparator.comparing(st->st.length()));
		for(int i=strList.size(); i>=0;i--) {
			
			System.out.println(strList.get(i));
		}
		
    }
}
*/

public class SortWordsInArray {
	
	public static void main(String[] args) {
		System.out.print("Please, enter words separated by space: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		String[] words = userInput.split("\\s+");
		
		Arrays.sort(words, (s1, s2) -> {				// rewritting comparator
			int result = s2.length() - s1.length();
			if (result == 0) {
				result = s1.compareToIgnoreCase(s2);
			}
			return result;
		});
		for (String word : words) {
			System.out.print(word + " ");
		}
	}

}














