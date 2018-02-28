package sharpieset;

public class Sharpie {

  private String color;
  private float width;
  private float inkAmount;

  public Sharpie () {
    color = "black";
    inkAmount = 0;
  }

  public Sharpie (String color, float width) {
    this.color = color;
    this.width = width;
    inkAmount = 100;
  }

  public void use () {
    inkAmount--;
  }

  public String getColor() {
    return color;
  }

  public float getWidth() {
    return width;
  }

  public float getInkAmount() {
    return inkAmount;
  }
}
