package muslim.dev.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import muslim.dev.test.resolver.RandomParameterResolver;

@Extensions({
    @ExtendWith(RandomParameterResolver.class)
})
public class AbstractCalculatorTest {

  protected Calculator calculator = new Calculator();

  @BeforeEach
  void setUp() {
    System.out.println("Before Each");
  }

}
