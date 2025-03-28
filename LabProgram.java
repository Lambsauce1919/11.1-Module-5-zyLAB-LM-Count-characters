import java.util.Scanner;

	public class LabProgram {
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in); // allows input to be scanned into variables
	      String uInputLetter; // character you want to count
	      String uInputSentence; // sentence you want to input to scan
	      int i;
	      int count = 0;
	      // scans for user input and assigns it to String vars
	      uInputLetter = scnr.next(); // scans the first string of characters without spaces
	      uInputSentence = scnr.nextLine(); // scans the remaining string 
	      
	      char targetChar = uInputLetter.charAt(0); // used to find how many times the letter in uInputLetter is found in the sentence
	      for (i = 0; i < uInputSentence.length(); i++) { // loop statement that runs until all the characters in the input statement have been ran.
	    	  
	    	  if ((uInputSentence.charAt(i)) == (targetChar)) { // this compares the sentence character to the target character, while also ignoring case as an added bonus
	    		  count++;
	    	  }
	    	  
	      }
	      
	      // series of if statements that produce different out print statements depending on the count value
	      if (count == 1) {
	    	  System.out.println(count + " " + uInputLetter);
	      }
	      else if (count > 1) {
	    	  System.out.println(count + " " + uInputLetter + "'s");
	      }
	      else if (count == 0) {
	    	  System.out.println(count + " " + uInputLetter + "'s");
	      }
	   }
	}
