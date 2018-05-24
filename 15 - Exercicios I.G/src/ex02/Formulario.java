package ex02;

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
		JLabel labelValor = new JLabel();
		JTextField txtValor = new JTextField();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 2");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelValor.setText("Valor:");
		labelValor.setBounds(10, 20, 150, 20);
		txtValor.setBounds(110, 20, 300, 20);
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 100, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double valor = Double.parseDouble(txtValor.getText().toString());
				Metodos m = new Metodos();
				JOptionPane.showMessageDialog(null, m.calculaDesconto(valor));
				
			}
		});
		
		formulario.add(labelValor);
		formulario.add(txtValor);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
	}
}
