package random;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] Ale=new double[10];
		
		System.out.println("Generando n�meros aleatorios...");
		
		for(int i=0; i<10; i++) {			
			Ale[i]=Math.random();
			
			System.out.println("El n�mero aleatorio guardado en la posici�n v["+i+"] = "+Ale[i]);
		}

	}

}
