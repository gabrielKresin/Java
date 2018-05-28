package ex06;

import javax.swing.JOptionPane;

public class Metodos {

	public void verificaNumeros(double n1, double n2) {
		if(n1 == n2){
			JOptionPane.showMessageDialog(null, somaNumeors(n1, n2));;
		}else{
			JOptionPane.showMessageDialog(null, multiplicaNumeros(n1, n2));;
		}
	}
	
	public double somaNumeors(double n1, double n2) {
		double soma = n1+n2;
		return soma;
	}
	
	public double multiplicaNumeros(double n1, double n2) {
		double resultado = n1*n2;
		return resultado;
	}
}
