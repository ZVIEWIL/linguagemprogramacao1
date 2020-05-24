package geral;

public class Profissional {
	
	private String nomeProfissional;
	private String especialidade;
	private boolean epi;
	
	public Profissional(String nomeProfissional) {
		this.nomeProfissional = nomeProfissional;
		this.especialidade = null;
		this.epi = epi = false;
	}
	
	//metodos de acesso do tipo setter:	
	
	public void nomeProfissional(String np) {
		nomeProfissional=np;				
	}
	
	public void especialidade(String es) {
		especialidade=es;				
	}
	
	public void vaga(boolean epi) {
		epi=epi;				
	}
	
	//metodos de acesso do tipo getter:
	
	public String NomeProfissional() {
		return nomeProfissional;
			}
	
	public String Especialidade() {
		return especialidade;
			}
	
	public boolean Epi() {
		return epi;
			}
	
	//metodos:
	public void capacita(String area) {
		especialidade = area;
		System.out.println("Você está Apto a realizar atividades relacionadas a " + area);
		
	}
	
	public void candidatar(String oportunidade) {
		if (especialidade == oportunidade) { 
		System.out.println("Parabéns você conseguiu uma vaga na area de " + especialidade);		
		}
		else
			System.out.println("Antes de se candidatar, você precisa se capacitar para area de " + oportunidade);
	}
	
	public void colocar_epi() {
		epi = true;
		System.out.println("Colocando EPI's");	
	}
	
	public void trabalhar() {
		if (epi == true) { 
		System.out.println("Autorizado a realizar a atividade");		
		}
		else
			System.out.println("Coloque os EPI's");
	}
	

}
