package comsysto.talks.demomaven;

import java.util.Objects;

class Person {
  private final String firstName;
  private final String lastName;

  Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Person)) return false;

    Person other = (Person) obj;

    return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
  }
}

public class PatternMatching2_InstanceOfEquals {

  public static void main(String[] args) {

    var person1 = new Person("John", "Doe");
    var person2 = new Person("John", "Doe");
    var person3 = new Person("Julie", null);

    System.out.println(person1.equals(person2));
    System.out.println(person1.equals(person3));
  }
}
