import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Logs {
  public static void main(String[] args) {
    for (String IP : ipAdresses("logs.txt")) {
      System.out.println(IP);
    }

    System.out.println("\n" + getPostRatio("logs.txt"));

  }

  private static String getPostRatio (String logs) {
    Path theLogs = Paths.get(logs);
    ArrayList<String> getsAndPosts = new ArrayList<>();
    int numberOfGets = 0;
    int numberOfPosts = 0;
    String solution = "";

    try {
      for (String line : Files.readAllLines(theLogs)) {
        getsAndPosts.add(line.substring(41));
      }
    } catch (Exception e) {
      System.out.println("Something went wrong, sorry.");
    }
    for (int i = 0; i < getsAndPosts.size(); i++) {
      if (getsAndPosts.get(i).equals("GET /")) {
        numberOfGets++;
      } else {
        numberOfPosts++;
      }
    }
    solution = "The number of gets is: " + String.valueOf(numberOfGets) + " The number of posts: " + String.valueOf(numberOfPosts);
    return solution;
  }

  private static Set<String> ipAdresses (String logs) {
    Path theLogs = Paths.get(logs);
    ArrayList<String> lines = new ArrayList<>();
    ArrayList<String> ipAdresses = new ArrayList<>();
    try {
      for (String line : Files.readAllLines(theLogs)) {
        lines.add(line);
      }
    } catch (Exception e) {
      System.out.println("Something went wrong, sorry.");
    }
    for (int i = 0; i < lines.size(); i++) {
      ipAdresses.add(lines.get(i).substring(27, 38));
    }

    Set<String> set = new HashSet<>(ipAdresses);

    return set;
  }
}


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.