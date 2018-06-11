package ex01;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{

	//Atributos
	private String cargo;
	private double salario;

	//M�todo construtor
	public Funcionario(String nome, int idade, String cargo, double salario) {

		//Enviando para os atributos de cada classe
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;

	}

	//M�todo para exibir uma mensagem
	public void mensagem() {

		//Estrutura da mensagem
		String mensagem = "Nome: "+nome;
		mensagem += "\nIdade: "+idade;
		mensagem += "\nSitua��o idade: "+situacaoIdade();
		mensagem += "\nCargo: "+cargo;
		mensagem += "\nSal�rio: "+salario;
		
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, mensagem);
		
	}


}
