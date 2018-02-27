import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    System.out.println(copyfile("my-name.txt", "copyOfMyName.txt"));
  }

  private static boolean copyfile(String file, String copyOfFile) {
    Path filePath = Paths.get(file);
    Path copyPath = Paths.get(copyOfFile);
    boolean success = true;
    try {
      Files.copy(filePath, copyPath);
      return success;
    } catch (Exception e) {
      success = false;
      return success;
    }
  }


}


// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful