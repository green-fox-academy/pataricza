import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many lines tall triangle do you want me to draw?");
        int lines = scanner.nextInt();

        for(int x = 0; x<=lines; x++){
            for(int y=0; y<x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was