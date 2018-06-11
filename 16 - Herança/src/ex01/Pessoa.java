package ex01;

public class Pessoa {

	
	//Atributos
	protected String nome;
	protected int idade;
	
	//Método para retornar se é maior de idade ou não
	protected String situacaoIdade(){
		
		//Condicional
		String situacao = idade >= 18 ? "Maior de idade" : "Menor de idade";
		
		//Returno
		return situacao;
	}
}
