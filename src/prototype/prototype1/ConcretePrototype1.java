package prototype.prototype1;
public class ConcretePrototype1 implements PrototypeIF {
  public ConcretePrototype1() {
    System.out.println("ConcretePrototype1 constructed.");
  }
  public PrototypeIF getClone() {
    // if required, put deep copy code here
    return new ConcretePrototype1();
  }
  public void action() {
    System.out.println("ConcretePrototype1.action() called");
  }
}