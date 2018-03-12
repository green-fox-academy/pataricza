public class String2 {
  public static void main(String[] args) {
    int charCounter = 0;
    String tempString = "";
    System.out.println(removeX("XxXxXxXfdfdfdx", charCounter, tempString));
  }

  private static String removeX(String changeThis, int charCounter, String tempString) {
    if (charCounter == changeThis.length()) {
      return tempString;
    } else if (changeThis.charAt(charCounter) == 'x') {
      tempString += "";
    } else {
      tempString += changeThis.charAt(charCounter);
    }
    charCounter++;
    return removeX(changeThis, charCounter, tempString);
  }
}

// Given a string, compute recursively a new string where all the 'x' chars have been removed.
