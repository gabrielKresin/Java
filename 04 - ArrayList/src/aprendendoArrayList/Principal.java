package aprendendoArrayList;

import java.util.ArrayList;

//Classe que englobar� a estrutura do array
public class Principal {

	//inicializa��o do sistema
	public static void main(String[] args) {
		
		//criando o ArrayList
		ArrayList<String> cursos = new ArrayList<>();
		
		//adicionando tr�s cursos no ArrayList
		cursos.add("Photoshop");
		cursos.add("Oracle");
		cursos.add("Java");
		
		//Exibindo os cursos cadastrados no ArrayList
		for (int i = 0; i <= 2; i++) {
			
			//Fun��o get() -> ir� capturar uma informa��o
			System.out.println(cursos.get(i));

		}
	
		//Exibindo n�mero de elementos no ArrayList
		System.out.println("H� "+cursos.size()+" cadastrados.");

		//Removendo o curso de Oracle
		cursos.remove(1);
		
		//Removendo todos os cursos
		cursos.clear();
	}

}
