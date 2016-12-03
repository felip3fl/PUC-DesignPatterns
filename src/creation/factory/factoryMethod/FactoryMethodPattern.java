package creation.factory.factoryMethod;

public class FactoryMethodPattern {
  public static void main(String[] args) {
    System.out.println("FactoryMethod Pattern Demonstration.");
    System.out.println("------------------------------------");
    // Create creator
    CreatorIF creator = new ConcreteCreator();
    // Create trade via factory method
    TradeIF trade = creator.factoryMethod();
    // Call trade action method
    trade.action();
    System.out.println();
  }
}