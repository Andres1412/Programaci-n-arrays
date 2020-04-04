package contarPalabras;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in); 
		
		String frase;
		
		System.out.print("Introduce una frase para contar las palabras: ");
		frase = kb.nextLine();
		frase = frase.trim();
		
		String[] palabras = frase.split(" ");
		System.out.print("Hay "+palabras.length+" palabras en esta frase");
		
		kb.close();
	}

}
