public class Main {
  public static void main(String[] args) {
    Box<Integer> integerBox = new Box<Integer>();
    Box<String> stringBox = new Box<String>();

    integerBox.add(10);
    stringBox.add("Hello World");

    System.out.printf("Integer Value: %d\n\n", integerBox.get());
    System.out.printf("String Value: %s\n", stringBox.get());
  }
}
