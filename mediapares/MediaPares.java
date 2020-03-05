/*
 * Andrés Rocher Escriva
 */

package mediapares;

import java.util.Scanner;

public class MediaPares {//definimos clase

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Num=new int[10];//definimos cajones del array
		
		int contPar=0;//variable
		int contImpar=0;//variable
		int sumaPar=0;//variable
		int sumaImpar=0;//variable
		int resPar=0;//variable
		int resImpar=0;//variable
		
		Scanner kb = new Scanner(System.in);//teclado
		
		System.out.println("Introduzca 10 números enteras:");//frase
		for (int i=0; i<10; i++) {//condiciones con contador
			System.out.println("Introduzca un número:");//frase
		Num[i] = kb.nextInt();//guardar datos del teclado
		}
		for (int i=0; i<10; i++) {//contador para que coja los números introducidos
			if(i%2==0) {//separar casillas pares 
				contPar ++;				
				sumaPar=Num[i]+sumaPar;
				resPar=sumaPar/contPar;				
			}else {
				contImpar ++;
				sumaImpar=Num[i]+sumaImpar;
				resImpar=sumaImpar/contImpar;
			}
		}
		System.out.println("EL resultado de la media de las celdas pares es: "+resPar);
		System.out.println("EL resultado de la media de las celdas impares es: "+resImpar);
		
kb.close();
	}
	
}
