package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controladores.Acao;
import controladores.Produto;

public class FormularioPrincipal {

	JFrame formulario = new JFrame();
	JLabel rotulo1 = new JLabel();	
	JTextField campo1 = new JTextField();
	JLabel rotulo2 = new JLabel();	
	JTextField campo2 = new JTextField();
	JLabel rotulo3 = new JLabel();	
	JTextField campo3 = new JTextField();
	JButton botaoCadastro = new JButton();
	JScrollPane barraRolagem = new JScrollPane();


	public void inicializaFormularioPrincipal() {
		//Formulário Principal
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(1000, 800);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Estoque");
		formulario.setLayout(null);

		//Label do produto
		rotulo1.setText("Produto");
		rotulo1.setBounds(10, 20, 150, 20);

		//Campo do produto
		campo1.setBounds(120, 20, 450, 20);

		//Label do valor
		rotulo2.setText("Valor");
		rotulo2.setBounds(10, 40, 110, 20);

		//Campo do valor
		campo2.setBounds(120, 40, 450, 20);

		//Label da quantidade
		rotulo3.setText("Quantidade");
		rotulo3.setBounds(10, 60, 150, 20);

		//Campo da quantidade
		campo3.setBounds(120, 60, 450, 20);

		//Botão de cadastro
		botaoCadastro.setText("Cadastrar");
		botaoCadastro.setBounds(400, 90, 150, 20);

		//Barra de rolagem do Jtable
		barraRolagem.setBounds(10, 130, 260, 100);


		//Ação do botão cadastrar
		botaoCadastro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Acao a = new Acao();
				String produto = campo1.getText();
				double valor = Double.parseDouble(campo2.getText());
				int quant = Integer.parseInt(campo3.getText());
				//	Produto p = new Produto();
				//	String str = "";
				if((a.verificaProduto(campo1) == true) && (a.verificaValor(campo2) == true) && (a.verificaQuantidade(campo3) == true)){
					a.salvaDados(produto,valor,quant);
					JOptionPane.showMessageDialog(null, "Dados Salvos");
					//	for (int i = 0; i < p.produtos.size(); i++) {
					//		str += p.produtos.get(i).nome+"\n";
					//	str += p.produtos.get(i).valor+"\n";
					//	str += p.produtos.get(i).quantidade+"\n\n";
					//	}
					//JOptionPane.showMessageDialog(null, str);
				}else{
					JOptionPane.showMessageDialog(null, "Algum dado inserido é inválido");
				}
				barraRolagem.setViewportView(a.exibirDados());

			}
		});




		//Componentes adicionados ao JFrame
		formulario.add(rotulo1);
		formulario.add(campo1);
		formulario.add(rotulo2);
		formulario.add(campo2);
		formulario.add(rotulo3);
		formulario.add(campo3);
		formulario.add(botaoCadastro);
		formulario.add(barraRolagem);

		//Deixando o formulário visível
		formulario.setVisible(true);
	}




}
