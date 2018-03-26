import java.util.stream.Collectors;

public class Exercise7 {
  public static void main(String[] args) {
    String test = "abcbea";

    System.out.println(test.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting())));
  }
}
