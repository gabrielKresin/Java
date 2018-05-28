package ex12;

public class Metodos {

	public String verificaMulta(double n1, double n2) {
		double media = n2-n1;
		String multa = "";
		if(n2>=n1){
			multa = "Bom motorista";
		} else if(media<=10){
			multa = "Multa de R$50.00";
		} else if(media<=30){
			multa = "Multa de R$100.00";
		} else{
			multa = "Multa de R$200.00";
		}
		return multa;
	}
}
