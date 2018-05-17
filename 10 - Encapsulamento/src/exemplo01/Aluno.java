package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	/*
	 * Encapsulamento -> visibilidade de atributos e m�todos
	 * DEFAULT -> vis�vel apenas nas classes do mesmo pacote
	 * PUBLIC -> vis�vel em qualquer classe no mesmo pacote
	 * PRIVATE -> vis�vel apenas na classe onde s�o criados
	 * PROTECTED -> vis�vel na classe onde s�o criados ou herdados
	 */
	
	//atributos da classe
	private String nome;
	private double nota1, nota2;
	
	//m�todo para obter os dados
	public void obterDados() {
		nome = JOptionPane.showInputDialog("Nome:");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
		exibirFrase();
	}
	
	//m�todo para retornar a m�dia
	private double calculaMedia() {
		return (nota1+nota2)/2;
		
	}
	
	//m�todo para exibir uma frase;
	private void exibirFrase() {
		JOptionPane.showMessageDialog(null, nome+" obteve m�dia: "+calculaMedia());
	}
	
}
