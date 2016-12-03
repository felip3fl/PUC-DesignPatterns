package behavioral.chainOfResponsibility2;

public class ConcreteHandler50 implements HandlerIF{
	
	public void processRequest(Request parm) {
	    // Start the processing chain here...
	    switch (parm.getType()) {
	      case Request.ORDER50: // This object processes first order
	        handleIt(parm);          // so call the function to handle it.
	        break;
	      case Request.ORDER100:   // Another object processes second order
	        // pass request along.
	        new ConcreteHandler100().processRequest(parm);
	        break;
	      case Request.ORDER200:   // Another object processes third order so
		        // pass request along.
		        new ConcreteHandler200().processRequest(parm);
		        break;
	    }
	  }
	  private void handleIt(Request parm) {
	    System.out.println(" withdrawal of $50.00");
	  }
}
