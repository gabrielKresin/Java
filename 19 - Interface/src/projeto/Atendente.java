package projeto;

import javax.swing.JOptionPane;

public class Atendente implements Padrao{

	@Override
	public void descontoVR(double salario) {
		
		JOptionPane.showMessageDialog(null, salario*0.05);
		
	}

}
