package exemplo01;

import javax.swing.JOptionPane;

public class Aluno {

	/*
	 * Encapsulamento -> visibilidade de atributos e métodos
	 * DEFAULT -> visível apenas nas classes do mesmo pacote
	 * PUBLIC -> visível em qualquer classe no mesmo pacote
	 * PRIVATE -> visível apenas na classe onde são criados
	 * PROTECTED -> visível na classe onde são criados ou herdados
	 */
	
	//atributos da classe
	private String nome;
	private double nota1, nota2;
	
	//método para obter os dados
	public void obterDados() {
		nome = JOptionPane.showInputDialog("Nome:");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
		exibirFrase();
	}
	
	//método para retornar a média
	private double calculaMedia() {
		return (nota1+nota2)/2;
		
	}
	
	//método para exibir uma frase;
	private void exibirFrase() {
		JOptionPane.showMessageDialog(null, nome+" obteve média: "+calculaMedia());
	}
	
}
