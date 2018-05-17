package ex02_JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		
		//instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Olá mundo");
		rotulo.setBounds(50, 50, 300, 20);
		
		//Adicionar componente ao JFrame
		formulario.add(rotulo);
		
	}

}
