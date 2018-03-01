public class NumberAdder {
  public static void main(String[] args) {
    System.out.println(numberAdder(6));
  }

  private static int numberAdder(int i) {
    if (i == 1) {
      return 1;
    } else {
      return i + numberAdder(i-1);
    }
  }
}
