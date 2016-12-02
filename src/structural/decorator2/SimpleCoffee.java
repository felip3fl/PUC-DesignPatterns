package structural.decorator2;
// Extension of a simple coffee without any extra ingredients
public class SimpleCoffee extends Coffee {
	 public double getCost() {
	        return 1;
	    }
	 
	    public String getIngredients() {
	        return "Coffee";
	    }
}
