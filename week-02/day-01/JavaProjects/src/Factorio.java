import java.util.Scanner;

public class Factorio {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add the number you want the factorials of: ");
        int number = scanner.nextInt();

        System.out.println(factorio(number));

    }

    public static int factorio(int multipleThese){

        int result = 1;

        for (int i = 1; i <= multipleThese; i++) {

            result *= i;

        }

        return result;

    }

}


//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial
