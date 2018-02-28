package Counter;

public class Counter {

  private int fieldValue;
  private int reset;

  public Counter () {
    fieldValue = 0;
    reset = 0;
  }

  public Counter (int fieldValue) {
    this.fieldValue = fieldValue;
    reset = fieldValue;
  }

  public void add (int number) {
    fieldValue += number;
  }

  public void add () {
    fieldValue++;
  }

  public int get () {
    return fieldValue;
  }

  public void reset () {
    fieldValue = reset;
  }

}
