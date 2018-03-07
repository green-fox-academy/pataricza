package domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DominosMain {
  public static void main(String[] args) {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));

    Collections.sort(dominoes);

  /*  Domino new1 = new Domino(5, 4);
    Domino new2 = new Domino(3, 4);
    System.out.println(new1.compareTo(new2)); */

  /*  for (int i = 0; i < dominoes.size(); i++) {
      int compareResult = dominoes.get(i).compareTo(dominoes.get(i + 1));
      if (compareResult == 0) {
        System.out.println(" is the same ");
      } else if (compareResult < 0) {
        System.out.println("less than");
      } else {
        System.out.println("2nd elem is less than 1st");

      }
    } */

    System.out.println(dominoes);
  }
}
