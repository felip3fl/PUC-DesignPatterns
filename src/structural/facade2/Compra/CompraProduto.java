package structural.facade2.Compra;

import structural.facade2.Cliente.*;
import structural.facade2.Produto.*;

public class CompraProduto implements ICompraProduto{
	
	private ICliente cliente;
	private IProduto produto;
	private ICarrinho carrinho;
	
	public CompraProduto(){
		
		cliente = new Cliente("Sr. Oscar Amujo","5555-5555","Rua dos Caracois, 300");
		carrinho = new Carrinho();
		produto = new Produto("0","Camisa Polo",45.00);
		carrinho.setProduto(produto);
		produto = new Produto("1","Calca Jeans",90.00);
		carrinho.setProduto(produto);
		produto = new Produto("2","Camisa Xadrez",50.00);
		carrinho.setProduto(produto);
		produto = new Produto("3","Sapato Preto",120.00);
		carrinho.setProduto(produto);
	
	}

	public String obtemCompra(){
		
		String scliente = "Cliente: "+ cliente.getNome()+"\n"+"Telefone: "+cliente.getTelefone()+"\n"+"Endereco: "+cliente.getEndereco()+"\n";
		String listaDeProdutos=null;
		
		listaDeProdutos = new String("\nProdutos Comprados: \n\n");
		for(int i = 0;i<carrinho.getlistaDeProdutos().size();i++){
			
			produto = (IProduto) carrinho.getlistaDeProdutos().get(i);
			listaDeProdutos = listaDeProdutos.concat("Codigo: "+produto.getCodigo()+"\n");
			listaDeProdutos = listaDeProdutos.concat("Produto: "+produto.getNProduto()+"\n");
			listaDeProdutos = listaDeProdutos.concat("Preco: "+produto.getPrice()+"\n");
			listaDeProdutos = listaDeProdutos.concat("\n");
		}
		
	return scliente.concat(listaDeProdutos); 
	}
}
