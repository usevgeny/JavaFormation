package com.formation;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FirstCharCapital {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();

        System.out.println(firstCharToTitleCase(userInput));
    }

    public static String firstCharToTitleCase(String string) {

        char[] chars=string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i=0;i<chars.length;i++){
            if (!found && Character.isLetter(chars[i])){
                chars[i]=Character.toUpperCase(chars[i]);
                found=true;
            }
            else if (!Character.isLetter(chars[i])){
                found=false;
            }
        }

        return String.valueOf(chars);
    }
}