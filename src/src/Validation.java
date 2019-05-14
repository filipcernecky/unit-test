package src;

import java.util.Scanner;

public class Validation {
	  
	    public static int checkValidity
	    (int a, int b, int c) 
	    { 
	    	
	        if (a + b <= c || a + c <= b || b + c <= a) 
	            return 0; 
	        else
	           return 1; 
	        
	    } 
	    
	    public static void main(String args[]) 
	    { 
	  
	    	Scanner scan = new Scanner(System.in);
	    	int a = 0;
	    	int b = 0;
	    	int c = 0;
	    	double perimeter = 0;
	    	
	    	System.out.println("Enter lenght of side A:");
			a = scan.nextInt();
			
			System.out.println("Enter lenght of side B:");
			b = scan.nextInt();
			
			System.out.println("Enter lenght of side C:");
			c = scan.nextInt();
			
			scan.close();
			
			perimeter = a + b + c;
	      
	        if ((checkValidity(a, b, c)) == 1) 
	            System.out.print("Valid, The perimeter of triangle is " + (perimeter)); 
	        else
	            System.out.print("Invalid"); 
		    
	    } 

	    	String sentence = "ToDAY   WeAthEr   GREat";   

	    	public static String upperCaseWords(String sentence) {
	    		String words[] = sentence.replaceAll("\\s+", " ").trim().split(" ");
		        String newSentence = "";
		        for (String word : words) {
		            for (int i = 0; i < word.length(); i++)
		                newSentence = newSentence + ((i == 0) ? word.substring(i, i + 1).toUpperCase(): 
		                    (i != word.length() - 1) ? word.substring(i, i + 1).toLowerCase() : word.substring(i, i + 1).toLowerCase().toLowerCase() + " ");
		        }

		        return newSentence;
		    
	    	}
	} 
