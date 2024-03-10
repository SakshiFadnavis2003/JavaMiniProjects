import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;
        System.out.println("Welcome to Guessing Game!");
        while (!guessedCorrectly) {
            System.out.print("Guess the number (1-100): ");
            int guess = scanner.nextInt();
            attempts++;
            if (guess == randomNumber) {
                guessedCorrectly = true;
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
            } else if (guess < randomNumber) {
                System.out.println("Try higher!");
            } else {
                System.out.println("Try lower!");
            }
        }
    }
}
