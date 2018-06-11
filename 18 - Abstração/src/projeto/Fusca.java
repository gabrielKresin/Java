package projeto;

import javax.swing.JOptionPane;

public class Fusca extends Padrao{

	@Override
	public void imposto(double valor) {
		
		JOptionPane.showMessageDialog(null, valor*0.30);
		
	}

}
