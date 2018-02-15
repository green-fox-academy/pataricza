import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write in the number you want to check: ");
        int userInput1 = scanner.nextInt();

        if(userInput1 % 2 == 0){
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is odd.");
        }

    }
}


// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.