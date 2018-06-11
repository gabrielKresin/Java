package projeto;

import javax.swing.JOptionPane;

public class Gerente implements Padrao{

	@Override
	public void descontoVR(double salario) {
		
		JOptionPane.showMessageDialog(null, salario*0.10);
		
	}

}
