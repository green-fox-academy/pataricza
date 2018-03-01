public class String1 {
  public static void main(String[] args) {
    int charCounter = 0;
    String tempString = "";
    System.out.println(changeXToY("XxXxXxXfdfdfdx", charCounter, tempString));
    System.out.println(charCounter);
  }

  private static String changeXToY(String changeThis, int charCounter, String tempString) {
    if (charCounter == changeThis.length()) {
      return tempString;
    } else if (changeThis.charAt(charCounter) == 'x') {
        tempString += 'y';
      } else {
          tempString += changeThis.charAt(charCounter);
        }
  charCounter++;
  return changeXToY(changeThis, charCounter, tempString);
  }
}


// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.