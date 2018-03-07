package main.java.music;

public class BassGuitar extends StringedInstrument  {

  public BassGuitar() {
    setName("Electric Guitar");
    setNumberOfStrings(6);
  }

  public BassGuitar(int strings) {
    setName("Electric Guitar");
    setNumberOfStrings(strings);
  }

  @Override
  public String sound() {
    return "Duum-duum-duum";
  }

  @Override
  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() +"-stringed instrument that goes " + this.sound());
  }
}
