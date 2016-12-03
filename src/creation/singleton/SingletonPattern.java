package creation.singleton;
public class SingletonPattern {
  public static void main(String[] args) {
    System.out.println("Singleton Pattern Demonstration.");
    System.out.println("--------------------------------");
    System.out.println("Getting Singleton instance (s1)");
    Singleton s1 = Singleton.getInstance();
    System.out.println("s1.getInfo()="+s1.getInfo());
    System.out.println("Getting Singleton instance (s2)");
    Singleton s2 = Singleton.getInstance();
    System.out.println("s2.getInfo()="+s2.getInfo());
    System.out.println("s1.setValue(42)");
    s1.setValue(42);
    System.out.println("s1.getValue()="+s1.getValue());
    System.out.println("s2.getValue()="+s2.getValue());
    System.out.println("s1.equals(s2)="+s1.equals(s2) + ", s2.equals(s1)="+s2.equals(s1));
    // The following will not compile
    // Singleton s3 = (Singleton) s1.clone();
    System.out.println();
  }
}