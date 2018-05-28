package ex15;

public class Metodos {

	public String calculaDiaria(String apto, int dia) {
		String res = "";
		if(apto.equals("1-apto simples")){
			int total = dia*45;
			res = "O valor do aluguel é: "+total;
	 	} else if(apto.equals("2-apto duplo")){
			int total = dia*65;
			res = "O valor do aluguel é: "+total;
		} else{
			int total = dia*110;
			res = "O valor do aluguel é: "+total;
		}	
		return res;
	}
}
