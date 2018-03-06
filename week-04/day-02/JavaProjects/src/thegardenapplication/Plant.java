package thegardenapplication;

public class Plant {

  private String color;
  private double waterLevel;

  public Plant(String color) {
    this.color = color;
    waterLevel = 0;
  }

  public double getWaterLevel() {
    return waterLevel;
  }

  public String getColor() {
    return color;
  }

  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
}
