package structural.adapter;
public class Adaptee {
  public Adaptee() {
    System.out.println("Adaptee constructed.");
  }
  public String oldRequest() {
    return "Adaptee.oldRequest() called.";
  }
}