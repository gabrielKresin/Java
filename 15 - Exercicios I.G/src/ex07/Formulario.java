package ex07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario {

	public void inicializaFormulario() {
		
		JFrame formulario = new JFrame();
		JLabel labelNumero = new JLabel();
		JTextField txtNumero = new JTextField();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 7");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelNumero.setText("Digite um número:");
		labelNumero.setBounds(10, 20, 150, 20);
		txtNumero.setBounds(110, 20, 300, 20);
		

		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 100, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double num = Double.parseDouble(txtNumero.getText().toString());
				
				Metodos m = new Metodos();
				JOptionPane.showMessageDialog(null, m.tabuada(num));
				
			}
		});
		
		formulario.add(labelNumero);
		formulario.add(txtNumero);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
	}
}
