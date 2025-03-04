package muslim.dev.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MockTest {

  @Test
  void testMock() {
    List<String> list = Mockito.mock(List.class);

    Mockito.when(list.get(0)).thenReturn("Herman");
    Mockito.when(list.get(10)).thenReturn("Ahmad");

    System.out.println(list.get(0));
    System.out.println(list.get(10));

    Mockito.verify(list, Mockito.times(1)).get(0);
  }
}
