package com.formation;

public class StringFormattingDemo {

    public static void main(String[] args) {
        System.out.println("===== String formatting =====");
        System.out.println();
        String firstName = "Evgeny";

        String greetingsTemplate = "Hello, %s! Have a nice %s!";

        String morning = "morning";
        String afternoon = "afternoon";
        String evening = "evening";
        String formattedString = String.format(greetingsTemplate, firstName, evening);
        System.out.println(formattedString);


        System.out.printf("You have %d computers available at store\n", 7);





    }

}