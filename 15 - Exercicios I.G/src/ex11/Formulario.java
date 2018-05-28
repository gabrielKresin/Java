package ex11;

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
		JLabel labelNumero1 = new JLabel();
		JTextField txtNumero1 = new JTextField();
		JLabel labelNumero2 = new JLabel();
		JTextField txtNumero2 = new JTextField();
		JLabel labelNumero3 = new JLabel();
		JTextField txtNumero3 = new JTextField();
		JLabel labelNumero4 = new JLabel();
		JTextField txtNumero4 = new JTextField();
		JLabel labelNumero5 = new JLabel();
		JTextField txtNumero5 = new JTextField();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 11");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelNumero1.setText("nota 1:");
		labelNumero1.setBounds(10, 20, 150, 20);
		txtNumero1.setBounds(110, 20, 300, 20);
		
		labelNumero2.setText("nota 2:");
		labelNumero2.setBounds(10, 40, 150, 20);
		txtNumero2.setBounds(110, 40, 300, 20);		
		
		labelNumero3.setText("nota 3t:");
		labelNumero3.setBounds(10, 60, 150, 20);
		txtNumero3.setBounds(110, 60, 300, 20);	
		
		labelNumero4.setText("nota 4:");
		labelNumero4.setBounds(10, 80, 150, 20);
		txtNumero4.setBounds(110, 80, 300, 20);
		
		labelNumero5.setText("faltas:");
		labelNumero5.setBounds(10, 100, 150, 20);
		txtNumero5.setBounds(110, 100, 300, 20);
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 140, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtNumero1.getText().toString());
				double n2 = Double.parseDouble(txtNumero2.getText().toString());
				double n3 = Double.parseDouble(txtNumero3.getText().toString());
				double n4 = Double.parseDouble(txtNumero4.getText().toString());
				int n5 = Integer.parseInt(txtNumero5.getText().toString());
				Metodos m = new Metodos();
				JOptionPane.showMessageDialog(null, m.verificaSituacao(m.calculaMedia(n1, n2, n3, n4), n5));
			}
		});
		
		formulario.add(labelNumero1);
		formulario.add(txtNumero1);
		formulario.add(labelNumero2);
		formulario.add(txtNumero2);
		formulario.add(labelNumero3);
		formulario.add(txtNumero3);
		formulario.add(labelNumero4);
		formulario.add(txtNumero4);
		formulario.add(labelNumero5);
		formulario.add(txtNumero5);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
	}
}
