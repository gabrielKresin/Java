package ex08;

public class Metodos {

	public String verificaOp(String txt, double n1, double n2) {
		String res = "";
		if(txt.equals("Soma")){
			res = ""+soma(n1, n2);
		}else if(txt.equals("Subtração")){
			res = ""+subtracao(n1, n2);
		}else if (txt.equals("Multiplicação")) {
			res = ""+multiplicacao(n1, n2);
		}else{
			res = ""+divisao(n1, n2);
		}
		return res;
	}

	public double soma(double n1, double n2) {
		return n1+n2;
	}

	public double subtracao(double n1, double n2) {
		return n1-n2;
	}

	public double multiplicacao(double n1, double n2) {
		return n1*n2;
	}

	public double divisao(double n1, double n2) {
		return n1/n2;
	}
}
