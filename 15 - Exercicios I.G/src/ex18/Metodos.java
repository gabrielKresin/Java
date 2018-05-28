package ex18;

public class Metodos {

	public String verificaTriangulo(double n1, double n2, double n3) {
		String res = "";
		if((n1 < (n2+n3)) && (n2 < (n1+n3)) && (n3 < (n1+n2))){
			if((n1==n2) && (n1==n3)){
				res = "Triângulo eqüilátero";
			}else if((n1==n2) || (n1==n3) || (n2==n3)){
				res = "Triângulo isósceles";
			}else{
				res = "Triângulo escaleno";	
			}
		}else{
			res = "Não é um triângulo";
		}
		return res;
	}
	
}
