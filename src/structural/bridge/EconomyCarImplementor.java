package structural.bridge;
public class EconomyCarImplementor implements ImplementorIF {
  public EconomyCarImplementor() {
    System.out.println("EconomyCarImplementor constructed.");
  }
  public void actionImplemented() {
    System.out.println("EconomyCarImplementor.actionImplemented() called.");
  }
}