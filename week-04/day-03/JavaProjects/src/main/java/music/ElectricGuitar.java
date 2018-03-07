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
  public String sound() {
    return "Twang";
  }

  @Override
  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() +"-stringed instrument that goes " + this.sound());
  }
}
