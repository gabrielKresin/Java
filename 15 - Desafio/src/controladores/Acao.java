package controladores;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import formularios.FormularioPrincipal;

public class Acao {

	Produto p = new Produto();
	FormularioPrincipal fm = new FormularioPrincipal();

	public boolean verificaProduto(JTextField nomeProduto) {
		boolean valido;
		try{
			if(String.valueOf(nomeProduto.getText()).isEmpty()){
				valido = false;
			}else{
				valido = true;
			}
		}catch (Exception e) {
			valido = false;
		}
		return valido;
	}

	public boolean verificaValor(JTextField valor) {
		boolean valido;
		try{
			if(Double.parseDouble(String.valueOf(valor.getText())) <= 0){
				valido = false;
			}else{
				valido = true;
			}
		}catch (Exception e) {
			valido = false;
		}
		return valido;
	}

	public boolean verificaQuantidade(JTextField quantidade) {
		boolean valido;
		try {
			if(Integer.parseInt(String.valueOf(quantidade.getText())) < 0){
				valido = false;
			}else{
				valido = true;
			}
		} catch (Exception e) {
			valido = false;
		}
		return valido;
	}

	public void salvaDados(String nome, double valor, int quantidade) {

		Produto p = new Produto();
		p.nome = nome;
		p.valor = valor;
		p.quantidade = quantidade;
		p.produtos.add(p);

	}

	public JTable exibirDados(){
		
		DefaultTableModel exibirDados = new DefaultTableModel();

		//Colunas da tabela
		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Valor");
		exibirDados.addColumn("Quantidade");

		//Linhas da tabela
		for (int i = 0; i < p.produtos.size(); i++) {
			exibirDados.addRow(new Object[]{p.produtos.get(i).nome, p.produtos.get(i).quantidade, p.produtos.get(i).valor});
		}

		// JTable para exibir o DefaultTableModel
		JTable tabela = new JTable(exibirDados);

		return tabela;
	}
}
