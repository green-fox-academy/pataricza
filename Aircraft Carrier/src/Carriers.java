import java.util.ArrayList;
import java.util.List;

public class Carriers {

  private List<Aircrafts> carrier;
  private int ammo;
  private int health;
  private int aircraftCounter;

  public Carriers(int ammo, int health) {
    carrier = new ArrayList<>();
    this.ammo = ammo;
    this.health = health;
    aircraftCounter = 0;
  }

  public void addAircraft(Aircrafts addableAircraft) {
    carrier.add(addableAircraft);
    aircraftCounter++;
  }

  public void fill() {
    if (ammo == 0) {
      System.out.println("There is no ammo in the storage");
    } else {
      for (Aircrafts oneAircraft : carrier) {
        if (oneAircraft.isPriority() && ammo != 0) {
          this.ammo = oneAircraft.refill(ammo);
        }
      }
      for (Aircrafts oneAircraft : carrier) {
        if (!oneAircraft.isPriority() && ammo != 0) {
          this.ammo = oneAircraft.refill(ammo);
        }
      }
    }
  }

  public int calculateTotalDamage() {
    int totalDamage = 0;
    for (Aircrafts oneAircraft : carrier) {
      totalDamage += oneAircraft.getAmmoLevel()*oneAircraft.getBaseDamage();
    }
  return totalDamage;
  }

  public void getStatus(){
    if (health == 0) {
      System.out.println("It's dead Jim :(");
    } else {
      System.out.println("HP: " + health + " Aircraft count: " + aircraftCounter + " Ammo Storage: " + ammo
          + " Total damage: " + calculateTotalDamage());
      System.out.println("Aircrafts: ");
      for (Aircrafts oneAircraft : carrier) {
        System.out.println(oneAircraft.getStatus());
      }
    }
  }
}
