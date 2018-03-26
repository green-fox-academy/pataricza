package exercise10;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Fox> foxList = new ArrayList<>();

    foxList.add(new Fox("fox1", "green", "pallida"));
    foxList.add(new Fox("fox2", "yellow", "anyother"));
    foxList.add(new Fox("fox3", "red", "anyother"));
    foxList.add(new Fox("fox4", "green", "pallida"));
    foxList.add(new Fox("fox5", "green", "anyother"));

//    foxList.stream()
//        .filter(p -> p.getColor().equals("green"))
//        .forEach(p -> System.out.println(p.getName()));

    foxList.stream()
        .filter(p -> p.getColor().equals("green") &&  p.getType().equals("pallida"))
        .forEach(p -> System.out.println(p.getName()));
  }
}

//  Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
//    it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color!
//    Write a Stream Expression to find the foxes with green color and pallida type!
