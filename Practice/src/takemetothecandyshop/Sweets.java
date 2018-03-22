package takemetothecandyshop;

public class Sweets {

  private int sugarAmount;
  private double price;

  public Sweets(int sugarAmount, int price) {
    this.sugarAmount = sugarAmount;
    this.price = price;
  }

  public int getSugarAmount() {
    return sugarAmount;
  }

  public double getPrice() {
    return price;
  }

  public void setSugarAmount(int sugarAmount) {
    this.sugarAmount = sugarAmount;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
