public class Fibonacci {
  public static void main(String[] args) {
    System.out.println(fibonacci(82));
  }

  public static int fibonacci(int i) {
    if (i == 1 || i == 2) {
      return i-1;
    } else {
      return fibonacci(i-1) + fibonacci(i-2);
    }
  }
}

// The fibonacci sequence is a famous bit of mathematics, and it happens to
// have a recursive definition. The first two values in the sequence are
// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
// and so on. Define a recursive fibonacci(n) method that returns the nth
// fibonacci number, with n=0 representing the start of the sequence.