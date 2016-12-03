package behavioral.mediator;
public class MediatorPattern {
  public static void main(String[] args) {
    System.out.println("Mediator Pattern Demonstration.");
    System.out.println("-------------------------------");
    // Construct mediator and colleagues
    System.out.println("Constructing mediator and colleagues.");
    MediatorIF  mediator   = new ConcreteMediator();
    ColleagueIF colleague1 = new ConcreteColleague1(mediator);
    ColleagueIF colleague2 = new ConcreteColleague2(mediator);
    // Display colleague values.
    System.out.println("Displaying colleague states.");
    System.out.println("colleague1.toString()="+colleague1);
    System.out.println("colleague2.toString()="+colleague2);
    // Change state on colleague1 and the mediator
    // will coordinate the change with colleague2.
    System.out.println("Calling colleague1.changeState()");
    ((ConcreteColleague1) colleague1).changeState();
    // Display colleague values now.
    System.out.println("Displaying colleague states now.");
    System.out.println("colleague1.toString()="+colleague1);
    System.out.println("colleague2.toString()="+colleague2);
    // Change state on colleague2 and see what happens.
    System.out.println("Calling colleague2.changeState()");
    ((ConcreteColleague2) colleague2).changeState();
    // Display colleague values now.
    System.out.println("Displaying colleague states again.");
    System.out.println("colleague1.toString()="+colleague1);
    System.out.println("colleague2.toString()="+colleague2);
    System.out.println();
  }
}