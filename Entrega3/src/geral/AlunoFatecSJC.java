package geral;



public class AlunoFatecSJC {
	
	private String nomeAluno;	
	private String cursoAluno;
	private boolean vestibular;
	private int semestre;	
	
	
	public AlunoFatecSJC (String nomeAluno, String cursoAluno) {
		this.nomeAluno = nomeAluno;
		this.cursoAluno = cursoAluno;
		this.vestibular = vestibular = false;
		this.semestre = semestre;		
	}
	
	//metodos de acesso tipo setter:	
	public void nomeAluno(String na) {
		nomeAluno = na; 
	}	
	public void cursoAluno(String ca) {
		cursoAluno = ca; 
	}	
	public void semestre(int se) {
		semestre = se; 
	}
	public void vestibular(boolean ma) {
		vestibular = ma; 
	}
	
	
	
	//metodos de acesso do tipo getter:		
	public String getNomeAluno() {
		return nomeAluno;
	}
	public String getCursoAluno() {
		return cursoAluno;
	}
	public int getRaSemestre() {
		return semestre;
	}
	public boolean getVestibular() {
		return vestibular;
	}
	
	
	
	void passar_vestibular() {		
		vestibular = true;
		System.out.println("Parabéns "+ nomeAluno +" você foi aprovado no curso de "+ cursoAluno );
		}
	
	void fazer_matricula() {		
		if(vestibular == true) {
			System.out.println( nomeAluno +" foi realizada sua matricula para o curso de "+ cursoAluno );			
			}
		else
			System.out.println("nome não encontrado na lista de aprovados");		
		}
	
	void concluir_semestre() {
		semestre += 1;
		System.out.println(nomeAluno + " você concluiu o "+ semestre +"° semestre!");
		
		}
			
	void pegar_diploma() {	
		int semestresAconcluir = 6 - semestre;
		if (semestre == 6) {
			System.out.println(nomeAluno + " Parabéns, você concluiu o curso de "+ cursoAluno +"!!");
			}
		else			
			System.out.println(nomeAluno + "falta "+semestresAconcluir+" semestres para você pegar o diploma, enquanto isso estude!!");
		
		}	
	
	}
		

	


		
	
	
		
		
		
	


