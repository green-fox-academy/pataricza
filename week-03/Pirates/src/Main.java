public class Main {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate();
    Pirate pirate2 = new Pirate();

    Ship myShip = new Ship();
    Ship enemy = new Ship();

    myShip.fillShip();
    enemy.fillShip();

    myShip.getInfo();
    System.out.println();
    enemy.getInfo();

    myShip.battle(enemy);
    System.out.println("\nAfter the battle:\n");

    myShip.getInfo();
    myShip.detailedInfo();
    System.out.println();
    enemy.getInfo();
    enemy.detailedInfo();
  }
}
