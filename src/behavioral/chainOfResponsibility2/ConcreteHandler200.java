package behavioral.chainOfResponsibility2;

public class ConcreteHandler200 implements HandlerIF{
	public void processRequest(Request parm) {
	    // You could add on to the processing chain here...
	    handleIt(parm);
	  }
	  private void handleIt(Request parm) {
	    System.out.println("Withdrawal of $200.00");
	  }
}
