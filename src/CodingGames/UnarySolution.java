package CodingGames;


import java.util.*;
import java.io.*;
import java.math.*;
import java.nio.charset.Charset;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
/**
 * Le binaire avec des 0 et des 1 c'est bien. Mais le binaire avec que des 0, ou presque, c'est encore mieux.

Ecrivez un programme qui, à partir d'un message en entrée, affiche le message codé avec cette technique en sortie.

 	Règles

Voici le principe d'encodage :

Le message en entrée est constitué de caractères ASCII (7 bits)
Le message encodé en sortie est constitué de blocs de 0
Un bloc est séparé d'un autre bloc par un espace
Deux blocs consécutifs servent à produire une série de bits de même valeur (que des 1 ou que des 0) :
- Premier bloc : il vaut toujours 0 ou 00. S'il vaut 0 la série contient des 1, sinon elle contient des 0
- Deuxième bloc : le nombre de 0 dans ce bloc correspond au nombre de bits dans la série
 	Exemple

Prenons un exemple simple avec un message constitué d'un seul caractère : C majuscule. C en binaire vaut 1000011 ce qui donne avec cette technique :

0 0 (la première série composée d'un seul 1)
00 0000 (la deuxième série composée de quatre 0)
0 00 (la troisième série composée de deux 1)
C vaut donc : 0 0 00 0000 0 00
			  0 0 00 0000 0 00

 
Deuxième exemple, nous voulons encoder le message CC (soit les 14 bits 10000111000011) :

0 0 (un seul 1)
00 0000 (quatre 0)
0 000 (trois 1)
00 0000 (quatre 0)
0 00 (deux 1)
CC vaut donc : 0 0 00 0000 0 000 00 0000 0 00
 * @author evgeny
 *
 */


public class UnarySolution {



    public static void main(String args[]) {
        System.out.println("Enter you message ");
    	Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        String tmpResult = "";

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Charset charset = Charset.forName("ASCII");
        byte[] bMessage =  MESSAGE.getBytes(charset); 
        
        Arrays.toString(bMessage);
        System.out.println(Arrays.toString(bMessage));
        
        
        for(int i = 0;i<MESSAGE.length();i++) {
        	int val = Integer.valueOf(MESSAGE.charAt(i));
        	
        	String bin="";
        	while(val>0) {
        		
        		 if (val % 2 == 1)
                 {
                     bin += "1";
                 }
                 else
                     bin += "0";
                 val /= 2;
             }
        	if(bin.length()<7){
        		bin=bin+"0";
        	}
             bin = reverse(bin);
        	
        	tmpResult=tmpResult+bin;
        	
        	}
        	
        System.out.println("Intermediate result equals to: "+tmpResult);
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
