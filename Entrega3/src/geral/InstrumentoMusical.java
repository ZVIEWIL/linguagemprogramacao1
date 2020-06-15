package geral;

public class InstrumentoMusical {
	
	private String nomeInstrumento;
	private String marcaInstrumento;
	private Boolean afinacaoInstrumento;	
	private Boolean limpezaInstrumento;	
	
	public InstrumentoMusical(String nomeInstrumento, String marcaInstrumento) {
		
		this.nomeInstrumento = nomeInstrumento;
		this.marcaInstrumento = marcaInstrumento;
		this.afinacaoInstrumento = afinacaoInstrumento = false; //geralmente se afina o instrumento antes de tocar por isso ele não está afinado inicialmente!
		this.limpezaInstrumento = limpezaInstrumento = true; //geralmente se limpa o instrumento depois do uso para evitar oxidação devido o acído úrico!		
	}
	
	//metodos de acesso tipo setter:	
		public void nomeInstrumento(String ni) {
			nomeInstrumento = ni; 
		}
		public void marcaInstrumento(String mi) {
			marcaInstrumento = mi; 
		}		
		public void afinacaoInstrumento(boolean ai) {
			afinacaoInstrumento = ai; 
		}
		public void limpezaInstrumento(boolean li) {
			limpezaInstrumento = li; 
		}
		
	//metodos de acesso tipo getter:
		public String getNomeInstrumento() {
			return nomeInstrumento;
		}
		public String getMarcaInstrumento() {
			return marcaInstrumento;
		}		
		public boolean getAfinacaoInstrumento() {
			return afinacaoInstrumento;
		}
		public boolean getLimpezaInstrumento() {
			return limpezaInstrumento;
		}
		
	//metodos:						
		void afinar_instrumento() {
			if (afinacaoInstrumento == false) {
				System.out.println("afinando o instrumento!");
				afinacaoInstrumento = true;
			}
			else
				System.out.println("instrumento já está afinado!");
							
		}
		
		void tocar_instrumento() {
			if (afinacaoInstrumento == false) {
				System.out.println("afinar o instrumento antes de tocar!");
			}
			else
				System.out.println("tocando rock'n roll!");
				limpezaInstrumento = false;
		}
		
		void limpar_instrumento() {
			if (limpezaInstrumento == false) {
				limpezaInstrumento = true;
				System.out.println("foi feita a limpeza do instrumento!");
			}
			else
				System.out.println("instrumento já está limpo!");
		}
		
		void guardar_instrumento() {
			if (limpezaInstrumento == false) {
				System.out.println("limpar o instrumento antes de guardar!");
			}
			else
				System.out.println("instrumento guardado!");
		}
		
		
		
}
