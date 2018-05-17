package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//criar ArrayList
		ArrayList<String> cursos = new ArrayList<>();
		
		//cadastrar cursos
		cursos.add("Java SE");
		cursos.add("Java - WEB");
		cursos.add("Java - Android");
		cursos.add("HTML");
		cursos.add("CSS");
		cursos.add("Oracle");
		
		//Exibir a quantidade de cursos cadastrados
		System.out.println("Há "+cursos.size()+" cursos cadastrados");
		
		//exibir o segundo curso do arraylist
		System.out.println(cursos.get(1));
						
	}

}
