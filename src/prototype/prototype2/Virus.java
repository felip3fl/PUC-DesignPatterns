package prototype.prototype2;

public class Virus implements Microorganismo , Cloneable{
	 	private String mensagem = new String("Virus Infectando!");
		
	 	public Virus() {
		    System.out.println("Virus Criado");
		  }
	 	
		public void setMens()
		{
			this.mensagem = new String("Virus Duplicado!");
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
