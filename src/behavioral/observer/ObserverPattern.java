package behavioral.observer;
public class ObserverPattern {
  public static void main(String[] args) {
    System.out.println("Observer Pattern Demonstration.");
    System.out.println("-------------------------------");
    // Constructing observers.
    System.out.println("Constructing observer1 and observer2.");
    ObserverIF observer1 = new ConcreteObserver();
    ObserverIF observer2 = new ConcreteObserver();
    // Constructing observable (subject).
    System.out.println("Constructing observerable (subject).");
    ConcreteSubject subject = new ConcreteSubject();
    // Add observer object references to the subject.
    System.out.println("Registering observers with subject.");
    subject.addObserver(observer1);
    subject.addObserver(observer2);
    System.out.println("Doing something in the subject over time...");
    System.out.println();
    System.out.println("            Observable   Observer1    Observer2");
    System.out.println("Iteration    changed?    notified?    notified?");
    // Use loop to simulate time.
    for(int i=0;i < 10;i++) {
      System.out.print(i+":             ");
      subject.doSomething();
      System.out.println();
    }
    System.out.println();
    System.out.println("Removing observer1 from the subject...repeating...");
    System.out.println();
    subject.removeObserver(observer1);
    // Another loop to simulate time.
    for(int i=0;i < 10;i++) {
      System.out.print(i+":             ");
      subject.doSomething();
      System.out.println();
    }
  }
}