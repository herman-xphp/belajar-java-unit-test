package muslim.dev.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.opentest4j.TestAbortedException;

import muslim.dev.test.generator.SimpleDisplayNameGenerator;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
// @DisplayName("Test for Calculator class")
public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @BeforeAll
  public static void beforeAll() {
    System.out.println("Before all test method");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("After all test method");
  }

  @BeforeEach
  public void setUp() {
    System.out.println("Before each test method");
  }

  @AfterEach
  public void tearDown() {
    System.out.println("After each test method");
  }

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

  @Test
  @Disabled
  void testComingSoon() {
    throw new RuntimeException("Coming soon");
  }

  @Test
  public void testAborted() {
    var profile = System.getenv("PROFILE");
    if (!"DEV".equals(profile)) {
      throw new TestAbortedException("Test aborted because not DEV profile");
    }
  }

}
