package creation.factory.staticFactory;

public class ClientStaticFactoryMethod {
	public static void main(String[] args) {
		    System.out.println("FactoryMethod Pattern Demonstration.");
		    System.out.println("------------------------------------");
		    // Create creator
		    ConcreteTrade trade = CreatorAF.factoryMethod();
		    trade.action();
		    System.out.println();
	}

	
}