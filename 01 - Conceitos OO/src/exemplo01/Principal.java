package exemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Instanciar um objeto (criar)
		Pessoa p1 = new Pessoa();
		p1.altura = 1.80;
		p1.idade = 23;
		p1.nome = "Ricardo";
		p1.peso = 73.4;
		p1.apresentacao();
		p1.exibirIMC();
		
		//Instanciar outro objeto
		/*Pessoa p2 = new Pessoa();
		p2.altura = 1.67;
		p2.idade = 16;
		p2.nome = "Andressa";
		p2.peso = 56.3;
		p2.apresentacao();*/
		
	}

}
