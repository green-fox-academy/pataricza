import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int[] a = {1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(Arrays.toString(sortTheArray(a)));
    }

    public static int[] sortTheArray(int[] sortThis){

        //Makes an empty array in the length it will be needed later.

        int checker2 = sortThis.length;

        for (int g = 0; g < sortThis.length; g++) {
            for (int h = g+1; h < sortThis.length; h++) {
                if(sortThis[g] == sortThis[h]){
                    checker2--;
                }
            }
        }

        int[] sortedArray;
        sortedArray = new int[checker2];

        //Sorts the input array and fills up with teh result the sortedArray.

        int placeHolder = 0;

        for (int i = sortThis.length-1; i >= 0; i--) {
            int checker1 = 0;
            for (int j = 0; j <= i; j++) {
                if(sortThis[i] == sortThis[j]){
                    checker1++;
                }
             }
            if(checker1 == 1){
                sortedArray[placeHolder] = sortThis[i];
                placeHolder++;
            }
        }

        int[] temp;
        temp = new int[sortedArray.length];

        //Reverts the array we have sorted before.

        for (int i = 0; i < sortedArray.length; i++) {

            temp[sortedArray.length-(i+1)] = sortedArray[i];

        }
        sortedArray = Arrays.copyOf(temp, sortedArray.length);

        return sortedArray;
    }

}


/*

        //  Example
        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
    }
}*/