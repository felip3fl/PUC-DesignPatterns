package behavioral.memento;
public class Originator {
  private boolean state;
  private String  name;
  private String  other;
  // Create memento, save critical data in it.
  public Memento createMemento() {
    return new Memento(state, name);
  }
  // Recover critical data from memento.
  public void recoverFromMemento(Memento memento) {
    this.state = memento.getState();
    this.name  = memento.getName();
  }
  public void setState(boolean parm) {
    this.state = parm;
  }
  public void setName(String parm) {
    this.name = parm;
  }
  public String toString() {
    return "Originator.toString() state="+state+", name="+name;
  }
}