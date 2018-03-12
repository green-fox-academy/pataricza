public class Refactorio {
  public static void main(String[] args) {
    System.out.println(refactorio(6));
  }

  private static int refactorio(int i) {
    if (i == 1 || i == 0) {
      return 1;
    } else {
      return i * refactorio(i-1);
    }
  }
}
