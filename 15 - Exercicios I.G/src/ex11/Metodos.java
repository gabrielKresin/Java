package ex11;

public class Metodos {

	public double calculaMedia(double n1, double n2, double n3, double n4) {
		return (n1+n2+n3+n4)/4;
	}
	
	public String verificaSituacao(double media, int faltas) {
		String situacao ="";
		if((media==10) && (faltas < 15)){
			situacao = "Parab�ns\nM�dia: "+media;
		}else if((media>=9) && (faltas < 15)){
			situacao = "�timo\nM�dia: "+media;
		}else if((media >=7) && (faltas < 15)){
			situacao = "Bom\nM�dia: "+media;
		}else if((media>=5.1) && (faltas < 15)){
			situacao = "Em exame\nM�dia: "+media;
		}else{
			situacao = "Reprovado\nM�dia: "+media;
		}
		return situacao;
	}
}
