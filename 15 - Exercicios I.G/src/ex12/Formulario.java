package ex12;

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
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 11");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelNumero1.setText("Velocidade do motorista:");
		labelNumero1.setBounds(10, 20, 150, 20);
		txtNumero1.setBounds(160, 20, 300, 20);
		
		labelNumero2.setText("Velocidade permitida:");
		labelNumero2.setBounds(10, 40, 150, 20);
		txtNumero2.setBounds(160, 40, 300, 20);		
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 140, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double n1 = Double.parseDouble(txtNumero1.getText().toString());
				double n2 = Double.parseDouble(txtNumero2.getText().toString());
				Metodos m = new Metodos();
				JOptionPane.showMessageDialog(null, m.verificaMulta(n1, n2));
				
			}
		});
		
		formulario.add(labelNumero1);
		formulario.add(txtNumero1);
		formulario.add(labelNumero2);
		formulario.add(txtNumero2);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
	}
}
