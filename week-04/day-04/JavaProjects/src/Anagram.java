import java.util.Arrays;

public class Anagram {

  public boolean anagramChecker(String base, String anagram) {
    boolean isItAnagram = true;

    char[] baseList = new char[base.length()];
    char[] anagramList = new char[anagram.length()];

    int spacecounterBase = 0;
    int spacecounterAnagram = 0;


    for (int i = 0; i < base.length(); i++) {
      if (base.charAt(i) == ' ') {
        spacecounterBase++;
      } else {
        baseList[i-spacecounterBase] = Character.toLowerCase(base.charAt(i));
      }
    }

    for (int j = 0; j < anagram.length(); j++) {
      if (anagram.charAt(j) == ' ') {
        spacecounterAnagram++;
      } else {
        anagramList[j-spacecounterAnagram] = Character.toLowerCase(anagram.charAt(j));
      }
    }

    char[] baseList2 = Arrays.copyOf(baseList, baseList.length-spacecounterBase);
    char[] anagramList2 = Arrays.copyOf(anagramList, anagramList.length-spacecounterAnagram);

    Arrays.sort(baseList2);
    Arrays.sort(anagramList2);

    if (baseList2.length != anagramList2.length) {
      isItAnagram = false;
    } else {
      for (int i = 0; i < baseList2.length; i++) {
        if (baseList2[i] != anagramList2[i]) {
          isItAnagram = false;
        }
      }
    }
  return isItAnagram;
  }
}