package projeto;

import javax.swing.JOptionPane;

public class Dba extends Cargo{

	//Método de desconto para o sindicato
	public void imposto(double salario) {

		//Realizar o calculo
		double total = salario*0.08;

		//Mensagem
		JOptionPane.showMessageDialog(null, "Cargo: DBA\nDesconto: "+total);

	}
}
