package muslim.dev.test.service;

import java.util.UUID;

import muslim.dev.test.data.Person;
import muslim.dev.test.repository.PersonRepository;

public class PersonService {

  private PersonRepository personRepository;

  public PersonService(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  public Person get(String id) {
    Person person = personRepository.selectById(id);
    if (person != null) {
      return person;
    } else {
      throw new IllegalArgumentException("Person not found");
    }
  }

  public Person register(String name) {
    var person = new Person(UUID.randomUUID().toString(), name);
    personRepository.insert(person);
    return person;
  }
}
