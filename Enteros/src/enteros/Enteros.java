package enteros;

import java.util.Scanner;

public class Enteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Entero=new int [10];
		
		int contNeg=0;
		int contPos=0;
		int Cont0=0;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Introduzca 10 n�meros aleatorios.");
		
		for(int i=0; i<10; i++) {
			System.out.println("Introduzca un n�mero:");
			Entero[i]=kb.nextInt();
		}
		for(int i=0; i<10; i++) {
			if(Entero[i]<0) {
				contNeg++;
			}
			if(Entero[i]>0) {
				contPos++;
			}
			if(Entero[i]==0) {
				Cont0 ++;
			}
			
		}
		
		System.out.println("N�mero de negativos: "+contNeg);
		System.out.println("N�mero de positivos: "+contPos);
		System.out.println("N�mero de 0: "+Cont0);
			
		kb.close();
	}

}
