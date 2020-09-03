package triangulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Triangulo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Triangulo frame = new Triangulo();
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
	public Triangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("<html>Segmento a</html>");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 22, 82, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>Segmento b</html>");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 58, 82, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>Segmento c</html>");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 91, 82, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblA = new JLabel("0");
		lblA.setForeground(Color.GRAY);
		lblA.setFont(new Font("Arial", Font.PLAIN, 14));
		lblA.setBounds(212, 24, 32, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("0");
		lblB.setForeground(Color.GRAY);
		lblB.setFont(new Font("Arial", Font.PLAIN, 14));
		lblB.setBounds(212, 60, 32, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("0");
		lblC.setForeground(Color.GRAY);
		lblC.setFont(new Font("Arial", Font.PLAIN, 14));
		lblC.setBounds(212, 93, 32, 14);
		contentPane.add(lblC);
		
		JSlider sliderA = new JSlider();
		sliderA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblA.setText(Integer.toString(sliderA.getValue()));
			}
		});
		sliderA.setValue(10);
		sliderA.setMaximum(20);
		sliderA.setFont(new Font("Arial", Font.PLAIN, 14));
		sliderA.setBounds(102, 22, 100, 23);
		contentPane.add(sliderA);
		
		JSlider sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblB.setText(Integer.toString(sliderB.getValue()));
			}
		});
		sliderB.setValue(10);
		sliderB.setMaximum(20);
		sliderB.setFont(new Font("Arial", Font.PLAIN, 14));
		sliderB.setBounds(102, 58, 100, 23);
		contentPane.add(sliderB);
		
		JSlider sliderC = new JSlider();
		sliderC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				lblC.setText(Integer.toString(sliderC.getValue()));
			}
		});
		sliderC.setValue(10);
		sliderC.setMaximum(20);
		sliderC.setFont(new Font("Arial", Font.PLAIN, 14));
		sliderC.setBounds(102, 91, 100, 23);
		contentPane.add(sliderC);
		
		JLabel lblTriangulo = new JLabel("");
		lblTriangulo.setIcon(new ImageIcon(Triangulo.class.getResource("/images/triangulo_equilatero.png")));
		lblTriangulo.setBounds(233, 11, 200, 200);
		contentPane.add(lblTriangulo);
		
		JPanel panResultado = new JPanel();
		panResultado.setVisible(false);
		panResultado.setBounds(10, 173, 213, 79);
		contentPane.add(panResultado);
		panResultado.setLayout(null);
		
		JLabel lblETriangulo = new JLabel("New label");
		lblETriangulo.setForeground(new Color(147, 112, 219));
		lblETriangulo.setFont(new Font("Arial", Font.PLAIN, 18));
		lblETriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblETriangulo.setBounds(0, 0, 213, 36);
		panResultado.add(lblETriangulo);
		
		JLabel lblTipoTriangulo = new JLabel("New label");
		lblTipoTriangulo.setForeground(new Color(255, 99, 71));
		lblTipoTriangulo.setFont(new Font("Arial", Font.PLAIN, 18));
		lblTipoTriangulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTipoTriangulo.setBounds(0, 43, 213, 36);
		panResultado.add(lblTipoTriangulo);
		

		JButton btnVerifica = new JButton("Verificar");
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = sliderA.getValue();
				int b = sliderB.getValue();
				int c = sliderC.getValue();
				
				if((a < b + c) && (b < a + c) && (c < a + b)) { // Os lados do triângulo devem ser menores que a soma dos demais lados
					lblETriangulo.setText("<html>Formam um </html>");
					if(a == b && a == c) {
						lblTipoTriangulo.setText("<html>triângulo equilátero</html>");
						lblTriangulo.setIcon(new ImageIcon(Triangulo.class.getResource("/images/triangulo_equilatero.png")));
					}
					else if(a != b && b != c && a != c) {
						lblTipoTriangulo.setText("<html>triângulo escaleno</html>");
						lblTriangulo.setIcon(new ImageIcon(Triangulo.class.getResource("/images/triangulo_escaleno.png")));
					}
					else {
						lblTipoTriangulo.setText("<html>triângulo isóceles</html>");
						lblTriangulo.setIcon(new ImageIcon(Triangulo.class.getResource("/images/triangulo_isoceles.png")));
					}
				}
				else {
					lblETriangulo.setText("<html>Não formam um triângulo.</html>");
					lblTipoTriangulo.setText("----");
				}
				panResultado.setVisible(true);
			}
		});
		btnVerifica.setBackground(UIManager.getColor("Button.background"));
		btnVerifica.setFont(new Font("Arial", Font.PLAIN, 14));
		btnVerifica.setBounds(53, 127, 100, 32);
		contentPane.add(btnVerifica);
	}
}
