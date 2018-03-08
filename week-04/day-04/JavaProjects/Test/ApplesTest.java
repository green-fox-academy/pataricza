import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {

  Apples myApple;

  @Before
  public void setUp() throws Exception {
    myApple = new Apples();
  }

  @Test
  public void testGetApple() {
    assertEquals("apple", myApple.getApple());
  }
}