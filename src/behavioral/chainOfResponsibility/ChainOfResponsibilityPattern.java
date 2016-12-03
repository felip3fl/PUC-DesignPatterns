package behavioral.chainOfResponsibility;
public class ChainOfResponsibilityPattern {
  public static void main(String[] args) {
    System.out.println("Chain Of Responsibility Pattern Demonstration.");
    System.out.println("----------------------------------------------");
    try {
      // Create Equity Order request.
      System.out.println("Creating Equity Order request.");
      Request equityOrderRequest = new Request(Request.EQUITY_ORDER);
      // Create Bond Order request.
      System.out.println("Creating Bond Order request.");
      Request bondOrderRequest = new Request(Request.BOND_ORDER);
      // Create a request handler.
      System.out.println("Creating 1st handler.");
      HandlerIF handler = new ConcreteHandler1();
      // Process the Equity Order.
      System.out.println("Calling 1st handler with Equity Order.");
      handler.processRequest(equityOrderRequest);
      // Process the Bond Order.
      System.out.println("Calling 1st handler with Bond Order");
      handler.processRequest(bondOrderRequest);
    } catch (Exception e) {System.out.println(e.getMessage());}
    System.out.println();
  }
}