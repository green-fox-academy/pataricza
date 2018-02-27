import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // open and read it. The file data represents a tic-tac-toe
    // game result. Return 'X'/'O'/'draw' based on which player
    // has winning situation.

    System.out.println(ticTacResult("win-o.txt"));
    // should print O

    System.out.println(ticTacResult("win-x.txt"));
    // should print X

    System.out.println(ticTacResult("draw.txt"));
    // should print draw
  }

  private static String ticTacResult(String result) {
    Path theResultAsPath = Paths.get(result);
    ArrayList<String> lines = new ArrayList<>();
    String result = "";
    try {
      for (String line : Files.readAllLines(theResultAsPath)) {
        lines.add(line);
      }
      } catch (Exception e) {
        System.out.println("No ongoing Tic-Tac-To match");
      }

    for (int i = 0; i < 3; i++) {
        if (lines.get(i).charAt(0) == 'O' && lines.get(i).charAt(1) == 'O' && lines.get(i).charAt(2) == 'O') {
          result = "O has won.";
        }
        else if (lines.get(i).charAt(0) == 'O' && lines.get(i).charAt(1) == 'O' && lines.get(i).charAt(2) == 'O') {
           result = "O has won.";
        }
    }

    return result;
    }
}