import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(99) + 1;
        int numberOfGuesses=0;

        System.out.println("Guess a number between 1 and 100!");
        int guess = scanner.nextInt();

        while(guess!=number) {
            if (guess < number && guess > 0) {
                System.out.println("The stored number is higher.");
                System.out.println("Guess again!");
                guess = scanner.nextInt();
            } else if (guess > number && guess < 101) {
                System.out.println("The stored number is lower.");
                System.out.println("Guess again!");
                guess = scanner.nextInt();
            } else {
                System.out.println("You have to guess a number between 1 and 100!");
                System.out.println("Guess again!");
                guess = scanner.nextInt();
            }
            numberOfGuesses++;
        }
        numberOfGuesses++;
        System.out.println("You've found the number " + number + " in " + numberOfGuesses + " tries. ");
    }
}

// Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8