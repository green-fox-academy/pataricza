package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    setName("Electric Guitar");
    setNumberOfStrings(6);
  }

  public ElectricGuitar(int strings) {
    setName("Electric Guitar");
    setNumberOfStrings(strings);
  }

  @Override
  public void sound() {
    System.out.println("Twang");
  }

  @Override
  public void play() {
    System.out.print(getName() + ", a " + getNumberOfStrings() +"-stringed instrument that goes ");
    sound();
  }
}
