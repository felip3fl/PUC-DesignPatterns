package behavioral.strategy2;

public class StrategyPattern {
	public static void main(String[] args) {
		String vogais = new String("a e i o u");
		String consoantes = new String("b c d f g h j k l m n p q r t v x z");
	    System.out.println("Strategy Pattern Demonstration.");
	    System.out.println("-------------------------------");
	    // Construct strategies.
	    System.out.println("Constructing strategies.");
	    StrategyIF strategy1 = new ConcreteStrategy1();
	    StrategyIF strategy2 = new ConcreteStrategy2();
	    // Construct contexts.
	    System.out.println("Constructing contexts.");
	    Context context1 = new Context(strategy1);
	    Context context2 = new Context(strategy2);
	    // Execute contextInterface.
	    System.out.println("Constructing context interfaces.");
	    context1.contextInterface(vogais);
	    context2.contextInterface(vogais);
	    context1.contextInterface(consoantes);
	    context2.contextInterface(consoantes);
	    System.out.println();
	  }
}
