package aula10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class VotaBrasil extends JFrame {

	private JPanel contentPane;
	private JTextField txtAno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotaBrasil frame = new VotaBrasil();
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
	public VotaBrasil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 257, 183);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 24, 114, 15);
		contentPane.add(lblNewLabel);
		
		txtAno = new JTextField();
		txtAno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtAno.setBounds(138, 22, 86, 20);
		contentPane.add(txtAno);
		txtAno.setColumns(10);
		
		JLabel lblResultado = new JLabel("<vazio>");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(41, 97, 150, 32);
		contentPane.add(lblResultado);
		
		JButton btnVoto = new JButton("<html>Posso votar?</html>");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int ano = Integer.parseInt(txtAno.getText());
				Calendar c = Calendar.getInstance();
				int idade = c.get(Calendar.YEAR) - ano;
				if(idade < 16) {
					lblResultado.setText("<html>Idade: " + idade + "<br>Proibido votar</html>");
				}
				else if((16 <= idade && idade < 18) || idade > 70) {
					lblResultado.setText("<html>Idade: " + idade + "<br>Voto opcional</html>");
				}
				else {
					lblResultado.setText("<html>Idade: " + idade + "<br>Voto obrigatório</html>");
				}
			}
		});
		btnVoto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVoto.setBounds(61, 63, 114, 23);
		contentPane.add(btnVoto);
	}
}
