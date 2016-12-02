package structural.facade;
public class Facade {
  public void processOrder() {
    // Call methods on sub-systems to complete the process
    SubSystem1 subsys1 = new SubSystem1();
    subsys1.getCustomer();
    subsys1.getSecurity();
    subsys1.priceTransaction();
    SubSystemN subsysN = new SubSystemN();
    subsysN.checkBalances();
    subsysN.completeOrder();
  }
}