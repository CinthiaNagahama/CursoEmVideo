package calculadoraIdade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerNumberModel;

public class CalculadoraIdade extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraIdade frame = new CalculadoraIdade();
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
	public CalculadoraIdade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 241, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ano de Nascimento");
		lblNewLabel.setBounds(10, 42, 116, 14);
		contentPane.add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1900, 1900, 2020, 1));
		spinner.setBounds(136, 39, 65, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_1 = new JLabel("Ao final desse ano sua idade será");
		lblNewLabel_1.setBounds(10, 118, 191, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblIdade = new JLabel("0");
		lblIdade.setForeground(new Color(34, 139, 34));
		lblIdade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdade.setBounds(99, 143, 64, 30);
		contentPane.add(lblIdade);
		
		JLabel lblNewLabel_2 = new JLabel("Ano Atual");
		lblNewLabel_2.setBounds(10, 17, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		Calendar relogio = Calendar.getInstance();
		JLabel lblAnoAtual = new JLabel(Integer.toString(relogio.get(Calendar.YEAR)));
		lblAnoAtual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnoAtual.setForeground(new Color(0, 128, 0));
		lblAnoAtual.setBounds(80, 17, 46, 14);
		contentPane.add(lblAnoAtual);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ano = Integer.parseInt(spinner.getValue().toString());
				lblIdade.setText(Integer.toString(relogio.get(Calendar.YEAR)-ano));
			}
		});
		btnNewButton.setBounds(47, 73, 116, 34);
		contentPane.add(btnNewButton);
	}
}
