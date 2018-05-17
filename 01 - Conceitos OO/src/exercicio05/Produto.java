package exercicio05;

import javax.swing.JOptionPane;

public class Produto {

	String nome;
	double valor;
	String tabela;
	
	public void laco() {
		int continuar = 0;
		do {
			pedeProduto();
			pedeValor();
			calculaPrecos();
			mostraDados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		} while (continuar == 0);
	}
	
	public void pedeProduto() {
		boolean valido = false;
		do {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome do produto");
				valido = true;
				if(nome.isEmpty()){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
	
	public void pedeValor() {
		boolean valido = false;
		do {
			try {
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
				valido = true;
				if (valor <= 0) {
					valido = false;
				}
				if(nome.isEmpty()){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
	
	public String calculaPrecos() {
		tabela = "\n1 x "+(valor*0.95)+" = "+(1*(valor*0.95));
		tabela += "\n2 x "+(valor*0.90)+" = "+(2*(valor*0.90));
		tabela += "\n3 x "+(valor*0.85)+" = "+(3*(valor*0.85));
		tabela += "\n4 x "+(valor*0.80)+" = "+(4*(valor*0.80));
		tabela += "\n5 x "+(valor*0.75)+" = "+(5*(valor*0.75));
		tabela += "\n6 x "+(valor*0.70)+" = "+(6*(valor*0.70));
		tabela += "\n7 x "+(valor*0.65)+" = "+(7*(valor*0.65));
		tabela += "\n8 x "+(valor*0.60)+" = "+(8*(valor*0.60));
		tabela += "\n9 x "+(valor*0.55)+" = "+(9*(valor*0.55));
		tabela += "\n10 x "+(valor*0.50)+" = "+(10*(valor*0.50));
		return tabela;
	}
	
	public void mostraDados() {
		String msg = "Produto: "+nome;
		msg += "\nValor: "+valor;
		msg += "\n\nTabela de preços";
		msg += tabela;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
