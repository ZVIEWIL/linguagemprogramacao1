package geral;

public class Lugar {
	
	private String nome;
	private String cidade;
	private String estado;
	Boolean status;

	
	//construtor:
	public Lugar(String nome, String cidade, String estado) {
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.status = true;
		
	}
	
	//metodos de acesso do tipo setter:
	public void setnome(String n) {
		nome=n;
	}
	public void setcidade(String c) {
		cidade=c;
	}
	public void setestado(String e) {
		estado=e;
	}
	
	public void status (Boolean s) {
		status=s;
	}
	
	//metodos de acesso do tipo getter:
	public String getNome() {
		return nome;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public Boolean Status() {
		return status;
	}
	
	//metodos:
	
	//permitir o acesso:
	public void permitir_acesso() {
		System.out.println("Lugar Aberto ao publico");
		status = true;
	}
	
	//proibir o acesso:
	public void proibir_acesso() {
		System.out.println("Lugar Fechado ao publico");
		status = false;
	}
	
	//status do lugar:
		public void status() {
			if(status == false) {System.out.println("Lugar está fechado!");
			}
			else {System.out.println("Lugar está aberto!");		
			}		
		}
	
	//limpar local:
	public void manutencao() {
		if(status == false) {System.out.println("Realizando Manutenção/Limpeza no local");
		}
		else {System.out.println("O Lugar precisa estar fechado para realizar Manutenção/Limpeza");		
		}				
	}		
}	
	
	
	