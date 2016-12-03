package behavioral.mediator;
public class ConcreteMediator implements MediatorIF {
  ColleagueIF colleague1;
  ColleagueIF colleague2;
  public void registerColleague1(ColleagueIF parm) {
    this.colleague1 = (ConcreteColleague1) parm;
  }
  public void registerColleague2(ColleagueIF parm) {
    this.colleague2 = (ConcreteColleague2) parm;
  }
  public void state1Changed() {
    String s = (colleague2.toString().equals("true")) ? "false" : "true";
    ((ConcreteColleague2) colleague2).setState(s);
  }
  public void state2Changed() {
    boolean b = (colleague1.toString().equals("true")) ? false : true;
    ((ConcreteColleague1) colleague1).setState(b);
  }
}