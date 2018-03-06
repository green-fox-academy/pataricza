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

  public void waterGarden(double waterAmount, ArrayList<Plant> garden) {

    //checks the index of the plants that need water

    ArrayList<Integer> numberOfThirstyPlant = new ArrayList<>();
    int needOfWaterCounter = 0;
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Flower && garden.get(i).getWaterLevel() < 5 || garden.get(i) instanceof Tree && garden.get(i).getWaterLevel() < 10) {
        numberOfThirstyPlant.add(i);
        needOfWaterCounter++;
      }
    }

    //divides the water amount equally between the thirsty plants

    double waterPerPlant = waterAmount / needOfWaterCounter;

    //waters the plants

    for (int i = 0; i < garden.size(); i++) {
      for (int j = 0; j < numberOfThirstyPlant.size(); j++) {
        if (i == numberOfThirstyPlant.get(j) && garden.get(i) instanceof Flower) {
          garden.get(i).setWaterLevel(waterPerPlant * 0.75);
        }
        else if (i == numberOfThirstyPlant.get(j) && garden.get(i) instanceof Tree) {
          garden.get(i).setWaterLevel(waterPerPlant * 0.40);
        }
      }
    }
  }

  public void waterInfo(ArrayList<Plant> garden) {
    for (int i = 0; i < garden.size(); i++) {
      if (garden.get(i) instanceof Flower && garden.get(i).getWaterLevel() < 5) {
        System.out.println("The " + garden.get(i).getColor() + " flower needs watering.");
      } else if (garden.get(i) instanceof Tree && garden.get(i).getWaterLevel() < 10) {
        System.out.println("The " + garden.get(i).getColor() + " tree needs watering.");
      } else if (garden.get(i) instanceof Flower) {
        System.out.println("The " + garden.get(i).getColor() + " flower doesn't need water.");
      } else {
        System.out.println("The " + garden.get(i).getColor() + " tree doesn't need water.");
      }
    }
  }

  public ArrayList<Plant> getGarden() {
    return garden;
  }
}
