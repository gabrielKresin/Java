package exercicio06;

import javax.swing.JOptionPane;

public class Aluno {

	String nome = "";
	String sexo;
	double quatAlunos = 0;
	double quantM = 0;
	double quantF = 0;
	double percM = 0;
	double percF = 0;
	double n1, n2, n3, n4;
	double media;
	String condicao;
	double quantParabens;
	double quantOtimo;
	double quantBom;
	double quantSatisfatorio;
	double quantRecuperacao;
	double quantReprovado;
	double percParabens;
	double perctOtimo;
	double perctBom;
	double perctSatisfatorio;
	double perctRecuperacao;
	double perctReprovado;
	
	public void laco() {

		do {
			pedeNome();
			if (nome.equals("sair")) {
				break;
			}
			pedeSexo();
			pedeNotas();
			contabilizaSexo();
			calculaM();
			calculaF();
			calculaMedia();
			verificaCondicao();
			contabilizaCondicao();
			contabilizaMedia();
			mostraDados();
		} while (!nome.equals("sair"));
		mostraDadosFinais();
	}
	
	public void  pedeNome() {
		boolean valido = false;
		do {
			try {
				nome = JOptionPane.showInputDialog("Digite o nome do aluno ou digite 'sair' para encerrar o programa");
				valido = true;
				if (nome.isEmpty()) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
	
	public void pedeSexo() {
		quatAlunos++;
		boolean valido = false;
		do {
			try {
				sexo = JOptionPane.showInputDialog("Digite 'M' para homem ou 'F' para mulher");
				valido = true;
				sexo = sexo.toUpperCase();
				if (sexo.isEmpty()) {
					valido = false;
				}
				if((!sexo.equals("M")) && (!sexo.equals("F"))){
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}
	
	public void pedeNotas() {
		boolean valido = false;
		do {
			try {
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
				valido = true;
				sexo = sexo.toUpperCase();
				if ((n1 < 0) || (n1 > 10)) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		
		valido = false;
		do {
			try {
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
				valido = true;
				sexo = sexo.toUpperCase();
				if ((n2 < 0) || (n2 > 10)) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		
		valido = false;
		do {
			try {
				n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
				valido = true;
				sexo = sexo.toUpperCase();
				if ((n3 < 0) || (n3 > 10)) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		
		valido = false;
		do {
			try {
				n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota"));
				valido = true;
				sexo = sexo.toUpperCase();
				if ((n4 < 0) || (n4 > 10)) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
		
	}
	
	public void contabilizaSexo() {
		if(sexo.equals("M")){
			quantM++;
		}else{
			quantF++;
		}
	}
	
	public double calculaM() {
		percM = (quantM/quatAlunos)*100;
		return percM;
	}
	
	public double calculaF() {
		percF = (quantF/quatAlunos)*100;
		return percF;
	}
	
	public double calculaMedia() {
		media = (n1+n2+n3+n4)/4;
		return media;
	}
	
	public String verificaCondicao() {
		if(media == 10){
			condicao = "Parabéns";
		}else if(media >= 9){
			condicao = "Ótimo";
		}else if(media >= 8){
			condicao = "Bom";
		}else if(media >= 7){
			condicao = "Satisfatório";
		}else if(media >= 5){
			condicao = "Recuperação";
		}else{
			condicao = "Reprovado";
		}
		return condicao;
	}
	
	public void contabilizaCondicao() {
		if(condicao.equals("Parabéns")){
			quantParabens++;
		}else if(condicao.equals("Ótimo")){
			quantOtimo++;
		}else if(condicao.equals("Bom")){
			quantBom++;
		}else if(condicao.equals("Satisfatório")){
			quantSatisfatorio++;
		}else if(condicao.equals("Recuperação")){
			quantRecuperacao++;
		}else{
			quantReprovado++;
		}
	}
	
	public void contabilizaMedia() {
		percParabens = (quantParabens/quatAlunos)*100;
		perctOtimo = (quantOtimo/quatAlunos)*100;
		perctBom = (quantBom/quatAlunos)*100;
		perctSatisfatorio = (quantSatisfatorio/quatAlunos)*100;
		perctRecuperacao = (quantRecuperacao/quatAlunos)*100;
		perctReprovado = (quantReprovado/quatAlunos)*100;
	}
	
	public void mostraDados() {
		String msg = "Nome: "+nome;
		msg += "\nMédia: "+media;
		msg += "\nCondição: "+condicao;
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void mostraDadosFinais() {
		String msg = "Quantidade e percentual de:";
		msg += "\nHomens: "+quantM+" | "+percM+"%";
		msg += "\nMulheres: "+quantF+" | "+percF+"%";
		msg += "\n\nQuantidade e porcentagem de notas:";
		msg += "\n"+quantParabens+" alunos tiraram 10, totalizando em "+percParabens+"%";
		msg += "\n"+quantOtimo+" alunos tiraram média entre 9.0 e 9.9, totalizando em "+perctOtimo+"%";
		msg += "\n"+quantBom+" alunos tiraram média entre 8.0 e 8.9, totalizando em "+perctBom+"%";
		msg += "\n"+quantSatisfatorio+" alunos tiraram média entre 7.0 e 7.9, totalizando em "+perctSatisfatorio+"%";
		msg += "\n"+quantRecuperacao+" alunos tiraram média entre 5.0 e 6.9, totalizando em "+perctRecuperacao+"%";
		msg += "\n"+quantReprovado+" alunos tiraram média abaixo de 5, totalizando em "+perctReprovado+"%";
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
