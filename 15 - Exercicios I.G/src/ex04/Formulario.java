package ex04;

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
		JLabel labelNome = new JLabel();
		JTextField txtNome = new JTextField();
		JLabel labelValor = new JLabel();
		JTextField txtValor = new JTextField();
		JComboBox<String> opcoes = new JComboBox<>();
		JButton botaoConfirmar = new JButton();
		
		formulario.setTitle("Exercício 4");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		labelNome.setText("Nome do produto:");
		labelNome.setBounds(10, 20, 150, 20);
		txtNome.setBounds(110, 20, 300, 20);
		
		labelValor.setText("Valor do produto:");
		labelValor.setBounds(10, 40, 150, 20);
		txtValor.setBounds(110, 40, 300, 20);
		
		opcoes.setBounds(10, 60, 170, 30);
		opcoes.addItem("A vista");
		opcoes.addItem("A prazo");
		opcoes.addItem("No cartão");
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 100, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(txtValor.getText().toString());
				String nome = txtNome.getText().toString();
				String texto = opcoes.getSelectedItem().toString();
				Metodos m = new Metodos();
				if(m.verificaPagamento(texto, valor) == true){
					JOptionPane.showMessageDialog(null, "O produto "+nome+" custará R$"+m.calculaDesconto(valor));
				}else{
					JOptionPane.showMessageDialog(null, "O produto "+nome+" custará R$"+valor);
				}
				
			}
		});
		
		formulario.add(labelNome);
		formulario.add(txtNome);
		formulario.add(labelValor);
		formulario.add(txtValor);
		formulario.add(opcoes);
		formulario.add(botaoConfirmar);
		formulario.setVisible(true);
	}
}
