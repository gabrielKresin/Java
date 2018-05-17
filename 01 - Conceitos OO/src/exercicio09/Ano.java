package exercicio09;

import javax.swing.JOptionPane;

public class Ano {

	int ano;
	double resultado;
	String situacao;
	
	public void laco() {
		int continuar = 0;
		do {
			pedeAno();
			calculaVerificaAno();
			mostrarDados();
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		} while (continuar == 0);
	}
	
	public void pedeAno() {
		boolean valido = false;
			do {
				try {
					ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
					valido = true;
				} catch (Exception e) {
					valido = false;
					JOptionPane.showMessageDialog(null, "Erro");
				}
			} while (valido == false);
	}
	
	public String calculaVerificaAno() {
		if (ano%4 == 0) {
			situacao = "O ano é bissexto";
		}else{
			situacao = "O ano não é bissexto";
		}
		return situacao;
	}
	
	public void mostrarDados() {
		String msg = situacao;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
