package implementcharsequence;

public class Gnirts implements CharSequence {

  String theString;

  public Gnirts(String theString) {
    this.theString = theString;
  }

  @Override
  public int length() {
    return theString.length()-1;
  }

  @Override
  public char charAt(int index) {
    return theString.charAt(length() - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
