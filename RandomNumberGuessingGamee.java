import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessingGamee {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        
        Random random = new Random();
        
        int randomNumber = random.nextInt(max - min + 1) + min;
        
        Scanner scanner = new Scanner(System.in);
        
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.println("I have generated a random number between " + min + " and " + max + ". Try to guess it!");
        
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < min || userGuess > max) {
                System.out.println("Please enter a number within the specified rate.");
            } else if (userGuess < randomNumber) {
                System.out.println("Try a max number.");
            } else if (userGuess > randomNumber) {
                System.out.println("Try a min number.");
            } else {
                System.out.println("Congratulations! You guessed the number is right " + randomNumber + " correctly in " + attempts + " attempts.");
                guessedCorrectly = true;
            }
        }
        
        scanner.close();
    }
}
