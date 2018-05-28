package ex24;

public class Metodos {

	public String ordena(double n1, double n2, double n3) {
		String txt = "";
		if((n1<=n2) && (n1<=n3) && (n2<=n3)){
			txt = n1+" "+n2+" "+n3;
		}else if((n1<=n2) && (n1<=n3) && (n3<=n2)){
			txt = n1+" "+n3+" "+n2;
		}else if((n2<=n1) && (n1<=n3) && (n2<=n3)){
			txt = n2+" "+n1+" "+n3;
		}else if((n2<=n1) && (n2<=n3) && (n3<=n1)){
			txt = n2+" "+n3+" "+n1;
		}else if((n3<=n1) && (n3<=n2) && (n1<=n2)){
			txt = n3+" "+n1+" "+n2;
		}else{
			txt = n3+" "+n2+" "+n1;
		}
		return txt;
	}
}
