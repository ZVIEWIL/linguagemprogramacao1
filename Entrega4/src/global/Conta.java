package global;

public class Conta {
	private String numero;
	private Cliente cliente;	
	private double saldo;
	

	public Conta(String numero, Object cliente) {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.cliente = (Cliente) cliente;
		
		this.saldo = saldo;
	}
	
	//setters:
	
	public void setNumero (String nuc) {
		numero = nuc;
	}
	
	
	
	public void setSaldo (double sac) {
		saldo = sac;
	}
	
	public void setCliente (Cliente clc) {
		cliente = clc;
	}
	
	//getters:
	
	public String getNumero() {
		return numero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
	//metodos:
	
	void imprimeDados() {
		
		System.out.println("==============================================================================");
		System.out.println("DADOS PESSOAIS DO USUÁRIO: ");
		System.out.println("NUMERO DA CONTA: "+numero+" NOME: "+cliente.nome+" CPF: "+cliente.cpf+" SALDO: "+saldo);
		System.out.println("==============================================================================");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
