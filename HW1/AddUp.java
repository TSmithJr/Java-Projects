//Timmy Smith - MIS 120 HW #1 - Michael Pope
import java.util.Scanner; //importing scanner to receive user input 

public class AddUp { //AddUp class created 
	
	public static void main(String [] args) 
	{
		String BANNER = "*** RESULTS ***\n"; //Declaring all variables to start 
		int firstInt, secondInt, compInt;
		double firstDbl, secondDbl, compDbl;
		
		Scanner kbInput; //Initializing scanner 
		kbInput = new Scanner(System.in);

		System.out.println("Enter the first integer: "); //Prompt user for first int
		firstInt = kbInput.nextInt();

		System.out.println("Enter the second integer: "); //Prompt user for second int
		secondInt = kbInput.nextInt();

		System.out.println("Enter the first floating point number: "); //Prompt user for first double
		firstDbl = kbInput.nextDouble();

		System.out.println("Enter the second floating point number: "); //Prompt user for first double
		secondDbl = kbInput.nextDouble();
		
		compInt = firstInt + secondInt; //Formula for compInt and compDbl
		compDbl = firstDbl + secondDbl;

		System.out.println(BANNER); //Outputting final result in correct format w/ banner
		System.out.println("INT : " + compInt);
		System.out.println("DOUBLE : " + compDbl);
	}
}