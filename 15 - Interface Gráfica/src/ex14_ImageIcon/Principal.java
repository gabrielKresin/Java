package ex14_ImageIcon;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		
		// JFrame
				JFrame formulario = new JFrame("Manipulando imagens");
				formulario.setSize(273, 300);
				formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				formulario.setLocationRelativeTo(null);
				formulario.setLayout(null);
				
				// Obtendo o caminho da imagem (Com a classe URL você pode criar um objeto que tenha o caminho para qualquer tipo de arquivo)
				URL caminhoDaImagem = Principal.class.getResource("/imagens/icone_java.png");
				
				// Objeto para obter a imagem
				ImageIcon imagem = new ImageIcon(caminhoDaImagem);		
				
				// JLabel
				JLabel exibirImagem = new JLabel();
				exibirImagem.setIcon(imagem);
				exibirImagem.setBounds(0, 0, 256, 256);
				
				// Adicionar ao JFrame
				formulario.add(exibirImagem);
				
				// Exibir formulário
				formulario.setVisible(true);

	}

}
