package Animal;

public class Animal {

  private int hunger;
  private int thirst;

  public Animal () {
    hunger = 50;
  }

  public void eat () {
    hunger--;
  }

  public void thirst () {
    thirst--;
  }

  public void play () {
    thirst++;
    hunger++;
  }

  public int getHunger() {
    return hunger;
  }

  public int getThirst() {
    return thirst;
  }
}
