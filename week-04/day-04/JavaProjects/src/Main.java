import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    CountLetters myCounter = new CountLetters();
    Extension myExtension = new Extension();

    System.out.println(myCounter.stringDictionary("vaaaaalllllamivvv"));

    HashMap myMap = myCounter.stringDictionary("vaaaaalllllamivvv");

    for (Object entry : myMap.keySet()) {
      if (myMap.get(entry).equals(6)) {
        System.out.println(entry);
      }
    }

    System.out.println(myMap.keySet());

    System.out.println(myCounter.stringDictionary2("vaaaaalllllamivvv"));

    List<Integer> valami = new ArrayList<>(Arrays.asList(1,2,3,4));

    System.out.println(myExtension.median(valami));
  }
}
