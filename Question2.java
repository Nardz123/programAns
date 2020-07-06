package Exam;

public class Question2 {
	
	//Method for the product volume using double data type
		public static double Volume(double length, double width, double height) {
			//Formula for the product volume equation.
			double volume = length * width * height;
			
			//Will return the variable volume
			return volume;
		}
		
		
		//Main method to run the code(Driver method)
		public static void main(String[] args) {
			
			//Variable of the called method volume
			double totalVolume = Volume(10, 10, 20);
			
			//Will printout the total volume of the container.
			System.out.println("The container's volume is "+ totalVolume +"");
		}
}
