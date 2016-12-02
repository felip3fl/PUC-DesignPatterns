package structural.decorator2;
// Decorator Sprinkles ("tipo de granulado doce") that mixes sprinkles with coffee.
// Note it extends CoffeeDecorator.
public class Sprinkles extends CoffeeDecorator {
	public Sprinkles (Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
	// Overriding methods defined in the abstract superclass
    public double getCost() {
        return super.getCost() + 0.2;
    }
 
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Sprinkles";
    }
}
