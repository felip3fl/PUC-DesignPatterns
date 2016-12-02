package structural.decorator;
public class ConcreteDecoratorB extends Decorator {
  public void action() {
    super.action();
    System.out.println("ConcreteDecoratorB.action() called.");
    addedMethod();
  }
  private void addedMethod() {
    System.out.println("ConcreteDecoratorB.addedMethod() called.");
  }
}