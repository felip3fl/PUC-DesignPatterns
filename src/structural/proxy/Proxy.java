package structural.proxy;
public class Proxy implements ServiceIF {
  // Proxy to be the service
  private Service service = new Service();
  public void action() {
    service.action();
  }
}