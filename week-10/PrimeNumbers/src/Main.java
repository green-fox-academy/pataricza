public class Main {
  public static void main(String[] args) {
    int[] primes = PrimeGenerator.generate(10);

    for (int i = 0; i < primes.length; i++) {
      System.out.println(primes[i]);
    }
  }
}
