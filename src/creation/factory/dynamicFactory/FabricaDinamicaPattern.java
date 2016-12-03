package creation.factory.dynamicFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FabricaDinamicaPattern {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Produto tenis = (Produto) FabricaDeTenis.getTenis(Produto.class);

		Produto sapato = new Sapato();  // Pode fabricar diretamente, nao eh o foco do exercicio!!! :)
	
		System.out.println(tenis.getInfo());
		System.out.println(sapato.getInfo());
		
	}

}
