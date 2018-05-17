package exercicio02;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String palavra;
		int quantVogais = 0;

		palavra = JOptionPane.showInputDialog("Digite um texto");
		palavra = palavra.toLowerCase();

		for(int i = 0; i < palavra.length(); i++){

			if(String.valueOf(palavra.charAt(i)).contains("a")){
				quantVogais++;
			}else if(String.valueOf(palavra.charAt(i)).contains("e")){
				quantVogais++;
			}else if(String.valueOf(palavra.charAt(i)).contains("i")){
				quantVogais++;
			}else if(String.valueOf(palavra.charAt(i)).contains("o")){
				quantVogais++;
			}else if(String.valueOf(palavra.charAt(i)).contains("u")){
				quantVogais++;
			}
		}

		JOptionPane.showMessageDialog(null, "Quantidade de vogais: "+quantVogais);
	}

}


