import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteSingleLine {
  public static void main(String[] args) {
    ArrayList<String> hiMyNameIs = new ArrayList<>(Arrays.asList("Pataricza György"));

    try {
      Path filePath = Paths.get("my-name.txt");
      Files.write(filePath, hiMyNameIs);
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }

    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"


  }
}