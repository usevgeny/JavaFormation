package CodingGames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Decrypting {
	
	
	public static void main(String[] args) {
		
	String userInput="CodingGame";
	
	char[] arrayUserInput=userInput.toCharArray();
	String result = "";
	

	
	
	for (int i=0;i<arrayUserInput.length-1;i++) {
		
		
		if(Character.isLetter(arrayUserInput[i])&&Character.isLetter(arrayUserInput[i+1])) {
			result=result+arrayUserInput[i]+" ";
			
		}
		else
		{result=result+arrayUserInput[i];}
		
	}
	result=result+arrayUserInput[(arrayUserInput.length-1)];
	System.out.println(result);

}
	
	

	}
