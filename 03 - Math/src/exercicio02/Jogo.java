package exercicio02;

import javax.swing.JOptionPane;

public class Jogo {

	double numero;
	double numeroAleatorio;
	double diferenca;
	boolean acerto = false;
	int quantJogadas = 0;
	String desempenho;

	public void laco() {
		int continuar = 0;
		do {
			acerto = false;
			geraNumero();
			do {
				pedeNumero();
				verificaNumero();
			} while (acerto == false);
			verificaDesempenho();
			mostraDados();
			continuar = JOptionPane.showConfirmDialog(null, "Mais uma rodada?");
		} while (continuar == 0);
	}

	public double geraNumero() {
		numeroAleatorio = Math.random();
		numeroAleatorio = (int)Math.round(0 + numeroAleatorio * 101);
		return numeroAleatorio;
	}

	public void	pedeNumero(){
		boolean valido = false;	
		do {
			try {
				numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
				valido = true;
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public boolean verificaNumero() {
		diferenca = 0;
		diferenca = numero - numeroAleatorio;
		double diferenca2 = diferenca;
		if (diferenca < 0) {
			diferenca = diferenca-(diferenca2*2);
		}
		if(numero == numeroAleatorio){
			JOptionPane.showMessageDialog(null, "Você acertou");
			acerto = true;
			quantJogadas++;

		}else if (diferenca <= 10) {
			JOptionPane.showMessageDialog(null, "Está perto");
			acerto = false;
			quantJogadas++;
		}else if(diferenca <= 20){
			JOptionPane.showMessageDialog(null, "Está longe");
			acerto = false;
			quantJogadas++;
		}else{
			JOptionPane.showMessageDialog(null, "Ihhhhh! Muito longe");
			acerto = false;
			quantJogadas++;
		}
		return acerto;
	}

	public String verificaDesempenho() {
		if (quantJogadas == 1) {
			desempenho = "Nossa! Acertou na mosca";
		}else if(quantJogadas <= 5){
			desempenho = "Parabéns! Você é bom de adivinhação";
		}else if(quantJogadas <= 10){
			desempenho = "Muito bom. Continue assim";
		}else if(quantJogadas <= 20){
			desempenho = "Mm... Podia ser melhor. Continue tentando";
		}else{
			desempenho = "Meio lerdo você, hein?";
		}
		return desempenho;
	}

	public void mostraDados() {
		String msg = desempenho;
		JOptionPane.showMessageDialog(null, msg);
		quantJogadas = 0;

	}
}
