package behavioral.strategy2;

public class Context {
	 // Reference to the strategy.
	  StrategyIF strategy;
	  // Register reference to strategy on construction.
	  public Context(StrategyIF parm) {this.strategy = parm;}
	  // Call strategy's method.
	  public void contextInterface(String parm) {
		  strategy.algorithmInterface(parm);
	}
}
