package ex03;

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
		JLabel labelNota1 = new JLabel();
		JTextField txtNota1 = new JTextField();
		JLabel labelNota2 = new JLabel();
		JTextField txtNota2 = new JTextField();
		JLabel labelNota3 = new JLabel();
		JTextField txtNota3 = new JTextField();
		JLabel labelNota4 = new JLabel();
		JTextField txtNota4 = new JTextField();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 3");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		labelNota1.setText("Nota 1:");
		labelNota1.setBounds(10, 20, 150, 20);
		txtNota1.setBounds(110, 20, 300, 20);
		
		labelNota2.setText("Nota 2:");
		labelNota2.setBounds(10, 40, 150, 20);
		txtNota2.setBounds(110, 40, 300, 20);
		
		labelNota3.setText("Nota 3:");
		labelNota3.setBounds(10, 60, 150, 20);
		txtNota3.setBounds(110, 60, 300, 20);
		
		labelNota4.setText("Nota 4:");
		labelNota4.setBounds(10, 80, 150, 20);
		txtNota4.setBounds(110, 80, 300, 20);
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 100, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(txtNota1.getText().toString());
				double n2 = Double.parseDouble(txtNota2.getText().toString());
				double n3 = Double.parseDouble(txtNota3.getText().toString());
				double n4 = Double.parseDouble(txtNota4.getText().toString());
				Metodos m = new Metodos();
				JOptionPane.showMessageDialog(null, m.verificaSituacao(m.calculaMedia(n1, n2, n3, n4)));
				
			}
		});
		
		formulario.add(labelNota1);
		formulario.add(txtNota1);
		formulario.add(labelNota2);
		formulario.add(txtNota2);
		formulario.add(labelNota3);
		formulario.add(txtNota3);
		formulario.add(labelNota4);
		formulario.add(txtNota4);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
	}
}
