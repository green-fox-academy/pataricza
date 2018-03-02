import java.util.Random;

public class Pirate {

  private String name;
  private boolean drunk;
  private boolean sleep;
  private boolean dead;
  private int drunkLevel;

  public Pirate () {

    name = NameGenerator();

  }

  public static String NameGenerator() {

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
}
