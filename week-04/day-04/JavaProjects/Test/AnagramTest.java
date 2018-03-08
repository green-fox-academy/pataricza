import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram myAnagram;

  @Before
  public void setUp() throws Exception {
    myAnagram = new Anagram();
  }

  @Test
  public void testSingleWord() {
    assertTrue(myAnagram.anagramChecker("dog", "god"));
  }

  @Test
  public void testWithSpaces() {
    assertTrue(myAnagram.anagramChecker("william shakespeare", "i am a weakish speller"));
  }

  @Test
  public void testIfCaseSensitive() {
    assertTrue(myAnagram.anagramChecker("DoG", "god"));
  }
}