package structural.flyweight;
import java.util.*;
public class FlyweightFactory {
  private static Map map = new HashMap();
  public static FlyweightIF getFlyweight(String parm) {
    // Return the Flyweight if it exists,
    // or create it if it doesn't.
    FlyweightIF flyweight = null;
    try {
      if (map.containsKey(parm)) {
        // Return existing flyweight
        flyweight = (FlyweightIF) map.get(parm);
      } else {
        // Create flyweight with a 'true' state
        flyweight = new ConcreteFlyweight(new State(true));
        map.put(parm, flyweight);
        System.out.println("Created flyweight "+parm+" with state=true");
        System.out.println("");
      }
    } catch (ClassCastException cce) {
      System.out.println(cce.getMessage());
    }
    return flyweight;
  }
}