package Exam;

import java.util.Arrays;

public class Question3 {
	//Void method to sort the arrays with parameter array 
		public static void sortArray(int[] array) {
			   //Calling method array sorts (special method to sort the given arrays)
			   Arrays.sort(array);
			   
			   //Using forloop to iterate and print the length of numbers of the given condition
			   for (int i = 0; i < array.length; i++) {
				   //Print the array numbers vertically with space-between
				   System.out.print(array[i] + " ");
			   };
		}
		
		//Driver Method / Main method to run the code
		public static void main(String[] args) {
			//Create a variable with the array list
			int arrayList[] = {8,2,3,6,1,5,11,7,4,9};
			
			//Calling the sortArray method
			sortArray(arrayList);
			
		}
}
