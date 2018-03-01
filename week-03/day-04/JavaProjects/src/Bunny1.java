public class Bunny1 {
  public static void main(String[] args) {
    System.out.println(earCounter(8));
  }

  private static int earCounter(int i) {
    if (i == 1) {
      return 2;
    } else {
      return 2 + earCounter(i-1);
    }
  }
}


// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).