package br.com.proway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.proway.connection.ConnectionFactory;

public class CursosDao {

	//Atributo para obter a conexão
	private Connection conexao;
	
	//Construtor
	public CursosDao(){
		//Maneiras de se obter uma conexão
		//ConnectionFactory cf = new ConnectionFactory();
		//conexao = cf.obterConexao();
		
		this.conexao = new ConnectionFactory().obterConexao();
	}
	
	//Método para cadastrar um curso
	public void cadastrarCurso(String nomeCurso, double valorCurso) {
		
		//Comando SQL
		String sql = "INSERT INTO cursos(nomeCurso, valorCurso) VALUES (?,?)";
		
		//Tentar realizar o comando sql
		try {
			
			//Enviando os parâmetros e executando
			PreparedStatement pstmt = this.conexao.prepareStatement(sql);
			pstmt.setString(1, nomeCurso);
			pstmt.setDouble(2, valorCurso);
			pstmt.execute();
			
			//Fechar a conexão
			pstmt.close();
			
		} catch (Exception e) {
			
			//Caso haja falhas
			JOptionPane.showMessageDialog(null, "Falha ao inserir os dados. "+ e.getMessage());
			
		}
		
	}
	
	//Método para selecionar cursos
	public DefaultTableModel listarCurso() {
		
		//Criando o DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		
		//Definir as colunas do DefaultTableModel
		modelo.addColumn("Código");
		modelo.addColumn("Curso");
		modelo.addColumn("Valor");
		
		//Comando SQL
		String sql = "SELECT * FROM cursos";
		
		//Tentar realizar o comando SQL
		try {
			
			//Conectar e selecionar a conexão sql
			Statement stmt = conexao.createStatement();
			
			//Executando comando sql e obtendo dados
			ResultSet rs = stmt.executeQuery(sql);
			
			//Listando cursos
			while(rs.next()){
				modelo.addRow(new Object[]{
						rs.getInt("idCurso"),
						rs.getString("nomeCurso"),
						rs.getDouble("valorCurso")
				});
			}
			
			//Fechar a conexão
			stmt.close();
			
		} catch (Exception e) {
			
			//Caso haja falha na seleção
			JOptionPane.showMessageDialog(null, "Falha ao selecionar os cursos");
			
		}
		return modelo;
		
	}

}
