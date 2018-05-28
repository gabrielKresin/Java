package ex09;

public class Metodos {

	public double menorNumero(double n1, double n2, double n3) {
		double menor = 0;
		if((n1<=n2) && (n1<=n3)){
			menor = n1;
		}else if((n2<=n1) && (n2<=n3)){
			menor = n2;
		}else{
			menor = n3;
		}
		return menor;
	}
}
