package src;

//import java.util.Scanner;

public class Program {

	String sentence = "ToDAY   WeAthEr   GREat";   

	public static String upperCaseWords(String sentence) {
	//	Scanner strin = new Scanner(System.in);
		
	//	System.out.println("Enter a string:");
	//	sentence = strin.nextLine();
		
	        String words[] = sentence.replaceAll("\\s+", " ").trim().split(" ");
	        String newSentence = "";
	        for (String word : words) {
	            for (int i = 0; i < word.length(); i++)
	                newSentence = newSentence + ((i == 0) ? word.substring(i, i + 1).toUpperCase(): 
	                    (i != word.length() - 1) ? word.substring(i, i + 1).toLowerCase() : word.substring(i, i + 1).toLowerCase().toLowerCase() + " ");
	        }

	        return newSentence;
	    }
	//Today Weather Great
	//ToDAY   WeAthEr   GREat
}