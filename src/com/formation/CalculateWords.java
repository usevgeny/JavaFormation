package com.formation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        int amountOfWords = getWordsAmount(userInput);

        System.out.println("Amount of words in your text: " + amountOfWords);
    }

    public static int getWordsAmount(String text) {
		String[] wordsArray = text.split("[\\p{Punct}\\s]");
        String punctSpacePattern = "[a-zA-Z]";
        Pattern p= Pattern.compile(punctSpacePattern);

        int i=0;
        for (String elem: wordsArray){
            Matcher m = p.matcher(elem);

            if (m.find()) {
                i++;
            }
        }
        return i;
    }
}