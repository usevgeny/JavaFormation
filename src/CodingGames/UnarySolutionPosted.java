package CodingGames;


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class UnarySolutionPosted {



    public static void main(String args[]) {
        
    	Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String tmpResult = "";

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        
        byte[] bMessage =  MESSAGE.getBytes(); 
        
        Arrays.toString(bMessage);
        
        
        
        for(int i = 0;i<MESSAGE.length();i++) {
        	int val = Integer.valueOf(MESSAGE.charAt(i));
        	
        	String bin="";
        	while(val>0) {
        		
        		 if (val % 2 == 1)
                 {
                     bin += '1';
                 }
                 else
                     bin += '0';
                 val /= 2;
             }
             if(bin.length()<7){
        		bin=bin+"0";
        	}
             bin = reverse(bin);
        	
        	tmpResult=tmpResult+bin;
        	}
        	
        //System.out.println("Intermediate result equals to: "+tmpResult);
        //System.out.println("Here is the result: "+encoded(tmpResult));
        System.out.println(encoded(tmpResult));
        }
    public static String reverse(String rev ){
    	String result = "";
    	int len = rev.length();
    	
    	for(int i=len-1;i>=0;i--) {
    		result=result+rev.charAt(i);
    	}
    	
    	
    	return result;
    }
    
    public static String encoded(String clear) {
    	String result = "";
    	String value="0";
    	String prevousElement;
    	int index = 0;
    	while(index<clear.length()) {
    		if (index==0) {prevousElement="";}
    		else{prevousElement=Character.toString(clear.charAt(index-1));}
    		
    		
    		
    		if(
    				((result==""||prevousElement.equals("0"))
    				&&Character.toString(clear.charAt(index)).equals("1"))
    				
    
    				)
    				{result=result+" 0 "+value;}


    		else if(
    				
    				(result==""
    				&&Character.toString(clear.charAt(index)).equals("0"))
    				
    				)
    				
    				{result=result+" 00 "+value;}

    		
    		else if(
    				
    				((result==""||prevousElement.equals("0"))
    				&&Character.toString(clear.charAt(index)).equals("0"))
    				
    				)
    				
    				{result=result+value;}
    		
    		
    		
    		else if(
    				
    				((result==""||prevousElement.equals("1"))
    				&&Character.toString(clear.charAt(index)).equals("0"))
    				
    				)
    				
    				{result=result+" 00 "+value;
    				}
    		else if(
    				
    				((result==""||prevousElement.equals("1"))
    				&&Character.toString(clear.charAt(index)).equals("1"))
    				
    				)
    				
    				{result=result+value;}
    		
    		index++;
    	}

    		result=result.trim();
    	return result;
    }   
        
        
        
    }
