public class String3 {
  public static void main(String[] args) {
    System.out.println(addLittleStars("XxXxXxXfdfdfdx", 0, ""));
  }

  private static String addLittleStars(String changeThis, int charCounter, String tempString) {
    if (charCounter == changeThis.length()) {
      return tempString;
    } else if (charCounter == changeThis.length()-1) {
      tempString = tempString + changeThis.charAt(charCounter);
    } else {
        tempString = tempString + changeThis.charAt(charCounter) + '*';
    }
    charCounter++;
    return addLittleStars(changeThis, charCounter, tempString);
  }
}



// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".