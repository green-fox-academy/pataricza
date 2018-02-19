import java.util.Scanner;

public class Summing {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add the parameter until you want to add the numbers: ");
        int parameter = scanner.nextInt();

        System.out.println(sum(parameter));

    }

    public static int sum(int addThese){

        int result = 0;

        for (int i = 0; i <= addThese; i++) {

            result += i;

        }

        return result;

    }

}


//  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
