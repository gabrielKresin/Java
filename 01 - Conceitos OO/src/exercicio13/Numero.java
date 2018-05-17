package exercicio13;

import javax.swing.JOptionPane;

public class Numero {

	double numero;
	double resultado = 0;
	double numeroAntecessor = 0;
	int quantSomas = 0;
	double resultadoAnterior = 0;
	String resultados;

	public void laco(){
		int continuar = 0;
		do {
			pedeNumero();
			calculaResultados();
			mostraDados();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja informar mais um número");
		} while (continuar == 0);
	}

	public void pedeNumero() {
		boolean valido = false;
		do {
			try {
				numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
				valido = true;
				if (numero < 2) {
					valido = false;
				}
			} catch (Exception e) {
				valido = false;
				JOptionPane.showConfirmDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public String calculaResultados() {
		resultados = "";
		quantSomas = 0;
		numeroAntecessor = numero - 1;
		if (numero>1) {
			do {
				if (quantSomas==0) {
					resultado = numero*numeroAntecessor;
					resultados += numero+" x "+numeroAntecessor+" = "+resultado+"\n";
					quantSomas++;
					numeroAntecessor--;
					numero--;
					resultadoAnterior = resultado;
				}else{
					resultado = resultado*numeroAntecessor;
					resultados += resultadoAnterior+" x "+numeroAntecessor+" = "+resultado+"\n";
					numeroAntecessor--;
					numero--;
					resultadoAnterior = resultado;
				}
			} while (numeroAntecessor>=1);
		} else {
			do {
				if (quantSomas==0) {
					resultado = numero*numeroAntecessor;
					resultados += numero+" x "+numeroAntecessor+" = "+resultado+"\n";
					quantSomas++;
					numeroAntecessor--;
					numero++;
					resultadoAnterior = resultado; 
				} else{
					resultado = resultado*numeroAntecessor;
					resultados += resultadoAnterior+" x "+numeroAntecessor+" = "+resultado+"\n";
					numeroAntecessor--;
					numero++;
					resultadoAnterior = resultado;
				}
			} while (numeroAntecessor<=1);
		}
		return resultados;
	}

	public void mostraDados() {
		String msg = resultados;
		
		JOptionPane.showMessageDialog(null, msg);
	}
}
