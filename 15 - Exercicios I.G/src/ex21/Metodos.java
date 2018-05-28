package ex21;

public class Metodos {

	public String pagamentoCalca(String pagamento) {
		String res = "";
		if(pagamento.equals("A vista")){
			res = "R$150,00";
		}else if(pagamento.equals("A prazo 30 dias")){
			res = "R$165,00";
		}else{
			res = "R$180,00";
		}
		return res;
	}

	public String pagamentoCamisa(String pagamento) {
		String res = "";
		if(pagamento.equals("A vista")){
			res = "R$300,00";
		}else if(pagamento.equals("A prazo 30 dias")){
			res = "R$330,00";
		}else{
			res = "R$360,00";
		}
		return res;
	}

	public String pagamentoCasaco(String pagamento) {
		String res = "";
		if(pagamento.equals("A vista")){
			res = "R$250,00";
		}else if(pagamento.equals("A prazo 30 dias")){
			res = "R275,00";
		}else{
			res = "R$300,00";
		}
		return res;
	}

	public String pagamentoMeias(String pagamento) {
		String res = "";
		if(pagamento.equals("A vista")){
			res = "R$30,00";
		}else if(pagamento.equals("A prazo 30 dias")){
			res = "R$33,00";
		}else{
			res = "R$36,00";
		}
		return res;
	}

	public String pagamentoPaleto(String pagamento) {
		String res = "";
		if(pagamento.equals("A vista")){
			res = "R$450,00";
		}else if(pagamento.equals("A prazo 30 dias")){
			res = "R$495,00";
		}else{
			res = "R$540,00";
		}
		return res;
	}

}
