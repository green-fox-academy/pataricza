import java.util.ArrayList;
import java.util.List;

public class Carriers {

  private List<Aircrafts> carrier;
  private int ammo;
  private int health;
  private int aircraftAmmoNeed;

  public Carriers(int ammo, int health) {
    carrier = new ArrayList<>();
    this.ammo = ammo;
    this.health = health;
    this.aircraftAmmoNeed = 0;
  }

  public void addAircraft(Aircrafts addableAircraft) {
    carrier.add(addableAircraft);
    aircraftAmmoNeed += addableAircraft.getAmmoCapacity();
  }

  public void fill() {

  }

  public void notEnoughAmmoFill() {
    for (Aircrafts oneAircraft : carrier) {
      if (oneAircraft.isPriority()) {
        this.ammo = oneAircraft.refill(ammo);
      }
    }
    for (Aircrafts oneAircraft : carrier) {
      if (!oneAircraft.isPriority()) {
        this.ammo = oneAircraft.refill(ammo);
      }
    }
  }
}
