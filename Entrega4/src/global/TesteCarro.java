package global;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class TesteCarro {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Carro> concessionaria = new ArrayList<Carro>();
		Carro car;
		Map mapCarros = new HashMap();
		
		//LISTANDO OS CARROS: 		
		for (int i = 0;i<1;i++)
		{			
			car = new Carro(JOptionPane.showInputDialog("Digite a marca: "),
					JOptionPane.showInputDialog("Digite o modelo: "));
			car.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano: ")));
			car.setCor(JOptionPane.showInputDialog("Digite a Cor: "));
			car.setPlaca(JOptionPane.showInputDialog("Digite a Placa: "));
			car.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço: ")));
			concessionaria.add(car);
			mapCarros.put(car.getPlaca(),car);	
			
		}
		
		//IMPRIMINDO A TABELA DE PREÇOS:		
		System.out.println("IMPRIMIR TABELA DE PREÇOS: ");	
		for (int i = 0; i<concessionaria.size();i++)
		{			
			car=(Carro)concessionaria.get(i);
			System.out.println(" MODELO: "+car.getModelo()+" MARCA: "+car.getMarca()+" ANO: "+car.getAno()+
							   " COR: "+car.getCor()+" PLACA: "+car.getPlaca()+" PREÇO: R$"+car.getPreco());
		}
		
		//MOSTRAR OS DADOS DO CARRO A PARTIR DA PLACA:
		System.out.println("MOSTRAR DADOS DO CARRO A PARTIR DA PLACA: ");
		Carro pesquisa = (Carro) mapCarros.get(JOptionPane.showInputDialog("Digite a Placa: "));
		System.out.println(" MODELO: "+pesquisa.getModelo()+" MARCA: "+pesquisa.getMarca()+" ANO: "+pesquisa.getAno()+
				   " COR: "+pesquisa.getCor()+" PLACA: "+pesquisa.getPlaca()+" PREÇO: R$"+pesquisa.getPreco());
		
	}
	
	
}
