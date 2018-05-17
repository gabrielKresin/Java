package exercicio04;

import javax.swing.JOptionPane;

public class Voto {

	int idade;
	int quantKid = 0;
	int quantAdol = 0;
	int quantAdult = 0;
	double quantExcelente = 0;
	double quantOtimo = 0;
	double quantBom = 0;
	double quantRegular = 0;
	double quantRuim = 0;
	double quantVotos = 0;
	double percExcelente = 0;
	double perctOtimo = 0;
	double percBom = 0;
	double percRegular = 0;
	double percRuim = 0;
	Object[] votos = {"Excelente", "Ótimo", "Bom", "Regular", "Ruim"};
	Object voto = "";
	
	public void laco() {
		
		int continuar = 0;
		do {
			pedeVoto();
			pedeIdade();
			contabilizaVoto();
			contabilizaIdade();
			calculaVotos();
			mostraDados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja compuatar mais um voto?");
		} while (continuar == 0);
	}
	
	public void pedeVoto() {
		boolean valido = false;
		do {
			try {
				voto = JOptionPane.showInputDialog(null, "Escolha uma opção", "Voto", JOptionPane.PLAIN_MESSAGE, null, votos, "");
				valido = true;
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		quantVotos++;
	}
	
	public void pedeIdade() {
		boolean valido = false;
		do {
			try {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
				valido = true;
				if((idade < 1) || (idade > 100)){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
	
	public void contabilizaVoto() {
		if(voto.equals("Excelente")){
			quantExcelente++;
		}else if(voto.equals("Ótimo")){
			quantOtimo++;
		}else if(voto.equals("Bom")){
			quantBom++;
		}else if(voto.equals("Regular")){
			quantRegular++;
		}else{
			quantRuim++;
		}
	}
	
	public void contabilizaIdade() {
		if(idade < 10){
			quantKid++;
		}else if(idade < 18){
			quantAdol++;
		}else{
			quantAdult++;
		}
	}
	
	public void calculaVotos() {
		percExcelente = (quantExcelente/quantVotos)*100;
		perctOtimo = (quantOtimo/quantVotos)*100;
		percBom = (quantBom/quantVotos)*100;
		percRegular = (quantRegular/quantVotos)*100;
		percRuim = (quantRuim/quantVotos)*100;
	}
		
	public void mostraDados() {
		String msg = "Percentual de votos:";
		msg += "\nExcelente: "+percExcelente+"%";
		msg += "\nÓtimo: "+perctOtimo+"%";
		msg += "\nBom: "+percBom+"%";
		msg += "\nRegular: "+percRegular+"%";
		msg += "\nRuim: "+percRuim+"%";
		msg += "\n\nQuantidade de:";
		msg += "\nCrianças: "+quantKid;
		msg += "\nAdolscentes: "+quantAdol;
		msg += "\nAdultos: "+quantAdult;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
