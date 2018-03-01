public class SumDigit {
  public static void main(String[] args) {
    System.out.println(sumThisDigit(12345));
  }

  private static int sumThisDigit(int i) {
    if (i < 10) {
      return i;
    } else {
      return (i % 10) + sumThisDigit(i / 10);
    }
  }

}


// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).