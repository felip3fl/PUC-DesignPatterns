package behavioral.chainOfResponsibility;
public class ConcreteHandler2 implements HandlerIF {
  public void processRequest(Request parm) {
    // You could add on to the processing chain here...
    handleIt(parm);
  }
  private void handleIt(Request parm) {
    System.out.println("ConcreteHandler2 has handled the processing.");
  }
}