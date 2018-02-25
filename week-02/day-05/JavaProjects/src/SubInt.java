import java.util.ArrayList;

public class SubInt {
  public static void main(String[] args) {
    //  Create a function that takes a number and a list of numbers as a parameter
    //  Returns the indeces of the numbers in the list where the first number is part of
    //  Returns an empty list if the number is not part any of the numbers in the list

    //  Example:
    System.out.println(subInt(1, new int[]{1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[]{1, 11, 34, 52, 61}));
    //  should print: '[]'
  }

  public static ArrayList<Integer> subInt (int theNumber, int[] theList) {

    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < Integer.toString(theNumber).length(); i++) {
      for (int j = 0; j < theList.length; j++) {
        for (int k = 0; k < Integer.toString(theList[j]).length(); k++) {
          if (Integer.toString(theNumber).charAt(i) == Integer.toString(theList[j]).charAt(k)) {
            result.add(j);
            k += Integer.toString(theList[j]).length();
          }
        }
      }
    }
  return result;
  }

}