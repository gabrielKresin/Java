package controladores;

import javax.swing.table.DefaultTableModel;

import formularios.FormularioPrincipal;

public class Acao {

	Produto p = new Produto();
	FormularioPrincipal fm = new FormularioPrincipal();

	public boolean verificaProduto(String nomeProduto) {
		boolean valido;
		try{
			if(nomeProduto.isEmpty()){
				valido = false;
			}else{
				valido = true;
			}
		}catch (Exception e) {
			valido = false;
		}
		return valido;
	}

	public boolean verificaValor(Double valor) {
		boolean valido;
		try{
			if(valor <= 0){
				valido = false;
			}else{
				valido = true;
			}
		}catch (Exception e) {
			valido = false;
		}
		return valido;
	}

	public boolean verificaQuantidade(int quantidade) {
		boolean valido;
		try {
			if(quantidade < 0){
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

	public DefaultTableModel exibirDados(){
		
		DefaultTableModel tabela = new DefaultTableModel();
		//Colunas da tabela
		tabela.addColumn("Produto");
		tabela.addColumn("Valor");
		tabela.addColumn("Quantidade");

		//Linhas da tabela
		
		for (int i = 0; i < p.produtos.size(); i++) {
			tabela.addRow(new Object[]{p.produtos.get(i).nome, p.produtos.get(i).valor, p.produtos.get(i).quantidade});
		}

		// JTable para exibir o DefaultTableModel
		

		return tabela;
	}
	
	public void excluir(int linha) {
		Produto.produtos.remove(linha);
	}
	
	public void alterar(String produto, double valor, int quantidade, int linha) {
		
		Produto p = new Produto();
		p.nome = produto;
		p.valor = valor;
		p.quantidade = quantidade;
		
		p.produtos.set(linha, p);
	}
	
	
}
