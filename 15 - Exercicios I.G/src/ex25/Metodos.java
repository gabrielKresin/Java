package ex25;

public class Metodos {

	public boolean validaHora(int hora) {
		boolean valido = false;
		if((hora < 0) || (hora > 23)){
			valido = false;
		}else{
			valido = true;
		}
		return valido;
	}
	
	public String verificaHora(int hora) {
		String txt = "";
		if(hora < 7){
			txt = "Boa madrugada";
		}else if(hora < 12){
			txt = "Bom dia";
		}else if(hora < 19){
			txt = "Boa tarde";
		}else{
			txt = "Boa noite";
		}
		return txt;
	}
}
