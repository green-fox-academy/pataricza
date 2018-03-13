public class Aircrafts {

  private int ammoCapacity;
  private int ammoLevel;
  private int baseDamage;
  private String type;

  public Aircrafts(String type, int baseDamage, int ammoCapacity) {
    this.type = type;
    this.baseDamage = baseDamage;
    this.ammoCapacity = ammoCapacity;
    ammoLevel = 0;
  }

  public int fight() {
    int damageGiven = ammoLevel * baseDamage;
    ammoLevel = 0;
    return damageGiven;
  }

  public int refill(int ammo) {
    if (ammo >= ammoCapacity-ammoLevel) {
      ammo -= (ammoCapacity-ammoLevel);
      ammoLevel = ammoCapacity;
    } else {
      ammoLevel += ammo;
      ammo = 0;
    }
  return ammo;
  }

  public String getType() {
    return "This aircraft is an " + type;
  }

  public String getStatus() {
    return "Type: " + type + " Ammo: " + ammoLevel + " Base Damage: " + baseDamage + " All Damage: " + baseDamage*ammoLevel;
  }

  public boolean isPriority() {
    return type == "F35";
  }

  public int getAmmoLevel() {
    return ammoLevel;
  }

  public int getBaseDamage() {
    return baseDamage;
  }
}
