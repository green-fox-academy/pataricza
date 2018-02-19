import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};
        int[] temp;
        temp = new int[aj.length];

        for (int i = 0; i < aj.length; i++) {

            temp[aj.length-(i+1)] = aj[i];

        }
        aj = Arrays.copyOf(temp, aj.length);
        System.out.println(Arrays.toString(aj));
    }
}


// - Create an array variable named `aj`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `aj`
// - Print the elements of the reversed `aj`