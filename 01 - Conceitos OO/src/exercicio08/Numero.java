package exercicio08;

import javax.swing.JOptionPane;

public class Numero {

	int num;
	String antecessores;
	String sucessores;
	
	public void laco() {
		int continuar = 0;
		do {
			pedeNumero();
			antecessores();
			sucessores();
			mostrarDados();
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		} while (continuar == 0);
	}
	
	public void pedeNumero() {
		boolean valido = false;
		do {
			try {
				num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				valido = true;
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
	
	public String antecessores() {
		antecessores = (num-10)+","+(num-9)+","+(num-8)+","+(num-7)+","+(num-6)+","+(num-5)+","+(num-4)+","+(num-3)+","+(num-2)+","+(num-1)+",";
		return antecessores;
	}
	
	public String sucessores() {
		sucessores = (num+1)+","+(num+2)+","+(num+3)+","+(num+4)+","+(num+5)+","+(num+6)+","+(num+7)+","+(num+8)+","+(num+9)+","+(num+10)+",";
		return sucessores;
	}
	
	public void mostrarDados() {
		String msg = antecessores+""+num+","+sucessores;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
