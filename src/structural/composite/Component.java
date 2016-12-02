package structural.composite;
public abstract class Component {
  public abstract void display();
  public void add(Component c) { /* override in concrete class */; }
  public void remove(Component c) { /* override in concrete class */; }
  public Component getChild(int index) { return null; }
  public String getName() { return null; }
}