package behavioral.visitor;
public class ConcreteElementB implements ElementIF {
  public void accept(VisitorIF parm) {
    parm.visitConcreteElementB(this);
  }
  public void operationB() {
    System.out.println("ConcreteElementB.operationB() called.");
  }
}