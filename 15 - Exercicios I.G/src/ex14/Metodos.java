package ex14;

public class Metodos {

	public String valores(double n1) {
		String valores = "";
		if(n1 < 12000){
			double valDistribuidor = n1*0.05;
			double valSemDistribuidor = n1 - valDistribuidor;
			valores = "PRODUTO ISENTO DE IMPOSTO \n Total arrecadao pelo distribuidor: "+valDistribuidor+" \n Valor sem arrecadação do distribuidor: "+ valSemDistribuidor;
		} else if(n1 <=25000){
			double valDistribuidor = n1*0.10;
			double valImposto = n1*0.15;
			double valSemImposto = n1-valImposto;
			double valSemDistribuidor = n1-valDistribuidor; 
			valores ="TAXA DE IMPOSTO: 15%\n Valor do imposto: "+valImposto+" \n Valor sem imposto: "+valSemImposto+ "\n Total arrecadado pelo distribuidor: "+valDistribuidor+" \n Valor sem arrecadação do distribuidor: "+valSemDistribuidor;
		} else{
			double valDistribuidor = n1*0.15;
			double valImposto = n1*0.20;
			double valSemImposto = n1-valImposto;
			double valSemDistribuidor = n1-valDistribuidor; 
			valores =  "TAXA DE IMPOSTO: 20%\n Valor do imposto: "+valImposto+" \n Valor sem imposto: "+valSemImposto+ "\n Total arrecadado pelo distribuidor: "+valDistribuidor+" \n Valor sem arrecadação do distribuidor: "+valSemDistribuidor;
		}
		return valores;
	}
}
