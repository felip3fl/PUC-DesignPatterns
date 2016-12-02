package structural.composite;
public class Leaf extends Component {
  private String name;
  public Leaf(String parm) {
    this.name = parm;
    System.out.println(parm.trim()+" constructed.");
  }
  public void display() {
    System.out.println(this.getName());
  }
  public String getName() {
    return name;
  }
}