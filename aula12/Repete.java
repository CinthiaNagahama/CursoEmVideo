package aula12;

import javax.swing.JOptionPane;

public class Repete {
	public static void main(String[] args) {
		int n, soma = 0, count = 0, pares = 0, impares = 0, maiorCem = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número.<br><em<[Para parar digite zero]</em></html>", "Entrada de Dados", JOptionPane.WARNING_MESSAGE));
			soma += n;
			count++;
			if(n > 100) {
				maiorCem++;
			}
			if(n % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		} while(n != 0);
		
		JOptionPane.showMessageDialog(null, "<html> Resultado:<br><hr>" 
				+ "<br>Total de Valores:  " + (count - 1) 
				+ "<br>Total de Pares:  " + (pares - 1)
				+ "<br>Total de Ímpares:  " + impares
				+ "<br>Acima de Cem:  " + maiorCem
				+ "<br>Média dos Valores:  " + (((float)soma) / (count - 1))
				+ "</html>", "Resultado Final", JOptionPane.WARNING_MESSAGE);
	}
}