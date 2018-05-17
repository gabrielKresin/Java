package aprendendoArrayList;

import java.util.ArrayList;

//Classe que englobará a estrutura do array
public class Principal {

	//inicialização do sistema
	public static void main(String[] args) {
		
		//criando o ArrayList
		ArrayList<String> cursos = new ArrayList<>();
		
		//adicionando três cursos no ArrayList
		cursos.add("Photoshop");
		cursos.add("Oracle");
		cursos.add("Java");
		
		//Exibindo os cursos cadastrados no ArrayList
		for (int i = 0; i <= 2; i++) {
			
			//Função get() -> irá capturar uma informação
			System.out.println(cursos.get(i));

		}
	
		//Exibindo número de elementos no ArrayList
		System.out.println("Há "+cursos.size()+" cadastrados.");

		//Removendo o curso de Oracle
		cursos.remove(1);
		
		//Removendo todos os cursos
		cursos.clear();
	}

}
