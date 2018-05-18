//Classe = Molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {
	

	//Atributos (caracter�sticas)
	String nome;
	String x;
	int idade;
	double peso, altura;
	
	//M�todo de apresenta��o
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Boa tarde! Meu nome �: "+nome);
	}
	
	//M�todo para calcular o imc
	public double calculoIMC(){
		
		double imc = peso / Math.pow(altura, 2);
		
		return imc;
		
	}
	
	//M�todo para retornar a condi��o do IMC
	public String condicaoIMC() {
		
		//Obter o valor do imc
		double imc = calculoIMC();
		
		//Vari�vel contendo a conti��o
		String condicao;
		
		//Condicional
		if(imc < 17){
			condicao = "Muito abaixo do peso";
		}else if (imc < 18.5) {
			condicao = "Abaixo do peso";
		}else if (imc < 25) {
			condicao = "Peso normal";
		}else if (imc < 30) {
			condicao = "Acima do peso";
		}else if(imc < 35){
			condicao = "Obesidade 1";
		}else if(imc < 40){
			condicao = "Obesidade 2";
		}else{
			condicao = "Obesidade 3";
		}
		
		//Retorno
		return condicao;
		
	}
	
	//M�todo para exibir o imc
	public void exibirIMC() {
		
		String msg = "*****IMC*****\n";
		msg += "Seu imc � de: "+String.format("%.2f", calculoIMC())+"\n";
		msg += "Sua condi��o �: "+condicaoIMC();
		JOptionPane.showMessageDialog(null, msg);
	}
}
