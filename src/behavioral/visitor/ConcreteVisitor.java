package behavioral.visitor;
public class ConcreteVisitor implements VisitorIF {
  public void visitConcreteElementA(ConcreteElementA parm) {
    parm.operationA();
  }
  public void visitConcreteElementB(ConcreteElementB parm) {
    parm.operationB();
  }
}