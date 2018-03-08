import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountLettersTest {

  CountLetters myLetters;

  @Before
  public void setUp() throws Exception {
    myLetters = new CountLetters();
  }

  @Test
  public void testOccuarence1(){
    assertEquals((Integer) 3, myLetters.stringDictionary("vaalami").get('a'));
  }

  @Test
  public void testOccuarence2(){
    assertEquals((Integer) 1, myLetters.stringDictionary("vaalami").get('v'));
  }
}