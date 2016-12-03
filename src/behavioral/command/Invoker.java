package behavioral.command;
public class Invoker {
  private CommandAbstract command;
  public void storeCommand(CommandAbstract cmd) {
    this.command = cmd;
  }
  public void invoke() {
    command.execute();
  }
}