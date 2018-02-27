import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines2 {
  public static void main(String[] args) {
    String fileStringName = "my-file.txt";
    System.out.println(lineCounter(fileStringName));
  }

  private static int lineCounter(String countThis) {
    int numberOfLines = 0;
    Path pathOfFile = Paths.get(countThis);
    try {
      for (String line : Files.readAllLines(pathOfFile)) {
        numberOfLines++;
      }
    } catch (IOException e) {
      return numberOfLines;
    }
    return numberOfLines;
  }
}

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
