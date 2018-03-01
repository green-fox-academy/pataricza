public class Bunny2 {
  public static void main(String[] args) {
    System.out.println(earCounter2(6));
  }

  private static int earCounter2(int i) {
    if (i == 1) {
      return 2;
    } else {
      return ((i % 2 == 0) ? 3 : 2) + earCounter2(i-1);
    }
  }
}


// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).