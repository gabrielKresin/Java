package projeto;

public class Principal {

	public static void main(String[] args) {

		//Instanciar objetos das classes Gerente e Atendente
		Gerente g = new Gerente();
		g.descontoVR(1000);
		Atendente a = new Atendente();
		a.descontoVR(1000);

	}

}
