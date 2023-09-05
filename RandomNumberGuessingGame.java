import java.util.Random;
import java.util.Scanner;

 class RandomNumberGuessingGame {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        
        Random random = new Random();
        
        int randomNumber = random.nextInt(max - min + 1) + min;
        
        Scanner scanner = new Scanner(System.in);
        
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        System.out.println(" Random Number Guessing Game!");
        System.out.println("generated a random number between " + min+ " and " + max + " guess it!");
        
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;
            
            if (userGuess < min|| userGuess > max) {
                System.out.println("Please enter number within the specified rate");
            } else if (userGuess < randomNumber) {
                System.out.println("enter a max number.");
            } else if (userGuess > randomNumber) {
                System.out.println("enter a min number.");
            } else {
                System.out.println("Congratulations! You guessed the number is right " + randomNumber + " correctly in " + attempts + " attempts.");
                guessedCorrectly = true;
            }
        }
        
        scanner.close();
    }
}
