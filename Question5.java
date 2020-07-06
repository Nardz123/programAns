package Exam;

public class Question5 {
	
    
    //Method to print all the permutations of letters
    public static void letterCombinations(String letters, String ans) 
    { 
  
        // If string is empty 
        if (letters.length() == 0) { 
        	//Print out the permutations letter
            System.out.println(ans + " "); 
            return; 
        } 
        
        //Forloop to iterate the letter combinations
        for (int i = 0; i < letters.length(); i++) { 
  
            // character of letters
            char chars = letters.charAt(i); 
  
            // Rest of the string
            String charLetters =letters.substring(0, i) +  
            		letters.substring(i + 1); 
  
            // Recursive call of method letterCombinations 
            letterCombinations(charLetters, ans + chars); 
        } 
    } 
    
    // Main method to run the code(Driver Method)
    public static void main(String[] args) 
    { 
    	//Variable with the given combination of letters.
        String letters = "ABC"; 
        //Call letterCombinations method
        letterCombinations(letters, ""); 
    } 

}
