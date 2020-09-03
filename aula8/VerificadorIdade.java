package aula8;

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

public class VerificadorIdade extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldAnoNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerificadorIdade frame = new VerificadorIdade();
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
	public VerificadorIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 255, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 29, 143, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 113, 58, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 157, 58, 20);
		contentPane.add(lblNewLabel_2);
		
		textFieldAnoNasc = new JTextField();
		textFieldAnoNasc.setBounds(139, 34, 67, 20);
		contentPane.add(textFieldAnoNasc);
		textFieldAnoNasc.setColumns(10);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdade.setBounds(110, 122, 96, 28);
		contentPane.add(lblIdade);
		
		JLabel lblSituacao = new JLabel("<vazio>");
		lblSituacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblSituacao.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSituacao.setBounds(78, 161, 134, 20);
		contentPane.add(lblSituacao);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int anoNasc = Integer.parseInt(textFieldAnoNasc.getText());
				Calendar c = Calendar.getInstance();
				int idade = c.get(Calendar.YEAR) - anoNasc;
				lblIdade.setText(Integer.toString(idade));
				String situacao = (idade >= 18 ? "Maior de Idade" : "Menor de Idade");
				lblSituacao.setText(situacao);
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCalcular.setBounds(65, 68, 102, 28);
		contentPane.add(btnCalcular);
	}

}
