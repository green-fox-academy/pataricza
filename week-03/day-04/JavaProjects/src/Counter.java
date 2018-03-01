public class Counter {
  public static void main(String[] args) {

    counter(8);

  }

  public static int counter (int n) {
    if (n == 0) {
      System.out.println(n);
      return 0;
    } else {
      System.out.println(n);
      return n - counter(n-1);
    }
  }

}

// Write a recursive function that takes one parameter: n and counts down from n.