package com.formation;


import java.util.Scanner;
import java.util.Arrays;
public class FilterStringArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any words separated by space: ");
        String userInput = sc.nextLine();
        System.out.print("Please, enter minumum word length to filter words: ");
        int minLength = sc.nextInt();

        String[] words = userInput.split("\\s+");
        String[] filteredWords = filterWordsByLength(minLength, words);
        System.out.println(Arrays.toString(filteredWords));
    }



    public static String[] filterWordsByLength(int minLength, String[] words) {
		int i = 0;
        for (String word: words){
            if (word.length()>=minLength){
                i++;
            }
        }
        String[] newArray= new String[i];
        int j = 0;
        for (String word: words){
            if (word.length()>=minLength){

                newArray[j] = word ;
                j++;
            }
        }
        return newArray;
    }

}