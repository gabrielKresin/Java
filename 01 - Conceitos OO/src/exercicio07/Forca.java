package exercicio07;

import javax.swing.JOptionPane;

public class Forca {

	String palavraChave = "ESTUDAR";
    String letrasDescob = "";
    int opcao = 0;
    String chute = "";
    String letra = "";
    int vidas = 5;
    boolean gameOver = false;
    String[] letras = new String[26];
    int jogadas = 0;
    
    public void laco() {
		do {
			if(gameOver == true){
				break;
			}
			pedeOpcao();
			verificaOpcao();
			gameOver();
		} while (gameOver == false);
	}
    
    public void pedeOpcao() {
		boolean valido = false;
		do {
			try {
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Vidas: "+vidas+"\nDigite 0 para sair\n1 para arriscar uma palavra\n2 para arriscar uma letra"+"\nLetras descobertas: "+letrasDescob));
				valido = true;
				if((opcao < 0) || (opcao > 2)){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

    public void verificaOpcao() {
		if(opcao == 0){
			gameOver = true;
		}
		if(opcao == 1){
			pedePalavra();
			verificaPalavra();
		}
		if(opcao == 2){
			pedeLetra();
			VerificaLetra();
		}
	}
    
    public void pedeLetra(){
    	boolean valido = false;
    	do{
    		try {
				letra = JOptionPane.showInputDialog("Vidas: "+vidas+"\nDigite uma letra"+"\n Letras descobertas:"+letrasDescob);
				valido = true;
				letra = letra.toUpperCase().trim();
				if (letra.isEmpty()) {
					valido = false;
				}
				if (letra.length() > 1) {
					valido = false;
				}
				for (int i = 0; i < letras.length; i++) {
					if(letra.equals(letras[i])){
						valido = false;
					}
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
    	}while(valido == false);
    	
    	letras[jogadas] = letra;
    	jogadas++;
    }
    
    public void pedePalavra() {
		boolean valido = false;
		do {
			try {
				chute = JOptionPane.showInputDialog(null, "Digite a palavra");
				valido = true;
                chute = chute.toUpperCase().trim();
                if (chute.isEmpty()) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
    
    public void VerificaLetra(){
    	switch (letra) {
        case "E":
            JOptionPane.showMessageDialog(null, "Você descobriu uma letra");
            letrasDescob +=" E ";
            break;
        case "S":
            JOptionPane.showMessageDialog(null, "Você descobriu uma letra");
            letrasDescob += " S ";
            break;
        case "T":
            JOptionPane.showMessageDialog(null, "Você descobriu uma letra");
            letrasDescob += " T ";
            break;
        case "U":
            JOptionPane.showMessageDialog(null, "Você descobriu uma letra");
            letrasDescob += " U ";
            break;
        case "D":
            JOptionPane.showMessageDialog(null, "Você descobriu uma letra");
            letrasDescob += " D ";
            break;
        case "A":
            JOptionPane.showMessageDialog(null, "Você descobriu uma letra");
            letrasDescob += " A ";
            break;
        case "R":
            JOptionPane.showMessageDialog(null, "Você descobriu uma letra");
            letrasDescob += " R ";
            break;
        default:
            JOptionPane.showMessageDialog(null, "A palavra não possui essa letra");
            vidas --;
    	}
    }
    
    public void verificaPalavra() {
    	 if(chute.equals(palavraChave)){
             JOptionPane.showMessageDialog(null, "Você venceu, parabéns");
             gameOver = true;
    	 }else{
    		 vidas--;
    	 }
    	 
	}
    
    public boolean gameOver() {
		if(vidas == 0){
			gameOver = true;
		}
    	return gameOver;
	}
}
