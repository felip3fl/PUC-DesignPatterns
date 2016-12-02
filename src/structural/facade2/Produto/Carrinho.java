package structural.facade2.Produto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho implements ICarrinho{
	private List<IProduto> listaDeProdutos=null;
	
	public Carrinho(){
		
		listaDeProdutos = new ArrayList<IProduto>();
	}
	
	public void setProduto(IProduto produto){
		
			listaDeProdutos.add(new Integer(produto.getCodigo()),produto);
		
		
	}
	
	public List<IProduto> getlistaDeProdutos(){
		return listaDeProdutos;
	}
}
