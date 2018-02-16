import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want me to calculate with?");
        int numberOFNumbers = scanner.nextInt();

        int theSum = 0;

        for(int x = 0; x < numberOFNumbers; x++){
            System.out.println("Add the " + (x+1) + ". number!");
            int theNumber = scanner.nextInt();
            theSum = theSum + theNumber;
        }

        System.out.println("\nThe sum of the numbers: " + theSum);
        System.out.println("\nThe average of the numbers is: " + (double) theSum/numberOFNumbers);
    }
}

// Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4