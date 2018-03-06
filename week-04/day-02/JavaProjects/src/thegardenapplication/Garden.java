package thegardenapplication;

import java.util.ArrayList;

public class Garden {

  private ArrayList<Plant> listOfPlants;

  public Garden() {
    listOfPlants = new ArrayList<>();
  }

  public void addPlants(Plant plant) {
    listOfPlants.add(plant);
  }

  public void waterGarden(double waterAmount) {

    //checks the index of the plants that need water

    ArrayList<Integer> numberOfThirstyPlant = new ArrayList<>();
    int needOfWaterCounter = 0;
    for (int i = 0; i < listOfPlants.size(); i++) {
      if (listOfPlants.get(i) instanceof Flower && listOfPlants.get(i).getWaterLevel() < 5 || listOfPlants.get(i) instanceof Tree && listOfPlants.get(i).getWaterLevel() < 10) {
        numberOfThirstyPlant.add(i);
        needOfWaterCounter++;
      }
    }

    //divides the water amount equally between the thirsty plants

    double waterPerPlant = waterAmount / needOfWaterCounter;

    //waters the plants

    for (int i = 0; i < listOfPlants.size(); i++) {
      for (int j = 0; j < numberOfThirstyPlant.size(); j++) {
        if (i == numberOfThirstyPlant.get(j) && listOfPlants.get(i) instanceof Flower) {
          listOfPlants.get(i).setWaterLevel(waterPerPlant * 0.75);
        }
        else if (i == numberOfThirstyPlant.get(j) && listOfPlants.get(i) instanceof Tree) {
          listOfPlants.get(i).setWaterLevel(waterPerPlant * 0.40);
        }
      }
    }
    waterInfo();
  }

  public void waterInfo() {
    for (int i = 0; i < listOfPlants.size(); i++) {
      if (listOfPlants.get(i) instanceof Flower && listOfPlants.get(i).getWaterLevel() < 5) {
        System.out.println("The " + listOfPlants.get(i).getColor() + " flower needs watering.");
      } else if (listOfPlants.get(i) instanceof Tree && listOfPlants.get(i).getWaterLevel() < 10) {
        System.out.println("The " + listOfPlants.get(i).getColor() + " tree needs watering.");
      } else if (listOfPlants.get(i) instanceof Flower) {
        System.out.println("The " + listOfPlants.get(i).getColor() + " flower doesn't need water.");
      } else {
        System.out.println("The " + listOfPlants.get(i).getColor() + " tree doesn't need water.");
      }
    }
  }
}
