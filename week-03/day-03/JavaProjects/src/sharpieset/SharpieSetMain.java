package sharpieset;

public class SharpieSetMain {
  public static void main(String[] args) {

  Sharpie sharpie1 = new Sharpie("blue", 100);
  Sharpie sharpie2 = new Sharpie("green", 200);
  Sharpie sharpie3 = new Sharpie("white", 300);
  Sharpie sharpie4 = new Sharpie();
  Sharpie sharpie5 = new Sharpie();
  Sharpie sharpie6 = new Sharpie("red", 400);

  SharpieSet sharpieSet1 = new SharpieSet();

  sharpieSet1.addSharpie(sharpie1);
  sharpieSet1.addSharpie(sharpie2);
  sharpieSet1.addSharpie(sharpie3);
  sharpieSet1.addSharpie(sharpie4);
  sharpieSet1.addSharpie(sharpie5);
  sharpieSet1.addSharpie(sharpie6);

  sharpieSet1.countUsable();
  sharpieSet1.removeTrash();

  // a black színűek az üresek, de azokat removeoltam, és nincsenek is benne, tehát minden ok

    for (Sharpie usable : sharpieSet1.getSharpieSet()){
      System.out.println(usable.getColor());
    }

  }
}
