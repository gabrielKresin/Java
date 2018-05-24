package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import controladores.Acao;

public class FormularioPrincipal {

	JFrame formulario = new JFrame();
	JLabel rotulo1 = new JLabel();	
	JTextField campo1 = new JTextField();
	JLabel rotulo2 = new JLabel();	
	JTextField campo2 = new JTextField();
	JLabel rotulo3 = new JLabel();	
	JTextField campo3 = new JTextField();
	JButton botaoCadastro = new JButton();


	public void inicializaFormularioPrincipal() {

		Acao a = new Acao();
		
		JTable tabela = new JTable(a.exibirDados());
		JScrollPane barraRolagem = new JScrollPane(tabela);
		
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

				if((a.verificaProduto(produto) == true) && (a.verificaValor(valor) == true) && (a.verificaQuantidade(quant) == true)){
					a.salvaDados(produto,valor,quant);
					JOptionPane.showMessageDialog(null, "Dados Salvos");
				}else{
					JOptionPane.showMessageDialog(null, "Algum dado inserido é inválido");
				}
				tabela.setModel(a.exibirDados());
				
			}
		});
		
		//Verificar se o usuário quer alterar a tabela
		
		tabela.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// pegando a linha pressionada
				int linhaPressionada = tabela.getSelectedRow();
				
				//pegando os dados alterados
				String produto = tabela.getValueAt(linhaPressionada, 0).toString();
				Double valor = Double.parseDouble(tabela.getValueAt(linhaPressionada, 1).toString());
				int quantidade = Integer.parseInt(tabela.getValueAt(linhaPressionada, 2).toString());
				
				//criando um formulário de alteração
				FormularioAlteracao fa = new FormularioAlteracao(produto, valor, quantidade, linhaPressionada);
				
				//fechar formulário principal
				formulario.dispose();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
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
