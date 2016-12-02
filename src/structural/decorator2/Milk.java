package structural.decorator2;
// Decorator Milk that mixes milk with coffee.
// Note it extends CoffeeDecorator.
public class Milk extends CoffeeDecorator{
	public Milk (Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
	// Overriding methods defined in the abstract superclass
    public double getCost() { 
        return super.getCost() + 0.5;
    }
 
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Milk";
    }
}
