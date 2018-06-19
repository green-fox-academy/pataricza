import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

  HashFunction hashFunction = new HashFunction(30);

  String[] putThis = new String[]{"5","17","8","24","9"};

  String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
        "235", "802", "900", "723", "699", "1", "16", "999", "890",
        "725", "998", "978", "988", "990", "989", "984", "320", "321",
        "400", "415", "450", "50", "660" };


  hashFunction.simpleHashFunction2(elementsToAdd2);

  hashFunction.getTheElement("170");

  hashFunction.displayTheStack();
  }
}
