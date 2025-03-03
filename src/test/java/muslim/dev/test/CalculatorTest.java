package muslim.dev.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;

import muslim.dev.test.generator.SimpleDisplayNameGenerator;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
// @DisplayName("Test for Calculator class")
public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  // @DisplayName("Test success for method add(integer, integer)")
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
