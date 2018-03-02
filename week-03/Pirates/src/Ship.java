import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> ship;

  public Ship() {

  }

  public void fillShip() {
    int numberOfPirates = (int) (1 + (Math.random() * 10));
  }
}
