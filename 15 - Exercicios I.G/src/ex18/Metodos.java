package ex18;

public class Metodos {

	public String verificaTriangulo(double n1, double n2, double n3) {
		String res = "";
		if((n1 < (n2+n3)) && (n2 < (n1+n3)) && (n3 < (n1+n2))){
			if((n1==n2) && (n1==n3)){
				res = "Tri�ngulo eq�il�tero";
			}else if((n1==n2) || (n1==n3) || (n2==n3)){
				res = "Tri�ngulo is�sceles";
			}else{
				res = "Tri�ngulo escaleno";	
			}
		}else{
			res = "N�o � um tri�ngulo";
		}
		return res;
	}
	
}
