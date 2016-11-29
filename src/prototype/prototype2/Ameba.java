package prototype.prototype2;

public class Ameba implements Microorganismo, Cloneable{
	private String mensagem = new String("Ameba Infectando!");
	
	public Ameba() {
	     System.out.println("Ameba Criada");
	  }
	  
	public void setMens()
	{
		this.mensagem = new String("Ameba Duplicada!");
	}
	
	public Microorganismo getClone() throws CloneNotSupportedException {
	    
		Microorganismo proto = (Microorganismo) super.clone();
	    proto.setMens();
	    return proto;
	  }
	  
	public void action() {
	    System.out.println(mensagem);
	  }
	
}
