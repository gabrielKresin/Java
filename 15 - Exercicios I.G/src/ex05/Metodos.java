package ex05;

public class Metodos {

	public String verificaDia(int dia) {
		String txt = "";
		if((dia == 2) || (dia == 3) || (dia == 9) || (dia == 10) || (dia == 16) || (dia == 17) || (dia == 23) || (dia == 24)){
			txt = "Final de Semana.";
		}else{
			txt = "Dia de Semana.";
		}
		return txt;
	}
	
	public boolean validaDia(int dia) {
		boolean valido = true;
		if ((dia > 28) || (dia < 1)) {
			valido = false;
		}
		return valido;
	}
	
}
