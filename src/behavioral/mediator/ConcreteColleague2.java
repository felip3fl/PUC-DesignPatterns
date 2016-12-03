package behavioral.mediator;
public class ConcreteColleague2 implements ColleagueIF {
  private MediatorIF mediator;
  // This colleague uses a string for its state.
  private String state = "false";
  public ConcreteColleague2(MediatorIF parm) {
    this.mediator = parm;
    this.mediator.registerColleague2(this);
  }
  public void setState(String parm) {
    this.state = parm;
  }
  public void changeState() {
    state = state.equals("false") ? "true" : "false";
    mediator.state2Changed();
  }
  public String toString() {
    return state;
  }
}