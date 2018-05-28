package ex16;

public class Metodos {

	public String calculaTroco(String pedido, double dinheiro) {
		String res = "";
		if(pedido.equals("Hambúrguer + Suco de Laranja")){
			double valorPedido= 5;
			double troco = dinheiro-valorPedido;
			int numPedido = 1;
			res = "Número do pedido: "+numPedido+"\n Valor do pedido: "+valorPedido+"\n Troco: R$"+troco;
		}else if(pedido.equals("Sanduíche natural + Suco de Uva")){
			double valorPedido= 4.5;
			double troco = dinheiro-valorPedido;
			int numPedido = 2;
			res = "Número do pedido: "+numPedido+"\n Valor do pedido: "+valorPedido+"\n Troco: R$"+troco;
		}else if(pedido.equals("Prato do dia")){
			double valorPedido= 8;
			double troco = dinheiro-valorPedido;
			int numPedido = 3;
			res = "Número do pedido: "+numPedido+"\n Valor do pedido: "+valorPedido+"\n Troco: R$"+troco;
		}else if(pedido.equals("Pizza")){
			double valorPedido= 12;
			double troco = dinheiro-valorPedido;
			double numPedido = 4;
			res = "Número do pedido: "+numPedido+"\n Valor do pedido: "+valorPedido+"\n Troco: R$"+troco;
		}else if(pedido.equals("Lasanha")){
			double valorPedido= 16.5;
			double troco = dinheiro-valorPedido;
			int numPedido = 5;
			res = "Número do pedido: "+numPedido+"\n Valor do pedido: "+valorPedido+"\n Troco: R$"+troco;
		}else if(pedido.equals("Pão de queijo")){
			double valorPedido= 1;
			double troco = dinheiro-valorPedido;
			int numPedido = 6;
			res = "Número do pedido: "+numPedido+"\n Valor do pedido: "+valorPedido+"\n Troco: R$"+troco;
		}else{
			double valorPedido= 2.5;
			double troco = dinheiro-valorPedido;
			int numPedido = 7;
			res = "Número do pedido: "+numPedido+"\n Valor do pedido: "+valorPedido+"\n Troco: R$"+troco;
		}
		return res;

	}
}
