package structural.adapter;
public class AdapterPattern {
  public static void main(String[] args) {
    System.out.println("Adapter Pattern Demonstration.");
    System.out.println("------------------------------");
    // Create targets.
    System.out.println("Creating targets.");
    TargetIF target1 = new AdapterByClass();
    TargetIF target2 = new AdapterByObject();
    // Call target requests
    System.out.println("Calling targets.");
    System.out.println("target1.newRequest()->"+target1.newRequest());
    System.out.println("target2.newRequest()->"+target2.newRequest());
    System.out.println();
  }
}