package structural.proxy;
public class ProxyPattern {
  public static void main(String[] args) {
    System.out.println("Proxy Pattern Demonstration.");
    System.out.println("----------------------------");
    // Create service proxy (instantiates service too)
    System.out.println("Creating proxy to service.");
    ServiceIF proxy = new Proxy();
    // Call action method on service via proxy
    System.out.println("Calling action method on proxy.");
    proxy.action();
    System.out.println();
  }
}