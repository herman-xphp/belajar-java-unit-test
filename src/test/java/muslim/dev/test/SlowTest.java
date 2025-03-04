package muslim.dev.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class SlowTest {

  @Test
  @Timeout(value = 5, unit = TimeUnit.SECONDS)
  void testSlow() throws InterruptedException {
    // Thread.sleep(10_000);
  }
}
