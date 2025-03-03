package muslim.dev.test.generator;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayNameGenerator;

public class SimpleDisplayNameGenerator implements DisplayNameGenerator {

  @Override
  public String generateDisplayNameForClass(Class<?> testClass) {
    return "Test " + testClass.getSimpleName();
  }

  @Override
  public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'generateDisplayNameForNestedClass'");
  }

  @Override
  public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
    return "Test " + testClass.getSimpleName() + "." + testMethod.getName();
  }

}
