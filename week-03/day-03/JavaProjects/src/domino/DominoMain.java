package domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DominoMain {
  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();

    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...

    System.out.println(organizer(dominoes).toString());
  }

  public static List<Domino> organizer (List<Domino> unorganized) {
    List<Domino> organized = new ArrayList<>();
    organized.add(unorganized.get(0));

    for (int i = 0; i < unorganized.size()-1; i++) {
      for (int j = 0; j < unorganized.size(); j++) {
        if (organized.get(i).getValues()[1] == unorganized.get(j).getValues()[0]) {
          organized.add(unorganized.get(j));
        }
      }
    }
  return organized;
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
