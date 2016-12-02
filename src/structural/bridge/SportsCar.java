package structural.bridge;
public class SportsCar implements AbstractionIF {
  ImplementorIF implementor = new SportsCarImplementor();
  public SportsCar() {
    System.out.println("SportsCar constructed.");
  }
  public void action() {
    implementor.actionImplemented();
  }
}