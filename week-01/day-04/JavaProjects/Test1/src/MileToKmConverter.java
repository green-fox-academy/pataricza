import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the km value you want to convert: ");
        int userInput = scanner.nextInt();

        double result = userInput*0.621371192;

        System.out.println("The km you entered is " + result + " miles.");

        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
    }
}
