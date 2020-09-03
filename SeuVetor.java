package seuvetor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class SeuVetor extends JFrame {
	
	// Variáveis globais necessárias para funcionamento da tela
	int vetor[] = new int[5];
	DefaultListModel lista = new DefaultListModel();
	int selecionado = 0;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SeuVetor frame = new SeuVetor();
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
	public SeuVetor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 259);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinNumero = new JSpinner();
		spinNumero.setBounds(22, 24, 40, 23);
		spinNumero.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(spinNumero);
		
		JLabel lblNewLabel = new JLabel("vetor");
		lblNewLabel.setBounds(255, 23, 40, 19);
		lblNewLabel.setForeground(Color.DARK_GRAY);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblSelecionado = new JLabel("[0]");
		lblSelecionado.setBounds(305, 23, 22, 19);
		lblSelecionado.setForeground(Color.DARK_GRAY);
		lblSelecionado.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(lblSelecionado);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(220, 56, 120, 155);
		contentPane.add(scrollPane);
		
		JList lstVetor = new JList();
		// Inicia os valores na tale
		for(int c = 0; c < vetor.length; c++) {
			lista.addElement(vetor[c]);
		}
		// Seleciona uma posição do vetor
		lstVetor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selecionado = lstVetor.getSelectedIndex();
				lblSelecionado.setText("[" + selecionado + "]");
			}
		});
		scrollPane.setViewportView(lstVetor);
		lstVetor.setFont(new Font("Arial", Font.PLAIN, 14));
		lstVetor.setModel(lista);
		
		
		JButton btnAdicionar = new JButton("Adicionar");
		// Adiciona um valor ao vetor na posição selecionada
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = Integer.parseInt(spinNumero.getValue().toString());
				lista.removeAllElements();
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnAdicionar.setBounds(72, 23, 112, 25);
		btnAdicionar.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(btnAdicionar);
		
		JButton btnRemover = new JButton("Remover");
		// Remove um valor ao vetor na posição selecionada
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = 0;
				lista.removeAllElements();
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnRemover.setBounds(72, 59, 112, 25);
		btnRemover.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(btnRemover);
		
		JButton btnOrdenar = new JButton("Ordenar");
		// Ordena o vetor
		btnOrdenar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Arrays.sort(vetor);
				lista.removeAllElements();
				for(int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});
		btnOrdenar.setBounds(72, 95, 112, 25);
		btnOrdenar.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(btnOrdenar);
	}
}
