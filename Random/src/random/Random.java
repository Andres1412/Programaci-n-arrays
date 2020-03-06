package random;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] Ale=new double[10];
		
		System.out.println("Generando números aleatorios...");
		
		for(int i=0; i<10; i++) {			
			Ale[i]=Math.random();
			
			System.out.println("El número aleatorio guardado en la posición v["+i+"] = "+Ale[i]);
		}

	}

}
