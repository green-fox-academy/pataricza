package thegardenapplication;

import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> garden;

  public Garden() {
    garden = new ArrayList<>();
  }

  public void addPlants(Plant plant) {
    garden.add(plant);
  }

  public void waterGarden(int waterAmount) {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Flower && waterAmount > 0) {

      }
    }
  }

  public void waterInfo(ArrayList<Plant> garden) {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Flower && garden.get(i).getWaterLevel() < 5) {
        System.out.println("The " + garden.get(i).getColor() + " flower needs watering.");
      } else if (garden.get(i) instanceof Tree && garden.get(i).getWaterLevel() < 10) {
        System.out.println("The " + garden.get(i).getColor() + " tree needs watering.");
      } else {
        System.out.println("This plant is okey.");
      }
    }
  }

  public ArrayList<Plant> getGarden() {
    return garden;
  }
}
