package behavioral.memento;
public class Caretaker {
  public static void run() {
    // Create originator and set initial values.
    System.out.println("Creating originator and setting initial values.");
    Originator originator = new Originator();
    originator.setState(true);
    originator.setName("The Originator");
    // Create memento.
    System.out.println("Creating memento.");
    Memento memento = originator.createMemento();
    System.out.println(originator);
    // Change originator values.
    System.out.println("Changing originator values.");
    originator.setState(false);
    originator.setName("To be undone.");
    System.out.println(originator);
    // Recover state from memento.
    System.out.println("Recovering originator values from memento.");
    originator.recoverFromMemento(memento);
    System.out.println(originator);
  }
}