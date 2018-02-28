package sharpieset;

public class SharpieSetMain {
  public static void main(String[] args) {

  Sharpie sharpie1 = new Sharpie("blue", 100);
  Sharpie sharpie2 = new Sharpie("green", 200);
  Sharpie sharpie3 = new Sharpie("black", 300);

  SharpieSet sharpieSet1 = new SharpieSet();

  sharpieSet1.addSharpie(sharpie1);
  sharpieSet1.addSharpie(sharpie2);
  sharpieSet1.addSharpie(sharpie3);

  sharpieSet1.countUsable();
  }
}
