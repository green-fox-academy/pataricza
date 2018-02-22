import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type in the expression: ");
        char operator = scanner.next().charAt(0);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();


        System.out.println(calculate(operator, number1, number2));

        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
    }

    public static double calculate(char operator, double number1, double number2){
        double result = 0;

        if(operator == '+'){
                result = number1 + number2;
        }
        else if(operator == '-'){
            result = number1 - number2;
        }
        else if(operator == '*'){
            result = number1 * number2;
        }
        else if(operator == '/'){
            result = number1 / number2;
        }
        else if(operator == '%'){
            result = number1 % number2;
        }

        return result;
    }
}