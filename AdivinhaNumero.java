package adivinhaNumero;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class AdivinhaNumero extends JFrame {

	private JPanel contentPane;
	private JTextField textChute;
	public static int num = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdivinhaNumero frame = new AdivinhaNumero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdivinhaNumero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 538, 416);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFalaGenio = new JLabel("<html>Vou pensar em um número entre <strong>1 e 100</strong>.<br>Você consegue adivinhar o número em que eu estou pensando?</html>");
		lblFalaGenio.setHorizontalAlignment(SwingConstants.LEFT);
		lblFalaGenio.setVerticalAlignment(SwingConstants.TOP);
		lblFalaGenio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFalaGenio.setBounds(251, 42, 143, 70);
		contentPane.add(lblFalaGenio);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AdivinhaNumero.class.getResource("/images/speaking.png")));
		lblNewLabel.setBounds(224, 0, 271, 175);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Seu chute");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(274, 288, 120, 22);
		contentPane.add(lblNewLabel_3);
		
		textChute = new JTextField();
		textChute.setHorizontalAlignment(SwingConstants.CENTER);
		textChute.setBackground(new Color(144, 238, 144));
		textChute.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textChute.setBounds(306, 321, 83, 35);
		contentPane.add(textChute);
		textChute.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AdivinhaNumero.class.getResource("/images/icon_genie2.png")));
		lblNewLabel_2.setBounds(0, 0, 338, 534);
		contentPane.add(lblNewLabel_2);
		
		JButton btnEnviaChute = new JButton("Enviar");
		btnEnviaChute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random r = new Random();
				if (num == 0) {
					num = r.nextInt(100) + 1;
				}
				int chute = Integer.parseInt(textChute.getText());
				if(chute > num) {
					lblFalaGenio.setText("<html>Tente um valor <strong>menor</strong></html>");
				}
				else if(chute < num) {
					lblFalaGenio.setText("<html>Tente um valor <strong>maior</strong></html>");
				}
				else {	
					lblFalaGenio.setText("<html>Você acertou!!!</html>");
					lblFalaGenio.setFont(new Font("Tahoma", Font.BOLD, 20));
					num = 0;
				}
			}
		});
		btnEnviaChute.setBounds(406, 332, 89, 23);
		contentPane.add(btnEnviaChute);
	}

}
