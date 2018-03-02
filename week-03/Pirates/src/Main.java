public class Main {
  public static void main(String[] args) {
    Pirate pirate1 = new Pirate();
    Pirate pirate2 = new Pirate();

    pirate1.drinkSomeRum();
    pirate1.drinkSomeRum();

    pirate1.brawl(pirate2);

    System.out.println();

    System.out.println(pirate1.getName());
    System.out.println(pirate1.getDrunkLevel());
  }
}
