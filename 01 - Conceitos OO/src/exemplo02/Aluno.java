package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovado = 0;
	int reprovado = 0;
	
	//Método para realizar perguntas
	public void obterDados() {
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1º nota:"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2º nota:"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3º nota:"));
		
	}
	
	//Método para o laço de repetição
	public void laco() {


		//variável continuar
		int continuar = 0;
		
		do {
			obterDados();
			contabilizarSituacao();
			exibirDados();
			
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		} while (continuar == 0);
	}

	//Método para retornar a média
	public double calculoMedia() {
		
		double media = (nota1+nota2+nota3)/3;
		return media;
	}
	
	//Método para retornar a situação do aluno
	public String situacaoAluno() {
		
		String situacao = calculoMedia() >= 7 ? "Aprovado" : "Reprovado";
		return situacao;
		
	}
	
	//Método para contabilizar aprovados e reprovados
	public void contabilizarSituacao() {
			
			if (calculoMedia() >= 7) {
				aprovado++;
			}else{
				reprovado++;
			}
		}
		
	//Método para exibir a média e a situação do aluno
	public void exibirDados() {
		
		String msg = "O aluno "+nome;
		msg += "\n Obteve média: "+String.format("%.2f", calculoMedia());
		msg += "\n sua situação é: "+situacaoAluno();
		msg += "\nHá "+aprovado+" aprovados";
		msg += "\nHá "+reprovado+" reprovados";
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
