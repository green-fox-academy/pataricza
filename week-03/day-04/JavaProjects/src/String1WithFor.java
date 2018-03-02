public class String1WithFor {
  public static void main(String[] args) {
    System.out.println(changeXToY("XxXxXxXfdfdfdx", ""));
  }

  private static String changeXToY(String changeThis, String tempString) {
    for (int i = 0; i < changeThis.length(); i++) {
      if (changeThis.charAt(i) == 'x') {
        tempString += 'y';
      } else {
        tempString += changeThis.charAt(i);
      }
    }
    return tempString;
  }
}
