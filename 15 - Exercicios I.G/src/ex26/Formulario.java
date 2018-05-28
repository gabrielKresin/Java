package ex26;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario {

	public Formulario(){
		
		JFrame formulario = new JFrame();
		JLabel labelNumero1 = new JLabel();
		JTextField txtNumero1 = new JTextField();
		JLabel labelNome = new JLabel();
		JTextField txtNome = new JTextField();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 26");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelNumero1.setText("Idade:");
		labelNumero1.setBounds(10, 20, 150, 20);
		txtNumero1.setBounds(110, 20, 300, 20);
		
		labelNome.setText("Nome:");
		labelNome.setBounds(10, 40, 150, 20);
		txtNome.setBounds(110, 40, 300, 20);
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 140, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(txtNumero1.getText().toString());
				String nome = txtNome.getText().toString();
				Metodos m = new Metodos();
				if(m.validaIdade(n1) == true){
					JOptionPane.showMessageDialog(null, m.verificaIdade(n1,nome));
				}else{
					JOptionPane.showMessageDialog(null, "Idade inválida");
				}
			}
		});
		
		formulario.add(labelNumero1);
		formulario.add(txtNumero1);
		formulario.add(labelNome);
		formulario.add(txtNome);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
		
	}
}
