package exercicio01;

import javax.swing.JOptionPane;

public class Pessoa {

	String nome;
	int idade;
	String sexo;
	Object[] cargos = {"gerente", "atendente", "açougueiro", "secretário", "almoxarife", "padeiro", "estagiário", "outro"};
	Object cargo = "";
	int maiorIdade = 0;
	int menorIdade = 0;
	int quantGerente = 0;
	int quantAtendente = 0;
	int quantAcou = 0;
	int quantSecret = 0;
	int quantAlmo = 0;
	int quantPadeiro = 0;
	int quantEstag = 0;
	int quantOutros = 0;
	int quantM = 0;
	int quantF = 0;

	public void laco() {
		int continuar = 0;

		do {
			pedirDados();
			contabilizarIdade();
			contabilizarCargos();
			contabilizarSexo();

			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		} while (continuar == 0);
		
		mostrarDados();
	}

	public void pedirDados(){
		boolean valido = false;
		do {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome");
				valido = true;
				if(nome.isEmpty()){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);

		valido = false;
		do {
			try {
				sexo = JOptionPane.showInputDialog("Digite 'M' para masculino ou 'F' para feminino");
				valido = true;
				sexo = sexo.toUpperCase();
				if(sexo.isEmpty()){
					valido = false;
				}
				if((!sexo.equals("M")) && (!sexo.equals("F"))){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);

		valido = false;
		do {
			try {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
				valido = true;
				if((idade < 1) || (idade > 99)){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);

		valido = false;
		do {
			try {
				cargo = JOptionPane.showInputDialog(null, "Escolha uma profissão", "Cargos", JOptionPane.PLAIN_MESSAGE, null, cargos, "");
				valido = true;
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public void contabilizarIdade() {

		if(idade >= 18){
			maiorIdade ++;
		}else{
			menorIdade++;
		}

	}

	public void contabilizarCargos() {

		if(cargo.equals("gerente")){
			quantGerente++;
		}else if(cargo.equals("atendente")){
			quantAtendente++;
		}else if(cargo.equals("açougueiro")){
			quantAcou++;
		}else if(cargo.equals("secretário")){
			quantSecret++;
		}else if(cargo.equals("almoxarife")){
			quantAlmo++;
		}else if(cargo.equals("padeiro")){
			quantPadeiro++;
		}else if(cargo.equals("estagiário")){
			quantEstag++;
		}else{
			quantOutros++;
		}
	}

	public void contabilizarSexo() {

		if(sexo.equals("M")){
			quantM++;
		}else{
			quantF++;
		}
		
	}

	public void mostrarDados() {
		
		String msg = "Quantidade de pessoas do sexo masculino: "+quantM;
		msg += "\nQuantidade de pessoas do sexo feminino: "+quantF;
		msg += "\nQuantidade de pessoas dos seguintes cargos:";
		msg += "\ngerente: "+quantGerente;
		msg += "\natendente: "+quantAtendente;
		msg += "\naçougueiro: "+quantAcou;
		msg += "\nalmoxerifado: "+quantAlmo;
		msg += "\nestagiário: "+quantEstag;
		msg += "\npadeiro: "+quantPadeiro;
		msg += "\nsecretário: "+quantSecret;
		msg += "\noutros: "+quantOutros;
		msg += "\nQuantidade de pessoas maiores de idade (18+): "+maiorIdade;
		msg += "\nQuantidade de pessoas menores de idade: "+menorIdade;
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
}
