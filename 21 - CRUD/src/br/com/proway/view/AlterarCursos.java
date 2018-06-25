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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarCursos extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;
	private JTextField txtNome;
	private JTextField txtId;

	
	public AlterarCursos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CursosView cv = new CursosView();
				CursosBean cb = new CursosBean();
				CursosDao cd = new CursosDao();
				
				cb.setIdCurso(Integer.parseInt(txtId.getText()));
				cb.setNomeCurso(txtNome.getText());
				cb.setValorCurso(Double.parseDouble(txtValor.getText()));
				
				cd.alterarCurso(cb);
				
				dispose();
				
				cv.setVisible(true);
				
			}
		});
		btnConfirmar.setBounds(72, 173, 89, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				CursosView cv = new CursosView();
				cv.setVisible(true);
			}
		});
		btnCancelar.setBounds(235, 173, 89, 23);
		contentPane.add(btnCancelar);
		
		txtValor = new JTextField();
		txtValor.setBounds(235, 121, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(235, 72, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Valor:");
		lblNewLabel.setBounds(72, 124, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setBounds(72, 75, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtId = new JTextField();
		txtId.setBounds(235, 26, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(72, 29, 46, 14);
		contentPane.add(lblId);
	}
}
