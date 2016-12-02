package structural.flyweight;
public class ConcreteFlyweight implements FlyweightIF {
  // Add state to the concrete flyweight.
  private boolean state;
  public ConcreteFlyweight(State parm) {
    this.state = parm.getState();
  }
  public void action(State parm) {
    // Display internal state and state passed by client.
    System.out.println("ConcreteFlyweight.action("+parm.getState()+") called.");
    this.state = parm.getState();
    System.out.println("ConcreteFlyweight.state = " + this.state);
  }
}