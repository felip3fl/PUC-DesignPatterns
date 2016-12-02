package structural.facade;
public class FacadePattern {
  public static void main(String[] args) {
    System.out.println("Facade Pattern Demonstration.");
    System.out.println("-----------------------------");
    // Construct and call Facade
    System.out.println("Constructing facade.");
    Facade facade = new Facade();
    System.out.println("Calling facade.processOrder().");
    facade.processOrder();
    System.out.println();
  }
}