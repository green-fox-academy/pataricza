import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

   double result = numbers.stream()
        .filter(n -> n % 2 == 1)
        .mapToInt(i -> i)
        .average()
       .getAsDouble();

    System.out.println(result);
  }
}
