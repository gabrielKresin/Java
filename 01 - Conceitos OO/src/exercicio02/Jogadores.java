package exercicio02;

import javax.swing.JOptionPane;

public class Jogadores {

	String nome = "";
	double altura;
	double peso;
	int idade;
	int quantJogadores = 0;
	double maiorAltura = 0;
	String maiorJogador;
	int maiorIdade = 0;
	String jogadorVelho;
	double maiorPeso = 0;
	String jogadorPesado;
	double alturas = 0;
	double media = 0;
	
	public void laco() {
		do {
			pedeNome();
			if(nome.equals("sair")){
				break;
			}
			pedirDados();
			maiorJogador();
			maisVelho();
			maisPesado();
			mediaAlturas();
		} while (!nome.equals("sair"));
		
		mostrarDados();
	}
	
	public void pedirDados() {
		boolean valido = false;
		do {
			try {
				altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do jogador"));
				valido = true;
				if((altura < 1.20) || (altura > 2.50)){
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
				peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do jogador"));
				valido = true;
				if((peso < 30) || (peso > 150)){
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
				idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do jogador"));
				valido = true;
				if((idade < 14) || (idade > 59)){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		
		quantJogadores++;
		alturas += altura;
		
	}

	public void pedeNome() {
		boolean valido = false;
		do {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome do jogador");
				valido = true;
				if(nome.isEmpty()){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
	
	public void maiorJogador() {
		if(altura > maiorAltura){
			maiorAltura = altura;
			maiorJogador = nome;
		}
	}
	
	public void maisVelho() {
		if(idade > maiorIdade){
			maiorIdade = idade;
			jogadorVelho = nome;
		}
	}
	
	public void maisPesado() {
		if(peso > maiorPeso){
			maiorPeso = peso;
			jogadorPesado = nome;
		}
	}
	
	public double mediaAlturas() {
		
		media = alturas/quantJogadores;
		return media;
	}
	
	public void mostrarDados() {
		
		String msg = "Quantidade de jogadores cadastrados: "+quantJogadores;
		msg += "\n\nNome e altura do maior Jogador:";
		msg += "\n"+maiorJogador;
		msg += "\n"+maiorAltura;
		msg += "\n\nNome e idade do jogador mais velho:";
		msg += "\n"+jogadorVelho;
		msg += "\n"+maiorIdade;
		msg += "\n\nNome e peso do jogador mais pesado:";
		msg += "\n"+jogadorPesado;
		msg += "\n"+maiorPeso;
		msg += "\n\nMédia das alturas jogadores" + media;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
