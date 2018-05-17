package exercicio01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Banco {

	ArrayList<Double> conta = new ArrayList<>();
	ArrayList<String> extratos = new ArrayList<>();
	String extratosAux = "";
	Object[] opcoes = {"Depositar", "Sacar", "Extrato", "Saldo", "Sair do Sistema", "Trocar de usuário"};
	Object escolha = "";
	int id = 0;

	public void laco() {
		do {
			if (escolha.equals("Sair do Sistema")) {
				break;
			}
			pedeID();
			if(id == -1){
				break;
			}
			do{
				pedeOpcao();
				verificaOpcao();
				if (escolha.equals("Sair do Sistema")) {
					break;
				}
				if (escolha.equals("Trocar de usuário")) {
					break;
				}
			}while((!escolha.equals("Sair do Sistema")) || (!escolha.equals("Trocar de usuário")));
		} while (!escolha.equals("Sair do Sistema"));
	}

	public void pedeID() {
		boolean valido = false;
		do {
			try {
				id = Integer.parseInt(JOptionPane.showInputDialog("Digite seu id(digite -1 para sair):"));
				valido = true;
				if (id < -1) {
					valido = false;
				}
				if(id > conta.size()){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public void pedeOpcao() {
		boolean valido = false;
		do {
			try {
				escolha = JOptionPane.showInputDialog(null, "Selecione uma opção", "Caixa eletrônico", JOptionPane.PLAIN_MESSAGE, null, opcoes, "");
				valido = true;
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public void verificaOpcao() {
		switch (String.valueOf(escolha)) {
		case "Depositar":
			depositar();
			break;
		case "Sacar":
			sacar();
			break;
		case "Extrato":
			extrato();
			break;
		case "Saldo":
			saldo();
			break;
		case "Sair do Sistema":
			extratos.add(id, extratosAux);
			break;
		case "Trocar de usuário":
			extratos.add(id, extratosAux);
			extratosAux = "";
			break;
		}
	}

	public void depositar() {
		double valor = 0;
		double novoSaldo = 0;
		boolean valido = false;
		do {
			try {
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito"));
				valido = true;
				if (valor <= 0) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		if(conta.size() >= 1){
			novoSaldo = conta.get(id) + valor;
			conta.add(id, novoSaldo);
		}else{
			conta.add(id, valor);
		}
		extratosAux += "Depósito: "+valor+"\n";
	}

	public void sacar() {
		double valor = 0;
		double novoSaldo;
		boolean valido = false;
		do {
			try {
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
				valido = true;
				if (valor <= 0) {
					valido = false;
				}
				if (valor > conta.get(id)) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		novoSaldo = conta.get(id) - valor;
		conta.add(id, novoSaldo);
		extratosAux += "Saque: "+novoSaldo+"\n";
	}

	public void extrato() {
		String aux = "*******Extratos********\n\n";
		aux += extratosAux;
		JOptionPane.showMessageDialog(null, aux);
	}

	public void saldo() {
		JOptionPane.showMessageDialog(null, "Saldo: "+conta.get(id));
	}

}
