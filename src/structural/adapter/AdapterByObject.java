package structural.adapter;
public class AdapterByObject implements TargetIF {
  private Adaptee adaptee;
  public AdapterByObject() {
    System.out.println("AdapterByObject constructed.");
  }
  public String newRequest() {
    // Create an Adaptee object if it doesn't exist yet
    if (adaptee == null) { adaptee = new Adaptee(); }
    return adaptee.oldRequest();
  }
}