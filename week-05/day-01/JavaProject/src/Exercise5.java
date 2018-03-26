public class Exercise5 {
  public static void main(String[] args) {
    String test = "Find te UpperCase caraKters.";

    test.chars()
        .mapToObj(c -> (char) c)
        .filter(Character::isUpperCase)
        .forEach(System.out::println);
  }
}
