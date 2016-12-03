package behavioral.observer;
import java.util.*;
public class ConcreteSubject implements SubjectIF {
  List observers = new ArrayList();
  public void addObserver(ObserverIF parm) {observers.add(parm);}
  public void removeObserver(ObserverIF parm) {observers.remove(observers.indexOf(parm));}
  public void notifyObservers() {
    for (Iterator i = observers.iterator(); i.hasNext();) {
      ((ObserverIF) i.next()).update();
    }
  }
  public void doSomething() {
    double d = Math.random();
    if (d<0.25 || d>0.75) {
      System.out.print("Yes");
      notifyObservers();
    } else {
      System.out.print("No");
    }
  }
}