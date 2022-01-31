package com.formation;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexExamples {

    public static void main(String[] args){

        String gmailPattern = "[a-zA-Z-\\d]+@gmail.com";
        Pattern p= Pattern.compile(gmailPattern);
        String sampleText = "some random text that contains test-1@gmail.com";
        Matcher m = p.matcher(sampleText);
        m.find();

        String gmailAdress = m.group();
        System.out.println(gmailAdress);

        String sampleText2 = "Just a testtmessage. are you talkin to me? yep it is just a joke!";
        String[] sentences = sampleText2.split("[\\.!?]");
        System.out.println(Arrays.toString(sentences));







    }

}
