package ex07_JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		//JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 130);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JCheckBox");
		formulario.setLayout(null);

		//JCheckBox
		JRadioButton rbtMasculino = new JRadioButton("Masculino");
		rbtMasculino.setBounds(10, 10, 100, 20);

		JRadioButton rbtFeminino = new JRadioButton("Feminino");
		rbtFeminino.setBounds(110, 10, 100, 20);

		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);

		//ação
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if((rbtMasculino.isSelected()) && (rbtFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estão selecionados");
				}else if(rbtMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculino selecionado");
				}else if(rbtFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminino selecionado");
				}else{
					JOptionPane.showMessageDialog(null, "Nenhum selecionado");
				}
				
			}
		});
		
		//adicionando componente ao Jframe
		formulario.add(rbtMasculino);
		formulario.add(rbtFeminino);
		formulario.add(botao);

		//exibir toda a estrutura
		formulario.setVisible(true);


	}

}
