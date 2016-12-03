package behavioral.strategy2;

public class ConcreteStrategy2 implements StrategyIF {
	public void algorithmInterface(String parm) {
	    System.out.println((parm.toLowerCase().startsWith("the "))
	      ? parm.substring(4) + ", " + parm.substring(0,4)
	      : parm);
	  }
}
