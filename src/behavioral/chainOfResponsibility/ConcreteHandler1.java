package behavioral.chainOfResponsibility;
/**
 * Handles requests it is responsible for&46; Can access it's sucessor&46;
 * If the ConcreteHandler can handle the request, it does so; otherwise it
 * forwards the request on to it's sucessor.
 */
public class ConcreteHandler1 implements HandlerIF {
  public void processRequest(Request parm) {
    // Start the processing chain here...
    switch (parm.getType()) {
      case Request.EQUITY_ORDER: // This object processes equity orders
        handleIt(parm);          // so call the function to handle it.
        break;
      case Request.BOND_ORDER:   // Another object processes bond orders so
        System.out.println("Creating 2nd handler."); // pass request along.
        new ConcreteHandler2().processRequest(parm);
        break;
    }
  }
  private void handleIt(Request parm) {
    System.out.println("ConcreteHandler1 has handled the processing.");
  }
}