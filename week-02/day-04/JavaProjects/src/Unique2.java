import java.util.Arrays;

public class Unique2 {
    public static void main(String[] args) {

        int[] startingArray = {1, 11, 34, 11, 52, 61, 1, 34};
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(Arrays.toString(unique(startingArray)));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static int[] unique(int[] uniqueThis){

        int[] temp = {uniqueThis[0]};

        for (int j = 1; j < uniqueThis.length; j++) {
            boolean isItIn = false;
            for (int i = 0; i < temp.length; i++) {
                if(uniqueThis[j] != temp[i]){
                    isItIn = true;
                }
            }
            if(isItIn){
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length-1] = uniqueThis[j];
            }
        }
        return temp;
    }

}
