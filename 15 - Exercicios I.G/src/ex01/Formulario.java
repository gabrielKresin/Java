package ex01;

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
		JLabel labelNome = new JLabel();
		JTextField txtNome = new JTextField();
		JLabel labelIdade = new JLabel();
		JTextField txtIdade = new JTextField();
		JLabel labelCidade = new JLabel();
		JTextField txtCidade = new JTextField();
		JButton botaoConfirmar = new JButton();
		
		
		formulario.setTitle("Exercício 1");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelNome.setText("Nome:");
		labelNome.setBounds(10, 20, 150, 20);
		txtNome.setBounds(110, 20, 300, 20);

		labelIdade.setText("Idade:");
		labelIdade.setBounds(10, 40, 150, 20);
		txtIdade.setBounds(110, 40, 300, 20);

		labelCidade.setText("Cidade:");
		labelCidade.setBounds(10, 60, 150, 20);
		txtCidade.setBounds(110, 60, 300, 20);
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 100, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText().toString();
				int idade = Integer.parseInt(txtIdade.getText().toString());
				String cidade = txtCidade.getText().toString();
				JOptionPane.showMessageDialog(null, "Olá "+nome+", você tem "+idade+" anos de idade e mora em "+cidade);
				
				txtNome.setText("");
				txtNome.requestFocus();
				txtIdade.setText("");
				txtIdade.requestFocus();
				txtCidade.setText("");
				txtCidade.requestFocus();
			}
		});
		
		formulario.add(labelNome);
		formulario.add(txtNome);
		formulario.add(labelIdade);
		formulario.add(txtIdade);
		formulario.add(labelCidade);
		formulario.add(txtCidade);
		formulario.add(botaoConfirmar);
		
		formulario.setVisible(true);
	}
}
