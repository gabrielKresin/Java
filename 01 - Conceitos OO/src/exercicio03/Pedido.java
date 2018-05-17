package exercicio03;

import javax.swing.JOptionPane;

public class Pedido {

	int id;
	double total;
	int quant;
	double troco;
	double dinheiro;

	public void laco() {

		int continuar = 0;

		do {
			pedeCodigo();
			verificaProduto();
			pedeQuantidade();
			calculaTotal();
			pedeDinheiro();
			calculaTroco();
			mostraDados();
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		} while (continuar == 0);
	}

	public void pedeCodigo() {
		boolean valido = false;
		do {
			try {
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
				valido = true;
				if((id < 1) || (id > 7)){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public void verificaProduto() {
		switch (id) {
		case 1:
			total = 5;
			break;
		case 2:
			total = 4.5;
			break;
		case 3:
			total = 8;
			break;
		case 4:
			total = 12;
			break;
		case 5:
			total = 16.5;
			break;
		case 6:
			total = 1;
			break;
		case 7:
			total = 2.5;
			break;
		}
	}

	public void pedeQuantidade() {
		boolean valido = false;
		do {
			try {
				quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto"));
				valido = true;
				if(quant < 1){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public double calculaTotal() {
		total = total*quant;
		return total;
	}

	public void pedeDinheiro() {
		boolean valido = false;
		do {
			try {
				dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de dinheiro:\n"+"Total: "+total));
				valido = true;
				if(dinheiro < total){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public double calculaTroco() {

		troco = dinheiro - total;
		return troco;
	}
	
	public void mostraDados(){

		String msg = "Total: "+total;
		msg += "\nDinheiro: "+dinheiro;
		msg += "\nTroco: "+troco;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
