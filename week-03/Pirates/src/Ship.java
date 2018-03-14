import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> ship;

  public Ship() {
    ship = new ArrayList<>();
  }

  public void fillShip() {
    int numberOfPirates = (int) (1 + (Math.random() * 10));
    for (int i = 0; i < numberOfPirates; i++) {
      ship.add(new Pirate());
    }
  ship.get(0).setCaptain(true);
  ship.get(0).drinkSomeRum();
  }

  public void getInfo() {
    System.out.println("The captain has consumed " + ship.get(1).getDrunkLevel() + " rum and he's " +
        (ship.get(1).isDead() ? "dead." : "alive and " + (ship.get(1).isSleep() ? "sleeping." : "awake.")));
    System.out.println("The ship has " + numberOfAlivePirates() + " pirates alive.");
  }

  public int numberOfAlivePirates() {
    int alivePiratesNumber = 0;
    for (int i = 0; i < ship.size(); i++) {
      if (!ship.get(i).isDead()) {
        alivePiratesNumber++;
      }
    }
  return alivePiratesNumber;
  }

  public int calculateShipScore() {
    return numberOfAlivePirates() - ship.get(1).getDrunkLevel();
  }

  public boolean battle(Ship enemy) {
    boolean willWeWin = calculateShipScore() > enemy.calculateShipScore();
    for (int i = 0; i < Math.random() * (enemy.ship.size()+1); i++) {
      if (willWeWin) {
        enemy.ship.get(i).die();
      } else {
        enemy.ship.get(i).drinkSomeRum();
      }
    }
    for (int i = 0; i < Math.random() * (ship.size()+1); i++) {
      if (willWeWin) {
        ship.get(i).drinkSomeRum();
      } else {
        ship.get(i).die();
      }
    }
    return willWeWin;
  }
}
