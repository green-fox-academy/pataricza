import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

  Fibonacci myFibonacci;

  @Test
  public void withSmallNumber() {
    assertEquals(46368, myFibonacci.fibonacci(25));
  }

  @Test
  public void withABiggerNumber() {
    assertEquals(1134903170, myFibonacci.fibonacci(46));
  }

//  @Test (expected = Error)
//  public void withALetter() {
//    assertEquals(1134903170, myFibonacci.fibonacci("K"));
//  }
}