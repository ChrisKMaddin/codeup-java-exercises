

import java.util.Random;
import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
        // Create a random number generator
        Random random = new Random();
        // Use Scanner for getting input from user
        Scanner scanner = new Scanner(System.in);
        // Use the random generator to
        // pick a number between 0 and 99 (inclusive)
        int number = random.nextInt(100);
        int guess = -1;
        // Loop until the user has guessed the number
        while (guess!=number) {
            // Prompt the user for their next guess
            System.out.print("Enter your guess: ");
            // Read the users guess
            guess = scanner.nextInt();
            // Check if the guess is high, low or correct
            if (guess<number) {
                // Guess is too low
                System.out.println("nah dawg, Too low, please try again");
                } else if (guess>number) {
                // Guess is too high
                System.out.println("I'm afraid that's a bit too high, please try again");
                } else {

                // Guess is correct !!

                System.out.println("You are Correct Sir! the number was " + number);
            }
        }

    }
}

///**
// * Welcome to the world of game development!
// * You are going to build a high-low guessing game. Create a class named HighLow inside of src.
// *
// * The specs for the game are:
// * Game picks a random number between 1 and 100.
// * Prompts user to guess the number
// * All user inputs are validated
// * If user's guess is less than the number, it outputs "HIGHER"
// * If user's guess is more than the number, it outputs "LOWER"
// * If a user guesses the number, the game should declare "GOOD GUESS!"
// *
// */
//
//public class HighLow {
//    public static void main(String[] args) {
//
//    }
//}