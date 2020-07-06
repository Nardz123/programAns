package Exam;

public class Question1 {
	
	public static void main(String[] args) {
		
		//Variable for salary and working days
		int salary= 100;
		int workingDays = 7;
		
		//forloop to iterate and get the salary earned within 7 days
		for(int i=2;i<=workingDays;++i){
			//Multiply the salary
			salary*=2;
			//Printout the money earned by tim by each day within 7 days
			System.out.println("Total money earned by Tim by each day within "+(i)+ " days: " + salary);
		}
		
	}
}
