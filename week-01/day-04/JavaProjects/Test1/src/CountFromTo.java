import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please add a number: ");
        int input1 = scanner.nextInt();
        System.out.println("Please add another number: ");
        int input2 = scanner.nextInt();

        while(input2 <= input1){
            System.out.println("\n###The second number should be bigger!###\n");

            System.out.println("Please add a number: ");
            input1 = scanner.nextInt();

            System.out.println("Please add another number: ");
            input2 = scanner.nextInt();
        }
        System.out.println("");
        while(input1<input2) {
            System.out.println(input1);
            input1++;
        }
    }
}

// Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5