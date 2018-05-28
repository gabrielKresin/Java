package ex26;

public class Metodos {

	public boolean validaIdade(int idade) {
		boolean valido = false;
		if((idade <=0 ) || (idade > 120)){
			valido = false;
		}else{
			valido = true;
		}
		return valido;
	}
	
	public String verificaIdade(int idade, String nome) {
		String txt = "";
		if(idade < 5){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade bebê";
		}else if(idade < 12){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade criança";
		}else if(idade < 15){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade adolescente";
		}else if(idade < 31){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade jovem";
		}else if(idade < 46){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade madura";
		}else if(idade < 61){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade de adulto";
		}else if(idade < 76){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade do idoso I";
		}else if(idade < 90){
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade do idoso II";
		}else{
			txt = "Nome: "+nome+"\nIdade: "+idade+"\nClassificação: Idade do idoso III";
		}
		return txt;
	}
}
