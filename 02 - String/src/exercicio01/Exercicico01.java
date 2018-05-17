package exercicio01;

import javax.swing.JOptionPane;

public class Exercicico01 {

	public static void main(String[] args) {
		
		String palavra;
		String novaPalavra = "";
		
		palavra = JOptionPane.showInputDialog("Digite um texto");
		palavra = palavra.toLowerCase();
		
		for (int i = 0; i < palavra.length(); i++) {
			if(i%2 == 0){
				novaPalavra += palavra.toUpperCase().charAt(i); 
			}else{
				novaPalavra += palavra.charAt(i);
			}
		}
		
		JOptionPane.showMessageDialog(null, novaPalavra);
	}
}
