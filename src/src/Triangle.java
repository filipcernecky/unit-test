package src;

import java.util.Scanner;

public class Triangle {
		  
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
	} 

