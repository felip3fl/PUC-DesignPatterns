package prototype.prototype1;
public class PrototypePattern {
  public static void main(String[] args) {
    System.out.println("Prototype Pattern Demonstration.");
    System.out.println("--------------------------------");
    // Create prototypes
    System.out.println("Constructing prototypes.");
    PrototypeIF prototype1 = new ConcretePrototype1();
    PrototypeIF prototype2 = new ConcretePrototype2();
    // Get clones from prototypes
    System.out.println("Constructing clones from prototypes.");
    PrototypeIF clone1 = prototype1.getClone();
    PrototypeIF clone2 = prototype2.getClone();
    // Call actions on the clones
    System.out.println("Calling actions on the clones.");
    clone1.action();
    clone2.action();
    System.out.println();
  }
}