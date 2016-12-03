package behavioral.chainOfResponsibility2;

public class ChainOfResponsibilityPattern {
	public static void main(String[] args) {
	    System.out.println("Chain Of Responsibility Pattern Demonstration.");
	    System.out.println("----------------------------------------------");
	    try {
	      // Create $50.00 Order request.
	      Request fiftyOrderRequest = new Request(Request.ORDER50);
	      // Create $100.00 Order request.
	      Request oneHundOrderRequest = new Request(Request.ORDER100);
	      // Create $200.00 Order request.
	      Request twoHundOrderRequest = new Request(Request.ORDER200);
	      // Create a request handler.
	      HandlerIF handler = new ConcreteHandler50();
	      // Process the 1st Order.
	      System.out.println("Calling 1st handler with $50.00 Order.");
	      handler.processRequest(fiftyOrderRequest);
	      // Process the 2nd Order.
	      System.out.println("Calling 2nd handler with $100.00 Order.");
	      handler.processRequest(oneHundOrderRequest);
	      // Process the 3thd Order.
	      System.out.println("Calling 3thd handler with $200.00 Order.");
	      handler.processRequest(twoHundOrderRequest);
	    
	    } catch (Exception e) {System.out.println(e.getMessage());}
	    System.out.println();
	  }
}
