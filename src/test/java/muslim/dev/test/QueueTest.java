package muslim.dev.test;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A Queue")
public class QueueTest {

  private Queue<String> queue;

  @Nested
  @DisplayName("when new")
  public class WhenNew {

    @BeforeEach
    void setUp() {
      queue = new LinkedList<>();
    }

    @Test
    @DisplayName("when offer, size must be 1")
    void offerNewData() {
      queue.offer("Herman");
      Assertions.assertEquals(1, queue.size());
    }

    @Test
    @DisplayName("when offer, size must be 1")
    void offerMoreData() {
      queue.offer("Herman");
      queue.offer("Ahmad");
      Assertions.assertEquals(2, queue.size());
    }
  }
}
