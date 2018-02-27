import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class CountLines {
  public static void main(String[] args) {
    String fileStringName = "my-file.txt";
    System.out.println(lineCounter(fileStringName));
  }

  private static int lineCounter(String countThis) {
    int numberOfLines = 0;
    try {
      FileReader fr = new FileReader(countThis);
      LineNumberReader lnr = new LineNumberReader(fr);

      while (lnr.readLine() != null) {
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
