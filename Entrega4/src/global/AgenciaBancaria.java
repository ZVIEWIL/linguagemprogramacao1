package global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
public class AgenciaBancaria {				

	public static void main(String[] args) {
		ArrayList<Conta> agenciaBancaria = new ArrayList<>();
		Map mapContas = new HashMap();
		
		//criando clientes:
		Map mapCliente = new HashMap();
		Cliente cliente1 = new Cliente("Isaac", "Newton","111111111-11");
		mapCliente.put(cliente1.getCpf(),cliente1);
		Cliente cliente2 = new Cliente("Santos", "Dummont","222222222-22");
		mapCliente.put(cliente2.getCpf(),cliente2);
		Cliente cliente3 = new Cliente("Lionel","Messi","333333333-33");
		mapCliente.put(cliente3.getCpf(),cliente3);
		
		//criando e adicionando as contas na agência:
		Conta conta;
		for(int i = 0; i<3;i++) {			
			conta = new Conta(JOptionPane.showInputDialog("Digite o Numero: "), 
					mapCliente.get(JOptionPane.showInputDialog("Digite o CPF: ")));			
			conta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o Saldo: ")));
			agenciaBancaria.add(conta);
			mapContas.put(conta.getCliente(),conta);

		}
		
		//deletando uma conta da agência:
		Conta deletar = (Conta) mapContas.get(mapCliente.get(JOptionPane.showInputDialog
				("***DELETAR CONTA*** \nDigite o CPF: ")));
		agenciaBancaria.remove(deletar);
		
		//imprimindo todas as contas da agencia:
		for(int i = 0; i<agenciaBancaria.size();i++) {
			conta=(Conta)agenciaBancaria.get(i);
			conta.imprimeDados();				
		}
		
		//mostrar dados pessoais da conta através do cpf:		
		Conta pesquisa = (Conta) mapContas.get(mapCliente.get(JOptionPane.showInputDialog
				("***LOCALIZAR CONTA*** \nDigite o CPF: ")));
		pesquisa.imprimeDados();
		

	}

}
