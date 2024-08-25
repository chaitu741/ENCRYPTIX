import java.util.Random;
import java.util.Scanner;

public class SimpleNumberGuessingGame {

    private static final int MAX_ATTEMPTS = 10;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            // Play a round and check if the user wants to play again
            playRound(scanner, random);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().trim().toLowerCase().equals("yes");
        } while (playAgain);

        System.out.println("Thank you for playing!");
    }

    private static void playRound(Scanner scanner, Random random) {
        int numberToGuess = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
        int attempts = 0;
        System.out.println("Welcome to our number guess game..");
        System.out.println("Guess the number between " + MIN_NUMBER + " and " + MAX_NUMBER + ". You have " + MAX_ATTEMPTS + " attempts.");

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                return;
            }
        }

        System.out.println("Sorry, you've used all " + MAX_ATTEMPTS + " attempts. The number was " + numberToGuess + ".");
    }
}