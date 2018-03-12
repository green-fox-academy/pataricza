import java.util.HashMap;

public class CountLetters {

  public HashMap<Character, Integer> stringDictionary(String dictionaryThis) {
    HashMap<Character, Integer> dictionary = new HashMap<>();

    for (int i = 0; i < dictionaryThis.length(); i++) {
      if(dictionary.containsKey(dictionaryThis.charAt(i))) {
        dictionary.put(dictionaryThis.charAt(i),
            dictionary.get(dictionaryThis.charAt(i))+1);
      } else {
        dictionary.put(dictionaryThis.charAt(i), 1);
      }
    }
   return dictionary;
  }

  public HashMap<Character, Integer> stringDictionary2(String dictionaryThis) {
    HashMap<Character, Integer> dictionary = new HashMap<>();

    for (int i = 0; i < dictionaryThis.length(); i++) {
      dictionary.merge(dictionaryThis.charAt(i), 1, Integer::sum);
    }
    return dictionary;
  }

}
