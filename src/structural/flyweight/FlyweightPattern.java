package structural.flyweight;
public class FlyweightPattern {
  public static void main(String[] args) {
    System.out.println("Flyweight Pattern Demonstration.");
    System.out.println("--------------------------------");
    // Create states
    State stateF = new State(false);
    State stateT = new State(true);
    // Get reference to (and in doing so create) flyweight
    FlyweightIF myfwkey1 = FlyweightFactory.getFlyweight("myfwkey");
    // Get new reference to the same flyweight
    FlyweightIF myfwkey2 = FlyweightFactory.getFlyweight("myfwkey");
    // Call action on both references
    System.out.println("Call flyweight action with state=false");
    myfwkey1.action(stateF);
    System.out.println("Call flyweight action with state=true");
    myfwkey2.action(stateT);
    System.out.println();
  }
}