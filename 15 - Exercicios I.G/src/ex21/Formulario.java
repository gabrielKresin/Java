package ex21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Formulario {

	public void inicializaFormulario() {
		
		JFrame formulario = new JFrame();
		JComboBox<String> produtos = new JComboBox<>();
		JComboBox<String> pagamentos = new JComboBox<>();
		JButton botaoConfirmar = new JButton();
		JButton botaoConfirmar2 = new JButton();
		
		formulario.setTitle("Exercício 21");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		produtos.setBounds(10, 20, 170, 20);
		produtos.addItem("Calça");
		produtos.addItem("Camisa");
		produtos.addItem("Casaco");
		produtos.addItem("Meias");
		produtos.addItem("Paletó");
		
		pagamentos.setBounds(10, 40, 170, 20);
		pagamentos.addItem("A vista");
		pagamentos.addItem("A prazo 30 dias");
		pagamentos.addItem("A prazo 60 dias");
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 140, 150, 20);
		
		botaoConfirmar2.setText("Confirmar");
		botaoConfirmar2.setBounds(300, 140, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Metodos m = new Metodos();
				String produto = produtos.getSelectedItem().toString();
				if(produto.equals("Calça")){
					produtos.setVisible(false);
					pagamentos.setVisible(true);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String pagamento = pagamentos.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.pagamentoCalca(pagamento));
							formulario.dispose();
							inicializaFormulario();
						}
					});
				}else if (produto.equals("Camisa")) {
					produtos.setVisible(false);
					pagamentos.setVisible(true);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String pagamento = pagamentos.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.pagamentoCamisa(pagamento));
							formulario.dispose();
							inicializaFormulario();
						}
					});					
				}else if (produto.equals("Casaco")) {
					produtos.setVisible(false);
					pagamentos.setVisible(true);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String pagamento = pagamentos.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.pagamentoCasaco(pagamento));
							formulario.dispose();
							inicializaFormulario();
						}
					});
				}else if (produto.equals("Meias")) {
					produtos.setVisible(false);
					pagamentos.setVisible(true);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String pagamento = pagamentos.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.pagamentoMeias(pagamento));
							formulario.dispose();
							inicializaFormulario();
						}
					});
				}else{
					produtos.setVisible(false);
					pagamentos.setVisible(true);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String pagamento = pagamentos.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.pagamentoPaleto(pagamento));
							formulario.dispose();
							inicializaFormulario();
						}
					});
				}
				
			}
		});
		
		formulario.add(produtos);
		formulario.add(pagamentos);
		formulario.add(botaoConfirmar);
		formulario.add(botaoConfirmar2);
		pagamentos.setVisible(false);
		botaoConfirmar2.setVisible(false);
		formulario.setVisible(true);
		
	}
}
