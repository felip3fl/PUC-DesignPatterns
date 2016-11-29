package prototype.prototype2;

public class PrototypePattern implements Cloneable{

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("Prototype Pattern Demonstration.");
	    System.out.println("--------------------------------");
	    // Create prototypes
	    System.out.println("Constructing prototypes.");
	    Microorganismo ameba = new Ameba();
	    Microorganismo virus = new Virus();
	    
	    // Get clones from prototypes
	    System.out.println("Constructing clones from prototypes.");
	    Microorganismo clone1 = ameba.getClone();
	    Microorganismo clone2 = virus.getClone();
	   
		    // Call actions on the clones
	    System.out.println("Calling actions on the clones.");
	    
	    virus.action();
	    clone1.action();
	    ameba.action();
	    clone2.action();
	    
	    
	    System.out.println();

	}
     
}
