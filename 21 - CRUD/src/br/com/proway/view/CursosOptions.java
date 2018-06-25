package br.com.proway.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.proway.bean.CursosBean;
import br.com.proway.dao.CursosDao;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CursosOptions extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;


	public CursosOptions(int codigo) {
		CursosDao cd = new CursosDao();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		System.out.println(codigo);
		
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursosDao cd = new CursosDao();
				CursosBean cb = new CursosBean();
				cb.setIdCurso(codigo);
				//cb.setIdCurso();
				cd.excluirCurso(cb);
			}
		});
		btnExcluir.setBounds(34, 188, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				CursosView cv = new CursosView();
				cv.setVisible(true);
			}
		});
		btnCancelar.setBounds(260, 188, 89, 23);
		contentPane.add(btnCancelar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursosBean cb = new CursosBean();
				
				
				
				
				cb.setIdCurso(codigo);
			}
		});
		btnAlterar.setBounds(150, 188, 89, 23);
		contentPane.add(btnAlterar);
		
		txtNome = new JTextField();
		txtNome.setBounds(227, 38, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(227, 95, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtNome.setText(cd.retornaNomeCurso(codigo));
		txtValor.setText(""+cd.retornaValorCurso(codigo));
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(34, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor:");
		lblNewLabel_1.setBounds(34, 101, 46, 14);
		contentPane.add(lblNewLabel_1);
	}

}
