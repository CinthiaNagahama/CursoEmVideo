package calculaBhaskara;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Bhaskara extends JFrame {

	private JPanel contentPane;
	public static double delta = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bhaskara frame = new Bhaskara();
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
	public Bhaskara() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>x + </html>");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel.setBounds(219, 46, 35, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblx = new JLabel("<html>x<sup>2</sup> + </html>");
		lblx.setFont(new Font("Arial", Font.PLAIN, 18));
		lblx.setBounds(126, 41, 35, 23);
		contentPane.add(lblx);
		
		JLabel lblNewLabel_2 = new JLabel("<html>=</html>");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(306, 46, 35, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("<html>&Delta =</html>");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(89, 88, 48, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblA = new JLabel("A");
		lblA.setForeground(new Color(204, 0, 0));
		lblA.setFont(new Font("Arial", Font.PLAIN, 24));
		lblA.setBounds(216, 93, 35, 25);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setForeground(new Color(204, 0, 0));
		lblB.setFont(new Font("Arial", Font.PLAIN, 24));
		lblB.setBounds(135, 94, 37, 22);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setForeground(new Color(204, 0, 0));
		lblC.setFont(new Font("Arial", Font.PLAIN, 24));
		lblC.setBounds(261, 89, 35, 32);
		contentPane.add(lblC);
		
		JLabel lblNewLabel_6 = new JLabel("<html><sup>2</sup> - 4 * </html>");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_6.setBounds(148, 80, 63, 39);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("*");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 24));
		lblNewLabel_7.setBounds(242, 95, 34, 21);
		contentPane.add(lblNewLabel_7);
		
		JSpinner spinnerA = new JSpinner();
		spinnerA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblA.setText(spinnerA.getValue().toString());
			}
		});
		spinnerA.setFont(new Font("Arial", Font.PLAIN, 18));
		spinnerA.setBounds(67, 37, 49, 32);
		contentPane.add(spinnerA);
		
		JSpinner spinnerB = new JSpinner();
		spinnerB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblB.setText(spinnerB.getValue().toString());
			}
		});
		spinnerB.setFont(new Font("Arial", Font.PLAIN, 18));
		spinnerB.setBounds(164, 37, 49, 32);
		contentPane.add(spinnerB);
		
		JSpinner spinnerC = new JSpinner();
		spinnerC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblC.setText(spinnerC.getValue().toString());
			}
		});
		spinnerC.setFont(new Font("Arial", Font.PLAIN, 18));
		spinnerC.setBounds(247, 37, 49, 32);
		contentPane.add(spinnerC);
		
		JPanel panResultado = new JPanel();
		panResultado.setVisible(false);
		panResultado.setBounds(10, 182, 374, 100);
		contentPane.add(panResultado);
		panResultado.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("<html>Valor de &Delta</html>");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(0, 11, 98, 20);
		panResultado.add(lblNewLabel_3);
		
		JLabel lblValorDelta = new JLabel("0");
		lblValorDelta.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorDelta.setForeground(new Color(102, 0, 204));
		lblValorDelta.setFont(new Font("Arial", Font.PLAIN, 18));
		lblValorDelta.setBounds(220, 12, 144, 20);
		panResultado.add(lblValorDelta);
		
		JLabel lblNewLabel_5 = new JLabel("<html>Tipo das Ra\u00EDzes</html>");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(0, 53, 154, 20);
		panResultado.add(lblNewLabel_5);
		
		JLabel lblTipoRaizes = new JLabel("<html>Existem duas raizes reais iguais</html>");
		lblTipoRaizes.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoRaizes.setForeground(new Color(102, 0, 204));
		lblTipoRaizes.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTipoRaizes.setBounds(220, 40, 162, 49);
		panResultado.add(lblTipoRaizes);
		

		JButton btnCalculaDelta = new JButton("<html>Calcula &Delta</html>");
		btnCalculaDelta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panResultado.setVisible(true);
				int a = Integer.parseInt(lblA.getText());
				int b = Integer.parseInt(lblB.getText());
				int c = Integer.parseInt(lblC.getText());
				
				delta = b * b - 4 * a *c;
				lblValorDelta.setText(String.format("%.2f", delta));
				
				if(delta < 0) {
					lblTipoRaizes.setText("<html>Não existem raízes Reais.</html>");
				}
				else if(delta == 0) {
					lblTipoRaizes.setText("<html>Existem duas raízes Reais iguais</html>");
				}
				else {
					lblTipoRaizes.setText("<html>Exitem duas raízes Reais.</html>");
				}
			}
		});
		btnCalculaDelta.setFont(new Font("Arial", Font.PLAIN, 18));
		btnCalculaDelta.setBounds(126, 129, 116, 32);
		contentPane.add(btnCalculaDelta);
		
		
		JPanel panRaizes = new JPanel();
		panRaizes.setVisible(false);
		panRaizes.setBounds(10, 350, 374, 40);
		contentPane.add(panRaizes);
		panRaizes.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("<html>Ra\u00EDzes</html>");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(0, 15, 63, 14);
		panRaizes.add(lblNewLabel_4);
		
		JPanel panResultadoRaizes = new JPanel();
		panResultadoRaizes.setBounds(222, 0, 152, 40);
		panRaizes.add(panResultadoRaizes);
		panResultadoRaizes.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("<html>x' = </html>");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(0, 0, 32, 14);
		panResultadoRaizes.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("<html>x'' = </html>");
		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_8_1_1.setBounds(0, 25, 38, 14);
		panResultadoRaizes.add(lblNewLabel_8_1_1);
		
		JLabel lblValorRaiz1 = new JLabel("0");
		lblValorRaiz1.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorRaiz1.setForeground(new Color(102, 0, 204));
		lblValorRaiz1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblValorRaiz1.setBounds(106, 0, 46, 18);
		panResultadoRaizes.add(lblValorRaiz1);
		
		JLabel lblValorRaiz2 = new JLabel("0");
		lblValorRaiz2.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorRaiz2.setForeground(new Color(102, 0, 204));
		lblValorRaiz2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblValorRaiz2.setBounds(106, 21, 46, 18);
		panResultadoRaizes.add(lblValorRaiz2);
		
		JButton btnCalculaRaizes = new JButton("<html>Calcula Raizes</html>");
		btnCalculaRaizes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(delta >= 0) {
					panRaizes.setVisible(true);
					int a = Integer.parseInt(lblA.getText());
					int b = Integer.parseInt(lblB.getText());
					double r1 = (b + Math.sqrt(delta)) /2 * a;
					double r2 = (b - Math.sqrt(delta)) /2 * a;
					lblValorRaiz1.setText(String.format("%.2f", r1));
					lblValorRaiz2.setText(String.format("%.2f", r2));
				}
				else {
					panRaizes.setVisible(false);
				}
			}
		});
		btnCalculaRaizes.setFont(new Font("Arial", Font.PLAIN, 18));
		btnCalculaRaizes.setBounds(110, 302, 170, 32);
		contentPane.add(btnCalculaRaizes);
	}
}
