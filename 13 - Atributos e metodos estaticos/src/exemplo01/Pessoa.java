package exemplo01;

public class Pessoa {

	//atributo da classe
	private static int contador = 0;
	
	public Pessoa(){
		contador++;
		System.out.println(contador);
	}
	
}
