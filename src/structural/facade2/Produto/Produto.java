package structural.facade2.Produto;

public class Produto implements IProduto{
	private String nProduto;
	private double price;
	private String codigo;
	public Produto(String codigo, String nProduto, double price){
		this.nProduto = nProduto;
		this.price = price;
		this.codigo = codigo;
	}
	
	public String getNProduto(){
		
		return this.nProduto;
	}
	
	public double getPrice(){
		
		return this.price;
	}
	
	public String getCodigo(){
		
		return this.codigo;
	}
}
