package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  public abstract void sound();

  public int getNumberOfStrings() {
    return numberOfStrings;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }
}
