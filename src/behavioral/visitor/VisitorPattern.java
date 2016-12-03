package behavioral.visitor;
public class VisitorPattern {
  public static void main(String[] args) {
    System.out.println("Visitor Pattern Demonstration.");
    System.out.println("------------------------------");
    // Construct list of elements.
    System.out.println("Constructing two elements.");
    ElementIF[] elements = new ElementIF[2];
    elements[0] = new ConcreteElementA();
    elements[1] = new ConcreteElementB();
    // Construct object structure.
    System.out.println("Constructing object structure.");
    ObjectStructure objectStructure = new ObjectStructure(elements);
    // Visit elements in object structure.
    System.out.println("Visiting elements in object structure.");
    objectStructure.visitElements();
    System.out.println();
  }
}