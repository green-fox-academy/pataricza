import java.util.Arrays;

public class Unique2 {
    public static void main(String[] args) {

        int[] startingArray = {1, 11, 34, 1, 52, 61, 1, 34, 55, 55, 1, 89, 34, 66};
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        System.out.println(Arrays.toString(unique(startingArray)));
        //  should print: `[1, 11, 34, 52, 61]`
    }

    public static int[] unique(int[] uniqueThis){

        int[] temp = new int[uniqueThis.length];
        int itemcounter = 0;

        for (int i = 0; i < uniqueThis.length; i++) {
            boolean checker = true;
            for (int j = 0; j < temp.length; j++) {
                if(uniqueThis[i] == temp[j]){
                    checker = false;
                }
            }
            if(checker){
            temp[itemcounter] = uniqueThis[i];
            itemcounter++;
            }
        }

        temp = Arrays.copyOf(temp, itemcounter);

        return temp;
    }

}
