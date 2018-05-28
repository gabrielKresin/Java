package ex23;

public class Metodos {

	public boolean verificaDados(double peso, double altura) {
		boolean valido = false;
		if((peso < 3) || (peso > 149) || (altura < 0.10) || (altura > 2.50)){
			valido = false;
		}else{
			valido = true;
		}
		return valido;
	}
	
	public String calculaVerificaIMC(double peso, double altura) {
		String txt = "";
		double imc = peso/Math.pow(altura, 2);
		if (imc < 17) {
			txt = "IMC: "+imc+"\nSitua��o: Muito abaixo do peso";
		}else if(imc < 18.5){
			txt = "IMC: "+imc+"\nSitua��o: Abaixo do peso";
		}else if(imc < 25){
			txt = "IMC: "+imc+"\nSitua��o: Peso normal";
		}else if(imc < 30){
			txt = "IMC: "+imc+"\nSitua��o: Acima do peso";
		}else if(imc < 35){
			txt = "IMC: "+imc+"\nSitua��o: Obesidade I";
		}else if(imc < 40){
			txt = "IMC: "+imc+"\nSitua��o: Obesidade II";
		}else{
			txt = "IMC: "+imc+"\nSitua��o: Obesidade III";
		}
		return txt;
	}
}
