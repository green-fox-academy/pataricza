import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    PrimeGenerator generator = new PrimeGenerator();

    List<Integer> result = generator.primeGenerator2(100);

    for (int prime : result) {
      System.out.println(prime);
    }
  }
}
