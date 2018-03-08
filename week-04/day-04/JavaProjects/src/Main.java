import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    CountLetters myCounter = new CountLetters();

    System.out.println(myCounter.stringDictionary("vaaaaalllllamivvv"));

    HashMap myMap = myCounter.stringDictionary("vaaaaalllllamivvv");

    for (Object entry : myMap.keySet()) {
      if (myMap.get(entry).equals(6)) {
        System.out.println(entry);
      }
    }

    System.out.println(myMap.keySet());

    System.out.println(myCounter.stringDictionary2("vaaaaalllllamivvv"));
  }
}
