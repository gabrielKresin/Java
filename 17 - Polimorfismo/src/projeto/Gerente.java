package projeto;

import javax.swing.JOptionPane;

public class Gerente extends Cargo{
	
	//M�todo de desconto para o sindicato
	public void imposto(double salario) {

		//Realizar o calculo
		double total = salario*0.10;

		//Mensagem
		JOptionPane.showMessageDialog(null, "Cargo: Gerente\nDesconto: "+total);

	}
}
