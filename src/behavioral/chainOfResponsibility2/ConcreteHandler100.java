package behavioral.chainOfResponsibility2;

public class ConcreteHandler100 implements HandlerIF{
	
	public void processRequest(Request parm) {
	    // Start the processing chain here...
	    switch (parm.getType()) {
	      case Request.ORDER100: // This object processes second order
	        handleIt(parm);          // so call the function to handle it.
	        break;
	      case Request.ORDER50:   // Another object processes first order
	        // pass request along.
	        new ConcreteHandler50().processRequest(parm);
	        break;
	      case Request.ORDER200:   // Another object processes third order so
		        // pass request along.
		        new ConcreteHandler200().processRequest(parm);
		        break;
	    }
	  }
	  private void handleIt(Request parm) {
	    System.out.println("Withdrawal of $100.00");
	  }
}
