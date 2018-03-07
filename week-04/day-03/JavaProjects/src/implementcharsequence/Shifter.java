package implementcharsequence;

public class Shifter implements CharSequence {

  String theString;
  int modifier;

  public Shifter(String theString, int modifier) {
    this.theString = theString;
    this.modifier = modifier;
  }

  @Override
  public int length() {
    return theString.length();
  }

  @Override
  public char charAt(int index) {
    return theString.charAt(index + modifier);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
