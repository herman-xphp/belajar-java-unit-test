package muslim.dev.test.repository;

import muslim.dev.test.data.Person;

public interface PersonRepository {

  Person selectById(String id);

  void insert(Person person);
}
