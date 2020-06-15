package geral;

public class Calcado {
	
	private String modeloCalcado;	
	private String marcaCalcado;
	private int numeroCalcado;
	private String corCalcado;
		
	
	
	public Calcado (){
		this.marcaCalcado = marcaCalcado;
		this.modeloCalcado = modeloCalcado;
		this.numeroCalcado = numeroCalcado;		
		this.corCalcado = corCalcado;
		
		
		
	}
		
	
		//metodos de acesso do tipo setter:	
	
		public void modeloCalcado(String mc) {
			modeloCalcado=mc;				
		}	
		
		public void numeroCalcado(int nc) {
			numeroCalcado=nc;				
		}		
				
		public void marcaCalcado(String ms) {
			modeloCalcado=ms;				
		}
		
		public void corCalcado(String ec) {
			corCalcado=ec;				
		}	
		
		
		//metodos de acesso do tipo getter:
		
		public String ModeloCalcado() {
			return modeloCalcado;
		}
		
		public int NumeroCalcado() {
			return numeroCalcado;
		}
					
		public String getMarcaCalcado() {
			return marcaCalcado;
		}
		
		public String getCorCalcado() {
			return corCalcado;
		}
		
				
		//metodos:
		
		public void escolher_marca(String marca) {
			if(marca==null) {
				System.out.println("Escolha uma marca!");				
			}
			else
				System.out.println("marca: " + marca);
				marcaCalcado = marca;
		};
		
		
		public void escolher_modelo(String modelo) {
			if(modelo==null) {
				System.out.println("Escolha um modelo!");				
			}
			else			
				System.out.println("modelo: " + modelo);				
				modeloCalcado = modelo;			
		};
		
		 public void escolher_numero(String numero) {		 //coloquei string por que inteiro vazio deu erro??
			 if(numero != null) {
				 numeroCalcado = Integer.parseInt(numero);				 
				 System.out.println("numero: " + numeroCalcado);			 					
			 }
			 else
				 System.out.println("Escolha um numero!");
			 	
				
		};
		
		public void escolher_cor(String cor) {			
			if(cor==null) {
				System.out.println("Escolha uma cor!");				
			}
			else				
				System.out.println("cor: " + cor);
				corCalcado = cor;				
			};
		
		public void comprar() {
			
			if (modeloCalcado!=null&&marcaCalcado!=null&&corCalcado!=null&&numeroCalcado!=0) {
				System.out.println("voce acabou de comprar um calçado da marca: "+ marcaCalcado + " ,modelo: "+modeloCalcado+ " ,numero: "+numeroCalcado+" ,cor: "+corCalcado);
			}
			else {
				System.out.println("compra não concluida, cadastro incompleto!");
			}
				
			
	}
		
		
}
		
		


	