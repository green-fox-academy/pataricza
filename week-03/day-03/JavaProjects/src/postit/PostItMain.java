package postit;

public class PostItMain {
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt("orange", "blue", "Idea1");
    PostIt postIt2 = new PostIt("pink", "black", "Awesome");
    PostIt postIt3 = new PostIt("yellow", "green", "Superb!");


    System.out.println(postIt1.toString());
    System.out.println(postIt2.toString());
    System.out.println(postIt3.toString());
  }
}
