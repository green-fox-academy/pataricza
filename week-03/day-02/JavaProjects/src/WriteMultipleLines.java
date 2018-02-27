import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String path = "writeMultipleLines.txt";
    String word = "The word is the bird!";
    int number = 8;

    fileWriter(path, word, number);
  }

  private static void fileWriter(String path, String word, int numberOfLines) {
    Path pathOfFile = Paths.get(path);
    ArrayList<String> theWordsIntoTheFile = new ArrayList<>();
    try {
      for (int i = 0; i < numberOfLines; i++) {
        theWordsIntoTheFile.add(word);
      }
      Files.write(pathOfFile, theWordsIntoTheFile);
    } catch (Exception e) {
      System.out.println("This is not an error.");
    }
  }
}



// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.