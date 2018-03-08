import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

  Sum mySum;
  Sum emptyList;
  Sum oneElement;
  Sum nullElement;

  @Before
  public void setUp() throws Exception {
    mySum = new Sum();
    emptyList = new Sum();
    oneElement = new Sum();
    nullElement = new Sum();
    mySum.getNumbers().add(6);
    mySum.getNumbers().add(8);
    mySum.getNumbers().add(10);
    mySum.getNumbers().add(4);
    oneElement.getNumbers().add(15);
    nullElement.getNumbers().add(null);
  }

  @Test
  public void testSumTheListWithMySum() {
    assertEquals(28, mySum.sumTheList());
  }

  @Test
  public void testSumTheListWithEmptyList() {
    assertEquals(0, emptyList.sumTheList());
  }

  @Test
  public void testSumTheListWithOneElement() {
    assertEquals(15, oneElement.sumTheList());
  }

  @Test (expected = NullPointerException.class)
  public void testSumTheListWithNullElement() {
    assertEquals(15, nullElement.sumTheList());
  }
}