package music;

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
  public void sound() {
    System.out.println("Screech");
  }

  @Override
  public void play() {
    System.out.print(getName() + ", a " + getNumberOfStrings() +"-stringed instrument that goes ");
    sound();
  }
}
