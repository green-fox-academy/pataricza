package takemetothecandyshop;
import java.util.ArrayList;

public class CandyShop {

  public static final Candies CANDY = new Candies();
  public static final Lollipops LOLLIPOP = new Lollipops();
  private int sugar;
  private int money;
  private ArrayList<Sweets> storage;
  private int numberOfCandies;
  private int numberOfLollipops;

  public CandyShop(int sugar) {
    this.sugar = sugar;
    storage = new ArrayList<>();
    numberOfCandies = 0;
    numberOfLollipops = 0;
  }


  public void createSweets(Sweets sweets) {
    storage.add(sweets);
    sugar -= sweets.getSugarAmount();
    if (sweets instanceof Candies) {
      numberOfCandies++;
    } else if (sweets instanceof  Lollipops) {
      numberOfLollipops++;
    }
  }

  public void raise(double percentage) {
    for (Sweets oneSweet : storage) {
      oneSweet.setPrice(oneSweet.getPrice() + oneSweet.getPrice()*(percentage/100));
    }
  }

  public void sell(Sweets sweet, int number) {
    money += number*sweet.getPrice();
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < storage.size(); j++) {
        if (storage.get(j).equals(sweet)) {
          storage.remove(j);
          if (sweet instanceof Candies) {
            numberOfCandies--;
          } else if (sweet instanceof  Lollipops) {
            numberOfLollipops--;
          }
        }
      }
    }
  }

  public void buySugar(int amount) {
    sugar += amount;
    money -= amount*0.1;
  }

  @Override
  public String toString() {
    return "Inventory: " + numberOfCandies + " candies, " + numberOfLollipops + " lollipops, " + " money: " + money +
        " sugar " + sugar;
  }
}
