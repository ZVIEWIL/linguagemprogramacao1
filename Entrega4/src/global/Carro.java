package global;

public class Carro {

	 private String cor;
	 private String modelo;
	 private String marca;
	 private String placa;
	 private int ano;
	 private double preco;

//construtor	
   public Carro(String marca, String Modelo){
	   this.modelo=Modelo;
	   this.marca=marca;
   }

   //métodos de acesso do tipo setter
    public void setCor(String c){
    	cor=c;
    }

    public void setAno(int a){
    	ano=a;
    }

    public void setPlaca(String p){
    	placa=p;
    }
    
    public void setPreco(Double pr){
    	preco=pr;
    }

    //método de acesso do tipo getter
    public int getAno(){
    	return ano;
    }
    
    public String getCor(){
    	return cor;
    }
    
    public String getMarca(){
    	return marca;
    }
    
    public String getModelo(){
    	return modelo;
    }

    public String getPlaca(){
    	return placa;
    }
    
    public Double getPreco(){
    	return preco;
    }
	//liga o carro
	public void ligar() {
	System.out.println("O carro está ligado");
	}

	//desliga o carro
	public	void desligar() {
			System.out.println("O carro na garagem! #Fique em casa com DEUS");
			}
	}
