package Task2;

import java.util.Scanner;
import java.util.Random;

public class SCT_SD_TASK_2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int randomNumber = random.nextInt(100) + 1; 
		int userGuess = 0;
		int attempts = 0;

		System.out.println("Welcome to the Guessing Game!");
		System.out.println("I have generated a number between 1 and 100.");
		System.out.println("Can you guess what it is?");

		while (userGuess != randomNumber) {
			System.out.print("Enter your guess: ");
			userGuess = scanner.nextInt();
			attempts++;

			if (userGuess < randomNumber) {
				System.out.println("Too low! Try again.");
			} else if (userGuess > randomNumber) {
				System.out.println("Too high! Try again.");
			} else {
				System.out.println("Congratulations! You've guessed the right number.");
				System.out.println("It took you " + attempts + " attempts.");
			}
		}

	}
}
