package geral;

public class RealizarTestes {
	
	public static void main (String[] args) {	
		
		String[] nome = new String[5];
		String[] cidade = new String[5];
		String[] estado = new String[5];		
		
		nome[0] = "Pedra do Baú";
		nome[1] = "Machadão";
		nome[2] = "Pirâmide";
		nome[3]= "Opera de Arame";
		nome[4] = "Corcovado";		
		
		cidade[0] = "São Bento do Sapucaí";
		cidade[1] = "Paraisópolis";
		cidade[2] = "São Thomé das Letras";
		cidade[3] = "Curitiba";
		cidade[4] = "Rio de Janeiro";	
		
		estado[0] = "SP";
		estado[1]= "MG";
		estado[2]= "MG";
		estado[3]= "PR";
		estado[4] = "RJ";
		
		
		int i = 0;
		Lugar[] novolugar = new Lugar[5];                                                                     //criando o vetor para testar a classe Lugar
		
		System.out.println("Iniciando os testes da classe Lugar!! \n \n");
		
		while(i<=0) {		
			novolugar[i] = new Lugar(nome[i],cidade[i],estado[i]);	                                              // criando o lugar
			System.out.println(novolugar[i].getNome()+" "+novolugar[i].getCidade()+" "+novolugar[i].getEstado()); // imprimindo o nome, cidade e estado do Lugar		
			novolugar[i].status();                                                                                // status do lugar
			novolugar[i].manutencao();	                                                                          // metodo fazer manutenção, como o lugar está aberto é solicitado para fechar o lugar
			novolugar[i].proibir_acesso();                                                                        // fechando o lugar para manutenção
			novolugar[i].status();                                                                                // status do lugar
			novolugar[i].manutencao();	                                                                          // realizando a manutenção
			novolugar[i].permitir_acesso();                                                                       // liberando o acesso para visitas	
			novolugar[i].status();                                                                                // status do lugar
			i += 1;
			System.out.println("\n");
		}
		
		System.out.println("\n \nEncerrando os testes da classe Lugar!! \n \n");
		
		
		
		String[] nomePessoa = new String[5];
		Integer[] idade = new Integer[5];
		double[] peso = new double[5];
		double[] altura = new double[5];
		
		nomePessoa [0]="João";
		nomePessoa [1]="Maria";
		nomePessoa [2]="José";
		nomePessoa [3]="Lucas";
		nomePessoa [4]="Moisés";
		
		idade [0]=18;
		idade [1]=20;
		idade [2]=61;
		idade [3]=4;
		idade [4]=60;
		
		peso [0]=76;
		peso [1]=67;
		peso [2]=95;
		peso [3]= 34;
		peso [4]=120;
		
		altura [0]=1.82;
		altura [1]=1.56;
		altura [2]=1.82;
		altura [3]=1.20;
		altura [4]=1.88;
		
		int j = 0;
		Pessoa[] novaPessoa = new Pessoa[5];
		
		System.out.println("\n \nIniciando os testes da classe Pessoa!! \n \n");
		
		while(j<=4) {
			
			novaPessoa[j] = new Pessoa(nomePessoa[j],idade[j],peso[j],altura[j]);
			System.out.println("nome: "+novaPessoa[j].getNomePessoa()+" idade: "+novaPessoa[j].getIdade()+" anos peso: "+novaPessoa[j].getPeso()+" kg altura: "+novaPessoa[j].getAltura()+" metros");
			novaPessoa[j].sair_de_casa();
			novaPessoa[j].dirigir();
			novaPessoa[j].beber_cerveja();
			novaPessoa[j].beber_cerveja();
			novaPessoa[j].beber_cerveja();
			novaPessoa[j].dirigir();
			novaPessoa[j].comer();
			System.out.println("\n");			
			j += 1;
			
		}
		
		System.out.println("\n \nEncerrando os testes da classe Pessoa!! \n \n");
		

		String[] nomeInstrumento = new String[5];
		String[] marcaInstrumento = new String[5];
		
		nomeInstrumento[0] = "guitarra";
		nomeInstrumento[1] = "violão";
		nomeInstrumento[2] = "baixo";
		nomeInstrumento[3] = "violino";
		nomeInstrumento[4] = "bateria";
		
		marcaInstrumento[0] = "fender";
		marcaInstrumento[1] = "tonante";
		marcaInstrumento[2] = "squire";
		marcaInstrumento[3] = "gianinni";
		marcaInstrumento[4] = "mapex";
		
		int k = 0;
		InstrumentoMusical[] novoInstrumentoMusical = new InstrumentoMusical[5];
		
		System.out.println("\n \nIniciando os testes da classe InstrumentoMusical!! \n \n");
		
		while(k<=4) {
			novoInstrumentoMusical[k] = new InstrumentoMusical(nomeInstrumento[k],marcaInstrumento[k]);
			System.out.println("nome: "+novoInstrumentoMusical[k].getNomeInstrumento()+" marca: "+novoInstrumentoMusical[k].getMarcaInstrumento());
			novoInstrumentoMusical[k].tocar_instrumento(); //como o instrumento está desafinado, precisamos afinar antes de tocar
			novoInstrumentoMusical[k].afinar_instrumento();//afinando o instrumento
			novoInstrumentoMusical[k].tocar_instrumento();// agora sim podemos tocar
			novoInstrumentoMusical[k].guardar_instrumento();//sempre precisamos limpar os instrumentos antes de guardar, evitando oxidações
			novoInstrumentoMusical[k].limpar_instrumento();//limpando o instrumento
			novoInstrumentoMusical[k].guardar_instrumento();//instrumento guardado ok			
			System.out.println("\n");
			k += 1;		
															
		}	
		
		System.out.println("\n \nEncerrando os testes da classe InstrumentoMusical!! \n \n");
		
		String[] marcaSapato = new String[5];
		String[] modeloSapato = new String[5];
		String[] corSapato = new String[5];		
		String[] numeroSapato = new String[5];		
		
		marcaSapato [0]="nike";
		marcaSapato [1]="Globe";
		marcaSapato [2]="Nike";
		marcaSapato [3]="Qix";
		marcaSapato [4]="Adidas";
		
		
		modeloSapato [1]="ENCORE";
		modeloSapato [2]="SOLAR";
		modeloSapato [3]="EVOLUTION";
		modeloSapato [4]="SUPERTAR";
		
		
		corSapato [1]="BRANCO";
		corSapato [2]="MARRON";
		corSapato [3]="AZUL";
		corSapato [4]="PRETO";		
		
		
		numeroSapato [1]="43"; //coloquei em string por que quando o metodo recebe um inteiro vazio deu erro no programa
		numeroSapato [2]="40";
		numeroSapato [3]="38";
		numeroSapato [4]="39";
		
		int l = 0;
		Calcado[] novoCalcado = new Calcado[5];			
		
		System.out.println("\n \nIniciando os testes da classe Calcados!! \n \n");
		
		while (l<=4) {			
			novoCalcado[l] = new Calcado ();
			novoCalcado[l].escolher_marca(marcaSapato [l]);
			novoCalcado[l].escolher_modelo(modeloSapato [l]);
			novoCalcado[l].escolher_numero(numeroSapato [l]);
			novoCalcado[l].escolher_cor(corSapato [l]);
			novoCalcado[l].comprar();
			System.out.println("\n");			
			l +=1;
		
		}
		
		System.out.println("\n \nEncerrando os testes da classe Calcado!! \n \n");
		
		String[] nomeProfissional = new String[5];
		String[] especialidade = new String[5];
		boolean[] epi = new boolean[5];		
		
		nomeProfissional[0] = "José";
		nomeProfissional[1] = "Maria";
		nomeProfissional[2] = "Rafael";
		nomeProfissional[3] = "Julius";
		nomeProfissional[4] = "Thamyris";
		
		especialidade[0] = "Eletrica";
		especialidade[1] = "Enfermagem";
		especialidade[2] = "Mecanica";
		especialidade[3] = "Soldador";
		especialidade[4] = "Gastronomia";
		
		
		int m = 0;
		Profissional[] novoProfissional = new Profissional [5];
		
		System.out.println("\n \nIniciando os testes da classe Profissional!! \n \n");
		
		while (m<=4) {
			novoProfissional[m] = new Profissional (nomeProfissional[m]);
			novoProfissional[m].candidatar(especialidade[0]);
			novoProfissional[m].capacita(especialidade[0]);
			novoProfissional[m].candidatar(especialidade[0]);
			novoProfissional[m].trabalhar();
			novoProfissional[m].colocar_epi();
			novoProfissional[m].trabalhar();
			System.out.println("\n");
			m += 1;			
			
		}
		
		System.out.println("\n \nEncerrando os testes da classe Profissional!! \n \n");
		
		
		String[] nomeAluno = new String[5];
		String[] cursoAluno = new String[5];
				
		
		nomeAluno[0] = "Hebert";
		nomeAluno[1] = "Filomena";
		nomeAluno[2] = "Sebastião";
		nomeAluno[3] = "Paulo";
		nomeAluno[4] = "Cristovão";
		
		cursoAluno[0] = "Banco de Dados";
		cursoAluno[1] = "Análise e Desenvolvimento de Sistemas";
		cursoAluno[2] = "Logística";
		cursoAluno[3] = "Manutenção de Aeronaves";
		cursoAluno[4] = "Gestão da Produção Industrial";
		
		
		int n = 0;
		AlunoFatecSJC[] novoAlunoFatecSJC = new AlunoFatecSJC[5];
		
		System.out.println("\n \nIniciando os testes da classe AlunoFatecSJC!! \n \n");
		
		while (n<=4) {			
			novoAlunoFatecSJC[n] = new AlunoFatecSJC (nomeAluno[n],cursoAluno[n]);			
			novoAlunoFatecSJC[n].fazer_matricula();
			novoAlunoFatecSJC[n].passar_vestibular();
			novoAlunoFatecSJC[n].fazer_matricula();
			novoAlunoFatecSJC[n].pegar_diploma();
			novoAlunoFatecSJC[n].concluir_semestre();
			novoAlunoFatecSJC[n].pegar_diploma();
			novoAlunoFatecSJC[n].concluir_semestre();
			novoAlunoFatecSJC[n].pegar_diploma();
			novoAlunoFatecSJC[n].concluir_semestre();
			novoAlunoFatecSJC[n].pegar_diploma();
			novoAlunoFatecSJC[n].concluir_semestre();
			novoAlunoFatecSJC[n].pegar_diploma();
			novoAlunoFatecSJC[n].concluir_semestre();
			novoAlunoFatecSJC[n].pegar_diploma();
			novoAlunoFatecSJC[n].concluir_semestre();
			novoAlunoFatecSJC[n].pegar_diploma();
			
			System.out.println("\n");
			n += 1;			
			
		}
		
		System.out.println("\n \nEncerrando os testes da classe AlunoFatecSJC!! \n \n");
												
	}

}
