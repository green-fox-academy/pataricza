import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How big square do you want me to draw?");
        int sq = scanner.nextInt();

        for(int x = 0; x<sq; x++){
            if(x==1) {
                for (int y = 0; y < sq; y++) {
                    System.out.print("%");
                }
            }
            else if(x > 1 && x < sq) {
               System.out.print("%");
                for(int v = sq-(sq-2); v<sq; v++){
                    if(v!=x){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("%");
                    }
                }
                System.out.print("%");
            }
        System.out.println("");
        }
        for (int y = 0; y < sq; y++) {
            System.out.print("%");
        }
    }
}


// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was