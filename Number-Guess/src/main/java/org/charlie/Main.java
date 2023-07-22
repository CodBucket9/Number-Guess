package org.charlie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minRange = 1; // The Minimum range for the generated number.
        int maxRange = 10; // The Maximum range for the generated number.

        Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have chosen a number between: [1 - 100]");

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0; // Starting value for the number of attempts.

        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) { // If the user has guessed the correct number.
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!"); // Outputting correct number.
                System.out.println("It took you " + attempts + " attempts."); // Outputting total amount of attempts.
                break;
            } else if (guess < randomNumber) { // Higher or Lower outputs
                System.out.println("[GAME] Too low. Try again!");
            } else {
                System.out.println("[GAME] Too high. Try again!");
            }
        }

        scanner.close();
    }
}