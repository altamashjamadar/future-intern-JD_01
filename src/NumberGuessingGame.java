import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;
        int attemptCount = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");


        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attemptCount++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + numberToGuess);
                System.out.println("It took you " + attemptCount + " attempts.");
            }
        }


        scanner.close();
    }
}
