package behavioral.state;
public class StatePattern {
  public static void main(String[] args) {
    System.out.println("State Pattern Demonstration.");
    System.out.println("----------------------------");
    // Construct context.
    System.out.println("Constructing context.");
    Context context = new Context();
    // Call request, make state handle the request.
    System.out.println("Calling context.request().");
    context.request();
    // Flip state.
    System.out.println("Calling context.changeState().");
    context.changeState();
    // call request.
    System.out.println("Calling context.request().");
    context.request();
    System.out.println();
  }
}