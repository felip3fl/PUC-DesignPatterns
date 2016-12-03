package behavioral.command;
public class Trade implements ReceiverIF {
  public void action() {
    System.out.println("Trade.action() called.");
  }
}