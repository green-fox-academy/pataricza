import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise9 {
  public static void main(String[] args) {
    char[] charArray = {'c', 'i', 'c', 'a'};

    System.out.println(Stream.of(charArray)
        .map(String::valueOf)
        .collect(Collectors.joining()));
  }
}
