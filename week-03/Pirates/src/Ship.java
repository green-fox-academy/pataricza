import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> ship;
  private int numberOfPirates = (int) (1 + (Math.random() * 10));
  private int indexOfTheCaptain = (int) ((Math.random() * (numberOfPirates)));

  public Ship() {
    ship = new ArrayList<>();
  }

  public void fillShip() {
    for (int i = 0; i < numberOfPirates; i++) {
      if (i == indexOfTheCaptain) {
        ship.add(new Pirate());
        ship.get(i).setCaptain(true);
        ship.get(i).drinkSomeRum();
      } else {
        ship.add(new Pirate());
      }
    }
  }

  public void getInfo() {
    System.out.println("The captain has consumed " + ship.get(indexOfTheCaptain).getDrunkLevel() + " rum and he's " +
        (ship.get(indexOfTheCaptain).isDead() ? "dead." : "alive and " + (ship.get(indexOfTheCaptain).isSleep() ? "sleeping." : "awake.")));
    System.out.println("The ship has " + numberOfAlivePirates() + " pirates alive.");
    System.out.println(indexOfTheCaptain);
  }

  public int numberOfAlivePirates() {
    int alivePiratesNumber = 0;
    for (int i = 0; i < numberOfPirates; i++) {
      if (!ship.get(i).isDead()) {
        alivePiratesNumber++;
      }
    }
  return alivePiratesNumber;
  }

  public int calculateShipScore() {
    return numberOfAlivePirates() - ship.get(indexOfTheCaptain).getDrunkLevel();
  }

  public boolean battle(Ship enemy) {
    if (calculateShipScore() > enemy.calculateShipScore()) {
      makeDrinkRandomNumberOfPirates();
      enemy.killRandomNumberOfPirates();
    } else if (calculateShipScore() < enemy.calculateShipScore()) {
      enemy.makeDrinkRandomNumberOfPirates();
      killRandomNumberOfPirates();
    } else {
      killRandomNumberOfPirates();
      enemy.killRandomNumberOfPirates();
    }
  return calculateShipScore() > enemy.calculateShipScore();
  }

  public void killRandomNumberOfPirates() {
    for (int i = 0; i < numberOfPirates; i++) {
      if (Math.random() < 0.5)
      ship.get(i).die();
    }
  }

  public void makeDrinkRandomNumberOfPirates() {
    for (int i = 0; i < numberOfPirates; i++) {
      if (Math.random() < 0.5)
        ship.get(i).drinkSomeRum();
    }
  }

  public void detailedInfo() {
    for (int i = 0; i < numberOfPirates; i++) {
      ship.get(i).pirateInfo();
      System.out.println();
    }
  }
}
