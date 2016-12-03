package behavioral.visitor;
import java.util.*;
public class ObjectStructure {
  private List objectStruct;
  private VisitorIF visitor;
  public ObjectStructure(ElementIF[] parm) {
    objectStruct = Arrays.asList(parm);
  }
  public void visitElements() {
    if (visitor == null) { visitor = new ConcreteVisitor(); }
    for (Iterator i = objectStruct.iterator(); i.hasNext();) {
      ((ElementIF) i.next()).accept(visitor);
    }
  }
}