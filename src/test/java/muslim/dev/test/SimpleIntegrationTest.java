package muslim.dev.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tags({
    @Tag("integration-test")
})
public class SimpleIntegrationTest {

  @Test
  void test1() {
    System.out.println("Integration test 1");
  }

  @Test
  void test2() {
    System.out.println("Integration test 2");
  }

}
