package ex22;

public class Metodos {

	public String verificaQuadrado(double n1, double n2, double n3, double n4) {
		String txt = "";
		if((n1 == n2) && (n2 == n3) && (n3 == n4)){
			txt = "Objeto analisado � um quadrado";
		}else{
			txt = "Objeto analisado n�o � um quadrado";
		}
		return txt;
	}
}
