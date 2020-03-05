package medianotas;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] Nota=new int[6];

		int notas=0;
		int contNotas=0;
		int sumaNotas=0;
		int resNotas=0;
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Introduzca la notas de los 6 alumnos.");
		
		for (int i=0; i<6; i++) {		
		System.out.println("Introduzca una nota:");
		Nota[i]=kb.nextInt();		
		}
		for (int i=0; i<6; i++) {
			contNotas ++;
			sumaNotas=Nota[i]+sumaNotas;
			
		}
		
		resNotas=sumaNotas/contNotas;
		System.out.println("La media de las clases es: "+resNotas);
		
		for (int i=0; i<6; i++) {
			if (Nota[i]>resNotas) {
				System.out.println("Estas son las notas mayores a la media:");
				System.out.println(Nota[i]);
			}
		}
		
		
	kb.close();	
	}

}
