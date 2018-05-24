package ex03;

public class Metodos {

	public double calculaMedia(double n1, double n2, double n3, double n4) {
		double media = (n1+n2+n3+n4)/4;
		return media;
	}
	
	public String verificaSituacao(double media) {
		String msg = "";
		if (media >= 7) {
			msg = "Média: "+media+"\nSituacção: Aprovado";
		}else if(media >= 5){
			msg = "Média: "+media+"\nSituacção: Em exame";
		}else{
			msg = "Média: "+media+"\nSituacção: Reprovado";
		}
		return msg;
	}
}
