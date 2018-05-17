package exemplo02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {

	//atributos da classe
	private String nome; 
	private double nota1, nota2, media;
	
	//ArrayList
	ArrayList<Aluno> dados = new ArrayList<>();
	
	//m�todo para cadastrar no ArrayList
	private void cadastrar() {
		
		//instamnciar um objeto
		Aluno a = new Aluno();
		
		//obter os dados do aluno
		a.nome = JOptionPane.showInputDialog("Nome");
		a.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		a.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		
		//realizar a m�dia
		a.media = (a.nota1 + a.nota2)/2;
		
		//adicionar o aluno ao vetor
		dados.add(a);
		
		//mensagem
		JOptionPane.showMessageDialog(null, "Aluno cadastrado om sucesso");
	}
	
	//m�todo para listar os alunos cadastrados
	private void listar() {
		
		//agrupar
		String agrupar = "Alunos cadastrados:\n\n";
		
		//la�o
		for (int i = 0; i < dados.size(); i++) {
			agrupar += "Nome: "+dados.get(i).nome;
			agrupar += "\nM�dia: "+dados.get(i).media+"\n\n";
		}
		
		//exibir mensagem
		JOptionPane.showMessageDialog(null, agrupar);
	}
	
	//m�todo menu
	public void menu() {
		
		//menu
		String menu = "***Menu***\n\n";
		menu += "1)Cadastrar aluno\n";
		menu += "2)Listar alunos\n";
		menu += "3)Sair\n";
		
		//obter op��o selecionada
		int opcao = 0;
		
		//la�o
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {
			case 1:
				cadastrar();
				break;
			case 2:
				listar();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Adeus");
			}
		} while (opcao != 3);
	}
}
