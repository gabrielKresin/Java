//Classe = Molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {
	

	//Atributos (características)
	String nome;
	String x;
	int idade;
	double peso, altura;
	
	//Método de apresentação
	public void apresentacao(){
		JOptionPane.showMessageDialog(null, "Boa tarde! Meu nome é: "+nome);
	}
	
	//Método para calcular o imc
	public double calculoIMC(){
		
		double imc = peso / Math.pow(altura, 2);
		
		return imc;
		
	}
	
	//Método para retornar a condição do IMC
	public String condicaoIMC() {
		
		//Obter o valor do imc
		double imc = calculoIMC();
		
		//Variável contendo a contição
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
	
	//Método para exibir o imc
	public void exibirIMC() {
		
		String msg = "*****IMC*****\n";
		msg += "Seu imc é de: "+String.format("%.2f", calculoIMC())+"\n";
		msg += "Sua condição é: "+condicaoIMC();
		JOptionPane.showMessageDialog(null, msg);
	}
}
