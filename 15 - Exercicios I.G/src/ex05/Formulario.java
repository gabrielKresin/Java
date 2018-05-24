package ex05;

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
		JLabel labelData = new JLabel();
		JTextField txtData = new JTextField();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 5");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelData.setText("Digite a data:");
		labelData.setBounds(10, 20, 150, 20);
		txtData.setBounds(110, 20, 300, 20);
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 100, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int dia = Integer.parseInt(txtData.getText().toString());
				Metodos m = new Metodos();
				if(m.validaDia(dia) == true){
					JOptionPane.showMessageDialog(null, m.verificaDia(dia));
				}else{
					JOptionPane.showMessageDialog(null, "Dia inválido");
				}
				
			}
		});
	}
}
