package global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AgenciaTurismo {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		ArrayList<Conta> agenciaTurismo = new ArrayList<>();
		Map mapViagens = new HashMap();
		
		//criando clientes:
		Map mapCliente = new HashMap();
		Cliente cliente1 = new Cliente("Isaac", "Newton","111111111-11");
		mapCliente.put(cliente1.getCpf(),cliente1);
		Cliente cliente2 = new Cliente("Santos", "Dummont","222222222-22");
		mapCliente.put(cliente2.getCpf(),cliente2);
		Cliente cliente3 = new Cliente("Lionel","Messi","333333333-33");
		mapCliente.put(cliente3.getCpf(),cliente3);
		
		//criando lugares:
		Lugar lugar1 = new Lugar("Cabo Polonio","URUGUAY");
		Lugar lugar2 = new Lugar("Caminito","ARGENTINA");
		Lugar lugar3 = new Lugar("Arcos da Lapa","BRAZIL");
		
		
		
		
		
	}

}
