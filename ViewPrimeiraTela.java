package aula5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewPrimeiraTela {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewPrimeiraTela window = new ViewPrimeiraTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewPrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMensagem = new JLabel("Aqui vai aparecer a mensagem");
		lblMensagem.setFont(new Font("Lucida Console", Font.PLAIN, 24));
		lblMensagem.setBounds(22, 66, 402, 65);
		frame.getContentPane().add(lblMensagem);
		
		JButton btnClique = new JButton("Clique em mim");
		btnClique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMensagem.setText("Olá Mundo!");
			}
		});
		btnClique.setFont(new Font("Lucida Console", Font.PLAIN, 18));
		btnClique.setBounds(125, 142, 185, 32);
		frame.getContentPane().add(btnClique);
	}
}
