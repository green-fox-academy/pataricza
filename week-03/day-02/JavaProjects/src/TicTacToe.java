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
    String results = "";
    try {
      for (String line : Files.readAllLines(theResultAsPath)) {
        lines.add(line);
      }
      } catch (Exception e) {
        System.out.println("No ongoing Tic-Tac-To match");
      }

    for (int i = 0; i < 3; i++) {
        if (lines.get(i).charAt(0) == 'O' && lines.get(i).charAt(1) == 'O' && lines.get(i).charAt(2) == 'O') {
          results = "O has won.";
          i = 3;
        }
        else if (lines.get(0).charAt(i) == 'O' && lines.get(1).charAt(i) == 'O' && lines.get(2).charAt(i) == 'O') {
           results = "O has won.";
           i = 3;
        }
        else if (lines.get(i).charAt(0) == 'X' && lines.get(i).charAt(1) == 'X' && lines.get(i).charAt(2) == 'X') {
        results = "X has won.";
          i = 3;
        }
        else if (lines.get(0).charAt(i) == 'X' && lines.get(1).charAt(i) == 'X' && lines.get(2).charAt(i) == 'X') {
          results = "X has won.";
          i = 3;
        }
        else if (lines.get(0).charAt(0) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(2) == 'X') {
          results = "X has won.";
          i = 3;
        }
        else if (lines.get(0).charAt(2) == 'X' && lines.get(1).charAt(1) == 'X' && lines.get(2).charAt(0) == 'X') {
          results = "X has won.";
          i = 3;
        }
        else if (lines.get(0).charAt(0) == 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(2) == 'O') {
          results = "O has won.";
          i = 3;
        }
        else if (lines.get(0).charAt(2) == 'O' && lines.get(1).charAt(1) == 'O' && lines.get(2).charAt(0) == 'O') {
          results = "O has won.";
          i = 3;
        } else {
          results = "Draw.";
        }
    }

    return results;
    }
}