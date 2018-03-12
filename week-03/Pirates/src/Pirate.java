import java.util.Random;

public class Pirate {

  private String name;
  private boolean sleep;
  private boolean dead;
  private int drunkLevel;
  private boolean captain;

  public Pirate() {
    name = nameGenerator();
    sleep = false;
    dead = false;
    drunkLevel = 0;
    captain = false;
  }

  public static String nameGenerator() {

    String[] Beginning = { "Kr", "Ca", "Ra", "Mrok", "Cru",
        "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
        "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
        "Mar", "Luk" };
    String[] Middle = { "air", "ir", "mi", "sor", "mee", "clo",
        "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
        "marac", "zoir", "slamar", "salmar", "urak" };
    String[] End = { "d", "ed", "ark", "arc", "es", "er", "der",
        "tron", "med", "ure", "zur", "cred", "mur" };

    Random rand = new Random();


      return Beginning[rand.nextInt(Beginning.length)] +
          Middle[rand.nextInt(Middle.length)]+
          End[rand.nextInt(End.length)];

  }

  public void drinkSomeRum() {
    if (dead) {
      System.out.println("Dead pirates don't drink rum.");
    } else {
      drunkLevel += (1 + (Math.random() * 4));
    }
  }

  public void howsItGoingMate() {
    if (dead) {
      System.out.println("Dead pirates don't tell tales.");
    }
    else if (drunkLevel > 4) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      sleep = true;
    }
  }

  public void sleep() {
    if (dead) {
      System.out.println("Sure the pirate is sleeping - forever.");
    } else {
      sleep = true;
    }
  }

  public void die() {
    dead = true;
  }

  public void brawl (Pirate enemy) {
    int whatHappens = (int) (1 + (Math.random() * 3));
    if (enemy.dead) {
      System.out.println("I'm a pirate not a bastard, I won't beat a dead man!");
    } else if (whatHappens == 1) {
      enemy.die();
    } else if (whatHappens == 2) {
      die();
    } else {
      enemy.sleep();
      sleep();
    }
  }

  public String getName() {
    return name;
  }

  public boolean isSleep() {
    return sleep;
  }

  public boolean isDead() {
    return dead;
  }

  public int getDrunkLevel() {
    return drunkLevel;
  }
}
