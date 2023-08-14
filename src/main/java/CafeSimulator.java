import java.lang.reflect.Array;
import java.util.ArrayList;

public class CafeSimulator {
  public static void main(String[] args) {
    Person beyonce = new Person("Beyonce");
//    System.out.println(beyonce);
//    System.out.println(beyonce.getName());
//    System.out.println(beyonce.getName(3));

    Person taylor = new Person("Taylor", "Swift");
//    System.out.println(taylor);
//    System.out.println(taylor.getName());

    Person elton = new Person("Elton", "John", "Sir");
//    System.out.println(elton);
//    System.out.println(elton.getName(true));
//    System.out.println(elton.getName(false));

    Line todaysLine = new Line();
    todaysLine.enterCafe(beyonce);
    todaysLine.enterCafe(taylor);
    todaysLine.serveCustomer();
    todaysLine.enterCafe(elton);
    todaysLine.serveCustomer();

  }
}