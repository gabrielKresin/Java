package exercicio01;

import javax.swing.JOptionPane;

public class Calculadora {

	double numero1;
	double numero2;
	double resultado;
	Object[] calculadora = {"Soma","Subtração","Multiplicação","Divisão","Seno","Cosseno","Tangente","Log","Raiz Quadrada","Raiz Cúbica","Sair"};
	Object calculo = "";

	public void laco() {
		do {
			pedeOpcao();
			if (calculo.equals("Sair")) {
				break;
			}
			verificaOpcao();
			mostrarResultado();
		} while (!calculo.equals("Sair"));
	}

	public void pedeOpcao() {
		boolean valido = false;
		do {
			try {
				calculo = JOptionPane.showInputDialog(null, "Seleciona uma operação", "Calculadora", JOptionPane.PLAIN_MESSAGE, null, calculadora, "");
				valido = true;
			} catch (Exception e) {
				valido = false;
				JOptionPane.showMessageDialog(null, "Erro");
			}
		} while (valido == false);
	}

	public void verificaOpcao() {
		switch (String.valueOf(calculo)) {
		case "Soma":
			soma();
			break;
		case "Subtração":
			subtracao();
			break;
		case "Multiplicação":
			multiplicacao();
			break;
		case "Divisão":
			divisao();
			break;
		case "Seno":
			seno();
			break;
		case "Cosseno":
			cosseno();
			break;
		case "Tangente":
			tangente();
			break;
		case "Log":
			log();
			break;
		case "Raiz Quadrada":
			raizQuadrada();
			break;
		case "Raiz Cúbica":
			raizCubica();
			break;
		}
	}

	public double soma() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
			valido = true;
		} while (valido == false);
		do {
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
			valido = true;
		} while (valido == false);
		valido = false;
		
		resultado = numero1 + numero2;
		return resultado;
	}

	public double subtracao() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
			valido = true;
		} while (valido == false);
		do {
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
			valido = true;
		} while (valido == false);
		valido = false;
		
		resultado = numero1 - numero2;
		return resultado;
	}

	public double multiplicacao() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
			valido = true;
		} while (valido == false);
		do {
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
			valido = true;
		} while (valido == false);
		valido = false;
		
		resultado = numero1 * numero2;
		return resultado;
		
	}

	public double divisao() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
			valido = true;
		} while (valido == false);
		do {
			numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
			valido = true;
		} while (valido == false);
		valido = false;
		
		resultado = numero1 / numero2;
		return resultado;
	}

	public double seno() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			valido = true;
			if ((numero1 < 1) || (numero1 > 90)) {
				valido = false;
			}
		} while (valido == false);
		
		
		resultado = Math.sin(numero1);
		return resultado;
	}

	public double cosseno() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			valido = true;
			if ((numero1 < 1) || (numero1 > 90)) {
				valido = false;
			}
		} while (valido == false);
		
		
		resultado = Math.cos(numero1);
		return resultado;
	}

	public double tangente() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			valido = true;
			if ((numero1 < 1) || (numero1 > 90)) {
				valido = false;
			}
		} while (valido == false);
		
		
		resultado = Math.tan(numero1);
		return resultado;
	}

	public double log() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um logarítmo de base 10"));
			valido = true;
		} while (valido == false);
		
		resultado = Math.log10(numero1);
		return resultado;
	}

	public double raizQuadrada() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			valido = true;
		} while (valido == false);
		
		resultado = Math.sqrt(numero1);
		return resultado;
	}

	public double raizCubica() {
		boolean valido = false;
		do {
			numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));
			valido = true;
		} while (valido == false);
		
		resultado = Math.cbrt(numero1);
		return resultado;
	}

	public void mostrarResultado() {
		String msg = "O resultado é: "+resultado;
		JOptionPane.showMessageDialog(null, msg);
		
	}

}
