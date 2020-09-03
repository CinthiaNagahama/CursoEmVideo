package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
	public static void main(String[] args) {
		Date relogio = new Date();
		System.out.println("A hora do sistema �: " + relogio.toString());
		
		// Desafio idioma do sistema:
		Locale idioma = Locale.getDefault();
		System.out.println("O idioma do sistema �: " + idioma.getDisplayLanguage());
		
		// Desafio resolu��o do sistema:
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolu�ao do sistema �: " + d.width + " X " + d.height);
	}

}
