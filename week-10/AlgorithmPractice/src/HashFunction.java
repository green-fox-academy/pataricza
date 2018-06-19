import java.util.Arrays;

public class HashFunction {

  String[] theArray;
  int arraySize;
  int itemsInArray = 0;

  public HashFunction(int size) {
    arraySize = size;
    theArray = new String[arraySize];
    Arrays.fill(theArray, "-1");
  }

  public void simpleHashFunction(String[] hashThis) {
    for (int i = 0; i < hashThis.length; i++) {
      int indexValue = Integer.parseInt(hashThis[i]);
      theArray[indexValue] = hashThis[i];
    }
  }

  public void simpleHashFunction2(String[] hashThis) {
    for (int i = 0; i < hashThis.length; i++) {
      String newElementValue = hashThis[i];

      int indexValue = Integer.parseInt(newElementValue) % arraySize;

      while(theArray[indexValue] != "-1") {
        indexValue++;
        indexValue %= arraySize;
      }

      theArray[indexValue] = newElementValue;
    }
  }

  public String getTheElement(String getThis) {
    int elementIndex = Integer.parseInt(getThis) % arraySize;

    while(theArray[elementIndex] != "-1") {
      if(theArray[elementIndex] == getThis) {
        System.out.println("Element found at index: " + elementIndex);
        return theArray[elementIndex];
      }
      elementIndex++;
      elementIndex %= arraySize;
    }
    System.out.println("Element not found");
    return null;
  }

  public void displayTheStack() {

    int increment = 0;

    for (int m = 0; m < 3; m++) {

      increment += 10;

      for (int n = 0; n < 71; n++)
        System.out.print("-");

      System.out.println();

      for (int n = increment - 10; n < increment; n++) {

        System.out.format("| %3s " + " ", n);

      }

      System.out.println("|");

      for (int n = 0; n < 71; n++)
        System.out.print("-");

      System.out.println();

      for (int n = increment - 10; n < increment; n++) {

        if (theArray[n].equals("-1"))
          System.out.print("|      ");

        else
          System.out
              .print(String.format("| %3s " + " ", theArray[n]));

      }

      System.out.println("|");

      for (int n = 0; n < 71; n++)
        System.out.print("-");

      System.out.println();

    }

  }
}
