import java.util.ArrayList;
import java.util.List;

public class IntArrayPermutator {

  public List<int[]> permutator(int[] ints) {
    List<int[]> result = new ArrayList<>();
    ipermutator(0, ints, result);
    return result;
  }

  private void ipermutator(int start, int[] ints, List<int[]> result) {
    if(start >= ints.length) {
      result.add(ints.clone());
    } else {
      for (int i = start; i < ints.length; i++) {
        swapElement(ints, start, i);
        ipermutator(start+1, ints, result);
        swapElement(ints, start, i);
      }
    }
  }

  private void swapElement(int[] swapable, int swapThis, int withThis) {
    int temp = swapable[swapThis];
    swapable[swapThis] = swapable[withThis];
    swapable[withThis] = temp;
  }
}
