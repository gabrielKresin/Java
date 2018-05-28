package ex16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario {

	public void inicializaFormulario() {
		
		JFrame formulario = new JFrame();
		JLabel labelNumero1 = new JLabel();
		JTextField txtNumero1 = new JTextField();
		JComboBox<String> pedidos = new JComboBox<>();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 16");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelNumero1.setText("Dinheiro:");
		labelNumero1.setBounds(10, 20, 150, 20);
		txtNumero1.setBounds(110, 20, 300, 20);
		
		pedidos.setBounds(10, 40, 170, 20);
		pedidos.addItem("Hambúrguer + Suco de Laranja");
		pedidos.addItem("Sanduíche natural + Suco de Uva");
		pedidos.addItem("Prato do dia");
		pedidos.addItem("Pizza");
		pedidos.addItem("Lasanha");
		pedidos.addItem("Pão de queijo");
		pedidos.addItem("Bolo");
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 140, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = pedidos.getSelectedItem().toString();
				double n2 = Double.parseDouble(txtNumero1.getText().toString());
				Metodos m = new Metodos();
				JOptionPane.showMessageDialog(null, m.calculaTroco(txt, n2));
				
			}
		});
		
		formulario.add(pedidos);
		formulario.add(labelNumero1);
		formulario.add(txtNumero1);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
	}
}
