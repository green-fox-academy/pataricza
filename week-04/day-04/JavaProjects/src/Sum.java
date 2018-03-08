import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

  private List<Integer> numbers;

  public Sum() {
    numbers = new ArrayList<>();
  }

  public int sumTheList() {
    int result = 0;
    for (int temp : numbers) {
      result += temp;
    }
  return result;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }
}
