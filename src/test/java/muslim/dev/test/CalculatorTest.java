package muslim.dev.test;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @Test
  void testAddSuccess() {
    calculator.add(10, 10);
  }
}
