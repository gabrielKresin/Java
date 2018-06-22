package br.com.proway.main;

import br.com.proway.dao.CursosDao;
import br.com.proway.view.CursosView;

public class Main {

	public static void main(String[] args) {
		
		//Formulário do curso
		CursosView cv = new CursosView();
		cv.setVisible(true);
		
		CursosDao cd = new CursosDao();
		cd.listarCurso();
		
	}

}
