import java.util.ArrayList;
import java.util.List;

public class StringPermutator {

  public List<String> permutator(String s) {
    List<String> result = new ArrayList<>();
    spermutator("", s, result);
    return result;
  }

  private void spermutator(String prefix, String suffix, List<String> result) {
    if(suffix.length() == 0) {
      result.add(prefix);
    } else {
      for (int i = 0; i < suffix.length(); i++) {
        spermutator(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1), result);
      }
    }
  }
}
