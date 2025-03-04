package muslim.dev.test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomCalculatorTest extends AbstractCalculatorTest {

  @Test
  void testRandom(Random random) {
    var a = random.nextInt();
    var b = random.nextInt();

    var result = calculator.add(a, b);
    var expected = a + b;

    Assertions.assertEquals(expected, result);
  }
}
