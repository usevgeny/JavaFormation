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

/*
				\p{Lower}   A lower-case alphabetic character: [a-z]
				\p{Upper}   An upper-case alphabetic character:[A-Z]
				\p{ASCII}   All ASCII:[\x00-\x7F]
				\p{Alpha}   An alphabetic character:[\p{Lower}\p{Upper}]
				\p{Digit}   A decimal digit: [0-9]
				\p{Alnum}   An alphanumeric character:[\p{Alpha}\p{Digit}]
				\p{Punct}   Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
				\p{Graph}   A visible character: [\p{Alnum}\p{Punct}]
				\p{Print}   A printable character: [\p{Graph}\x20]
				\p{Blank}   A space or a tab: [ \t]
				\p{Cntrl}   A control character: [\x00-\x1F\x7F]
				\p{XDigit}  A hexadecimal digit: [0-9a-fA-F]
				\p{Space}   A whitespace character: [ \t\n\x0B\f\r]

		*/





    }

}
