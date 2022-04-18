package streamDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Scratch {
	
	public static void main(String[] args) {
		System.out.print("Please, enter words separated by space: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		
		List<String> strList = new ArrayList<>(Arrays.asList(str1.split(" ")));
		List<String> str2 = new ArrayList<String>();
		System.out.println(strList.stream().allMatch((s)-> s.contains("ap"))); // aaa apple bbbb cherry nnn lll // false
		System.out.println(strList.stream().anyMatch((s)-> s.contains("ap")));
		System.out.println(strList.stream().noneMatch((s)-> s.contains("ap")));
		
}
}