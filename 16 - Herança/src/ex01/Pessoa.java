package ex01;

public class Pessoa {

	
	//Atributos
	protected String nome;
	protected int idade;
	
	//M�todo para retornar se � maior de idade ou n�o
	protected String situacaoIdade(){
		
		//Condicional
		String situacao = idade >= 18 ? "Maior de idade" : "Menor de idade";
		
		//Returno
		return situacao;
	}
}
