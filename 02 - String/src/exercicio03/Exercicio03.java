package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra = "";
		String novaPalavra;
		String verbos = "";
		int tamanho;
		String fim = "ar";

		palavra = JOptionPane.showInputDialog("Digite uma palavra");
		palavra = palavra.toLowerCase();
		if(!palavra.endsWith(fim)){
			JOptionPane.showMessageDialog(null, "Palavra inforamada não é um verbo.");
		}else{
			for (int i = 0; i < 6; i++) {
				tamanho = palavra.length();
				novaPalavra = palavra.substring(0, tamanho-2);
				verbos = "eu "+novaPalavra+"o\n";
				verbos += "tu "+novaPalavra+"as\n";
				verbos += "ele/ela "+novaPalavra+"a\n";
				verbos += "nós "+novaPalavra+"amos\n";
				verbos += "vós "+novaPalavra+"áis\n";
				verbos += "eles/elas "+novaPalavra+"am\n";	
				
			}
			JOptionPane.showMessageDialog(null, verbos);
		}
	}
}
