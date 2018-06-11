package projeto;

import javax.swing.JOptionPane;

public class Ferrari extends Padrao{

	@Override
	public void imposto(double valor) {
		
		JOptionPane.showMessageDialog(null, valor*0.05);
		
	}

}
