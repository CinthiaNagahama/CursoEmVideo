package aula7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperacoesAritmeticas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldA;
	private JTextField textFieldB;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperacoesAritmeticas frame = new OperacoesAritmeticas();
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
	public OperacoesAritmeticas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldA = new JTextField();
		textFieldA.setBounds(150, 22, 86, 20);
		contentPane.add(textFieldA);
		textFieldA.setColumns(10);
		
		textFieldB = new JTextField();
		textFieldB.setBounds(150, 68, 86, 20);
		contentPane.add(textFieldB);
		textFieldB.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Insira um valor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(22, 69, 124, 14);
		contentPane.add(lblNewLabel);
		

		JLabel lblNewLabel_2 = new JLabel("Insira um valor");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(22, 23, 124, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Resultado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(22, 146, 102, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRes = new JLabel("0");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		lblRes.setForeground(new Color(0, 128, 0));
		lblRes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRes.setBounds(62, 173, 124, 42);
		contentPane.add(lblRes);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1 = Float.parseFloat(textFieldA.getText());
				float n2 = Float.parseFloat(textFieldB.getText());
				float res = n1 + n2;
				lblRes.setText(Float.toString(res));
			}
		});
		btnSoma.setBounds(22, 108, 46, 23);
		contentPane.add(btnSoma);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1 = Float.parseFloat(textFieldA.getText());
				float n2 = Float.parseFloat(textFieldB.getText());
				float res = n1 - n2;
				lblRes.setText(Float.toString(res));
			}
		});
		btnSub.setBounds(78, 108, 46, 23);
		contentPane.add(btnSub);
		
		JButton btnMult = new JButton("x");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1 = Float.parseFloat(textFieldA.getText());
				float n2 = Float.parseFloat(textFieldB.getText());
				float res = n1 * n2;
				lblRes.setText(Float.toString(res));
			}
		});
		btnMult.setBounds(134, 108, 46, 23);
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float n1 = Float.parseFloat(textFieldA.getText());
				float n2 = Float.parseFloat(textFieldB.getText());
				if(n2 != 0) {
					float res = n1 / n2;
					lblRes.setText(Float.toString(res));
				}
				else {
					lblRes.setText("Divisão por zero");
					lblRes.setFont(new Font("Tahoma", Font.PLAIN, 16));
				}
			}
		});
		btnDiv.setBounds(190, 108, 46, 23);
		contentPane.add(btnDiv);
	}
}