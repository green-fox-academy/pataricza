public class MySingleton {

  private static MySingleton innerInstance;

  private MySingleton() {
    System.out.println("Instance created");
  }

  public static MySingleton getInnerInstance() {

    if(innerInstance == null) {

      synchronized (MySingleton.class) {

        if (innerInstance == null) {
          innerInstance = new MySingleton();
        }
      }
    }
    return innerInstance;
  }
}
