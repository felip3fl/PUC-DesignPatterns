package structural.decorator;
public class DecoratorPattern {
  public static void main(String[] args) {
    System.out.println("Decorator Pattern Demonstration.");
    System.out.println("--------------------------------");
    // Create object decorated with A
    System.out.println("Creating component decorated with A.");
    ComponentIF decorated1 = new ConcreteDecoratorA();
    // Call action on object decorated with A
    System.out.println("Calling action() on component decorated with A.");
    decorated1.action();
    // Create object decorated with B
    System.out.println("Creating component decorated with B.");
    ComponentIF decorated2 = new ConcreteDecoratorB();
    // Call action on object decorated with B
    System.out.println("Calling action() on component decorated with B.");
    decorated2.action();
    System.out.println();
  }
}