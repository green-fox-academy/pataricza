package Sharpie;

public class SharpieMain {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie("blue", 500);

    sharpie1.use();

    System.out.println(sharpie1.getColor() + " " + sharpie1.getWidth() + " " + sharpie1.getInkAmount());
  }
}
