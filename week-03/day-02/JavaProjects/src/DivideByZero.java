public class DivideByZero {
  public static void main(String[] args) {
    divider(0);
  }

  public static void divider (int divideByThis) {
    int result = 0;
    try {
      result = 10 / divideByThis;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
      }
  }

}

// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
