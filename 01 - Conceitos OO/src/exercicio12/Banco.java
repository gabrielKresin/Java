package exercicio12;

import javax.swing.JOptionPane;

public class Banco {

	double valorInvestimento = 0;
	int tempoInvestimento = 0;
	double montantePoupanca = 0;
	double montanteCDB;
	String ganhoMensalPoupanca = "";
	String ganhoMensalCDB;
	int quantMeses = 1;
	double investimentoPoupanca;
	double investimentoCDB;
	int tempoCDB;
	int tempoPoupanca;

	public void laco() {
		int continuar = 0;
		do {
			pedeValorInvestimento();
			pedeTempoInvestimento();
			calculaGanhoMensalCDB();
			calculaMontanteCDB();
			calculaGanhoMensalPoupanca();
			calculaMontantePoupanca();
			calculaDescontoCDB();
			mostraDados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja calcular mais um investimento?");
		} while (continuar == 0);
	}

	public void pedeValorInvestimento() {
		boolean valido = false;
		do {
			try {
				valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor inicial do investimento"));
				valido = true;
				if (valorInvestimento <= 0) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		
		investimentoPoupanca = valorInvestimento;
		investimentoCDB = valorInvestimento;
	}

	public void pedeTempoInvestimento() {
		boolean valido = false;
		do {
			try {
				tempoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de investimento"));
				valido = true;
				if ((tempoInvestimento <= 0) || (tempoInvestimento > 48)) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public double calculaDescontoCDB() {

		if (tempoInvestimento < 7) {
			montanteCDB = montanteCDB*0.775;
		}else if(tempoInvestimento < 13){
			montanteCDB = montanteCDB*0.8;
		}else if(tempoInvestimento < 25){
			montanteCDB = montanteCDB*0.8246;
		}else{
			montanteCDB = montanteCDB*0.85;
		}
		return montanteCDB;
	}

	public String calculaGanhoMensalCDB() {
		tempoCDB = tempoInvestimento;
		quantMeses = 1;
			while(tempoCDB > 0){
				investimentoCDB = investimentoCDB*1.005325;
				ganhoMensalCDB += quantMeses+"º mês: "+investimentoCDB+" \n";  
				tempoCDB--;
				quantMeses++;
			}
		
		return ganhoMensalCDB;
	}

	public double calculaMontanteCDB() {	
		montanteCDB = investimentoCDB;
		return montanteCDB;
	}

	public double calculaMontantePoupanca() {
		montantePoupanca = investimentoPoupanca;
		return montantePoupanca;
	}
	
	public String calculaGanhoMensalPoupanca() {
		tempoPoupanca = tempoInvestimento;
		quantMeses = 1;
		while(tempoPoupanca > 0){
			investimentoPoupanca = investimentoPoupanca*1.0037;
			ganhoMensalPoupanca += quantMeses+"º mês: "+investimentoPoupanca+" \n"; 
			tempoPoupanca--;
			quantMeses++;
		}
		return ganhoMensalPoupanca;
	}

	public void mostraDados() {
		String msg = "Ganhos mensais com a poupança:\n"+ganhoMensalPoupanca;
		msg += "\nMontante da poupança: "+montantePoupanca;
		msg += "\n\nGanhos mensais com o CDB:\n"+ganhoMensalCDB;
		msg += "\nMontante do CDB: "+montanteCDB;

		JOptionPane.showMessageDialog(null, msg);
	}

}
