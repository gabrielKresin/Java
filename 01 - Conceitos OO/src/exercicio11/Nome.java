package exercicio11;

import javax.swing.JOptionPane;

public class Nome {

	String nome = "";
	String nomes = "";
	String nomesE = "";
	int quantNomes = 0;

	public void laco() {
		int continuar = 0;
		do {
			pedeNome();
			concatenaNomes();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja informar mais um nome?");
		} while (continuar == 0);
		mostrarDados();
	}

	public void pedeNome() {
		boolean valido = false;
		do {
			try {
				nome = JOptionPane.showInputDialog("Digite um nome");
				valido = true;
				if (nome.isEmpty()) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);

		quantNomes++;
	}

	public void concatenaNomes() {
		if(quantNomes==1){
			nomes += nome;
		}else{
			nomesE = "";
			nomesE+= nomes+" e "+nome;
			nomes = nomes + ","+nome;  
		}
	}

	public void mostrarDados() {
		String msg = "";
		if(quantNomes == 1){
			msg = nomes;
		}else{
			msg = nomesE;
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
