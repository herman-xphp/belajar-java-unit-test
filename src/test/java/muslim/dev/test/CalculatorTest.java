package muslim.dev.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  void testAddSuccess() {
    Integer result = calculator.add(10, 10);
    assertEquals(20, result);

    // if (result != 20) {
    // throw new RuntimeException("Test failed");
    // }
  }

  @Test
  void testDivideSuccess() {
    Integer result = calculator.divide(100, 10);
    assertEquals(10, result);
  }

  @Test
  void testDivideFailed() {
    assertThrows(
        IllegalArgumentException.class, () -> calculator.divide(100, 0));
  }

}
