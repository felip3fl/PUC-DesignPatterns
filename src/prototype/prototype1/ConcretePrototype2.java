package prototype.prototype1;
public class ConcretePrototype2 implements PrototypeIF {
  public ConcretePrototype2() {
    System.out.println("ConcretePrototype2 constructed.");
  }
  public PrototypeIF getClone() {
    // if required, put deep copy code here
    return new ConcretePrototype1();
  }
  public void action() {
    System.out.println("ConcretePrototype2.action() called.");
  }
}