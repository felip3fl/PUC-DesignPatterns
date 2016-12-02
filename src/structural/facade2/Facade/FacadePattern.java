package structural.facade2.Facade;

import structural.facade2.Compra.*;

public class FacadePattern {

	
	public static void main(String[] args) {
	
		ICompraProduto cp = new CompraProduto();
		
		System.out.println(cp.obtemCompra());
	}

}
