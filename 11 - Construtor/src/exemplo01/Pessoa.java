package exemplo01;

public class Pessoa {

	//Construtor #01
	public Pessoa() {
		System.out.println("Boa tarde!");
	}
	
	//Construtor #02
	
	public Pessoa(String nome) {
		System.out.println("Boa tarde "+nome);
	}
	
	//Construtor #03
	public Pessoa(String nome, int hora){
		
		if(hora < 12){
			System.out.println("Bom dia "+ nome);
		}else if (hora < 18){
			System.out.println("Boa tarde "+nome);
		}else{
			System.out.println("Boa noite "+nome);
		}
	}
	
}
