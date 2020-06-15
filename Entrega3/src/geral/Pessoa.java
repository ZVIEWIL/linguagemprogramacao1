package geral;



public class Pessoa {
	
	
	
	private String nomePessoa;
	private Integer idade;
	private Double peso;
	private Double altura;
	private Integer cerveja;
	
	
	public Pessoa(String nomePessoa, Integer idade, Double peso, Double altura) {
		this.nomePessoa = nomePessoa;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.cerveja = 0;
		
	}
		
	//metodos de acesso do tipo setter:
		
	public void nomePessoa(String np) {
		nomePessoa=np;				
	}	
	public void idade(Integer i) {
		idade=i;				
	}	
	public void peso(Double p) {
		peso=p;
	}
	public void altura(Double a) {
		peso=a;
	}
	
	//metodos de acesso do tipo getter:
	
	public String getNomePessoa() {
		return nomePessoa;
	}
	public Integer getIdade() {
		return idade;
	}
	public Double getPeso() {
		return peso;
	}
	public Double getAltura() {
		return altura;
	}
	
		
	
		
	public void sair_de_casa() {		
		if (idade > 60) {
			System.out.println("sou do grupo de risco, só saia de casa em ultimo caso!");
		}
		else
			System.out.println("vou usar mascara e evitar aglomerações!");		
		}
	
	public void beber_cerveja() {		
		if (cerveja < 2 && idade >= 18) {
		cerveja+=1;		
		System.out.println("vou beber uma cerveja! ");
		}
		else {
			if(idade<18) {
				System.out.println("sou menor de idade, vou beber um suco!");				
			}
			else
				System.out.println("Já bebi duas cervejas, chega por hoje!");
		}	
		
	}
	
	public void dirigir() {		
		if (cerveja == 0 && idade >= 18) {			
		System.out.println("estou apto para dirigir!");
		}
		else {
			System.out.println("não posso dirigir, vou usar o aplicativo!");
		}	
		
	}
	
	public void comer() {
		double imc = peso/(altura*altura);
		if (imc >= 25) {			
		System.out.println("comer saladas e frutas");
		}
		else {
			System.out.println("comer pizzas e hamburgueres");
		}	
		
	}
	
	
}
	



