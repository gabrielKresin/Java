package br.com.proway.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import br.com.proway.bean.CursosBean;
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
	public void cadastrarCurso(CursosBean cb) {

		//Comando SQL
		String sql = "INSERT INTO cursos(nomeCurso, valorCurso) VALUES (?,?)";

		//Tentar realizar o comando sql
		try {

			//Enviando os parâmetros e executando
			PreparedStatement pstmt = this.conexao.prepareStatement(sql);
			pstmt.setString(1, cb.getNomeCurso());
			pstmt.setDouble(2, cb.getValorCurso());
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

	//Método para excluir um curso
	public void excluirCurso(CursosBean cb) {

		//Comando SQL
		String sql = "DELETE from cursos WHERE idCurso = ? ";

		//Tentar realizar o comando sql
		try {

			//Enviando os parâmetros e executando
			PreparedStatement pstmt = this.conexao.prepareStatement(sql);
			pstmt.setInt(1, cb.getIdCurso());

			pstmt.execute();
			//Fechar a conexão
			pstmt.close();

		} catch (Exception e) {

			//Caso haja falhas
			JOptionPane.showMessageDialog(null, "Falha ao excluir os dados. "+ e.getMessage());

		}
	}

	//Método para alterar um curso
	public void alterarCurso(CursosBean cb) {

		//Comando SQL
		String sql = "UPDATE cursos SET nomeCurso = ? , valorCurso = ?  WHERE idCurso = ?";

		//Tentar realizar o comando sql
		try {

			//Enviando os parâmetros e executando
			PreparedStatement pstmt = this.conexao.prepareStatement(sql);
			pstmt.setString(1, cb.getNomeCurso());
			pstmt.setDouble(2, cb.getValorCurso());
			pstmt.setInt(3, cb.getIdCurso());

			pstmt.execute();
			//Fechar a conexão
			pstmt.close();

		} catch (Exception e) {

			//Caso haja falhas
			JOptionPane.showMessageDialog(null, "Falha ao alterar os dados. "+ e.getMessage());

		}
	}

	public String retornaNomeCurso(int codigo) {
		String nomeCurso = "";

		//Comando SQL
		String sql = "SELECT nomeCurso FROM cursos WHERE idCurso = " + codigo;

		//Tentar realizar o comando SQL
		try {
			
			//Conectar e selecionar a conexão sql
			Statement stmt = conexao.createStatement();

			//Executando comando sql e obtendo dados
			ResultSet rs = stmt.executeQuery(sql);

			//Listando cursos
			while(rs.next()){
				nomeCurso = rs.getString("nomeCurso");
			}

			//Fechar a conexão
			stmt.close();

		} catch (Exception e) {

			//Caso haja falhas
			JOptionPane.showMessageDialog(null, "Falha ao carregar os dados. "+ e.getMessage());

		}
		System.out.println(nomeCurso);
		return nomeCurso;
	}

	public double retornaValorCurso(int codigo) {
		double valorCurso = 0;

		//Comando SQL
		String sql = "SELECT valorCurso FROM cursos WHERE idCurso = " + codigo;

		//Tentar realizar o comando SQL
		try {
			//Conectar e selecionar a conexão sql
			Statement stmt = conexao.createStatement();

			//Executando comando sql e obtendo dados
			ResultSet rs = stmt.executeQuery(sql);

			//Listando cursos
			while(rs.next()){
				valorCurso = rs.getDouble("valorCurso");
			}

			//Fechar a conexão
			stmt.close();

		} catch (Exception e) {

			//Caso haja falhas
			JOptionPane.showMessageDialog(null, "Falha ao carregar os dados. "+ e.getMessage());

		}

		return valorCurso;

	}

}
