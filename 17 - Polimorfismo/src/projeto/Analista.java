package projeto;

import javax.swing.JOptionPane;

public class Analista extends Cargo{

	//M�todo de desconto para o sindicato
	public void imposto(double salario) {
		
		//Realizar o calculo
		double total = salario*0.05;
		
		//Mensagem
		JOptionPane.showMessageDialog(null, "Cargo: Analista\nDesconto: "+total);
		
	}
	
}
