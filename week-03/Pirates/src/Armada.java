import java.util.ArrayList;
import java.util.List;

public class Armada {

  private List<Ship> armada;

  public Armada() {
    armada = new ArrayList<>();
  }

  public void war(Armada enemy) {
    int myArmadaIndex = 0;
    int enemyArmadaIndex = 0;

    while(myArmadaIndex != armada.size() && enemyArmadaIndex != enemy.armada.size()) {
      int whichArmadaWon = armada.get(myArmadaIndex).battle(enemy.armada.get(enemyArmadaIndex));
      if (whichArmadaWon == 1) {
        enemyArmadaIndex++;
        System.out.println("Our ship has won, ready for the next battle.");
      } else if (whichArmadaWon == 2) {
        myArmadaIndex++;
        System.out.println("Enenmy ship has won, ready for the next battle.");
      } else {
        enemyArmadaIndex++;
        myArmadaIndex++;
        System.out.println("Both ship has drowned, next ships are coming to fight.");
      }
    }

    if (myArmadaIndex == armada.size() && enemyArmadaIndex == enemy.armada.size()) {
      System.out.println("Everyone died.");
    } else if (myArmadaIndex == armada.size()) {
      System.out.println("We have lost the war.");
    } else {
      System.out.println("We have won the war.");
    }
  }

  public void addShipsToArmada(Ship addableShip) {
    armada.add(addableShip);
  }
}
