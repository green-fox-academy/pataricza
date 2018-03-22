import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class FavouriteAnimals {
  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them

    if (args.length == 0) {
      printUsage();
    } else {
      addFavouriteAnimals(args);
    }
  }

  public static void printUsage() {
    System.out.println("Write your favourite animals into the command line to store them in a file. Write like this: " +
        "java FavouriteAnimals [animal] [animal]");
  }

  public static void addFavouriteAnimals(String[] args) {
    ArrayList<String> uniqueAnimals = new ArrayList<>();
    HashMap<String, Integer> temp = new HashMap<>();

    for (int i = 0; i < args.length; i++) {
      temp.merge(args[i], 1, Integer::sum);
    }

    for (String oneAnimal : temp.keySet()) {
      uniqueAnimals.add(oneAnimal);
    }

    writeIntoFile(uniqueAnimals);
  }

  public static void writeIntoFile(ArrayList<String> animals) {
    String filePath = "favourites.txt";
    Path myFile = Paths.get(filePath);

    try {
      Files.write(myFile, animals, Charset.forName("UTF-8"));
    } catch (IOException e) {
      System.out.println("Sorry, somehing went wrong :(");
    }
  }
}
