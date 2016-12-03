package creation.factory.factoryMethod;

public class ConcreteCreator implements CreatorIF {
  public TradeIF factoryMethod() {
    return new ConcreteTrade();
  }
}