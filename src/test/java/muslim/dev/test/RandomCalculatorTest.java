package muslim.dev.test;

import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class RandomCalculatorTest extends AbstractCalculatorTest {

  @Test
  void testRandom(Random random) {
    var a = random.nextInt();
    var b = random.nextInt();

    var result = calculator.add(a, b);
    var expected = a + b;

    Assertions.assertEquals(expected, result);
  }

  @DisplayName("Test random calculator")
  @RepeatedTest(value = 10, name = "{displayName} {currentRepetition} of {totalRepetitions}")
  void testRandomRepeat(Random random) {
    var a = random.nextInt();
    var b = random.nextInt();

    var result = calculator.add(a, b);
    var expected = a + b;

    Assertions.assertEquals(expected, result);
  }

  @DisplayName("Test random calculator")
  @RepeatedTest(value = 10, name = "{displayName}")
  void testRandomRepeatInfo(Random random, TestInfo info, RepetitionInfo repetitionInfo) {
    System.out.println(
        info.getDisplayName() + " " + repetitionInfo.getCurrentRepetition() + " of "
            + repetitionInfo.getTotalRepetitions());
    var a = random.nextInt();
    var b = random.nextInt();

    var result = calculator.add(a, b);
    var expected = a + b;

    Assertions.assertEquals(expected, result);
  }

  @DisplayName("Test calculator")
  @ParameterizedTest(name = "{displayName} with parameter {0}")
  @ValueSource(ints = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10 })
  void testWithParameter(int value) {
    var expected = value + value;
    var result = calculator.add(value, value);

    Assertions.assertEquals(expected, result);
  }

  public static List<Integer> parameterSource() {
    return List.of(1, 3, 5, 6, 4, 6, 5, 3, 2, 10);
  }

  @DisplayName("Test calculator")
  @ParameterizedTest(name = "{displayName} with parameter {0}")
  @MethodSource({ "parameterSource" })
  void testWithMethodSource(Integer value) {
    var expected = value + value;
    var result = calculator.add(value, value);

    Assertions.assertEquals(expected, result);
  }
}
