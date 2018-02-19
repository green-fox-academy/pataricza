public class Printer {

    public static void main(String[] args){

        printer("valami", "barmi", "akarmi");

    }

   public static void printer(String... printThese){

            for (String tempString : printThese){

                System.out.println(tempString);

            }
    }

}


//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...