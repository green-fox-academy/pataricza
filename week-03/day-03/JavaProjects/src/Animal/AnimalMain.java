package Animal;

public class AnimalMain {
  public static void main(String[] args) {
    Animal cat = new Animal();

    cat.play();
    cat.eat();
    cat.thirst();

    System.out.println(cat.getHunger());
    System.out.println(cat.getThirst());
  }
}
