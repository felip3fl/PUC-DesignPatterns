package behavioral.chainOfResponsibility2;

public class Request {
	// The universe of known requests that can be handled.
	  public final static int ORDER50 = 50;
	  public final static int ORDER100 = 100;
	  public final static int ORDER200 = 200;
	  
	  // This objects type of request.
	  private int type;
	  public Request(int parm) throws Exception {
	    // Validate the request type with the known universe.
	    if ((parm == ORDER50) || (parm == ORDER100) || (parm == ORDER200))
	      // Store this request type.
	      this.type = parm;
	    else
	      throw new Exception("Unknown Request type "+parm+".");
	  }
	  public int getType() {
	    return type;
	  }
}
