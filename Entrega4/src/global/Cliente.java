package global;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	
	public Cliente(String nome, String sobrenome, String cpf) {
		
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.cpf = cpf;
	}
	
	//setters
	public void setNome (String ncl) {
		sobrenome = ncl;
	}
	
	public void setSobrenome (String scl) {
		nome = scl;
	}
	
	public void setCpf (String ccl) {
		cpf = ccl;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getCpf () {
		return cpf;
	}
		
	
	
		
}
