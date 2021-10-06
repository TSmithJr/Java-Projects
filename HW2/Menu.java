//Timmy Smith - MIS 120 HW #2 - Michael Pope
import java.util.Scanner;

public class Menu {

	public static final int GUESS_MIN = 1;
	public static final int GUESS_MAX = 100;
	public static final int GUESS_COUNT = 7;
	public static final int CORRECT_GUESS = 27;
	public static final int ADD_SENTINEL = 0;

	static void numberGuess(Scanner kbInput) 
	{
		int i = 0;
		boolean found = false;
		int guessNum;

		while (i < GUESS_COUNT && found == false){

			System.out.println("Enter your guess: ");
			guessNum = kbInput.nextInt();

			if ((guessNum < GUESS_MIN) || (guessNum > GUESS_MAX)){
				System.out.println("\nThat was an invalid guess.\n");
			}
			else if ((guessNum < 27) || (guessNum == GUESS_MIN)){
				i++;
				System.out.println("\nThat guess was less than the correct number.\n");
			}
			else if (guessNum > 27){
				i++;
				System.out.println("\nThat guess was greater than the correct number.\n");
			}
			else{
				System.out.println("\nThat guess was the correct number.\n");
				found = true;
			}
		}

		if (i == 7){
			System.out.println("You have run out of guesses, the correct number was 27\n");
		}

		System.out.println("Number Guess will now exit\n");
	}

	static void addTotal(Scanner kbInput)
	{

		int number;
		int total = 0;
		boolean input = true;

		while (input == true){

			System.out.println("\nEnter a number to add to the total, or enter " +ADD_SENTINEL+" to exit.\n");
			number = kbInput.nextInt();
			total += number;

			if (number == ADD_SENTINEL){
				input = false;
				System.out.println("\nThe total of all the numbers is: "+total+"\n");
				System.out.println("Add Total will now exit\n");
			}
		}
	}


	static void counter(Scanner kbInput)
	{

		int firstNum;
		int secondNum;

		System.out.println("\nPlease enter the starting number: ");
		firstNum = kbInput.nextInt();
		System.out.println("\nPlease enter the ending number, it must be bigger than the starting number: ");
		secondNum = kbInput.nextInt();

		for (int i = firstNum; i <= secondNum; i++){
			System.out.println("#"+i);
		}

		System.out.println("\nCountdown will now exit\n");
	}

	public static void main(String [] args){
		
		int choice; 
		boolean exit = true;
		Scanner kbInput; 
		kbInput = new Scanner(System.in);

		do {
			System.out.println("1: Number Guess\n2: Add Total\n3: Countdown\n4: Exit Program\n");

			System.out.println("Enter the number corresponding to your preferred choice:");
			choice = kbInput.nextInt();

			switch(choice) {
				case 1:
					System.out.println("\nYou chose Number Guess\n");
					numberGuess(kbInput);
					break;
				case 2:
					System.out.println("\nYou chose Add Total");
					addTotal(kbInput);
					break;
				case 3:
					System.out.println("\nYou chose Countdown");
					counter(kbInput);
					break;
				case 4:
					System.out.println("\nThe program will now exit.");
					exit = false;
					break;
				default: 
					System.out.println("\nSorry, that was not a valid choice\n");
			}
		} while (exit == true);
	}
}