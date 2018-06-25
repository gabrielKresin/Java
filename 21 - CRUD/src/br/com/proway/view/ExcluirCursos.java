package br.com.proway.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.proway.bean.CursosBean;
import br.com.proway.dao.CursosDao;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExcluirCursos extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;

	public ExcluirCursos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setBounds(70, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtId = new JTextField();
		txtId.setBounds(214, 8, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursosDao cd = new CursosDao();
				CursosBean cb = new CursosBean();
				
				cb.setIdCurso(Integer.parseInt(txtId.getText()));
				
				cd.excluirCurso(cb);
				
				dispose();
				
				CursosView cv = new CursosView();
				cv.setVisible(true);
			}
		});
		btnConfirmar.setBounds(70, 129, 89, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				CursosView cv = new CursosView();
				cv.setVisible(true);
			}
		});
		btnCancelar.setBounds(214, 129, 89, 23);
		contentPane.add(btnCancelar);
	}
}
