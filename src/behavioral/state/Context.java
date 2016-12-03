package behavioral.state;
public class Context {
  // Initial state.
  private StateIF state = new ConcreteState1();
  // Request operation.
  public void request() {
    state.handle();
  }
  // Switch states
  public void changeState() {
	if (state instanceof ConcreteState1)
      state = new ConcreteState2();
    else
      state = new ConcreteState1();
  }
}