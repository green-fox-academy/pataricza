public class DrawChessTable {
    public static void main(String[] arg){

        for(int x=0; x<8; x++){
            for(int y=x; y<x+8; y++) {
                if (y % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//