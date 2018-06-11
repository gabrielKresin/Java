package ex02;

import javax.swing.JOptionPane;

public class Notas {

	//Atributos
	protected double nota1, nota2, nota3;
	
	//Construtor
	public Notas(double nota1, double nota2, double nota3){
		
		//Inicializar
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		
		//Mensagem
		JOptionPane.showMessageDialog(null, "Construtor executado");
	}
	
	//Método para retornar a média
	protected double media() {
		
		//Calculo
		double media = (nota1+nota2+nota3)/3;
		
		//Retorno
		return media;
	}
	
}
