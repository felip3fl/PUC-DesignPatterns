package behavioral.observer;
public interface SubjectIF {
  public void addObserver(ObserverIF parm);
  public void removeObserver(ObserverIF parm);
  public void notifyObservers();
}