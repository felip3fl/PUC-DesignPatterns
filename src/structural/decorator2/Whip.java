package structural.decorator2;
// Decorator Whip ("creme") that mixes whip with coffee.
// Note it extends CoffeeDecorator.
public class Whip extends CoffeeDecorator{
	public Whip (Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
	// Overriding methods defined in the abstract superclass
    public double getCost() {
        return super.getCost() + 0.7;
    }
 
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Whip";
    }
}
