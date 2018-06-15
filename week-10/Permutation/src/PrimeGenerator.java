import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {

  public  List<Integer> primeGenerator(int numberOfPrimes) {
    List<Integer> primes = new ArrayList<>();
    primes.add(2);

    for(int i = 3; primes.size() < numberOfPrimes; i += 2) {
      boolean isPrime = true;
      for (int n : primes) {
        if(i % n == 0) {
          isPrime = false;
        }
      }
      if(isPrime) {
        primes.add(i);
      }
    }

    return primes;
  }

  public List<Integer> primeGenerator2(int limit) {
    List<Integer> primes = new ArrayList<>();
    primes.add(2);

    for (int i = 3; i < limit; i += 2) {
      boolean isPrime = true;
      for (int n : primes) {
        if(i % n == 0) {
          isPrime = false;
        }
      }
      if(isPrime) {
        primes.add(i);
      }
    }

    return primes;
  }
}
