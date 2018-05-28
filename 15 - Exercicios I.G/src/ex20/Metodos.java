package ex20;

public class Metodos {

	public String infoSC(String cidade) {
		String res = "";
		if(cidade.equals("Blumenau")){
			res = "População: 334 002(IBGE-2014)";
		}else if(cidade.equals("Itajaí")){
			res = "População: 212 615(IBGE-2017)";
		}else{
			res = "População: 577 077(IBGE-2017)";
		}
		return res;
	}
	
	public String infoRS(String cidade) {
		String res = "";
		if(cidade.equals("Caxias do Sul")){
			res = "População: 479 236(IBGE-2016)";
		}else if(cidade.equals("Gramado")){
			res = "População: 34 832(IBGE-2016)";
		}else{
			res = "População: 17 094(IBGE-2016)";
		}
		return res;
	}
	
	public String infoRJ(String cidade) {
		String res = "";
		if(cidade.equals("Angra dos Reis")){
			res = "População: 194 619(IBGE-2017)";
		}else if(cidade.equals("Rio de Janeiro")){
			res = "População: 6 520 266(IBGE-2017)";
		}else{
			res = "População: 176 060(IBGE-2017)";
		}
		return res;
	}
}
