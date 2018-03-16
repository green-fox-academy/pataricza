import java.util.Arrays;
import java.util.List;

public class Extension {
  int add(int a, int b) {
    return a+b;
  }

  int maxOfThree(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > c)
      return b;
    else
      return c;
  }

  double median(List<Integer> pool) {
    if (pool.size() % 2 == 1) {
      return pool.get((pool.size() - 1) / 2);
    } else {
      return ((double) pool.get(pool.size() / 2) + (double) pool.get((pool.size() / 2) - 1)) / 2;
    }
  }

  boolean isVowel(char c) {
    return Arrays.asList('a', 'á', 'e', 'é', 'i', 'í', 'o', 'ó', 'ö', 'ő', 'u', 'ú', 'ü', 'ű').contains(c);
  }

  String translate(String hungarian) {
    String teve = hungarian;
    int length = teve.length();
    for (int i = 0; i < length; i++) {
      char c = teve.charAt(i);
      if (isVowel(c)) {
        teve = String.join(c + "v" + c, teve.split(""+c, 2));
        i+=2;
        length+=2;
      }
    }
    return teve;
  }
}