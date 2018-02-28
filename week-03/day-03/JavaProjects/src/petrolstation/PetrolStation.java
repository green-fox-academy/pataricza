package petrolstation;

public class PetrolStation {
  public static void main(String[] args) {
    Station petrol = new Station();
    Car auto = new Car();

    petrol.refill(auto);

    System.out.println(petrol.getGasAmount());
  }
}
