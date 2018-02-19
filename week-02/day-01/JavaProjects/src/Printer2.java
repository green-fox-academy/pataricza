import java.util.Scanner;

public class Printer2 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the words you want to print: ");
        int numberOfWords = scanner.nextInt();

        String[] words;
        words = new String[numberOfWords];

        System.out.println("Write in the words you want to print, press Enter after every word:\n");

        for (int i = 0; i < numberOfWords ; i++) {

                words[i] = scanner.next();

        }

        printer(words);

    }

    public static void printer(String[] printThese){

        for (String tempString : printThese){

            System.out.println(tempString);

        }
    }

}