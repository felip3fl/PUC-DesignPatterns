package creation.builder;
public class ConcreteCustomer implements CustomerIF {
  public ConcreteCustomer() {
    System.out.println("ConcreteCustomer constructed.");
  }
  public void action() {
    System.out.println("ConcreteCustomer.action() called.");
  }
}