package ex01;

import javax.swing.JOptionPane;

public class Funcionario extends Pessoa{

	//Atributos
	private String cargo;
	private double salario;

	//Método construtor
	public Funcionario(String nome, int idade, String cargo, double salario) {

		//Enviando para os atributos de cada classe
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;

	}

	//Método para exibir uma mensagem
	public void mensagem() {

		//Estrutura da mensagem
		String mensagem = "Nome: "+nome;
		mensagem += "\nIdade: "+idade;
		mensagem += "\nSituação idade: "+situacaoIdade();
		mensagem += "\nCargo: "+cargo;
		mensagem += "\nSalário: "+salario;
		
		//Exibir mensagem
		JOptionPane.showMessageDialog(null, mensagem);
		
	}


}
