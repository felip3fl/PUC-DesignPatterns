package structural.bridge;
public class BridgePattern {
  public static void main(String[] args) {
    System.out.println("Bridge Pattern Demonstration.");
    System.out.println("-----------------------------");
    System.out.println("Constructing SportsCar and EconomyCar.");
    AbstractionIF abstract1 = new SportsCar();
    AbstractionIF abstract2 = new EconomyCar();
    System.out.println("Calling action() on SportsCar and EconomyCar.");
    abstract1.action();
    abstract2.action();
    System.out.println();
  }
}