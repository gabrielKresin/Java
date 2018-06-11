package ex02;

import javax.swing.JOptionPane;

public class Aluno extends Notas{

	//Atributos
	private String nome;
	private String materia;
	
	//Construtor
	public Aluno(String nome, String materia, double nota1, double nota2, double nota3){
		
		//Chamar construtor da classe notas
		super(nota1, nota2, nota3);
		
		//Stribuindo valores
		this.nome = nome;
		this.materia = materia;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		
		//Método situação
		situacao();
	}
	
	private void situacao() {
		
		//Estrutura da mensagem
		String mensagem = "Aluno: "+ nome;
		mensagem += "\nMatéria: "+materia;
		mensagem += "\nMédia: "+media();
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
		
}
