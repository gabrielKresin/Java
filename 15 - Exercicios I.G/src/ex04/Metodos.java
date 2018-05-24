package ex04;

public class Metodos {

	public double calculaDesconto(double valor) {
		valor = valor*0.90;
		return valor;
	}
	
	public boolean verificaPagamento(String pagamento, double valor) {
		boolean aVista = false;
		if((pagamento.equals("A vista")) && (valor > 500)){
			aVista = true;
		}else{
			aVista = false;
		}
		return aVista;
	}
	
}
