import java.util.ArrayList;

public class Person {
  private String firstName;
  private String lastName;
  private String title;
  private int age;

  public Person(String firstName) {
    this.firstName = firstName;
    this.age = 0;
  }

  public Person(String firstName, int age) {
    this.firstName = firstName;
    this.age = age;
  }

  public Person(String firstName, String lastName) {
    this(firstName);
    this.lastName = lastName;
  }

  public Person(String firstName, String lastName, String title) {
    this(firstName, lastName);
    this.title = title;
  }

  public String getName() {
    if(this.lastName == null) {
      return this.firstName;
    } else {
      return this.firstName + " " + this.lastName;
    }
  }

  public String getName(Boolean formal) {
    if(formal) {
      return this.title + " " + this.firstName + " " + this.lastName;
    } else {
      return getName();
    }
  }

  public String getName(int numOfTimes) {
    ArrayList<String> names = new ArrayList<>();
    for(int i = 0; i < numOfTimes; i++) {
      names.add(getName());
    }

    return String.join(", ", names);
  }
}
