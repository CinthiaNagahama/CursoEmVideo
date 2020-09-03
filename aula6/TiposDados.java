package aula6;
import java.util.Scanner;

public class TiposDados {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Insira o nome do aluno: ");
		String nome = leitor.nextLine();
		System.out.printf("Insira a nota de %s: ", nome);
		Float nota = Float.parseFloat(leitor.nextLine());

		System.out.printf("Nota de %s: %.2f\n", nome, nota);
		
		leitor.close();
	}
}
