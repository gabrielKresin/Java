package projeto;

import javax.swing.JOptionPane;

public class Suporte extends Cargo{

	//Método de desconto para o sindicato
	public void imposto(double salario) {

		//Realizar o calculo
		double total = salario*0.02;

		//Mensagem
		JOptionPane.showMessageDialog(null, "Cargo: Suporte\nDesconto: "+total);

	}
}
