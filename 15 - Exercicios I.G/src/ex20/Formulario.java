package ex20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Formulario {

	public void inicializaFormulario() {
		
		JFrame formulario = new JFrame();
		JComboBox<String> estados = new JComboBox<>();
		JComboBox<String> cidadeSC = new JComboBox<>();
		JComboBox<String> cidadeRJ = new JComboBox<>();
		JComboBox<String> cidadeRS = new JComboBox<>();
		JButton botaoConfirmar = new JButton();
		JButton botaoConfirmar2 = new JButton();
		
		formulario.setTitle("Exercício 20");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(800, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
	
		estados.setBounds(10, 20, 170, 20);
		estados.addItem("Santa Catarina");
		estados.addItem("Rio de Janeiro");
		estados.addItem("Rio Grande do Sul");
		
		cidadeSC.setBounds(10, 40, 170, 20);
		cidadeSC.addItem("Blumenau");
		cidadeSC.addItem("Itajaí");
		cidadeSC.addItem("Joinville");
		
		cidadeRJ.setBounds(10, 60, 170, 20);
		cidadeRJ.addItem("Angra dos Reis");
		cidadeRJ.addItem("Rio de Janeiro");
		cidadeRJ.addItem("Teresópolis");
		
		cidadeRS.setBounds(10, 80, 170, 20);
		cidadeRS.addItem("Caxias do Sul");
		cidadeRS.addItem("Gramado");
		cidadeRS.addItem("Não-me-Toque");
		
		botaoConfirmar.setText("Confirmar");
		botaoConfirmar.setBounds(300, 140, 150, 20);
		
		botaoConfirmar2.setText("Confirmar");
		botaoConfirmar2.setBounds(300, 140, 150, 20);
		
		botaoConfirmar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String estado = estados.getSelectedItem().toString();
				Metodos m = new Metodos();
				if (estado.equals("Santa Catarina")) {
					cidadeSC.setVisible(true);
					estados.setVisible(false);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String cidade = cidadeSC.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.infoSC(cidade));
							formulario.dispose();
							inicializaFormulario();	
						}
					});
				}else if (estado.equals("Rio de Janeiro")) {
					cidadeRJ.setVisible(true);
					estados.setVisible(false);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String cidade = cidadeRJ.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.infoRJ(cidade));
							formulario.dispose();
							inicializaFormulario();	
						}
					});
					
				}else{
					cidadeRS.setVisible(true);
					estados.setVisible(false);
					botaoConfirmar.setVisible(false);
					botaoConfirmar2.setVisible(true);
					botaoConfirmar2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String cidade = cidadeRS.getSelectedItem().toString();
							JOptionPane.showMessageDialog(null, m.infoRS(cidade));
							formulario.dispose();
							inicializaFormulario();	
						}
					});
				}
				
			}
		});
		
		formulario.add(estados);
		formulario.add(cidadeSC);
		formulario.add(cidadeRJ);
		formulario.add(cidadeRS);
		formulario.add(botaoConfirmar);
		formulario.add(botaoConfirmar2);
		cidadeSC.setVisible(false);
		cidadeRS.setVisible(false);
		cidadeRJ.setVisible(false);
		botaoConfirmar2.setVisible(false);
		formulario.setVisible(true);
	}
}
