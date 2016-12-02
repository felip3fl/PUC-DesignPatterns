package structural.facade2.Cliente;

public class Cliente implements ICliente{
	private String nome;
	private String telefone;
	private String endereco;
	
	
	public Cliente(String nome, String telefone, String endereco){
		
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		
	}
	public String getNome(){
		
		return nome;
	}
	
	public String getTelefone(){
		
		return telefone;
	}
	
	public String getEndereco(){
		
		return endereco;
	}
}
