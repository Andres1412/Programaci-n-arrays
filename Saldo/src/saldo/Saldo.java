package saldo;

import java.util.Scanner;

public class Saldo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] nombre=new String[10];
		int [] sueldo=new int[10];
		
		int sueldoMax=0;
		int lugar=0;
		
		Scanner kb = new Scanner(System.in);
		
System.out.println("Introduzca los nombres de los 10 trabajadores.");
		
		for (int i=0; i<10; i++) {		
		System.out.println("Introduzca un nombre:");
		nombre[i]=kb.next();
		System.out.println("Introduzca el sueldo:");
		sueldo[i]=kb.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			if(sueldo[i]>sueldoMax) {
				lugar=i;
				sueldo[i]=sueldoMax;
				sueldoMax=sueldo[i];
			}
		}
		System.out.println("El sueldo mas alto es: "+sueldoMax+" y su nombre es: "+nombre[lugar]);
		
kb.close();
	}

}
