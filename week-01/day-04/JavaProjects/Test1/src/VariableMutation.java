public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10


        System.out.println(a +=10);




        int b = 100;
        // make it smaller by 7


        System.out.println(b -=7);




        int c = 44;
        // please double c's value


        System.out.println(c *=2);




        int d = 125;
        // please divide by 5 d's value


        System.out.println(d /=5);




        int e = 8;
        // please cube of e's value


        System.out.println(e *=e*e);




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean ifBigger;

        if(f1>f2){
            ifBigger = true;
        }
        else{
            ifBigger = false;
        }

        System.out.println(ifBigger);





        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)


        boolean ifBigger2;

        if(g2*2>g1){
            ifBigger2 = true;
        }
        else{
            ifBigger2 = false;
        }

        System.out.println(ifBigger2);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)


        boolean divisor;

        if(h % 11 != 0){
            divisor = false;
        }
        else{
            divisor = true;
        }

        System.out.println(divisor);


        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        boolean ifHigher;

        if(i1 > (i2 *= i2) && i1 < (i2 *=i2*i2)){
            ifHigher = true;
        }
        else {
            ifHigher = false;
        }

        System.out.println(ifHigher);


        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)

        boolean ifDividable;

        if((j % 3 == 0) || (j % 5 == 0)){
            ifDividable = true;
        }
        else {
            ifDividable = false;
        }

        System.out.println(ifDividable);


        String k = "Apple";
        //fill the k variable with its cotnent 4 times

        for(int x = 0; x < 2; x++){
            k=k+k;
        }

        System.out.println(k);
    }
}