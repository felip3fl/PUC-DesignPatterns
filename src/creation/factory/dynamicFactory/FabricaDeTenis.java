package creation.factory.dynamicFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FabricaDeTenis{
			
		private FabricaDeTenis(){}

		public static Produto getTenis(Class<Produto> refTenis) throws FileNotFoundException, IOException {
		
			String nomeClasse = (MetadataReader.loadClass()).getProperty(refTenis.getName());
									
			if(nomeClasse == null) {
				throw new IllegalArgumentException("Interface nao configurada");
			}
			try {
			
				@SuppressWarnings("rawtypes")
				Class clazz = Class.forName(nomeClasse);
			    if (refTenis.isAssignableFrom(clazz)) {
				   return (Produto) clazz.newInstance();
			} else {
				throw new IllegalArgumentException("Classe configurada nao implementa a interface");
			}
			} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Classe configurada nao existe",e);
			} catch (Exception e) {
			throw new IllegalArgumentException("Nao foi possivel criar a implementacao",e);
			
		}

		}
				
}
