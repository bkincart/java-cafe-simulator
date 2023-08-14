import java.util.ArrayList;

public class Line {
  private ArrayList<Person> cafeLine;

  public Line() {
    this.cafeLine = new ArrayList<>();
  }

  public void enterCafe(Person newPerson) {
    System.out.println("Welcome, " + newPerson.getName() + "!");
    this.cafeLine.add(newPerson);
    System.out.println(this.cafeLine);
  }

  public Person serveCustomer() {
    Person servedCustomer = cafeLine.remove(0);
    System.out.println(cafeLine);
    System.out.println("What would you like, " + servedCustomer.getName() + "?");
    return servedCustomer;
  }
}
