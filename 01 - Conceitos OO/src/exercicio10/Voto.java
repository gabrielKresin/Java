package exercicio10;

import javax.swing.JOptionPane;

public class Voto {

	Object[] candidatos = {"candidato1", "candidato2", "candidato3", "candidato4"};
    double candidato1 = 0;
    double candidato2 = 0;
    double candidato3 = 0;
    double candidato4 = 0;
    double quantVotos = 0;
    double percCandidato1 = 0;
    double percCandidato2 = 0;
    double percCandidato3 = 0;
    double percCandidato4 = 0;
    Object voto = "";
	
	public void laco() {
		int continuar = 0;
		do {
			pedeVoto();
			contabilizaVoto();
			calculaPercetual();
			continuar = JOptionPane.showConfirmDialog(null, "Continuar votando");
		} while (continuar == 0);
		verificaVencedor();
	}
	
	public void pedeVoto() {
		boolean valido = false;
        do {
            try {
                voto = JOptionPane.showInputDialog(null, "Selecione o candidato", "Urna", JOptionPane.PLAIN_MESSAGE, null, candidatos, "");
                valido = true;
            } catch (Exception e) {
                valido = false;
                JOptionPane.showMessageDialog(null, "Erro.");
            }
        } while (valido == false);
        
        quantVotos++;
	}
	
	public void contabilizaVoto() {
		if(voto.equals("candidato1")){
            candidato1++;
        }else if(voto.equals("candidato2")){
            candidato2++;
        }else if(voto.equals("candidato3")){
            candidato3++;
        }else{
            candidato4++;
        }
	}
	
	public void calculaPercetual() {
		percCandidato1 = (candidato1/quantVotos)*100;
        percCandidato2 = (candidato2/quantVotos)*100;
        percCandidato3 = (candidato3/quantVotos)*100;
        percCandidato4 = (candidato4/quantVotos)*100;
	}
	
	public void verificaVencedor() {
		if((candidato1>candidato2) && (candidato1>candidato3) && (candidato1>candidato4)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato1, com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");

        }else if((candidato2>candidato1) && (candidato2>candidato3) && (candidato2>candidato4)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato2, com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");

        }else if((candidato3>candidato1) && (candidato3>candidato2) && (candidato3>candidato4)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato3, com "+candidato3+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");

        }else if((candidato4>candidato1) && (candidato4>candidato2) && (candidato4>candidato3)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato4, com "+candidato4+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato2) && (candidato1==candidato3) && (candidato1==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato4, candidato3, candidato2, candidato1, ambos com "+candidato4+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato2) && (candidato1==candidato3)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato2, candidato3, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato3) && (candidato1==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato3, candidato4, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato2) && (candidato1==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato2, candidato3, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato2==candidato4) && (candidato2==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato2, candidato3, candidato4, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato1==candidato2){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato2, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato1==candidato3){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato3, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato1==candidato4){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato4, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato2==candidato3){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato2, candidato3, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato2==candidato4){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato2, candidato4, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else{
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato3, candidato4, ambos com "+candidato3+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos"); 
        }
	}
	
}
