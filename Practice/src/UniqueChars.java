import java.util.ArrayList;
import java.util.HashMap;

public class UniqueChars {
  public static void main(String[] args) {
    // Create a function called `uniqueCharacters` that takes a string as parameter
    // and returns a list with the unique letters of the given string
    // Create basic unit tests for it with at least 3 different test cases
    System.out.println(uniqueCharacters("anagram"));
    // Should print out:
    // ["n", "g", "r", "m"]
  }

  public static ArrayList<Character> uniqueCharacters(String uniqueThis) {
    ArrayList<Character> uniqueCharacters = new ArrayList<>();
    HashMap<Character, Integer> temp = new HashMap<>();

    for (int i = 0; i < uniqueThis.length(); i++) {
      temp.merge(uniqueThis.charAt(i), 1, Integer::sum);
    }

    for (int i = 0; i < uniqueThis.length(); i++) {
      for (Character key : temp.keySet()) {
        if (uniqueThis.charAt(i) == key && temp.get(key) == 1) {
          uniqueCharacters.add(uniqueThis.charAt(i));
        }
      }
    }

  return uniqueCharacters;
  }
}
