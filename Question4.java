package Exam;

public class Question4 {
	//Method for the total of work Aaron and Brandon can do
		public static int workDays(int Aaron, int Brandon) {
			//Formula on how many days can finish if they work together
			int totalWorkDays = (Aaron*Brandon)/(Aaron+Brandon);
			
			//Will return the Aaron and Brandon working days.
			return totalWorkDays;
			
		}
		
		
		//Main method to run the code(Driver method)
		public static void main(String[] args) {
			
			//Variable for the called method
			int workingDays = workDays(12, 15);
			
			//Will printout Aaron and Brandon total working days.
			System.out.println("They will finish within "+ workingDays + " days.");
		}
}
