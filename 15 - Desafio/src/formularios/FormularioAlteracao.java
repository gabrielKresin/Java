package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controladores.Acao;

public class FormularioAlteracao {

	//Construtor
	public FormularioAlteracao(String produto, double valor, int quantidade, int linha) {

		//elementos
		JFrame formulario = new JFrame();
		JLabel rotulo1 = new JLabel();
		JLabel rotulo2 = new JLabel();
		JLabel rotulo3 = new JLabel();
		JTextField campo1 = new JTextField();
		JTextField campo2 = new JTextField();
		JTextField campo3 = new JTextField();
		JButton botaoAlterar = new JButton();
		JButton botaoExcluir = new JButton();
		JButton botaoCancelar = new JButton();

		//formulário principal
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(1000, 800);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Alterar dados");
		formulario.setLayout(null);

		//Label do produto
		rotulo1.setText("Produto:");
		rotulo1.setBounds(10, 20, 150, 20);

		//campo do produto
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

		//botão de alteração
		botaoAlterar.setText("Alterar");
		botaoAlterar.setBounds(10, 80, 150, 20);

		//botão de exclusão
		botaoExcluir.setText("Excluir");
		botaoExcluir.setBounds(210, 80, 150, 20);

		//botão de cancelamento
		botaoCancelar.setText("Cancelar");
		botaoCancelar.setBounds(410, 80, 150, 20);

		//Ação do botão excluir
		botaoExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Acao a = new Acao();
				a.excluir(linha);

				FormularioPrincipal fp = new FormularioPrincipal();
				fp.inicializaFormularioPrincipal();
				formulario.dispose();
				
			}
		});

		//ação do botão alterar
		botaoAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Acao a = new Acao();
				String produto = campo1.getText();
				double valor = Double.parseDouble(campo2.getText());
				int quantidade = Integer.parseInt(campo3.getText());
				if((a.verificaProduto(produto) == true) && (a.verificaValor(valor) == true) && (a.verificaQuantidade(quantidade) == true)){
					a.alterar(produto, valor, quantidade, linha);
					FormularioPrincipal fp = new FormularioPrincipal();
					fp.inicializaFormularioPrincipal();
					formulario.dispose();
					
				}else{
					JOptionPane.showMessageDialog(null, "Algum dado inserido é inválido");
				}

			}
		});

		//ação do botão cancelar
		botaoCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FormularioPrincipal fp = new FormularioPrincipal();
				fp.inicializaFormularioPrincipal();
				formulario.dispose();
				

			}
		});

		//adicionando os componentes ao formulário
		formulario.add(rotulo1);
		formulario.add(campo1);
		formulario.add(rotulo2);
		formulario.add(campo2);
		formulario.add(rotulo3);
		formulario.add(campo3);
		formulario.add(botaoAlterar);
		formulario.add(botaoExcluir);
		formulario.add(botaoCancelar);
		
		//deixando o formulário visível
		formulario.setVisible(true);
	}
}
