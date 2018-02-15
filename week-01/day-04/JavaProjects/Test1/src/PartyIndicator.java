import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many boys are coming tonight? Please write a number: ");
        int numberOfBoys = scanner.nextInt();

        System.out.println("And how many girls are coming tonight? Please feed me another number: ");
        int numberOfGirls = scanner.nextInt();

        if(numberOfGirls == 0){
            System.out.println("Sausage party");
            }
        else if((numberOfBoys + numberOfGirls > 20) && (numberOfBoys == numberOfGirls)) {
            System.out.println("The party is excellent!");
        }
        else if(numberOfBoys + numberOfGirls > 20){
                System.out.println("Quite cool party!");
            }
        else if(numberOfBoys + numberOfGirls <= 20) {
            System.out.println("Average party...!");
            }
    }
}



// Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people