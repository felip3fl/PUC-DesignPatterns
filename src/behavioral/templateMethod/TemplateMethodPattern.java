package behavioral.templateMethod;
public class TemplateMethodPattern {
  public static void main(String[] args) {
    System.out.println("TemplateMethod Pattern Demonstration.");
    System.out.println("-------------------------------------");
    // Construct concrete classes.
    System.out.println("Constructing concrete classes.");
    AbstractClass class1 = new ConcreteClass1();
    AbstractClass class2 = new ConcreteClass2();
    // Call template method.
    System.out.println("Calling template methods.");
    class1.templateMethod();
    class2.templateMethod();
    System.out.println();
  }
}