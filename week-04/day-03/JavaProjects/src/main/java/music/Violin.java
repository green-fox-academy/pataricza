package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    setName("Electric Guitar");
    setNumberOfStrings(6);
  }

  public Violin(int strings) {
    setName("Electric Guitar");
    setNumberOfStrings(strings);
  }

  @Override
  public String sound() {
    return "Screech";
  }

  @Override
  public void play() {
    System.out.println(getName() + ", a " + getNumberOfStrings() +"-stringed instrument that goes " + this.sound());
  }
}
