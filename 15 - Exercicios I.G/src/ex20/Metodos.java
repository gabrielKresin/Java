package ex20;

public class Metodos {

	public String infoSC(String cidade) {
		String res = "";
		if(cidade.equals("Blumenau")){
			res = "Popula��o: 334 002(IBGE-2014)";
		}else if(cidade.equals("Itaja�")){
			res = "Popula��o: 212 615(IBGE-2017)";
		}else{
			res = "Popula��o: 577 077(IBGE-2017)";
		}
		return res;
	}
	
	public String infoRS(String cidade) {
		String res = "";
		if(cidade.equals("Caxias do Sul")){
			res = "Popula��o: 479 236(IBGE-2016)";
		}else if(cidade.equals("Gramado")){
			res = "Popula��o: 34 832(IBGE-2016)";
		}else{
			res = "Popula��o: 17 094(IBGE-2016)";
		}
		return res;
	}
	
	public String infoRJ(String cidade) {
		String res = "";
		if(cidade.equals("Angra dos Reis")){
			res = "Popula��o: 194 619(IBGE-2017)";
		}else if(cidade.equals("Rio de Janeiro")){
			res = "Popula��o: 6 520 266(IBGE-2017)";
		}else{
			res = "Popula��o: 176 060(IBGE-2017)";
		}
		return res;
	}
}
