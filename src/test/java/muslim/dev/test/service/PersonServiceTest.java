package muslim.dev.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import muslim.dev.test.data.Person;
import muslim.dev.test.repository.PersonRepository;
import net.bytebuddy.asm.Advice.AssignReturned.AsScalar;

@Extensions({
    @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

  @Mock
  private PersonRepository personRepository;

  private PersonService personService;

  @BeforeEach
  void setUp() {
    personService = new PersonService(personRepository);
  }

  @Test
  void testGetPersonNotFound() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
      personService.get("not found");
    });
  }

  @Test
  void testGetPersonSuccess() {
    // add behavior to mock object
    Mockito.when(personRepository.selectById("herman"))
        .thenReturn(new Person("herman", "Herman"));

    var person = personService.get("herman");

    Assertions.assertNotNull(person);
    Assertions.assertEquals("herman", person.getId());
    Assertions.assertEquals("Herman", person.getName());
  }
}
