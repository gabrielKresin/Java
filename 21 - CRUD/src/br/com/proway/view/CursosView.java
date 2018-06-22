package br.com.proway.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.proway.dao.CursosDao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class CursosView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCurso;
	private JTextField txtValorCurso;
	private JTable table;
	private JTable tblListarCursos;
	private JScrollPane scrollPane;

	
	public CursosView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 604);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do curso:");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor do curso:");
		lblNewLabel_1.setBounds(10, 47, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNomeCurso = new JTextField();
		txtNomeCurso.setBounds(134, 8, 86, 20);
		contentPane.add(txtNomeCurso);
		txtNomeCurso.setColumns(10);
		
		txtValorCurso = new JTextField();
		txtValorCurso.setBounds(134, 44, 86, 20);
		contentPane.add(txtValorCurso);
		txtValorCurso.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirmar");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Obter dados informados
				String nomeCurso = txtNomeCurso.getText();
				double valorCurso = Double.parseDouble(txtValorCurso.getText());
				
				//Executar envio dos dados
				CursosDao cd = new CursosDao();
				cd.cadastrarCurso(nomeCurso, valorCurso);
				
				//Limpar Campos
				txtValorCurso.setText("");
				txtNomeCurso.setText("");
				
				//Cursos no campo nome curso
				txtNomeCurso.requestFocus();
			}
		});
		btnConfirm.setBounds(59, 102, 105, 23);
		contentPane.add(btnConfirm);
		
		table = new JTable();
		table.setBounds(268, 339, -124, -69);
		contentPane.add(table);
		
		//Objeto da classe cursoDao
		CursosDao cd = new CursosDao();
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(82, 205, 595, 334);
		contentPane.add(scrollPane);
		
		tblListarCursos = new JTable();
		scrollPane.setViewportView(tblListarCursos);
		tblListarCursos.setModel(cd.listarCurso());
	}
}
