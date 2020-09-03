package aula6;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceSoma extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceSoma frame = new InterfaceSoma();
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
	public InterfaceSoma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setBounds(31, 38, 46, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(113, 38, 46, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBounds(90, 41, 13, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSoma = new JLabel("0");
		lblSoma.setBounds(231, 41, 38, 14);
		contentPane.add(lblSoma);
		
		JButton btnSoma = new JButton("=");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n1 = Integer.parseInt(txtN1.getText()), n2 = Integer.parseInt(txtN2.getText());
				int s = n1 + n2;
				lblSoma.setText(Integer.toString(s));
			}
		});
		btnSoma.setBounds(169, 37, 52, 23);
		contentPane.add(btnSoma);
	}
}
